// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.spotify.mobile.android.spotlets.ads.model:
//            Sponsorship

public class Sponsorships
    implements JacksonModel
{

    public static final int DEFAULT_TTL_SECONDS = 1800;
    private ArrayList mSponsorships;
    private long mTTLSeconds;

    public Sponsorships()
    {
    }

    public Sponsorships(ArrayList arraylist)
    {
        this();
        mSponsorships = arraylist;
        mTTLSeconds = 1800L;
    }

    public Sponsorship getSponsorship(String s)
    {
        if (mSponsorships == null)
        {
            return null;
        }
        for (Iterator iterator = mSponsorships.iterator(); iterator.hasNext();)
        {
            Sponsorship sponsorship = (Sponsorship)iterator.next();
            if (sponsorship.isEqual(s))
            {
                return sponsorship;
            }
        }

        return null;
    }

    public ArrayList getSponsorships()
    {
        return mSponsorships;
    }

    public long getTTLSeconds()
    {
        return mTTLSeconds;
    }

    public void preserveDisplayState(Sponsorships sponsorships)
    {
        if (sponsorships != null && sponsorships.getSponsorships() != null)
        {
            sponsorships = sponsorships.getSponsorships();
            Iterator iterator = mSponsorships.iterator();
            while (iterator.hasNext()) 
            {
                Sponsorship sponsorship = (Sponsorship)iterator.next();
                int i = sponsorships.indexOf(sponsorship);
                if (i != -1 && ((Sponsorship)sponsorships.get(i)).wasDisplayedDuringSession())
                {
                    sponsorship.displayedDuringSession();
                }
            }
        }
    }

    public void setSponsorships(ArrayList arraylist)
    {
        mSponsorships = arraylist;
    }

    public void setTTLSeconds(long l)
    {
        mTTLSeconds = l;
    }

    public String toString()
    {
        return (new StringBuilder("Sponsorships{mSponsorships=")).append(mSponsorships).append(", mTTLSeconds=").append(mTTLSeconds).append('}').toString();
    }
}
