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

public final class aqs extends aqm
{

    public String c;
    public boolean d;

    public aqs(LikeActionController likeactioncontroller, String s)
    {
        super(s);
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id");
        bundle.putString("ids", s);
        a(new Request(LikeActionController.l(likeactioncontroller), "", bundle, HttpMethod.a));
    }

    protected final void a(aoz aoz1)
    {
        aoz1 = arp.b(aoz1.a, a);
        if (aoz1 != null)
        {
            c = aoz1.optString("id");
            boolean flag;
            if (!arp.a(c))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            d = flag;
        }
    }

    protected final void a(FacebookRequestError facebookrequesterror)
    {
        facebookrequesterror = LoggingBehavior.a;
        LikeActionController.h();
        facebookrequesterror = a;
        arb.b();
    }
}
