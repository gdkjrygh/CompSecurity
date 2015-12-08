// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.content.Context;
import com.netflix.mediaclient.servicemgr.ShowDetails;
import com.netflix.mediaclient.util.StringUtils;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            ShowDetailsFrag

public static class details
    implements r
{

    private final Context context;
    private final ShowDetails details;

    public CharSequence getBasicInfoString()
    {
        return StringUtils.getBasicInfoString(context, details);
    }

    public CharSequence getCreatorsText()
    {
        return StringUtils.createBoldLabeledText(context, 0x7f0c0138, details.getCreators());
    }

    public CharSequence getStarringText()
    {
        return StringUtils.createBoldLabeledText(context, 0x7f0c0137, details.getActors());
    }

    public r(Context context1, ShowDetails showdetails)
    {
        context = context1;
        details = showdetails;
    }
}
