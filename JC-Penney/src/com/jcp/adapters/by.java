// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.jcp.adapters:
//            bw, bx

class by
{

    final bw a;
    private TextView b;
    private TextView c;
    private RatingBar d;
    private RelativeLayout e;

    private by(bw bw)
    {
        a = bw;
        super();
    }

    by(bw bw, bx bx)
    {
        this(bw);
    }

    static RatingBar a(by by1, RatingBar ratingbar)
    {
        by1.d = ratingbar;
        return ratingbar;
    }

    static RelativeLayout a(by by1)
    {
        return by1.e;
    }

    static RelativeLayout a(by by1, RelativeLayout relativelayout)
    {
        by1.e = relativelayout;
        return relativelayout;
    }

    static TextView a(by by1, TextView textview)
    {
        by1.b = textview;
        return textview;
    }

    static TextView b(by by1)
    {
        return by1.c;
    }

    static TextView b(by by1, TextView textview)
    {
        by1.c = textview;
        return textview;
    }

    static RatingBar c(by by1)
    {
        return by1.d;
    }

    static TextView d(by by1)
    {
        return by1.b;
    }
}
