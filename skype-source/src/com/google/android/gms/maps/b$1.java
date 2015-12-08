// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps;

import com.google.android.gms.maps.model.a.f;
import com.google.android.gms.maps.model.b;

// Referenced classes of package com.google.android.gms.maps:
//            b

final class nit> extends com.google.android.gms.maps.a.t>
{

    final l.a.f a;
    final com.google.android.gms.maps.b b;

    public final boolean a(f f)
    {
        return a.onMarkerClick(new b(f));
    }

    l.a.f(com.google.android.gms.maps.b b1, l.a.f f)
    {
        b = b1;
        a = f;
        super();
    }
}
