// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.g.a;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;

// Referenced classes of package com.bumptech.glide.g.a:
//            d, e

public final class c
    implements d
{

    private final d a;
    private final int b;

    public c(d d1, int i)
    {
        a = d1;
        b = i;
    }

    public final boolean a(Object obj, e e1)
    {
        obj = (Drawable)obj;
        Drawable drawable = e1.d();
        if (drawable != null)
        {
            obj = new TransitionDrawable(new Drawable[] {
                drawable, obj
            });
            ((TransitionDrawable) (obj)).setCrossFadeEnabled(true);
            ((TransitionDrawable) (obj)).startTransition(b);
            e1.a(((Drawable) (obj)));
            return true;
        } else
        {
            a.a(obj, e1);
            return false;
        }
    }
}
