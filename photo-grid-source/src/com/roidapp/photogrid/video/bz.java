// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.roidapp.baselib.view.t;

// Referenced classes of package com.roidapp.photogrid.video:
//            bp

final class bz extends t
{

    final bp a;

    public bz(bp bp, Context context)
    {
        a = bp;
        super(context, 1);
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        view = super.getView(i, view, viewgroup);
        if (!isEnabled(i) && (view instanceof TextView))
        {
            viewgroup = ((TextView)view).getTextColors();
            if (viewgroup != null)
            {
                ((TextView)view).setTextColor(viewgroup.withAlpha(70));
            }
        }
        return view;
    }

    public final boolean isEnabled(int i)
    {
        return true;
    }
}
