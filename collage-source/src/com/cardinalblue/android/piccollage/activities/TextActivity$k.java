// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Context;
import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.cardinalblue.android.piccollage.model.gson.Font;
import com.cardinalblue.android.piccollage.view.m;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            TextActivity

private static class  extends ArrayAdapter
{

    int a(String s)
    {
        for (int i = 0; i < getCount(); i++)
        {
            if (((Font)getItem(i)).fontName.equals(s))
            {
                return i;
            }
        }

        return -1;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view != null)
        {
            view = (TextView)view;
        } else
        {
            view = (TextView)super.getView(i, view, viewgroup);
        }
        viewgroup = m.b(getContext(), ((Font)getItem(i)).fontName);
        if (viewgroup == null)
        {
            viewgroup = Typeface.DEFAULT;
        }
        view.setTypeface(viewgroup);
        view.setText(((Font)getItem(i)).displayName);
        return view;
    }

    public (Context context, int i, List list)
    {
        super(context, i, list);
    }
}
