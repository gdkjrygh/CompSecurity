// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            kg

final class b
    implements Runnable
{

    final String a;
    final byte b[];
    final kg c;

    public final void run()
    {
        c.b(a, b);
    }

    (kg kg1, String s, byte abyte0[])
    {
        c = kg1;
        a = s;
        b = abyte0;
        super();
    }
}
