// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.server;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.auth.GoogleAuthUtil;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.server.ApiaryRequest;
import com.google.android.gms.common.server.BaseApiaryServer;
import com.google.android.gms.common.server.UserAgent;
import com.google.android.gms.common.server.auth.AuthSessionAuthenticator;
import com.google.android.gms.common.server.error.ErrorInstanceResponse;
import com.google.android.gms.common.server.error.ErrorUtils;
import com.google.android.gms.common.server.response.FastJsonResponse;
import com.google.android.gms.common.server.response.FastMapJsonResponse;
import com.google.android.gms.common.server.response.FieldMappingDictionary;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.games.GamesSharedPrefs;
import com.google.android.gms.games.broker.GamesExperiments;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.config.GamesOptions;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.server.error.GamesException;
import com.google.android.play.experiments.PlayExperiments;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.games.server:
//            GamesRequest

public final class GamesServer extends BaseApiaryServer
{

    private static final HashMap VARIANT_MAP = new HashMap();
    private static final Object VARIANT_MAP_LOCK = new Object();
    private final boolean mUseFirstPartyEndpoints;

    public GamesServer(Context context, boolean flag, boolean flag1, boolean flag2, String s)
    {
        super(context, null, null, flag1, flag2, s, null);
        mUseFirstPartyEndpoints = flag;
        setNetworkClientTag(3584);
    }

    public static int getSdkVariant(ClientContext clientcontext)
    {
        Object obj = VARIANT_MAP_LOCK;
        obj;
        JVM INSTR monitorenter ;
        clientcontext = (Integer)VARIANT_MAP.get(clientcontext);
        if (clientcontext != null) goto _L2; else goto _L1
_L1:
        int i = 4368;
_L4:
        obj;
        JVM INSTR monitorexit ;
        return i;
_L2:
        i = clientcontext.intValue();
        if (true) goto _L4; else goto _L3
_L3:
        clientcontext;
        obj;
        JVM INSTR monitorexit ;
        throw clientcontext;
    }

    private static int getVersionCode(Context context, String s)
    {
        int i;
        try
        {
            i = context.getPackageManager().getPackageInfo(s, 0).versionCode;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return 0;
        }
        return i;
    }

    public static void setSdkVariant(ClientContext clientcontext, int i)
    {
        Object obj = VARIANT_MAP_LOCK;
        obj;
        JVM INSTR monitorenter ;
        if (i != 4368)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        VARIANT_MAP.remove(clientcontext);
_L2:
        obj;
        JVM INSTR monitorexit ;
        return;
        VARIANT_MAP.put(clientcontext, Integer.valueOf(i));
        if (true) goto _L2; else goto _L1
_L1:
        clientcontext;
        obj;
        JVM INSTR monitorexit ;
        throw clientcontext;
    }

    protected final ApiaryRequest buildRequest(ClientContext clientcontext, int i, String s, Object obj, Class class1, FieldMappingDictionary fieldmappingdictionary, String s1, 
            String s2, com.android.volley.Response.Listener listener, com.android.volley.Response.ErrorListener errorlistener, HashMap hashmap)
    {
        return new GamesRequest(clientcontext, i, s, obj, class1, listener, errorlistener, s1, s2, mEnableCache, hashmap);
    }

    protected final HashMap createHeaders(Context context, ClientContext clientcontext, String s)
    {
        s = super.createHeaders(context, clientcontext, s);
        s.put("X-Device-ID", Long.toHexString(AndroidUtils.getAndroidId$faab219()));
        Object obj = UserAgent.get(context, "Games Android SDK/1.0-%s; %s/%s");
        int i = getVersionCode(context, "com.google.android.play.games");
        s.put("User-Agent", String.format(((String) (obj)), new Object[] {
            Integer.valueOf(getSdkVariant(clientcontext)), "com.google.android.play.games", Integer.valueOf(i)
        }));
        obj = GamesExperiments.getInstance().getExperiments(context, clientcontext);
        if (obj != null)
        {
            clientcontext = ((PlayExperiments) (obj)).getLocalExperimentsAsByteArray();
            context = clientcontext;
            if (clientcontext == null)
            {
                context = ((PlayExperiments) (obj)).getExperimentsAsByteArray();
            }
            s.put("X-Goog-Experiments", Base64Utils.encodeUrlSafe(context));
        }
        return s;
    }

    public final String getAuthTokenOrThrow(ClientContext clientcontext)
        throws GoogleAuthException, VolleyError
    {
        String s;
        try
        {
            s = super.getAuthTokenOrThrow(clientcontext);
        }
        catch (GoogleAuthException googleauthexception)
        {
            clientcontext.clearFromSharedPrefs(mContext);
            throw googleauthexception;
        }
        return s;
    }

    protected final AuthSessionAuthenticator getAuthenticator(ClientContext clientcontext)
    {
        return new AuthSessionAuthenticator(clientcontext, (byte)0);
    }

    protected final String getBaseUri()
    {
        if (mUseFirstPartyEndpoints)
        {
            String s = GamesSharedPrefs.getSharedPrefs(mContext).getString("serverApiVersion1p", null);
            if (s == null || ((Boolean)G.forceServerVersion.get()).booleanValue())
            {
                s = (String)G.internalServerVersion.get();
            }
            return GamesOptions.formatUrl(GamesOptions.getBaseServer(), s);
        }
        String s1 = GamesSharedPrefs.getSharedPrefs(mContext).getString("serverApiVersion3p", null);
        if (s1 == null || ((Boolean)G.forceServerVersion.get()).booleanValue())
        {
            s1 = (String)G.serverVersion.get();
        }
        return GamesOptions.formatUrl(GamesOptions.getBaseServer(), s1);
    }

    public final FastJsonResponse getResponseBlocking(ClientContext clientcontext, int i, String s, Object obj, Class class1)
        throws GoogleAuthException, VolleyError
    {
        Object obj1 = null;
        s = (FastJsonResponse)Preconditions.checkNotNull(super.getResponseBlocking(clientcontext, i, s, obj, class1), (new StringBuilder("Null response received for path ")).append(s).toString());
        return s;
        class1;
        obj = obj1;
        if (((VolleyError) (class1)).networkResponse == null) goto _L2; else goto _L1
_L1:
        ((VolleyError) (class1)).networkResponse.statusCode;
        JVM INSTR tableswitch 401 403: default 88
    //                   401 126
    //                   402 126
    //                   403 126;
           goto _L3 _L4 _L4 _L4
_L3:
        i = 0;
_L7:
        if (i != 0) goto _L6; else goto _L5
_L5:
        obj = obj1;
_L2:
        String s1;
        if (obj != null)
        {
            GoogleAuthUtil.invalidateToken(mContext, getAuthTokenOrThrow(clientcontext));
            clientcontext.clearFromSharedPrefs(mContext);
            throw obj;
        } else
        {
            throw class1;
        }
_L4:
        i = 1;
          goto _L7
_L6:
        s = ErrorUtils.getErrorInstance(class1, null);
        obj = obj1;
        if (s == null) goto _L2; else goto _L8
_L8:
        obj = obj1;
        if (s.getReason() == null) goto _L2; else goto _L9
_L9:
        obj = s.getReason();
        s1 = (String)((FastMapJsonResponse) (s)).mValues.get("message");
        ((String) (obj)).hashCode();
        JVM INSTR lookupswitch 9: default 264
    //                   -1489025695: 394
    //                   -1333577706: 362
    //                   -688551261: 426
    //                   -590433991: 442
    //                   -486249484: 475
    //                   409842285: 410
    //                   578598082: 378
    //                   1237439882: 492
    //                   1902722464: 458;
           goto _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L10:
        i = -1;
_L28:
        i;
        JVM INSTR tableswitch 0 8: default 316
    //                   0 509
    //                   1 521
    //                   2 540
    //                   3 540
    //                   4 540
    //                   5 559
    //                   6 559
    //                   7 572
    //                   8 593;
           goto _L20 _L21 _L22 _L23 _L23 _L23 _L24 _L24 _L25 _L26
_L20:
        s = null;
_L37:
        obj = obj1;
        if (s != null)
        {
            s.logMessage = s1;
            boolean flag;
            if (((com.google.android.gms.games.server.error.GamesException.Builder) (s)).clientStatusCode != -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            obj = new GamesException(s, (byte)0);
        }
          goto _L2
_L12:
        if (!((String) (obj)).equals("NotLicensed")) goto _L10; else goto _L27
_L27:
        i = 0;
          goto _L28
_L17:
        if (!((String) (obj)).equals("UserRegistrationIncomplete")) goto _L10; else goto _L29
_L29:
        i = 1;
          goto _L28
_L11:
        if (!((String) (obj)).equals("UnregisteredClientId")) goto _L10; else goto _L30
_L30:
        i = 2;
          goto _L28
_L16:
        if (!((String) (obj)).equals("accessNotConfigured")) goto _L10; else goto _L31
_L31:
        i = 3;
          goto _L28
_L13:
        if (!((String) (obj)).equals("userRateLimitExceeded")) goto _L10; else goto _L32
_L32:
        i = 4;
          goto _L28
_L14:
        if (!((String) (obj)).equals("ApiAccessDenied")) goto _L10; else goto _L33
_L33:
        i = 5;
          goto _L28
_L19:
        if (!((String) (obj)).equals("UserNotAllowed")) goto _L10; else goto _L34
_L34:
        i = 6;
          goto _L28
_L15:
        if (!((String) (obj)).equals("ApplicationRequestNotAllowed")) goto _L10; else goto _L35
_L35:
        i = 7;
          goto _L28
_L18:
        if (!((String) (obj)).equals("RestrictedDomainUser")) goto _L10; else goto _L36
_L36:
        i = 8;
          goto _L28
_L21:
        s = GamesException.builder().withStatus(7);
          goto _L37
_L22:
        s = GamesException.builder();
        s.internalStatusCode = 1500;
        s.clientStatusCode = 2;
          goto _L37
_L23:
        s = GamesException.builder();
        s.internalStatusCode = 1002;
        s.clientStatusCode = 2;
          goto _L37
_L24:
        s = GamesException.builder().withStatus(1003);
          goto _L37
_L25:
        GamesLog.e("GamesServer", "Attempting to access a resource for another application. Check your resource IDs.");
        s = GamesException.builder().withStatus(8);
          goto _L37
_L26:
        s = GamesException.builder().withStatus(1004);
          goto _L37
    }

    protected final void setRetryPolicy(Request request, String s)
    {
        request.setRetryPolicy(new com.google.android.gms.common.server.AbstractApiaryServer.DefaultApiaryRetryPolicy(mContext, s, 5000, 1, 1.0F));
    }

}
