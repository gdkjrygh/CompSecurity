// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            CharMatcher

final class Platform
{

    private static final ThreadLocal DEST_TL = new ThreadLocal() {

        protected volatile Object initialValue()
        {
            return initialValue();
        }

        protected char[] initialValue()
        {
            return new char[1024];
        }

    };

    private Platform()
    {
    }

    static char[] charBufferFromThreadLocal()
    {
        return (char[])DEST_TL.get();
    }

    static boolean isInstance(Class class1, Object obj)
    {
        return class1.isInstance(obj);
    }

    static CharMatcher precomputeCharMatcher(CharMatcher charmatcher)
    {
        return charmatcher.precomputedInternal();
    }

    static long systemNanoTime()
    {
        return System.nanoTime();
    }

}
