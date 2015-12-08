// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;

final class dbs extends AsyncTask
{

    private final int a;
    private final coa b;
    private final int c;
    private final int d;
    private dbq e;

    public dbs(dbq dbq1, int i, coa coa1, int j, int k)
    {
        e = dbq1;
        super();
        a = i;
        b = (coa)b.a(coa1, "displayableFrame", null);
        c = b.a(j, "targetWidth", null);
        d = b.a(k, "targetHeight", null);
        boolean flag;
        if (j == 0 || k == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b.a(flag, "one of target width/height must be zero");
    }

    protected final Object doInBackground(Object aobj[])
    {
        return dbq.a(e).a(a, b, c, d);
    }

    protected final void onCancelled(Object obj)
    {
        obj = (csb)obj;
        if (obj != null)
        {
            ((csb) (obj)).b();
        }
        if (dbq.b(e) == this)
        {
            e.a(null, false);
            dbq.a(e, null);
        }
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (csb)obj;
        if (dbq.b(e) == this)
        {
            e.a(((csb) (obj)), true);
            dbq.a(e, null);
        }
    }
}
