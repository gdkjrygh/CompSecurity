// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3.builder;

import org.apache.commons.lang3.SystemUtils;

// Referenced classes of package org.apache.commons.lang3.builder:
//            ToStringStyle

static final class setContentEnd extends ToStringStyle
{

    ()
    {
        setContentStart("[");
        setFieldSeparator((new StringBuilder()).append(SystemUtils.LINE_SEPARATOR).append("  ").toString());
        setFieldSeparatorAtStart(true);
        setContentEnd((new StringBuilder()).append(SystemUtils.LINE_SEPARATOR).append("]").toString());
    }
}
