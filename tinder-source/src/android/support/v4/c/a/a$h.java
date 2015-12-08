// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.c.a;

import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.c.a:
//            a

static final class rawable extends rawable
{

    public final void b(Drawable drawable, int i)
    {
        drawable.setLayoutDirection(i);
    }

    public final int d(Drawable drawable)
    {
        return drawable.getLayoutDirection();
    }

    rawable()
    {
    }
}
