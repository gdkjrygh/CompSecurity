// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.jcp.adapters:
//            bh

class bi
{

    private RelativeLayout a;
    private ProgressBar b;
    private ImageView c;
    private TextView d;
    private TextView e;
    private TextView f;
    private TextView g;

    private bi()
    {
    }

    bi(bh bh)
    {
        this();
    }

    static ImageView a(bi bi1, ImageView imageview)
    {
        bi1.c = imageview;
        return imageview;
    }

    static ProgressBar a(bi bi1, ProgressBar progressbar)
    {
        bi1.b = progressbar;
        return progressbar;
    }

    static RelativeLayout a(bi bi1)
    {
        return bi1.a;
    }

    static RelativeLayout a(bi bi1, RelativeLayout relativelayout)
    {
        bi1.a = relativelayout;
        return relativelayout;
    }

    static TextView a(bi bi1, TextView textview)
    {
        bi1.d = textview;
        return textview;
    }

    static ProgressBar b(bi bi1)
    {
        return bi1.b;
    }

    static TextView b(bi bi1, TextView textview)
    {
        bi1.e = textview;
        return textview;
    }

    static TextView c(bi bi1)
    {
        return bi1.g;
    }

    static TextView c(bi bi1, TextView textview)
    {
        bi1.f = textview;
        return textview;
    }

    static ImageView d(bi bi1)
    {
        return bi1.c;
    }

    static TextView d(bi bi1, TextView textview)
    {
        bi1.g = textview;
        return textview;
    }

    static TextView e(bi bi1)
    {
        return bi1.d;
    }

    static TextView f(bi bi1)
    {
        return bi1.f;
    }

    static TextView g(bi bi1)
    {
        return bi1.e;
    }
}
