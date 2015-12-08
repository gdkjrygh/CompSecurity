// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;

// Referenced classes of package android.support.v4.widget:
//            f

public abstract class e extends BaseAdapter
    implements f.a, Filterable
{
    private final class a extends ContentObserver
    {

        final e a;

        public final boolean deliverSelfNotifications()
        {
            return true;
        }

        public final void onChange(boolean flag)
        {
            a.b();
        }

        public a()
        {
            a = e.this;
            super(new Handler());
        }
    }

    private final class b extends DataSetObserver
    {

        final e a;

        public final void onChanged()
        {
            a.a = true;
            a.notifyDataSetChanged();
        }

        public final void onInvalidated()
        {
            a.a = false;
            a.notifyDataSetInvalidated();
        }

        private b()
        {
            a = e.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }


    protected boolean a;
    protected boolean b;
    protected Cursor c;
    protected Context d;
    protected int e;
    protected a f;
    protected DataSetObserver g;
    protected f h;
    protected FilterQueryProvider i;

    public e(Context context)
    {
        b = true;
        c = null;
        a = false;
        d = context;
        e = -1;
        f = new a();
        g = new b((byte)0);
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
        if (cursor == c)
        {
            cursor = null;
        } else
        {
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
                cursor = cursor1;
            } else
            {
                e = -1;
                a = false;
                notifyDataSetInvalidated();
                cursor = cursor1;
            }
        }
        if (cursor != null)
        {
            cursor.close();
        }
    }

    public abstract void a(View view, Cursor cursor);

    public View b(Context context, Cursor cursor, ViewGroup viewgroup)
    {
        return a(context, cursor, viewgroup);
    }

    public CharSequence b(Cursor cursor)
    {
        if (cursor == null)
        {
            return "";
        } else
        {
            return cursor.toString();
        }
    }

    protected final void b()
    {
        if (b && c != null && !c.isClosed())
        {
            a = c.requery();
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
            if (view == null)
            {
                view = b(d, c, viewgroup);
            }
            a(view, c);
            return view;
        } else
        {
            return null;
        }
    }

    public Filter getFilter()
    {
        if (h == null)
        {
            h = new f(this);
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
        if (view == null)
        {
            view = a(d, c, viewgroup);
        }
        a(view, c);
        return view;
    }

    public boolean hasStableIds()
    {
        return true;
    }
}
