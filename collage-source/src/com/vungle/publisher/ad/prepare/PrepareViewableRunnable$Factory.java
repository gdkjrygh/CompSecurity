// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.ad.prepare;

import com.vungle.publisher.bk;
import com.vungle.publisher.cw;
import javax.inject.Provider;

// Referenced classes of package com.vungle.publisher.ad.prepare:
//            PrepareViewableRunnable

public static class 
{

    Provider a;

    public final PrepareViewableRunnable a(bk bk1, cw cw)
    {
        PrepareViewableRunnable prepareviewablerunnable = (PrepareViewableRunnable)a.get();
        prepareviewablerunnable.a = bk1;
        prepareviewablerunnable.b = bk1.d();
        prepareviewablerunnable.c = cw;
        return prepareviewablerunnable;
    }

    public ()
    {
    }
}
