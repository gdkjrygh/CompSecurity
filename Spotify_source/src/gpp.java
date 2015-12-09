// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.TextUtils;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.DialogPresenter;
import com.spotify.music.spotlets.tos.TacKeystore;
import com.spotify.music.spotlets.tos.TermsOfServiceChangedActivity;
import java.util.concurrent.TimeUnit;

public class gpp extends fze
{

    private static gip a = gip.b("tos_changed_expiration_time_s");
    private dxc Z;
    private Flags aa;
    private int ab;
    private boolean ac;
    private boolean ad;
    private String ae[];
    private String af;
    private com.spotify.music.spotlets.tos.TacKeystore.Model ag;
    private Long ah;
    private TacKeystore ai;
    private String aj;
    private Intent ak;
    private final dwx al = new dwx() {

        private gpp a;

        public final void a(Flags flags)
        {
            gpp.a(a, flags);
        }

            
            {
                a = gpp.this;
                super();
            }
    };
    private an am;
    private an an;
    private final gpn ao = new gpn() {

        private gpp a;

        public final void a()
        {
            if (gpp.b(a) == null)
            {
                gpp.a(a, new com.spotify.music.spotlets.tos.TacKeystore.Model(""));
            }
            gpp.a(a);
        }

        public final void a(com.spotify.music.spotlets.tos.TacKeystore.Model model)
        {
            gpp.a(a, model);
            gpp.a(a);
        }

            
            {
                a = gpp.this;
                super();
            }
    };
    private gin b;

    public gpp()
    {
        dmz.a(ggb);
        ggb.a();
        am = new an() {

            private final String a[] = {
                "unaccepted_licenses"
            };
            private gpp b;

            public final da a(Bundle bundle)
            {
                return new cu(b.k(), dtx.a, a, null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                ctz.a(obj);
                if (((Cursor) (obj)).moveToFirst())
                {
                    obj = foq.a(((Cursor) (obj)));
                    gpp.a(b, ((String []) (obj)));
                }
            }

            
            {
                b = gpp.this;
                super();
            }
        };
        an = new an() {

            private final String a[] = {
                "current_user", "country_code"
            };
            private gpp b;

            public final da a(Bundle bundle)
            {
                return new cu(b.k(), dtw.a, a, null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                Object obj1 = (Cursor)obj;
                ctz.a(obj1);
                if (((Cursor) (obj1)).moveToFirst())
                {
                    obj = ((Cursor) (obj1)).getString(0);
                    obj1 = ((Cursor) (obj1)).getString(1);
                    gpp.a(b, ((String) (obj)), ((String) (obj1)));
                }
            }

            
            {
                b = gpp.this;
                super();
            }
        };
    }

    private void G()
    {
        boolean flag = true;
        break MISSING_BLOCK_LABEL_2;
        if (!ac && H() != null)
        {
            ac = true;
            boolean flag1;
            if (Y != null)
            {
                flag1 = false;
            }
            if (Y != null)
            {
                Y.a(this);
                return;
            }
        }
        return;
    }

    private Intent H()
    {
        if (ak != null)
        {
            return ak;
        }
        String as[] = ae;
        if (as == null || as.length == 0)
        {
            return null;
        }
        if (TextUtils.isEmpty(af))
        {
            return null;
        }
        if (TextUtils.isEmpty(aj))
        {
            return null;
        }
        Object obj = (Integer)aa.a(fys.aj);
        Object obj1 = obj;
        if (obj == null)
        {
            Assertion.b("Grace days is null");
            obj1 = Integer.valueOf(0);
        }
        boolean flag;
        if (((Integer) (obj1)).intValue() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && ag == null && ah == null)
        {
            obj = a(af);
            if (!((TacKeystore) (obj)).f && !((TacKeystore) (obj)).f)
            {
                obj.f = true;
                obj1 = new Request("GET", ((TacKeystore) (obj)).d);
                ((TacKeystore) (obj)).b.resolve(((Request) (obj1)), new com.spotify.music.spotlets.tos.TacKeystore._cls1(((TacKeystore) (obj)), ((TacKeystore) (obj)).a, com/spotify/music/spotlets/tos/TacKeystore$Model));
            }
            return null;
        }
        int i = ((Integer) (obj1)).intValue();
        String s = af;
        obj = ag;
        if (obj != null)
        {
            obj = ((com.spotify.music.spotlets.tos.TacKeystore.Model) (obj)).getExpirationTimeAsLong();
        } else
        {
            obj = null;
        }
        if (ah == null && i > 0)
        {
            long l = gcf.a() / 1000L;
            Long long2 = Long.valueOf(TimeUnit.DAYS.toSeconds(i) + l);
            Long long1 = long2;
            if (obj != null)
            {
                long1 = long2;
                if (((Long) (obj)).longValue() < long2.longValue())
                {
                    long1 = ((Long) (obj));
                }
            }
            b.b().a(a, long1.longValue()).b();
            if (!long1.equals(obj))
            {
                a(s).a(new com.spotify.music.spotlets.tos.TacKeystore.Model(Long.toString(long1.longValue())));
            }
            ah = long1;
        }
        if (((Integer) (obj1)).intValue() <= 0)
        {
            i = -1;
        } else
        if (ah == null)
        {
            Assertion.b("Expiration time not set");
            i = -1;
        } else
        {
            long l1 = gcf.a() / 1000L;
            l1 = ah.longValue() - l1;
            if (l1 < 0L)
            {
                l1 = -l1;
                i = -1;
            } else
            {
                i = Math.round((float)l1 / 86400F);
            }
        }
        if (flag && i >= 0 && ad)
        {
            return null;
        } else
        {
            ak = TermsOfServiceChangedActivity.a(k(), as, flag, i, aj);
            return ak;
        }
    }

    static Flags a(gpp gpp1, Flags flags)
    {
        gpp1.aa = flags;
        return flags;
    }

    static com.spotify.music.spotlets.tos.TacKeystore.Model a(gpp gpp1, com.spotify.music.spotlets.tos.TacKeystore.Model model)
    {
        gpp1.ag = model;
        return model;
    }

    private TacKeystore a(String s)
    {
        if (ai == null)
        {
            gpo gpo1 = (gpo)dmz.a(gpp, gpo);
            ai = new TacKeystore(k(), s, gpo1.a.a());
            ai.e = ao;
        }
        return ai;
    }

    public static gpp a(Flags flags)
    {
        gpp gpp1 = new gpp();
        fyw.a(gpp1, flags);
        return gpp1;
    }

    static void a(gpp gpp1)
    {
        gpp1.G();
    }

    static void a(gpp gpp1, String s, String s1)
    {
        gpp1.af = s;
        gpp1.aj = s1;
        if ((TextUtils.isEmpty(s) || gpp1.ai != null && !s.equals(gpp1.ai.c)) && gpp1.ai != null)
        {
            gpp1.ai.e = null;
            gpp1.ai.b.destroy();
            gpp1.ai = null;
        }
        gpp1.G();
    }

    static void a(gpp gpp1, String as[])
    {
        gpp1.ae = as;
        gpp1.G();
    }

    static com.spotify.music.spotlets.tos.TacKeystore.Model b(gpp gpp1)
    {
        return gpp1.ag;
    }

    public static void b(Context context)
    {
        ((giq)dmz.a(giq)).b(context).b().a(a).a();
    }

    public final void A()
    {
        super.A();
        af = null;
        aj = null;
        u().a(0x7f1100ab);
        u().a(0x7f1100aa);
        Z.b(al);
        Z.b();
    }

    public final void B()
    {
        super.B();
        if (ai != null)
        {
            ai.e = null;
            ai.b.destroy();
            ai = null;
        }
    }

    protected final void F()
    {
        ab = Y.b(this);
    }

    public final void a()
    {
        Assertion.b(Integer.valueOf(ab), Integer.valueOf(0));
        if (ac)
        {
            Intent intent = H();
            ak = null;
            Assertion.a(intent);
            ad = true;
            a(intent, ab);
            return;
        } else
        {
            Assertion.a("Unexpected onShow(). Did not expect to show a dialog when nothing queued");
            return;
        }
    }

    public final void a(int i, int j, Intent intent)
    {
        Assertion.b(Integer.valueOf(ab), Integer.valueOf(0));
        if (i == ab)
        {
            ac = false;
        }
        if (j != -1) goto _L2; else goto _L1
_L1:
        if (ah != null)
        {
            ah = null;
            b.b().a(a).b();
            if (!TextUtils.isEmpty(af))
            {
                com.spotify.music.spotlets.tos.TacKeystore.Model model = new com.spotify.music.spotlets.tos.TacKeystore.Model("");
                ag = model;
                a(af).a(model);
            }
        }
_L4:
        super.a(i, j, intent);
        return;
_L2:
        if (j == 1)
        {
            k().finish();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        b = ((giq)dmz.a(giq)).b(k());
        dmz.a(dxd);
        Z = dxd.a(k());
        if (bundle == null)
        {
            aa = fyw.a(this);
            if (b.f(a))
            {
                ah = Long.valueOf(b.b(a));
            }
        } else
        {
            aa = fyw.a(bundle);
            ab = bundle.getInt("license_request_code");
            ac = bundle.getBoolean("license_dialog_queued");
            ad = bundle.getBoolean("license_dialog_shown");
            ae = bundle.getStringArray("licenses");
            af = bundle.getString("username");
            ag = (com.spotify.music.spotlets.tos.TacKeystore.Model)bundle.getParcelable("tac_model");
            if (bundle.containsKey("expiration_time_s"))
            {
                ah = Long.valueOf(bundle.getLong("expiration_time_s"));
                return;
            }
        }
    }

    public final void a(DialogPresenter dialogpresenter)
    {
        super.a(dialogpresenter);
        if (ac)
        {
            Y.a(this);
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putInt("license_request_code", ab);
        bundle.putBoolean("license_dialog_queued", ac);
        bundle.putBoolean("license_dialog_shown", ad);
        bundle.putStringArray("licenses", ae);
        bundle.putString("username", af);
        bundle.putParcelable("tac_model", ag);
        if (ah != null)
        {
            bundle.putLong("expiration_time_s", ah.longValue());
        }
        bundle.putParcelable("FlagsArgumentHelper.Flags", aa);
    }

    public final void z()
    {
        super.z();
        u().b(0x7f1100ab, null, am);
        u().b(0x7f1100aa, null, an);
        Z.a();
        Z.a(al);
    }

    static 
    {
        dmz.a(gpp, gpo, new gpo((gni)dmz.a(gni)));
    }
}
