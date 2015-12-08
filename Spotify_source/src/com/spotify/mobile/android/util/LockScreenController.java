// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import com.spotify.mobile.android.ui.activity.LockScreenActivity;
import ctz;
import gee;
import java.lang.ref.WeakReference;

public final class LockScreenController
    implements android.app.Application.ActivityLifecycleCallbacks
{

    private State a;
    private final gee b = new gee(this, (byte)0);
    private WeakReference c;
    private int d;
    private boolean e;

    public LockScreenController(Context context)
    {
        a = State.a;
        c = new WeakReference(null);
        ctz.a(context);
        context.registerReceiver(b, new IntentFilter("com.spotify.mobile.android.REQUIRE_LOCK_SCREEN"));
    }

    public static int a(LockScreenController lockscreencontroller, int i)
    {
        lockscreencontroller.d = i;
        return i;
    }

    public static State a(LockScreenController lockscreencontroller, State state)
    {
        lockscreencontroller.a = state;
        return state;
    }

    public static WeakReference a(LockScreenController lockscreencontroller)
    {
        return lockscreencontroller.c;
    }

    public static void a(Context context, int i, boolean flag)
    {
        b(context, i, flag);
    }

    public static void a(Context context, String s)
    {
        Intent intent = new Intent("com.spotify.mobile.android.REQUIRE_LOCK_SCREEN");
        intent.putExtra("lockscreen_required", false);
        intent.putExtra("sender_id", s);
        context.sendBroadcast(intent);
    }

    public static void a(Context context, String s, int i, boolean flag)
    {
        Intent intent = new Intent("com.spotify.mobile.android.REQUIRE_LOCK_SCREEN");
        intent.putExtra("lockscreen_required", true);
        intent.putExtra("sender_id", s);
        intent.putExtra("logo_resource_id", i);
        intent.putExtra("dismissible_lockscreen", flag);
        context.sendBroadcast(intent);
    }

    public static boolean a(Activity activity)
    {
        return activity instanceof LockScreenActivity;
    }

    public static boolean a(LockScreenController lockscreencontroller, boolean flag)
    {
        lockscreencontroller.e = flag;
        return flag;
    }

    public static int b(LockScreenController lockscreencontroller)
    {
        return lockscreencontroller.d;
    }

    private static void b(Context context, int i, boolean flag)
    {
        Intent intent = new Intent(context, com/spotify/mobile/android/ui/activity/LockScreenActivity);
        intent.putExtra("logo_resource_id", i);
        intent.putExtra("dismissible_lockscreen", flag);
        intent.addFlags(0x10000000);
        context.startActivity(intent);
    }

    public static boolean c(LockScreenController lockscreencontroller)
    {
        return lockscreencontroller.e;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle)
    {
    }

    public final void onActivityDestroyed(Activity activity)
    {
    }

    public final void onActivityPaused(Activity activity)
    {
        if (c.get() != null && activity.equals(c.get()))
        {
            c.clear();
        }
    }

    public final void onActivityResumed(Activity activity)
    {
        if (activity != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        c = new WeakReference(activity);
        public final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[State.values().length];
                try
                {
                    a[State.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[State.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[a.ordinal()];
        JVM INSTR tableswitch 1 2: default 52
    //                   1 53
    //                   2 65;
           goto _L3 _L4 _L5
_L5:
        continue; /* Loop/switch isn't completed */
_L3:
        return;
_L4:
        if (!(activity instanceof LockScreenActivity)) goto _L1; else goto _L6
_L6:
        activity.finish();
        return;
        if (activity instanceof LockScreenActivity) goto _L1; else goto _L7
_L7:
        b(activity, d, e);
        return;
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle)
    {
    }

    public final void onActivityStarted(Activity activity)
    {
    }

    public final void onActivityStopped(Activity activity)
    {
    }

    private class State extends Enum
    {

        public static final State a;
        public static final State b;
        private static final State c[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/spotify/mobile/android/util/LockScreenController$State, s);
        }

        public static State[] values()
        {
            return (State[])c.clone();
        }

        static 
        {
            a = new State("DONT_SHOW", 0);
            b = new State("SHOW", 1);
            c = (new State[] {
                a, b
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }

}
