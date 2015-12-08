// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.spotify.mobile.android.service.media.MediaAction;

public final class ekf
{

    Context a;
    ahe b;
    ecd c;
    final ahx d;
    final ahx e;

    public ekf(Context context, ahe ahe1)
    {
        c = new ecd();
        a = (Context)ctz.a(context);
        b = (ahe)ctz.a(ahe1);
        d = b.a(0);
        d.a(a.getString(0x7f0800d1));
        d.a(1010);
        e = b.a(1);
        e.b(true);
        e.a(a.getString(0x7f0800d0));
        e.a(1000);
        context = b.a(2);
        context.a(a.getString(0x7f0800d2));
        context.a(1002);
        context = b.a(3);
        context.a(1009);
        context.a(a.getString(0x7f0800d5));
        context.a(MediaAction.k);
        context = b.a(6);
        context.a(1012);
        context.a(a.getString(0x7f0800d4));
        context.a(MediaAction.d);
        context = b.a(7);
        context.a(1011);
        context.a(a.getString(0x7f0800d3));
        context.a(MediaAction.c);
    }
}
