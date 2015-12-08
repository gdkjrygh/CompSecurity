// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.TextView;
import com.emilsjolander.components.stickylistheaders.StickyListHeadersAdapter;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.model.Friend;
import java.util.List;

public final class xA extends Fk
    implements OV.a, StickyListHeadersAdapter
{
    public static interface a
    {

        public abstract void a(List list);
    }

    public static final class b
    {

        TextView a;
        public Friend b;

        protected b()
        {
        }
    }

    static final class c
    {

        TextView a;

        private c()
        {
        }

        c(byte byte0)
        {
            this();
        }
    }


    protected LB a;
    private final Context b;
    private final LayoutInflater c;
    private List d;
    private final List e;
    private final Filter f;
    private final a g;

    public xA(Context context, List list, a a1)
    {
        super(context, 0x7f040044, list);
        SnapchatApplication.getDIComponent().a(this);
        b = context;
        c = (LayoutInflater)context.getSystemService("layout_inflater");
        d = list;
        e = list;
        f = new xC(e, a, this);
        g = a1;
    }

    public final void a(List list)
    {
        if (list == null)
        {
            d = e;
        } else
        {
            d = list;
        }
        g.a(d);
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        return d.size();
    }

    public final Filter getFilter()
    {
        return f;
    }

    public final long getHeaderId(int i)
    {
        Friend friend = (Friend)d.get(i);
        return (long)com.snapchat.android.model.Friend.a.a(com.snapchat.android.model.Friend.a.a(friend), friend, b).hashCode();
    }

    public final View getHeaderView(int i, View view, ViewGroup viewgroup)
    {
        Object obj;
        if (view == null)
        {
            c c1 = new c((byte)0);
            view = c.inflate(0x7f040057, viewgroup, false);
            c1.a = (TextView)view;
            c1.a.setTextColor(b.getResources().getColor(0x7f0c000a));
            view.setTag(c1);
            viewgroup = c1;
        } else
        {
            viewgroup = (c)view.getTag();
        }
        obj = (Friend)d.get(i);
        obj = com.snapchat.android.model.Friend.a.a(com.snapchat.android.model.Friend.a.a(((Friend) (obj))), obj, b);
        ((c) (viewgroup)).a.setText(((CharSequence) (obj)));
        return view;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        Friend friend;
        if (view == null)
        {
            view = c.inflate(0x7f040044, viewgroup, false);
            viewgroup = new b();
            viewgroup.a = (TextView)view.findViewById(0x7f0d01bd);
            view.setTag(viewgroup);
        } else
        {
            viewgroup = (b)view.getTag();
        }
        friend = (Friend)d.get(i);
        ((b) (viewgroup)).a.setText(friend.c());
        viewgroup.b = friend;
        return view;
    }
}
