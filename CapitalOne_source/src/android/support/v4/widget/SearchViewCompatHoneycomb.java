// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.View;
import android.widget.SearchView;

class SearchViewCompatHoneycomb
{
    static interface OnQueryTextListenerCompatBridge
    {

        public abstract boolean onQueryTextChange(String s);

        public abstract boolean onQueryTextSubmit(String s);
    }


    SearchViewCompatHoneycomb()
    {
    }

    public static Object newOnQueryTextListener(OnQueryTextListenerCompatBridge onquerytextlistenercompatbridge)
    {
        return new android.widget.SearchView.OnQueryTextListener(onquerytextlistenercompatbridge) {

            final OnQueryTextListenerCompatBridge val$listener;

            public boolean onQueryTextChange(String s)
            {
                return listener.onQueryTextChange(s);
            }

            public boolean onQueryTextSubmit(String s)
            {
                return listener.onQueryTextSubmit(s);
            }

            
            {
                listener = onquerytextlistenercompatbridge;
                super();
            }
        };
    }

    public static View newSearchView(Context context)
    {
        return new SearchView(context);
    }

    public static void setOnQueryTextListener(Object obj, Object obj1)
    {
        ((SearchView)obj).setOnQueryTextListener((android.widget.SearchView.OnQueryTextListener)obj1);
    }
}
