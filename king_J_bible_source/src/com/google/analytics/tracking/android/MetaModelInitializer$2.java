// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import java.text.DecimalFormat;

// Referenced classes of package com.google.analytics.tracking.android:
//            MetaModelInitializer, Utils

static final class 
    implements 
{

    private final DecimalFormat mFloatFormat = new DecimalFormat("0.##");

    public String format(String s)
    {
        return mFloatFormat.format(Utils.safeParseDouble(s));
    }

    ()
    {
    }
}
