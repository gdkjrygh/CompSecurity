// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import java.io.IOException;

// Referenced classes of package com.android.slyce.report.c:
//            m

public class q extends IOException
{

    final m a;

    public q(m m, Throwable throwable)
    {
        a = m;
        super(throwable.getMessage());
    }
}
