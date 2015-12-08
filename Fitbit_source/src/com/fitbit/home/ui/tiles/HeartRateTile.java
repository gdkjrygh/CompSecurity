// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui.tiles;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.heartrate.HeartRateDailySummary;
import com.fitbit.data.domain.heartrate.HeartRateZone;
import com.fitbit.e.a;
import com.fitbit.livedata.LiveDataPacket;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.ui.FlipImageView;
import com.fitbit.util.bl;
import com.fitbit.util.format.e;

// Referenced classes of package com.fitbit.home.ui.tiles:
//            p, e

public class HeartRateTile extends p
{
    private static final class HeartrateZone extends Enum
    {

        public static final HeartrateZone a;
        public static final HeartrateZone b;
        public static final HeartrateZone c;
        public static final HeartrateZone d;
        public static final HeartrateZone e;
        public static final HeartrateZone f;
        public static final HeartrateZone g;
        private static final HeartrateZone h[];
        private int iconDrawableId;
        private int stringId;

        public static HeartrateZone valueOf(String s1)
        {
            return (HeartrateZone)Enum.valueOf(com/fitbit/home/ui/tiles/HeartRateTile$HeartrateZone, s1);
        }

        public static HeartrateZone[] values()
        {
            return (HeartrateZone[])h.clone();
        }

        public int a()
        {
            return iconDrawableId;
        }

        public int b()
        {
            return stringId;
        }

        static 
        {
            a = new HeartrateZone("RESTING", 0, 0x7f020338, 0);
            b = new HeartrateZone("FAT_BURN", 1, 0x7f0201d5, 0x7f0802ee);
            c = new HeartrateZone("CARDIO", 2, 0x7f020116, 0x7f0802c4);
            d = new HeartrateZone("PEAK", 3, 0x7f020310, 0x7f080334);
            e = new HeartrateZone("IN_CUSTOM", 4, 0x7f0202b8, 0x7f0802c4);
            f = new HeartrateZone("BELOW_CUSTOM", 5, 0x7f02006a, 0x7f0802ee);
            g = new HeartrateZone("ABOVE_CUSTOM", 6, 0x7f020034, 0x7f080334);
            h = (new HeartrateZone[] {
                a, b, c, d, e, f, g
            });
        }

        private HeartrateZone(String s1, int i, int i1, int j1)
        {
            super(s1, i);
            iconDrawableId = i1;
            stringId = j1;
        }
    }


    private static final String a = "HeartRateTile";
    private static final String b = "--";
    private TextView c;
    private TextView d;

    public HeartRateTile()
    {
    }

    private int a(com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType heartratezonetype)
    {
        if (u == null || u.s == null) goto _L2; else goto _L1
_L1:
        HeartRateZone heartratezone = u.s.a(heartratezonetype);
        if (heartratezone == null) goto _L2; else goto _L3
_L3:
        int i = heartratezone.b();
_L10:
        if (i != 0) goto _L5; else goto _L4
_L4:
        int i1;
        com.fitbit.e.a.a("HeartRateTile", "Calculating zone by client", new Object[0]);
        i1 = l();
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.values().length];
                try
                {
                    a[com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.FAT_BURN.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.CARDIO.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.PEAK.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.fitbit.home.ui.tiles._cls1.a[heartratezonetype.ordinal()];
        JVM INSTR tableswitch 1 3: default 92
    //                   1 94
    //                   2 103
    //                   3 112;
           goto _L5 _L6 _L7 _L8
_L5:
        return i;
_L6:
        return (int)((double)i1 * 0.5D);
_L7:
        return (int)((double)i1 * 0.69999999999999996D);
_L8:
        return (int)((double)i1 * 0.90000000000000002D);
_L2:
        i = 0;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private HeartrateZone a(int i)
    {
        if (m())
        {
            int i1 = n();
            int j1 = s();
            if (i < i1)
            {
                return HeartrateZone.f;
            }
            if (i < j1)
            {
                return com.fitbit.home.ui.tiles.HeartrateZone.e;
            } else
            {
                return HeartrateZone.g;
            }
        }
        if (i < a(com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.FAT_BURN))
        {
            return com.fitbit.home.ui.tiles.HeartrateZone.a;
        }
        if (i < a(com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.CARDIO))
        {
            return HeartrateZone.b;
        }
        if (i < a(com.fitbit.data.domain.heartrate.HeartRateZone.HeartRateZoneType.PEAK))
        {
            return HeartrateZone.c;
        } else
        {
            return HeartrateZone.d;
        }
    }

    private int j()
    {
        boolean flag = false;
        int i = ((flag) ? 1 : 0);
        if (u != null)
        {
            i = ((flag) ? 1 : 0);
            if (u.s != null)
            {
                i = u.s.i();
            }
        }
        return i;
    }

    private short k()
    {
        if (u != null && u.l != null && u.l.h())
        {
            return u.l.f();
        } else
        {
            return -1;
        }
    }

    private int l()
    {
        int i = 220;
        Profile profile;
        if (u == null)
        {
            profile = an.a().b();
        } else
        {
            profile = u.c;
        }
        if (profile != null)
        {
            i = (int)((double)220 - profile.b(v));
        }
        return i;
    }

    private boolean m()
    {
        return false;
    }

    private int n()
    {
        return 100;
    }

    private int s()
    {
        return 152;
    }

    protected boolean N_()
    {
        boolean flag;
        if (j() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return !r() && !ServerGateway.a().d() && !flag;
    }

    protected int P_()
    {
        return 0x7f040174;
    }

    protected void R_()
    {
        int i = k();
        int i1 = j();
        String s1;
        bl bl1;
        if (i1 > 0)
        {
            s1 = String.valueOf(i1);
        } else
        {
            s1 = "--";
        }
        bl1 = new bl();
        if (r())
        {
            Object obj = "--";
            if (i > 0)
            {
                obj = e.e(i);
            }
            bl1.a(i(), ((String) (obj)));
            bl1.append(" ");
            bl1.c(i(), i().getString(0x7f0802bc));
            obj = a(i);
            if (obj == com.fitbit.home.ui.tiles.HeartrateZone.a)
            {
                s1 = String.format(i().getString(0x7f080217), new Object[] {
                    s1
                });
            } else
            {
                s1 = i().getString(((HeartrateZone) (obj)).b());
            }
            i = ((HeartrateZone) (obj)).a();
            d.setVisibility(0);
        } else
        {
            bl1.a(i(), s1);
            bl1.append(" ");
            bl1.c(i(), i().getString(0x7f0802bd));
            i = com.fitbit.home.ui.tiles.HeartrateZone.a.a();
            s1 = null;
            d.setVisibility(8);
        }
        c.setText(bl1);
        d.setText(s1);
        x.setImageResource(i);
    }

    protected void a(View view)
    {
        super.a(view);
        c = (TextView)view.findViewById(0x7f110394);
        d = (TextView)view.findViewById(0x7f110421);
    }

    protected String b()
    {
        return i().getString(0x7f080243);
    }

    protected int c()
    {
        return 0x7f020236;
    }

    public CharSequence f()
    {
        return i().getText(0x7f080242);
    }
}
