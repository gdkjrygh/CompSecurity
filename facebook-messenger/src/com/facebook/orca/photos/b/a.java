// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.b;

import com.facebook.abtest.qe.d.e;
import com.google.common.a.ev;
import com.google.common.a.ew;

// Referenced classes of package com.facebook.orca.photos.b:
//            e, c

public class a
{

    public static final ev a = ev.k().b("width", Integer.valueOf(640)).b("height", Integer.valueOf(960)).b("quality", Integer.valueOf(85)).b();
    private static final com.facebook.orca.photos.b.e b = new com.facebook.orca.photos.b.e(640, 960, 85);
    private final com.facebook.abtest.qe.d.a c;

    public a(e e1)
    {
        c = e1.a("messenger_photo_resize_android", new c(null));
    }

    static com.facebook.orca.photos.b.e b()
    {
        return b;
    }

    public com.facebook.orca.photos.b.e a()
    {
        return (com.facebook.orca.photos.b.e)c.a();
    }

}
