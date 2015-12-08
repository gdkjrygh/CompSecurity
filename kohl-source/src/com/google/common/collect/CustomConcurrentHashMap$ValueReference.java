// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;


// Referenced classes of package com.google.common.collect:
//            CustomConcurrentHashMap

static interface 
{

    public abstract void clear();

    public abstract  copyFor( );

    public abstract Object get();

    public abstract boolean isComputingReference();

    public abstract void notifyValueReclaimed();

    public abstract Object waitForValue()
        throws InterruptedException;
}
