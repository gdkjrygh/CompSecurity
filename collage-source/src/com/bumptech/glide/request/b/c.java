// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.request.b;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

// Referenced classes of package com.bumptech.glide.request.b:
//            e

public class c extends e
{

    public c(ImageView imageview)
    {
        super(imageview);
    }

    protected void a(Object obj)
    {
        d((Drawable)obj);
    }

    protected void d(Drawable drawable)
    {
        ((ImageView)a).setImageDrawable(drawable);
    }
}
