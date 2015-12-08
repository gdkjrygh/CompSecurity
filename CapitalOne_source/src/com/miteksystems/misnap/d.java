// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.miteksystems.misnap:
//            MiSnap, u, MiSnapAPI, l

final class d extends Handler
{

    final MiSnap a;

    d(MiSnap misnap)
    {
        a = misnap;
        super();
    }

    public final void handleMessage(Message message)
    {
        if (!a.f()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        message.what;
        JVM INSTR tableswitch 1 18: default 100
    //                   1 101
    //                   2 109
    //                   3 100
    //                   4 100
    //                   5 100
    //                   6 117
    //                   7 146
    //                   8 279
    //                   9 297
    //                   10 447
    //                   11 185
    //                   12 475
    //                   13 496
    //                   14 517
    //                   15 538
    //                   16 559
    //                   17 580
    //                   18 601;
           goto _L3 _L4 _L5 _L3 _L3 _L3 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L18:
        continue; /* Loop/switch isn't completed */
_L3:
        return;
_L4:
        a.c();
        return;
_L5:
        MiSnap.a(a);
        return;
_L6:
        a.g();
        if (MiSnap.b(a) != null)
        {
            MiSnap.b(a).b(3);
            return;
        }
          goto _L1
_L7:
        a.a(R.string.uxp_help_button);
        a.g();
        if (MiSnap.b(a) != null)
        {
            MiSnap.b(a).b(2);
            return;
        }
          goto _L1
_L11:
        message = a;
        int i = R.string.uxp_touch_screen;
        MiSnap misnap = a;
        int j = MiSnap.c(misnap) + 1;
        MiSnap.a(misnap, j);
        message.a(i, j);
        if (MiSnap.c(a) >= a.a.O())
        {
            a.g();
            if (MiSnap.b(a) != null)
            {
                MiSnap.b(a).i();
                MiSnap.b(a).b(1);
                return;
            }
        }
          goto _L1
_L8:
        a.a(R.string.uxp_timeout_help_end);
        a.onBackPressed();
        return;
_L9:
        a.h();
        a.g();
        a.a(R.string.uxp_measured_failover);
        if (a.a.c())
        {
            if (a.a.N())
            {
                if (MiSnap.b(a) != null)
                {
                    MiSnap.b(a).b(0);
                    return;
                }
            } else
            {
                if (MiSnap.b(a) != null)
                {
                    MiSnap.b(a).i();
                }
                a.b();
                a.v.sendEmptyMessage(a.a());
                return;
            }
        } else
        {
            if (MiSnap.b(a) != null)
            {
                MiSnap.b(a).i();
            }
            a.a(0, null, "VideoCaptureFailed");
            return;
        }
          goto _L1
_L10:
        a.i();
        if (MiSnap.b(a) == null) goto _L1; else goto _L19
_L19:
        MiSnap.b(a).d();
        return;
_L12:
        if (a.b == null) goto _L1; else goto _L20
_L20:
        a.b.f();
        return;
_L13:
        if (a.b == null) goto _L1; else goto _L21
_L21:
        a.b.l();
        return;
_L14:
        if (MiSnap.b(a) == null) goto _L1; else goto _L22
_L22:
        MiSnap.b(a).k();
        return;
_L15:
        if (a.b == null) goto _L1; else goto _L23
_L23:
        a.b.g();
        return;
_L16:
        if (MiSnap.b(a) == null) goto _L1; else goto _L24
_L24:
        MiSnap.b(a).m();
        return;
_L17:
        if (a.b == null) goto _L1; else goto _L25
_L25:
        a.b.d();
        return;
        if (MiSnap.b(a) == null) goto _L1; else goto _L26
_L26:
        MiSnap.b(a).h();
        return;
    }
}
