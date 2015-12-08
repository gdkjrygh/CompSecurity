// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import io.fabric.sdk.android.c;
import io.fabric.sdk.android.k;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            h, c, b

final class nit> extends h
{

    final b a;
    final io.fabric.sdk.android.services.common.c b;

    public final void a()
    {
        b b1 = b.a();
        if (!a.equals(b1))
        {
            c.a().a("Fabric", "Asychronously getting Advertising Info and storing it to preferences");
            b.a(b1);
        }
    }

    (io.fabric.sdk.android.services.common.c c1, b b1)
    {
        b = c1;
        a = b1;
        super();
    }
}
