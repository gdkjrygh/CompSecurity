// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            aj, gu

class ni
    implements Runnable
{

    final String ni;
    final aj nn;

    public void run()
    {
        aj.a(nn).loadUrl(ni);
    }

    (aj aj1, String s)
    {
        nn = aj1;
        ni = s;
        super();
    }
}
