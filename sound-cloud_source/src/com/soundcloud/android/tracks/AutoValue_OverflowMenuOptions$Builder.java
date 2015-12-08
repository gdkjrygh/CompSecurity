// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;


// Referenced classes of package com.soundcloud.android.tracks:
//            AutoValue_OverflowMenuOptions, OverflowMenuOptions

static final class  extends 
{

    private Boolean showAllEngagements;
    private Boolean showOffline;

    public final OverflowMenuOptions build()
    {
        String s = "";
        if (showOffline == null)
        {
            s = (new StringBuilder()).append("").append(" showOffline").toString();
        }
        String s1 = s;
        if (showAllEngagements == null)
        {
            s1 = (new StringBuilder()).append(s).append(" showAllEngagements").toString();
        }
        if (!s1.isEmpty())
        {
            throw new IllegalStateException((new StringBuilder("Missing required properties:")).append(s1).toString());
        } else
        {
            return new AutoValue_OverflowMenuOptions(showOffline.booleanValue(), showAllEngagements.booleanValue(), null);
        }
    }

    public final showAllEngagements showAllEngagements(boolean flag)
    {
        showAllEngagements = Boolean.valueOf(flag);
        return this;
    }

    public final showAllEngagements showOffline(boolean flag)
    {
        showOffline = Boolean.valueOf(flag);
        return this;
    }

    I()
    {
    }

    I(OverflowMenuOptions overflowmenuoptions)
    {
        showOffline = Boolean.valueOf(overflowmenuoptions.showOffline());
        showAllEngagements = Boolean.valueOf(overflowmenuoptions.showAllEngagements());
    }
}
