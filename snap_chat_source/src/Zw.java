// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.view.View;

public final class Zw
{

    public Zw()
    {
    }

    public static Rect a(View view)
    {
        view = view.getLayoutParams();
        if (view instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            view = (android.view.ViewGroup.MarginLayoutParams)view;
            return new Rect(((android.view.ViewGroup.MarginLayoutParams) (view)).leftMargin, ((android.view.ViewGroup.MarginLayoutParams) (view)).topMargin, ((android.view.ViewGroup.MarginLayoutParams) (view)).rightMargin, ((android.view.ViewGroup.MarginLayoutParams) (view)).bottomMargin);
        } else
        {
            return new Rect();
        }
    }
}
