// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.os.Handler;
import com.tinder.c.ah;
import java.util.TimerTask;

// Referenced classes of package com.tinder.fragments:
//            bm

final class a
    implements Runnable
{

    final a a;

    public final void run()
    {
        bm.A(a.a).l();
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/tinder/fragments/bm$13

/* anonymous class */
    final class bm._cls13 extends TimerTask
    {

        final bm a;

        public final void run()
        {
            bm.B(a).post(new bm._cls13._cls1(this));
        }

            
            {
                a = bm1;
                super();
            }
    }

}
