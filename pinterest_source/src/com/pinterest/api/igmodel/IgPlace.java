// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.pinterest.api.model.Place;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgModel

public class IgPlace
    implements IgModel
{

    public String a;
    public String b;
    public Double c;
    public Double d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public String q;
    public String r;
    public String s;
    public Boolean t;

    public IgPlace()
    {
    }

    public final Place a()
    {
        Place place = new Place();
        place.setUid(a);
        place.setSearchId(b);
        place.setLatitude(c);
        place.setLongitude(d);
        place.setCategory(e);
        place.setSourceIcon(f);
        place.setSourceName(g);
        place.setName(h);
        place.setLocality(i);
        place.setUrl(j);
        place.setCountry(k);
        place.setRegion(l);
        place.setSourceUrl(m);
        place.setPhone(n);
        place.setStreet(o);
        place.setPostalCode(p);
        place.setType(q);
        place.setAccess(r);
        place.setTips(s);
        place.setFromPinJoin(t);
        return place;
    }

    public Object getModel()
    {
        return a();
    }
}
