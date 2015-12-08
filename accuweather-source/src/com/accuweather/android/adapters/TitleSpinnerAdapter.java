// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

// Referenced classes of package com.accuweather.android.adapters:
//            LiteTitleSpinnerAdapter

public class TitleSpinnerAdapter extends LiteTitleSpinnerAdapter
{

    private String mTitle;

    public TitleSpinnerAdapter(Context context, int i, List list)
    {
        this(context, i, list, null);
    }

    public TitleSpinnerAdapter(Context context, int i, List list, String s)
    {
        super(context, i, list);
        mTitle = s;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        view = super.getView(i, view, viewgroup);
        if (view.findViewById(com.accuweather.android.R.id.title) != null)
        {
            ((TextView)view.findViewById(com.accuweather.android.R.id.title)).setText(mTitle);
        }
        return view;
    }

    public void setTitle(String s)
    {
        mTitle = s;
    }
}
