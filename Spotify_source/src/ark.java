// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import com.facebook.LoggingBehavior;
import java.util.Collection;
import org.json.JSONException;
import org.json.JSONObject;

public final class ark
{

    public static final Collection a = arp.a(new String[] {
        "service_disabled", "AndroidAuthKillSwitchException"
    });
    public static final Collection b = arp.a(new String[] {
        "access_denied", "OAuthAccessDeniedException"
    });

    public ark()
    {
    }

    public static Bundle a(Context context, String s, int i, Bundle bundle)
    {
        Bundle bundle1;
        Bundle bundle2;
        context = aph.d(context);
        if (arp.a(context))
        {
            return null;
        }
        bundle1 = new Bundle();
        bundle1.putString("android_key_hash", context);
        bundle1.putString("app_id", aph.i());
        bundle1.putInt("version", i);
        bundle1.putString("display", "touch");
        bundle2 = new Bundle();
        bundle2.putString("action_id", s);
        bundle2.putString("app_name", null);
        context = bundle;
        if (bundle == null)
        {
            context = new Bundle();
        }
        s = app.a(bundle2);
        context = app.a(context);
        bundle1.putString("bridge_args", s.toString());
        bundle1.putString("method_args", context.toString());
        context = bundle1;
_L2:
        return context;
        context;
        s = LoggingBehavior.f;
        (new StringBuilder("Error creating Url -- ")).append(context);
        context = null;
        arb.c();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static final String a()
    {
        return String.format("m.%s", new Object[] {
            aph.d()
        });
    }

    public static final String b()
    {
        return String.format("https://graph.%s", new Object[] {
            aph.d()
        });
    }

    public static final String c()
    {
        return String.format("https://graph-video.%s", new Object[] {
            aph.d()
        });
    }

    public static final String d()
    {
        if (aph.h())
        {
            return "v1.0";
        } else
        {
            return "v2.1";
        }
    }

    static 
    {
        ark.getName();
    }
}
