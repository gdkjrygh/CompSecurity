// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.os.AsyncTask;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ManagerLiveRail;

// Referenced classes of package com.tinder.fragments:
//            bd

final class a
    implements Runnable
{

    final bd a;

    public final void run()
    {
        String s = a.i.i;
        android.content.Context context = ManagerApp.c();
        Runnable runnable = new Runnable() {

            final bd._cls1 a;

            public final void run()
            {
                a.a.r = true;
            }

            
            {
                a = bd._cls1.this;
                super();
            }
        };
        (new com.tinder.utils.init>(context)).xecuteOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[] {
            s, runnable
        });
    }

    _cls1.a(bd bd1)
    {
        a = bd1;
        super();
    }
}
