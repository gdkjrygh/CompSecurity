// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.api;

import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.common.api:
//            g, h, Status

public interface e
{
    public static interface a
    {

        public abstract void a(Status status);
    }


    public abstract g a(long l, TimeUnit timeunit);

    public abstract void a(h h);
}
