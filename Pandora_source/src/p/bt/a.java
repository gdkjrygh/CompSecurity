// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bt;

import android.util.SparseArray;
import android.view.View;

public class a
{

    private SparseArray a[];
    private SparseArray b[];
    private int c;
    private SparseArray d;
    private SparseArray e;

    public a()
    {
    }

    static View a(SparseArray sparsearray, int i)
    {
        int k = sparsearray.size();
        if (k > 0)
        {
            for (int j = 0; j < k; j++)
            {
                int l = sparsearray.keyAt(j);
                View view = (View)sparsearray.get(l);
                if (l == i)
                {
                    return view;
                }
            }

            return (View)sparsearray.valueAt(k - 1);
        } else
        {
            return null;
        }
    }

    static View b(SparseArray sparsearray, int i)
    {
        int k = sparsearray.size();
        if (k > 0)
        {
            for (int j = 0; j < k; j++)
            {
                int l = sparsearray.keyAt(j);
                View view = (View)sparsearray.get(l);
                if (l == i)
                {
                    sparsearray.remove(l);
                    return view;
                }
            }

            i = k - 1;
            View view1 = (View)sparsearray.valueAt(i);
            sparsearray.remove(sparsearray.keyAt(i));
            return view1;
        } else
        {
            return null;
        }
    }

    public View a(int i, int j)
    {
        if (c == 1)
        {
            return a(d, i);
        }
        if (j >= 0 && j < a.length)
        {
            return a(a[j], i);
        } else
        {
            return null;
        }
    }

    public void a(int i)
    {
        if (i < 1)
        {
            throw new IllegalArgumentException("Can't have a viewTypeCount < 1");
        }
        SparseArray asparsearray[] = new SparseArray[i];
        SparseArray asparsearray1[] = new SparseArray[i];
        for (int j = 0; j < i; j++)
        {
            asparsearray[j] = new SparseArray();
            asparsearray1[j] = new SparseArray();
        }

        c = i;
        d = asparsearray[0];
        e = asparsearray1[0];
        a = asparsearray;
        b = asparsearray1;
    }

    public void a(View view, int i, int j)
    {
        if (c == 1)
        {
            d.put(i, view);
        } else
        {
            a[j].put(i, view);
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            view.setAccessibilityDelegate(null);
        }
    }

    public View b(int i, int j)
    {
        if (c == 1)
        {
            return b(e, i);
        }
        if (j >= 0 && j < b.length)
        {
            return b(b[j], i);
        } else
        {
            return null;
        }
    }

    public void b(View view, int i, int j)
    {
        if (c == 1)
        {
            d.put(i, null);
            e.put(i, view);
        } else
        {
            a[j].put(i, null);
            b[j].put(i, view);
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            view.setAccessibilityDelegate(null);
        }
    }
}
