// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.os.Bundle;
import android.view.KeyEvent;
import com.pandora.android.audio.RemoteControlClientManager;
import com.pandora.android.provider.b;
import com.pandora.android.widget.a;
import com.pandora.radio.data.y;
import com.pandora.radio.util.k;
import p.cx.c;
import p.cx.p;
import p.dm.m;

public class MediaButtonBroadcastReceiver extends BroadcastReceiver
{

    public MediaButtonBroadcastReceiver()
    {
    }

    public static boolean a()
    {
        return c.a().G() && m.n("disableRemoteEventListener");
    }

    private void b()
    {
        p.cw.b b1;
        k k1;
        String s;
        b1 = b.a.b().d();
        k1 = b.a.b().o();
        s = b1.t().h();
        if (!b1.o()) goto _L2; else goto _L1
_L1:
        k1.a(com.pandora.radio.util.k.d.b, com.pandora.radio.util.k.e.c, s);
_L4:
        if (b.a.b().q().a(p.dj.b.a.d))
        {
            com.pandora.android.widget.a.b(true);
        }
        b1.b();
        return;
_L2:
        if (b1.p())
        {
            k1.a(com.pandora.radio.util.k.d.a, com.pandora.radio.util.k.e.c, s);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onReceive(Context context, Intent intent)
    {
        intent = (KeyEvent)intent.getExtras().get("android.intent.extra.KEY_EVENT");
        if (intent.getAction() != 0)
        {
            return;
        }
        int i;
        int j;
        i = intent.getKeyCode();
        j = intent.getRepeatCount();
        p.df.a.c("MediaButtonBroadcastReceiver", (new StringBuilder()).append("Media button received: ").append(Integer.toString(i)).append("; keyCount =").append(j).toString());
        if (a()) goto _L2; else goto _L1
_L1:
        k k1;
        String s;
        intent = b.a.b().d();
        k1 = b.a.b().o();
        s = intent.t().h();
        if (j != 0) goto _L2; else goto _L3
_L3:
        i;
        JVM INSTR lookupswitch 5: default 333
    //                   79: 227
    //                   85: 263
    //                   87: 204
    //                   126: 270
    //                   127: 294;
           goto _L4 _L5 _L6 _L7 _L8 _L9
_L4:
        try
        {
            b.a.b().z().a();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            p.df.a.c("MediaButtonBroadcastReceiver", (new StringBuilder()).append("MediaButtonBroadcastReceiver exception:").append(context).toString(), context);
        }
        return;
_L7:
        intent.b("MediaButtonBroadcastReceiver KEYCODE_MEDIA_NEXT");
        k1.a(com.pandora.radio.util.k.d.c, com.pandora.radio.util.k.e.c, s);
        continue; /* Loop/switch isn't completed */
_L5:
        b();
        if (((AudioManager)context.getSystemService("audio")).isWiredHeadsetOn() && RemoteControlClientManager.c())
        {
            RemoteControlClientManager.d().a();
        }
        continue; /* Loop/switch isn't completed */
_L6:
        b();
        continue; /* Loop/switch isn't completed */
_L8:
        intent.a(p.cw.b.c.a);
        k1.a(com.pandora.radio.util.k.d.a, com.pandora.radio.util.k.e.c, s);
        continue; /* Loop/switch isn't completed */
_L9:
        intent.b(p.cw.b.c.a);
        if (RemoteControlClientManager.c())
        {
            RemoteControlClientManager.d().a();
        }
        k1.a(com.pandora.radio.util.k.d.b, com.pandora.radio.util.k.e.c, s);
        if (true) goto _L4; else goto _L2
_L2:
    }
}
