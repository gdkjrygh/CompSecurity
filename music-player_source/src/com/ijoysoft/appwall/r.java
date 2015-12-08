// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ijoysoft.appwall;

import android.widget.ImageView;
import android.widget.TextView;

// Referenced classes of package com.ijoysoft.appwall:
//            p

final class r
{

    final p a;
    private ImageView b;
    private TextView c;
    private TextView d;
    private ImageView e;

    private r(p p)
    {
        a = p;
        super();
    }

    r(p p, byte byte0)
    {
        this(p);
    }

    static TextView a(r r1)
    {
        return r1.c;
    }

    static void a(r r1, ImageView imageview)
    {
        r1.b = imageview;
    }

    static void a(r r1, TextView textview)
    {
        r1.c = textview;
    }

    static TextView b(r r1)
    {
        return r1.d;
    }

    static void b(r r1, ImageView imageview)
    {
        r1.e = imageview;
    }

    static void b(r r1, TextView textview)
    {
        r1.d = textview;
    }

    static ImageView c(r r1)
    {
        return r1.b;
    }

    static ImageView d(r r1)
    {
        return r1.e;
    }
}
