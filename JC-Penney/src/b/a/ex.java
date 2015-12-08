// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.concurrent.ThreadFactory;

// Referenced classes of package b.a:
//            ew

public final class ex
    implements ThreadFactory
{

    public ex()
    {
    }

    public final Thread newThread(Runnable runnable)
    {
        return new ew(runnable);
    }
}
