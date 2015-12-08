// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            bl, ry

final class bn
    implements Runnable
{

    final String a;
    final String b;
    final bl c;

    bn(bl bl1, String s, String s1)
    {
        c = bl1;
        a = s;
        b = s1;
        super();
    }

    public final void run()
    {
        bl.a(c).a(a, b);
    }
}
