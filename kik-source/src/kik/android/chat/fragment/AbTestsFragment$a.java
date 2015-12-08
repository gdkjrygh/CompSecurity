// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import kik.a.a.c;
import kik.android.util.cq;

// Referenced classes of package kik.android.chat.fragment:
//            AbTestsFragment

private final class b extends BaseAdapter
{

    final AbTestsFragment a;
    private final LayoutInflater b;

    public final int getCount()
    {
        return 1;
    }

    public final Object getItem(int i)
    {
        return null;
    }

    public final long getItemId(int i)
    {
        return 0L;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1;
        if (view == null)
        {
            view1 = b.inflate(0x7f030088, viewgroup, false);
            view = new <init>(a, (byte)0);
            view.a = (TextView)view1.findViewById(0x1020016);
            view.b = (TextView)view1.findViewById(0x1020010);
            viewgroup = view;
        } else
        {
            viewgroup = (b)view.getTag();
            view1 = view;
        }
        ((b) (viewgroup)).a.setText("Force refetch");
        ((a) (viewgroup)).b.setText(cq.a(a.a.a(), false).a);
        view1.setTag(viewgroup);
        return view1;
    }

    public (AbTestsFragment abtestsfragment, Context context)
    {
        a = abtestsfragment;
        super();
        b = LayoutInflater.from(context);
    }
}
