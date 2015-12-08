// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            q

final class s
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final q a;

    s(q q1)
    {
        a = q1;
        super();
    }

    public final void onGlobalLayout()
    {
        if (!q.a(a, a.b))
        {
            a.d();
            return;
        } else
        {
            a.a();
            q.b(a);
            return;
        }
    }
}
