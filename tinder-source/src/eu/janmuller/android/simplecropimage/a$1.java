// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package eu.janmuller.android.simplecropimage;


// Referenced classes of package eu.janmuller.android.simplecropimage:
//            a, d

final class b
    implements Runnable
{

    final d a;
    final boolean b;
    final a c;

    public final void run()
    {
        c.a(a, b);
    }

    (a a1, d d, boolean flag)
    {
        c = a1;
        a = d;
        b = flag;
        super();
    }
}
