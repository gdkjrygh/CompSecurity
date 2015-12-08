// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.network.vast.model;

import java.util.ArrayList;

// Referenced classes of package com.auditude.ads.network.vast.model:
//            VASTAd, VASTWrapperAd

public class VASTDocument
{

    public static final String VERSION_2_0 = "2.0";
    public static final String VERSION_2_0_0 = "2.0.0";
    public static final String VERSION_2_0_1 = "2.0.1";
    public static final String VERSION_3_0 = "3.0";
    public String adTagURI;
    private ArrayList ads;
    public VASTAd parentAd;
    private ArrayList podAds;
    public boolean reachedMaxWrapper;
    private ArrayList standAloneAds;
    private ArrayList ununsedAds;
    private ArrayList usedAds;
    public String version;

    public VASTDocument(VASTAd vastad)
    {
        version = "2.0";
        parentAd = null;
        reachedMaxWrapper = false;
        parentAd = vastad;
        ads = new ArrayList();
        podAds = new ArrayList();
        standAloneAds = new ArrayList();
    }

    public final void addVASTAd(VASTAd vastad)
    {
        if (vastad != null && (vastad.getWrapperAd() == null || parentAd == null || parentAd.getWrapperAd() == null || parentAd.getWrapperAd().followAdditionalWrappers.booleanValue())) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (vastad.getWrapperAd() != null && parentAd != null && parentAd.getWrapperAd() != null && parentAd.getWrapperAd().allowMultipleAds != null && parentAd.getWrapperAd().allowMultipleAds.equalsIgnoreCase("false"))
        {
            vastad.getWrapperAd().allowMultipleAds = "false";
        }
        vastad.setDocument(this);
        ads.add(vastad);
        if (vastad.getSequence() < 0) goto _L4; else goto _L3
_L3:
        Boolean boolean1;
        int i;
        boolean1 = Boolean.valueOf(false);
        i = 0;
_L8:
        if (i < podAds.size()) goto _L6; else goto _L5
_L5:
        if (!boolean1.booleanValue())
        {
            podAds.add(vastad);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (((VASTAd)podAds.get(i)).getSequence() <= vastad.getSequence())
        {
            break; /* Loop/switch isn't completed */
        }
        boolean1 = Boolean.valueOf(true);
        podAds.add(i, vastad);
        if (true) goto _L5; else goto _L7
_L7:
        i++;
        if (true) goto _L8; else goto _L4
_L4:
        standAloneAds.add(vastad);
        return;
        if (true) goto _L1; else goto _L9
_L9:
    }

    public final ArrayList getAds()
    {
        if (parentAd == null || parentAd.getWrapperAd() == null || ads.size() == 0)
        {
            return ads;
        }
        if (usedAds != null)
        {
            return usedAds;
        }
        usedAds = new ArrayList();
        ununsedAds = new ArrayList();
        int i;
        if (parentAd.getWrapperAd().allowMultipleAds != null && parentAd.getWrapperAd().allowMultipleAds.equalsIgnoreCase("false"))
        {
            if (standAloneAds.size() == 0)
            {
                if (podAds.size() > 0)
                {
                    usedAds.add((VASTAd)podAds.get(0));
                }
            } else
            if (podAds.size() == 0)
            {
                usedAds.add((VASTAd)standAloneAds.get(0));
            } else
            {
                usedAds.add((VASTAd)standAloneAds.get(0));
            }
        } else
        if (parentAd.getWrapperAd().allowMultipleAds != null && parentAd.getWrapperAd().allowMultipleAds.equalsIgnoreCase("true"))
        {
            if (podAds.size() > 0)
            {
                usedAds.addAll(podAds);
            } else
            if (standAloneAds.size() > 0)
            {
                usedAds.add((VASTAd)standAloneAds.get(0));
            }
        } else
        {
            usedAds.addAll(ads);
        }
        i = 0;
        do
        {
            if (i >= standAloneAds.size())
            {
                return usedAds;
            }
            if (usedAds.indexOf(standAloneAds.get(i)) < 0)
            {
                ununsedAds.add((VASTAd)standAloneAds.get(i));
            }
            i++;
        } while (true);
    }

    public final VASTAd getNextUnusedAd()
    {
        if (ununsedAds == null || ununsedAds.size() == 0)
        {
            return null;
        } else
        {
            VASTAd vastad = (VASTAd)ununsedAds.get(0);
            ununsedAds.remove(0);
            return vastad;
        }
    }

    public final void replaceAd(VASTAd vastad, VASTAd vastad1)
    {
        getAds();
        if (usedAds != null)
        {
            int i = usedAds.indexOf(vastad);
            if (i >= 0)
            {
                usedAds.set(i, vastad1);
            }
        }
    }
}
