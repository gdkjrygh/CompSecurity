// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.e;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.g.b.d;
import com.bumptech.glide.load.resource.a.b;

public final class c extends d
    implements android.view.View.OnClickListener
{

    private View b;
    private View c;

    public c(ImageView imageview, View view, View view1)
    {
        super(imageview);
        b = view;
        c = view1;
        c.setOnClickListener(this);
    }

    public final void a(b b1, com.bumptech.glide.g.a.d d1)
    {
        super.a(b1, d1);
        b.setVisibility(8);
        c.setVisibility(8);
    }

    public final void a(Exception exception, Drawable drawable)
    {
        super.a(exception, drawable);
        c.setVisibility(0);
        b.setVisibility(8);
    }

    public final volatile void a(Object obj, com.bumptech.glide.g.a.d d1)
    {
        a((b)obj, d1);
    }

    public final void c(Drawable drawable)
    {
        super.c(drawable);
        b.setVisibility(0);
        c.setVisibility(8);
    }

    public final void onClick(View view)
    {
        e().b();
    }
}
