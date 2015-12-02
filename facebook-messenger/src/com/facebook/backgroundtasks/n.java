// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.backgroundtasks;

import com.google.common.d.a.h;

// Referenced classes of package com.facebook.backgroundtasks:
//            j, b

class n
    implements h
{

    final j a;

    n(j j1)
    {
        a = j1;
        super();
    }

    public void a(b b1)
    {
        j.a(a, b1);
    }

    public volatile void a(Object obj)
    {
        a((b)obj);
    }

    public void a(Throwable throwable)
    {
        j.a(a, throwable);
    }
}
