// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.Utility;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            FacebookException, GraphRequest, HttpMethod, GraphResponse, 
//            AccessToken, AccessTokenSource

public class TestUserManager
{
    private static final class Mode extends Enum
    {

        private static final Mode $VALUES[];
        public static final Mode PRIVATE;
        public static final Mode SHARED;

        public static Mode valueOf(String s)
        {
            return (Mode)Enum.valueOf(com/facebook/TestUserManager$Mode, s);
        }

        public static Mode[] values()
        {
            return (Mode[])$VALUES.clone();
        }

        static 
        {
            PRIVATE = new Mode("PRIVATE", 0);
            SHARED = new Mode("SHARED", 1);
            $VALUES = (new Mode[] {
                PRIVATE, SHARED
            });
        }

        private Mode(String s, int i)
        {
            super(s, i);
        }
    }


    static final boolean $assertionsDisabled;
    private static final String LOG_TAG = "TestUserManager";
    private Map appTestAccounts;
    private String testApplicationId;
    private String testApplicationSecret;

    public TestUserManager(String s, String s1)
    {
        if (Utility.isNullOrEmpty(s1) || Utility.isNullOrEmpty(s))
        {
            throw new FacebookException("Must provide app ID and secret");
        } else
        {
            testApplicationSecret = s;
            testApplicationId = s1;
            return;
        }
    }

    private JSONObject createTestAccount(List list, Mode mode, String s)
    {
        Bundle bundle = new Bundle();
        bundle.putString("installed", "true");
        bundle.putString("permissions", getPermissionsString(list));
        bundle.putString("access_token", getAppAccessToken());
        if (mode == Mode.SHARED)
        {
            bundle.putString("name", String.format("Shared %s Testuser", new Object[] {
                getSharedTestAccountIdentifier(list, s)
            }));
        }
        s = (new GraphRequest(null, String.format("%s/accounts/test-users", new Object[] {
            testApplicationId
        }), bundle, HttpMethod.POST)).executeAndWait();
        list = s.getError();
        s = s.getJSONObject();
        if (list != null)
        {
            return null;
        }
        if (!$assertionsDisabled && s == null)
        {
            throw new AssertionError();
        }
        if (mode == Mode.SHARED)
        {
            try
            {
                s.put("name", bundle.getString("name"));
            }
            // Misplaced declaration of an exception variable
            catch (List list)
            {
                Log.e("TestUserManager", "Could not set name", list);
            }
            storeTestAccount(s);
        }
        return s;
    }

    private JSONObject findOrCreateSharedTestAccount(List list, Mode mode, String s)
    {
        JSONObject jsonobject = findTestAccountMatchingIdentifier(getSharedTestAccountIdentifier(list, s));
        if (jsonobject != null)
        {
            return jsonobject;
        } else
        {
            return createTestAccount(list, mode, s);
        }
    }

    private JSONObject findTestAccountMatchingIdentifier(String s)
    {
        this;
        JVM INSTR monitorenter ;
        Iterator iterator = appTestAccounts.values().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        JSONObject jsonobject;
        boolean flag;
        jsonobject = (JSONObject)iterator.next();
        flag = jsonobject.optString("name").contains(s);
        if (!flag) goto _L4; else goto _L3
_L3:
        s = jsonobject;
_L6:
        this;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = null;
        if (true) goto _L6; else goto _L5
_L5:
        s;
        throw s;
    }

    private AccessToken getAccessTokenForUser(List list, Mode mode, String s)
    {
        retrieveTestAccountsForAppIfNeeded();
        if (Utility.isNullOrEmpty(list))
        {
            list = Arrays.asList(new String[] {
                "email", "publish_actions"
            });
        }
        if (mode == Mode.PRIVATE)
        {
            mode = createTestAccount(list, mode, s);
        } else
        {
            mode = findOrCreateSharedTestAccount(list, mode, s);
        }
        return new AccessToken(mode.optString("access_token"), testApplicationId, mode.optString("id"), list, null, AccessTokenSource.TEST_USER, null, null);
    }

    private String getPermissionsString(List list)
    {
        return TextUtils.join(",", list);
    }

    private String getSharedTestAccountIdentifier(List list, String s)
    {
        long l1 = getPermissionsString(list).hashCode();
        long l;
        if (s != null)
        {
            l = (long)s.hashCode() & 0xffffffffL;
        } else
        {
            l = 0L;
        }
        return validNameStringFromInteger(l ^ l1 & 0xffffffffL);
    }

    private void populateTestAccounts(JSONArray jsonarray, JSONObject jsonobject)
    {
        this;
        JVM INSTR monitorenter ;
        int i = 0;
_L3:
        JSONObject jsonobject1;
        JSONObject jsonobject2;
        if (i >= jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_81;
        }
        jsonobject1 = jsonarray.optJSONObject(i);
        jsonobject2 = jsonobject.optJSONObject(jsonobject1.optString("id"));
        jsonobject1.put("name", jsonobject2.optString("name"));
_L1:
        storeTestAccount(jsonobject1);
        i++;
        continue; /* Loop/switch isn't completed */
        JSONException jsonexception;
        jsonexception;
        Log.e("TestUserManager", "Could not set name", jsonexception);
          goto _L1
        jsonarray;
        throw jsonarray;
        this;
        JVM INSTR monitorexit ;
        return;
        if (true) goto _L3; else goto _L2
_L2:
    }

    private void retrieveTestAccountsForAppIfNeeded()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = appTestAccounts;
        if (obj == null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        appTestAccounts = new HashMap();
        GraphRequest.setDefaultBatchApplicationId(testApplicationId);
        obj = new Bundle();
        ((Bundle) (obj)).putString("access_token", getAppAccessToken());
        obj = new GraphRequest(null, "app/accounts/test-users", ((Bundle) (obj)), null);
        ((GraphRequest) (obj)).setBatchEntryName("testUsers");
        ((GraphRequest) (obj)).setBatchEntryOmitResultOnSuccess(false);
        Object obj1 = new Bundle();
        ((Bundle) (obj1)).putString("access_token", getAppAccessToken());
        ((Bundle) (obj1)).putString("ids", "{result=testUsers:$.data.*.id}");
        ((Bundle) (obj1)).putString("fields", "name");
        obj1 = new GraphRequest(null, "", ((Bundle) (obj1)), null);
        ((GraphRequest) (obj1)).setBatchEntryDependsOn("testUsers");
        obj = GraphRequest.executeBatchAndWait(new GraphRequest[] {
            obj, obj1
        });
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        if (((List) (obj)).size() == 2)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        throw new FacebookException("Unexpected number of results from TestUsers batch query");
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        populateTestAccounts(((GraphResponse)((List) (obj)).get(0)).getJSONObject().optJSONArray("data"), ((GraphResponse)((List) (obj)).get(1)).getJSONObject());
          goto _L1
    }

    private void storeTestAccount(JSONObject jsonobject)
    {
        this;
        JVM INSTR monitorenter ;
        appTestAccounts.put(jsonobject.optString("id"), jsonobject);
        this;
        JVM INSTR monitorexit ;
        return;
        jsonobject;
        throw jsonobject;
    }

    private String validNameStringFromInteger(long l)
    {
        String s = Long.toString(l);
        StringBuilder stringbuilder = new StringBuilder("Perm");
        char ac[] = s.toCharArray();
        int k = ac.length;
        int i = 0;
        char c;
        for (int j = 0; i < k; j = c)
        {
            char c1 = ac[i];
            c = c1;
            if (c1 == j)
            {
                c = (char)(c1 + 10);
            }
            stringbuilder.append((char)((c + 97) - 48));
            i++;
        }

        return stringbuilder.toString();
    }

    public AccessToken getAccessTokenForPrivateUser(List list)
    {
        return getAccessTokenForUser(list, Mode.PRIVATE, null);
    }

    public AccessToken getAccessTokenForSharedUser(List list)
    {
        return getAccessTokenForSharedUser(list, null);
    }

    public AccessToken getAccessTokenForSharedUser(List list, String s)
    {
        return getAccessTokenForUser(list, Mode.SHARED, s);
    }

    final String getAppAccessToken()
    {
        return (new StringBuilder()).append(testApplicationId).append("|").append(testApplicationSecret).toString();
    }

    public String getTestApplicationId()
    {
        this;
        JVM INSTR monitorenter ;
        String s = testApplicationId;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public String getTestApplicationSecret()
    {
        this;
        JVM INSTR monitorenter ;
        String s = testApplicationSecret;
        this;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        boolean flag;
        if (!com/facebook/TestUserManager.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
