// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;

final class jeg extends ha
    implements omb, opn, opv
{

    private static final ha b = new jeh();
    private Context c;
    private grl d;
    private noz e;
    private gz f;
    private jes g;

    jeg(opd opd1, jes jes1)
    {
        g = (jes)p.a(jes1);
        opd1.a(this);
    }

    static noz a(jeg jeg1)
    {
        return jeg1.e;
    }

    static boolean a(jeg jeg1, Intent intent)
    {
        return jeg1.b(intent);
    }

    private boolean b(Intent intent)
    {
        if (!"android.intent.action.MEDIA_BUTTON".equals(intent.getAction()))
        {
            return false;
        }
        intent = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (e.a())
        {
            String s = String.valueOf(intent);
            (new StringBuilder(String.valueOf(s).length() + 7)).append("event: ").append(s);
            noy.a("isVideoPlaying()", Boolean.valueOf(d.a));
        }
        if (intent == null || intent.getAction() != 1)
        {
            return false;
        }
        boolean flag = d.a;
        int i = intent.getKeyCode();
        switch (intent.getKeyCode())
        {
        default:
            if (e.a())
            {
                noy.a("keyCode", Integer.valueOf(i));
            }
            return false;

        case 126: // '~'
            if (flag)
            {
                return false;
            } else
            {
                d().b();
                return true;
            }

        case 127: // '\177'
            if (!flag)
            {
                return false;
            } else
            {
                d().c();
                return true;
            }

        case 85: // 'U'
            break;
        }
        if (flag)
        {
            d().c();
        } else
        {
            d().b();
        }
        return true;
    }

    private jej d()
    {
        p.a(g.b());
        return g.b();
    }

    public final void a()
    {
        d().b();
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = context;
        d = (grl)olm1.a(grl);
        e = noz.a(context, 2, "VideoPlaybackController", new String[0]);
        context = new ComponentName(c.getPackageName(), jei.getName());
        olm1 = new Intent("android.intent.action.MEDIA_BUTTON");
        olm1.setComponent(context);
        olm1 = PendingIntent.getBroadcast(c, 0, olm1, 0);
        f = new gz(c, "VideoPlaybackController", context, olm1);
        f.a.a(3);
        olm1 = new id();
        olm1.d = 518L;
        context = f;
        olm1 = olm1.a();
        ((gz) (context)).a.a(olm1);
        f.a(this);
        f.a(true);
    }

    public final boolean a(Intent intent)
    {
        if (e.a())
        {
            noy.a("intent", intent);
        }
        return b(intent);
    }

    public final void b()
    {
        d().c();
    }

    public final void c()
    {
        f.a(b);
        f.a.a();
    }

}
