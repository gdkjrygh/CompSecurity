// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

final class bqx extends AsyncTask
{

    private bqa a;

    bqx(bqa bqa1)
    {
        a = bqa1;
        super();
    }

    protected final Object doInBackground(Object aobj[])
    {
        aobj = Collections.unmodifiableList(((cqf[])aobj)[0].b);
        Iterator iterator = ((List) (aobj)).iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            cnq cnq2 = (cnq)iterator.next();
            if (cnq2.d == cnt.c && !ckn.b(cnq2.e.b, bqa.v(a)))
            {
                i++;
            }
        } while (true);
        if (i != 0)
        {
            aobj = ((List) (aobj)).iterator();
            do
            {
                if (!((Iterator) (aobj)).hasNext())
                {
                    break;
                }
                cnq cnq1 = (cnq)((Iterator) (aobj)).next();
                if (isCancelled())
                {
                    break;
                }
                if (cnq1.d == cnt.c && !ckn.b(cnq1.e.b, bqa.v(a)))
                {
                    ckn.a(cnq1.e.b, bqa.w(a), bqa.v(a));
                }
            } while (true);
        }
        return null;
    }

    protected final void onPostExecute(Object obj)
    {
        if (a.c.c.d)
        {
            bqa.f(a);
        }
        bqa.a(a, null);
    }
}
