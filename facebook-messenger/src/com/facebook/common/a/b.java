// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.a;

import android.os.AsyncTask;

// Referenced classes of package com.facebook.common.a:
//            a

class b extends AsyncTask
{

    final Runnable a;
    final a b;

    b(a a1, Runnable runnable)
    {
        b = a1;
        a = runnable;
        super();
    }

    protected transient Void a(Void avoid[])
    {
        a.run();
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }
}
