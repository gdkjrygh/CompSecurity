// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//            SearchView

final class a
    implements android.view.ver.OnGlobalLayoutListener
{

    final SearchView a;

    public final void onGlobalLayout()
    {
        SearchView.d(a);
    }

    ayoutListener(SearchView searchview)
    {
        a = searchview;
        super();
    }
}
