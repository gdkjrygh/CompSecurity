// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.base;


// Referenced classes of package org.joda.time.base:
//            AbstractPartial

public abstract class BaseLocal extends AbstractPartial
{

    private static final long serialVersionUID = 0xfb6ec550cf17L;

    protected BaseLocal()
    {
    }

    protected abstract long getLocalMillis();
}
