// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import com.b.a.a.b;
import com.tinder.model.Message;

// Referenced classes of package com.tinder.fragments:
//            bm

final class bp
    implements b
{

    private static final bp a = new bp();

    private bp()
    {
    }

    public static b a()
    {
        return a;
    }

    public final boolean test(Object obj)
    {
        return bm.c((Message)obj);
    }

}
