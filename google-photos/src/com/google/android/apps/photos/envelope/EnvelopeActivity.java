// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.envelope;

import am;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import ay;
import b;
import ba;
import bp;
import com.google.android.apps.photos.envelope.settings.EnvelopeSettingsFragment;
import dhb;
import diy;
import ejz;
import ekk;
import ekm;
import ekp;
import ekq;
import elc;
import fgq;
import fgs;
import fgu;
import fgv;
import fgx;
import fhb;
import fhc;
import fia;
import fiu;
import fiz;
import fnt;
import fpg;
import fpj;
import gaj;
import ggi;
import gnw;
import gog;
import gqy;
import hfo;
import hft;
import hhq;
import hjl;
import hjv;
import hkl;
import hli;
import hlj;
import hls;
import hmg;
import hmn;
import hmz;
import hou;
import hov;
import hpc;
import hpe;
import hyu;
import hzo;
import hzr;
import hzv;
import iae;
import ifj;
import ikq;
import iwd;
import mmr;
import mmx;
import mnk;
import mtj;
import nfw;
import noz;
import nud;
import nwn;
import nws;
import oka;
import olm;
import ome;
import p;

public final class EnvelopeActivity extends ome
    implements ba, ejz, fgs, fhb, fia, fiu, nwn
{

    private static final ekk d;
    private final fgx e;
    private final fgq h;
    private final gog i;
    private final nws j;
    private final fpj k;
    private final fgu l;
    private mmr m;
    private fiz n;
    private ifj o;
    private noz p;
    private View q;
    private View r;
    private ekq s;

    public EnvelopeActivity()
    {
        e = new fgx(this, g, b.oI, this);
        h = new fgq(g, b.oG, this);
        i = (new gog(this, g, b.oC, b.oF)).a(f);
        j = (new nws(this, g, this)).a(f);
        k = (new fpj(g)).a(f);
        Object obj = new fgu(g);
        f.a(hzv, obj);
        l = ((fgu) (obj));
        (new iwd(this, b.oK)).a(f);
        (new gqy()).a(f);
        (new dhb(this, g)).a(f);
        (new gaj(this, g, b.oH, d)).a(f);
        (new fnt(this, g)).a(f);
        new fpg(this, g, b.oC);
        new hfo(this, g);
        obj = new hft(this, g);
        f.a(hft, obj);
        obj = new hov(this, g);
        olm olm1 = f;
        olm1.a(hov, obj);
        olm1.a(hou, obj);
        new iae(this, g);
        (new hzr(this, g)).a(f);
        (new oka(this, g)).a(f);
        (new hkl(g)).a(f);
        new hmg(g);
        (new hzo(this, g)).a(f);
        (new hli(g)).a(f);
        (new hlj(g)).a(f);
        new hyu(g);
        new ggi(this, g);
        (new hls(g)).a(f);
    }

    private boolean a(ekq ekq1)
    {
        ekq1 = ((hjv)ekq1.a(hjv)).a.c;
        return m.g().b("gaia_id").equals(ekq1);
    }

    public final void Y_()
    {
        s = h.f;
        r.setVisibility(8);
        if (s == null)
        {
            finish();
            return;
        } else
        {
            hmn hmn1 = hmn.a(s, hmz.a());
            c().a().b(b.oC, hmn1, "EnvelopeFragment").b();
            c().b();
            j.c();
            return;
        }
    }

    public final void Z_()
    {
        s = null;
        r.setVisibility(8);
        q.setVisibility(0);
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        o = (ifj)f.a(ifj);
        n = (fiz)f.a(fiz);
        p = noz.a(this, 3, "EnvelopeActivity", new String[0]);
        if (getIntent().getExtras() == null || getIntent().getExtras().getInt("account_id", -1) == -1)
        {
            m = (new nfw(this, g)).a(f);
        } else
        {
            m = (new mnk(this, g)).a(f);
        }
        bundle = f;
        bundle.a(hhq, new hhq());
        bundle.a(ejz, this);
        bundle.a(fia, this);
        bundle.a(fiu, this);
    }

    public final void a(ikq ikq1)
    {
        if (c().a("EnvelopeSettingsFrag") != null)
        {
            c().a().a(c().a("EnvelopeSettingsFrag")).b();
            c().c();
        }
        if (c().a("EnvelopeFragment") != null)
        {
            c().a().a(c().a("EnvelopeFragment")).b();
        }
        c().b();
        fgq fgq1 = h;
        ikq1 = ikq1.a;
        if (TextUtils.isEmpty(ikq1))
        {
            fgq1.f = null;
            fgq1.c.Y_();
        } else
        if (fgq1.f != null && fgq1.f.a(hpe) != null && ((hpe)fgq1.f.a(hpe)).a.a.equals(ikq1))
        {
            fgq1.c.Y_();
        } else
        {
            ikq1 = b.a(fgq1.e.d(), ikq1);
            if (fgq1.d.a(elc.a(fgq1.b)))
            {
                fgq1.d.b(elc.a(fgq1.b));
            }
            fgq1.d.a(new elc(ikq1, fgq.a, fgq1.b));
        }
        r.setVisibility(0);
    }

    public final void aa_()
    {
        j.c();
    }

    public final ekq b()
    {
        return s;
    }

    public final void f()
    {
        s = e.e;
        r.setVisibility(8);
        Object obj = e.e;
        p.b(obj, "Media collection must be loaded before setupMenus call.");
        l.a = a(((ekq) (obj)));
        fgu fgu1 = l;
        boolean flag;
        if (((hjl)((ekq) (obj)).a(hjl)).a && o.a(m.d()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fgu1.b = flag;
        obj = e.e;
        obj = hmn.a(((ekq) (obj)), hmz.a(a(((ekq) (obj)))));
        c().a().b(b.oC, ((am) (obj)), "EnvelopeFragment").b();
        c().b();
        j.c();
        k.d.b();
        if (!getIntent().getBooleanExtra("open_sharing_options", false)) goto _L2; else goto _L1
_L1:
        h();
_L4:
        obj = n;
        return;
_L2:
        if (getIntent().getParcelableExtra("open_pager_to_media") != null)
        {
            ekp ekp1 = (ekp)getIntent().getParcelableExtra("open_pager_to_media");
            hmz hmz1 = hmz.a(a(s));
            i.a(ekp1, null, hmn.b(s, hmz1));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void g()
    {
        s = null;
        r.setVisibility(8);
        q.setVisibility(0);
    }

    public final void h()
    {
        EnvelopeSettingsFragment envelopesettingsfragment = new EnvelopeSettingsFragment();
        c().a().b(b.oD, envelopesettingsfragment, "EnvelopeSettingsFrag").a(null).b();
        c().b();
        j.c();
    }

    public final void onCreate(Bundle bundle)
    {
        Object obj;
        Object obj1;
        super.onCreate(bundle);
        setContentView(b.oL);
        q = findViewById(b.oJ);
        r = findViewById(b.oE);
        c().a(this);
        if (bundle != null)
        {
            s = (ekq)bundle.getParcelable("com.google.android.apps.photos.core.media_collection");
        }
        bundle = e;
        boolean flag;
        if (((fgx) (bundle)).e != null || ((fgx) (bundle)).b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        obj1 = getIntent();
        bundle = ((Intent) (obj1)).getData();
        obj = ((Intent) (obj1)).getStringExtra("envelope_media_key");
        obj1 = ((Intent) (obj1)).getStringExtra("envelope_auth_key");
        if (b.c(bundle)) goto _L4; else goto _L3
_L3:
        obj = e;
        boolean flag1;
        if (!b.c(bundle))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        p.a(flag1, "envelopeUri must be non-empty");
        obj.c = true;
        if (((fgx) (obj)).d == null) goto _L6; else goto _L5
_L5:
        ((fgx) (obj)).a();
_L8:
        r.setVisibility(0);
_L2:
        return;
_L6:
        if (!((fgx) (obj)).a.a("com.google.android.apps.photos.envelope.GetEnvelopeInfoFromUriTask"))
        {
            ((fgx) (obj)).a.a(new fhc(bundle));
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (!TextUtils.isEmpty(((CharSequence) (obj))) && !TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            bundle = e;
            p.b(obj, "envelopeMediaKey must be non-null");
            bundle.c = true;
            bundle.d = new fgv(((String) (obj)), ((String) (obj1)), false, null);
            bundle.a();
        } else
        {
            finish();
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("com.google.android.apps.photos.core.media_collection", s);
    }

    public final am u()
    {
        am am1 = c().a("EnvelopeSettingsFrag");
        if (am1 != null && am1.i())
        {
            return am1;
        } else
        {
            return i.u();
        }
    }

    static 
    {
        d = (new ekm()).a(gnw.a).a(hmn.a).a();
    }
}
