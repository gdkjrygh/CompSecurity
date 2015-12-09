// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            co, fm

final class fn
    implements Runnable
{

    final co a;
    final fm b;

    fn(fm fm, co co1)
    {
        b = fm;
        a = co1;
        super();
    }

    public final void run()
    {
        a.k();
    }
}
