// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.search;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.TextView;
import com.netflix.mediaclient.servicemgr.SearchVideo;
import com.netflix.mediaclient.ui.search.SearchResultView;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.ViewUtils;

public class KidsSearchResultView extends SearchResultView
{

    public KidsSearchResultView(Context context)
    {
        super(context);
        init();
    }

    public KidsSearchResultView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void init()
    {
        title.setTextColor(getResources().getColor(0x7f090032));
        ViewUtils.clearShadow(title);
    }

    protected int getYearColorResId()
    {
        return 0x7f090033;
    }

    protected void updateForVideo(SearchVideo searchvideo, int i)
    {
        super.updateForVideo(searchvideo, i);
        searchvideo = searchvideo.getCertification();
        TextView textview = rating;
        if (StringUtils.isEmpty(searchvideo))
        {
            i = 8;
        } else
        {
            i = 0;
        }
        textview.setVisibility(i);
        rating.setText(searchvideo);
    }
}
