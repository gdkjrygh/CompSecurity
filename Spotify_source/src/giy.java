// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.tracking.AppStartupTimerMessage;
import com.spotify.mobile.android.util.tracking.ViewLoadTimerMessage;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import java.util.HashSet;

public final class giy
    implements gja
{

    private Context a;
    private HashSet b;
    private boolean c;
    private boolean d;

    public giy(Context context)
    {
        b = new HashSet();
        a = context;
        b.add(ViewUri.bs.toString());
        b.add(ViewUri.bo.toString());
        b.add(ViewUri.bl.toString());
        b.add(ViewUri.br.toString());
        b.add(ViewUri.bn.toString());
        b.add(ViewUri.bj.toString());
        b.add(ViewUri.r.toString());
    }

    private void a(String s, long l, boolean flag)
    {
        s = AppStartupTimerMessage.a(s, flag, l);
        Context context = a;
        Intent intent = dvv.a(context, "com.spotify.mobile.android.service.action.session.APP_STARTUP_TIMER");
        intent.putExtra("app_startup_message", s);
        context.startService(intent);
    }

    public final void a()
    {
        if (c)
        {
            Logger.b("Cold start processor aborted while waiting for the first view", new Object[0]);
        }
    }

    public final void a(String s, String s1, Bundle bundle)
    {
        if (TextUtils.equals(s, "TYPE_COLD_START") || TextUtils.equals(s, "TYPE_COLD_START_CANCEL") || TextUtils.equals(s, "TYPE_VIEW_LOADING"))
        {
            if (TextUtils.equals(s, "TYPE_COLD_START"))
            {
                if (c)
                {
                    Logger.b("Already received a cold start event.", new Object[0]);
                    return;
                }
                if (!bundle.containsKey("ARG_TIMESTAMP"))
                {
                    Logger.c("Missing timestamp argument: %s", new Object[] {
                        bundle
                    });
                    return;
                } else
                {
                    c = true;
                    a("app_init", bundle.getLong("ARG_TIMESTAMP"), true);
                    return;
                }
            }
            if (TextUtils.equals(s, "TYPE_COLD_START_CANCEL"))
            {
                d = true;
                c = false;
                return;
            }
            if ("load_finished".equals(s1) && !d && c)
            {
                Assertion.a(bundle);
                s = (ViewLoadTimerMessage)bundle.getParcelable("ARG_MESSAGE");
                if (s != null)
                {
                    s1 = ((ViewLoadTimerMessage) (s)).a;
                    if (!b.contains(s1))
                    {
                        Logger.b("Received complete event for uri %s that is not in cold start list", new Object[] {
                            s1
                        });
                        return;
                    } else
                    {
                        a("usable_state", ((ViewLoadTimerMessage) (s)).f, false);
                        c = false;
                        return;
                    }
                }
            }
        }
    }
}
