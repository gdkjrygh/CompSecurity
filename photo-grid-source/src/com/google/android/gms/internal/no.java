// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            nt, ry, ho

final class no
    implements Runnable
{

    final nt a;

    no(nt nt1)
    {
        a = nt1;
        super();
    }

    public final void run()
    {
        nt nt1 = a;
        if (nt1.a != null)
        {
            nt1.a.destroy();
            nt1.a = null;
        }
        if (a.b != null)
        {
            a.b.a();
        }
    }
}
