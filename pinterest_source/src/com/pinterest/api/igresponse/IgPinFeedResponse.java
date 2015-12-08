// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igresponse;

import com.pinterest.api.ApiResponse;
import com.pinterest.api.igmodel.IgPin;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.PinFeed;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.api.igresponse:
//            IgResponse

public class IgPinFeedResponse extends IgResponse
{

    protected List a;
    protected List b;

    public IgPinFeedResponse()
    {
        b = new ArrayList();
    }

    private PinFeed d()
    {
        PinFeed pinfeed = new PinFeed();
        a(pinfeed);
        ArrayList arraylist = new ArrayList();
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            com.pinterest.api.model.Pin.PinArtifact pinartifact = (com.pinterest.api.model.Pin.PinArtifact)iterator.next();
            Pin pin = pinartifact.getPin();
            if (pin != null && "pin".equals(pin.getType()))
            {
                arraylist.add(pinartifact.getPin());
            }
        } while (true);
        pinfeed.setItems(arraylist);
        pinfeed.setData(null);
        return pinfeed;
    }

    public final void a()
    {
        if (a != null)
        {
            com.pinterest.api.model.Pin.PinArtifact pinartifact;
            for (Iterator iterator = a.iterator(); iterator.hasNext(); b.add(pinartifact))
            {
                pinartifact = ((IgPin)iterator.next()).a();
            }

        }
    }

    public final void b()
    {
        (new _cls1()).execute();
    }

    public final ApiResponse c()
    {
        return d();
    }

    private class _cls1 extends BackgroundTask
    {

        final IgPinFeedResponse a;

        public void run()
        {
            Object obj5 = new ArrayList();
            Object obj4 = new ArrayList();
            Object obj3 = new ArrayList();
            Object obj1 = new ArrayList();
            Object obj = new ArrayList();
            ArrayList arraylist = new ArrayList();
            ArrayList arraylist1 = new ArrayList();
            ArrayList arraylist2 = new ArrayList();
            ArrayList arraylist3 = new ArrayList();
            Object obj2 = new ArrayList();
            Iterator iterator = a.b.iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                com.pinterest.api.model.Pin.PinArtifact pinartifact = (com.pinterest.api.model.Pin.PinArtifact)iterator.next();
                if (pinartifact.getPin() != null)
                {
                    ((List) (obj2)).add(pinartifact.getPin());
                    ((List) (obj5)).add(pinartifact.getPin().getUid());
                }
                if (pinartifact.getBoard() != null)
                {
                    ((List) (obj1)).add(pinartifact.getBoard());
                    ((List) (obj4)).add(pinartifact.getBoard().getUid());
                }
                if (pinartifact.getRecommendationBoard() != null)
                {
                    ((List) (obj1)).add(pinartifact.getRecommendationBoard());
                    ((List) (obj4)).add(pinartifact.getRecommendationBoard().getUid());
                }
                if (pinartifact.getRecommendationPin() != null)
                {
                    ((List) (obj2)).add(pinartifact.getRecommendationPin());
                    ((List) (obj5)).add(pinartifact.getRecommendationPin().getUid());
                }
                if (pinartifact.getRecommendationInterest() != null)
                {
                    arraylist2.add(pinartifact.getRecommendationInterest());
                }
                if (pinartifact.getUser() != null)
                {
                    ((List) (obj)).add(pinartifact.getUser());
                    ((List) (obj3)).add(pinartifact.getUser().getUid());
                    if (pinartifact.getUser().getPartner() != null)
                    {
                        arraylist.add(pinartifact.getUser().getPartner());
                    }
                }
                if (pinartifact.getPromoterUser() != null)
                {
                    ((List) (obj)).add(pinartifact.getPromoterUser());
                    ((List) (obj3)).add(pinartifact.getPromoterUser().getUid());
                    if (pinartifact.getPromoterUser().getPartner() != null)
                    {
                        arraylist.add(pinartifact.getPromoterUser().getPartner());
                    }
                }
                if (pinartifact.getViaUser() != null)
                {
                    ((List) (obj)).add(pinartifact.getViaUser());
                    ((List) (obj3)).add(pinartifact.getViaUser().getUid());
                    if (pinartifact.getViaUser().getPartner() != null)
                    {
                        arraylist.add(pinartifact.getViaUser().getPartner());
                    }
                }
                if (pinartifact.getPlace() != null)
                {
                    arraylist1.add(pinartifact.getPlace());
                }
                if (pinartifact.getSourceInterest() != null)
                {
                    arraylist2.add(pinartifact.getSourceInterest());
                }
                if (pinartifact.getDomainObj() != null)
                {
                    arraylist3.add(pinartifact.getDomainObj());
                    if (pinartifact.getDomainObj() != null)
                    {
                        ((List) (obj)).add(pinartifact.getDomainObj().getOfficialUser());
                    }
                }
            } while (true);
            obj5 = ModelHelper.getPins(((List) (obj5)));
            obj4 = ModelHelper.getBoards(((List) (obj4)));
            obj3 = ModelHelper.getUsers(((List) (obj3)));
            obj2 = Pin.mergeAll(((List) (obj2)), ((List) (obj5)));
            obj1 = Board.mergeAll(((List) (obj1)), ((List) (obj4)));
            obj = User.mergeAll(((List) (obj)), ((List) (obj3)));
            ModelHelper.setPins(((List) (obj2)));
            ModelHelper.setBoards(((List) (obj1)));
            ModelHelper.setPartners(arraylist);
            ModelHelper.setUsers(((List) (obj)));
            ModelHelper.setPlaces(arraylist1);
            ModelHelper.setInterests(arraylist2);
            ModelHelper.setDomains(arraylist3);
        }

        _cls1()
        {
            a = IgPinFeedResponse.this;
            super();
        }
    }

}
