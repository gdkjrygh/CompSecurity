// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.y;
import com.pandora.radio.util.k;
import p.cw.c;
import p.cx.p;

// Referenced classes of package com.pandora.android.widget:
//            a

public class RemoteBroadcastsReceiver extends BroadcastReceiver
{

    public RemoteBroadcastsReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        String s1;
        p.cw.b b1;
        k k1;
        com.pandora.radio.util.k.e e;
        String s2;
        s2 = intent.getAction();
        b1 = b.a.b().d();
        int i;
        if (b1.t() != null)
        {
            s1 = b1.t().h();
        } else
        {
            s1 = null;
        }
        k1 = b.a.b().o();
        i = intent.getIntExtra("extra_source", -1);
        if (i < 0 || i >= com.pandora.radio.util.k.e.values().length)
        {
            throw new IllegalStateException((new StringBuilder()).append("Unknown extra_source ordinal for BackgroundPlaybackCommand - ").append(s2).toString());
        }
        e = com.pandora.radio.util.k.e.values()[i];
        if (s2 == null) goto _L2; else goto _L1
_L1:
        if (!s2.equals("cmd_widget_toggle_pause")) goto _L4; else goto _L3
_L3:
        com.pandora.android.widget.a.b(true);
        if (b1.o())
        {
            context = com.pandora.radio.util.k.d.b;
        } else
        {
            context = com.pandora.radio.util.k.d.a;
        }
        k1.a(context, e, s1);
        b1.b();
_L2:
        b.a.b().z().a();
        return;
_L4:
        if (s2.equals("cmd_widget_thumbs_down"))
        {
            b1.d();
            k1.a(com.pandora.radio.util.k.d.e, e, s1);
        } else
        if (s2.equals("cmd_widget_thumbs_up"))
        {
            b1.c();
            k1.a(com.pandora.radio.util.k.d.d, e, s1);
        } else
        if (s2.equals("cmd_widget_skip"))
        {
            b1.b(intent.getStringExtra("intent_skip_source"));
            k1.a(com.pandora.radio.util.k.d.c, e, s1);
        } else
        if (s2.equals("cmd_widget_close"))
        {
            com.pandora.android.widget.a.b(false);
            b1.a(p.cw.b.c.b);
            b1.b(p.cw.b.c.a);
            k1.a(com.pandora.radio.util.k.d.b, e, s1);
        } else
        if (s2.equals("cmd_widget_foreground_app"))
        {
            intent = s.b(context);
            intent.addFlags(0x10000000);
            context.startActivity(intent);
            k1.a(com.pandora.radio.util.k.d.f, e, s1);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}
