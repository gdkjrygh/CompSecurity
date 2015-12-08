// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.e;

import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.g.b.d;

public final class b extends d
{

    public b(ImageView imageview)
    {
        super(imageview);
    }

    public final void a(com.bumptech.glide.load.resource.a.b b1, com.bumptech.glide.g.a.d d1)
    {
        View view = a();
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        int j = b1.getIntrinsicWidth();
        int k = b1.getIntrinsicHeight();
        int i = view.getWidth();
        j = (k * i) / j;
        layoutparams.width = i;
        layoutparams.height = j;
        super.a(b1, d1);
    }

    public final volatile void a(Object obj, com.bumptech.glide.g.a.d d1)
    {
        a((com.bumptech.glide.load.resource.a.b)obj, d1);
    }
}
