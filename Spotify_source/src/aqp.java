// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.facebook.FacebookRequestError;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.Request;
import com.facebook.internal.LikeActionController;
import org.json.JSONObject;

public final class aqp extends aqm
{

    public String c;
    public String d;
    public String e;
    public String f;
    private LikeActionController g;

    public aqp(LikeActionController likeactioncontroller, String s)
    {
        g = likeactioncontroller;
        super(s);
        Bundle bundle = new Bundle();
        bundle.putString("fields", "engagement.fields(count_string_with_like,count_string_without_like,social_sentence_with_like,social_sentence_without_like)");
        a(new Request(LikeActionController.l(likeactioncontroller), s, bundle, HttpMethod.a));
    }

    protected final void a(aoz aoz1)
    {
        aoz1 = arp.b(aoz1.a, "engagement");
        if (aoz1 != null)
        {
            c = aoz1.optString("count_string_with_like");
            d = aoz1.optString("count_string_without_like");
            e = aoz1.optString("social_sentence_with_like");
            f = aoz1.optString("social_sentence_without_like");
        }
    }

    protected final void a(FacebookRequestError facebookrequesterror)
    {
        Object obj = LoggingBehavior.a;
        LikeActionController.h();
        obj = a;
        arb.b();
        LikeActionController.a(g, "get_engagement", facebookrequesterror);
    }
}
