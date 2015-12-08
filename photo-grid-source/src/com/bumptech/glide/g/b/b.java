// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.g.b;

import android.graphics.Bitmap;
import android.widget.ImageView;

// Referenced classes of package com.bumptech.glide.g.b:
//            e

public class b extends e
{

    public b(ImageView imageview)
    {
        super(imageview);
    }

    protected void a(Bitmap bitmap)
    {
        ((ImageView)a).setImageBitmap(bitmap);
    }

    protected volatile void a(Object obj)
    {
        a((Bitmap)obj);
    }
}
