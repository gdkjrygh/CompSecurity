// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.details.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.accuweather.android.details.viewbuilders.ImageLabelViewBuilder;
import com.accuweather.android.enums.LayoutStyleType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class QuickView extends LinearLayout
{

    protected List names;

    public QuickView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        names = new ArrayList();
    }

    public void setForecastData(Object obj, Integer integer, Context context, LayoutStyleType layoutstyletype, int i)
    {
        Iterator iterator = names.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            android.view.View view = ((ImageLabelViewBuilder)iterator.next()).getView(obj, integer, context, layoutstyletype, i);
            if (view != null)
            {
                addView(view);
            }
        } while (true);
    }
}
