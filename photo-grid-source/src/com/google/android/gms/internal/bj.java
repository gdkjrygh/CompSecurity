// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

// Referenced classes of package com.google.android.gms.internal:
//            bl, bk, bg, rf, 
//            ad, bi

final class bj
    implements Runnable
{

    final Context a;
    final VersionInfoParcel b;
    final rf c;
    final ad d;
    final String e;
    final bi f;

    bj(bi bi, Context context, VersionInfoParcel versioninfoparcel, rf rf, ad ad, String s)
    {
        f = bi;
        a = context;
        b = versioninfoparcel;
        c = rf;
        d = ad;
        e = s;
        super();
    }

    public final void run()
    {
        bi bi = f;
        Object obj = a;
        VersionInfoParcel versioninfoparcel = b;
        rf rf = c;
        obj = new bl(((Context) (obj)), versioninfoparcel, d);
        ((bg) (obj)).a(new bk(bi, rf, ((bg) (obj))));
        ((bg) (obj)).b(e);
    }
}
