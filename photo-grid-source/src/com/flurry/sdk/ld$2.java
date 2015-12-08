// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;


// Referenced classes of package com.flurry.sdk:
//            jx, jr, ld, kc, 
//            jw

class it>
    implements jx
{

    final ld a;

    public void a(jr jr1)
    {
        switch (a[jr1.b.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            kc.a(3, ld.h(), (new StringBuilder("Automatic onStartSession for context:")).append(jr1.a).toString());
            ld.a(a, jr1.a);
            return;

        case 2: // '\002'
            kc.a(3, ld.h(), (new StringBuilder("Automatic onEndSession for context:")).append(jr1.a).toString());
            a.d(jr1.a);
            return;

        case 3: // '\003'
            kc.a(3, ld.h(), (new StringBuilder("Automatic onEndSession (destroyed) for context:")).append(jr1.a).toString());
            break;
        }
        a.d(jr1.a);
    }

    public volatile void a(jw jw)
    {
        a((jr)jw);
    }

    der(ld ld1)
    {
        a = ld1;
        super();
    }
}
