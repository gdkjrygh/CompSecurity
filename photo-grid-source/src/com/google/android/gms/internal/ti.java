// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.appdatasearch.b;
import com.google.android.gms.appdatasearch.p;
import com.google.android.gms.common.api.h;

public final class ti
    implements p
{

    public ti()
    {
    }

    public final com.google.android.gms.common.api.p a(h h1, com.google.android.gms.appdatasearch.GetRecentContextCall.Request request)
    {
        return h1.a(new b(request, h1));
    }
}
