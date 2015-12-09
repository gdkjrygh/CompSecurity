// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.android.paste.widget.SectionHeaderView;
import java.util.Locale;

public final class ftb extends BaseAdapter
{

    public boolean a;
    private os b;
    private Context c;
    private int d;
    private DataSetObserver e;

    public ftb(Context context, os os1, int i)
    {
        e = new DataSetObserver() {

            private ftb a;

            public final void onChanged()
            {
                a.notifyDataSetChanged();
            }

            public final void onInvalidated()
            {
                a.notifyDataSetInvalidated();
            }

            
            {
                a = ftb.this;
                super();
            }
        };
        c = context;
        b = os1;
        d = i;
        b.registerDataSetObserver(e);
        a = false;
    }

    private String a(int i)
    {
        String s1 = gcw.a((Cursor)getItem(i), d, "#").substring(0, 1).toUpperCase(Locale.getDefault());
        String s = s1;
        if (!Character.isLetter(s1.charAt(0)))
        {
            s = "#";
        }
        return s;
    }

    public final int getCount()
    {
        return b.getCount();
    }

    public final Object getItem(int i)
    {
        return b.getItem(i);
    }

    public final long getItemId(int i)
    {
        return b.getItemId(i);
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        Object obj;
        View view1;
        String s;
        boolean flag;
        if (!(view instanceof LinearLayout))
        {
            view = new LinearLayout(c);
            view.setOrientation(1);
        } else
        {
            view = (LinearLayout)view;
        }
        obj = "";
        if (i > 0)
        {
            obj = a(i - 1);
        }
        s = a(i);
        flag = ((String) (obj)).equals(s);
        view1 = view.findViewById(0x7f110057);
        if (!flag && !a)
        {
            obj = view1;
            if (view1 == null)
            {
                obj = new SectionHeaderView(c);
                ((View) (obj)).setBackgroundColor(dgo.b(c, 0x1010054));
                ((View) (obj)).setId(0x7f110057);
                view.addView(((View) (obj)));
            }
            ((View) (obj)).setVisibility(0);
            ((TextView)((View) (obj)).findViewById(0x7f11026e)).setText(s);
        } else
        if ((flag || a) && view1 != null)
        {
            view1.setVisibility(8);
        }
        obj = view.findViewById(0x7f110056);
        if (obj == null)
        {
            viewgroup = b.getView(i, null, viewgroup);
            viewgroup.setId(0x7f110056);
            view.addView(viewgroup);
            view.setTag(viewgroup.getTag());
            view.setTag(0x7f110041, viewgroup.getTag(0x7f110041));
            return view;
        } else
        {
            view.removeView(((View) (obj)));
            viewgroup = b.getView(i, ((View) (obj)), viewgroup);
            view.addView(viewgroup);
            view.setTag(viewgroup.getTag());
            view.setTag(0x7f110041, viewgroup.getTag(0x7f110041));
            return view;
        }
    }
}
