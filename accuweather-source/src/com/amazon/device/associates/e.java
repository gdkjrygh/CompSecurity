// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.content.Intent;

// Referenced classes of package com.amazon.device.associates:
//            bh, p, bg, ay

public final class e
{

    private static final String a = com/amazon/device/associates/e.getSimpleName();

    public e()
    {
    }

    public void a(Intent intent, ay ay)
    {
        bh bh1 = new bh();
        p.c(a, (new StringBuilder()).append("Intent action receiveed by dummy response receiver:").append(intent.getAction()).toString());
        bh1.a(null, intent, ay);
    }

}
