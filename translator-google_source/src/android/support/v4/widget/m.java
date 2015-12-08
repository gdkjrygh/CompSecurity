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
//            q, n, o, p

public abstract class m extends BaseAdapter
    implements q, Filterable
{

    public boolean a;
    public boolean b;
    public Cursor c;
    public Context d;
    public int e;
    public n f;
    public DataSetObserver g;
    public p h;
    public FilterQueryProvider i;

    public m(Context context)
    {
        a(context, 1);
    }

    public m(Context context, byte byte0)
    {
        a(context, 0);
    }

    private void a(Context context, int j)
    {
        if ((j & 1) == 1)
        {
            j |= 2;
            b = true;
        } else
        {
            b = false;
        }
        c = null;
        a = false;
        d = context;
        e = -1;
        if ((j & 2) == 2)
        {
            f = new n(this);
            g = new o(this);
            return;
        } else
        {
            f = null;
            g = null;
            return;
        }
    }

    public final Cursor a()
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

    public void a(Cursor cursor)
    {
        cursor = b(cursor);
        if (cursor != null)
        {
            cursor.close();
        }
    }

    public abstract void a(View view, Cursor cursor);

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

    public View getDropDownView(int j, View view, ViewGroup viewgroup)
    {
        if (a)
        {
            c.moveToPosition(j);
            View view1 = view;
            if (view == null)
            {
                view1 = b(d, c, viewgroup);
            }
            a(view1, c);
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
            h = new p(this);
        }
        return h;
    }

    public Object getItem(int j)
    {
        if (a && c != null)
        {
            c.moveToPosition(j);
            return c;
        } else
        {
            return null;
        }
    }

    public long getItemId(int j)
    {
        long l1 = 0L;
        long l = l1;
        if (a)
        {
            l = l1;
            if (c != null)
            {
                l = l1;
                if (c.moveToPosition(j))
                {
                    l = c.getLong(e);
                }
            }
        }
        return l;
    }

    public View getView(int j, View view, ViewGroup viewgroup)
    {
        if (!a)
        {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!c.moveToPosition(j))
        {
            throw new IllegalStateException((new StringBuilder("couldn't move cursor to position ")).append(j).toString());
        }
        View view1 = view;
        if (view == null)
        {
            view1 = a(d, c, viewgroup);
        }
        a(view1, c);
        return view1;
    }

    public boolean hasStableIds()
    {
        return true;
    }
}
