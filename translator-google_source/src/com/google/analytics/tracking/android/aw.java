// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import java.text.DecimalFormat;

// Referenced classes of package com.google.analytics.tracking.android:
//            as, bk

final class aw
    implements as
{

    private final DecimalFormat a = new DecimalFormat("0.##");

    aw()
    {
    }

    public final String a(String s)
    {
        return a.format(bk.b(s));
    }
}
