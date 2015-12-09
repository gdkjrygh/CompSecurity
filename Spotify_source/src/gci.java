// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.KeyEvent;
import android.view.View;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.service.ConnectDevice;
import com.spotify.mobile.android.spotlets.connect.Tech;
import com.spotify.mobile.android.ui.activity.DeviceActivity;
import com.spotify.mobile.android.ui.activity.VolumeWidgetActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;

public final class gci
{

    private static boolean a;

    public static float a(float f)
    {
        float f1;
        if (f > 1.0F)
        {
            f1 = 1.0F;
        } else
        {
            f1 = f;
            if (f < 0.0F)
            {
                return 0.0F;
            }
        }
        return f1;
    }

    public static int a(com.spotify.mobile.android.service.ConnectDevice.DeviceType devicetype)
    {
        final class _cls3
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.service.ConnectDevice.DeviceType.values().length];
                try
                {
                    a[com.spotify.mobile.android.service.ConnectDevice.DeviceType.g.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.service.ConnectDevice.DeviceType.e.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.service.ConnectDevice.DeviceType.f.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls3.a[devicetype.ordinal()])
        {
        default:
            return 0x7f0801ef;

        case 1: // '\001'
            return 0x7f0801ee;

        case 2: // '\002'
            return 0x7f0801f0;

        case 3: // '\003'
            return 0x7f0801f1;
        }
    }

    public static int a(ConnectDevice connectdevice)
    {
        switch (_cls3.a[connectdevice.l.ordinal()])
        {
        case 2: // '\002'
        default:
            return 0x7f02018b;

        case 1: // '\001'
            return 0x7f02018a;

        case 3: // '\003'
            return 0x7f02018c;
        }
    }

    public static String a(Context context, ConnectDevice connectdevice)
    {
        String s = connectdevice.p;
        connectdevice = connectdevice.l;
        if (s.length() > 0)
        {
            switch (_cls3.a[connectdevice.ordinal()])
            {
            default:
                return String.format(context.getResources().getString(0x7f0801da), new Object[] {
                    s
                });

            case 2: // '\002'
                return String.format(context.getResources().getString(0x7f0801dc), new Object[] {
                    s
                });

            case 3: // '\003'
                return String.format(context.getResources().getString(0x7f0801de), new Object[] {
                    s
                });

            case 1: // '\001'
                return String.format(context.getResources().getString(0x7f0801d8), new Object[] {
                    s
                });
            }
        }
        switch (_cls3.a[connectdevice.ordinal()])
        {
        default:
            return context.getResources().getString(0x7f0801d9);

        case 2: // '\002'
            return context.getResources().getString(0x7f0801db);

        case 3: // '\003'
            return context.getResources().getString(0x7f0801dd);

        case 1: // '\001'
            return context.getResources().getString(0x7f0801d7);
        }
    }

    public static transient void a()
    {
    }

    public static void a(PlayerState playerstate, dwh dwh1, Flags flags, Activity activity, fjm fjm1, View view)
    {
        gci;
        JVM INSTR monitorenter ;
        boolean flag;
        ctz.a(playerstate);
        ctz.a(dwh1);
        ctz.a(flags);
        ctz.a(activity);
        flag = a;
        if (!flag) goto _L2; else goto _L1
_L1:
        gci;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (playerstate.isPaused()) goto _L1; else goto _L3
_L3:
        ConnectDevice connectdevice;
        if (!dwh1.c() || !((ConnectManager)dwh1.f()).i())
        {
            break MISSING_BLOCK_LABEL_157;
        }
        connectdevice = ((ConnectManager)dwh1.f()).f();
_L6:
        if (connectdevice == null) goto _L1; else goto _L4
_L4:
        flag = ((Boolean)flags.a(fys.n)).booleanValue();
        if (flag && (fjm1 == null || view == null)) goto _L1; else goto _L5
_L5:
        a = true;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        playerstate = DeviceActivity.a(activity, com.spotify.mobile.android.util.ClientEvent.SubEvent.ap);
        playerstate.putExtra("onboarding_flow_enabled", true);
        activity.startActivityForResult(playerstate, 1);
          goto _L1
        playerstate;
        throw playerstate;
        connectdevice = null;
          goto _L6
        flags = connectdevice.p;
        fjm1 = connectdevice.l;
        playerstate = "";
        if (flags.length() <= 0) goto _L8; else goto _L7
_L7:
        _cls3.a[fjm1.ordinal()];
        JVM INSTR tableswitch 1 3: default 602
    //                   1 494
    //                   2 446
    //                   3 470;
           goto _L9 _L10 _L11 _L12
_L9:
        playerstate = String.format(activity.getResources().getString(0x7f0801d0), new Object[] {
            flags
        });
_L8:
        if (flags.length() != 0 && playerstate.length() <= 55) goto _L14; else goto _L13
_L13:
        _cls3.a[fjm1.ordinal()];
        JVM INSTR tableswitch 1 3: default 605
    //                   1 544
    //                   2 518
    //                   3 531;
           goto _L15 _L16 _L17 _L18
_L15:
        playerstate = activity.getResources().getString(0x7f0801cf);
_L14:
        _cls3.a[connectdevice.l.ordinal()];
        JVM INSTR tableswitch 1 3: default 608
    //                   1 557
    //                   2 564
    //                   3 571;
           goto _L19 _L20 _L21 _L22
_L27:
        int i;
        flags = activity.getString(i);
        _cls3.a[connectdevice.l.ordinal()];
        JVM INSTR tableswitch 1 3: default 615
    //                   1 578
    //                   2 585
    //                   3 592;
           goto _L23 _L24 _L25 _L26
_L28:
        playerstate = new fjq(i, playerstate, flags);
        playerstate.a = new android.view.View.OnClickListener(activity) {

            private Activity a;

            public final void onClick(View view1)
            {
                view1 = DeviceActivity.a(a, com.spotify.mobile.android.util.ClientEvent.SubEvent.aq);
                view1.putExtra("onboarding_flow_enabled", true);
                a.startActivityForResult(view1, 1);
            }

            
            {
                a = activity;
                super();
            }
        };
        playerstate.a(new fjt(dwh1) {

            private dwh a;

            public final void a()
            {
                gci.b(a);
            }

            
            {
                a = dwh1;
                super();
            }
        });
        dwh1 = fjm.a(activity);
        dwh1.d = playerstate;
        dwh1.a = com.spotify.mobile.android.spotlets.tinkerbell.Onboarding.Type.d;
        dwh1.a(view);
          goto _L1
_L11:
        playerstate = String.format(activity.getResources().getString(0x7f0801d2), new Object[] {
            flags
        });
          goto _L8
_L12:
        playerstate = String.format(activity.getResources().getString(0x7f0801d4), new Object[] {
            flags
        });
          goto _L8
_L10:
        playerstate = String.format(activity.getResources().getString(0x7f0801ca), new Object[] {
            flags
        });
          goto _L8
_L17:
        playerstate = activity.getResources().getString(0x7f0801d1);
          goto _L14
_L18:
        playerstate = activity.getResources().getString(0x7f0801d3);
          goto _L14
_L16:
        playerstate = activity.getResources().getString(0x7f0801c9);
          goto _L14
_L20:
        i = 0x7f0801cb;
          goto _L27
_L21:
        i = 0x7f0801cd;
          goto _L27
_L22:
        i = 0x7f0801ce;
          goto _L27
_L24:
        i = 0x7f0201f7;
          goto _L28
_L25:
        i = 0x7f0201f8;
          goto _L28
_L26:
        i = 0x7f0201f9;
          goto _L28
_L19:
        i = 0x7f0801cc;
          goto _L27
_L23:
        i = 0x7f0201f8;
          goto _L28
    }

    public static boolean a(dwh dwh1)
    {
        if (dwh1.c())
        {
            return ((ConnectManager)dwh1.f()).i() || ((ConnectManager)dwh1.f()).m();
        } else
        {
            return false;
        }
    }

    public static boolean a(dwh dwh1, KeyEvent keyevent, Activity activity)
    {
        boolean flag1 = false;
        boolean flag = false;
        gci;
        JVM INSTR monitorenter ;
        boolean flag2 = dwh1.c();
        if (flag2) goto _L2; else goto _L1
_L1:
        gci;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        ConnectDevice connectdevice;
        int j;
        j = activity.getVolumeControlStream();
        connectdevice = ((ConnectManager)dwh1.f()).d();
        if (connectdevice == null) goto _L4; else goto _L3
_L3:
        if (Tech.a(connectdevice) != Tech.b) goto _L4; else goto _L5
_L5:
        int i = 0x80000000;
_L14:
        if (j == i)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        activity.setVolumeControlStream(i);
        if (keyevent.getAction() != 0 || !dwh1.c() || ((ConnectManager)dwh1.f()).i()) goto _L7; else goto _L6
_L6:
        keyevent.getKeyCode();
        JVM INSTR tableswitch 24 25: default 234
    //                   24 179
    //                   25 196;
           goto _L8 _L9 _L10
_L13:
        if (!flag || connectdevice == null) goto _L1; else goto _L11
_L11:
        if (!a(dwh1) || (activity instanceof DeviceActivity)) goto _L1; else goto _L12
_L12:
        activity.startActivity(VolumeWidgetActivity.a(connectdevice, ((ConnectManager)dwh1.f()).j(), activity));
          goto _L1
_L9:
        flag = ((ConnectManager)dwh1.f()).k();
          goto _L13
_L10:
        flag = ((ConnectManager)dwh1.f()).l();
          goto _L13
_L7:
        flag = false;
          goto _L1
        dwh1;
        throw dwh1;
_L4:
        i = 3;
          goto _L14
_L8:
        flag = flag1;
          goto _L13
    }

    public static void b(dwh dwh1)
    {
        gci;
        JVM INSTR monitorenter ;
        ctz.a(dwh1);
        if (!dwh1.c()) goto _L2; else goto _L1
_L1:
        ConnectDevice connectdevice = ((ConnectManager)dwh1.f()).f();
_L4:
        if (connectdevice == null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        ((ConnectManager)dwh1.f()).e(connectdevice.b);
        a = false;
        gci;
        JVM INSTR monitorexit ;
        return;
        dwh1;
        throw dwh1;
_L2:
        connectdevice = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        gip.b("connect_logged_in_devices");
    }
}
