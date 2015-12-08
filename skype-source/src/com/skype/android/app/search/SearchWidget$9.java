// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;


// Referenced classes of package com.skype.android.app.search:
//            SearchWidget

final class this._cls0
    implements android.support.v7.widget.._cls9
{

    final SearchWidget this$0;

    public final boolean onQueryTextChange(String s)
    {
        SearchWidget.access$500(SearchWidget.this, s);
        return true;
    }

    public final boolean onQueryTextSubmit(String s)
    {
        return false;
    }

    ()
    {
        this$0 = SearchWidget.this;
        super();
    }
}
