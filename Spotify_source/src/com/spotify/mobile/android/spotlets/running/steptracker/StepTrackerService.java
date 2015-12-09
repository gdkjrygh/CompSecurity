// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.running.steptracker;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import com.spotify.mobile.android.motion.MotionProcessor;
import com.spotify.mobile.android.spotlets.running.auto.MotionState;
import ctz;
import dmz;
import dvk;
import ffc;
import fff;
import ffg;
import ffh;

public class StepTrackerService extends Service
    implements ffc
{

    public fff a;
    private final Binder b = new ffh(this);

    public StepTrackerService()
    {
        dmz.a(ffg);
    }

    public static void a(Context context, ServiceConnection serviceconnection)
    {
        Intent intent = new Intent(context, com/spotify/mobile/android/spotlets/running/steptracker/StepTrackerService);
        dvk.a(context, intent, serviceconnection, com/spotify/mobile/android/spotlets/running/steptracker/StepTrackerService.getSimpleName());
        context.startService(intent);
    }

    public static void b(Context context, ServiceConnection serviceconnection)
    {
        dvk.a(context, serviceconnection, com/spotify/mobile/android/spotlets/running/steptracker/StepTrackerService.getSimpleName());
        context.stopService(new Intent(context, com/spotify/mobile/android/spotlets/running/steptracker/StepTrackerService));
    }

    public final void a(double d)
    {
    }

    public final void a(MotionState motionstate)
    {
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[MotionState.values().length];
                try
                {
                    a[MotionState.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[MotionState.d.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[motionstate.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
        case 2: // '\002'
            stopSelf();
            break;
        }
    }

    public IBinder onBind(Intent intent)
    {
        boolean flag = false;
        if (a == null)
        {
            flag = true;
        }
        ctz.a(flag, "MotionStateProducer is already created. More than one connection to the service?");
        a = ffg.a();
        a.a(this);
        intent = a;
        if (!((fff) (intent)).d)
        {
            intent.d = true;
            ((fff) (intent)).a.addObserver(intent);
        }
        return b;
    }

    public void onCreate()
    {
        super.onCreate();
    }

    public void onDestroy()
    {
        a.b(this);
        a.a();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        return 2;
    }
}
