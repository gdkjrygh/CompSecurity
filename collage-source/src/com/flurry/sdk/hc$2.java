// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


// Referenced classes of package com.flurry.sdk:
//            fy, hc, fs, gd, 
//            fx

class it>
    implements fy
{

    final hc a;

    public void a(fs fs1)
    {
        switch (a[fs1.b.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            gd.a(3, hc.i(), (new StringBuilder()).append("Automatic onStartSession for context:").append(fs1.a).toString());
            a.d(fs1.a);
            return;

        case 2: // '\002'
            gd.a(3, hc.i(), (new StringBuilder()).append("Automatic onEndSession for context:").append(fs1.a).toString());
            a.e(fs1.a);
            return;

        case 3: // '\003'
            gd.a(3, hc.i(), (new StringBuilder()).append("Automatic onEndSession (destroyed) for context:").append(fs1.a).toString());
            break;
        }
        a.e(fs1.a);
    }

    public void notify(fx fx)
    {
        a((fs)fx);
    }

    der(hc hc1)
    {
        a = hc1;
        super();
    }
}
