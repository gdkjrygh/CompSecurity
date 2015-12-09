// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import com.spotify.mobile.android.ui.page.DebugFlag;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

public final class faq
{

    private static gip d = gip.b("sleep-timer-preset-values");
    public AlarmManager a;
    public PendingIntent b;
    public Context c;
    private gin e;

    public faq(Context context)
    {
        c = context;
        e = ((giq)dmz.a(giq)).b(context);
        a = (AlarmManager)context.getSystemService("alarm");
    }

    public static long a(JSONObject jsonobject)
    {
        com.spotify.mobile.android.ui.view.SleepTimerAdapter.TimerPresets timerpresets = c(jsonobject);
        long l;
        long l1;
        try
        {
            DebugFlag debugflag = DebugFlag.l;
            l = timerpresets.mDuration;
            l1 = jsonobject.getLong("KEY_TIME_STARTED");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Assertion.a("Failed parsing timestamp.", jsonobject);
            return 0L;
        }
        return l + l1;
    }

    public static boolean b(JSONObject jsonobject)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (jsonobject != null)
        {
            flag = flag1;
            if (c(jsonobject) != com.spotify.mobile.android.ui.view.SleepTimerAdapter.TimerPresets.a)
            {
                flag = true;
            }
        }
        return flag;
    }

    private static com.spotify.mobile.android.ui.view.SleepTimerAdapter.TimerPresets c(JSONObject jsonobject)
    {
        try
        {
            jsonobject = com.spotify.mobile.android.ui.view.SleepTimerAdapter.TimerPresets.valueOf(jsonobject.getString("KEY_NAME"));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Logger.b("Couldn't load timer.", new Object[0]);
            return com.spotify.mobile.android.ui.view.SleepTimerAdapter.TimerPresets.a;
        }
        return jsonobject;
    }

    public final void a()
    {
        e.g(d);
    }

    public final boolean b()
    {
        return e.f(d) && b(c());
    }

    public final JSONObject c()
    {
        if (!e.f(d))
        {
            return null;
        }
        JSONObject jsonobject;
        try
        {
            jsonobject = e.e(d);
        }
        catch (JSONException jsonexception)
        {
            Logger.b(jsonexception, "Failed to fetch timer presets", new Object[0]);
            return null;
        }
        return jsonobject;
    }

}
