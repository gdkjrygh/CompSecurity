// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util.format;

import java.text.DecimalFormat;

// Referenced classes of package com.fitbit.util.format:
//            d

static final class  extends DecimalFormat
{

    private static final long serialVersionUID = 1L;

    DecimalFormat a()
    {
        setMinimumFractionDigits(0);
        setMaximumFractionDigits(2);
        return this;
    }

    ()
    {
    }
}
