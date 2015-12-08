// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            SearchViewCompatHoneycomb

public class SearchViewCompat
{
    public static abstract class OnQueryTextListenerCompat
    {

        final Object mListener = SearchViewCompat.IMPL.newOnQueryTextListener(this);

        public boolean onQueryTextChange(String s)
        {
            return false;
        }

        public boolean onQueryTextSubmit(String s)
        {
            return false;
        }

        public OnQueryTextListenerCompat()
        {
        }
    }

    static class SearchViewCompatHoneycombImpl extends SearchViewCompatStubImpl
    {

        public Object newOnQueryTextListener(OnQueryTextListenerCompat onquerytextlistenercompat)
        {
            return SearchViewCompatHoneycomb.newOnQueryTextListener(onquerytextlistenercompat. new SearchViewCompatHoneycomb.OnQueryTextListenerCompatBridge() {

                final SearchViewCompatHoneycombImpl this$0;
                final OnQueryTextListenerCompat val$listener;

                public boolean onQueryTextChange(String s)
                {
                    return listener.onQueryTextChange(s);
                }

                public boolean onQueryTextSubmit(String s)
                {
                    return listener.onQueryTextSubmit(s);
                }

            
            {
                this$0 = final_searchviewcompathoneycombimpl;
                listener = OnQueryTextListenerCompat.this;
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

        SearchViewCompatHoneycombImpl()
        {
        }
    }

    static interface SearchViewCompatImpl
    {

        public abstract Object newOnQueryTextListener(OnQueryTextListenerCompat onquerytextlistenercompat);

        public abstract View newSearchView(Context context);

        public abstract void setOnQueryTextListener(Object obj, Object obj1);
    }

    static class SearchViewCompatStubImpl
        implements SearchViewCompatImpl
    {

        public Object newOnQueryTextListener(OnQueryTextListenerCompat onquerytextlistenercompat)
        {
            return null;
        }

        public View newSearchView(Context context)
        {
            return null;
        }

        public void setOnQueryTextListener(Object obj, Object obj1)
        {
        }

        SearchViewCompatStubImpl()
        {
        }
    }


    private static final SearchViewCompatImpl IMPL;

    private SearchViewCompat(Context context)
    {
    }

    public static View newSearchView(Context context)
    {
        return IMPL.newSearchView(context);
    }

    public static void setOnQueryTextListener(View view, OnQueryTextListenerCompat onquerytextlistenercompat)
    {
        IMPL.setOnQueryTextListener(view, onquerytextlistenercompat.mListener);
    }

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            IMPL = new SearchViewCompatHoneycombImpl();
        } else
        {
            IMPL = new SearchViewCompatStubImpl();
        }
    }

}
