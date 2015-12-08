// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            SearchViewCompat, SearchViewCompatHoneycomb

static class _cls1.val.listener extends _cls1.val.listener
{

    public Object newOnQueryTextListener(final _cls1.val.listener listener)
    {
        return SearchViewCompatHoneycomb.newOnQueryTextListener(new SearchViewCompatHoneycomb.OnQueryTextListenerCompatBridge() {

            final SearchViewCompat.SearchViewCompatHoneycombImpl this$0;
            final SearchViewCompat.OnQueryTextListenerCompat val$listener;

            public boolean onQueryTextChange(String s)
            {
                return listener.onQueryTextChange(s);
            }

            public boolean onQueryTextSubmit(String s)
            {
                return listener.onQueryTextSubmit(s);
            }

            
            {
                this$0 = SearchViewCompat.SearchViewCompatHoneycombImpl.this;
                listener = onquerytextlistenercompat;
                super();
            }
        });
    }

    public View newSearchView(Context context)
    {
        return SearchViewCompatHoneycomb.newSearchView(context);
    }

    public void setOnQueryTextListener(Object obj, Object obj1)
    {
        SearchViewCompatHoneycomb.setOnQueryTextListener(obj, obj1);
    }

    _cls1.val.listener()
    {
    }
}
