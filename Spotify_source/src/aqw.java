// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.facebook.FacebookRequestError;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.Request;
import com.facebook.internal.LikeActionController;

public final class aqw extends aqm
{

    private String c;
    private LikeActionController d;

    public aqw(LikeActionController likeactioncontroller, String s)
    {
        d = likeactioncontroller;
        super(null);
        c = s;
        a(new Request(LikeActionController.l(likeactioncontroller), s, null, HttpMethod.c));
    }

    protected final void a(aoz aoz)
    {
    }

    protected final void a(FacebookRequestError facebookrequesterror)
    {
        Object obj = LoggingBehavior.a;
        LikeActionController.h();
        obj = c;
        arb.b();
        LikeActionController.a(d, "publish_unlike", facebookrequesterror);
    }
}
