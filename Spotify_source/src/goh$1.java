// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.util.logging.Logger;
import org.json.JSONObject;

final class ang.Object
    implements dmh
{

    private goh a;

    public final void a(int i, Object obj)
    {
        obj = (JSONObject)obj;
        if (i >= 200 && i < 300)
        {
            goh.a(a, ((JSONObject) (obj)));
            return;
        }
        if (i == 403)
        {
            goh.b(a, ((JSONObject) (obj)));
            return;
        } else
        {
            goh.a(a).e();
            return;
        }
    }

    public final void a(Throwable throwable, String s)
    {
        Logger.b(throwable, (new StringBuilder("Eligibility Check Failed ")).append(s).toString(), new Object[0]);
        goh.a(a).e();
    }

    (goh goh1)
    {
        a = goh1;
        super();
    }
}
