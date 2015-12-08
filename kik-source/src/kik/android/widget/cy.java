// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;


// Referenced classes of package kik.android.widget:
//            cx

final class cy
    implements android.view.ViewTreeObserver.OnScrollChangedListener
{

    final cx a;

    cy(cx cx1)
    {
        a = cx1;
        super();
    }

    public final void onScrollChanged()
    {
        int ai[] = cx.a(a);
        if (ai == null || ai.length < 2 && a.a == null || a.a.length < 2 || a.a[1] != ai[1] || a.a[0] != ai[0])
        {
            a.dismiss();
        }
    }
}
