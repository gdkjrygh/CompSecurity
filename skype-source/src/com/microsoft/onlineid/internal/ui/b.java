// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.internal.ui;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.microsoft.onlineid.internal.n;
import com.microsoft.onlineid.ui.a;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class b extends a
{

    protected final Set a;
    protected final Context b;
    protected final n c;
    private final int f;
    private final int g;
    private final int h;

    public b()
    {
        a = new HashSet();
        b = null;
        c = null;
        f = 0;
        g = 0;
        h = 0;
    }

    public b(Activity activity)
    {
        a = new HashSet();
        b = activity.getApplicationContext();
        c = new n(b);
        f = c.d("imageUserTile");
        g = c.d("textFirstLast");
        h = c.d("textEmail");
    }

    protected final void a()
    {
        super.a();
        a.clear();
    }

    public final long getItemId(int i)
    {
        return (long)((com.microsoft.onlineid.sts.b)e.get(i)).hashCode();
    }

    public final int getItemViewType(int i)
    {
        return 0;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        com.microsoft.onlineid.sts.b b1 = (com.microsoft.onlineid.sts.b)e.get(i);
        View view1 = view;
        if (view == null)
        {
            i = c.c("account_picker_tile");
            view1 = ((LayoutInflater)viewgroup.getContext().getSystemService("layout_inflater")).inflate(i, null);
        }
        view = (ImageView)view1.findViewById(f);
        viewgroup = (TextView)view1.findViewById(g);
        ((TextView)view1.findViewById(h)).setText(b1.c());
        if (viewgroup != null)
        {
            viewgroup.setText(b1.f());
        }
        (new com.microsoft.onlineid.internal.d.a(b, b1, view)).execute(new Void[0]);
        return view1;
    }

    public final int getViewTypeCount()
    {
        return 1;
    }
}
