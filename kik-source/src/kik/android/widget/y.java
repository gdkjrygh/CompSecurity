// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;


// Referenced classes of package kik.android.widget:
//            x, FragmentContainerFrame

final class y
    implements Runnable
{

    final x a;

    y(x x1)
    {
        a = x1;
        super();
    }

    public final void run()
    {
        FragmentContainerFrame.a(a.b, a.a);
    }
}
