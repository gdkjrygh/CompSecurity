// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//            SearchViewCompat, SearchViewCompatIcs

static class bImpl extends bImpl
{

    public View newSearchView(Context context)
    {
        return SearchViewCompatIcs.newSearchView(context);
    }

    public void setImeOptions(View view, int i)
    {
        SearchViewCompatIcs.setImeOptions(view, i);
    }

    public void setInputType(View view, int i)
    {
        SearchViewCompatIcs.setInputType(view, i);
    }

    bImpl()
    {
    }
}
