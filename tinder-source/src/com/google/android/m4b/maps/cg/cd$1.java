// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;


// Referenced classes of package com.google.android.m4b.maps.cg:
//            cd

final class a
    implements Runnable
{

    private Runnable a;
    private cd b;

    public final void run()
    {
        b.a = false;
        a.run();
    }

    (cd cd1, Runnable runnable)
    {
        b = cd1;
        a = runnable;
        super();
    }
}
