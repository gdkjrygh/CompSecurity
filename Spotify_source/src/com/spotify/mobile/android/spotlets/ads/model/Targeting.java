// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.spotlets.ads.model:
//            Targetings

public class Targeting
    implements JacksonModel
{

    private List mTargetings;

    public Targeting()
    {
    }

    public Targeting(List list)
    {
        mTargetings = list;
    }

    public Map getCustomTargetings()
    {
        while (mTargetings == null || mTargetings.isEmpty() || mTargetings.get(0) == null) 
        {
            return null;
        }
        return ((Targetings)mTargetings.get(0)).getCustomTargetings();
    }

    public List getTargetings()
    {
        return mTargetings;
    }

    public void setTargetings(List list)
    {
        mTargetings = list;
    }
}
