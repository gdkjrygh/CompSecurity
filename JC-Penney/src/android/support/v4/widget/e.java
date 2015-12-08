// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

// Referenced classes of package android.support.v4.widget:
//            j, g, h, i

public abstract class e extends BaseAdapter
    implements j, Filterable
{

    protected boolean a;
    protected boolean b;
    protected Cursor c;
    protected Context d;
    protected int e;
    protected g f;
    protected DataSetObserver g;
    protected i h;
    protected FilterQueryProvider i;

    public e(Context context, Cursor cursor, boolean flag)
    {
        int k;
        if (flag)
        {
            k = 1;
        } else
        {
            k = 2;
        }
        a(context, cursor, k);
    }

    public Cursor a()
    {
        return c;
    }

    public Cursor a(CharSequence charsequence)
    {
        if (i != null)
        {
            return i.runQuery(charsequence);
        } else
        {
            return c;
        }
    }

    public abstract View a(Context context, Cursor cursor, ViewGroup viewgroup);

    void a(Context context, Cursor cursor, int k)
    {
        boolean flag = true;
        int l;
        if ((k & 1) == 1)
        {
            k |= 2;
            b = true;
        } else
        {
            b = false;
        }
        if (cursor == null)
        {
            flag = false;
        }
        c = cursor;
        a = flag;
        d = context;
        if (flag)
        {
            l = cursor.getColumnIndexOrThrow("_id");
        } else
        {
            l = -1;
        }
        e = l;
        if ((k & 2) == 2)
        {
            f = new g(this);
            g = new h(this, null);
        } else
        {
            f = null;
            g = null;
        }
        if (flag)
        {
            if (f != null)
            {
                cursor.registerContentObserver(f);
            }
            if (g != null)
            {
                cursor.registerDataSetObserver(g);
            }
        }
    }

    public void a(Cursor cursor)
    {
        cursor = b(cursor);
        if (cursor != null)
        {
            cursor.close();
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public Cursor b(Cursor cursor)
    {
        if (cursor == c)
        {
            return null;
        }
        Cursor cursor1 = c;
        if (cursor1 != null)
        {
            if (f != null)
            {
                cursor1.unregisterContentObserver(f);
            }
            if (g != null)
            {
                cursor1.unregisterDataSetObserver(g);
            }
        }
        c = cursor;
        if (cursor != null)
        {
            if (f != null)
            {
                cursor.registerContentObserver(f);
            }
            if (g != null)
            {
                cursor.registerDataSetObserver(g);
            }
            e = cursor.getColumnIndexOrThrow("_id");
            a = true;
            notifyDataSetChanged();
            return cursor1;
        } else
        {
            e = -1;
            a = false;
            notifyDataSetInvalidated();
            return cursor1;
        }
    }

    public View b(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return a(context, cursor, viewgroup);
    }

    protected void b()
    {
        if (b && c != null && !c.isClosed())
        {
            a = c.requery();
        }
    }

    public CharSequence c(Cursor cursor)
    {
        if (cursor == null)
        {
            return "";
        } else
        {
            return cursor.toString();
        }
    }

    public int getCount()
    {
        if (a && c != null)
        {
            return c.getCount();
        } else
        {
            return 0;
        }
    }

    public View getDropDownView(int k, View view, ViewGroup viewgroup)
    {
        if (a)
        {
            c.moveToPosition(k);
            View view1 = view;
            if (view == null)
            {
                view1 = b(d, c, viewgroup);
            }
            a(view1, d, c);
            return view1;
        } else
        {
            return null;
        }
    }

    public Filter getFilter()
    {
        if (h == null)
        {
            h = new i(this);
        }
        return h;
    }

    public Object getItem(int k)
    {
        if (a && c != null)
        {
            c.moveToPosition(k);
            return c;
        } else
        {
            return null;
        }
    }

    public long getItemId(int k)
    {
        long l1 = 0L;
        long l = l1;
        if (a)
        {
            l = l1;
            if (c != null)
            {
                l = l1;
                if (c.moveToPosition(k))
                {
                    l = c.getLong(e);
                }
            }
        }
        return l;
    }

    public View getView(int k, View view, ViewGroup viewgroup)
    {
        if (!a)
        {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!c.moveToPosition(k))
        {
            throw new IllegalStateException((new StringBuilder()).append("couldn't move cursor to position ").append(k).toString());
        }
        View view1 = view;
        if (view == null)
        {
            view1 = a(d, c, viewgroup);
        }
        a(view1, d, c);
        return view1;
    }

    public boolean hasStableIds()
    {
        return true;
    }
}
