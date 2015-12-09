// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.common.base.Optional;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

final class gny
{

    public final JSONObject a;
    private long b;

    public gny(JSONObject jsonobject, long l)
    {
        a = jsonobject;
        b = l;
    }

    public static Optional a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return Optional.e();
        }
        try
        {
            s = new JSONObject(s);
            long l = Long.parseLong(s.getString("time-of-death-field"));
            s = Optional.b(new gny(s.getJSONObject("payload-field"), l));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.b(s.getCause(), "Unable to restore cache blob from disk.", new Object[0]);
            return Optional.e();
        }
        return s;
    }

    public final boolean a()
    {
        return System.currentTimeMillis() < b;
    }

    public final Optional b()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("payload-field", a).put("time-of-death-field", String.valueOf(b));
        }
        catch (JSONException jsonexception)
        {
            Assertion.a(jsonexception);
        }
        return Optional.b(jsonobject.toString());
    }
}
