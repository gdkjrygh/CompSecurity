// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.a;

import android.graphics.Rect;
import android.view.View;

public class c
{

    public c()
    {
    }

    public static void a(View view, View view1, Rect rect)
    {
        view.getHitRect(rect);
        for (view = view.getParent(); view != view1 && view != null && (view instanceof View); view = view.getParent())
        {
            view = (View)view;
            rect.offset(view.getLeft(), view.getTop());
        }

    }
}
