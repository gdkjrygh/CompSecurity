// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import com.spotify.mobile.android.spotlets.ads.model.Format;
import com.spotify.mobile.android.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

public class edr
    implements dmx
{

    public edr()
    {
    }

    public static dne a(AdSlot adslot, Format format, String s)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("action", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.b(s, "Unable to create json data for user action ad event", new Object[0]);
        }
        return a(adslot.toString(), format.getName(), null, null, "event_user_action", jsonobject.toString());
    }

    public static dne a(String s, String s1, String s2, String s3, String s4)
    {
        return a(s, s1, s2, s3, "event_errored", a(s4));
    }

    public static dne a(String s, String s1, String s2, String s3, String s4, String s5)
    {
        return new dne(s2, s3, s1, s4, s5, s);
    }

    private static String a(String s)
    {
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("message", s);
            s = jsonobject.toString();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.c("Unable to format json message", new Object[0]);
            return "";
        }
        return s;
    }
}
