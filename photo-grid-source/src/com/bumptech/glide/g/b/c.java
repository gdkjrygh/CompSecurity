// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.g.b;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// Referenced classes of package com.bumptech.glide.g.b:
//            e

public final class c extends e
{

    public c(ImageView imageview)
    {
        super(imageview);
    }

    protected final void a(Object obj)
    {
        obj = (Drawable)obj;
        ((ImageView)a).setImageDrawable(((Drawable) (obj)));
    }
}
