// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.internal:
//            zzml

static class c
{

    private Status a;
    private Object b;
    private long c;

    public long a()
    {
        return c;
    }

    public void a(long l)
    {
        c = l;
    }

    public void a(Status status)
    {
        a = status;
    }

    public void a(Object obj)
    {
        b = obj;
    }

    public s(Status status, Object obj, long l)
    {
        a = status;
        b = obj;
        c = l;
    }
}
