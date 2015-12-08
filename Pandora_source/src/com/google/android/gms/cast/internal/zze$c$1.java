// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast.internal;


// Referenced classes of package com.google.android.gms.cast.internal:
//            zze

class b
    implements Runnable
{

    final zze a;
    final int b;
    final b c;

    public void run()
    {
        if (zze.zze(a) != null)
        {
            zze.zze(a).onApplicationDisconnected(b);
        }
    }

    ( , zze zze1, int i)
    {
        c = ;
        a = zze1;
        b = i;
        super();
    }
}
