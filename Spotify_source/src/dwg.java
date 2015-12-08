// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.nielsen.app.sdk.AppSdk;
import com.nielsen.app.sdk.IAppNotifier;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

public class dwg
    implements IAppNotifier, dmx
{

    public Context a;
    public AppSdk b;
    public boolean c;

    public dwg(Context context)
    {
        a = context;
    }

    public static boolean a(Flags flags)
    {
        return ((Boolean)flags.a(fys.aa)).booleanValue() && "Enabled".equals(flags.a(fys.h));
    }

    public final String a()
    {
        String s;
        String s1;
        s1 = a.getApplicationContext().getPackageName();
        s = "0.0.0";
        s1 = a.getApplicationContext().getPackageManager().getPackageInfo(s1, 0).versionName;
        s = s1;
_L1:
        JSONObject jsonobject = new JSONObject();
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        try
        {
            jsonobject.put("appId", "P285D23BA-D038-4E30-803D-BDB7CA1D5540");
            jsonobject.put("appName", "Spotify");
            jsonobject.put("appVersion", s);
            jsonobject.put("sfcode", "US");
            jsonobject.put("nol_devDebug", "false");
        }
        catch (JSONException jsonexception)
        {
            Logger.b(jsonexception, "Unable to create JSON config", new Object[0]);
        }
        return jsonobject.toString();
        namenotfoundexception;
        Logger.b(namenotfoundexception, "Unable to read package version", new Object[0]);
          goto _L1
    }

    public final boolean b()
    {
        return b != null;
    }

    public void onAppSdkEvent(long l, int i, String s)
    {
        if (i == 2001)
        {
            c = true;
        }
    }
}
