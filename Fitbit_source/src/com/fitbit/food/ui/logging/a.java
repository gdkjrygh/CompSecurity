// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.fitbit.data.domain.h;
import java.util.List;

public class com.fitbit.food.ui.logging.a extends ArrayAdapter
{
    public class a
    {

        final com.fitbit.food.ui.logging.a a;
        private final h b;

        public String toString()
        {
            if (com.fitbit.food.ui.logging.a.a(a))
            {
                return b.b();
            } else
            {
                return b.a();
            }
        }

        public a(h h1)
        {
            a = com.fitbit.food.ui.logging.a.this;
            super();
            b = h1;
        }
    }


    private boolean a;
    private boolean b;

    public com.fitbit.food.ui.logging.a(Context context, int i)
    {
        super(context, i);
        b = false;
    }

    public com.fitbit.food.ui.logging.a(Context context, int i, int j)
    {
        super(context, i, j);
        b = false;
    }

    public com.fitbit.food.ui.logging.a(Context context, int i, int j, List list)
    {
        super(context, i, j, list);
        b = false;
    }

    public com.fitbit.food.ui.logging.a(Context context, int i, int j, a aa[])
    {
        super(context, i, j, aa);
        b = false;
    }

    public com.fitbit.food.ui.logging.a(Context context, int i, List list)
    {
        super(context, i, list);
        b = false;
    }

    public com.fitbit.food.ui.logging.a(Context context, int i, a aa[])
    {
        super(context, i, aa);
        b = false;
    }

    static boolean a(com.fitbit.food.ui.logging.a a1)
    {
        return a1.a;
    }

    public void a()
    {
        a = true;
        notifyDataSetChanged();
    }

    public void a(h h)
    {
        super.add(new a(h));
    }

    public void a(boolean flag)
    {
        b = flag;
        notifyDataSetChanged();
    }

    public void b()
    {
        a = false;
        notifyDataSetChanged();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        viewgroup = (TextView)super.getView(i, view, viewgroup);
        view = viewgroup;
        if (viewgroup == null)
        {
            view = (TextView)LayoutInflater.from(getContext()).inflate(0x7f0401a4, null);
        }
        if (b)
        {
            view.setTextColor(getContext().getResources().getColor(0x7f0f0029));
        }
        return view;
    }
}
