// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.os.Handler;
import java.util.TimerTask;

// Referenced classes of package com.microsoft.advertising.android:
//            j, b

final class a extends TimerTask
{

    final j a;

    static j a(a a1)
    {
        return a1.a;
    }

    public final void run()
    {
        j.b(a).post(new Runnable() {

            final j._cls3 a;

            public final void run()
            {
                if (j.a(j._cls3.a(a)) != null)
                {
                    j.a(j._cls3.a(a)).b();
                }
            }

            
            {
                a = j._cls3.this;
                super();
            }
        });
    }

    _cls1.a(j j1)
    {
        a = j1;
        super();
    }
}
