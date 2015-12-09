// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            au

class aw
    implements Callable
{

    final au a;

    aw(au au1)
    {
        a = au1;
        super();
    }

    public String a()
    {
        return au.a(a);
    }

    public Object call()
    {
        return a();
    }
}
