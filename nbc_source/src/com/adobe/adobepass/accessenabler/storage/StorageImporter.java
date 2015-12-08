// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.storage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Environment;
import android.util.Pair;
import com.adobe.adobepass.accessenabler.models.AuthenticationToken;
import com.adobe.adobepass.accessenabler.models.Requestor;
import com.adobe.adobepass.accessenabler.models.UserMetadata;
import com.adobe.adobepass.accessenabler.utils.Log;
import com.adobe.adobepass.accessenabler.utils.Utils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.adobe.adobepass.accessenabler.storage:
//            StorageManager

public class StorageImporter
{

    private static final String AUTHN_TOKEN_V1_KEY = "authenticationToken";
    private static final String AUTHN_TOKEN_V2_KEY = "authnToken";
    private static final String CAN_AUTHENTICATE_KEY = "canAuthenticate";
    private static final String CURRENT_MVPD_ID_KEY = "currentMvpdId";
    private static final String DATABASE_FILENAME = ".adobepassdb";
    private static final String GENERIC_REQUESTOR = "GenericRequestor";
    static final String LOG_TAG = "StorageImporter";
    private static final String METADATA_TOKEN_KEY = "metadataToken";
    private static final String SQL_STORAGE_ID = "_id";
    private static final String SQL_STORAGE_KEY = "key";
    private static final String SQL_STORAGE_TABLE_NAME = "storage";
    private static final String SQL_STORAGE_VALUE = "value";
    private static final int STORAGE_VERSIONS[] = {
        2, 1
    };
    private Map authnTokensOld;
    private boolean canAuthenticateOld;
    private Requestor currentRequestor;
    private SQLiteDatabase database;
    private String mvpdIdOld;
    private StorageManager storageManager;
    private Map userMetadataOld;

    public StorageImporter(StorageManager storagemanager, Requestor requestor)
    {
        database = null;
        storageManager = storagemanager;
        currentRequestor = requestor;
    }

    private void clearCache()
    {
        canAuthenticateOld = false;
        mvpdIdOld = null;
        authnTokensOld = new HashMap();
        userMetadataOld = new HashMap();
    }

    private void extractAuthenticationToken(String s, Pair pair)
    {
        if (((String)pair.first).equals(s))
        {
            s = "GenericRequestor";
        } else
        {
            s = ((String)pair.first).substring(0, ((String)pair.first).indexOf((new StringBuilder()).append("_").append(s).toString()));
        }
        pair = new AuthenticationToken(new String(Utils.base64Decode((String)pair.second)), false);
        if (pair.isValid())
        {
            authnTokensOld.put(s, pair);
        }
    }

    private void extractMetadata(Pair pair)
    {
        String s;
        if (((String)pair.first).equals("metadataToken"))
        {
            s = "GenericRequestor";
        } else
        {
            s = ((String)pair.first).substring(0, ((String)pair.first).indexOf("_metadataToken"));
        }
        pair = UserMetadata.parseJsonString(new String(Utils.base64Decode((String)pair.second)));
        if (pair != null)
        {
            userMetadataOld.put(s, pair);
        }
    }

    private boolean extractStorageData(int i)
    {
        Object obj;
        Pair pair;
        boolean flag;
        Object obj1;
        try
        {
            obj1 = sqlSelectAll("storage");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.d("StorageImporter", (new StringBuilder()).append("Failed to extract data from storage v").append(i).append(": ").append(((Exception) (obj)).toString()).toString());
            return false;
        }
        if (i == 1)
        {
            obj = "authenticationToken";
        } else
        {
            obj = "authnToken";
        }
        obj1 = ((List) (obj1)).iterator();
_L3:
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_288;
        }
        pair = (Pair)((Iterator) (obj1)).next();
        if (!((String)pair.first).equals("canAuthenticate")) goto _L2; else goto _L1
_L1:
        Exception exception;
        if (pair.second != null && ((String)pair.second).equalsIgnoreCase("true"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        canAuthenticateOld = flag;
          goto _L3
_L2:
label0:
        {
            if (!((String)pair.first).equals("currentMvpdId"))
            {
                break label0;
            }
            mvpdIdOld = (String)pair.second;
        }
          goto _L3
        flag = ((String)pair.first).contains(((CharSequence) (obj)));
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        extractAuthenticationToken(((String) (obj)), pair);
          goto _L3
        exception;
        Log.d("StorageImporter", (new StringBuilder()).append("Failed to import authentication token. ").append(exception.toString()).toString());
        return false;
        flag = ((String)pair.first).contains("metadataToken");
        if (!flag) goto _L3; else goto _L4
_L4:
        extractMetadata(pair);
          goto _L3
        exception;
        Log.d("StorageImporter", (new StringBuilder()).append("Failed to import metadata token. ").append(exception.toString()).toString());
        return false;
        Log.d("StorageImporter", (new StringBuilder()).append("Extracted data from storage v").append(i).toString());
        return true;
    }

    private boolean isAuthnTokenValid(AuthenticationToken authenticationtoken, String s)
    {
        return authenticationtoken != null && authenticationtoken.isValid() && authenticationtoken.getMvpdId() != null && authenticationtoken.getMvpdId().equals(s);
    }

    private boolean openDatabase(int i)
    {
        Object obj = Environment.getExternalStorageDirectory();
        Object obj1 = (new StringBuilder()).append(((File) (obj)).getPath()).append(File.separator).append(".adobepassdb");
        String s;
        if (i == 0)
        {
            obj = "";
        } else
        {
            obj = (new StringBuilder()).append("_").append(i).toString();
        }
        s = ((StringBuilder) (obj1)).append(((String) (obj))).toString();
        obj1 = null;
        obj = obj1;
        try
        {
            database = SQLiteDatabase.openDatabase(s, null, 0x10000010);
        }
        catch (Exception exception)
        {
            Log.d("StorageImporter", "Unable to initialize database for token import.");
            if (obj != null)
            {
                ((Cursor) (obj)).close();
            }
            if (database != null)
            {
                database.close();
            }
            return false;
        }
        obj = obj1;
        obj1 = database.query("storage", new String[] {
            "_id", "key", "value"
        }, null, null, null, null, null, null);
        obj = obj1;
        ((Cursor) (obj1)).close();
        return true;
    }

    private boolean performImportHelper(int i)
    {
        if (currentRequestor.isMvpdValid(mvpdIdOld)) goto _L2; else goto _L1
_L1:
        Log.d("StorageImporter", (new StringBuilder()).append("MVPD is not valid in storage v").append(i).toString());
_L4:
        return false;
_L2:
        Object obj;
        UserMetadata usermetadata;
        AuthenticationToken authenticationtoken = (AuthenticationToken)authnTokensOld.get("GenericRequestor");
        usermetadata = (UserMetadata)userMetadataOld.get("GenericRequestor");
        obj = authenticationtoken;
        if (isAuthnTokenValid(authenticationtoken, mvpdIdOld))
        {
            continue; /* Loop/switch isn't completed */
        }
        authenticationtoken = (AuthenticationToken)authnTokensOld.get(currentRequestor.getId());
        UserMetadata usermetadata1 = (UserMetadata)userMetadataOld.get(currentRequestor.getId());
        obj = authenticationtoken;
        usermetadata = usermetadata1;
        if (isAuthnTokenValid(authenticationtoken, mvpdIdOld))
        {
            continue; /* Loop/switch isn't completed */
        }
        Iterator iterator = authnTokensOld.keySet().iterator();
        usermetadata = usermetadata1;
        obj = authenticationtoken;
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = (String)iterator.next();
            authenticationtoken = (AuthenticationToken)authnTokensOld.get(obj);
            usermetadata1 = (UserMetadata)userMetadataOld.get(obj);
            obj = authenticationtoken;
            usermetadata = usermetadata1;
        } while (!isAuthnTokenValid(authenticationtoken, mvpdIdOld));
        usermetadata = usermetadata1;
        obj = authenticationtoken;
        if (!isAuthnTokenValid(((AuthenticationToken) (obj)), mvpdIdOld)) goto _L4; else goto _L3
_L3:
        if (!((AuthenticationToken) (obj)).getRequestorId().equals(currentRequestor.getId()))
        {
            Requestor requestor = new Requestor(null);
            requestor.setId(((AuthenticationToken) (obj)).getRequestorId());
            storageManager.setCurrentRequestor(requestor);
        }
        storageManager.setCurrentMvpdId(mvpdIdOld, false);
        storageManager.setCanAuthenticate(canAuthenticateOld, false);
        storageManager.setAuthenticationToken(((AuthenticationToken) (obj)), false);
        storageManager.updateUserMetadata(usermetadata, false);
        storageManager.writeToStorage();
        if (!((AuthenticationToken) (obj)).getRequestorId().equals(currentRequestor.getId()))
        {
            storageManager.setCurrentRequestor(currentRequestor);
        }
        return true;
    }

    private List sqlSelectAll(String s)
    {
        s = database.query(true, s, new String[] {
            "_id", "key", "value"
        }, null, null, null, null, null, null);
        ArrayList arraylist = new ArrayList();
        if (s != null)
        {
            s.moveToFirst();
            for (; !s.isAfterLast(); s.moveToNext())
            {
                arraylist.add(new Pair(s.getString(1), s.getString(2)));
            }

            s.close();
        }
        return arraylist;
    }

    public void performImport()
    {
        int ai[];
        int i;
        int j;
        ai = STORAGE_VERSIONS;
        j = ai.length;
        i = 0;
_L3:
        int k;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        k = ai[i];
        Log.d("StorageImporter", (new StringBuilder()).append("Trying to import from storage v").append(k).toString());
        clearCache();
          goto _L1
_L5:
        i++;
        if (true) goto _L3; else goto _L2
_L1:
        if (!openDatabase(k) || !extractStorageData(k) || !performImportHelper(k)) goto _L5; else goto _L4
_L4:
        Log.d("StorageImporter", (new StringBuilder()).append("Successfully imported tokens from storage v").append(k).toString());
        return;
_L2:
        Log.d("StorageImporter", "No valid tokens found in previous storage versions.");
        return;
    }

}
