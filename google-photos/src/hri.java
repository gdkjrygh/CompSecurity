// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.search.SearchActivity;

public final class hri
    implements nug
{

    private SearchActivity a;

    public hri(SearchActivity searchactivity)
    {
        a = searchactivity;
        super();
    }

    public final void b_(Object obj)
    {
        obj = (hxh)obj;
        com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView expandingscrollview = SearchActivity.a(a);
        boolean flag;
        if (!((hxh) (obj)).e())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        expandingscrollview.i = flag;
    }
}
