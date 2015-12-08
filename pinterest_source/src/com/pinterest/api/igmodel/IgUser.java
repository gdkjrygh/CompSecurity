// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Partner;
import com.pinterest.api.model.User;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgModel, UserVerifiedIdentity, IgPartner

public class IgUser
    implements IgModel
{

    public String A;
    public String B;
    public String C;
    public String D;
    public Boolean E;
    public UserVerifiedIdentity F;
    public IgPartner G;
    public String H;
    public String I;
    public String J;
    public String K;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public String j;
    public String k;
    public String l;
    public Boolean m;
    public Boolean n;
    public Boolean o;
    public Boolean p;
    public Boolean q;
    public Boolean r;
    public Boolean s;
    public Integer t;
    public Integer u;
    public Integer v;
    public Integer w;
    public Integer x;
    public Integer y;
    public String z;

    public IgUser()
    {
    }

    public final User a()
    {
        User user = new User();
        user.setUid(a);
        user.setUsername(h);
        user.setEmail(j);
        user.setFirstName(e);
        user.setLastName(f);
        user.setFullName(g);
        user.setGender(i);
        user.setLocation(l);
        user.setAbout(k);
        user.setImageSmallUrl(b);
        user.setImageMediumUrl(c);
        user.setImageLargeUrl(d);
        user.setIsEmployee(m);
        user.setHasPassword(n);
        user.setEmailVerified(o);
        user.setExplicitFollowing(p);
        user.setImplicitFollowing(q);
        user.setBlocked(r);
        user.setWebsiteVerified(s);
        user.setFollowersCount(v);
        user.setFollowingCount(t);
        user.setInterestFollowingCount(u);
        user.setBoardCount(x);
        user.setPinCount(y);
        user.setLikeCount(w);
        user.setCreatedAt(ModelHelper.stringToDate(z));
        user.setFacebookUrl(A);
        user.setTwitterUrl(B);
        user.setWebsite(C);
        user.setShowImpressum(E);
        user.setImpressumUrl(D);
        user.setLastPinLiked(ModelHelper.stringToDate(I));
        user.setCustomGender(J);
        user.setCanonicalMerchantDomain(K);
        if (F != null)
        {
            user.setVerifiedIdentity(F.a);
        }
        if (G != null)
        {
            Partner partner = G.a();
            user.setPartnerUid(partner.getUid());
            user.cachePartner(partner);
        }
        return user;
    }

    public Object getModel()
    {
        return a();
    }
}
