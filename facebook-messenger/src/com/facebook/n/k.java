// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.n;

import com.facebook.ui.b.e;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.n:
//            j

public class k extends e
{

    private j a;

    public k()
    {
    }

    public void a(long l)
    {
        Preconditions.checkNotNull(a);
        a.c();
    }

    public void a(j j1)
    {
        a = j1;
    }
}
