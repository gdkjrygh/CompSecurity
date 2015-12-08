// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igresponse;

import com.pinterest.api.model.Board;
import com.pinterest.api.model.Domain;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.User;
import com.pinterest.common.async.BackgroundTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.api.igresponse:
//            IgPinFeedResponse

class a extends BackgroundTask
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
            com.pinterest.api.model.se._cls1 _lcls1 = (com.pinterest.api.model.se.b)iterator.next();
            if (_lcls1.in() != null)
            {
                ((List) (obj2)).add(_lcls1.in());
                ((List) (obj5)).add(_lcls1.in().getUid());
            }
            if (_lcls1.oard() != null)
            {
                ((List) (obj1)).add(_lcls1.oard());
                ((List) (obj4)).add(_lcls1.oard().getUid());
            }
            if (_lcls1.ecommendationBoard() != null)
            {
                ((List) (obj1)).add(_lcls1.ecommendationBoard());
                ((List) (obj4)).add(_lcls1.ecommendationBoard().getUid());
            }
            if (_lcls1.ecommendationPin() != null)
            {
                ((List) (obj2)).add(_lcls1.ecommendationPin());
                ((List) (obj5)).add(_lcls1.ecommendationPin().getUid());
            }
            if (_lcls1.ecommendationInterest() != null)
            {
                arraylist2.add(_lcls1.ecommendationInterest());
            }
            if (_lcls1.ser() != null)
            {
                ((List) (obj)).add(_lcls1.ser());
                ((List) (obj3)).add(_lcls1.ser().getUid());
                if (_lcls1.ser().getPartner() != null)
                {
                    arraylist.add(_lcls1.ser().getPartner());
                }
            }
            if (_lcls1.romoterUser() != null)
            {
                ((List) (obj)).add(_lcls1.romoterUser());
                ((List) (obj3)).add(_lcls1.romoterUser().getUid());
                if (_lcls1.romoterUser().getPartner() != null)
                {
                    arraylist.add(_lcls1.romoterUser().getPartner());
                }
            }
            if (_lcls1.iaUser() != null)
            {
                ((List) (obj)).add(_lcls1.iaUser());
                ((List) (obj3)).add(_lcls1.iaUser().getUid());
                if (_lcls1.iaUser().getPartner() != null)
                {
                    arraylist.add(_lcls1.iaUser().getPartner());
                }
            }
            if (_lcls1.lace() != null)
            {
                arraylist1.add(_lcls1.lace());
            }
            if (_lcls1.ourceInterest() != null)
            {
                arraylist2.add(_lcls1.ourceInterest());
            }
            if (_lcls1.omainObj() != null)
            {
                arraylist3.add(_lcls1.omainObj());
                if (_lcls1.omainObj() != null)
                {
                    ((List) (obj)).add(_lcls1.omainObj().getOfficialUser());
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

    (IgPinFeedResponse igpinfeedresponse)
    {
        a = igpinfeedresponse;
        super();
    }
}
