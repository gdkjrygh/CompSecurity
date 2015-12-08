// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            h, l

final class t> extends h
{

    final Runnable a;
    final a b;

    public final void a()
    {
        a.run();
    }

    ( , Runnable runnable)
    {
        b = ;
        a = runnable;
        super();
    }

    // Unreferenced inner class io/fabric/sdk/android/services/common/l$1

/* anonymous class */
    static final class l._cls1
        implements ThreadFactory
    {

        final String a;
        final AtomicLong b;

        public final Thread newThread(Runnable runnable)
        {
            runnable = Executors.defaultThreadFactory().newThread(new l._cls1._cls1(this, runnable));
            runnable.setName((new StringBuilder()).append(a).append(b.getAndIncrement()).toString());
            return runnable;
        }

            
            {
                a = s;
                b = atomiclong;
                super();
            }
    }

}
