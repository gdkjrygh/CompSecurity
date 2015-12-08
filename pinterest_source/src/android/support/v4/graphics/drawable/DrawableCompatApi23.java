// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;

class DrawableCompatApi23
{

    DrawableCompatApi23()
    {
    }

    public static int getLayoutDirection(Drawable drawable)
    {
        return drawable.getLayoutDirection();
    }

    public static void setLayoutDirection(Drawable drawable, int i)
    {
        drawable.setLayoutDirection(i);
    }
}
