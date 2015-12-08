// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.builder;


// Referenced classes of package org.apache.commons.lang3.builder:
//            ToStringStyle

private static final class setUseIdentityHashCode extends ToStringStyle
{

    private static final long serialVersionUID = 1L;

    private Object readResolve()
    {
        return ToStringStyle.SHORT_PREFIX_STYLE;
    }

    ()
    {
        setUseShortClassName(true);
        setUseIdentityHashCode(false);
    }
}
