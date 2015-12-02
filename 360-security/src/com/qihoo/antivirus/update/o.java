// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;

import android.os.AsyncTask;

// Referenced classes of package com.qihoo.antivirus.update:
//            n, d, ab

class o extends AsyncTask
{

    private final d a;

    public o(d d1)
    {
        a = d1;
    }

    protected transient ab a(Void avoid[])
    {
        avoid = new n(a, 1);
        if (!avoid.a(null))
        {
            return avoid;
        } else
        {
            return null;
        }
    }

    protected void a(ab ab1)
    {
        if (ab1 == null)
        {
            a.h();
            return;
        } else
        {
            a.a(ab1);
            return;
        }
    }

    protected transient void a(Integer ainteger[])
    {
    }

    protected transient Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onCancelled()
    {
        super.onCancelled();
    }

    protected void onPostExecute(Object obj)
    {
        a((ab)obj);
    }

    protected transient void onProgressUpdate(Object aobj[])
    {
        a((Integer[])aobj);
    }
}
