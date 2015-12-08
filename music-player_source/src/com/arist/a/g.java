// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

final class g
{

    private TextView a;
    private TextView b;
    private ImageView c;
    private View d;
    private View e;

    g()
    {
    }

    static View a(g g1)
    {
        return g1.e;
    }

    static void a(g g1, View view)
    {
        g1.d = view;
    }

    static void a(g g1, ImageView imageview)
    {
        g1.c = imageview;
    }

    static void a(g g1, TextView textview)
    {
        g1.a = textview;
    }

    static TextView b(g g1)
    {
        return g1.a;
    }

    static void b(g g1, View view)
    {
        g1.e = view;
    }

    static void b(g g1, TextView textview)
    {
        g1.b = textview;
    }

    static TextView c(g g1)
    {
        return g1.b;
    }

    static ImageView d(g g1)
    {
        return g1.c;
    }

    static View e(g g1)
    {
        return g1.d;
    }
}
