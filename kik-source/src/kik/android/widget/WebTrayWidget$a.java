// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.kik.cache.av;
import java.util.List;

// Referenced classes of package kik.android.widget:
//            WebTrayWidget, ep, SquareNetworkedImageView

private final class b extends BaseAdapter
{
    private final class a
    {

        SquareNetworkedImageView a;
        TextView b;
        final WebTrayWidget.a c;

        private a()
        {
            c = WebTrayWidget.a.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    final WebTrayWidget a;
    private final List b;
    private android.widget.emClickListener c;

    public final android.widget.emClickListener a()
    {
        return c;
    }

    public final int getCount()
    {
        return b.size();
    }

    public final Object getItem(int i)
    {
        return b.get(i);
    }

    public final long getItemId(int i)
    {
        return 0L;
    }

    public final int getItemViewType(int i)
    {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        kik.android.b.et.a a2 = (kik.android.b.et.a.a)getItem(i);
        a a1;
        if (view == null)
        {
            view = WebTrayWidget.b(a).inflate(0x7f030022, viewgroup, false);
            a1 = new a((byte)0);
            a1.a = (SquareNetworkedImageView)view.findViewById(0x7f0e00c0);
            a1.b = (TextView)view.findViewById(0x7f0e00c1);
            view.setTag(a1);
        } else
        {
            a1 = (a)view.getTag();
        }
        if (a2 == null)
        {
            return new View(viewgroup.getContext());
        }
        viewgroup = av.a(a2.ext(), a1.a.getMeasuredWidth(), a1.a.getMeasuredHeight());
        a1.a.a(viewgroup, a.a);
        a1.b.setText(a2.t());
        if (a2.t() != null)
        {
            view.setContentDescription((new StringBuilder("AUTOMATION_WEB_TRAY_CARD_")).append(a2.().replace(" ", "_").toUpperCase()).toString());
        }
        return view;
    }

    public final int getViewTypeCount()
    {
        return 1;
    }

    a(WebTrayWidget webtraywidget, List list)
    {
        a = webtraywidget;
        super();
        c = new ep(this);
        b = list;
    }
}
