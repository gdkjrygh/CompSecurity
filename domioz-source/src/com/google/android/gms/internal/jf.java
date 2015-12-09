// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.l;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.j;

// Referenced classes of package com.google.android.gms.internal:
//            jg, jy, je

final class jf extends jg
{

    final LocationRequest b;
    final j c;
    final je d;

    jf(je je, l l, LocationRequest locationrequest, j j)
    {
        d = je;
        b = locationrequest;
        c = j;
        super(l);
    }

    protected final void b(h h)
    {
        ((jy)h).a(b, c);
        a(Status.a);
    }
}
