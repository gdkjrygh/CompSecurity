// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.usermedia;

import android.content.Context;
import com.kik.cards.web.plugin.a;
import com.kik.cards.web.plugin.j;
import com.kik.g.p;
import com.kik.g.r;
import com.kik.m.q;

// Referenced classes of package com.kik.cards.web.usermedia:
//            PhotoPlugin, b, j, h

final class g extends r
{

    final a a;
    final String b;
    final PhotoPlugin c;

    g(PhotoPlugin photoplugin, a a1, String s)
    {
        c = photoplugin;
        a = a1;
        b = s;
        super();
    }

    public final void a(Throwable throwable)
    {
        a.a(new j(401));
        PhotoPlugin.e(c);
    }

    public final void c()
    {
        b b1 = new b(com.kik.cards.web.usermedia.PhotoPlugin.a(c).getString(0x7f090148), com.kik.cards.web.usermedia.PhotoPlugin.a(c).getString(0x7f0902ba), com.kik.cards.web.usermedia.PhotoPlugin.a(c).getString(0x7f0901b4));
        PhotoPlugin.c(c).a(b1);
        PhotoPlugin.a a1 = new PhotoPlugin.a(c, com.kik.cards.web.usermedia.PhotoPlugin.a(c), a, b, PhotoPlugin.d(c));
        PhotoPlugin.b(c).a(a1).a(new h(this, b1));
    }
}
