// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            Session, Request, HttpMethod, Response, 
//            FacebookRequestError, FacebookException, AccessTokenSource, AccessToken, 
//            SessionState, TokenCachingStrategy

public class TestSession extends Session
{
    private static interface FqlResponse
        extends GraphObject
    {

        public abstract GraphObjectList getData();
    }

    private static interface FqlResult
        extends GraphObject
    {

        public abstract GraphObjectList getFqlResultSet();
    }

    private static final class Mode extends Enum
    {

        private static final Mode $VALUES[];
        public static final Mode PRIVATE;
        public static final Mode SHARED;

        public static Mode valueOf(String s)
        {
            return (Mode)Enum.valueOf(com/facebook/TestSession$Mode, s);
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

    private static interface TestAccount
        extends GraphObject
    {

        public abstract String getAccessToken();

        public abstract String getId();

        public abstract String getName();

        public abstract void setName(String s);
    }

    private static final class TestTokenCachingStrategy extends TokenCachingStrategy
    {

        private Bundle bundle;

        public void clear()
        {
            bundle = null;
        }

        public Bundle load()
        {
            return bundle;
        }

        public void save(Bundle bundle1)
        {
            bundle = bundle1;
        }

        private TestTokenCachingStrategy()
        {
        }

    }

    private static interface UserAccount
        extends GraphObject
    {

        public abstract String getName();

        public abstract String getUid();

        public abstract void setName(String s);
    }


    static final boolean $assertionsDisabled;
    private static final String LOG_TAG = "FacebookSDK.TestSession";
    private static Map appTestAccounts;
    private static final long serialVersionUID = 1L;
    private static String testApplicationId;
    private static String testApplicationSecret;
    private final Mode mode;
    private final List requestedPermissions;
    private final String sessionUniqueUserTag;
    private String testAccountId;
    private boolean wasAskedToExtendAccessToken;

    TestSession(Activity activity, List list, TokenCachingStrategy tokencachingstrategy, String s, Mode mode1)
    {
        super(activity, testApplicationId, tokencachingstrategy);
        Validate.notNull(list, "permissions");
        Validate.notNullOrEmpty(testApplicationId, "testApplicationId");
        Validate.notNullOrEmpty(testApplicationSecret, "testApplicationSecret");
        sessionUniqueUserTag = s;
        mode = mode1;
        requestedPermissions = list;
    }

    public static TestSession createSessionWithPrivateUser(Activity activity, List list)
    {
        return createTestSession(activity, list, Mode.PRIVATE, null);
    }

    public static TestSession createSessionWithSharedUser(Activity activity, List list)
    {
        return createSessionWithSharedUser(activity, list, null);
    }

    public static TestSession createSessionWithSharedUser(Activity activity, List list, String s)
    {
        return createTestSession(activity, list, Mode.SHARED, s);
    }

    private TestAccount createTestAccountAndFinishAuth()
    {
        Bundle bundle = new Bundle();
        bundle.putString("installed", "true");
        bundle.putString("permissions", getPermissionsString());
        bundle.putString("access_token", getAppAccessToken());
        if (mode == Mode.SHARED)
        {
            bundle.putString("name", String.format("Shared %s Testuser", new Object[] {
                getSharedTestAccountIdentifier()
            }));
        }
        Object obj = (new Request(null, String.format("%s/accounts/test-users", new Object[] {
            testApplicationId
        }), bundle, HttpMethod.POST)).executeAndWait();
        FacebookRequestError facebookrequesterror = ((Response) (obj)).getError();
        obj = (TestAccount)((Response) (obj)).getGraphObjectAs(com/facebook/TestSession$TestAccount);
        if (facebookrequesterror != null)
        {
            finishAuthOrReauth(null, facebookrequesterror.getException());
            return null;
        }
        if (!$assertionsDisabled && obj == null)
        {
            throw new AssertionError();
        }
        if (mode == Mode.SHARED)
        {
            ((TestAccount) (obj)).setName(bundle.getString("name"));
            storeTestAccount(((TestAccount) (obj)));
        }
        finishAuthWithTestAccount(((TestAccount) (obj)));
        return ((TestAccount) (obj));
    }

    private static TestSession createTestSession(Activity activity, List list, Mode mode1, String s)
    {
        com/facebook/TestSession;
        JVM INSTR monitorenter ;
        if (Utility.isNullOrEmpty(testApplicationId) || Utility.isNullOrEmpty(testApplicationSecret))
        {
            throw new FacebookException("Must provide app ID and secret");
        }
        break MISSING_BLOCK_LABEL_37;
        activity;
        com/facebook/TestSession;
        JVM INSTR monitorexit ;
        throw activity;
        List list1 = list;
        if (Utility.isNullOrEmpty(list))
        {
            list1 = Arrays.asList(new String[] {
                "email", "publish_actions"
            });
        }
        activity = new TestSession(activity, list1, new TestTokenCachingStrategy(), s, mode1);
        com/facebook/TestSession;
        JVM INSTR monitorexit ;
        return activity;
    }

    private void deleteTestAccount(String s, String s1)
    {
        Object obj = new Bundle();
        ((Bundle) (obj)).putString("access_token", s1);
        obj = (new Request(null, s, ((Bundle) (obj)), HttpMethod.DELETE)).executeAndWait();
        s1 = ((Response) (obj)).getError();
        obj = ((Response) (obj)).getGraphObject();
        if (s1 != null)
        {
            Log.w("FacebookSDK.TestSession", String.format("Could not delete test account %s: %s", new Object[] {
                s, s1.getException().toString()
            }));
        } else
        if (((GraphObject) (obj)).getProperty("FACEBOOK_NON_JSON_RESULT") == Boolean.valueOf(false))
        {
            Log.w("FacebookSDK.TestSession", String.format("Could not delete test account %s: unknown reason", new Object[] {
                s
            }));
            return;
        }
    }

    private void findOrCreateSharedTestAccount()
    {
        TestAccount testaccount = findTestAccountMatchingIdentifier(getSharedTestAccountIdentifier());
        if (testaccount != null)
        {
            finishAuthWithTestAccount(testaccount);
            return;
        } else
        {
            createTestAccountAndFinishAuth();
            return;
        }
    }

    private static TestAccount findTestAccountMatchingIdentifier(String s)
    {
        com/facebook/TestSession;
        JVM INSTR monitorenter ;
        Iterator iterator;
        retrieveTestAccountsForAppIfNeeded();
        iterator = appTestAccounts.values().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        TestAccount testaccount;
        boolean flag;
        testaccount = (TestAccount)iterator.next();
        flag = testaccount.getName().contains(s);
        if (!flag) goto _L4; else goto _L3
_L3:
        s = testaccount;
_L6:
        com/facebook/TestSession;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = null;
        if (true) goto _L6; else goto _L5
_L5:
        s;
        throw s;
    }

    private void finishAuthWithTestAccount(TestAccount testaccount)
    {
        testAccountId = testaccount.getId();
        finishAuthOrReauth(AccessToken.createFromString(testaccount.getAccessToken(), requestedPermissions, AccessTokenSource.TEST_USER), null);
    }

    static final String getAppAccessToken()
    {
        return (new StringBuilder()).append(testApplicationId).append("|").append(testApplicationSecret).toString();
    }

    private String getPermissionsString()
    {
        return TextUtils.join(",", requestedPermissions);
    }

    private String getSharedTestAccountIdentifier()
    {
        long l1 = getPermissionsString().hashCode();
        long l;
        if (sessionUniqueUserTag != null)
        {
            l = (long)sessionUniqueUserTag.hashCode() & 0xffffffffL;
        } else
        {
            l = 0L;
        }
        return validNameStringFromInteger(l1 & 0xffffffffL ^ l);
    }

    public static String getTestApplicationId()
    {
        com/facebook/TestSession;
        JVM INSTR monitorenter ;
        String s = testApplicationId;
        com/facebook/TestSession;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    public static String getTestApplicationSecret()
    {
        com/facebook/TestSession;
        JVM INSTR monitorenter ;
        String s = testApplicationSecret;
        com/facebook/TestSession;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        throw exception;
    }

    private static void populateTestAccounts(Collection collection, Collection collection1)
    {
        com/facebook/TestSession;
        JVM INSTR monitorenter ;
        for (collection = collection.iterator(); collection.hasNext(); storeTestAccount((TestAccount)collection.next())) { }
        break MISSING_BLOCK_LABEL_40;
        collection;
        throw collection;
        collection = collection1.iterator();
_L2:
        TestAccount testaccount;
        do
        {
            if (!collection.hasNext())
            {
                break MISSING_BLOCK_LABEL_103;
            }
            collection1 = (UserAccount)collection.next();
            testaccount = (TestAccount)appTestAccounts.get(collection1.getUid());
        } while (testaccount == null);
        testaccount.setName(collection1.getName());
        if (true) goto _L2; else goto _L1
_L1:
        com/facebook/TestSession;
        JVM INSTR monitorexit ;
    }

    private static void retrieveTestAccountsForAppIfNeeded()
    {
        com/facebook/TestSession;
        JVM INSTR monitorenter ;
        Object obj = appTestAccounts;
        if (obj == null) goto _L2; else goto _L1
_L1:
        com/facebook/TestSession;
        JVM INSTR monitorexit ;
        return;
_L2:
        Bundle bundle;
        appTestAccounts = new HashMap();
        obj = String.format("SELECT id,access_token FROM test_account WHERE app_id = %s", new Object[] {
            testApplicationId
        });
        bundle = new Bundle();
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        jsonobject.put("test_accounts", obj);
        jsonobject.put("users", "SELECT uid,name FROM user WHERE uid IN (SELECT id FROM #test_accounts)");
        bundle.putString("q", jsonobject.toString());
        bundle.putString("access_token", getAppAccessToken());
        obj = (new Request(null, "fql", bundle, null)).executeAndWait();
        if (((Response) (obj)).getError() != null)
        {
            throw ((Response) (obj)).getError().getException();
        }
        break MISSING_BLOCK_LABEL_146;
        obj;
        com/facebook/TestSession;
        JVM INSTR monitorexit ;
        throw obj;
        obj;
        throw new FacebookException(((Throwable) (obj)));
        obj = ((FqlResponse)((Response) (obj)).getGraphObjectAs(com/facebook/TestSession$FqlResponse)).getData();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        if (((GraphObjectList) (obj)).size() == 2)
        {
            break MISSING_BLOCK_LABEL_186;
        }
        throw new FacebookException("Unexpected number of results from FQL query");
        populateTestAccounts(((FqlResult)((GraphObjectList) (obj)).get(0)).getFqlResultSet().castToListOf(com/facebook/TestSession$TestAccount), ((FqlResult)((GraphObjectList) (obj)).get(1)).getFqlResultSet().castToListOf(com/facebook/TestSession$UserAccount));
          goto _L1
    }

    public static void setTestApplicationId(String s)
    {
        com/facebook/TestSession;
        JVM INSTR monitorenter ;
        if (testApplicationId != null && !testApplicationId.equals(s))
        {
            throw new FacebookException("Can't have more than one test application ID");
        }
        break MISSING_BLOCK_LABEL_36;
        s;
        com/facebook/TestSession;
        JVM INSTR monitorexit ;
        throw s;
        testApplicationId = s;
        com/facebook/TestSession;
        JVM INSTR monitorexit ;
    }

    public static void setTestApplicationSecret(String s)
    {
        com/facebook/TestSession;
        JVM INSTR monitorenter ;
        if (testApplicationSecret != null && !testApplicationSecret.equals(s))
        {
            throw new FacebookException("Can't have more than one test application secret");
        }
        break MISSING_BLOCK_LABEL_36;
        s;
        com/facebook/TestSession;
        JVM INSTR monitorexit ;
        throw s;
        testApplicationSecret = s;
        com/facebook/TestSession;
        JVM INSTR monitorexit ;
    }

    private static void storeTestAccount(TestAccount testaccount)
    {
        com/facebook/TestSession;
        JVM INSTR monitorenter ;
        appTestAccounts.put(testaccount.getId(), testaccount);
        com/facebook/TestSession;
        JVM INSTR monitorexit ;
        return;
        testaccount;
        throw testaccount;
    }

    private String validNameStringFromInteger(long l)
    {
        String s = Long.toString(l);
        StringBuilder stringbuilder = new StringBuilder("Perm");
        int j = 0;
        char ac[] = s.toCharArray();
        int k = ac.length;
        for (int i = 0; i < k;)
        {
            char c1 = ac[i];
            char c = c1;
            if (c1 == j)
            {
                c = (char)(c1 + 10);
            }
            stringbuilder.append((char)((c + 97) - 48));
            i++;
            j = c;
        }

        return stringbuilder.toString();
    }

    void authorize(Session.AuthorizationRequest authorizationrequest)
    {
        if (mode == Mode.PRIVATE)
        {
            createTestAccountAndFinishAuth();
            return;
        } else
        {
            findOrCreateSharedTestAccount();
            return;
        }
    }

    void extendAccessToken()
    {
        wasAskedToExtendAccessToken = true;
        super.extendAccessToken();
    }

    void fakeTokenRefreshAttempt()
    {
        setCurrentTokenRefreshRequest(new Session.TokenRefreshRequest(this));
    }

    void forceExtendAccessToken(boolean flag)
    {
        AccessToken accesstoken = getTokenInfo();
        setTokenInfo(new AccessToken(accesstoken.getToken(), new Date(), accesstoken.getPermissions(), AccessTokenSource.TEST_USER, new Date(0L)));
        setLastAttemptedTokenExtendDate(new Date(0L));
    }

    public final String getTestUserId()
    {
        return testAccountId;
    }

    boolean getWasAskedToExtendAccessToken()
    {
        return wasAskedToExtendAccessToken;
    }

    void postStateChange(SessionState sessionstate, SessionState sessionstate1, Exception exception)
    {
        String s = testAccountId;
        super.postStateChange(sessionstate, sessionstate1, exception);
        if (sessionstate1.isClosed() && s != null && mode == Mode.PRIVATE)
        {
            deleteTestAccount(s, getAppAccessToken());
        }
    }

    boolean shouldExtendAccessToken()
    {
        boolean flag = super.shouldExtendAccessToken();
        wasAskedToExtendAccessToken = false;
        return flag;
    }

    public final String toString()
    {
        String s = super.toString();
        return (new StringBuilder()).append("{TestSession").append(" testUserId:").append(testAccountId).append(" ").append(s).append("}").toString();
    }

    static 
    {
        boolean flag;
        if (!com/facebook/TestSession.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
