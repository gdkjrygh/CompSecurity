// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.request.a;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

// Referenced classes of package com.bumptech.glide.request.a:
//            c

public class b
    implements c
{

    private final c a;
    private final int b;

    public b(c c1, int i)
    {
        a = c1;
        b = i;
    }

    public boolean a(Drawable drawable, c.a a1)
    {
        Drawable drawable1 = a1.b();
        if (drawable1 != null)
        {
            drawable = new TransitionDrawable(new Drawable[] {
                drawable1, drawable
            });
            drawable.setCrossFadeEnabled(true);
            drawable.startTransition(b);
            a1.c(drawable);
            return true;
        } else
        {
            a.a(drawable, a1);
            return false;
        }
    }

    public volatile boolean a(Object obj, c.a a1)
    {
        return a((Drawable)obj, a1);
    }
}
