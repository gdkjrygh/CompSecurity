// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.sdk.ssologin;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.text.TextUtils;
import com.cleanmaster.sdk.cmloginsdkjar.Request;
import com.cleanmaster.sdk.cmloginsdkjar.Settings;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar.sdk.ssologin:
//            SsoService, b

final class a extends Handler
{

    final SsoService a;

    a(SsoService ssoservice)
    {
        a = ssoservice;
        super();
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR lookupswitch 2: default 32
    //                   1: 38
    //                   65536: 52;
           goto _L1 _L2 _L3
_L1:
        super.handleMessage(message);
        return;
_L2:
        SsoService.access$002(message.getData().getString("com.cleanmaster.sdk.cmloginsdk.data.APPLICATION_SID"));
        return;
_L3:
        int i = message.getData().getInt("com.cleanmaster.sdk.cmloginsdk.extra.APPLICATION_PID");
        String s = SsoService.access$100(a, i);
        Object obj;
        Bundle bundle;
        if (!TextUtils.isEmpty(s))
        {
            String s1 = SsoService.access$200(a, s);
            String as[] = new String[2];
            Request.newReauthRequest(Settings.getLoginSid(), Settings.getLoginSidSig(), SsoService.access$000(), s, s1, "", "", new b(this, as));
            s = as[0];
            obj = as[1];
        } else
        {
            s = "";
            obj = "";
        }
        bundle = new Bundle();
        bundle.putString("com.cleanmaster.sdk.cmloginsdk.extra.APPLICATION_SID", s);
        bundle.putString("com.cleanmaster.sdk.cmloginsdk.extra.APPLICATION_SID", ((String) (obj)));
        try
        {
            obj = Message.obtain(null, 0x10001, 0, 0);
            ((Message) (obj)).setData(bundle);
            message.replyTo.send(((Message) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((RemoteException) (obj)).printStackTrace();
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
