// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.databinding.adapters;

import android.widget.SearchView;

public class SearchViewBindingAdapter
{
    public static interface OnQueryTextChange
    {

        public abstract boolean onQueryTextChange(String s);
    }

    public static interface OnQueryTextSubmit
    {

        public abstract boolean onQueryTextSubmit(String s);
    }

    public static interface OnSuggestionClick
    {

        public abstract boolean onSuggestionClick(int i);
    }

    public static interface OnSuggestionSelect
    {

        public abstract boolean onSuggestionSelect(int i);
    }


    public SearchViewBindingAdapter()
    {
    }

    public static void setListener(SearchView searchview, OnQueryTextChange onquerytextchange)
    {
        setListener(searchview, ((OnQueryTextSubmit) (null)), onquerytextchange);
    }

    public static void setListener(SearchView searchview, OnQueryTextSubmit onquerytextsubmit)
    {
        setListener(searchview, onquerytextsubmit, ((OnQueryTextChange) (null)));
    }

    public static void setListener(SearchView searchview, OnQueryTextSubmit onquerytextsubmit, OnQueryTextChange onquerytextchange)
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                if (onquerytextsubmit != null || onquerytextchange != null)
                {
                    break label0;
                }
                searchview.setOnQueryTextListener(null);
            }
            return;
        }
        searchview.setOnQueryTextListener(new android.widget.SearchView.OnQueryTextListener(onquerytextsubmit, onquerytextchange) {

            final OnQueryTextChange val$change;
            final OnQueryTextSubmit val$submit;

            public boolean onQueryTextChange(String s)
            {
                if (change != null)
                {
                    return change.onQueryTextChange(s);
                } else
                {
                    return false;
                }
            }

            public boolean onQueryTextSubmit(String s)
            {
                if (submit != null)
                {
                    return submit.onQueryTextSubmit(s);
                } else
                {
                    return false;
                }
            }

            
            {
                submit = onquerytextsubmit;
                change = onquerytextchange;
                super();
            }
        });
    }

    public static void setListener(SearchView searchview, OnSuggestionClick onsuggestionclick)
    {
        setListener(searchview, ((OnSuggestionSelect) (null)), onsuggestionclick);
    }

    public static void setListener(SearchView searchview, OnSuggestionSelect onsuggestionselect)
    {
        setListener(searchview, onsuggestionselect, ((OnSuggestionClick) (null)));
    }

    public static void setListener(SearchView searchview, OnSuggestionSelect onsuggestionselect, OnSuggestionClick onsuggestionclick)
    {
label0:
        {
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                if (onsuggestionselect != null || onsuggestionclick != null)
                {
                    break label0;
                }
                searchview.setOnSuggestionListener(null);
            }
            return;
        }
        searchview.setOnSuggestionListener(new android.widget.SearchView.OnSuggestionListener(onsuggestionselect, onsuggestionclick) {

            final OnSuggestionClick val$change;
            final OnSuggestionSelect val$submit;

            public boolean onSuggestionClick(int i)
            {
                if (change != null)
                {
                    return change.onSuggestionClick(i);
                } else
                {
                    return false;
                }
            }

            public boolean onSuggestionSelect(int i)
            {
                if (submit != null)
                {
                    return submit.onSuggestionSelect(i);
                } else
                {
                    return false;
                }
            }

            
            {
                submit = onsuggestionselect;
                change = onsuggestionclick;
                super();
            }
        });
    }
}
