// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.os.Handler;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

public class das
    implements dae
{

    public final List a = new ArrayList();
    public Map b;
    private final Context c;
    private final List d = new CopyOnWriteArrayList();
    private final dau e;
    private final Handler f = new Handler();
    private final Runnable g = new dat(this);
    private int h;
    private boolean i;

    public das(Context context, dau dau1)
    {
        h = -1;
        i = false;
        c = (Context)b.a(context, "context", null);
        e = (dau)b.a(dau1, "viewConfigurer", null);
    }

    static void a(das das1)
    {
        das1.a();
    }

    private int b()
    {
        return c() + 1;
    }

    public static boolean b(long l)
    {
        return l == 0x80000000L;
    }

    private int c()
    {
        return (a.size() + 1 + d()) - 1;
    }

    public static boolean c(long l)
    {
        return l == 0x80000001L;
    }

    private int d()
    {
        return h != -1 ? 1 : 0;
    }

    public static boolean d(long l)
    {
        return l != 0x80000000L && l != 0x80000001L && l != 0x80000002L && l != 0x80000003L;
    }

    private int f(int j)
    {
        b.a(j, "clipIndex", 0, a.size());
        if (j < 0)
        {
            return j;
        }
        int k = j + 1;
        j = k;
        if (h != -1)
        {
            j = k;
            if (k >= h)
            {
                j = k + 1;
            }
        }
        return j;
    }

    public final int a(long l)
    {
        int j = 0;
        if (l == 0x80000000L)
        {
            j = h;
        } else
        {
            if (l == 0x80000001L)
            {
                return -1;
            }
            if (l != 0x80000002L)
            {
                if (l == 0x80000003L)
                {
                    return b();
                }
                int i1 = a.size();
                for (int k = 0; k < i1; k++)
                {
                    if ((long)((cnq)a.get(k)).b == l)
                    {
                        return f(k);
                    }
                }

                return -1;
            }
        }
        return j;
    }

    public final int a(cnq cnq1)
    {
        for (int j = 0; j < a.size(); j++)
        {
            if (((cnq)a.get(j)).b == cnq1.b)
            {
                return j;
            }
        }

        return -1;
    }

    public void a()
    {
        f.removeCallbacks(g);
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((DataSetObserver)iterator.next()).onChanged()) { }
    }

    public final void a(SparseArray sparsearray)
    {
        if (sparsearray.size() == 0)
        {
            return;
        }
        for (int j = sparsearray.size() - 1; j >= 0; j--)
        {
            a.remove(sparsearray.keyAt(j));
        }

        a();
    }

    public final boolean a(int j)
    {
        return j > 0 && j != h && j <= c();
    }

    public final int b(cnq cnq1)
    {
        int j = a(cnq1);
        if (j < 0)
        {
            return j;
        } else
        {
            return f(j);
        }
    }

    public final boolean b(int j)
    {
        return j == -1;
    }

    public final int c(int j)
    {
        b.a(j, "position", 1, c());
        b.a(j, "position", h);
        if (j > h)
        {
            return j - 1 - d();
        } else
        {
            return j - 1;
        }
    }

    public final cnq d(int j)
    {
        b.a(a(j), "getClipFromViewPosition called with non-clip position");
        return (cnq)a.get(c(j));
    }

    public void e(int j)
    {
        if (j != -1)
        {
            b.a(j, "newPos", 1, a.size() + 1);
        }
        if (j != h)
        {
            h = j;
            f.removeCallbacks(g);
            f.postDelayed(g, 200L);
        }
    }

    public int getCount()
    {
        return a.size() + 2 + d();
    }

    public Object getItem(int j)
    {
        return null;
    }

    public long getItemId(int j)
    {
        b.a(j, "position", 0, getCount() - 1);
        if (j == h)
        {
            return 0x80000000L;
        }
        if (j == -1)
        {
            return 0x80000001L;
        }
        if (j == 0)
        {
            return 0x80000002L;
        }
        if (j == b())
        {
            return 0x80000003L;
        } else
        {
            return (long)((cnq)a.get(c(j))).b;
        }
    }

    public int getItemViewType(int j)
    {
        if (j == h)
        {
            return 1;
        }
        if (j == -1)
        {
            return 2;
        }
        if (j == 0)
        {
            return 3;
        }
        return j != b() ? 0 : 4;
    }

    public View getView(int j, View view, ViewGroup viewgroup)
    {
        long l;
        b.a(j, "invalid position", 0, getCount() - 1);
        l = getItemId(j);
        if (d(l))
        {
            break MISSING_BLOCK_LABEL_128;
        }
        if (view instanceof dar)
        {
            view = (dar)view;
        } else
        {
            view = new dar(c);
        }
        if (l != 0x80000000L) goto _L2; else goto _L1
_L1:
        e.a(view);
_L4:
        return view;
_L2:
        if (l == 0x80000001L)
        {
            e.b(view);
            return view;
        }
        if (l != 0x80000002L && l != 0x80000003L) goto _L4; else goto _L3
_L3:
        e.c(view);
        return view;
        int k = c(j);
        if (view == null || view.getId() != b.gS) goto _L6; else goto _L5
_L5:
        viewgroup = (cnq)a.get(k);
        e.a(j, view, (cnz)b.get(((cnq) (viewgroup)).e), viewgroup);
        return view;
_L6:
        viewgroup = ((LayoutInflater)c.getSystemService("layout_inflater")).inflate(c.N, null);
        dbq dbq1 = (dbq)viewgroup.findViewById(b.hn);
        android.graphics.drawable.Drawable drawable = c.getResources().getDrawable(b.fr);
        view = viewgroup;
        if (drawable != dbq1.k)
        {
            dbq1.k = drawable;
            view = viewgroup;
            if (dbq1.j)
            {
                dbq1.invalidate();
                view = viewgroup;
            }
        }
        if (true) goto _L5; else goto _L7
_L7:
    }

    public int getViewTypeCount()
    {
        return 5;
    }

    public boolean hasStableIds()
    {
        return true;
    }

    public boolean isEmpty()
    {
        return false;
    }

    public void registerDataSetObserver(DataSetObserver datasetobserver)
    {
        d.add(datasetobserver);
    }

    public void unregisterDataSetObserver(DataSetObserver datasetobserver)
    {
        d.remove(datasetobserver);
    }

    static 
    {
        das.getSimpleName();
    }
}
