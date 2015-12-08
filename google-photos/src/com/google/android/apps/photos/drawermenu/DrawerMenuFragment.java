// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.drawermenu;

import aly;
import am;
import amb;
import ame;
import amh;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import android.widget.TextView;
import apa;
import ar;
import awl;
import ayt;
import b;
import c;
import com.google.android.apps.photos.accountswitcher.AccountSwitcherView;
import com.google.android.apps.photos.downsync.GooglePhotoDownsyncProvider;
import com.google.android.apps.photos.localmedia.ui.LocalFoldersActivity;
import com.google.android.apps.photos.search.SearchActivity;
import com.google.android.apps.photos.settings.SettingsActivity;
import com.google.android.apps.photos.sharedlinks.SharedLinksActivity;
import com.google.android.apps.photos.trash.ui.TrashPhotosActivity;
import dfs;
import dft;
import dfv;
import eem;
import efy;
import egf;
import enc;
import ene;
import faz;
import fba;
import ffg;
import ffi;
import ffk;
import ffl;
import ffm;
import ffn;
import ffo;
import ffp;
import ffq;
import ffr;
import ffs;
import fft;
import ffu;
import ffv;
import ffw;
import ffy;
import fgb;
import fgc;
import fnt;
import fpj;
import fpk;
import fpl;
import hfg;
import ifj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import mmr;
import mmv;
import mmx;
import msh;
import msi;
import mtj;
import myf;
import nfs;
import nft;
import nfw;
import ngc;
import ngg;
import nic;
import noz;
import nud;
import nug;
import olm;
import olq;
import omp;
import p;
import pwv;

public final class DrawerMenuFragment extends omp
    implements ffu, fpl, nug
{

    private Runnable a;
    private noz ag;
    private ListView ah;
    private ffy ai;
    private ListView aj;
    private ffg ak;
    private AccountSwitcherView al;
    private View am;
    private eem an;
    private final Handler ao = new Handler();
    private android.widget.AdapterView.OnItemClickListener ap;
    private android.widget.AdapterView.OnItemClickListener aq;
    private android.view.View.OnClickListener ar;
    private dfs as;
    private nfw b;
    private mmv c;
    private ngc d;
    private hfg e;
    private fba f;
    private ffr g;
    private fnt h;

    public DrawerMenuFragment()
    {
        (new msi(pwv.p)).a(ae);
        (new msh(af, (byte)0)).a = true;
        new fpk(af, this);
        (new egf(af, (byte)0)).a(ae);
        ffk ffk1 = new ffk(af);
        ae.a(fgb, ffk1);
        ap = new ffm(this);
        aq = new ffn(this);
        ar = new ffo(this);
        as = new ffp(this);
    }

    private Animation a(boolean flag, int i)
    {
        if (flag)
        {
            return AnimationUtils.loadAnimation(ad, i);
        } else
        {
            return null;
        }
    }

    public static fba a(DrawerMenuFragment drawermenufragment)
    {
        return drawermenufragment.f;
    }

    private static void a(Context context, Class class1, mmr mmr1)
    {
        class1 = new Intent(context, class1);
        class1.putExtra("account_id", mmr1.d());
        context.startActivity(class1);
    }

    private void a(View view, Animation animation)
    {
        a(view.getAnimation());
        view.clearAnimation();
        view.setVisibility(0);
        if (animation != null)
        {
            animation.reset();
            view.startAnimation(animation);
        }
    }

    private static void a(Animation animation)
    {
        if (animation != null)
        {
            animation.setAnimationListener(null);
        }
    }

    public static void a(DrawerMenuFragment drawermenufragment, dft dft1, boolean flag)
    {
        if (!((am) (drawermenufragment)).w)
        {
            flag = false;
        }
        switch (ffq.c[dft1.ordinal()])
        {
        default:
            drawermenufragment.a(((View) (drawermenufragment.ah)), drawermenufragment.a(flag, 0x10a0000));
            drawermenufragment.b(drawermenufragment.aj, drawermenufragment.a(flag, c.cF));
            return;

        case 1: // '\001'
            drawermenufragment.a(((View) (drawermenufragment.aj)), drawermenufragment.a(flag, c.cE));
            break;
        }
        drawermenufragment.b(drawermenufragment.ah, drawermenufragment.a(flag, 0x10a0001));
    }

    public static void a(DrawerMenuFragment drawermenufragment, ffi ffi1)
    {
        switch (ffq.a[ffi1.c - 1])
        {
        default:
            drawermenufragment = String.valueOf(ffi1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(drawermenufragment).length() + 36)).append("Unknown account util item selected: ").append(drawermenufragment).toString());

        case 1: // '\001'
            drawermenufragment = drawermenufragment.b;
            ffi1 = new ngg();
            ffi1.g = true;
            ((ngg) (ffi1)).u.add(nic);
            drawermenufragment.a(ffi1.a(dfv, null));
            return;

        case 2: // '\002'
            ffi1 = drawermenufragment.ad.getString(b.nY);
            drawermenufragment = drawermenufragment.b;
            ngg ngg1 = new ngg();
            ngg1.g = true;
            nft nft1 = new nft();
            nft1.a = ffi1;
            ffi1 = new Bundle();
            ffi1.putString("dialog_title", nft1.a);
            drawermenufragment.a(ngg1.a(nfs, ffi1));
            return;

        case 3: // '\003'
            ffi1 = GooglePhotoDownsyncProvider.a(drawermenufragment.ad);
            Intent intent = new Intent("android.settings.SYNC_SETTINGS");
            intent.putExtra("authorities", new String[] {
                ffi1
            });
            intent.setFlags(0x10000000);
            try
            {
                drawermenufragment.ad.startActivity(intent);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (DrawerMenuFragment drawermenufragment)
            {
                return;
            }

        case 4: // '\004'
            (new fft()).a(drawermenufragment.h(), "remove_dialog");
            return;
        }
    }

    public static void a(DrawerMenuFragment drawermenufragment, ffw ffw1, mmr mmr1)
    {
        switch (ffq.b[ffw1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            drawermenufragment.f.a(faz.a, null);
            return;

        case 2: // '\002'
            drawermenufragment.f.a(faz.b, null);
            return;

        case 3: // '\003'
            drawermenufragment.f.a(faz.c, null);
            return;

        case 4: // '\004'
            a(((Context) (drawermenufragment.ad)), com/google/android/apps/photos/search/SearchActivity, mmr1);
            drawermenufragment.O_().overridePendingTransition(c.cG, 0);
            return;

        case 5: // '\005'
        case 6: // '\006'
            a(((Context) (drawermenufragment.ad)), com/google/android/apps/photos/sharedlinks/SharedLinksActivity, mmr1);
            return;

        case 7: // '\007'
            a(((Context) (drawermenufragment.ad)), com/google/android/apps/photos/localmedia/ui/LocalFoldersActivity, mmr1);
            return;

        case 8: // '\b'
            a(((Context) (drawermenufragment.ad)), com/google/android/apps/photos/trash/ui/TrashPhotosActivity, mmr1);
            return;

        case 9: // '\t'
            a(((Context) (drawermenufragment.ad)), com/google/android/apps/photos/settings/SettingsActivity, mmr1);
            return;

        case 10: // '\n'
            drawermenufragment.ao.postDelayed(drawermenufragment.a, 300L);
            break;
        }
    }

    public static void a(DrawerMenuFragment drawermenufragment, mmx mmx1)
    {
        drawermenufragment.a(mmx1);
    }

    private void a(mmx mmx1)
    {
        if (mmx1 == null)
        {
            return;
        } else
        {
            mmx1 = mmx1.b("account_name");
            int i = c.a(mmx1);
            mmx1 = b;
            ngg ngg1 = new ngg();
            ngg1.j = true;
            ngg1.g = true;
            ngg1.c = i;
            mmx1.a(ngg1);
            al.a(dft.a);
            return;
        }
    }

    public static fnt b(DrawerMenuFragment drawermenufragment)
    {
        return drawermenufragment.h;
    }

    private void b(View view, Animation animation)
    {
        a(view.getAnimation());
        view.clearAnimation();
        if (animation == null)
        {
            view.setVisibility(8);
            return;
        } else
        {
            animation.setAnimationListener(new ffs(view));
            view.startAnimation(animation);
            return;
        }
    }

    public static nfw c(DrawerMenuFragment drawermenufragment)
    {
        return drawermenufragment.b;
    }

    public static ffr d(DrawerMenuFragment drawermenufragment)
    {
        return drawermenufragment.g;
    }

    public static ffg e(DrawerMenuFragment drawermenufragment)
    {
        return drawermenufragment.ak;
    }

    public static hfg f(DrawerMenuFragment drawermenufragment)
    {
        return drawermenufragment.e;
    }

    public static olq g(DrawerMenuFragment drawermenufragment)
    {
        return drawermenufragment.ad;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.nW, null);
        al = (AccountSwitcherView)layoutinflater.findViewById(p.y);
        viewgroup = al;
        if (!((AccountSwitcherView) (viewgroup)).i)
        {
            viewgroup.i = true;
            viewgroup.a();
        }
        al.h = as;
        am = layoutinflater.findViewById(p.D);
        am.setOnClickListener(ar);
        ai = new ffy(ad);
        ah = (ListView)layoutinflater.findViewById(p.C);
        ah.setOnItemClickListener(ap);
        ah.setAdapter(ai);
        aj = (ListView)layoutinflater.findViewById(p.x);
        aj.setOnItemClickListener(aq);
        ak = new ffg(ad);
        aj.setAdapter(ak);
        an.a.a(this, true);
        a = new ffl(this);
        if (bundle == null)
        {
            al.a(dft.a);
        }
        r();
        return layoutinflater;
    }

    public final void a(fpj fpj, Rect rect)
    {
        al.setPadding(0, rect.top, 0, 0);
        am.setPadding(0, rect.top, 0, 0);
        am.getLayoutParams().height = rect.top + g().getDimensionPixelSize(b.nT);
        ((View)p.a(super.R)).setPadding(0, 0, 0, rect.bottom);
    }

    public final void a(boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        Object obj;
        mmx mmx1;
        Iterator iterator;
        int i;
        obj = b;
        b.u();
        i = ((nfw) (obj)).b;
        mmx1 = b.g();
        obj = ak;
        iterator = ((ffg) (obj)).a.a(new String[] {
            "logged_in"
        }).iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        Integer integer = (Integer)iterator.next();
        if (integer.intValue() == i) goto _L6; else goto _L5
_L5:
        obj = ((ffg) (obj)).a.a(integer.intValue());
_L8:
        a(((mmx) (obj)));
        obj = ak;
        ((ffg) (obj)).b.remove(mmx1);
        ((ffg) (obj)).notifyDataSetChanged();
        d.a(super.B, i);
        mtj.a(ad, new efy(mmx1.b("account_name")));
_L2:
        return;
_L4:
        obj = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final void ak_()
    {
        super.ak_();
        ao.removeCallbacks(a);
        an.a.a(this);
    }

    public final void b_(Object obj)
    {
        ai.notifyDataSetChanged();
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        ae.a(ffu, this);
        b = (nfw)ae.a(nfw);
        c = (mmv)ae.a(mmv);
        d = (ngc)ae.a(ngc);
        e = (hfg)ae.a(hfg);
        f = (fba)ae.a(fba);
        g = (ffr)ae.a(ffr);
        h = (fnt)ae.a(fnt);
        ag = noz.a(ad, "DrawerMenu", new String[0]);
        an = (eem)ae.a(eem);
    }

    public final void g_(boolean flag)
    {
        super.g_(flag);
        if (!flag)
        {
            al.a(dft.a);
        }
    }

    public final void r()
    {
        Object obj;
        Object obj1;
        int i;
        if (b.f())
        {
            al.setVisibility(0);
            am.setVisibility(8);
        } else
        {
            al.setVisibility(8);
            am.setVisibility(0);
        }
        obj1 = al;
        if (!((AccountSwitcherView) (obj1)).a.e())
        {
            ((AccountSwitcherView) (obj1)).a(dft.a);
        } else
        {
            obj = ((AccountSwitcherView) (obj1)).a.g();
            String s = ((mmx) (obj)).b("profile_photo_url");
            ((AccountSwitcherView) (obj1)).c.a(s, ((AccountSwitcherView) (obj1)).e);
            ((AccountSwitcherView) (obj1)).f.setText(((mmx) (obj)).b("display_name"));
            s = ((mmx) (obj)).b("account_name");
            enc enc1;
            if (((mmx) (obj)).c("is_plus_page"))
            {
                obj = ((mmx) (obj)).b("gaia_id");
            } else
            {
                obj = null;
            }
            ((AccountSwitcherView) (obj1)).g.setText(s);
            enc1 = ((AccountSwitcherView) (obj1)).b;
            obj1 = ((AccountSwitcherView) (obj1)).d;
            obj = new ene(s, ((String) (obj)), enc1.c);
            obj = aly.a(enc1.a).a(obj);
            if (enc1.b == null)
            {
                enc1.b = aly.a(enc1.a).a(Uri.parse(enc1.d.getString(b.lV))).a(ayt.c(enc1.d));
            }
            obj.b = enc1.b;
            ((ame) (obj)).a(((ayt)ayt.c(enc1.d).a(amb.d)).a(apa.b)).a(awl.b()).a(((android.widget.ImageView) (obj1)));
        }
        obj1 = ai;
        obj = b;
        b.u();
        i = ((nfw) (obj)).b;
        obj = ((ffy) (obj1)).a;
        if (i == -1)
        {
            obj = fgc.a();
        } else
        {
            ArrayList arraylist = new ArrayList(fgc.a);
            if (((fgc) (obj)).b.a(ffv.a, i))
            {
                fgc.a(arraylist);
            }
            if (((fgc) (obj)).c.a(i))
            {
                fgc.b(arraylist);
            }
            obj = Collections.unmodifiableList(arraylist);
        }
        obj1.b = ((List) (obj));
        ((ffy) (obj1)).notifyDataSetChanged();
        ak.a();
    }
}
