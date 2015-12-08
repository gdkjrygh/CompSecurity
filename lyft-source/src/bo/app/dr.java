// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.net.Uri;
import com.appboy.Constants;
import com.appboy.enums.ErrorType;
import com.appboy.events.SubmitFeedbackFailed;
import com.appboy.events.SubmitFeedbackSucceeded;
import com.appboy.models.ResponseError;
import com.appboy.models.outgoing.Feedback;
import com.appboy.support.AppboyLogger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            dv, al, be

public final class dr extends dv
{

    private static final String a;
    private final Feedback b;

    public dr(String s, Feedback feedback)
    {
        super(Uri.parse((new StringBuilder()).append(s).append("feedback").toString()));
        b = feedback;
    }

    public final al a()
    {
        return al.b;
    }

    public final void a(be be1)
    {
        be1.a(new SubmitFeedbackSucceeded(b), com/appboy/events/SubmitFeedbackSucceeded);
    }

    public final void a(be be1, ResponseError responseerror)
    {
        ErrorType errortype;
        String s;
        errortype = responseerror.getType();
        s = responseerror.getMessage();
        if (errortype != ErrorType.REQUIRED_FIELD_MISSING) goto _L2; else goto _L1
_L1:
        AppboyLogger.e(a, String.format("Required Field Missing: %s", new Object[] {
            s
        }));
_L4:
        be1.a(new SubmitFeedbackFailed(b, responseerror), com/appboy/events/SubmitFeedbackFailed);
        return;
_L2:
        if (errortype == ErrorType.BAD_INPUT)
        {
            AppboyLogger.e(a, String.format("Bad Input: %s", new Object[] {
                s
            }));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean b()
    {
        return false;
    }

    public final JSONObject c()
    {
        JSONObject jsonobject = super.c();
        if (jsonobject == null)
        {
            return null;
        }
        try
        {
            jsonobject.put("feedback", b.forJsonPut());
        }
        catch (JSONException jsonexception)
        {
            AppboyLogger.w(a, "Experienced JSONException while retrieving parameters. Returning null.", jsonexception);
            return null;
        }
        return jsonobject;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, bo/app/dr.getName()
        });
    }
}
