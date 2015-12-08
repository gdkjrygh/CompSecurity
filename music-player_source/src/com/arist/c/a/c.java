// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.c.a;

import android.widget.ImageView;
import com.a.a.b.f.a;
import com.arist.model.skin.ColorImageView;

final class c
    implements a
{

    private final ImageView a;

    c(ImageView imageview)
    {
        a = imageview;
        super();
    }

    public final void a()
    {
        if (a instanceof ColorImageView)
        {
            ((ColorImageView)a).a(true);
        }
    }

    public final void b()
    {
        if (a instanceof ColorImageView)
        {
            ((ColorImageView)a).a(false);
        }
    }
}
