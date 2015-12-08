// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package air.com.nbcuni.com.nbcsports.liveextra;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package air.com.nbcuni.com.nbcsports.liveextra:
//            NationalAlertsWizardActivity

public static class allRsns
{
    public static class RsnDma
    {

        public String dma;
        public String market;
        public String rsn;

        public String toString()
        {
            return (new StringBuilder()).append("RsnDma [dma=").append(dma).append(", rsn=").append(rsn).append(", market=").append(market).append("]").toString();
        }

        public RsnDma()
        {
        }
    }

    public static class RsnDmaList extends ArrayList
    {

        public RsnDmaList()
        {
        }
    }


    public List allRsns;
    public String dma;
    public List matchingRsns;

    public String toString()
    {
        return (new StringBuilder()).append("RsnDmaModel [matchingRsns=").append(matchingRsns).append(", allRsns=").append(allRsns).append(", dma=").append(dma).append("]").toString();
    }

    public RsnDmaList()
    {
        matchingRsns = new ArrayList();
        allRsns = new ArrayList();
    }
}
