// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.os.Handler;
import java.util.TimerTask;

// Referenced classes of package com.microsoft.advertising.android:
//            j, b

final class a
    implements Runnable
{

    final a a;

    public final void run()
    {
        if (j.a(a(a)) != null)
        {
            j.a(a(a)).b();
        }
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/microsoft/advertising/android/j$3

/* anonymous class */
    final class j._cls3 extends TimerTask
    {

        final j a;

        static j a(j._cls3 _pcls3)
        {
            return _pcls3.a;
        }

        public final void run()
        {
            j.b(a).post(new j._cls3._cls1(this));
        }

            
            {
                a = j1;
                super();
            }
    }

}
