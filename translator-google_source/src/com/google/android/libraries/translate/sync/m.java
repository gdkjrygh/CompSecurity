// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.sync;


// Referenced classes of package com.google.android.libraries.translate.sync:
//            k

final class m
    implements Runnable
{

    final int a;
    final k b;

    m(k k, int i)
    {
        b = k;
        a = i;
        super();
    }

    public final void run()
    {
        com.google.android.libraries.translate.e.m.a(a, 1);
    }
}
