// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.jcp.adapters:
//            au

class av
{

    final au a;
    private TextView b;
    private ImageView c;

    av(au au)
    {
        a = au;
        super();
    }

    static ImageView a(av av1, ImageView imageview)
    {
        av1.c = imageview;
        return imageview;
    }

    static TextView a(av av1)
    {
        return av1.b;
    }

    static TextView a(av av1, TextView textview)
    {
        av1.b = textview;
        return textview;
    }

    static ImageView b(av av1)
    {
        return av1.c;
    }
}
