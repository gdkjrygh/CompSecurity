// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.usermedia;

import com.kik.cards.usermedia.a;
import com.kik.g.p;
import com.kik.g.r;
import kik.android.util.DeviceUtils;

// Referenced classes of package com.kik.cards.web.usermedia:
//            PhotoPlugin, c, e

final class d extends r
{

    final com.kik.cards.web.plugin.a a;
    final int b;
    final int c;
    final boolean d;
    final android.graphics.Bitmap.CompressFormat e;
    final int f;
    final int g;
    final int h;
    final PhotoPlugin i;

    d(PhotoPlugin photoplugin, com.kik.cards.web.plugin.a a1, int j, int k, boolean flag, android.graphics.Bitmap.CompressFormat compressformat, int l, 
            int i1, int j1)
    {
        i = photoplugin;
        a = a1;
        b = j;
        c = k;
        d = flag;
        e = compressformat;
        f = l;
        g = i1;
        h = j1;
        super();
    }

    public final void a(Object obj)
    {
        obj = (String)obj;
        c c1 = i.b(((String) (obj)));
        if ((c1 instanceof a) && !DeviceUtils.e(com.kik.cards.web.usermedia.PhotoPlugin.a(i)))
        {
            com.kik.cards.web.usermedia.PhotoPlugin.a(a, 404, null);
            return;
        } else
        {
            c1.a(b, c, d).a(new e(this, ((String) (obj))));
            return;
        }
    }

    public final void a(Throwable throwable)
    {
        com.kik.cards.web.usermedia.PhotoPlugin.a(a, 200, null);
        super.a(throwable);
    }
}
