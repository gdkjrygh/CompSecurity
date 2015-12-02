// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;


// Referenced classes of package com.facebook.orca.d:
//            l, p, k, m

class n
    implements l
{

    final m a;

    n(m m1)
    {
        a = m1;
        super();
    }

    public void a(k k1)
    {
        switch (p.a[k1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            m.a(a);
            break;
        }
    }
}
