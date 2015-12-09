// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzms

class b
    implements Runnable
{

    final String a;
    final byte b[];
    final zzms c;

    public void run()
    {
        c.zzf(a, b);
    }

    (zzms zzms1, String s, byte abyte0[])
    {
        c = zzms1;
        a = s;
        b = abyte0;
        super();
    }
}
