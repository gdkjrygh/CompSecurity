// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.c;

import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.e;
import com.squareup.picasso.s;
import com.tinder.e.r;
import com.tinder.utils.v;

// Referenced classes of package com.tinder.c:
//            ae

private final class c
    implements e
{

    final ae a;
    private int b;
    private ImageView c;

    public final void a()
    {
        ae.g(a);
        if (ae.h(a) == 2)
        {
            ae.b(a).k();
        }
    }

    public final void b()
    {
        ae.g(a);
        Picasso.a(ae.d(a)).a(0x7f02004f).b(b, b).b().a(c, null);
        if (ae.h(a) == 2)
        {
            v.b("Failed to load match avatar images for match screen!");
            ae.b(a).k();
        }
    }

    public geView(ae ae1, int i, ImageView imageview)
    {
        a = ae1;
        super();
        b = i;
        c = imageview;
    }
}
