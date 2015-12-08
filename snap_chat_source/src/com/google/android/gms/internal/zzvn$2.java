// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzvn

class zzGV
    implements Runnable
{

    final byte zzGV[];
    final zzvn zzaCD;
    final String zzaCz;

    public void run()
    {
        zzaCD.zzg(zzaCz, zzGV);
    }

    (zzvn zzvn1, String s, byte abyte0[])
    {
        zzaCD = zzvn1;
        zzaCz = s;
        zzGV = abyte0;
        super();
    }
}
