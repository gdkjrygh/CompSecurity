// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

public abstract class os extends BaseAdapter
    implements Filterable, ou
{

    public Cursor a;
    public Context b;
    private boolean c;
    private int d;
    private ot e;

    public os(Context context)
    {
        a = null;
        c = false;
        b = context;
        d = -1;
    }

    public final Cursor a()
    {
        return a;
    }

    public Cursor a(CharSequence charsequence)
    {
        return a;
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

    public abstract void a(View view, Context context, Cursor cursor);

    public final Cursor b(Cursor cursor)
    {
        if (cursor == a)
        {
            return null;
        }
        Cursor cursor1 = a;
        a = cursor;
        if (cursor != null)
        {
            d = cursor.getColumnIndexOrThrow("_id");
            c = true;
            notifyDataSetChanged();
            return cursor1;
        } else
        {
            d = -1;
            c = false;
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
        if (c && a != null)
        {
            return a.getCount();
        } else
        {
            return 0;
        }
    }

    public View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        if (c)
        {
            a.moveToPosition(i);
            View view1 = view;
            if (view == null)
            {
                view1 = b(b, a, viewgroup);
            }
            a(view1, b, a);
            return view1;
        } else
        {
            return null;
        }
    }

    public Filter getFilter()
    {
        if (e == null)
        {
            e = new ot(this);
        }
        return e;
    }

    public Object getItem(int i)
    {
        if (c && a != null)
        {
            a.moveToPosition(i);
            return a;
        } else
        {
            return null;
        }
    }

    public long getItemId(int i)
    {
        long l1 = 0L;
        long l = l1;
        if (c)
        {
            l = l1;
            if (a != null)
            {
                l = l1;
                if (a.moveToPosition(i))
                {
                    l = a.getLong(d);
                }
            }
        }
        return l;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (!c)
        {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!a.moveToPosition(i))
        {
            throw new IllegalStateException((new StringBuilder("couldn't move cursor to position ")).append(i).toString());
        }
        View view1 = view;
        if (view == null)
        {
            view1 = a(b, a, viewgroup);
        }
        a(view1, b, a);
        return view1;
    }

    public boolean hasStableIds()
    {
        return true;
    }
}
