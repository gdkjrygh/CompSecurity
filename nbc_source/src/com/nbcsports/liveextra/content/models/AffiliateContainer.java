// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.models;

import java.util.List;

public class AffiliateContainer
{
    public class Affiliate
    {

        int dmaCode;
        int id;
        String station;
        final AffiliateContainer this$0;

        public int getDmaCode()
        {
            return dmaCode;
        }

        public int getId()
        {
            return id;
        }

        public String getStation()
        {
            return station;
        }

        public Affiliate()
        {
            this$0 = AffiliateContainer.this;
            super();
        }
    }


    List affiliates;

    public AffiliateContainer()
    {
    }

    public List getAffiliates()
    {
        return affiliates;
    }
}
