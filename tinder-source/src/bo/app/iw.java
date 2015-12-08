// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


// Referenced classes of package bo.app:
//            iv, km

final class iw
    implements Runnable
{

    final int a;
    final int b;
    final iv c;

    iw(iv iv1, int i, int j)
    {
        c = iv1;
        a = i;
        b = j;
        super();
    }

    public final void run()
    {
        c.c.d();
    }
}
