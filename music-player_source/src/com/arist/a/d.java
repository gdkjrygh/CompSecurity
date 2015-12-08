// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.a;

import android.view.View;
import android.widget.TextView;
import com.arist.model.skin.ColorImageView;

final class d
{

    private TextView a;
    private TextView b;
    private ColorImageView c;
    private View d;

    d()
    {
    }

    static View a(d d1)
    {
        return d1.d;
    }

    static void a(d d1, View view)
    {
        d1.d = view;
    }

    static void a(d d1, TextView textview)
    {
        d1.a = textview;
    }

    static void a(d d1, ColorImageView colorimageview)
    {
        d1.c = colorimageview;
    }

    static TextView b(d d1)
    {
        return d1.a;
    }

    static void b(d d1, TextView textview)
    {
        d1.b = textview;
    }

    static TextView c(d d1)
    {
        return d1.b;
    }

    static ColorImageView d(d d1)
    {
        return d1.c;
    }
}
