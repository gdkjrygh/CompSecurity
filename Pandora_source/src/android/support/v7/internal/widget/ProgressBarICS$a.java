// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;


// Referenced classes of package android.support.v7.internal.widget:
//            ProgressBarICS

private class d
    implements Runnable
{

    final ProgressBarICS a;
    private int b;
    private int c;
    private boolean d;

    public void a(int i, int j, boolean flag)
    {
        b = i;
        c = j;
        d = flag;
    }

    public void run()
    {
        ProgressBarICS.a(a, b, c, d, true);
        ProgressBarICS.a(a, this);
    }

    _cls9(ProgressBarICS progressbarics, int i, int j, boolean flag)
    {
        a = progressbarics;
        super();
        b = i;
        c = j;
        d = flag;
    }
}
