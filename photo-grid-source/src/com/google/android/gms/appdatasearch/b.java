// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.appdatasearch;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.r;
import com.google.android.gms.internal.ta;
import com.google.android.gms.internal.th;
import com.google.android.gms.internal.to;

// Referenced classes of package com.google.android.gms.appdatasearch:
//            e, c

public final class b extends to
{

    private final GetRecentContextCall.Request b;

    public b(GetRecentContextCall.Request request, h h)
    {
        super(e.a, h);
        b = request;
    }

    protected final r a(Status status)
    {
        GetRecentContextCall.Response response = new GetRecentContextCall.Response();
        response.a = status;
        return response;
    }

    protected final void a(c c1)
    {
        ((ta)((th)c1).zzpc()).a(b, new com.google.android.gms.appdatasearch.c(this, this));
    }
}
