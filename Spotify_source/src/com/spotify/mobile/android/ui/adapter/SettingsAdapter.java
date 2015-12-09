// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.adapter;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.text.format.DateUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Spinner;
import com.google.common.base.Predicates;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.arsenal.ArsenalActivity;
import com.spotify.mobile.android.arsenal.FeedbackMode;
import com.spotify.mobile.android.service.LoginActivity;
import com.spotify.mobile.android.ui.activity.DeleteCacheAndSettingsActivity;
import com.spotify.mobile.android.ui.activity.DeviceActivity;
import com.spotify.mobile.android.ui.activity.NielsenOcrSettingsActivity;
import com.spotify.mobile.android.ui.activity.SoundEffectsWarningActivity;
import com.spotify.mobile.android.ui.activity.upsell.Reason;
import com.spotify.mobile.android.ui.cell.settings.AbstractSettingsCell;
import com.spotify.mobile.android.ui.cell.settings.BroadcastSettingsCell;
import com.spotify.mobile.android.ui.cell.settings.CrossfadeSettingsCell;
import com.spotify.mobile.android.ui.cell.settings.FacebookSettingsCell;
import com.spotify.mobile.android.ui.cell.settings.LastFmSettingsCell;
import com.spotify.mobile.android.ui.cell.settings.NopSettingsCell;
import com.spotify.mobile.android.ui.cell.settings.SpinnerSettingsCell;
import com.spotify.mobile.android.ui.cell.settings.ToggleButtonSettingsCell;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.internal.service.DeleteCacheService;
import ctz;
import cua;
import cuv;
import dkb;
import dmz;
import dwg;
import eop;
import fiy;
import fop;
import fos;
import fti;
import ftj;
import ftk;
import ftp;
import fua;
import fub;
import fys;
import gcw;
import ghi;
import ghj;
import gms;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class SettingsAdapter extends BaseAdapter
{

    private static final int n = ViewType.values().length;
    private String A;
    private fop B;
    public final Flags a;
    public ArrayList b;
    public Reason c[];
    public Reason d[];
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public String l;
    public String m;
    private Context o;
    private Resources p;
    private Cursor q;
    private final ArrayList r = new ArrayList();
    private cua s;
    private String t[];
    private String u[];
    private fua v;
    private fua w;
    private final boolean x;
    private final boolean y;
    private final boolean z;

    public SettingsAdapter(Context context, Flags flags)
    {
        boolean flag1 = true;
        super();
        b = new ArrayList();
        v = new fua() {

            private int a[] = {
                0, 2, 3, 4
            };

            public final int a(int i1)
            {
                return a[i1];
            }

            public final int b(int i1)
            {
                if (i1 > 0)
                {
                    if (i1 <= 2)
                    {
                        return 1;
                    }
                    if (i1 <= 3)
                    {
                        return 2;
                    }
                    if (i1 <= 4)
                    {
                        return 3;
                    }
                }
                return 0;
            }

        };
        w = new fua() {

            private int a[] = {
                2, 3, 4
            };

            public final int a(int i1)
            {
                return a[i1];
            }

            public final int b(int i1)
            {
                if (i1 > 2)
                {
                    if (i1 <= 3)
                    {
                        return 1;
                    }
                    if (i1 <= 4)
                    {
                        return 2;
                    }
                }
                return 0;
            }

        };
        B = (fop)dmz.a(fop);
        dmz.a(fos);
        a = (Flags)ctz.a(flags);
        o = (Context)ctz.a(context);
        p = (Resources)ctz.a(context.getResources());
        A = ((ClientInfo)dmz.a(com/spotify/mobile/android/util/ClientInfo)).a.versionName;
        boolean flag;
        if ("com.spotify.music.canary".equals(o.getPackageName()))
        {
            A = (new StringBuilder()).append(A).append(" release (").append(c()).append(")").toString();
        } else
        if ("beta".equals("release"))
        {
            A = (new StringBuilder()).append(A).append(" ").append("beta".toUpperCase(Locale.US)).toString();
        }
        l = "";
        t = (new String[] {
            context.getString(0x7f08049f), context.getString(0x7f0804a2), context.getString(0x7f0804a1), context.getString(0x7f0804a0)
        });
        u = (new String[] {
            context.getString(0x7f0804a2), context.getString(0x7f0804a1), context.getString(0x7f0804a0)
        });
        h = ((Boolean)a.a(fys.ac)).booleanValue();
        i = ((Boolean)a.a(fys.ab)).booleanValue();
        c = a(h);
        d = b(h);
        g = dwg.a(flags);
        y = ((Boolean)a.a(fys.k)).booleanValue();
        context = o;
        flags = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
        if (!context.getPackageManager().queryIntentActivities(flags, 0x10000).isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        z = flag;
        context = dkb.a(o);
        if (context.a(a) && context.a())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        x = flag;
        r.add(Item.a);
        r.add(Item.b);
        r.add(Item.c);
        r.add(Item.d);
        r.add(Item.e);
        r.add(Item.f);
        r.add(Item.h);
        r.add(Item.i);
        r.add(Item.j);
        r.add(Item.k);
        r.add(Item.l);
        r.add(Item.m);
        r.add(Item.n);
        r.add(Item.o);
        r.add(Item.p);
        r.add(Item.q);
        r.add(Item.r);
        r.add(Item.v);
        r.add(Item.s);
        r.add(Item.t);
        r.add(Item.u);
        r.add(Item.w);
        r.add(Item.g);
        r.add(Item.x);
        r.add(Item.y);
        r.add(Item.z);
        a();
    }

    private AbstractSettingsCell a(ViewGroup viewgroup, AbstractSettingsCell abstractsettingscell)
    {
        Object obj = abstractsettingscell;
        if (abstractsettingscell == null)
        {
            obj = ToggleButtonSettingsCell.a(o, viewgroup);
            obj.d = a;
        }
        return ((AbstractSettingsCell) (obj));
    }

    private AbstractSettingsCell a(ViewGroup viewgroup, AbstractSettingsCell abstractsettingscell, int i1, com.spotify.mobile.android.util.ClientEvent.SubEvent subevent)
    {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(viewgroup.getContext().getString(i1)));
        return a(viewgroup, abstractsettingscell, intent, subevent);
    }

    private AbstractSettingsCell a(ViewGroup viewgroup, AbstractSettingsCell abstractsettingscell, Intent intent)
    {
        return a(viewgroup, abstractsettingscell, intent, null);
    }

    private AbstractSettingsCell a(ViewGroup viewgroup, AbstractSettingsCell abstractsettingscell, Intent intent, com.spotify.mobile.android.util.ClientEvent.SubEvent subevent)
    {
        Object obj = abstractsettingscell;
        if (abstractsettingscell == null)
        {
            obj = NopSettingsCell.a(o, viewgroup);
        }
        ((AbstractSettingsCell) (obj)).setOnClickListener(new android.view.View.OnClickListener(subevent, intent) {

            private com.spotify.mobile.android.util.ClientEvent.SubEvent a;
            private Intent b;
            private SettingsAdapter c;

            public final void onClick(View view)
            {
                if (a != null)
                {
                    view = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, a);
                    SettingsAdapter.c(c);
                    fop.a(SettingsAdapter.b(c), ViewUri.H, view);
                }
                SettingsAdapter.b(c).startActivity(b);
            }

            
            {
                c = SettingsAdapter.this;
                a = subevent;
                b = intent;
                super();
            }
        });
        return ((AbstractSettingsCell) (obj));
    }

    private AbstractSettingsCell a(ViewGroup viewgroup, AbstractSettingsCell abstractsettingscell, String as[], fua fua, Reason areason[])
    {
        if (abstractsettingscell == null)
        {
            viewgroup = SpinnerSettingsCell.a(o, viewgroup);
            abstractsettingscell = new ftp(o, as);
            viewgroup.setId(0x7f110109);
            ((SpinnerSettingsCell)viewgroup).d.setAdapter(abstractsettingscell);
            ((SpinnerSettingsCell)viewgroup).e = fua;
            ((SpinnerSettingsCell)viewgroup).g = a;
            ((SpinnerSettingsCell)viewgroup).f = (Reason[])Arrays.copyOf(areason, areason.length);
            return viewgroup;
        } else
        {
            return abstractsettingscell;
        }
    }

    static Flags a(SettingsAdapter settingsadapter)
    {
        return settingsadapter.a;
    }

    public static Reason[] a(boolean flag)
    {
        Reason reason1 = Reason.a;
        Reason reason2 = Reason.a;
        Reason reason3 = Reason.a;
        Reason reason;
        if (flag)
        {
            reason = Reason.a;
        } else
        {
            reason = Reason.i;
        }
        return (new Reason[] {
            reason1, reason2, reason3, reason
        });
    }

    static Context b(SettingsAdapter settingsadapter)
    {
        return settingsadapter.o;
    }

    public static Reason[] b(boolean flag)
    {
        Reason reason1 = Reason.a;
        Reason reason2 = Reason.a;
        Reason reason;
        if (flag)
        {
            reason = Reason.a;
        } else
        {
            reason = Reason.i;
        }
        return (new Reason[] {
            reason1, reason2, reason
        });
    }

    static fop c(SettingsAdapter settingsadapter)
    {
        return settingsadapter.B;
    }

    private static String c()
    {
        String s1;
        try
        {
            s1 = String.valueOf(DateUtils.getRelativeTimeSpanString((new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US)).parse("").getTime(), System.currentTimeMillis(), 0x36ee80L));
        }
        catch (ParseException parseexception)
        {
            return "";
        }
        return s1;
    }

    static void d(SettingsAdapter settingsadapter)
    {
        fop.a(settingsadapter.o, ViewUri.H, com.spotify.mobile.android.util.ClientEvent.SubEvent.A);
        Intent intent = gms.a(settingsadapter.o).a;
        intent.putExtra("extra_manual_login", true);
        settingsadapter.o.startActivity(LoginActivity.a(settingsadapter.o, intent));
        ((Activity)settingsadapter.o).finish();
    }

    static void e(SettingsAdapter settingsadapter)
    {
        if (SoundEffectsWarningActivity.a(settingsadapter.o))
        {
            fos.a((Activity)settingsadapter.o);
            return;
        } else
        {
            SoundEffectsWarningActivity.b(settingsadapter.o);
            return;
        }
    }

    public final void a()
    {
        cua cua1 = Predicates.a(new ftk(x), new ftj(z, y, h, i, g));
        s = Predicates.a(cua1, new fti(f, DeleteCacheService.c(o)));
        b = Lists.a(cuv.b(r, cua1));
        notifyDataSetChanged();
    }

    public final void a(Cursor cursor)
    {
        q = cursor;
        a();
    }

    public final boolean areAllItemsEnabled()
    {
        return false;
    }

    public final String[] b()
    {
        String s1;
        if (f)
        {
            s1 = (new StringBuilder("\n")).append(o.getString(0x7f0804ab)).toString();
        } else
        {
            s1 = "";
        }
        return (new String[] {
            (new StringBuilder()).append(o.getString(0x7f0804a8)).append(s1).toString(), o.getString(0x7f0804aa), (new StringBuilder()).append(o.getString(0x7f0804a9)).append(s1).toString(), (new StringBuilder()).append(o.getString(0x7f0804a6)).append(s1).toString(), o.getString(0x7f080494), o.getString(0x7f0804a5), o.getString(0x7f0804a4), o.getString(0x7f0804a7)
        });
    }

    public final int getCount()
    {
        return b.size();
    }

    public final Object getItem(int i1)
    {
        return null;
    }

    public final long getItemId(int i1)
    {
        return (long)i1;
    }

    public final int getItemViewType(int i1)
    {
        if (i1 >= b.size())
        {
            Assertion.a("Unknown position when fetching item view type");
            return -1;
        }
        public final class _cls2
        {

            public static final int a[];

            static 
            {
                a = new int[Item.values().length];
                try
                {
                    a[Item.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror25) { }
                try
                {
                    a[Item.h.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror24) { }
                try
                {
                    a[Item.n.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    a[Item.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    a[Item.d.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    a[Item.e.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    a[Item.f.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    a[Item.p.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    a[Item.l.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    a[Item.m.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    a[Item.i.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    a[Item.j.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    a[Item.k.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    a[Item.b.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    a[Item.o.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[Item.z.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[Item.q.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[Item.s.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[Item.t.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[Item.u.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[Item.v.ordinal()] = 21;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[Item.w.ordinal()] = 22;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[Item.r.ordinal()] = 23;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[Item.x.ordinal()] = 24;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[Item.y.ordinal()] = 25;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[Item.g.ordinal()] = 26;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls2.a[((Item)b.get(i1)).ordinal()])
        {
        default:
            Assertion.a("Unknown position when fetching item view type");
            return -1;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
            return ViewType.a.ordinal();

        case 7: // '\007'
            return ViewType.i.ordinal();

        case 8: // '\b'
            return ViewType.j.ordinal();

        case 9: // '\t'
        case 10: // '\n'
            return ViewType.b.ordinal();

        case 11: // '\013'
            return ViewType.c.ordinal();

        case 12: // '\f'
            return ViewType.e.ordinal();

        case 13: // '\r'
            return ViewType.f.ordinal();

        case 14: // '\016'
            return ViewType.g.ordinal();

        case 15: // '\017'
            return ViewType.h.ordinal();

        case 16: // '\020'
            return ViewType.k.ordinal();

        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
        case 25: // '\031'
        case 26: // '\032'
            return ViewType.d.ordinal();
        }
    }

    public final View getView(int i1, View view, ViewGroup viewgroup)
    {
        String s1 = null;
        ctz.a(i1, b.size());
        Object obj;
        Object obj1;
        Object obj2;
        String s2;
        String s3;
        int j1;
        int k1;
        int l1;
        if (view instanceof AbstractSettingsCell)
        {
            obj2 = (AbstractSettingsCell)view;
        } else
        {
            obj2 = null;
        }
        _cls2.a[((Item)b.get(i1)).ordinal()];
        JVM INSTR tableswitch 1 26: default 164
    //                   1 172
    //                   2 545
    //                   3 805
    //                   4 1761
    //                   5 1816
    //                   6 1871
    //                   7 610
    //                   8 679
    //                   9 852
    //                   10 932
    //                   11 1012
    //                   12 1038
    //                   13 1987
    //                   14 1926
    //                   15 1588
    //                   16 1653
    //                   17 1306
    //                   18 1107
    //                   19 1162
    //                   20 1258
    //                   21 1718
    //                   22 1210
    //                   23 1353
    //                   24 1409
    //                   25 1482
    //                   26 741;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27
_L1:
        Assertion.a("Got unexpected position");
        return null;
_L2:
        obj1 = p.getString(0x7f08049d);
        view = p;
        if (fiy.a(a))
        {
            j1 = 0x7f08049c;
        } else
        {
            j1 = 0x7f08049b;
        }
        obj = view.getString(j1);
        if (q == null || !q.moveToFirst())
        {
            view = ((View) (obj));
        } else
        {
            view = ((View) (obj));
            if (gcw.a(q, "offline_mode"))
            {
                j1 = gcw.b(q, "seconds_to_offline_expiry");
                view = ((View) (obj));
                if (j1 >= 0)
                {
                    k1 = (int)TimeUnit.SECONDS.toHours(j1);
                    l1 = (int)TimeUnit.SECONDS.toDays(j1);
                    if (l1 > 0)
                    {
                        view = p;
                        if (fiy.a(a))
                        {
                            j1 = 0x7f080498;
                        } else
                        {
                            j1 = 0x7f080497;
                        }
                        view = view.getString(j1, new Object[] {
                            Integer.valueOf(l1)
                        });
                    } else
                    if (k1 > 0)
                    {
                        view = p;
                        if (fiy.a(a))
                        {
                            j1 = 0x7f08049a;
                        } else
                        {
                            j1 = 0x7f080499;
                        }
                        view = view.getString(j1, new Object[] {
                            Integer.valueOf(k1)
                        });
                    } else
                    {
                        view = p;
                        if (fiy.a(a))
                        {
                            j1 = 0x7f080496;
                        } else
                        {
                            j1 = 0x7f080495;
                        }
                        view = view.getString(j1);
                    }
                }
            }
        }
        obj = a(viewgroup, ((AbstractSettingsCell) (obj2)));
        ((AbstractSettingsCell) (obj)).setId(0x7f110108);
        ((ToggleButtonSettingsCell)obj).e = new fub() {

            private SettingsAdapter a;

            public final void a(boolean flag)
            {
                if (((Boolean)SettingsAdapter.a(a).a(fys.w)).booleanValue())
                {
                    eop.a(SettingsAdapter.b(a), flag);
                }
            }

            
            {
                a = SettingsAdapter.this;
                super();
            }
        };
        obj2 = obj1;
        obj1 = "offline_mode";
        viewgroup = view;
        view = ((View) (obj2));
_L29:
        ((AbstractSettingsCell) (obj)).setEnabled(isEnabled(i1));
        ((AbstractSettingsCell) (obj)).a(((String) (obj1)));
        ((AbstractSettingsCell) (obj)).b(view);
        ((AbstractSettingsCell) (obj)).c(viewgroup);
        if (q != null)
        {
            ((AbstractSettingsCell) (obj)).a(q);
        }
        return ((View) (obj));
_L3:
        view = p.getString(0x7f08049e);
        obj = p.getQuantityString(0x7f09001d, e, new Object[] {
            Integer.valueOf(e)
        });
        obj1 = "private_session";
        obj2 = a(viewgroup, ((AbstractSettingsCell) (obj2)));
        viewgroup = ((ViewGroup) (obj));
        obj = obj2;
        continue; /* Loop/switch isn't completed */
_L8:
        s2 = p.getString(0x7f080475);
        s3 = p.getString(0x7f080474);
        view = s2;
        obj1 = s1;
        viewgroup = s3;
        obj = obj2;
        if (obj2 == null)
        {
            obj = new BroadcastSettingsCell(o);
            view = s2;
            obj1 = s1;
            viewgroup = s3;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        obj1 = "";
        view = p.getString(0x7f080494);
        obj = p.getString(0x7f080493);
        obj2 = a(viewgroup, ((AbstractSettingsCell) (obj2)), gms.a(o, ViewUri.bD.toString()).a);
        viewgroup = ((ViewGroup) (obj));
        obj = obj2;
        continue; /* Loop/switch isn't completed */
_L27:
        view = p.getString(0x7f080478);
        obj = p.getString(0x7f080477);
        obj2 = a(viewgroup, ((AbstractSettingsCell) (obj2)), DeviceActivity.a(o, com.spotify.mobile.android.util.ClientEvent.SubEvent.ao));
        ((AbstractSettingsCell) (obj2)).setId(0x7f110102);
        obj1 = s1;
        viewgroup = ((ViewGroup) (obj));
        obj = obj2;
        continue; /* Loop/switch isn't completed */
_L4:
        view = p.getString(0x7f08047f);
        obj = p.getString(0x7f08047e);
        obj1 = "download_over_3g";
        obj2 = a(viewgroup, ((AbstractSettingsCell) (obj2)));
        viewgroup = ((ViewGroup) (obj));
        obj = obj2;
        continue; /* Loop/switch isn't completed */
_L10:
        obj = p.getString(0x7f0804ad);
        obj1 = p.getString(0x7f0804ac);
        if (j)
        {
            j = false;
            view = null;
        } else
        {
            view = ((View) (obj2));
        }
        obj2 = a(viewgroup, view, t, v, c);
        s1 = "stream_quality";
        viewgroup = ((ViewGroup) (obj1));
        view = ((View) (obj));
        obj1 = s1;
        obj = obj2;
        continue; /* Loop/switch isn't completed */
_L11:
        obj = p.getString(0x7f080481);
        obj1 = p.getString(0x7f080480);
        if (k)
        {
            k = false;
            view = null;
        } else
        {
            view = ((View) (obj2));
        }
        obj2 = a(viewgroup, view, u, w, d);
        s1 = "download_quality";
        viewgroup = ((ViewGroup) (obj1));
        view = ((View) (obj));
        obj1 = s1;
        obj = obj2;
        continue; /* Loop/switch isn't completed */
_L12:
        if (obj2 == null)
        {
            obj = FacebookSettingsCell.a(o, viewgroup);
            viewgroup = null;
            view = null;
            obj1 = s1;
        } else
        {
            viewgroup = null;
            view = null;
            obj1 = s1;
            obj = obj2;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        s2 = p.getString(0x7f080486);
        s3 = p.getString(0x7f080484);
        view = s2;
        obj1 = s1;
        viewgroup = s3;
        obj = obj2;
        if (obj2 == null)
        {
            obj = new LastFmSettingsCell(o);
            view = s2;
            obj1 = s1;
            viewgroup = s3;
        }
        continue; /* Loop/switch isn't completed */
_L19:
        view = p.getString(0x7f08048d);
        obj1 = p.getString(0x7f08048c);
        obj = a(viewgroup, ((AbstractSettingsCell) (obj2)), gms.a(o, "spotify:internal:licenses").a);
        viewgroup = ((ViewGroup) (obj1));
        obj1 = "";
        continue; /* Loop/switch isn't completed */
_L20:
        view = p.getString(0x7f08048b);
        obj1 = p.getString(0x7f08048a);
        obj = a(viewgroup, ((AbstractSettingsCell) (obj2)), 0x7f080627, com.spotify.mobile.android.util.ClientEvent.SubEvent.bE);
        viewgroup = ((ViewGroup) (obj1));
        obj1 = "";
        continue; /* Loop/switch isn't completed */
_L23:
        view = p.getString(0x7f0804b0);
        obj1 = p.getString(0x7f0804af);
        obj = a(viewgroup, ((AbstractSettingsCell) (obj2)), 0x7f080657, com.spotify.mobile.android.util.ClientEvent.SubEvent.bD);
        viewgroup = ((ViewGroup) (obj1));
        obj1 = "";
        continue; /* Loop/switch isn't completed */
_L21:
        view = p.getString(0x7f080489);
        obj1 = p.getString(0x7f080488);
        obj = a(viewgroup, ((AbstractSettingsCell) (obj2)), 0x7f080626, com.spotify.mobile.android.util.ClientEvent.SubEvent.bF);
        viewgroup = ((ViewGroup) (obj1));
        obj1 = "";
        continue; /* Loop/switch isn't completed */
_L18:
        view = p.getString(0x7f080490);
        obj = a(viewgroup, ((AbstractSettingsCell) (obj2)), new Intent(o, com/spotify/mobile/android/ui/activity/NielsenOcrSettingsActivity), com.spotify.mobile.android.util.ClientEvent.SubEvent.bG);
        viewgroup = "";
        obj1 = "";
        continue; /* Loop/switch isn't completed */
_L24:
        view = o.getString(0x7f0804b5);
        obj1 = A;
        obj = obj2;
        if (obj2 == null)
        {
            obj = NopSettingsCell.a(o, viewgroup);
        }
        ((AbstractSettingsCell) (obj)).setOnClickListener(null);
        obj2 = "";
        viewgroup = ((ViewGroup) (obj1));
        obj1 = obj2;
        continue; /* Loop/switch isn't completed */
_L25:
        view = o.getString(0x7f08047d);
        obj1 = o.getString(0x7f08047c);
        obj = obj2;
        if (obj2 == null)
        {
            obj = NopSettingsCell.a(o, viewgroup);
        }
        ((AbstractSettingsCell) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            private SettingsAdapter a;

            public final void onClick(View view1)
            {
                SettingsAdapter.c(a);
                fop.a(SettingsAdapter.b(a), ViewUri.H, new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.a, com.spotify.mobile.android.util.ClientEvent.SubEvent.c));
                view1 = new Intent(SettingsAdapter.b(a), com/spotify/mobile/android/ui/activity/DeleteCacheAndSettingsActivity);
                view1.addFlags(0x40000000);
                view1.addFlags(0x10000);
                SettingsAdapter.b(a).startActivity(view1);
            }

            
            {
                a = SettingsAdapter.this;
                super();
            }
        });
        ((AbstractSettingsCell) (obj)).setId(0x7f110104);
        viewgroup = ((ViewGroup) (obj1));
        obj1 = "";
        continue; /* Loop/switch isn't completed */
_L26:
        obj1 = o.getString(0x7f08048f);
        if (l.length() > 0)
        {
            view = o.getString(0x7f08048e, new Object[] {
                l
            });
        } else
        {
            view = "";
        }
        obj = obj2;
        if (obj2 == null)
        {
            obj = NopSettingsCell.a(o, viewgroup);
        }
        ((AbstractSettingsCell) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            private SettingsAdapter a;

            public final void onClick(View view1)
            {
                SettingsAdapter.d(a);
            }

            
            {
                a = SettingsAdapter.this;
                super();
            }
        });
        ((AbstractSettingsCell) (obj)).setId(0x7f110106);
        viewgroup = view;
        obj2 = "";
        view = ((View) (obj1));
        obj1 = obj2;
        continue; /* Loop/switch isn't completed */
_L16:
        view = o.getString(0x7f080472);
        obj1 = o.getString(0x7f080473);
        obj = obj2;
        if (obj2 == null)
        {
            obj = NopSettingsCell.a(o, viewgroup);
        }
        ((AbstractSettingsCell) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            private SettingsAdapter a;

            public final void onClick(View view1)
            {
                SettingsAdapter.e(a);
            }

            
            {
                a = SettingsAdapter.this;
                super();
            }
        });
        viewgroup = ((ViewGroup) (obj1));
        obj1 = "";
        continue; /* Loop/switch isn't completed */
_L17:
        view = o.getString(0x7f080641);
        obj1 = o.getString(0x7f080640);
        obj = obj2;
        if (obj2 == null)
        {
            obj = NopSettingsCell.a(o, viewgroup);
        }
        ((AbstractSettingsCell) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            private SettingsAdapter a;

            public final void onClick(View view1)
            {
                if (!ActivityManager.isUserAMonkey())
                {
                    view1 = new Intent();
                    view1.setComponent(new ComponentName(SettingsAdapter.b(a), "com.spotify.mobile.android.spotlets.debugtools.DebugMenuActivity"));
                    SettingsAdapter.b(a).startActivity(view1);
                }
            }

            
            {
                a = SettingsAdapter.this;
                super();
            }
        });
        viewgroup = ((ViewGroup) (obj1));
        obj1 = "";
        continue; /* Loop/switch isn't completed */
_L22:
        obj = new ghj();
        view = ((ghi) (obj)).a();
        viewgroup = ((ghi) (obj)).b();
        obj = ((ghi) (obj)).a(((AbstractSettingsCell) (obj2)));
        obj1 = "";
        continue; /* Loop/switch isn't completed */
_L5:
        obj1 = "gapless";
        view = p.getString(0x7f080483);
        obj = p.getString(0x7f080482);
        obj2 = a(viewgroup, ((AbstractSettingsCell) (obj2)));
        ((AbstractSettingsCell) (obj2)).setId(0x7f110105);
        viewgroup = ((ViewGroup) (obj));
        obj = obj2;
        continue; /* Loop/switch isn't completed */
_L6:
        obj1 = "show_unavailable_tracks";
        view = p.getString(0x7f0804b4);
        obj = p.getString(0x7f0804b3);
        obj2 = a(viewgroup, ((AbstractSettingsCell) (obj2)));
        ((AbstractSettingsCell) (obj2)).setId(0x7f11010a);
        viewgroup = ((ViewGroup) (obj));
        obj = obj2;
        continue; /* Loop/switch isn't completed */
_L7:
        obj1 = "normalize";
        view = p.getString(0x7f080492);
        obj = p.getString(0x7f080491);
        obj2 = a(viewgroup, ((AbstractSettingsCell) (obj2)));
        ((AbstractSettingsCell) (obj2)).setId(0x7f110107);
        viewgroup = ((ViewGroup) (obj));
        obj = obj2;
        continue; /* Loop/switch isn't completed */
_L15:
        obj1 = "crossfade";
        view = p.getString(0x7f08047b);
        s1 = p.getString(0x7f080479);
        obj = obj2;
        if (obj2 == null)
        {
            obj = CrossfadeSettingsCell.a(o, viewgroup);
        }
        ((AbstractSettingsCell) (obj)).setId(0x7f110103);
        viewgroup = s1;
        continue; /* Loop/switch isn't completed */
_L14:
        view = p.getString(0x7f0800c2);
        obj1 = p.getString(0x7f0800c1);
        obj = obj2;
        if (obj2 == null)
        {
            obj = NopSettingsCell.a(o, viewgroup);
        }
        ((AbstractSettingsCell) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

            private SettingsAdapter a;

            public final void onClick(View view1)
            {
                ArsenalActivity.a(SettingsAdapter.b(a), FeedbackMode.a);
            }

            
            {
                a = SettingsAdapter.this;
                super();
            }
        });
        viewgroup = ((ViewGroup) (obj1));
        obj1 = "";
        if (true) goto _L29; else goto _L28
_L28:
    }

    public final int getViewTypeCount()
    {
        return n;
    }

    public final boolean isEnabled(int i1)
    {
        return !s.a(b.get(i1));
    }


    private class Item extends Enum
    {

        private static final Item A[];
        public static final Item a;
        public static final Item b;
        public static final Item c;
        public static final Item d;
        public static final Item e;
        public static final Item f;
        public static final Item g;
        public static final Item h;
        public static final Item i;
        public static final Item j;
        public static final Item k;
        public static final Item l;
        public static final Item m;
        public static final Item n;
        public static final Item o;
        public static final Item p;
        public static final Item q;
        public static final Item r;
        public static final Item s;
        public static final Item t;
        public static final Item u;
        public static final Item v;
        public static final Item w;
        public static final Item x;
        public static final Item y;
        public static final Item z;
        public final DisableWhen mDisableWhen;
        public final HashSet mVisibleFor;
        public final ShowWhen mVisibleWhen;

        public static Item valueOf(String s1)
        {
            return (Item)Enum.valueOf(com/spotify/mobile/android/ui/adapter/SettingsAdapter$Item, s1);
        }

        public static Item[] values()
        {
            return (Item[])A.clone();
        }

        static 
        {
            a = new Item("OFFLINE_MODE", 0, ShowWhen.f, DisableWhen.b, new For[0]);
            b = new Item("CROSSFADE", 1, DisableWhen.b, new For[0]);
            c = new Item("GAPLESS", 2, DisableWhen.b, new For[0]);
            d = new Item("UNAVAILABLE_TRACKS", 3, DisableWhen.a, new For[0]);
            e = new Item("NORMALIZE", 4, DisableWhen.b, new For[0]);
            f = new Item("SEND_BROADCASTS", 5, DisableWhen.b, new For[0]);
            g = new Item("DEVICE_PICKER", 6, ShowWhen.c, new For[0]);
            h = new Item("PRIVATE_SESSION", 7, DisableWhen.b, new For[0]);
            i = new Item("FACEBOOK", 8, DisableWhen.b, new For[0]);
            j = new Item("LASTFM", 9, DisableWhen.b, new For[0]);
            k = new Item("ARSENAL", 10, new For[] {
                For.c
            });
            l = new Item("STREAM_QUALITY", 11, DisableWhen.b, new For[0]);
            m = new Item("DOWNLOAD_QUALITY", 12, ShowWhen.e, DisableWhen.b, new For[0]);
            n = new Item("DOWNLOAD_OVER_3G", 13, ShowWhen.f, DisableWhen.b, new For[0]);
            o = new Item("AUDIO_EFFECTS", 14, ShowWhen.d, DisableWhen.b, new For[0]);
            p = new Item("NOTIFICATIONS", 15, new For[0]);
            q = new Item("NIELSEN_OCR", 16, ShowWhen.g, new For[] {
                For.b
            });
            r = new Item("VERSION", 17, DisableWhen.d, new For[] {
                For.b
            });
            s = new Item("LICENSES", 18, new For[] {
                For.b
            });
            t = new Item("TERMS_CONDITIONS", 19, new For[] {
                For.b
            });
            u = new Item("PRIVACY_POLICY", 20, new For[] {
                For.b
            });
            v = new Item("BUG_REPORTING", 21, ShowWhen.b, new For[] {
                For.b
            });
            w = new Item("SUPPORT", 22, new For[] {
                For.b
            });
            x = new Item("DELETE_CACHE", 23, DisableWhen.c, new For[0]);
            y = new Item("LOGOUT", 24, new For[0]);
            z = new Item("DEBUG_TOOLS", 25, ShowWhen.b, new For[] {
                For.b
            });
            A = (new Item[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r, s, t, 
                u, v, w, x, y, z
            });
        }

        private transient Item(String s1, int i1, DisableWhen disablewhen, For afor[])
        {
            class ShowWhen extends Enum
            {

                public static final ShowWhen a;
                public static final ShowWhen b;
                public static final ShowWhen c;
                public static final ShowWhen d;
                public static final ShowWhen e;
                public static final ShowWhen f;
                public static final ShowWhen g;
                private static final ShowWhen h[];

                public static ShowWhen valueOf(String s2)
                {
                    return (ShowWhen)Enum.valueOf(com/spotify/mobile/android/ui/adapter/SettingsAdapter$Item$ShowWhen, s2);
                }

                public static ShowWhen[] values()
                {
                    return (ShowWhen[])h.clone();
                }

                static 
                {
                    a = new ShowWhen("EVER", 0);
                    b = new ShowWhen("DEBUG_MENU_ENABLED", 1);
                    c = new ShowWhen("CONNECT_ICON_ENABLED", 2);
                    d = new ShowWhen("AUDIO_EFFECTS_CONTROL_AVAILABLE", 3);
                    e = new ShowWhen("HIGH_BITRATE_OFFLINE_ENABLED", 4);
                    f = new ShowWhen("OFFLINE_ENABLED", 5);
                    g = new ShowWhen("NIELSEN_OCR_ENABLED", 6);
                    h = (new ShowWhen[] {
                        a, b, c, d, e, f, g
                    });
                }

                private ShowWhen(String s1, int i1)
                {
                    super(s1, i1);
                }
            }

            this(s1, i1, ShowWhen.a, disablewhen, afor);
        }

        private transient Item(String s1, int i1, ShowWhen showwhen, DisableWhen disablewhen, For afor[])
        {
            super(s1, i1);
            mVisibleFor = new HashSet();
            class For extends Enum
            {

                public static final For a;
                public static final For b;
                public static final For c;
                private static For d;
                private static final For e[];

                public static For valueOf(String s2)
                {
                    return (For)Enum.valueOf(com/spotify/mobile/android/ui/adapter/SettingsAdapter$Item$For, s2);
                }

                public static For[] values()
                {
                    return (For[])e.clone();
                }

                static 
                {
                    a = new For("REGISTERED_USER", 0);
                    d = new For("ANONYMOUS_USER", 1);
                    b = new For("ANY_USER", 2);
                    c = new For("ARSENAL_USER", 3);
                    e = (new For[] {
                        a, d, b, c
                    });
                }

                private For(String s1, int i1)
                {
                    super(s1, i1);
                }
            }

            if (afor == null || afor.length == 0)
            {
                mVisibleFor.add(For.a);
            } else
            {
                Collections.addAll(mVisibleFor, afor);
            }
            mVisibleWhen = showwhen;
            mDisableWhen = disablewhen;
        }

        private transient Item(String s1, int i1, ShowWhen showwhen, For afor[])
        {
            class DisableWhen extends Enum
            {

                public static final DisableWhen a;
                public static final DisableWhen b;
                public static final DisableWhen c;
                public static final DisableWhen d;
                private static final DisableWhen e[];

                public static DisableWhen valueOf(String s2)
                {
                    return (DisableWhen)Enum.valueOf(com/spotify/mobile/android/ui/adapter/SettingsAdapter$Item$DisableWhen, s2);
                }

                public static DisableWhen[] values()
                {
                    return (DisableWhen[])e.clone();
                }

                static 
                {
                    a = new DisableWhen("NEVER", 0);
                    b = new DisableWhen("PLAYING_REMOTELY", 1);
                    c = new DisableWhen("DELETING_CACHE", 2);
                    d = new DisableWhen("ALWAYS", 3);
                    e = (new DisableWhen[] {
                        a, b, c, d
                    });
                }

                private DisableWhen(String s1, int i1)
                {
                    super(s1, i1);
                }
            }

            this(s1, i1, showwhen, DisableWhen.a, afor);
        }

        private transient Item(String s1, int i1, For afor[])
        {
            this(s1, i1, ShowWhen.a, DisableWhen.a, afor);
        }
    }


    private class ViewType extends Enum
    {

        public static final ViewType a;
        public static final ViewType b;
        public static final ViewType c;
        public static final ViewType d;
        public static final ViewType e;
        public static final ViewType f;
        public static final ViewType g;
        public static final ViewType h;
        public static final ViewType i;
        public static final ViewType j;
        public static final ViewType k;
        private static final ViewType l[];

        public static ViewType valueOf(String s1)
        {
            return (ViewType)Enum.valueOf(com/spotify/mobile/android/ui/adapter/SettingsAdapter$ViewType, s1);
        }

        public static ViewType[] values()
        {
            return (ViewType[])l.clone();
        }

        static 
        {
            a = new ViewType("CHECK_BOX", 0);
            b = new ViewType("SPINNER", 1);
            c = new ViewType("FACEBOOK", 2);
            d = new ViewType("NOP", 3);
            e = new ViewType("LASTFM", 4);
            f = new ViewType("ARSENAL", 5);
            g = new ViewType("CROSSFADE", 6);
            h = new ViewType("AUDIO_EFFECTS", 7);
            i = new ViewType("BROADCAST", 8);
            j = new ViewType("NOTIFICATION", 9);
            k = new ViewType("DEBUG", 10);
            l = (new ViewType[] {
                a, b, c, d, e, f, g, h, i, j, 
                k
            });
        }

        private ViewType(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
