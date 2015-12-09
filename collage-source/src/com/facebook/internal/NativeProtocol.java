// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import com.facebook.FacebookException;
import com.facebook.FacebookOperationCanceledException;
import com.facebook.FacebookSdk;
import com.facebook.login.DefaultAudience;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.facebook.internal:
//            Utility

public final class NativeProtocol
{
    private static class KatanaAppInfo extends NativeAppInfo
    {

        static final String KATANA_PACKAGE = "com.facebook.katana";

        protected String getPackage()
        {
            return "com.facebook.katana";
        }

        private KatanaAppInfo()
        {
        }

    }

    private static class MessengerAppInfo extends NativeAppInfo
    {

        static final String MESSENGER_PACKAGE = "com.facebook.orca";

        protected String getPackage()
        {
            return "com.facebook.orca";
        }

        private MessengerAppInfo()
        {
        }

    }

    private static abstract class NativeAppInfo
    {

        private static final String FBI_HASH = "a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc";
        private static final String FBL_HASH = "5e8f16062ea3cd2c4a0d547876baa6f38cabf625";
        private static final String FBR_HASH = "8a3c4b262d721acd49a4bf97d5213199c86fa2b9";
        private static final HashSet validAppSignatureHashes = buildAppSignatureHashes();
        private TreeSet availableVersions;

        private static HashSet buildAppSignatureHashes()
        {
            HashSet hashset = new HashSet();
            hashset.add("8a3c4b262d721acd49a4bf97d5213199c86fa2b9");
            hashset.add("a4b7452e2ed8f5f191058ca7bbfd26b0d3214bfc");
            hashset.add("5e8f16062ea3cd2c4a0d547876baa6f38cabf625");
            return hashset;
        }

        private void fetchAvailableVersions(boolean flag)
        {
            this;
            JVM INSTR monitorenter ;
            if (flag)
            {
                break MISSING_BLOCK_LABEL_13;
            }
            if (availableVersions != null)
            {
                break MISSING_BLOCK_LABEL_21;
            }
            availableVersions = NativeProtocol.fetchAllAvailableProtocolVersionsForAppInfo(this);
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public TreeSet getAvailableVersions()
        {
            if (availableVersions == null)
            {
                fetchAvailableVersions(false);
            }
            return availableVersions;
        }

        protected abstract String getPackage();

        public boolean validateSignature(Context context, String s)
        {
            String s1;
            int i;
            s1 = Build.BRAND;
            i = context.getApplicationInfo().flags;
            if (!s1.startsWith("generic") || (i & 2) == 0) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            int j;
            int k;
            try
            {
                context = context.getPackageManager().getPackageInfo(s, 64);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
            context = ((PackageInfo) (context)).signatures;
            k = context.length;
            j = 0;
label0:
            do
            {
label1:
                {
                    if (j >= k)
                    {
                        break label1;
                    }
                    s = Utility.sha1hash(context[j].toByteArray());
                    if (validAppSignatureHashes.contains(s))
                    {
                        break label0;
                    }
                    j++;
                }
            } while (true);
            if (true) goto _L1; else goto _L3
_L3:
            return false;
        }



        private NativeAppInfo()
        {
        }

    }

    private static class WakizashiAppInfo extends NativeAppInfo
    {

        static final String WAKIZASHI_PACKAGE = "com.facebook.wakizashi";

        protected String getPackage()
        {
            return "com.facebook.wakizashi";
        }

        private WakizashiAppInfo()
        {
        }

    }


    public static final String ACTION_APPINVITE_DIALOG = "com.facebook.platform.action.request.APPINVITES_DIALOG";
    public static final String ACTION_FEED_DIALOG = "com.facebook.platform.action.request.FEED_DIALOG";
    public static final String ACTION_LIKE_DIALOG = "com.facebook.platform.action.request.LIKE_DIALOG";
    public static final String ACTION_MESSAGE_DIALOG = "com.facebook.platform.action.request.MESSAGE_DIALOG";
    public static final String ACTION_OGACTIONPUBLISH_DIALOG = "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
    public static final String ACTION_OGMESSAGEPUBLISH_DIALOG = "com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG";
    public static final String AUDIENCE_EVERYONE = "everyone";
    public static final String AUDIENCE_FRIENDS = "friends";
    public static final String AUDIENCE_ME = "only_me";
    public static final String BRIDGE_ARG_ACTION_ID_STRING = "action_id";
    public static final String BRIDGE_ARG_APP_NAME_STRING = "app_name";
    public static final String BRIDGE_ARG_ERROR_BUNDLE = "error";
    public static final String BRIDGE_ARG_ERROR_CODE = "error_code";
    public static final String BRIDGE_ARG_ERROR_DESCRIPTION = "error_description";
    public static final String BRIDGE_ARG_ERROR_JSON = "error_json";
    public static final String BRIDGE_ARG_ERROR_SUBCODE = "error_subcode";
    public static final String BRIDGE_ARG_ERROR_TYPE = "error_type";
    private static final String CONTENT_SCHEME = "content://";
    public static final String ERROR_APPLICATION_ERROR = "ApplicationError";
    public static final String ERROR_NETWORK_ERROR = "NetworkError";
    public static final String ERROR_PERMISSION_DENIED = "PermissionDenied";
    public static final String ERROR_PROTOCOL_ERROR = "ProtocolError";
    public static final String ERROR_SERVICE_DISABLED = "ServiceDisabled";
    public static final String ERROR_UNKNOWN_ERROR = "UnknownError";
    public static final String ERROR_USER_CANCELED = "UserCanceled";
    public static final String EXTRA_ACCESS_TOKEN = "com.facebook.platform.extra.ACCESS_TOKEN";
    public static final String EXTRA_APPLICATION_ID = "com.facebook.platform.extra.APPLICATION_ID";
    public static final String EXTRA_APPLICATION_NAME = "com.facebook.platform.extra.APPLICATION_NAME";
    public static final String EXTRA_DIALOG_COMPLETE_KEY = "com.facebook.platform.extra.DID_COMPLETE";
    public static final String EXTRA_DIALOG_COMPLETION_GESTURE_KEY = "com.facebook.platform.extra.COMPLETION_GESTURE";
    public static final String EXTRA_EXPIRES_SECONDS_SINCE_EPOCH = "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH";
    public static final String EXTRA_GET_INSTALL_DATA_PACKAGE = "com.facebook.platform.extra.INSTALLDATA_PACKAGE";
    public static final String EXTRA_PERMISSIONS = "com.facebook.platform.extra.PERMISSIONS";
    public static final String EXTRA_PROTOCOL_ACTION = "com.facebook.platform.protocol.PROTOCOL_ACTION";
    public static final String EXTRA_PROTOCOL_BRIDGE_ARGS = "com.facebook.platform.protocol.BRIDGE_ARGS";
    public static final String EXTRA_PROTOCOL_CALL_ID = "com.facebook.platform.protocol.CALL_ID";
    public static final String EXTRA_PROTOCOL_METHOD_ARGS = "com.facebook.platform.protocol.METHOD_ARGS";
    public static final String EXTRA_PROTOCOL_METHOD_RESULTS = "com.facebook.platform.protocol.RESULT_ARGS";
    public static final String EXTRA_PROTOCOL_VERSION = "com.facebook.platform.protocol.PROTOCOL_VERSION";
    static final String EXTRA_PROTOCOL_VERSIONS = "com.facebook.platform.extra.PROTOCOL_VERSIONS";
    public static final String EXTRA_USER_ID = "com.facebook.platform.extra.USER_ID";
    private static final NativeAppInfo FACEBOOK_APP_INFO = new KatanaAppInfo();
    private static final String FACEBOOK_PROXY_AUTH_ACTIVITY = "com.facebook.katana.ProxyAuth";
    public static final String FACEBOOK_PROXY_AUTH_APP_ID_KEY = "client_id";
    public static final String FACEBOOK_PROXY_AUTH_E2E_KEY = "e2e";
    public static final String FACEBOOK_PROXY_AUTH_PERMISSIONS_KEY = "scope";
    private static final String FACEBOOK_TOKEN_REFRESH_ACTIVITY = "com.facebook.katana.platform.TokenRefreshService";
    public static final String IMAGE_URL_KEY = "url";
    public static final String IMAGE_USER_GENERATED_KEY = "user_generated";
    static final String INTENT_ACTION_PLATFORM_ACTIVITY = "com.facebook.platform.PLATFORM_ACTIVITY";
    static final String INTENT_ACTION_PLATFORM_SERVICE = "com.facebook.platform.PLATFORM_SERVICE";
    private static final List KNOWN_PROTOCOL_VERSIONS = Arrays.asList(new Integer[] {
        Integer.valueOf(0x13354a2), Integer.valueOf(0x1335433), Integer.valueOf(0x13353e4), Integer.valueOf(0x13353c9), Integer.valueOf(0x133529d), Integer.valueOf(0x1335124), Integer.valueOf(0x13350ac), Integer.valueOf(0x1332d23), Integer.valueOf(0x1332b3a), Integer.valueOf(0x1332ac6), 
        Integer.valueOf(0x133060d)
    });
    public static final int MESSAGE_GET_ACCESS_TOKEN_REPLY = 0x10001;
    public static final int MESSAGE_GET_ACCESS_TOKEN_REQUEST = 0x10000;
    public static final int MESSAGE_GET_INSTALL_DATA_REPLY = 0x10005;
    public static final int MESSAGE_GET_INSTALL_DATA_REQUEST = 0x10004;
    public static final int MESSAGE_GET_LIKE_STATUS_REPLY = 0x10007;
    public static final int MESSAGE_GET_LIKE_STATUS_REQUEST = 0x10006;
    static final int MESSAGE_GET_PROTOCOL_VERSIONS_REPLY = 0x10003;
    static final int MESSAGE_GET_PROTOCOL_VERSIONS_REQUEST = 0x10002;
    public static final int NO_PROTOCOL_AVAILABLE = -1;
    public static final String OPEN_GRAPH_CREATE_OBJECT_KEY = "fbsdk:create_object";
    private static final String PLATFORM_PROVIDER = ".provider.PlatformProvider";
    private static final String PLATFORM_PROVIDER_VERSIONS = ".provider.PlatformProvider/versions";
    private static final String PLATFORM_PROVIDER_VERSION_COLUMN = "version";
    public static final int PROTOCOL_VERSION_20121101 = 0x133060d;
    public static final int PROTOCOL_VERSION_20130502 = 0x1332ac6;
    public static final int PROTOCOL_VERSION_20130618 = 0x1332b3a;
    public static final int PROTOCOL_VERSION_20131107 = 0x1332d23;
    public static final int PROTOCOL_VERSION_20140204 = 0x13350ac;
    public static final int PROTOCOL_VERSION_20140324 = 0x1335124;
    public static final int PROTOCOL_VERSION_20140701 = 0x133529d;
    public static final int PROTOCOL_VERSION_20141001 = 0x13353c9;
    public static final int PROTOCOL_VERSION_20141028 = 0x13353e4;
    public static final int PROTOCOL_VERSION_20141107 = 0x1335433;
    public static final int PROTOCOL_VERSION_20141218 = 0x13354a2;
    public static final String RESULT_ARGS_ACCESS_TOKEN = "access_token";
    public static final String RESULT_ARGS_DIALOG_COMPLETE_KEY = "didComplete";
    public static final String RESULT_ARGS_DIALOG_COMPLETION_GESTURE_KEY = "completionGesture";
    public static final String RESULT_ARGS_EXPIRES_SECONDS_SINCE_EPOCH = "expires_seconds_since_epoch";
    public static final String RESULT_ARGS_PERMISSIONS = "permissions";
    public static final String STATUS_ERROR_CODE = "com.facebook.platform.status.ERROR_CODE";
    public static final String STATUS_ERROR_DESCRIPTION = "com.facebook.platform.status.ERROR_DESCRIPTION";
    public static final String STATUS_ERROR_JSON = "com.facebook.platform.status.ERROR_JSON";
    public static final String STATUS_ERROR_SUBCODE = "com.facebook.platform.status.ERROR_SUBCODE";
    public static final String STATUS_ERROR_TYPE = "com.facebook.platform.status.ERROR_TYPE";
    public static final String WEB_DIALOG_ACTION = "action";
    public static final String WEB_DIALOG_IS_FALLBACK = "is_fallback";
    public static final String WEB_DIALOG_PARAMS = "params";
    public static final String WEB_DIALOG_URL = "url";
    private static Map actionToAppInfoMap = buildActionToAppInfoMap();
    private static List facebookAppInfoList = buildFacebookAppList();
    private static AtomicBoolean protocolVersionsAsyncUpdating = new AtomicBoolean(false);

    public NativeProtocol()
    {
    }

    private static Map buildActionToAppInfoMap()
    {
        HashMap hashmap = new HashMap();
        ArrayList arraylist = new ArrayList();
        arraylist.add(new MessengerAppInfo());
        hashmap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", facebookAppInfoList);
        hashmap.put("com.facebook.platform.action.request.FEED_DIALOG", facebookAppInfoList);
        hashmap.put("com.facebook.platform.action.request.LIKE_DIALOG", facebookAppInfoList);
        hashmap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", facebookAppInfoList);
        hashmap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arraylist);
        hashmap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arraylist);
        return hashmap;
    }

    private static List buildFacebookAppList()
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(FACEBOOK_APP_INFO);
        arraylist.add(new WakizashiAppInfo());
        return arraylist;
    }

    private static Uri buildPlatformProviderVersionURI(NativeAppInfo nativeappinfo)
    {
        return Uri.parse((new StringBuilder()).append("content://").append(nativeappinfo.getPackage()).append(".provider.PlatformProvider/versions").toString());
    }

    public static int computeLatestAvailableVersionFromVersionSpec(TreeSet treeset, int i, int ai[])
    {
        int j;
        int k;
        j = ai.length;
        treeset = treeset.descendingIterator();
        k = -1;
        j--;
_L2:
        int l;
        if (treeset.hasNext())
        {
            l = ((Integer)treeset.next()).intValue();
            k = Math.max(k, l);
            for (; j >= 0 && ai[j] > l; j--) { }
            if (j >= 0)
            {
                continue; /* Loop/switch isn't completed */
            }
        }
_L3:
        return -1;
        if (ai[j] != l) goto _L2; else goto _L1
_L1:
        if (j % 2 == 0)
        {
            return Math.min(k, i);
        }
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public static Bundle createBundleForException(FacebookException facebookexception)
    {
        Bundle bundle;
        if (facebookexception == null)
        {
            bundle = null;
        } else
        {
            Bundle bundle1 = new Bundle();
            bundle1.putString("error_description", facebookexception.toString());
            bundle = bundle1;
            if (facebookexception instanceof FacebookOperationCanceledException)
            {
                bundle1.putString("error_type", "UserCanceled");
                return bundle1;
            }
        }
        return bundle;
    }

    public static Intent createPlatformActivityIntent(Context context, String s, String s1, int i, Bundle bundle)
    {
        context = findActivityIntent(context, "com.facebook.platform.PLATFORM_ACTIVITY", s1);
        if (context == null)
        {
            return null;
        } else
        {
            setupProtocolRequestIntent(context, s, s1, i, bundle);
            return context;
        }
    }

    public static Intent createPlatformServiceIntent(Context context)
    {
        for (Iterator iterator = facebookAppInfoList.iterator(); iterator.hasNext();)
        {
            Object obj = (NativeAppInfo)iterator.next();
            obj = validateServiceIntent(context, (new Intent("com.facebook.platform.PLATFORM_SERVICE")).setPackage(((NativeAppInfo) (obj)).getPackage()).addCategory("android.intent.category.DEFAULT"), ((NativeAppInfo) (obj)));
            if (obj != null)
            {
                return ((Intent) (obj));
            }
        }

        return null;
    }

    public static Intent createProtocolResultIntent(Intent intent, Bundle bundle, FacebookException facebookexception)
    {
        UUID uuid = getCallIdFromIntent(intent);
        if (uuid == null)
        {
            intent = null;
        } else
        {
            Intent intent1 = new Intent();
            intent1.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", getProtocolVersionFromIntent(intent));
            intent = new Bundle();
            intent.putString("action_id", uuid.toString());
            if (facebookexception != null)
            {
                intent.putBundle("error", createBundleForException(facebookexception));
            }
            intent1.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", intent);
            intent = intent1;
            if (bundle != null)
            {
                intent1.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
                return intent1;
            }
        }
        return intent;
    }

    public static Intent createProxyAuthIntent(Context context, String s, Collection collection, String s1, boolean flag, boolean flag1, DefaultAudience defaultaudience)
    {
        for (Iterator iterator = facebookAppInfoList.iterator(); iterator.hasNext();)
        {
            Object obj = (NativeAppInfo)iterator.next();
            Intent intent = (new Intent()).setClassName(((NativeAppInfo) (obj)).getPackage(), "com.facebook.katana.ProxyAuth").putExtra("client_id", s);
            if (!Utility.isNullOrEmpty(collection))
            {
                intent.putExtra("scope", TextUtils.join(",", collection));
            }
            if (!Utility.isNullOrEmpty(s1))
            {
                intent.putExtra("e2e", s1);
            }
            intent.putExtra("response_type", "token,signed_request");
            intent.putExtra("return_scopes", "true");
            if (flag1)
            {
                intent.putExtra("default_audience", defaultaudience.getNativeProtocolAudience());
            }
            intent.putExtra("legacy_override", "v2.5");
            if (flag)
            {
                intent.putExtra("auth_type", "rerequest");
            }
            obj = validateActivityIntent(context, intent, ((NativeAppInfo) (obj)));
            if (obj != null)
            {
                return ((Intent) (obj));
            }
        }

        return null;
    }

    public static Intent createTokenRefreshIntent(Context context)
    {
        for (Iterator iterator = facebookAppInfoList.iterator(); iterator.hasNext();)
        {
            Object obj = (NativeAppInfo)iterator.next();
            obj = validateServiceIntent(context, (new Intent()).setClassName(((NativeAppInfo) (obj)).getPackage(), "com.facebook.katana.platform.TokenRefreshService"), ((NativeAppInfo) (obj)));
            if (obj != null)
            {
                return ((Intent) (obj));
            }
        }

        return null;
    }

    private static TreeSet fetchAllAvailableProtocolVersionsForAppInfo(NativeAppInfo nativeappinfo)
    {
        Object obj;
        Object obj1;
        TreeSet treeset;
        Uri uri;
        obj1 = null;
        treeset = new TreeSet();
        obj = FacebookSdk.getApplicationContext().getContentResolver();
        uri = buildPlatformProviderVersionURI(nativeappinfo);
        if (FacebookSdk.getApplicationContext().getPackageManager().resolveContentProvider((new StringBuilder()).append(nativeappinfo.getPackage()).append(".provider.PlatformProvider").toString(), 0) == null) goto _L2; else goto _L1
_L1:
        nativeappinfo = ((ContentResolver) (obj)).query(uri, new String[] {
            "version"
        }, null, null, null);
        obj = nativeappinfo;
        if (nativeappinfo == null) goto _L4; else goto _L3
_L3:
        obj = nativeappinfo;
        if (!nativeappinfo.moveToNext())
        {
            break; /* Loop/switch isn't completed */
        }
        treeset.add(Integer.valueOf(nativeappinfo.getInt(nativeappinfo.getColumnIndex("version"))));
        if (true) goto _L3; else goto _L4
        obj;
_L6:
        if (nativeappinfo != null)
        {
            nativeappinfo.close();
        }
        throw obj;
_L2:
        obj = null;
_L4:
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        return treeset;
        obj;
        nativeappinfo = obj1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static Intent findActivityIntent(Context context, String s, String s1)
    {
        s1 = (List)actionToAppInfoMap.get(s1);
        if (s1 != null) goto _L2; else goto _L1
_L1:
        s1 = null;
_L4:
        return s1;
_L2:
        Intent intent;
        Iterator iterator = s1.iterator();
        s1 = null;
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            s1 = (NativeAppInfo)iterator.next();
            intent = validateActivityIntent(context, (new Intent()).setAction(s).setPackage(s1.getPackage()).addCategory("android.intent.category.DEFAULT"), s1);
            s1 = intent;
        } while (intent == null);
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        return intent;
    }

    public static Bundle getBridgeArgumentsFromIntent(Intent intent)
    {
        if (!isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(intent)))
        {
            return null;
        } else
        {
            return intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
        }
    }

    public static UUID getCallIdFromIntent(Intent intent)
    {
        if (intent != null)
        {
            if (isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(intent)))
            {
                intent = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                if (intent != null)
                {
                    intent = intent.getString("action_id");
                } else
                {
                    intent = null;
                }
            } else
            {
                intent = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
            }
            if (intent != null)
            {
                try
                {
                    intent = UUID.fromString(intent);
                }
                // Misplaced declaration of an exception variable
                catch (Intent intent)
                {
                    return null;
                }
                return intent;
            }
        }
        return null;
    }

    public static Bundle getErrorDataFromResultIntent(Intent intent)
    {
        if (!isErrorResult(intent))
        {
            return null;
        }
        Bundle bundle = getBridgeArgumentsFromIntent(intent);
        if (bundle != null)
        {
            return bundle.getBundle("error");
        } else
        {
            return intent.getExtras();
        }
    }

    public static FacebookException getExceptionFromErrorData(Bundle bundle)
    {
        if (bundle == null)
        {
            return null;
        }
        String s1 = bundle.getString("error_type");
        String s = s1;
        if (s1 == null)
        {
            s = bundle.getString("com.facebook.platform.status.ERROR_TYPE");
        }
        String s2 = bundle.getString("error_description");
        s1 = s2;
        if (s2 == null)
        {
            s1 = bundle.getString("com.facebook.platform.status.ERROR_DESCRIPTION");
        }
        if (s != null && s.equalsIgnoreCase("UserCanceled"))
        {
            return new FacebookOperationCanceledException(s1);
        } else
        {
            return new FacebookException(s1);
        }
    }

    public static int getLatestAvailableProtocolVersionForAction(String s, int ai[])
    {
        return getLatestAvailableProtocolVersionForAppInfoList((List)actionToAppInfoMap.get(s), ai);
    }

    private static int getLatestAvailableProtocolVersionForAppInfoList(List list, int ai[])
    {
        updateAllAvailableProtocolVersionsAsync();
        if (list == null)
        {
            return -1;
        }
        for (list = list.iterator(); list.hasNext();)
        {
            int i = computeLatestAvailableVersionFromVersionSpec(((NativeAppInfo)list.next()).getAvailableVersions(), getLatestKnownVersion(), ai);
            if (i != -1)
            {
                return i;
            }
        }

        return -1;
    }

    public static int getLatestAvailableProtocolVersionForService(int i)
    {
        return getLatestAvailableProtocolVersionForAppInfoList(facebookAppInfoList, new int[] {
            i
        });
    }

    public static final int getLatestKnownVersion()
    {
        return ((Integer)KNOWN_PROTOCOL_VERSIONS.get(0)).intValue();
    }

    public static Bundle getMethodArgumentsFromIntent(Intent intent)
    {
        if (!isVersionCompatibleWithBucketedIntent(getProtocolVersionFromIntent(intent)))
        {
            return intent.getExtras();
        } else
        {
            return intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        }
    }

    public static int getProtocolVersionFromIntent(Intent intent)
    {
        return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
    }

    public static Bundle getSuccessResultsFromIntent(Intent intent)
    {
        int i = getProtocolVersionFromIntent(intent);
        intent = intent.getExtras();
        if (!isVersionCompatibleWithBucketedIntent(i) || intent == null)
        {
            return intent;
        } else
        {
            return intent.getBundle("com.facebook.platform.protocol.RESULT_ARGS");
        }
    }

    public static boolean isErrorResult(Intent intent)
    {
        Bundle bundle = getBridgeArgumentsFromIntent(intent);
        if (bundle != null)
        {
            return bundle.containsKey("error");
        } else
        {
            return intent.hasExtra("com.facebook.platform.status.ERROR_TYPE");
        }
    }

    public static boolean isVersionCompatibleWithBucketedIntent(int i)
    {
        return KNOWN_PROTOCOL_VERSIONS.contains(Integer.valueOf(i)) && i >= 0x133529d;
    }

    public static void setupProtocolRequestIntent(Intent intent, String s, String s1, int i, Bundle bundle)
    {
        String s3 = FacebookSdk.getApplicationId();
        String s2 = FacebookSdk.getApplicationName();
        intent.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", i).putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", s1).putExtra("com.facebook.platform.extra.APPLICATION_ID", s3);
        if (isVersionCompatibleWithBucketedIntent(i))
        {
            s1 = new Bundle();
            s1.putString("action_id", s);
            Utility.putNonEmptyString(s1, "app_name", s2);
            intent.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", s1);
            s = bundle;
            if (bundle == null)
            {
                s = new Bundle();
            }
            intent.putExtra("com.facebook.platform.protocol.METHOD_ARGS", s);
            return;
        }
        intent.putExtra("com.facebook.platform.protocol.CALL_ID", s);
        if (!Utility.isNullOrEmpty(s2))
        {
            intent.putExtra("com.facebook.platform.extra.APPLICATION_NAME", s2);
        }
        intent.putExtras(bundle);
    }

    public static void updateAllAvailableProtocolVersionsAsync()
    {
        if (!protocolVersionsAsyncUpdating.compareAndSet(false, true))
        {
            return;
        } else
        {
            FacebookSdk.getExecutor().execute(new Runnable() {

                public void run()
                {
                    for (Iterator iterator = NativeProtocol.facebookAppInfoList.iterator(); iterator.hasNext(); ((NativeAppInfo)iterator.next()).fetchAvailableVersions(true)) { }
                    break MISSING_BLOCK_LABEL_44;
                    Exception exception;
                    exception;
                    NativeProtocol.protocolVersionsAsyncUpdating.set(false);
                    throw exception;
                    NativeProtocol.protocolVersionsAsyncUpdating.set(false);
                    return;
                }

            });
            return;
        }
    }

    static Intent validateActivityIntent(Context context, Intent intent, NativeAppInfo nativeappinfo)
    {
        if (intent == null)
        {
            intent = null;
        } else
        {
            ResolveInfo resolveinfo = context.getPackageManager().resolveActivity(intent, 0);
            if (resolveinfo == null)
            {
                return null;
            }
            if (!nativeappinfo.validateSignature(context, resolveinfo.activityInfo.packageName))
            {
                return null;
            }
        }
        return intent;
    }

    static Intent validateServiceIntent(Context context, Intent intent, NativeAppInfo nativeappinfo)
    {
        if (intent == null)
        {
            intent = null;
        } else
        {
            ResolveInfo resolveinfo = context.getPackageManager().resolveService(intent, 0);
            if (resolveinfo == null)
            {
                return null;
            }
            if (!nativeappinfo.validateSignature(context, resolveinfo.serviceInfo.packageName))
            {
                return null;
            }
        }
        return intent;
    }




}
