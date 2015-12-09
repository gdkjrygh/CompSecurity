// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.fitbit.galileo.GalileoTracker;
import java.util.Iterator;

// Referenced classes of package com.fitbit.galileo.ui:
//            TrackerView, TrackerView_

public class c extends com.fitbit.ui.a.c
{

    protected Context a;

    public c()
    {
    }

    private void a(TrackerView trackerview, int i)
    {
        trackerview.a((GalileoTracker)getItem(i));
    }

    public void a(GalileoTracker galileotracker)
    {
        for (Iterator iterator = iterator(); iterator.hasNext();)
        {
            GalileoTracker galileotracker1 = (GalileoTracker)iterator.next();
            if (galileotracker1.equals(galileotracker))
            {
                galileotracker1.a(galileotracker.b());
                notifyDataSetChanged();
                return;
            }
        }

        add(galileotracker);
        notifyDataSetChanged();
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = TrackerView_.a(a);
            a(view, i);
            return view;
        }
        View view1;
        if (!(view instanceof TrackerView))
        {
            view = TrackerView_.a(a);
            view1 = view;
            viewgroup = view;
        } else
        {
            viewgroup = (TrackerView)view;
            view1 = view;
        }
        a(viewgroup, i);
        return view1;
    }

    public int getViewTypeCount()
    {
        return 1;
    }
}
