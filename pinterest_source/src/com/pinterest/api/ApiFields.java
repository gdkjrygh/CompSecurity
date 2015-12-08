// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import com.pinterest.activity.commerce.util.CommerceHelper;
import com.pinterest.base.Device;
import com.pinterest.experiment.Experiments;
import com.pinterest.kit.utils.PStringUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.StringUtils;

public class ApiFields
{

    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F = a(new String[] {
        "user.id", "user.type", "user.username", "user.full_name", "user.image_large_url", "board.id", "board.image_thumbnail_url", "board.type", "board.url", "board.name", 
        "pin.id", "pin.type", "pin.id", "pin.images[136x136,236x,474x,736x]"
    });
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J = a(new String[] {
        ai, "interest.is_followed", "interest.follower_count", "board.followed_by_me", "user.explicitly_followed_by_me", "user.implicitly_followed_by_me", "user.board_count", "board.owner()", "board.recommendation_reason()", "board.pin_count", 
        "user.image_large_url", "board.images[90x90]"
    });
    public static final String K;
    public static final String L = a(new String[] {
        "interest.id", "interest.name", "interest.key"
    });
    public static final String M;
    public static final String N;
    private static final int O;
    private static final String P;
    private static final String Q;
    private static final String R = a(new String[] {
        "75x75", "150x150(ir.12)", "150x150(ir.24)", "150x150(ir.48)", "300x300(ir.24)", "300x300(ir.48)"
    });
    private static final String S;
    private static final String T;
    private static final String U;
    private static final String V;
    private static final String W;
    private static final String X;
    private static final String Y = a(new String[] {
        "pin.id", "pin.type"
    });
    private static final String Z;
    public static final String a;
    private static final String aa;
    private static final String ab;
    private static final String ac;
    private static final String ad;
    private static final String ae;
    private static final String af;
    private static final String ag;
    private static final String ah;
    private static final String ai = a(new String[] {
        a(), "pin.place_summary()"
    });
    private static final String aj;
    private static final String ak = a(new String[] {
        "place.id", "place.latitude", "place.longitude"
    });
    private static final String al = a(new String[] {
        Y, "pin.place()", ak
    });
    private static final String am;
    private static final String an;
    private static final String ao;
    private static final String ap = a(new String[] {
        "pin.place()", "place.access", "place.hours", "place.simple_tips"
    });
    private static final String aq = a(new String[] {
        ap, "pin.aggregated_pin_data()", "pin.edited_fields"
    });
    public static final String b = a(new String[] {
        "board.id", "board.url", "board.name", "board.category", "board.created_at", "board.layout", "board.collaborator_invites_enabled"
    });
    public static final String c = a(new String[] {
        "user.id", "user.username", "user.first_name", "user.last_name", "user.full_name", "user.gender", "user.partner()"
    });
    public static final String d = a(new String[] {
        "comment.id", "comment.text", "comment.created_at", "comment.text"
    });
    public static final String e = a(new String[] {
        "place.id", "place.name", "place.latitude", "place.longitude", "place.source_icon", "place.source_name", "place.from_pin_join"
    });
    public static final String f = a(new String[] {
        "conversation.id", "conversation.users()", "conversation.emails", "conversation.last_message()", "conversation.unread"
    });
    public static final String g = a(new String[] {
        "conversationmessage.id", "conversationmessage.text", "conversationmessage.created_at", "conversationmessage.pin()", "conversationmessage.board()", "conversationmessage.user()", "conversationmessage.sender()"
    });
    public static final String h = a(new String[] {
        c, "user.image_medium_url", "user.image_large_url", "user.email", "user.secret_board_count", "user.connected_to_facebook", "user.facebook_timeline_enabled", "user.facebook_publish_stream_enabled", "user.connected_to_gplus", "user.connected_to_twitter", 
        "user.connected_to_rakuten", "user.experiments", "user.gatekeeper_experiments", "user.last_pin_like_time", "user.created_at"
    });
    public static final String i = a(new String[] {
        c, "user.image_medium_url", "user.website_url", "user.domain_verified", "user.location", "user.explicitly_followed_by_me", "user.implicitly_followed_by_me", "user.blocked_by_me", "user.pin_count", "user.follower_count", 
        "user.verified_identity"
    });
    public static final String j = a(new String[] {
        c, "user.image_medium_url", "user.image_large_url", "user.about", "user.blocked_by_me", "user.board_count", "user.domain_verified", "user.explicitly_followed_by_me", "user.facebook_url", "user.follower_count", 
        "user.following_count", "user.implicitly_followed_by_me", "user.impressum_url", "user.like_count", "user.location", "user.pin_count", "user.show_impressum", "user.twitter_url", "user.last_pin_like_time", "user.verified_identity", 
        "user.website_url", "user.canonical_merchant_domain"
    });
    public static final String k = a(new String[] {
        c, "user.interest_following_count"
    });
    public static final String l = a(new String[] {
        b, "board.image_cover_url", "board.images[90x90]", "board.collaborated_by_me", "board.is_collaborative", "board.followed_by_me", "board.privacy", "board.owner()", "board.pin_count", "board.board_order_modified_at"
    });
    public static final String m = a(new String[] {
        b, "board.image_cover_url", "board.images[90x90]", c, "user.image_medium_url", "board.description", "board.is_collaborative", "board.collaborator_count", "board.followed_by_me", "board.collaborated_by_me", 
        "board.owner()", "board.pin_count", "board.interests()", "interest.id", "interest.name", "interest.key"
    });
    public static final String n = a(new String[] {
        b, "board.cover_images[60x60]", "board.is_collaborative", "board.privacy"
    });
    public static final String o = a(new String[] {
        "collaboratorinvite.invited_user()", "collaboratorinvite.invited_by_user()", "collaboratorinvite.access"
    });
    public static final String p = a(new String[] {
        l, "board.image_thumbnail_url"
    });
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t = a(new String[] {
        "interest.images[150x150(ir.24),150x150(ir.12)]", "interest.name", "interest.follower_count"
    });
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x = a(new String[] {
        "csr.id", "csr.dominant_color", "csr.cacheable_id", "csr.type", "csr.description", "csr.updated_at", "csr.link"
    });
    public static final String y;
    public static final String z;

    public static String a()
    {
        if (CommerceHelper.isCommerceEnabled())
        {
            if (Experiments.P() || Experiments.Q())
            {
                return a(new String[] {
                    ah, "pin.buyable_product()", "pin.canonical_merchant_domain"
                });
            } else
            {
                return ag;
            }
        }
        if (Experiments.P() || Experiments.Q())
        {
            return ah;
        } else
        {
            return B;
        }
    }

    private static String a(String s1)
    {
        Object obj = null;
        Matcher matcher = Pattern.compile("pin.images\\[(.*?)\\],?").matcher(s1);
        while (matcher.find()) 
        {
            String s2;
            if (StringUtils.isEmpty(((CharSequence) (obj))))
            {
                s2 = "pin.images[";
            } else
            {
                s2 = (new StringBuilder()).append(((String) (obj))).append(",").toString();
            }
            s1 = s1.replace(matcher.group(), "");
            obj = (new StringBuilder()).append(s2).append(matcher.group(1)).toString();
        }
        String s3 = s1;
        if (obj != null)
        {
            s3 = (new StringBuilder()).append(((String) (obj))).append("]").toString();
            s3 = (new StringBuilder()).append(s3).append(",").append(s1).toString();
        }
        s1 = s3;
        if (s3.endsWith(","))
        {
            s1 = s3.substring(0, s3.length() - 1);
        }
        return s1;
    }

    private static transient String a(String as[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i1 = 0; i1 < as.length; i1++)
        {
            stringbuilder.append(as[i1]);
            if (i1 < as.length - 1)
            {
                stringbuilder.append(",");
            }
        }

        return a(stringbuilder.toString());
    }

    public static String b()
    {
        return ai;
    }

    public static String c()
    {
        return aj;
    }

    public static String d()
    {
        if (Experiments.U())
        {
            return aj;
        } else
        {
            return ai;
        }
    }

    public static String e()
    {
        if (Experiments.P())
        {
            return aq;
        } else
        {
            return ap;
        }
    }

    public static String f()
    {
        if (CommerceHelper.isCommerceEnabled())
        {
            if (Experiments.P() || Experiments.Q())
            {
                return ad;
            } else
            {
                return ac;
            }
        }
        if (Experiments.P() || Experiments.Q())
        {
            return aa;
        } else
        {
            return Z;
        }
    }

    public static String g()
    {
        return an;
    }

    public static String h()
    {
        return al;
    }

    public static String i()
    {
        return am;
    }

    public static String j()
    {
        return a(new String[] {
            I, ai
        });
    }

    static 
    {
        String s1;
        int i1;
        if (Device.isTablet())
        {
            i1 = 8;
        } else
        {
            i1 = 6;
        }
        O = i1;
        if (Device.shouldLoadBigImages())
        {
            s1 = "pin.images[236x]";
        } else
        {
            s1 = "pin.images[200x]";
        }
        P = s1;
        if (Device.shouldLoadBigImages())
        {
            s1 = "board.images[236x]";
        } else
        {
            s1 = "board.images[200x]";
        }
        Q = s1;
        a = a(new String[] {
            "pin.id", "pin.type", "pin.cacheable_id", "pin.description", "pin.link", P, "pin.created_at", "pin.like_count", "pin.repin_count", "pin.comment_count", 
            "pin.view_tags"
        });
        q = a(new String[] {
            b, c, "user.image_medium_url", a, "board.pin_thumbnail_urls", "board.followed_by_me", "board.owner()", "pin.image_signature", PStringUtils.format("user.pins(limit:%d)", new Object[] {
                Integer.valueOf(O)
            }), "user.follower_count"
        });
        if (Device.shouldLoadBigImages())
        {
            s1 = "600x";
        } else
        {
            s1 = "474x";
        }
        S = s1;
        T = (new StringBuilder("interest.images[")).append(a(new String[] {
            R, S
        })).append("]").toString();
        r = a(new String[] {
            "interest.id", "interest.name", "interest.creation_time", "interest.key", "interest.background_color", "interest.url_name", "interest.follower_count", "interest.feed_update_time", T
        });
        s = a(new String[] {
            "interest.is_recommended", r
        });
        u = a(new String[] {
            r, "interest.is_followed"
        });
        v = a(new String[] {
            u, "interest.recommendation_source", "interest.image_signature"
        });
        if (Device.shouldLoadBigImages())
        {
            s1 = "pin.images[136x136]";
        } else
        {
            s1 = "pin.images[90x90]";
        }
        U = s1;
        w = a(new String[] {
            P, c, "user.image_medium_url", a, Q, "repinactivity.type", "repinactivity.timestamp", "repinactivity.pin()", "likepinactivity.type", "likepinactivity.timestamp", 
            "likepinactivity.user()", "pincreationactivity.type", "pincreationactivity.timestamp", "pincreationactivity.pin()", "pin.board()", "pin.pinner()", "board.id", "board.name", "board.pin_count", "board.followed_by_me", 
            "user.id", "pin.aggregated_pin_data()", "pin.edited_fields", "pin.pin_join()", "pinjoin.seo_description", "pin.rich_metadata()", "pin.rich_summary()"
        });
        if (Device.shouldLoadBigImages())
        {
            s1 = "pin.images[736x]";
        } else
        {
            s1 = "pin.images[550x]";
        }
        V = s1;
        if (Device.shouldLoadBigImages())
        {
            s1 = "galleryitem.canonical_images[236x,736x]";
        } else
        {
            s1 = "gallery_item.canonical_images[200x,550x]";
        }
        W = s1;
        if (Device.shouldLoadBigImages())
        {
            s1 = "imagemetadata.canonical_images[236x,736x]";
        } else
        {
            s1 = "imagemetadata.canonical_images[200x,550x]";
        }
        X = s1;
        Z = a(new String[] {
            a, b, c, e, U, V, "board.image_thumbnail_url", "user.image_medium_url", "pin.attribution", "pin.liked_by_me", 
            "pin.tracked_link", "pin.mobile_link", "pin.domain", "pin.link_domain()", "domain.id", "domain.name", "domain.official_user()", "pin.board()", "pin.comment_count", "pin.pinned_to_board", 
            "pin.pinner()", "pin.via_pinner()", "pin.rich_metadata()", "pin.rich_summary()", "pin.embed()", "pin.canonical_pin", "user.blocked_by_me", "user.verified_identity", "user.follower_count", "pin.place()", 
            "place.access", "place.street", "place.locality", "place.region", "place.country", "place.phone", "place.url", "place.hours", "place.simple_tips", "pin.is_video", 
            "pin.image_signature", "pin.gallery", "galleryitem.id", "galleryitem.image_signature", "pin.serving_link_metadata()", "servinglinkmetadata.gallery_items()", W
        });
        aa = a(new String[] {
            Z, "pin.aggregated_pin_data()", "aggregatedpindata.id", "aggregatedpindata.aggregated_stats", "pin.edited_fields", "pin.pin_join()", "pinjoin.seo_description"
        });
        y = a(new String[] {
            P, "pin.id", "board.id", "board.name", "board.pin_count", "board.followed_by_me", Q
        });
        ab = a(new String[] {
            "pin.buyable_product()", "buyableproduct.items()", X
        });
        ac = a(new String[] {
            Z, ab
        });
        ad = a(new String[] {
            aa, ab
        });
        if (Device.shouldLoadBigImages())
        {
            s1 = "csr.images[236x,300x]";
        } else
        {
            s1 = "csr.images[200x,300x]";
        }
        ae = s1;
        if (Device.shouldLoadBigImages())
        {
            s1 = "csr.images[236x,300x,orig]";
        } else
        {
            s1 = "csr.images[200x,300x,orig]";
        }
        af = s1;
        z = a(new String[] {
            Z, x, "csr.images[orig]", "csr.link_domain()"
        });
        A = a(new String[] {
            a, V, b, "pin.cinematic_data[45x45,200x,1200x]", "board.image_thumbnail_url", c, "user.image_medium_url", "pin.liked_by_me", "pin.dominant_color", "pin.rich_summary()", 
            "pin.embed()", "pin.promoter()", "pin.is_promoted", "pin.is_downstream_promotion", "pin.recommendation_reason", "pin.additional_hide_reasons", "pin.is_cinematic", "pin.board()", "pin.pinner()", "pin.source_interest()", 
            "pin.is_video", r
        });
        B = a(new String[] {
            A, P
        });
        ag = a(new String[] {
            B, "pin.buyable_product()", "pin.canonical_merchant_domain"
        });
        ah = a(new String[] {
            B, "pin.pin_join()", "pinjoin.seo_description", "pin.aggregated_pin_data()", "aggregatedpindata.aggregated_stats", "aggregatedpindata.id", "pin.edited_fields"
        });
        aj = a(new String[] {
            ai, x, af, "csr.domain"
        });
        am = a(new String[] {
            a(), U, "pin.place()", e
        });
        an = a(new String[] {
            a(), U, e, "pin.place()", "place.street", "place.locality", "place.region", "place.country"
        });
        C = a(new String[] {
            a, e, "pin.place()", "pin.pinner()", "place.street", "place.locality", "place.region", "place.country", "place.phone", "place.url"
        });
        if (Device.shouldLoadBigImages())
        {
            s1 = "placeimage.thumbnails[300x300]";
        } else
        {
            s1 = "placeimage.thumbnails[100x100]";
        }
        ao = s1;
        D = a(new String[] {
            ao, "placeimage.url", "placeimage.width", "placeimage.height"
        });
        E = a(new String[] {
            a, b, c, U, V, "board.image_thumbnail_url", "user.image_medium_url", "pin.type", "pin.embed()", "board.type", 
            "user.type", "comment.text", "comment.type", "comment.commenter"
        });
        G = a(new String[] {
            a, b, "board.cover_images[60x60]", "board.image_cover_url", "board.images[90x90]", c, "user.image_medium_url", f, g
        });
        H = a(new String[] {
            a, V, b, "board.image_cover_url", "board.images[90x90]", c, "user.image_medium_url", f, g, "board.pin_count"
        });
        I = a(new String[] {
            v, "interest.recommendation_pins"
        });
        K = a(new String[] {
            b, P, "board.collaborated_by_me", "board.board_order_modified_at", "board.is_collaborative", "board.followed_by_me", "board.privacy", "board.owner()", "board.pin_count", Q
        });
        M = a(new String[] {
            P, "pin.id"
        });
        N = a(new String[] {
            "pin.id", U
        });
    }
}
