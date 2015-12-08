// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class hay extends AsyncTask
{

    private final int a;
    private hae b;

    public hay(hae hae1, int i)
    {
        b = hae1;
        super();
        a = i;
    }

    private transient List a(Integer ainteger[])
    {
        int i = 0;
        ArrayList arraylist;
        int j;
        j = ainteger[0].intValue();
        arraylist = new ArrayList(j);
_L2:
        ainteger = arraylist;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ainteger = arraylist;
        if (isCancelled())
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(hae.a(b).b(hae.g(b), a));
        i++;
        if (true) goto _L2; else goto _L1
        ainteger;
        if (Log.isLoggable("PrimeRecyclerPool", 6))
        {
            Log.e("PrimeRecyclerPool", "Exception priming recycler pool", ainteger);
        }
        ainteger = null;
_L1:
        return ainteger;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a((Integer[])aobj);
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (List)obj;
        if (obj != null)
        {
            afn afn1;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((RecyclerView) (hae.g(b))).a.c().a(afn1))
            {
                afn1 = (afn)((Iterator) (obj)).next();
            }

        }
        hae.p(b).remove(this);
    }
}
