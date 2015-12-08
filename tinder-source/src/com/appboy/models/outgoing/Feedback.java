// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models.outgoing;

import bo.app.cu;
import bo.app.ep;
import com.appboy.Constants;
import com.appboy.models.IPutIntoJson;
import com.appboy.support.AppboyLogger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.appboy.models.outgoing:
//            Environment

public final class Feedback
    implements IPutIntoJson
{

    private static final String a;
    private final String b;
    private final String c;
    private final boolean d;
    private final Environment e;
    private final cu f;

    public Feedback(String s, String s1, boolean flag, Environment environment, cu cu1)
    {
        if (ep.c(s))
        {
            throw new IllegalArgumentException("Message cannot be null or blank");
        } else
        {
            b = s;
            c = s1;
            d = flag;
            e = environment;
            f = cu1;
            return;
        }
    }

    public final volatile Object forJsonPut()
    {
        return forJsonPut();
    }

    public final JSONObject forJsonPut()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("message", ep.a(b));
            jsonobject.put("reply_to", c);
            jsonobject.put("is_bug", d);
            if (f != null)
            {
                jsonobject.put("device", f.a());
            }
            if (e != null)
            {
                jsonobject.put("environment", e.forStatelessJsonPut());
            }
        }
        catch (JSONException jsonexception)
        {
            AppboyLogger.e(a, "Caught exception creating feedback Json.", jsonexception);
            return jsonobject;
        }
        return jsonobject;
    }

    public final String getMessage()
    {
        return b;
    }

    public final String getReplyToEmail()
    {
        return c;
    }

    public final boolean isReportingABug()
    {
        return d;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/models/outgoing/Feedback.getName()
        });
    }
}
