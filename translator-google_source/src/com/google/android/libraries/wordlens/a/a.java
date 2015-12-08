// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens.a;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.TextView;

public final class a
{

    public TextView a;
    public View b;
    public Bitmap c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public boolean i;

    public a(View view, int j)
    {
        d = -2;
        e = -2;
        f = 0;
        g = 0;
        h = true;
        i = true;
        b = view;
        view = b.findViewById(j);
        if (view != null && android/widget/TextView.isAssignableFrom(view.getClass()))
        {
            a = (TextView)view;
            return;
        } else
        {
            (new StringBuilder(101)).append("Unable to find a textView for the resource ID: ").append(j).append(", check your usage of RotatedLayoutFactory.");
            a = null;
            return;
        }
    }
}
