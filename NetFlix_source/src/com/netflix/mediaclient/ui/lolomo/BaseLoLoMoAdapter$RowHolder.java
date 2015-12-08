// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lolomo;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.netflix.mediaclient.ui.lolomo:
//            BaseLoLoMoAdapter

static class defaultTitleColors
{

    public final View contentGroup;
    public final ColorStateList defaultTitleColors;
    public final tent rowContent;
    public final View shelf;
    public final TextView title;

    public void invalidateRequestId()
    {
        if (rowContent == null)
        {
            return;
        } else
        {
            rowContent.invalidateRequestId();
            return;
        }
    }

    tent(View view, TextView textview, tent tent, View view1)
    {
        contentGroup = view;
        title = textview;
        rowContent = tent;
        shelf = view1;
        defaultTitleColors = textview.getTextColors();
    }
}
