// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public final class gpz
    implements gpy
{

    private static final long c;
    private cxk a;
    private cxm b;
    private long d;

    public gpz()
    {
    }

    private void a()
    {
        if (a != null && b != null)
        {
            return;
        }
        gpx gpx1 = (gpx)dmz.a(gpx);
        if (gpx1.b == null)
        {
            gpx1.b = cxk.a(gpx1.a, gpx.c);
        }
        a = gpx1.b;
        b = a.a();
    }

    public final void a(Activity activity)
    {
        a();
        boolean flag;
        if (System.currentTimeMillis() - d >= c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return;
        }
        try
        {
            b.b(activity);
            b.a(activity);
            d = System.currentTimeMillis();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Activity activity)
        {
            Assertion.a("Mixpanel showNotificationOrSurveyIfAvailable", activity);
        }
    }

    public final void a(String s, Object obj)
    {
        a();
        try
        {
            b.a(s, obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Assertion.a("Mixpanel people set", s);
        }
    }

    public final void a(String s, String s1)
    {
        a();
        JSONObject jsonobject;
        if (s.equals(b.a()))
        {
            break MISSING_BLOCK_LABEL_58;
        }
        b.a(s);
        s = b;
        jsonobject = new JSONObject();
        jsonobject.put("$name", s1);
        s.a(jsonobject);
        return;
        s;
        try
        {
            Logger.b(s, "Could not prepare JSONObject for mixpanel", new Object[0]);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Assertion.a("Mixpanel Idenfify User Failed", s);
        }
        return;
    }

    static 
    {
        c = TimeUnit.MINUTES.toMillis(15L);
    }
}
