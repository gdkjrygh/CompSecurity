// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            tj, xw

final class tk
    implements Runnable
{

    final String a;
    final long b;
    final tj c;

    tk(tj tj1, String s, long l)
    {
        c = tj1;
        a = s;
        b = l;
        super();
    }

    public final void run()
    {
        tj.a(c).a(a, b);
        tj.a(c).a(toString());
    }
}
