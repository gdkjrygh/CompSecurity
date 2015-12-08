// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package com.squareup.picasso:
//            ab

static final class dFactory
    implements ThreadFactory
{

    public final Thread newThread(Runnable runnable)
    {
        return new <init>(runnable);
    }

    dFactory()
    {
    }
}
