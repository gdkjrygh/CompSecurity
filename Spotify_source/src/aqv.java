// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import com.facebook.FacebookRequestError;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.Request;
import com.facebook.internal.LikeActionController;

public final class aqv extends aqm
{

    public String c;
    private LikeActionController d;

    public aqv(LikeActionController likeactioncontroller, String s)
    {
        d = likeactioncontroller;
        super(s);
        Bundle bundle = new Bundle();
        bundle.putString("object", s);
        a(new Request(LikeActionController.l(likeactioncontroller), "me/og.likes", bundle, HttpMethod.b));
    }

    protected final void a(aoz aoz1)
    {
        c = arp.a(aoz1.a, "id");
    }

    protected final void a(FacebookRequestError facebookrequesterror)
    {
        if (facebookrequesterror.b == 3501)
        {
            b = null;
            return;
        } else
        {
            Object obj = LoggingBehavior.a;
            LikeActionController.h();
            obj = a;
            arb.b();
            LikeActionController.a(d, "publish_like", facebookrequesterror);
            return;
        }
    }
}
