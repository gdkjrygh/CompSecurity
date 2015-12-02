// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.enginehelper.clean;


// Referenced classes of package com.qihoo.security.enginehelper.clean:
//            a, CleanScanType

class a
    implements Runnable
{

    final CleanScanType a;
    final a b;

    public void run()
    {
        if (!com.qihoo.security.enginehelper.clean.a.a(b))
        {
            com.qihoo.security.enginehelper.clean.a.a(b, a);
        }
        com.qihoo.security.enginehelper.clean.a.b(b, a);
    }

    nScanType(a a1, CleanScanType cleanscantype)
    {
        b = a1;
        a = cleanscantype;
        super();
    }
}
