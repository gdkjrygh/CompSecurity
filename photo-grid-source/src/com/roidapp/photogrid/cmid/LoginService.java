// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cmid;

import android.app.IntentService;
import android.content.Intent;
import android.text.TextUtils;
import com.cleanmaster.sdk.cmloginsdkjar.CmLoginSdkException;
import com.cleanmaster.sdk.cmloginsdkjar.model.CmObject;
import com.cleanmaster.sdk.cmloginsdkjar.model.CmProxyLogin;
import com.cleanmaster.sdk.cmloginsdkjar.model.CmRawObject;
import com.cleanmaster.sdk.cmloginsdkjar.sdk.usermanager.UserManagerImpl;
import com.cm.kinfoc.a.e;
import com.cm.kinfoc.y;
import com.roidapp.baselib.c.aj;
import com.roidapp.baselib.c.n;
import com.roidapp.cloudlib.common.a;
import com.roidapp.cloudlib.facebook.al;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.roidapp.photogrid.cmid:
//            a, c, b

public class LoginService extends IntentService
{

    public LoginService()
    {
        super("LoginService");
    }

    private static String a()
    {
        String s1 = y.a(e.a().j());
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = "";
        }
        return s;
    }

    protected void onHandleIntent(Intent intent)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj = null;
        obj1 = null;
        obj2 = null;
        if (intent != null) goto _L2; else goto _L1
_L1:
        Object obj3;
        return;
_L2:
        if (TextUtils.isEmpty(((CharSequence) (obj3 = intent.getAction())))) goto _L4; else goto _L3
_L3:
        if (!"ACTION_LOGIN_BY_FACEBOOK".equalsIgnoreCase(((String) (obj3)))) goto _L6; else goto _L5
_L5:
        intent = al.a();
        if (intent == null || intent.isEmpty()) goto _L4; else goto _L7
_L7:
        obj = com.roidapp.photogrid.cmid.a.a(aj.a()).b();
        JSONException jsonexception;
        long l;
        long l1;
        if (obj != null)
        {
            try
            {
                intent = UserManagerImpl.getInstance(getApplicationContext()).thirdPartyLogin(((c) (obj)).a(), ((c) (obj)).b(), intent, null, "115", true, a(), n.d(aj.a()));
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                intent.printStackTrace();
                intent = ((Intent) (obj2));
            }
        } else
        {
            intent = null;
        }
        if (intent != null && intent.getRet() == 1)
        {
            obj1 = (CmProxyLogin)intent.getData().cast(com/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin);
            obj = new JSONObject();
            try
            {
                ((JSONObject) (obj)).put("sid", ((CmProxyLogin) (obj1)).getSid());
                ((JSONObject) (obj)).put("sso_token", ((CmProxyLogin) (obj1)).getSsoToken());
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                ((JSONException) (obj1)).printStackTrace();
            }
            intent = ((CmProxyLogin)intent.getData().cast(com/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin)).getExtra();
            com.roidapp.photogrid.cmid.a.a(aj.a()).a(((JSONObject) (obj)).toString());
            com.roidapp.photogrid.cmid.a.a(aj.a()).b(intent.getData().getInnerJSONObject().toString());
            return;
        }
_L4:
        if (true) goto _L1; else goto _L6
_L6:
        if (!"ACTION_FRESH_GOOGLE_TOKEN".equalsIgnoreCase(((String) (obj3)))) goto _L9; else goto _L8
_L8:
        l = System.currentTimeMillis();
        l1 = com.roidapp.photogrid.cmid.a.a(aj.a()).d();
        if (l1 != 0L && l - l1 < 0xffffffffb30c4000L)
        {
            continue; /* Loop/switch isn't completed */
        }
        com.roidapp.photogrid.cmid.a.a(aj.a()).a(l);
        obj1 = com.roidapp.photogrid.cmid.a.a(aj.a()).c();
        obj3 = com.roidapp.photogrid.cmid.a.a(aj.a()).b();
        if (obj1 == null || obj3 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = ((b) (obj1)).a();
        obj1 = UserManagerImpl.getInstance(getApplicationContext()).cmRefreshToken(((c) (obj3)).c(), ((c) (obj3)).d(), ((b) (obj1)).a(), a(), n.d(aj.a()));
        obj = obj1;
_L10:
        if (obj == null || ((CmRawObject) (obj)).getRet() != 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = (CmProxyLogin)((CmRawObject) (obj)).getData().cast(com/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin);
        obj = new JSONObject();
        try
        {
            ((JSONObject) (obj)).put("sid", ((CmProxyLogin) (obj1)).getSid());
            ((JSONObject) (obj)).put("sso_token", ((CmProxyLogin) (obj1)).getSsoToken());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            try
            {
                ((JSONException) (obj1)).printStackTrace();
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                intent.printStackTrace();
                return;
            }
        }
        com.roidapp.photogrid.cmid.a.a(aj.a()).a(((JSONObject) (obj)).toString());
        if (!TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            obj = new Intent(aj.a(), com/roidapp/photogrid/cmid/LoginService);
            ((Intent) (obj)).setAction("ACTION_LOGOUT");
            intent.putExtra(":sid", ((String) (obj2)));
            startService(((Intent) (obj)));
            return;
        }
        continue; /* Loop/switch isn't completed */
        obj1;
        ((CmLoginSdkException) (obj1)).printStackTrace();
        if (true) goto _L10; else goto _L9
_L9:
        if (!"ACTION_LOGOUT".equalsIgnoreCase(((String) (obj3))))
        {
            continue; /* Loop/switch isn't completed */
        }
        intent = intent.getStringExtra(":sid");
        obj = com.roidapp.photogrid.cmid.a.a(aj.a()).b();
        if (obj != null)
        {
            try
            {
                UserManagerImpl.getInstance(getApplicationContext()).allLogout(((c) (obj)).c(), ((c) (obj)).d(), intent, a(), n.d(aj.a()));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                intent.printStackTrace();
            }
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!"ACTION_LOGIN_BY_INSTAGRAM".equalsIgnoreCase(((String) (obj3)))) goto _L12; else goto _L11
_L11:
        break MISSING_BLOCK_LABEL_590;
_L12:
        break; /* Loop/switch isn't completed */
        obj = com.roidapp.cloudlib.common.a.d(getApplicationContext());
        if (obj == null || ((String) (obj)).isEmpty())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = com.roidapp.photogrid.cmid.a.a(aj.a()).b();
        intent = ((Intent) (obj1));
        if (obj2 != null)
        {
            try
            {
                intent = UserManagerImpl.getInstance(getApplicationContext()).instagramLoginWithExtra(((c) (obj2)).a(), ((c) (obj2)).b(), ((String) (obj)), null, a(), n.d(aj.a()));
            }
            // Misplaced declaration of an exception variable
            catch (Intent intent)
            {
                intent.printStackTrace();
                intent = ((Intent) (obj1));
            }
        }
        if (intent != null && intent.getRet() == 1)
        {
            obj1 = (CmProxyLogin)intent.getData().cast(com/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin);
            obj = new JSONObject();
            try
            {
                ((JSONObject) (obj)).put("sid", ((CmProxyLogin) (obj1)).getSid());
                ((JSONObject) (obj)).put("sso_token", ((CmProxyLogin) (obj1)).getSsoToken());
            }
            // Misplaced declaration of an exception variable
            catch (JSONException jsonexception)
            {
                jsonexception.printStackTrace();
            }
            intent = ((CmProxyLogin)intent.getData().cast(com/cleanmaster/sdk/cmloginsdkjar/model/CmProxyLogin)).getExtra();
            com.roidapp.photogrid.cmid.a.a(aj.a()).a(((JSONObject) (obj)).toString());
            com.roidapp.photogrid.cmid.a.a(aj.a()).b(intent.getData().getInnerJSONObject().toString());
            return;
        }
        continue; /* Loop/switch isn't completed */
    }
}
