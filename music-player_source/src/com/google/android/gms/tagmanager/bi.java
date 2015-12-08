// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            bg, h

final class bi
    implements Runnable
{

    final h a;
    final bg b;

    bi(bg bg1, h h1)
    {
        b = bg1;
        a = h1;
        super();
    }

    public final void run()
    {
        a.a(bg.a(b));
    }
}
