// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.jcp.adapters:
//            ak, al

class am
{

    final ak a;
    private TextView b;
    private LinearLayout c;
    private ImageView d;

    private am(ak ak)
    {
        a = ak;
        super();
    }

    am(ak ak, al al)
    {
        this(ak);
    }

    static ImageView a(am am1, ImageView imageview)
    {
        am1.d = imageview;
        return imageview;
    }

    static LinearLayout a(am am1, LinearLayout linearlayout)
    {
        am1.c = linearlayout;
        return linearlayout;
    }

    static TextView a(am am1)
    {
        return am1.b;
    }

    static TextView a(am am1, TextView textview)
    {
        am1.b = textview;
        return textview;
    }

    static ImageView b(am am1)
    {
        return am1.d;
    }

    static LinearLayout c(am am1)
    {
        return am1.c;
    }
}
