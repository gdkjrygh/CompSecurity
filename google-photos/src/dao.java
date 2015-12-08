// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

final class dao extends BaseAdapter
{

    private dam a;

    dao(dam dam1)
    {
        a = dam1;
        super();
    }

    private TextView a(int i, int j)
    {
        TextView textview = (TextView)LayoutInflater.from(dam.c(a)).inflate(i, null);
        textview.setText(a(j));
        return textview;
    }

    private String a(int i)
    {
        return dam.c(a).getString(dam.c()[i].b.intValue());
    }

    public final int getCount()
    {
        return dam.c().length;
    }

    public final View getDropDownView(int i, View view, ViewGroup viewgroup)
    {
        return a(c.I, i);
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
        return a(c.J, i);
    }
}
