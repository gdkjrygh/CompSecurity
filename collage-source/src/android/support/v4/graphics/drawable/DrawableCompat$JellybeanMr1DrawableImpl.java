// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//            DrawableCompat, DrawableCompatJellybeanMr1

static class  extends 
{

    public int getLayoutDirection(Drawable drawable)
    {
        int i = DrawableCompatJellybeanMr1.getLayoutDirection(drawable);
        if (i >= 0)
        {
            return i;
        } else
        {
            return 0;
        }
    }

    public void setLayoutDirection(Drawable drawable, int i)
    {
        DrawableCompatJellybeanMr1.setLayoutDirection(drawable, i);
    }

    ()
    {
    }
}
