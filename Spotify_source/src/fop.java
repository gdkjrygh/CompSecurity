// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.facebook.Session;
import com.spotify.mobile.android.service.LoggerProvider;
import com.spotify.mobile.android.service.SpotifyService;
import com.spotify.mobile.android.ui.activity.upsell.PremiumSignupActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.Verified;
import java.io.Serializable;

public class fop
    implements dmx
{

    public fop()
    {
    }

    public static void a(Context context)
    {
        context.startService(dvv.a(context, "com.spotify.mobile.android.service.action.session.ERASE_OFFLINE_USER"));
    }

    public static void a(Context context, Uri uri, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, String s, Flags flags)
    {
        a(context, verified, subview, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.c));
        verified = PremiumSignupActivity.a(context);
        verified.c = uri;
        verified.d = s;
        verified.a = flags;
        context.startActivity(verified.a());
    }

    public static void a(Context context, Verified verified, long l)
    {
        Intent intent = dvv.a(context, "com.spotify.mobile.android.service.action.session.LOG_VIEW");
        intent.putExtra("uri", verified);
        intent.putExtra("duration", l);
        context.startService(intent);
    }

    public static void a(Context context, Verified verified, com.spotify.mobile.android.util.ClientEvent.SubEvent subevent)
    {
        a(context, verified, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.d, subevent));
        context.startService(dvv.a(context, "com.spotify.mobile.android.service.action.session.LOGOUT"));
        (new Thread(new Runnable(context) {

            private Context a;

            public final void run()
            {
                Session session1 = Session.g();
                Session session = session1;
                if (session1 == null)
                {
                    session = new Session(a);
                }
                session.f();
            }

            
            {
                a = context;
                super();
            }
        })).start();
        verified = dzj.a(context, 0);
        dzj.a(context).cancel(verified);
        verified.cancel();
        gpp.b(context);
        ((fpt)dmz.a(fpt)).b();
    }

    public static void a(Context context, Verified verified, ClientEvent clientevent)
    {
        Assertion.a(context);
        Assertion.a(verified);
        Assertion.a(clientevent);
        a(context, verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, clientevent);
    }

    public static void a(Context context, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview)
    {
        a(context, verified, subview, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.W));
        verified = dvv.a(context, "com.spotify.mobile.android.service.action.optintrial.START");
        verified.putExtra("restart_app_opt_in_trial_activation", true);
        context.startService(verified);
    }

    public static void a(Context context, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, ClientEvent clientevent)
    {
        context.startService(b(context, verified, subview, clientevent));
    }

    public static void a(Context context, dnj dnj1)
    {
        Intent intent = dvv.a(context, "com.spotify.mobile.android.service.action.session.LOG");
        intent.putExtra("log_message", dnj1.a());
        context.startService(intent);
    }

    public static void a(Context context, String s, Serializable serializable)
    {
        Intent intent = dvv.a(context, "com.spotify.mobile.android.service.action.log.AB_TESTING");
        intent.putExtra("flag", s);
        intent.putExtra("value", serializable);
        context.startService(intent);
    }

    public static void a(Context context, String s, String s1)
    {
        Intent intent = dvv.a(context, "com.spotify.mobile.android.service.action.log.DEVICE_IDENTIFIER");
        intent.putExtra("googleaid", s);
        intent.putExtra("deviceid", s1);
        context.startService(intent);
    }

    public static void a(Context context, String s, String s1, String s2)
    {
        Intent intent = dvv.a(context, "com.spotify.mobile.android.service.action.session.SEND_TO_INBOX");
        intent.setData(Uri.parse(s2));
        intent.putExtra("username", s);
        intent.putExtra("message", s1);
        context.startService(intent);
    }

    public static void a(Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, ClientEvent clientevent)
    {
        gdu.a(verified, subview, clientevent);
    }

    public static Intent b(Context context, Verified verified, com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview, ClientEvent clientevent)
    {
        Assertion.a(context);
        Assertion.a(verified);
        Assertion.a(subview);
        Assertion.a(clientevent);
        context = dvv.a(context, "com.spotify.mobile.android.service.action.session.LOG_EVENT");
        context.putExtra("uri", verified);
        context.putExtra("context", subview.toString());
        context.putExtra("event", clientevent.a.toString());
        context.putExtra("event_version", clientevent.b.toString());
        context.putExtra("test_version", clientevent.c);
        context.putExtra("json_data", clientevent.a());
        return context;
    }

    public static void b(Context context)
    {
        ctz.a(context);
        context.startService(dvv.a(context, "com.spotify.mobile.android.service.action.session.REPORT_AD_URL_CLICKED"));
    }

    public static void b(Context context, Verified verified, ClientEvent clientevent)
    {
        com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a;
        if (SpotifyService.a(context))
        {
            a(context, verified, subview, clientevent);
            return;
        } else
        {
            LoggerProvider.a(context, b(context, verified, subview, clientevent).getExtras());
            return;
        }
    }
}
