// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.jcp.adapters:
//            aw

public class ax
{

    final aw a;
    private TextView b;
    private ImageView c;

    public ax(aw aw)
    {
        a = aw;
        super();
    }

    static ImageView a(ax ax1, ImageView imageview)
    {
        ax1.c = imageview;
        return imageview;
    }

    static TextView a(ax ax1)
    {
        return ax1.b;
    }

    static TextView a(ax ax1, TextView textview)
    {
        ax1.b = textview;
        return textview;
    }

    static ImageView b(ax ax1)
    {
        return ax1.c;
    }
}
