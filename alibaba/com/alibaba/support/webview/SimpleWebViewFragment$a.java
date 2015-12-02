// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.support.webview;

import abf;
import android.media.SoundPool;
import android.os.Handler;
import android.os.Message;
import android.os.Vibrator;
import android.webkit.WebView;
import com.alibaba.api.base.exception.AeNeedLoginException;
import com.alibaba.api.base.util.JsonHashMap;
import com.alibaba.api.member.pojo.LoginInfo;
import com.alibaba.app.AEApp;
import java.lang.ref.WeakReference;
import lw;
import nz;

// Referenced classes of package com.alibaba.support.webview:
//            SimpleWebViewFragment

static class a extends Handler
{

    WeakReference a;

    public void handleMessage(Message message)
    {
        SimpleWebViewFragment simplewebviewfragment = (SimpleWebViewFragment)a.get();
        if (simplewebviewfragment != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s;
        String s1;
        Object obj;
        Object obj1;
        String s2;
        String s3;
        switch (message.what)
        {
        default:
            return;

        case 11: // '\013'
            break;

        case 10: // '\n'
            simplewebviewfragment.ap.play(1, 1.0F, 1.0F, 0, 0, 1.0F);
            simplewebviewfragment.ao.vibrate(200L);
            simplewebviewfragment.an();
            try
            {
                message = SimpleWebViewFragment.a("EVENT_SHAKE", null);
                if (simplewebviewfragment.e != null)
                {
                    simplewebviewfragment.e.loadUrl(message);
                    return;
                }
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                lw.a("SimpleWebViewFragment", message, new Object[0]);
                return;
            }
            break;

        case 12: // '\f'
            Object obj2;
            JsonHashMap jsonhashmap;
            JsonHashMap jsonhashmap1;
            JsonHashMap jsonhashmap2;
            boolean flag;
            try
            {
                lw.b("SimpleWebViewFragment", "login successed", new Object[0]);
                flag = AEApp.f().i().d();
                jsonhashmap = new JsonHashMap();
                jsonhashmap1 = new JsonHashMap();
                jsonhashmap2 = new JsonHashMap();
            }
            // Misplaced declaration of an exception variable
            catch (Message message)
            {
                lw.a("SimpleWebViewFragment", message, new Object[0]);
                return;
            }
            obj = "";
            s2 = "";
            obj1 = "";
            s3 = "success";
            break; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_469;
        }
        message = ((Message) (obj1));
        s1 = s2;
        s = ((String) (obj));
        obj2 = AEApp.f().i().e();
        message = ((Message) (obj1));
        s1 = s2;
        s = ((String) (obj));
        obj = ((LoginInfo) (obj2)).firstName;
        message = ((Message) (obj1));
        s1 = s2;
        s = ((String) (obj));
        s2 = ((LoginInfo) (obj2)).lastName;
        message = ((Message) (obj1));
        s1 = s2;
        s = ((String) (obj));
        obj1 = nz.a().d();
        message = ((Message) (obj1));
        s1 = s2;
        s = ((String) (obj));
        obj2 = ((LoginInfo) (obj2)).adminSeq;
        message = s2;
        s1 = ((String) (obj2));
        obj2 = "200";
        s = "true";
        s2 = ((String) (obj));
        obj = obj1;
        obj1 = message;
        message = ((Message) (obj2));
_L4:
        jsonhashmap1.put("code", message);
        jsonhashmap1.put("apiName", s3);
        jsonhashmap2.put("firstName", s2);
        jsonhashmap2.put("lastName", obj1);
        jsonhashmap2.put("country", obj);
        jsonhashmap2.put("memberSeq", s1);
        jsonhashmap2.put("isLoggedIn", s);
        jsonhashmap.put("head", jsonhashmap1);
        jsonhashmap.put("body", jsonhashmap2);
        message = SimpleWebViewFragment.a("EVENT_LOGIN", jsonhashmap);
        if (simplewebviewfragment.e != null)
        {
            simplewebviewfragment.e.loadUrl(message);
            return;
        }
          goto _L1
        obj;
        lw.b("SimpleWebViewFragment", ((AeNeedLoginException) (obj)).toString(), new Object[0]);
        s3 = "error";
        obj1 = s1;
        s1 = "";
        String s4 = "500";
        s2 = s;
        obj = message;
        s = "";
        message = s4;
          goto _L4
        obj1 = "";
        s1 = "";
        message = "200";
        s = "false";
        s2 = "";
        obj = "";
          goto _L4
    }

    _cls9(SimpleWebViewFragment simplewebviewfragment)
    {
        a = new WeakReference(simplewebviewfragment);
    }
}
