// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;


// Referenced classes of package kik.android.widget:
//            dg, PullToRevealView

final class df
    implements PullToRevealView.b
{

    final PullToRevealView a;

    df(PullToRevealView pulltorevealview)
    {
        a = pulltorevealview;
        super();
    }

    public final void a(boolean flag)
    {
        if (!flag)
        {
            PullToRevealView.a(a, new dg(this));
            return;
        } else
        {
            PullToRevealView.b(a);
            return;
        }
    }
}
