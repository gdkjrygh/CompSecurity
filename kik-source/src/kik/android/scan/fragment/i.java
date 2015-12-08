// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.scan.fragment;


// Referenced classes of package kik.android.scan.fragment:
//            h, g, ScanFragment

final class i
    implements Runnable
{

    final h a;

    i(h h1)
    {
        a = h1;
        super();
    }

    public final void run()
    {
        ScanFragment.k(a.a.b);
        ScanFragment.c(a.a.b, a.a.a);
    }
}
