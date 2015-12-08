// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import com.pandora.radio.data.aa;
import com.pandora.radio.data.y;
import p.cp.d;

// Referenced classes of package com.pandora.android.activity:
//            InterstitialBaseActivity

class b
    implements Runnable
{

    final aa a;
    final y b;
    final b c;

    public void run()
    {
        InterstitialBaseActivity.a(c.c).a(InterstitialBaseActivity.b(c.c), a, b);
    }

    ( , aa aa, y y)
    {
        c = ;
        a = aa;
        b = y;
        super();
    }
}
