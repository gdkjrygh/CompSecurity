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
import java.util.ArrayList;
import java.util.List;
import kik.a.a.b;

// Referenced classes of package kik.android.chat.fragment:
//            AbTestsFragment

private final class b extends BaseAdapter
{

    final AbTestsFragment a;
    private final LayoutInflater b;

    private b a(int i)
    {
        ArrayList arraylist = AbTestsFragment.e(a);
        if (i >= 0 && i < arraylist.size())
        {
            return (b)arraylist.get(i);
        } else
        {
            return null;
        }
    }

    public final int getCount()
    {
        return AbTestsFragment.e(a).size();
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        return 0L;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        b b1;
        if (view == null)
        {
            view = b.inflate(0x7f030088, viewgroup, false);
            viewgroup = new <init>(a, (byte)0);
            viewgroup.a = (TextView)view.findViewById(0x1020016);
            viewgroup.b = (TextView)view.findViewById(0x1020010);
        } else
        {
            viewgroup = (b)view.getTag();
        }
        b1 = a(i);
        ((a) (viewgroup)).a.setText(b1.a());
        ((a) (viewgroup)).b.setText(String.format("%s variants", new Object[] {
            Integer.valueOf(b1.b().length)
        }));
        view.setTag(viewgroup);
        return view;
    }

    public (AbTestsFragment abtestsfragment, Context context)
    {
        a = abtestsfragment;
        super();
        b = LayoutInflater.from(context);
    }
}
