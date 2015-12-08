// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.moviemaker.ui.ThemeItemView;
import com.google.android.apps.moviemaker.ui.ThemeSelectorView;
import java.util.List;

public final class dbn extends md
{

    private final List b;
    private ThemeSelectorView c;

    public dbn(ThemeSelectorView themeselectorview, List list)
    {
        c = themeselectorview;
        super();
        b = list;
    }

    public final Object a(ViewGroup viewgroup, int i)
    {
        View view = ((LayoutInflater)c.getContext().getSystemService("layout_inflater")).inflate(c.Q, viewgroup, false);
        ThemeItemView themeitemview = (ThemeItemView)view.findViewById(b.gY);
        themeitemview.setText(((cyy)b.get(i)).m);
        themeitemview.setBackgroundColor(c.getResources().getColor(((cyy)b.get(i)).o));
        themeitemview.setTag(Integer.valueOf(i));
        viewgroup.addView(view);
        return view;
    }

    public final void a(ViewGroup viewgroup, int i, Object obj)
    {
        viewgroup.removeView((View)obj);
    }

    public final boolean a(View view, Object obj)
    {
        return view == obj;
    }

    public final int b()
    {
        return b.size();
    }
}
