// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cn;

import android.os.AsyncTask;

// Referenced classes of package p.cn:
//            c

public class a extends AsyncTask
{

    public a()
    {
    }

    protected transient Void a(Object aobj[])
    {
        String s = (String)aobj[0];
        aobj = (d.a[])(d.a[])aobj[1];
        if (aobj != null)
        {
            c.a().a(s, ((d.a []) (aobj)));
        }
        return null;
    }

    protected Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }
}
