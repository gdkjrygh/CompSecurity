// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.f;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import com.facebook.common.w.j;

public class d
{

    public d()
    {
    }

    public static TouchDelegate a(View view, int i)
    {
        Rect rect = new Rect();
        view.getHitRect(rect);
        i = j.a(view.getContext(), i);
        rect.left = rect.left - i;
        rect.top = rect.top - i;
        rect.right = rect.right + i;
        rect.bottom = i + rect.bottom;
        return new TouchDelegate(rect, view);
    }

    public static TouchDelegate a(View view, int i, int k)
    {
        Rect rect = new Rect();
        view.getHitRect(rect);
        rect.top = i;
        rect.bottom = k;
        return new TouchDelegate(rect, view);
    }

    public static TouchDelegate a(View view, int i, int k, int l)
    {
        Rect rect = new Rect();
        view.getHitRect(rect);
        l = j.a(view.getContext(), l);
        rect.left = rect.left - l;
        rect.right = l + rect.right;
        rect.top = i;
        rect.bottom = k;
        return new TouchDelegate(rect, view);
    }
}
