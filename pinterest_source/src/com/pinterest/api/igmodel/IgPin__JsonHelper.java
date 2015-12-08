// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.pinterest.api.igmodel.metadata.IgPinMetadata__JsonHelper;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgPin, PinJoin__JsonHelper, PinRecommendationReason__JsonHelper, IgAggregatedPinData__JsonHelper, 
//            IgPlace__JsonHelper, PinImages__JsonHelper, IgUser__JsonHelper, IgBoard__JsonHelper, 
//            PinEmbed__JsonHelper, PinViewTag__JsonHelper, PinAttribution__JsonHelper, IgBuyableProduct__JsonHelper, 
//            IgInterest__JsonHelper, PinCinematicData__JsonHelper, IgDomain__JsonHelper, IgPinGalleryItem__JsonHelper, 
//            PinRichSummary__JsonHelper

public final class IgPin__JsonHelper
{

    public static IgPin a(JsonParser jsonparser)
    {
        IgPin igpin = new IgPin();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
        while (jsonparser.a() != JsonToken.c) 
        {
            Object obj = jsonparser.d();
            jsonparser.a();
            if ("rich_metadata".equals(obj))
            {
                igpin.c = IgPinMetadata__JsonHelper.a(jsonparser);
            } else
            if ("additional_hide_reasons".equals(obj))
            {
                if (jsonparser.c() == JsonToken.d)
                {
                    ArrayList arraylist = new ArrayList();
                    do
                    {
                        obj = arraylist;
                        if (jsonparser.a() == JsonToken.e)
                        {
                            break;
                        }
                        obj = Integer.valueOf(jsonparser.i());
                        if (obj != null)
                        {
                            arraylist.add(obj);
                        }
                    } while (true);
                } else
                {
                    obj = null;
                }
                igpin.T = ((List) (obj));
            } else
            if ("is_downstream_promotion".equals(obj))
            {
                igpin.h = Boolean.valueOf(jsonparser.l());
            } else
            if ("pin_join".equals(obj))
            {
                igpin.m = PinJoin__JsonHelper.a(jsonparser);
            } else
            if ("tracked_link".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igpin.A = ((String) (obj));
            } else
            if ("recommendation_reason".equals(obj))
            {
                igpin.r = PinRecommendationReason__JsonHelper.a(jsonparser);
            } else
            if ("description".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igpin.z = ((String) (obj));
            } else
            if ("aggregated_pin_data".equals(obj))
            {
                igpin.n = IgAggregatedPinData__JsonHelper.a(jsonparser);
            } else
            if ("like_count".equals(obj))
            {
                igpin.I = jsonparser.i();
            } else
            if ("place_summary".equals(obj))
            {
                igpin.e = IgPlace__JsonHelper.a(jsonparser);
            } else
            if ("is_video".equals(obj))
            {
                igpin.M = Boolean.valueOf(jsonparser.l());
            } else
            if ("type".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igpin.G = ((String) (obj));
            } else
            if ("insertion_id".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igpin.b = ((String) (obj));
            } else
            if ("liked_by_me".equals(obj))
            {
                igpin.L = Boolean.valueOf(jsonparser.l());
            } else
            if ("id".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igpin.a = ((String) (obj));
            } else
            if ("created_at".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igpin.x = ((String) (obj));
            } else
            if ("dominant_color".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igpin.N = ((String) (obj));
            } else
            if ("repin_count".equals(obj))
            {
                igpin.H = jsonparser.i();
            } else
            if ("images".equals(obj))
            {
                igpin.p = PinImages__JsonHelper.a(jsonparser);
            } else
            if ("link".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igpin.B = ((String) (obj));
            } else
            if ("via_pinner".equals(obj))
            {
                igpin.i = IgUser__JsonHelper.a(jsonparser);
            } else
            if ("pinned_to_board".equals(obj))
            {
                igpin.k = IgBoard__JsonHelper.a(jsonparser);
            } else
            if ("promoter".equals(obj))
            {
                igpin.g = IgUser__JsonHelper.a(jsonparser);
            } else
            if ("place".equals(obj))
            {
                igpin.d = IgPlace__JsonHelper.a(jsonparser);
            } else
            if ("image_large_url".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igpin.F = ((String) (obj));
            } else
            if ("embed".equals(obj))
            {
                igpin.q = PinEmbed__JsonHelper.a(jsonparser);
            } else
            if ("image_signature".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igpin.R = ((String) (obj));
            } else
            if ("view_tags".equals(obj))
            {
                if (jsonparser.c() == JsonToken.d)
                {
                    ArrayList arraylist1 = new ArrayList();
                    do
                    {
                        obj = arraylist1;
                        if (jsonparser.a() == JsonToken.e)
                        {
                            break;
                        }
                        obj = PinViewTag__JsonHelper.a(jsonparser);
                        if (obj != null)
                        {
                            arraylist1.add(obj);
                        }
                    } while (true);
                } else
                {
                    obj = null;
                }
                igpin.t = ((List) (obj));
            } else
            if ("image_medium_url".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igpin.E = ((String) (obj));
            } else
            if ("attribution".equals(obj))
            {
                igpin.l = PinAttribution__JsonHelper.a(jsonparser);
            } else
            if ("mobile_link".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igpin.C = ((String) (obj));
            } else
            if ("board".equals(obj))
            {
                igpin.j = IgBoard__JsonHelper.a(jsonparser);
            } else
            if ("buyable_product".equals(obj))
            {
                igpin.S = IgBuyableProduct__JsonHelper.a(jsonparser);
            } else
            if ("image_square_url".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igpin.D = ((String) (obj));
            } else
            if ("comment_count".equals(obj))
            {
                igpin.J = jsonparser.i();
            } else
            if ("is_promoted".equals(obj))
            {
                igpin.Q = Boolean.valueOf(jsonparser.l());
            } else
            if ("source_interest".equals(obj))
            {
                igpin.s = IgInterest__JsonHelper.a(jsonparser);
            } else
            if ("domain".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igpin.y = ((String) (obj));
            } else
            if ("is_cinematic".equals(obj))
            {
                igpin.P = Boolean.valueOf(jsonparser.l());
            } else
            if ("cinematic_data".equals(obj))
            {
                igpin.w = PinCinematicData__JsonHelper.a(jsonparser);
            } else
            if ("link_domain".equals(obj))
            {
                igpin.u = IgDomain__JsonHelper.a(jsonparser);
            } else
            if ("gallery".equals(obj))
            {
                if (jsonparser.c() == JsonToken.d)
                {
                    ArrayList arraylist2 = new ArrayList();
                    do
                    {
                        obj = arraylist2;
                        if (jsonparser.a() == JsonToken.e)
                        {
                            break;
                        }
                        obj = IgPinGalleryItem__JsonHelper.a(jsonparser);
                        if (obj != null)
                        {
                            arraylist2.add(obj);
                        }
                    } while (true);
                } else
                {
                    obj = null;
                }
                igpin.v = ((List) (obj));
            } else
            if ("pinner".equals(obj))
            {
                igpin.f = IgUser__JsonHelper.a(jsonparser);
            } else
            if ("edited_fields".equals(obj))
            {
                if (jsonparser.c() == JsonToken.d)
                {
                    ArrayList arraylist3 = new ArrayList();
                    do
                    {
                        obj = arraylist3;
                        if (jsonparser.a() == JsonToken.e)
                        {
                            break;
                        }
                        if (jsonparser.c() == JsonToken.m)
                        {
                            obj = null;
                        } else
                        {
                            obj = jsonparser.f();
                        }
                        if (obj != null)
                        {
                            arraylist3.add(obj);
                        }
                    } while (true);
                } else
                {
                    obj = null;
                }
                igpin.U = ((List) (obj));
            } else
            if ("rich_summary".equals(obj))
            {
                igpin.o = PinRichSummary__JsonHelper.a(jsonparser);
            } else
            if ("is_repin".equals(obj))
            {
                igpin.K = Boolean.valueOf(jsonparser.l());
            } else
            if ("cacheable_id".equals(obj))
            {
                String s;
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igpin.O = s;
            }
            jsonparser.b();
        }
        return igpin;
    }
}
