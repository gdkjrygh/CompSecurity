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

public final class aqq extends aqm
{

    public String c;

    public aqq(LikeActionController likeactioncontroller, String s)
    {
        super(s);
        Bundle bundle = new Bundle();
        bundle.putString("fields", "og_object.fields(id)");
        bundle.putString("ids", s);
        a(new Request(LikeActionController.l(likeactioncontroller), "", bundle, HttpMethod.a));
    }

    protected final void a(aoz aoz1)
    {
        aoz1 = arp.b(aoz1.a, a);
        if (aoz1 != null)
        {
            aoz1 = aoz1.optJSONObject("og_object");
            if (aoz1 != null)
            {
                c = aoz1.optString("id");
            }
        }
    }

    protected final void a(FacebookRequestError facebookrequesterror)
    {
        if (facebookrequesterror.a().contains("og_object"))
        {
            b = null;
            return;
        } else
        {
            facebookrequesterror = LoggingBehavior.a;
            LikeActionController.h();
            facebookrequesterror = a;
            arb.b();
            return;
        }
    }
}
