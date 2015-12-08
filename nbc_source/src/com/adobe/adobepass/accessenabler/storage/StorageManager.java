// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import com.adobe.adobepass.accessenabler.models.AuthenticationToken;
import com.adobe.adobepass.accessenabler.models.AuthorizationToken;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import com.adobe.adobepass.accessenabler.models.PreauthorizationCache;
import com.adobe.adobepass.accessenabler.models.Requestor;
import com.adobe.adobepass.accessenabler.models.UserMetadata;
import com.adobe.adobepass.accessenabler.utils.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.adobe.adobepass.accessenabler.storage:
//            StorageImporter

public class StorageManager
{

    private static final String AUTHN_TOKEN_KEY = "authnToken";
    private static final String AUTHZ_TOKENS_KEY = "authzTokens";
    private static final String CAN_AUTHENTICATE_KEY = "canAuthenticate";
    private static final String CURRENT_MVPD_ID_KEY = "currentMvpdId";
    private static final String DATABASE_FILENAME = ".adobepassdb";
    private static final int DATABASE_VERSION = 3;
    static final String LOG_TAG = "StorageManager";
    private static final String PASSIVE_AUTHN_COOKIES_KEY = "passiveAuthnCookies";
    private static final String PREVIOUSLY_IMPORTED = "previouslyImported";
    private static final String PRE_AUTHORIZED_RESOURCES_KEY = "preAuthorizedResources";
    private static final String REQUESTOR_BUCKET_KEY = "requestorBucket";
    private static final String STORAGE_PREFERENCES = "adobePassStorageKey";
    private static final String USER_METADATA_KEY = "userMeta";
    private Context appContext;
    private Requestor currentRequestor;
    private Map storageCache;
    private String storageFilePath;

    public StorageManager(Context context)
    {
        appContext = context;
        context = Environment.getExternalStorageDirectory();
        storageFilePath = (new StringBuilder()).append(context.getPath()).append(File.separator).append(".adobepassdb").append("_").append(3).toString();
        if (!(new File(storageFilePath)).exists())
        {
            storageCache = new HashMap();
            writeToStorage();
            return;
        }
        try
        {
            readFromStorage();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            storageFilePath = null;
        }
        Log.e("StorageManager", (new StringBuilder()).append("Cannot access external storage: ").append(context.toString()).toString());
        return;
    }

    private Map getCurrentMvpdData(String s)
    {
        s = getRequestorData(s);
        Object obj = (String)s.get("currentMvpdId");
        if (obj == null)
        {
            s = null;
        } else
        {
            obj = getGenericBucket(s, ((String) (obj)));
            if (!((Map) (obj)).containsKey("canAuthenticate"))
            {
                ((Map) (obj)).put("canAuthenticate", Boolean.FALSE);
            }
            s = ((String) (obj));
            if (!((Map) (obj)).containsKey("authzTokens"))
            {
                ((Map) (obj)).put("authzTokens", new HashMap());
                return ((Map) (obj));
            }
        }
        return s;
    }

    private Map getGenericBucket(Map map, String s)
    {
        Object obj;
label0:
        {
            if (map == null || s == null)
            {
                return null;
            }
            Object obj1 = map.get(s);
            if (obj1 != null)
            {
                obj = obj1;
                if (obj1 instanceof Map)
                {
                    break label0;
                }
            }
            obj = new HashMap();
            map.put(s, obj);
        }
        return (Map)obj;
    }

    private Map getPassiveAuthnCookiesBucket()
    {
        return getGenericBucket(storageCache, "passiveAuthnCookies");
    }

    private Map getRequestorBucket()
    {
        return getGenericBucket(storageCache, "requestorBucket");
    }

    private Map getRequestorData(String s)
    {
        return getGenericBucket(getRequestorBucket(), s);
    }

    public void addAuthorizationToken(String s, AuthorizationToken authorizationtoken)
    {
        addAuthorizationToken(s, authorizationtoken, true);
    }

    protected void addAuthorizationToken(String s, AuthorizationToken authorizationtoken, boolean flag)
    {
        Map map;
        if (s != null)
        {
            if ((map = getCurrentMvpdData(currentRequestor.getId())) != null)
            {
                ((Map)map.get("authzTokens")).put(s, authorizationtoken.toXml());
                if (flag)
                {
                    writeToStorage();
                    return;
                }
            }
        }
    }

    public void clearAll()
    {
        storageCache = new HashMap();
        writeToStorage();
    }

    public void clearAllTokens()
    {
        Map map = getCurrentMvpdData(currentRequestor.getId());
        if (map != null)
        {
            map.remove("authnToken");
            map.remove("userMeta");
            map.remove("preAuthorizedResources");
            map.put(new HashMap(), "authzTokens");
            writeToStorage();
        }
    }

    public void clearInvalidEntitlementDataAfterEnablingAuthnPerRequestor()
    {
        Object obj;
        boolean flag1;
        flag1 = false;
        obj = getCurrentMvpdData(currentRequestor.getId());
        if (obj != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((obj = (String)((Map) (obj)).get("authnToken")) == null) goto _L1; else goto _L3
_L3:
        boolean flag2;
        obj = new AuthenticationToken(((String) (obj)), false);
        flag2 = currentRequestor.getMvpd(((AuthenticationToken) (obj)).getMvpdId()).hasAuthPerAggregator();
        boolean flag = flag1;
        if (((AuthenticationToken) (obj)).getRequestorId() == null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        flag = flag1;
        if (((AuthenticationToken) (obj)).getRequestorId().equals(currentRequestor.getId()))
        {
            flag = true;
        }
        if (!flag && flag2)
        {
            try
            {
                getRequestorBucket().put(currentRequestor.getId(), new HashMap());
            }
            catch (Exception exception)
            {
                Log.d("StorageManager", exception.toString());
                getRequestorBucket().put(currentRequestor.getId(), new HashMap());
            }
        }
        writeToStorage();
        return;
    }

    public AuthenticationToken findValidAuthnToken(Requestor requestor, String s, com.adobe.adobepass.accessenabler.models.AuthenticationToken.TokenType tokentype, boolean flag)
    {
        if (requestor != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L10:
        return ((AuthenticationToken) (obj));
_L2:
        Map map;
        Iterator iterator;
        map = getRequestorBucket();
        iterator = map.keySet().iterator();
_L4:
        String s1;
        do
        {
            do
            {
                if (!iterator.hasNext())
                {
                    break MISSING_BLOCK_LABEL_285;
                }
                obj = iterator.next();
            } while (!(obj instanceof String));
            s1 = (String)obj;
        } while (obj.equals(requestor.getId()) && !flag);
        Object obj1;
        obj1 = (Map)map.get(s1);
        obj = (String)((Map) (obj1)).get("currentMvpdId");
        if (obj == null) goto _L4; else goto _L3
_L3:
        if (s == null) goto _L6; else goto _L5
_L5:
        if (!((String) (obj)).equals(s)) goto _L4; else goto _L6
_L6:
        Mvpd mvpd;
        obj1 = new AuthenticationToken((String)((Map)((Map) (obj1)).get(obj)).get("authnToken"), false);
        mvpd = requestor.getMvpd(((String) (obj)));
        if (!requestor.isMvpdValid(((String) (obj))) || obj1 == null) goto _L4; else goto _L7
_L7:
        if (!((AuthenticationToken) (obj1)).isValid() || mvpd == null) goto _L4; else goto _L8
_L8:
        obj = obj1;
        if (tokentype == com.adobe.adobepass.accessenabler.models.AuthenticationToken.TokenType.ANY) goto _L10; else goto _L9
_L9:
        boolean flag2;
        flag2 = mvpd.hasAuthPerAggregator();
        obj = com.adobe.adobepass.accessenabler.models.AuthenticationToken.TokenType.AUTHN_PER_REQUESTOR;
        boolean flag1;
        if (tokentype == obj)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag2 == flag1)
        {
            return ((AuthenticationToken) (obj1));
        }
          goto _L4
        Exception exception;
        exception;
        Log.e("StorageManager", (new StringBuilder()).append("No valid authn token found for requestor ").append(s1).append(": ").append(exception.toString()).toString());
          goto _L4
        return null;
    }

    public AuthenticationToken getAuthenticationToken(boolean flag)
    {
        Object obj1;
label0:
        {
            Map map = getRequestorData(currentRequestor.getId());
            Object obj2 = getCurrentMvpdData(currentRequestor.getId());
            obj1 = null;
            Object obj = obj1;
            if (obj2 != null)
            {
                obj2 = (String)((Map) (obj2)).get("authnToken");
                obj = obj1;
                if (obj2 != null)
                {
                    obj = new AuthenticationToken(((String) (obj2)), false);
                }
            }
            if (!flag)
            {
                return ((AuthenticationToken) (obj));
            }
            if (obj != null)
            {
                obj1 = obj;
                if (((AuthenticationToken) (obj)).isValid())
                {
                    break label0;
                }
            }
            obj = getCurrentMvpdId();
            obj = findValidAuthnToken(currentRequestor, ((String) (obj)), com.adobe.adobepass.accessenabler.models.AuthenticationToken.TokenType.NON_AUTHN_PER_REQUESTOR, false);
            obj1 = obj;
            if (obj != null)
            {
                map.put("currentMvpdId", ((AuthenticationToken) (obj)).getMvpdId());
                obj1 = getCurrentMvpdData(currentRequestor.getId());
                ((Map) (obj1)).put("canAuthenticate", Boolean.TRUE);
                ((Map) (obj1)).put("authnToken", ((AuthenticationToken) (obj)).toXml());
                map = getCurrentMvpdData(((AuthenticationToken) (obj)).getRequestorId());
                ((Map) (obj1)).put("userMeta", (String)map.get("userMeta"));
                ((Map) (obj1)).put("preAuthorizedResources", (String)map.get("preAuthorizedResources"));
                writeToStorage();
                obj1 = obj;
            }
        }
        return ((AuthenticationToken) (obj1));
    }

    public AuthorizationToken getAuthorizationToken(String s)
    {
        Map map;
        if (s != null)
        {
            if ((map = getCurrentMvpdData(currentRequestor.getId())) != null && (s = (String)((Map)map.get("authzTokens")).get(s)) != null)
            {
                return new AuthorizationToken(s, false);
            }
        }
        return null;
    }

    public boolean getCanAuthenticate()
    {
        Object obj = getCurrentMvpdData(currentRequestor.getId());
        if (obj != null)
        {
            if (((Boolean) (obj = (Boolean)((Map) (obj)).get("canAuthenticate"))).booleanValue() && ((Boolean) (obj)).equals(Boolean.TRUE))
            {
                return true;
            }
        }
        return false;
    }

    public String getCurrentMvpdId()
    {
        return (String)getRequestorData(currentRequestor.getId()).get("currentMvpdId");
    }

    public Map getPassiveAuthnCookies()
    {
        Object obj = getPassiveAuthnCookiesBucket();
        Object obj1 = getCurrentMvpdId();
        if (obj1 == null)
        {
            obj = new HashMap();
        } else
        {
            obj1 = (Map)((Map) (obj)).get(obj1);
            obj = obj1;
            if (obj1 == null)
            {
                return new HashMap();
            }
        }
        return ((Map) (obj));
    }

    public PreauthorizationCache getPreauthorizationCache()
    {
        Object obj = getCurrentMvpdData(currentRequestor.getId());
        if (obj != null)
        {
            if ((obj = (String)((Map) (obj)).get("preAuthorizedResources")) != null)
            {
                return new PreauthorizationCache(((String) (obj)));
            }
        }
        return null;
    }

    public UserMetadata getUserMetadata()
    {
        Map map = getCurrentMvpdData(currentRequestor.getId());
        if (map == null)
        {
            return null;
        } else
        {
            return UserMetadata.parseJsonString((String)map.get("userMeta"));
        }
    }

    public void importStorage()
    {
        Object obj;
        int i;
        obj = appContext.getSharedPreferences("adobePassStorageKey", 0);
        i = ((SharedPreferences) (obj)).getInt("previouslyImported", 0);
        if (i >= 3)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        obj = ((SharedPreferences) (obj)).edit();
        ((android.content.SharedPreferences.Editor) (obj)).putInt("previouslyImported", 3);
        ((android.content.SharedPreferences.Editor) (obj)).commit();
        if (findValidAuthnToken(currentRequestor, null, com.adobe.adobepass.accessenabler.models.AuthenticationToken.TokenType.ANY, true) == null)
        {
            Log.d("StorageManager", "Starting import.");
            (new StorageImporter(this, currentRequestor)).performImport();
            return;
        }
        try
        {
            Log.d("StorageManager", "No need to perform import, a valid token for the current requestor already exists.");
            return;
        }
        catch (Exception exception)
        {
            Log.e("StorageManager", (new StringBuilder()).append("Token import operation failed with exception: ").append(exception.toString()).toString());
        }
        return;
        Log.d("StorageManager", (new StringBuilder()).append("Previous import was performed by v").append(i).toString());
        return;
    }

    public void readFromStorage()
    {
        if (storageCache == null)
        {
            storageCache = new HashMap();
        }
        if (storageFilePath == null)
        {
            Log.e("StorageManager", "External storage unavailable for read operation.");
            return;
        }
        FileInputStream fileinputstream;
        ObjectInputStream objectinputstream;
        Map map;
        try
        {
            fileinputstream = new FileInputStream(storageFilePath);
            objectinputstream = new ObjectInputStream(fileinputstream);
            map = (Map)objectinputstream.readObject();
        }
        catch (Exception exception)
        {
            Log.e("StorageManager", (new StringBuilder()).append("Error while reading from storage: ").append(exception.toString()).toString());
            return;
        }
        if (map == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        storageCache = map;
        objectinputstream.close();
        fileinputstream.close();
        return;
    }

    public void setAuthenticationToken(AuthenticationToken authenticationtoken)
    {
        setAuthenticationToken(authenticationtoken, true);
    }

    protected void setAuthenticationToken(AuthenticationToken authenticationtoken, boolean flag)
    {
        Map map = getCurrentMvpdData(currentRequestor.getId());
        if (map != null)
        {
            map.put("authnToken", authenticationtoken.toXml());
            if (flag)
            {
                writeToStorage();
                return;
            }
        }
    }

    public void setCanAuthenticate(boolean flag)
    {
        setCanAuthenticate(flag, true);
    }

    public void setCanAuthenticate(boolean flag, boolean flag1)
    {
        Map map = getCurrentMvpdData(currentRequestor.getId());
        if (map != null)
        {
            map.put("canAuthenticate", Boolean.valueOf(flag));
            if (flag1)
            {
                writeToStorage();
                return;
            }
        }
    }

    public void setCurrentMvpdId(String s)
    {
        setCurrentMvpdId(s, false);
    }

    protected void setCurrentMvpdId(String s, boolean flag)
    {
        Map map = getRequestorData(currentRequestor.getId());
        if (s == null) goto _L2; else goto _L1
_L1:
        map.put("currentMvpdId", s);
_L4:
        if (flag)
        {
            writeToStorage();
        }
        return;
_L2:
        s = (String)map.get("currentMvpdId");
        if (s != null)
        {
            map.remove("currentMvpdId");
            map.remove(s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void setCurrentRequestor(Requestor requestor)
    {
        currentRequestor = requestor;
    }

    public void setPassiveAuthnCookies(Map map)
    {
        String s = getCurrentMvpdId();
        if (s == null)
        {
            return;
        } else
        {
            getPassiveAuthnCookiesBucket().put(s, map);
            writeToStorage();
            return;
        }
    }

    public void setPreauthorizationCache(PreauthorizationCache preauthorizationcache)
    {
        setPreauthorizationCache(preauthorizationcache, true);
    }

    protected void setPreauthorizationCache(PreauthorizationCache preauthorizationcache, boolean flag)
    {
        Map map = getCurrentMvpdData(currentRequestor.getId());
        if (map != null)
        {
            if (preauthorizationcache == null)
            {
                preauthorizationcache = null;
            } else
            {
                preauthorizationcache = preauthorizationcache.getXML();
            }
            map.put("preAuthorizedResources", preauthorizationcache);
            if (flag)
            {
                writeToStorage();
                return;
            }
        }
    }

    public void updateUserMetadata(UserMetadata usermetadata)
    {
        updateUserMetadata(usermetadata, true);
    }

    protected void updateUserMetadata(UserMetadata usermetadata, boolean flag)
    {
        UserMetadata usermetadata1 = getUserMetadata();
        if (usermetadata1 != null)
        {
            usermetadata1.merge(usermetadata);
            usermetadata = usermetadata1;
        }
        if (usermetadata != null)
        {
            usermetadata = usermetadata.toJsonString();
            if (usermetadata != null)
            {
                getCurrentMvpdData(currentRequestor.getId()).put("userMeta", usermetadata);
            }
        }
        if (flag)
        {
            writeToStorage();
        }
    }

    protected void writeToStorage()
    {
        if (storageFilePath == null)
        {
            Log.d("StorageManager", "External storage unavailable for write operation.");
            return;
        }
        try
        {
            FileOutputStream fileoutputstream = new FileOutputStream(storageFilePath);
            ObjectOutputStream objectoutputstream = new ObjectOutputStream(fileoutputstream);
            objectoutputstream.writeObject(storageCache);
            objectoutputstream.close();
            fileoutputstream.close();
            return;
        }
        catch (Exception exception)
        {
            Log.e("StorageManager", (new StringBuilder()).append("Error while writing to storage: ").append(exception.toString()).toString());
        }
    }
}
