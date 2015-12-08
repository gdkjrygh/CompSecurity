// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.DataSetObserver;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

public class ftg extends BaseAdapter
{

    private final DataSetObserver a = new DataSetObserver() {

        private ftg a;

        public final void onChanged()
        {
            ftg.a(a);
        }

        public final void onInvalidated()
        {
            ftg.a(a);
        }

            
            {
                a = ftg.this;
                super();
            }
    };
    private final ArrayList b = new ArrayList();
    private final SparseArray c = new SparseArray();
    public final Context d;
    public ftq e;
    private int f;
    private int g;
    private fth h;

    public ftg(Context context)
    {
        g = 3;
        d = context;
        e = new ftr(d);
    }

    static void a(ftg ftg1)
    {
        ftg1.b();
    }

    private void b()
    {
        Iterator iterator = b.iterator();
        int i;
        int j;
        for (i = 0; iterator.hasNext(); i = j)
        {
            fth fth1 = (fth)iterator.next();
            fth1.e = i;
            j = i;
            if (fth1.d)
            {
                j = i + (fth1.a.getCount() + fth1.b() + fth1.c());
            }
            fth1.f = j;
        }

        f = i;
        h = null;
        i = g;
        iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            fth fth2 = (fth)iterator.next();
            if (fth2.g == -1)
            {
                fth2.g = i;
                i = fth2.a.getViewTypeCount() + i;
            }
        } while (true);
        g = i;
        notifyDataSetChanged();
    }

    private fth f(int i)
    {
        if (h != null && h.e <= i && i < h.f)
        {
            return h;
        }
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            fth fth1 = (fth)iterator.next();
            if (i < fth1.f)
            {
                h = fth1;
                return fth1;
            }
        }

        if (f == 0)
        {
            throw new IndexOutOfBoundsException("No section found, adapter is empty");
        } else
        {
            throw new IndexOutOfBoundsException((new StringBuilder("No section found for global position=")).append(i).append(", should be between 0 and ").append(f).toString());
        }
    }

    private fth g(int i)
    {
        fth fth1;
        boolean flag;
        if (i != 0x80000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ctz.a(flag, "Invalid section id: SECTION_ID_NONE");
        fth1 = (fth)c.get(i, null);
        ctz.a(fth1);
        return fth1;
    }

    public final int a(int i, int j)
    {
        return g(j).e(i);
    }

    public final transient void a()
    {
        Iterator iterator = b.iterator();
        boolean flag = false;
        while (iterator.hasNext()) 
        {
            fth fth1 = (fth)iterator.next();
            if (fth1.d)
            {
                flag = true;
            }
            fth1.d = false;
        }
        if (flag)
        {
            b();
        }
    }

    public final void a(int i, String s)
    {
        g(i).b = s;
        b();
    }

    public final void a(ListAdapter listadapter, int i, int j)
    {
        a(listadapter, i, j, null);
    }

    public final void a(ListAdapter listadapter, int i, int j, View view)
    {
        a(listadapter, d.getString(i), j, view);
    }

    public final void a(ListAdapter listadapter, String s, int i)
    {
        a(listadapter, s, i, null);
    }

    public final void a(ListAdapter listadapter, String s, int i, View view)
    {
        ctz.a(listadapter);
        if (i != 0x80000000)
        {
            boolean flag;
            if (c.get(i, null) == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            ctz.a(flag, "Section id %d is already in use!", new Object[] {
                Integer.valueOf(i)
            });
        }
        s = new fth(listadapter, s, i, view, (byte)0);
        b.size();
        b.add(s);
        if (i != 0x80000000)
        {
            c.put(i, s);
        }
        listadapter.registerDataSetObserver(a);
        b();
    }

    public final transient void a(int ai[])
    {
        int j = ai.length;
        int i = 0;
        boolean flag = false;
        for (; i < j; i++)
        {
            int k = ai[i];
            if (g(k).d)
            {
                flag = true;
            }
            g(k).d = false;
        }

        if (flag)
        {
            b();
        }
    }

    public final boolean a(int i)
    {
        return g(i).a();
    }

    public boolean areAllItemsEnabled()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext();)
        {
            fth fth1 = (fth)iterator.next();
            if (fth1.d && !fth1.a.areAllItemsEnabled())
            {
                return false;
            }
        }

        return true;
    }

    public final int b(int i)
    {
        fth fth1 = f(i);
        for (i = fth1.d(i); fth1.a(i) || fth1.b(i) || fth1.c(i);)
        {
            return 0x80000000;
        }

        return fth1.c;
    }

    public final transient void b(int ai[])
    {
        boolean flag = false;
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            int k = ai[i];
            if (!g(k).d)
            {
                flag = true;
            }
            g(k).d = true;
        }

        if (flag)
        {
            b();
        }
    }

    public final boolean c(int i)
    {
        return c.get(i, null) != null;
    }

    public final boolean d(int i)
    {
        fth fth1 = g(i);
        boolean flag1 = fth1.d;
        boolean flag;
        if (fth1.a.getCount() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fth1.d = flag;
        if (flag1 != fth1.d)
        {
            b();
        }
        return fth1.d;
    }

    public final int e(int i)
    {
        fth fth1 = g(i);
        ctz.b(fth1.d, "cannot get position of hidden section");
        return fth1.e;
    }

    public int getCount()
    {
        return f;
    }

    public Object getItem(int i)
    {
        fth fth1 = f(i);
        int j = fth1.d(i);
        if (fth1.a(j))
        {
            return fth1.b;
        }
        if (fth1.b(j))
        {
            return null;
        }
        if (fth1.c(j))
        {
            return fth1.i;
        } else
        {
            return fth1.a.getItem(fth1.e(i));
        }
    }

    public long getItemId(int i)
    {
        fth fth1 = f(i);
        int j = fth1.d(i);
        if (fth1.a(j))
        {
            return -1L;
        }
        if (fth1.b(j))
        {
            return -2L;
        }
        if (fth1.c(j))
        {
            return -3L;
        } else
        {
            i = fth1.e(i);
            return fth1.a.getItemId(i);
        }
    }

    public int getItemViewType(int i)
    {
        byte byte0 = -1;
        fth fth1 = f(i);
        int j = fth1.d(i);
        if (fth1.a(j))
        {
            i = 0;
        } else
        {
            if (fth1.b(j))
            {
                return 1;
            }
            if (fth1.c(j))
            {
                return 2;
            }
            i = fth1.e(i);
            j = fth1.a.getItemViewType(i);
            i = byte0;
            if (j != -1)
            {
                i = byte0;
                if (j != -2)
                {
                    return fth1.g + j;
                }
            }
        }
        return i;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj = f(i);
        int j = ((fth) (obj)).d(i);
        if (((fth) (obj)).a(j))
        {
            view = ((fth) (obj)).b.toUpperCase(Locale.getDefault());
            viewgroup = ((fth) (obj)).b;
            i = ((fth) (obj)).c;
            obj = e.a(i);
            e.a(i, ((com.spotify.android.paste.widget.SectionHeaderView) (obj)), view, viewgroup);
            return ((View) (obj));
        }
        if (((fth) (obj)).b(j))
        {
            return (View)ctz.a(null);
        }
        if (((fth) (obj)).c(j))
        {
            return (View)ctz.a(((fth) (obj)).i);
        } else
        {
            return (View)ctz.a(((fth) (obj)).a.getView(((fth) (obj)).e(i), view, viewgroup));
        }
    }

    public int getViewTypeCount()
    {
        return g;
    }

    public boolean hasStableIds()
    {
        return false;
    }

    public boolean isEmpty()
    {
        return f == 0;
    }

    public boolean isEnabled(int i)
    {
        fth fth1 = f(i);
        for (int j = fth1.d(i); fth1.a(j) || fth1.b(j) || fth1.c(j);)
        {
            return false;
        }

        return fth1.a.isEnabled(fth1.e(i));
    }
}
