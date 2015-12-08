// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.ComponentName;
import android.content.Context;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            SearchViewCompat

static interface mpat
{

    public abstract CharSequence getQuery(View view);

    public abstract boolean isIconified(View view);

    public abstract boolean isQueryRefinementEnabled(View view);

    public abstract boolean isSubmitButtonEnabled(View view);

    public abstract Object newOnCloseListener( );

    public abstract Object newOnQueryTextListener(mpat mpat);

    public abstract View newSearchView(Context context);

    public abstract void setIconified(View view, boolean flag);

    public abstract void setImeOptions(View view, int i);

    public abstract void setInputType(View view, int i);

    public abstract void setMaxWidth(View view, int i);

    public abstract void setOnCloseListener(Object obj, Object obj1);

    public abstract void setOnQueryTextListener(Object obj, Object obj1);

    public abstract void setQuery(View view, CharSequence charsequence, boolean flag);

    public abstract void setQueryHint(View view, CharSequence charsequence);

    public abstract void setQueryRefinementEnabled(View view, boolean flag);

    public abstract void setSearchableInfo(View view, ComponentName componentname);

    public abstract void setSubmitButtonEnabled(View view, boolean flag);
}
