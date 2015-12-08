// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgUser, IgPartner__JsonHelper, UserVerifiedIdentity__JsonHelper

public final class IgUser__JsonHelper
{

    public static IgUser a(JsonParser jsonparser)
    {
        IgUser iguser = new IgUser();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
        while (jsonparser.a() != JsonToken.c) 
        {
            String s = jsonparser.d();
            jsonparser.a();
            if ("last_name".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                iguser.f = s;
            } else
            if ("interest_following_count".equals(s))
            {
                iguser.u = Integer.valueOf(jsonparser.i());
            } else
            if ("partner".equals(s))
            {
                iguser.G = IgPartner__JsonHelper.a(jsonparser);
            } else
            if ("gender".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                iguser.i = s;
            } else
            if ("explicitly_followed_by_me".equals(s))
            {
                iguser.p = Boolean.valueOf(jsonparser.l());
            } else
            if ("impressum_url".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                iguser.D = s;
            } else
            if ("show_impressum".equals(s))
            {
                iguser.E = Boolean.valueOf(jsonparser.l());
            } else
            if ("twitter_url".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                iguser.B = s;
            } else
            if ("about".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                iguser.k = s;
            } else
            if ("like_count".equals(s))
            {
                iguser.w = Integer.valueOf(jsonparser.i());
            } else
            if ("has_password".equals(s))
            {
                iguser.n = Boolean.valueOf(jsonparser.l());
            } else
            if ("following_count".equals(s))
            {
                iguser.t = Integer.valueOf(jsonparser.i());
            } else
            if ("id".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                iguser.a = s;
            } else
            if ("created_at".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                iguser.z = s;
            } else
            if ("facebook_url".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                iguser.A = s;
            } else
            if ("domain_verified".equals(s))
            {
                iguser.s = Boolean.valueOf(jsonparser.l());
            } else
            if ("pin_thumbnail_urls".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                iguser.H = s;
            } else
            if ("email".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                iguser.j = s;
            } else
            if ("custom_gender".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                iguser.J = s;
            } else
            if ("image_large_url".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                iguser.d = s;
            } else
            if ("is_employee".equals(s))
            {
                iguser.m = Boolean.valueOf(jsonparser.l());
            } else
            if ("website_url".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                iguser.C = s;
            } else
            if ("board_count".equals(s))
            {
                iguser.x = Integer.valueOf(jsonparser.i());
            } else
            if ("image_medium_url".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                iguser.c = s;
            } else
            if ("blocked_by_me".equals(s))
            {
                iguser.r = Boolean.valueOf(jsonparser.l());
            } else
            if ("full_name".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                iguser.g = s;
            } else
            if ("image_small_url".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                iguser.b = s;
            } else
            if ("first_name".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                iguser.e = s;
            } else
            if ("email_verified".equals(s))
            {
                iguser.o = Boolean.valueOf(jsonparser.l());
            } else
            if ("pin_count".equals(s))
            {
                iguser.y = Integer.valueOf(jsonparser.i());
            } else
            if ("last_pin_like_time".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                iguser.I = s;
            } else
            if ("canonical_merchant_domain".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                iguser.K = s;
            } else
            if ("implicitly_followed_by_me".equals(s))
            {
                iguser.q = Boolean.valueOf(jsonparser.l());
            } else
            if ("location".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                iguser.l = s;
            } else
            if ("follower_count".equals(s))
            {
                iguser.v = Integer.valueOf(jsonparser.i());
            } else
            if ("verified_identity".equals(s))
            {
                iguser.F = UserVerifiedIdentity__JsonHelper.a(jsonparser);
            } else
            if ("username".equals(s))
            {
                String s1;
                if (jsonparser.c() == JsonToken.m)
                {
                    s1 = null;
                } else
                {
                    s1 = jsonparser.f();
                }
                iguser.h = s1;
            }
            jsonparser.b();
        }
        return iguser;
    }
}
