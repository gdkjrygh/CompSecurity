// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.photos.search.SearchActivity;

public final class hrh
    implements nug
{

    private SearchActivity a;

    public hrh(SearchActivity searchactivity)
    {
        a = searchactivity;
        super();
    }

    public final void b_(Object obj)
    {
        obj = (hyy)obj;
        com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView expandingscrollview = SearchActivity.a(a);
        boolean flag;
        if (!((hyy) (obj)).b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        expandingscrollview.i = flag;
    }
}
