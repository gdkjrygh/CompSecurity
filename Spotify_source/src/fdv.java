// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.spotify.mobile.android.spotlets.running.steptracker.StepTrackerService;

public final class fdv
    implements ServiceConnection
{

    public final Context a;
    public fdw b;
    private fff c;

    public fdv(Context context)
    {
        a = context;
    }

    public final void a()
    {
        if (c != null)
        {
            c.b(b);
            StepTrackerService.b(a, this);
            c = null;
        }
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        c = ((ffh)ibinder).a.a;
        ctz.a(b);
        c.a(b);
        b.a(c.c, c.b);
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        if (c != null)
        {
            c.b(b);
        }
    }
}
