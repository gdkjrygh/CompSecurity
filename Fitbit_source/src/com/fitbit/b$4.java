// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit;

import android.content.Context;
import android.os.AsyncTask;
import java.lang.ref.WeakReference;
import net.hockeyapp.android.b;

// Referenced classes of package com.fitbit:
//            b

class cTask extends AsyncTask
{

    final Context a;
    final com.fitbit.b b;

    protected transient Void a(Void avoid[])
    {
        avoid = new WeakReference(a);
        if (net.hockeyapp.android.b.a(avoid) != 0)
        {
            net.hockeyapp.android.b.a(avoid, com.fitbit.b.a(b));
            net.hockeyapp.android.b.b(avoid);
            net.hockeyapp.android.b.a(a, com.fitbit.b.a(b));
        }
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    .Context(com.fitbit.b b1, Context context)
    {
        b = b1;
        a = context;
        super();
    }
}
