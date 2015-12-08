// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher;

import com.vungle.publisher.db.model.Ad;

// Referenced classes of package com.vungle.publisher:
//            bx, i

public abstract class j extends bx
    implements i
{

    protected final Ad b;

    public j(Ad ad)
    {
        b = ad;
    }

    public final Ad a()
    {
        return b;
    }
}
