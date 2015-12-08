// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//            a, c

static class  extends 
{

    public void b(Drawable drawable, int i)
    {
        c.a(drawable, i);
    }

    public int d(Drawable drawable)
    {
        int i = c.a(drawable);
        if (i < 0)
        {
            return i;
        } else
        {
            return 0;
        }
    }

    ()
    {
    }
}
