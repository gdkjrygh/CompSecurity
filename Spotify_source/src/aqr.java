// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.facebook.FacebookRequestError;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.Request;
import com.facebook.Session;
import com.facebook.internal.LikeActionController;
import org.json.JSONArray;
import org.json.JSONObject;

public final class aqr extends aqm
{

    public boolean c;
    public String d;
    private LikeActionController e;

    public aqr(LikeActionController likeactioncontroller, String s)
    {
        e = likeactioncontroller;
        super(s);
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,application");
        bundle.putString("object", s);
        a(new Request(LikeActionController.l(likeactioncontroller), "me/og.likes", bundle, HttpMethod.a));
    }

    protected final void a(aoz aoz1)
    {
        aoz1 = arp.c(aoz1.a, "data");
        if (aoz1 != null)
        {
            for (int i = 0; i < aoz1.length(); i++)
            {
                JSONObject jsonobject = aoz1.optJSONObject(i);
                if (jsonobject == null)
                {
                    continue;
                }
                c = true;
                JSONObject jsonobject1 = jsonobject.optJSONObject("application");
                if (jsonobject1 != null && arp.a(LikeActionController.l(e).applicationId, jsonobject1.optString("id")))
                {
                    d = jsonobject.optString("id");
                }
            }

        }
    }

    protected final void a(FacebookRequestError facebookrequesterror)
    {
        Object obj = LoggingBehavior.a;
        LikeActionController.h();
        obj = a;
        arb.b();
        LikeActionController.a(e, "get_og_object_like", facebookrequesterror);
    }
}
