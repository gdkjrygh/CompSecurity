// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.lrc;


// Referenced classes of package com.arist.model.lrc:
//            a, DeskLrcView

final class c
    implements Runnable
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public final void run()
    {
        a.a = false;
        com.arist.model.lrc.a.a(a).invalidate();
    }
}
