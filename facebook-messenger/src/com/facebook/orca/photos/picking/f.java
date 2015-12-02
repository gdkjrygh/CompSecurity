// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.picking;


// Referenced classes of package com.facebook.orca.photos.picking:
//            c, h, d, PickMediaOperation, 
//            PickMediaParams

class f extends c
{

    final PickMediaParams a;
    final PickMediaOperation b;

    f(PickMediaOperation pickmediaoperation, PickMediaParams pickmediaparams)
    {
        b = pickmediaoperation;
        a = pickmediaparams;
        super();
    }

    public void a(d d1)
    {
        switch (h.a[d1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            PickMediaOperation.a(b);
            return;

        case 2: // '\002'
            if (a.b())
            {
                PickMediaOperation.b(b);
                return;
            } else
            {
                PickMediaOperation.c(b);
                return;
            }

        case 3: // '\003'
            PickMediaOperation.d(b);
            return;

        case 4: // '\004'
            PickMediaOperation.e(b);
            return;

        case 5: // '\005'
            PickMediaOperation.f(b);
            return;

        case 6: // '\006'
            PickMediaOperation.g(b);
            return;
        }
    }
}
