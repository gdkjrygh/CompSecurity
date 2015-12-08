// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            u

class w
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final u a;

    w(u u1)
    {
        a = u1;
        super();
    }

    public void onGlobalLayout()
    {
        if (!u.a(a, a.a))
        {
            a.i();
            return;
        } else
        {
            a.b();
            u.b(a);
            return;
        }
    }
}
