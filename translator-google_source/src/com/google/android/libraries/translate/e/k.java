// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.e;

import android.os.AsyncTask;

// Referenced classes of package com.google.android.libraries.translate.e:
//            l

public abstract class k extends AsyncTask
{

    public l f;

    public k()
    {
    }

    public final transient void a(Object aobj[])
    {
        executeOnExecutor(THREAD_POOL_EXECUTOR, aobj);
    }

    public void onPostExecute(Object obj)
    {
        if (f != null)
        {
            f.a(obj);
        }
    }
}
