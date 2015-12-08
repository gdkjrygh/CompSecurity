// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.tinkerbell;

import com.spotify.mobile.android.util.Assertion;
import dmz;
import fjv;
import fjw;
import fjx;
import fjy;
import fjz;
import fka;
import fkb;
import fkc;
import fkd;
import gip;
import giq;

public final class Onboarding
{

    public static final gip a = gip.b("onboarding.playlist.closed");
    public static final gip b = gip.b("onboarding.player.save.tooltip.closed");
    public static final gip c = gip.b("onboarding.player.shufflebutton.hide");
    public static final gip d = gip.b("onboarding.snackbar.player.show");
    public final giq e = (giq)dmz.a(giq);

    public Onboarding()
    {
    }

    public static fka a(Type type)
    {
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[Type.values().length];
                try
                {
                    a[Type.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[Type.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[Type.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[Type.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[Type.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Type.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Type.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[type.ordinal()])
        {
        default:
            Assertion.a("Unsupported onboarding type");
            return new fjx();

        case 1: // '\001'
            return new fkb();

        case 2: // '\002'
            return new fkc();

        case 3: // '\003'
            return new fkd();

        case 4: // '\004'
            return new fjv();

        case 5: // '\005'
            return new fjw();

        case 6: // '\006'
            return new fjz();

        case 7: // '\007'
            return new fjy();
        }
    }


    private class Type extends Enum
    {

        public static final Type a;
        public static final Type b;
        public static final Type c;
        public static final Type d;
        public static final Type e;
        public static final Type f;
        public static final Type g;
        private static final Type h[];

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(com/spotify/mobile/android/spotlets/tinkerbell/Onboarding$Type, s);
        }

        public static Type[] values()
        {
            return (Type[])h.clone();
        }

        static 
        {
            a = new Type("PLAYER_SAVE_TOOLTIP", 0);
            b = new Type("SHUFFLE_PLAY_BUTTON_TOOLTIP", 1);
            c = new Type("SNACK_BAR_PLAYER_TOOLTIP", 2);
            d = new Type("CONNECT_NPB_TOOLTIP", 3);
            e = new Type("CONNECT_NPV_TOOLTIP", 4);
            f = new Type("ON_DEMAND_UPSELL", 5);
            g = new Type("OFFLINE_SYNC_TOOLTIP", 6);
            h = (new Type[] {
                a, b, c, d, e, f, g
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }

}
