// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            bl, ry

final class bq
    implements Runnable
{

    final String a;
    final bl b;

    bq(bl bl1, String s)
    {
        b = bl1;
        a = s;
        super();
    }

    public final void run()
    {
        bl.a(b).loadUrl(a);
    }
}
