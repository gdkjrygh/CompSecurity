// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.IBinder;
import com.spotify.mobile.android.spotlets.running.service.RunningService;

public final class few
    implements ServiceConnection
{

    public String a;
    public fey b;
    public fez c;
    public ffb d;
    public RunningService e;
    private final Context f;
    private final String g;
    private hfg h;

    public few(Context context, String s, String s1)
    {
        f = (Context)ctz.a(context);
        g = (String)ctz.a(s);
        a = s1;
    }

    static void a(few few1, Uri uri)
    {
        if (few1.c != null)
        {
            few1.c.a(uri);
        }
    }

    public final void a()
    {
        toString();
        RunningService.a(f, this, g, a);
    }

    public final void a(int i)
    {
        if (d == null)
        {
            e.a(i);
            return;
        } else
        {
            RunningService runningservice = e;
            ffa ffa1 = new ffa(d, (byte)0);
            String s = fds.a(runningservice.f, i);
            RunningService.a(runningservice.e);
            runningservice.e = runningservice.b.a(i).a(((dup)dmz.a(dup)).c()).a(new com.spotify.mobile.android.spotlets.running.service.RunningService._cls2(runningservice, s, ffa1));
            return;
        }
    }

    public final void b()
    {
        toString();
        RunningService runningservice = e;
        if (e != null)
        {
            c = null;
            d = null;
            h.unsubscribe();
            RunningService.a(f, this);
            e = null;
        }
        b = null;
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        e = ((fev)ibinder).a;
        componentname = e.b.e.c(fef.a()).a(((dup)dmz.a(dup)).c());
        h = hew.a(new hew._cls3(new fex(this)), componentname);
        if (b != null)
        {
            b.a();
            b = null;
        }
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        e = null;
    }
}
