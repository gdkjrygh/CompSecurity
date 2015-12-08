// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            SearchView

final class ar
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    final SearchView a;

    ar(SearchView searchview)
    {
        a = searchview;
        super();
    }

    public final void onGlobalLayout()
    {
        SearchView.d(a);
    }
}
