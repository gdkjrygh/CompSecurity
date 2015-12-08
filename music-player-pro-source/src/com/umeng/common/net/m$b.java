// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.net;

import android.os.AsyncTask;

// Referenced classes of package com.umeng.common.net:
//            m, n

private class c extends AsyncTask
{

    final m a;
    private n b;
    private a c;

    protected transient c a(Integer ainteger[])
    {
        return a.a(b);
    }

    protected void a(b b1)
    {
        if (c != null)
        {
            c.a(b1);
        }
    }

    protected transient Object doInBackground(Object aobj[])
    {
        return a((Integer[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((a)obj);
    }

    protected void onPreExecute()
    {
        if (c != null)
        {
            c.a();
        }
    }

    public (m m1, n n,  )
    {
        a = m1;
        super();
        b = n;
        c = ;
    }
}
