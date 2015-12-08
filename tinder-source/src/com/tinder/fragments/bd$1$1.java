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

    final a a;

    public final void run()
    {
        a.a.r = true;
    }

    pp(pp pp)
    {
        a = pp;
        super();
    }

    // Unreferenced inner class com/tinder/fragments/bd$1

/* anonymous class */
    final class bd._cls1
        implements Runnable
    {

        final bd a;

        public final void run()
        {
            String s = a.i.i;
            android.content.Context context = ManagerApp.c();
            bd._cls1._cls1 _lcls1 = new bd._cls1._cls1(this);
            (new com.tinder.utils.z.a(context)).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[] {
                s, _lcls1
            });
        }

            
            {
                a = bd1;
                super();
            }
    }

}
