// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.google.android.apps.translate.o;
import com.google.android.apps.translate.widget.ToggleImage;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            ap

public final class ao extends ArrayAdapter
{

    private final LayoutInflater a;

    public ao(Context context)
    {
        super(context, o.input_mode_spinner_item);
        setDropDownViewResource(0x1090009);
        a = LayoutInflater.from(context);
    }

    public final ap a(int i, int j, boolean flag)
    {
        ap ap1 = new ap(getContext().getString(i), i, j, flag);
        add(ap1);
        return ap1;
    }

    public final long getItemId(int i)
    {
        return (long)((ap)getItem(i)).a;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        if (view != null)
        {
            view = (ToggleImage)view;
        } else
        {
            view = (ToggleImage)a.inflate(o.input_mode_spinner_item, viewgroup, false);
        }
        viewgroup = (ap)getItem(i);
        view.setLevel(((ap) (viewgroup)).b);
        view.setChecked(((ap) (viewgroup)).c);
        return view;
    }
}
