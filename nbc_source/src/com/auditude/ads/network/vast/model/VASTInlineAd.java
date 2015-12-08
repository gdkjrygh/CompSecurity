// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.network.vast.model;

import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.auditude.ads.network.vast.model:
//            VASTAdBase, VASTNonLinearCreative, VASTLinearCreative, VASTCompanionCreative

public class VASTInlineAd extends VASTAdBase
{

    public String adTitle;
    public Boolean asInvalideXML;
    private ArrayList companionAds;
    public String companionRequired;
    public String description;
    public VASTLinearCreative linearAd;
    private ArrayList nonLinearAds;
    public String surveyUrl;

    public VASTInlineAd()
    {
        asInvalideXML = Boolean.valueOf(false);
        companionRequired = "none";
    }

    public final void addCompanionAd(VASTCompanionCreative vastcompanioncreative)
    {
        if (vastcompanioncreative == null)
        {
            return;
        }
        if (companionAds == null)
        {
            companionAds = new ArrayList();
        }
        companionAds.add(vastcompanioncreative);
    }

    public final void addNonLinearAd(VASTNonLinearCreative vastnonlinearcreative)
    {
        if (vastnonlinearcreative == null)
        {
            return;
        }
        if (nonLinearAds == null)
        {
            nonLinearAds = new ArrayList();
        }
        nonLinearAds.add(vastnonlinearcreative);
    }

    public final ArrayList getCompanionAds()
    {
        return companionAds;
    }

    public final ArrayList getNonLinearAds()
    {
        return nonLinearAds;
    }

    public void setNonLinearAdTrackingEvents(ArrayList arraylist)
    {
        if (nonLinearAds == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = nonLinearAds.iterator();
_L5:
        if (iterator.hasNext()) goto _L3; else goto _L2
_L2:
        return;
_L3:
        ((VASTNonLinearCreative)iterator.next()).setTrackingEvents(arraylist);
        if (true) goto _L5; else goto _L4
_L4:
    }
}
