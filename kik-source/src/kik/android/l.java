// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android;


// Referenced classes of package kik.android:
//            a, j

final class l
    implements Runnable
{

    final a a;
    final j b;

    l(j j, a a1)
    {
        b = j;
        a = a1;
        super();
    }

    public final void run()
    {
        a.f();
    }
}
