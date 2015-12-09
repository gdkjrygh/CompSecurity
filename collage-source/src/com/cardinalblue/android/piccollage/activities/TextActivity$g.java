// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.cardinalblue.android.piccollage.model.gson.ColorOption;
import com.cardinalblue.android.piccollage.view.CheckableImageView;
import java.util.List;

// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            TextActivity

private static class  extends ArrayAdapter
{

    private int a;

    public int a(ColorOption coloroption)
    {
        for (int i = 0; i < getCount(); i++)
        {
            if (((ColorOption)getItem(i)).equals(coloroption))
            {
                return i;
            }
        }

        return -1;
    }

    public void a(int i)
    {
        a = i;
    }

    public int getPosition(Object obj)
    {
        return a((ColorOption)obj);
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        boolean flag = false;
        int j = ((ColorOption)getItem(i)).getColor();
        if (view == null)
        {
            view = (CheckableImageView)LayoutInflater.from(getContext()).inflate(0x7f0300f4, viewgroup, false);
        } else
        {
            view = (CheckableImageView)view;
        }
        if (a == i)
        {
            flag = true;
        }
        view.setChecked(flag);
        if (j == 0)
        {
            view.setImageResource(0x7f02012c);
            return view;
        } else
        {
            view.setImageDrawable(new ColorDrawable(j));
            return view;
        }
    }

    public (Context context, int i, List list)
    {
        super(context, i, list);
    }
}
