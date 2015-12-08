// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.View;
import android.widget.SearchView;

class SearchViewCompatIcs
{
    public static class MySearchView extends SearchView
    {

        public void onActionViewCollapsed()
        {
            setQuery("", false);
            super.onActionViewCollapsed();
        }

        public MySearchView(Context context)
        {
            super(context);
        }
    }


    SearchViewCompatIcs()
    {
    }

    public static View newSearchView(Context context)
    {
        return new MySearchView(context);
    }

    public static void setImeOptions(View view, int i)
    {
        ((SearchView)view).setImeOptions(i);
    }

    public static void setInputType(View view, int i)
    {
        ((SearchView)view).setInputType(i);
    }
}
