// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import ctz;
import dwx;
import dxc;
import dxd;
import eao;
import eap;

// Referenced classes of package com.spotify.mobile.android.service.media:
//            MediaService

public final class MediaServiceConsumer
    implements ServiceConnection, dwx
{

    private dxc a;
    private State b;
    private Context c;
    private final eap d;

    public MediaServiceConsumer(eap eap1)
    {
        d = (eap)ctz.a(eap1);
    }

    private void b()
    {
        MediaService.b(c, this);
    }

    public final void a()
    {
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[State.values().length];
                try
                {
                    a[State.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[State.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[State.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[State.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[b.ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 49
    //                   2 53;
           goto _L1 _L2 _L3
_L1:
        b = State.d;
        d.f();
        return;
_L2:
        b();
_L3:
        a.b();
        a.b(this);
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final void a(Context context)
    {
        c = context;
        b = State.b;
        ctz.a(c);
        b = State.b;
        MediaService.a(c, this);
        a = dxd.a(context);
        a.a(this);
        a.a();
    }

    public final void a(Flags flags)
    {
        if (!State.c.equals(b))
        {
            String.valueOf(b);
        }
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        if (State.b.equals(b))
        {
            if (d != null)
            {
                d.a(((eao)ibinder).a);
            }
            b = State.c;
        } else
        if (State.d.equals(b))
        {
            b();
            return;
        }
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        a();
    }

    private class State extends Enum
    {

        public static final State a;
        public static final State b;
        public static final State c;
        public static final State d;
        private static final State e[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/spotify/mobile/android/service/media/MediaServiceConsumer$State, s);
        }

        public static State[] values()
        {
            return (State[])e.clone();
        }

        static 
        {
            a = new State("INIT", 0);
            b = new State("WAITING_FOR_MEDIA_SERVICE", 1);
            c = new State("ACTIVE", 2);
            d = new State("STOPPED", 3);
            e = (new State[] {
                a, b, c, d
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }

}
