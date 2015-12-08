// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.os.Message;
import com.adjust.sdk.LogLevel;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.music.spotlets.tracking.Tracking;

public final class gpq
    implements Tracking, dwx, eda
{

    private boolean a;
    private boolean b;

    public gpq()
    {
        b = true;
    }

    private void a(boolean flag)
    {
        if (!a)
        {
            Logger.a("Tracking SDK is not setup yet", new Object[0]);
        } else
        {
            Object obj = aci.a();
            if (((acm) (obj)).a())
            {
                obj = ((acm) (obj)).c;
                if (((ace) (obj)).a(((ace) (obj)).c, flag, "Adjust already in offline mode", "Adjust already in online mode"))
                {
                    obj.c = flag;
                    if (((ace) (obj)).b == null)
                    {
                        ((ace) (obj)).a();
                    }
                    ((ace) (obj)).a(flag, "Pausing package and attribution handler to put in offline mode", "Package and attribution handler remain paused because the SDK is disabled", "Resuming package handler and attribution handler to put in online mode");
                    return;
                }
            }
        }
    }

    public final void a()
    {
        if (b)
        {
            try
            {
                ack ack1 = new ack("278dka");
                Object obj = aci.a();
                if (((acm) (obj)).a())
                {
                    obj = ((acm) (obj)).c;
                    if (((ace) (obj)).b == null)
                    {
                        ((ace) (obj)).a();
                    }
                    Message message = Message.obtain();
                    message.arg1 = 0x11bba;
                    message.obj = ack1;
                    ((ace) (obj)).a.sendMessage(message);
                    return;
                }
            }
            catch (Exception exception)
            {
                Assertion.a(exception);
                return;
            }
        }
    }

    public final void a(Application application)
    {
        if (a)
        {
            Logger.a("Tracking SDK already setup", new Object[0]);
        } else
        if (b)
        {
            Object obj = LogLevel.a;
            application = new acj(application, "82pznetcdwvp", "production");
            application.d = ((LogLevel) (obj));
            obj = aci.a();
            if (((acm) (obj)).c != null)
            {
                acl.a().e("Adjust already initialized", new Object[0]);
            } else
            {
                application.f = ((acm) (obj)).a;
                application.g = ((acm) (obj)).b;
                obj.c = ace.a(application);
            }
            a = true;
            a(true);
            return;
        }
    }

    public final void a(SessionState sessionstate)
    {
        boolean flag;
        if (!sessionstate.k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
    }

    public final void a(Flags flags)
    {
        b = ((String)flags.a(fys.ak)).equals("true");
        boolean flag = b;
        if (!a)
        {
            Logger.a("Tracking SDK is not setup yet", new Object[0]);
        } else
        {
            flags = aci.a();
            if (flags.a())
            {
                ((acm) (flags)).c.a(flag);
                return;
            }
        }
    }

    public final void a(com.spotify.music.spotlets.tracking.Tracking.SourceType sourcetype)
    {
    }

    public final void a(dxc dxc1)
    {
        dxc1.a(this);
    }

    public final void a(edb edb1)
    {
        edb1.a(this);
    }

    public final void b()
    {
        if (!a)
        {
            Logger.c("activityResumed called but SDK not initialized", new Object[0]);
        } else
        if (b)
        {
            try
            {
                acm acm1 = aci.a();
                if (acm1.a())
                {
                    acm1.c.a();
                    return;
                }
            }
            catch (Exception exception)
            {
                Assertion.a(exception);
                return;
            }
        }
    }

    public final void b(com.spotify.music.spotlets.tracking.Tracking.SourceType sourcetype)
    {
    }

    public final void b(dxc dxc1)
    {
        dxc1.b(this);
    }

    public final void b(edb edb1)
    {
        edb1.b(this);
    }

    public final void c()
    {
        if (!a)
        {
            Logger.c("activityPaused called but SDK not initialized", new Object[0]);
        } else
        if (b)
        {
            try
            {
                acm acm1 = aci.a();
                if (acm1.a())
                {
                    acm1.c.b();
                    return;
                }
            }
            catch (Exception exception)
            {
                Assertion.a(exception);
                return;
            }
        }
    }
}
