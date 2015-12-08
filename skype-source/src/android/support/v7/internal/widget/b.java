// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarContainer

class b extends Drawable
{

    final ActionBarContainer a;

    public b(ActionBarContainer actionbarcontainer)
    {
        a = actionbarcontainer;
    }

    public void draw(Canvas canvas)
    {
        if (a.d)
        {
            if (a.c != null)
            {
                a.c.draw(canvas);
            }
        } else
        {
            if (a.a != null)
            {
                a.a.draw(canvas);
            }
            if (a.b != null && a.e)
            {
                a.b.draw(canvas);
                return;
            }
        }
    }

    public int getOpacity()
    {
        return 0;
    }

    public void setAlpha(int i)
    {
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
    }
}
