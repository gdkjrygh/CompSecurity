// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.pinterest.api.model.Interest;
import com.pinterest.api.model.ModelHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgModel, InterestImages, InterestImageDetail, IgPin

public class IgInterest
    implements IgModel
{

    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public Boolean g;
    public String h;
    public Integer i;
    public String j;
    public InterestImages k;
    public List l;

    public IgInterest()
    {
        i = Integer.valueOf(-1);
    }

    public final Interest a()
    {
        Interest interest = new Interest();
        interest.setUid(a);
        interest.setKey(b);
        interest.setName(c);
        interest.setUrlName(d);
        if (f != null)
        {
            interest.setDominantColor(f.replace("null", "").replace("[", "").replace("]", ""));
        }
        interest.setImageSignature(e);
        interest.setFollowing(g);
        interest.setFeedUpdatedTime(ModelHelper.stringToDate(h));
        interest.setPinnerCount(i);
        interest.setRecommendationSource(j);
        Object obj;
        if (k != null)
        {
            if (k.a != null)
            {
                interest.setImageSmallUrl(k.a.a);
                interest.setImageSmallWidth(Integer.valueOf(k.a.b));
                interest.setImageSmallHeight(Integer.valueOf(k.a.c));
            }
            Iterator iterator;
            if (k.b != null)
            {
                obj = k.b;
            } else
            {
                obj = k.c;
            }
            if (obj != null)
            {
                interest.setImageHeaderUrl(((InterestImageDetail) (obj)).a);
                interest.setImageHeaderWidth(Integer.valueOf(((InterestImageDetail) (obj)).b));
                interest.setImageHeaderHeight(Integer.valueOf(((InterestImageDetail) (obj)).c));
            }
            if (k.d != null)
            {
                interest.setImageGridLg4LineUrl(k.d.a);
                interest.setImageGridLg4LineWidth(Integer.valueOf(k.d.b));
                interest.setImageGridLg4LineHeight(Integer.valueOf(k.d.c));
            }
            if (k.e != null)
            {
                interest.setImageGridLg2LineUrl(k.e.a);
                interest.setImageGridLg2LineWidth(Integer.valueOf(k.e.b));
                interest.setImageGridLg2LineHeight(Integer.valueOf(k.e.c));
            }
            if (k.f != null)
            {
                interest.setImageGridMed4LineUrl(k.f.a);
                interest.setImageGridMed4LineWidth(Integer.valueOf(k.f.b));
                interest.setImageGridMed4LineHeight(Integer.valueOf(k.f.c));
            }
            if (k.g != null)
            {
                interest.setImageGridMed2LineUrl(k.g.a);
                interest.setImageGridMed2LineWidth(Integer.valueOf(k.g.b));
                interest.setImageGridMed2LineHeight(Integer.valueOf(k.g.c));
            }
            if (k.h != null)
            {
                interest.setImageGridMed1LineUrl(k.h.a);
                interest.setImageGridMed1LineWidth(Integer.valueOf(k.h.b));
                interest.setImageGridMed1LineHeight(Integer.valueOf(k.h.c));
            }
        }
        if (l != null)
        {
            obj = new ArrayList();
            for (iterator = l.iterator(); iterator.hasNext(); ((ArrayList) (obj)).add(((IgPin)iterator.next()).a().getPin())) { }
            interest.setRecommendationPins(((ArrayList) (obj)));
        }
        return interest;
    }

    public Object getModel()
    {
        return a();
    }
}
