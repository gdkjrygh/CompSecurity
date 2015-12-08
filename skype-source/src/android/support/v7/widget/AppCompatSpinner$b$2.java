// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            AppCompatSpinner

final class a
    implements android.view.obalLayoutListener
{

    final a a;

    public final void onGlobalLayout()
    {
        if (!tener(a, a.a))
        {
            a.a();
            return;
        } else
        {
            a.a();
            a(a);
            return;
        }
    }

    tener(tener tener)
    {
        a = tener;
        super();
    }
}
