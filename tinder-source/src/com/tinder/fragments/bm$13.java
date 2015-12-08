// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.os.Handler;
import com.tinder.c.ah;
import java.util.TimerTask;

// Referenced classes of package com.tinder.fragments:
//            bm

final class a extends TimerTask
{

    final bm a;

    public final void run()
    {
        bm.B(a).post(new Runnable() {

            final bm._cls13 a;

            public final void run()
            {
                bm.A(a.a).l();
            }

            
            {
                a = bm._cls13.this;
                super();
            }
        });
    }

    _cls1.a(bm bm1)
    {
        a = bm1;
        super();
    }
}
