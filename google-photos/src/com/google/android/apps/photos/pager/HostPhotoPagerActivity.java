// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.pager;

import af;
import am;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import ay;
import b;
import bp;
import com.google.android.apps.photos.photofragment.components.photoview.PhotoView;
import dhb;
import dhg;
import ekk;
import ekm;
import ekp;
import ekq;
import ekw;
import fnl;
import fnn;
import fnt;
import fpj;
import gaj;
import ggi;
import gnd;
import gnw;
import gob;
import gpk;
import gqy;
import gyw;
import hfo;
import mnk;
import njh;
import nux;
import nwn;
import nws;
import oka;
import olm;
import ome;
import pwr;
import x;

public class HostPhotoPagerActivity extends ome
    implements gyw, nwn
{

    private static final ekk d;
    private final oka e;
    private gpk h;
    private gnw i;

    public HostPhotoPagerActivity()
    {
        (new dhb(this, g)).a(f);
        (new njh(this, g, af.s)).a("com.google.android.libraries.social.notifications.FROM_ANDROID_NOTIFICATION");
        (new fnt(this, g)).a(f);
        (new dhg(this, g, new fnn(fnl.c), af.n, pwr.k)).a(f);
        (new mnk(this, g)).a(f).a = false;
        (new nws(this, g, this)).a(f);
        (new gqy()).a(f);
        new ggi(this, g);
        new hfo(this, g);
        (new gaj(this, g, af.J, d)).a(f);
        (new fpj(g)).a(f);
        e = (new oka(this, g)).a(f);
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        f.b(gyw, this);
    }

    public final void a(PhotoView photoview, ekp ekp1)
    {
        photoview = (ekp)getIntent().getParcelableExtra("com.google.android.apps.photos.core.media");
        if ((photoview == null || photoview.equals(ekp1)) && h != null)
        {
            c().a().a(h).c();
            h = null;
        }
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        nux nux1 = (nux)olm.a(this, nux);
        if (!nux1.a())
        {
            return super.dispatchKeyEvent(keyevent);
        }
        int j = keyevent.getAction();
        switch (keyevent.getKeyCode())
        {
        default:
            return super.dispatchKeyEvent(keyevent);

        case 24: // '\030'
            if (j == 0)
            {
                nux1.c();
            }
            return true;

        case 25: // '\031'
            break;
        }
        if (j == 0)
        {
            nux1.d();
        }
        return true;
    }

    public final void f()
    {
    }

    public final void g()
    {
    }

    public void onBackPressed()
    {
        Intent intent = getIntent();
        if (intent.getBooleanExtra("exit_on_back", false))
        {
            x.a(this);
        }
        super.onBackPressed();
        if (intent.hasExtra("back_exit_animation_id"))
        {
            overridePendingTransition(intent.getIntExtra("back_enter_animation_id", 0), intent.getIntExtra("back_exit_animation_id", 0));
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.sO);
        ekp ekp1 = (ekp)getIntent().getParcelableExtra("com.google.android.apps.photos.core.media");
        if (bundle == null)
        {
            bundle = getIntent().getExtras();
            gob gob1 = gnw.v().a((ekq)bundle.getParcelable("com.google.android.apps.photos.core.media_collection")).a((ekp)bundle.getParcelable("com.google.android.apps.photos.core.media")).a((ekw)bundle.getParcelable("com.google.android.apps.photos.core.query_options"));
            String s = bundle.getString("auth_key");
            gob1.a.putString("auth_key", s);
            gob1 = gob1.a(bundle.getBoolean("auto_play_enabled")).c(bundle.getBoolean("com.google.android.apps.photos.pager.allow_delete_from_trash")).d(bundle.getBoolean("com.google.android.apps.photos.pager.allow_restore")).e(bundle.getBoolean("com.google.android.apps.photos.pager.allow_remove")).f(bundle.getBoolean("com.google.android.apps.photos.pager.allow_save")).g(bundle.getBoolean("com.google.android.apps.photos.pager.allow_use_as_album_cover")).k(bundle.getBoolean("com.google.android.apps.photos.pager.allow_slomo_edit", true));
            boolean flag = bundle.getBoolean("com.google.android.apps.photos.pager.prevent_background_fragment");
            gob1.a.putBoolean("com.google.android.apps.photos.pager.prevent_background_fragment", flag);
            i = gob1.h(bundle.getBoolean("com.google.android.apps.photos.pager.prevent_trash")).b(bundle.getBoolean("com.google.android.apps.photos.pager.allow_delete_device_copy")).j(bundle.getBoolean("com.google.android.apps.photos.pager.prevent_share")).l(bundle.getBoolean("com.google.android.apps.photos.pager.prevent_details")).m(bundle.getBoolean("com.google.android.apps.photos.pager.prevent_edit")).n(bundle.getBoolean("com.google.android.apps.photos.pager.prevent_print")).o(bundle.getBoolean("com.google.android.apps.photos.pager.prevent_set_as")).i(bundle.getBoolean("disable_slideshow")).p(bundle.getBoolean("com.google.android.libraries.social.photoscast.disable_chromecast")).q(bundle.getBoolean("com.google.android.apps.photos.pager.prevent_add_to_album")).a();
            bundle = new gpk();
            bundle.b = getIntent().getIntExtra("content_height", 0);
            bundle.a = ekp1;
            h = bundle;
            c().a().a(af.s, i, "pager_fragment").a(af.s, h).b();
        } else
        {
            bundle = c();
            i = (gnw)bundle.a("pager_fragment");
            h = (gpk)bundle.a("simple_image_fragment");
        }
        e.a(new gnd(this));
    }

    public final am u()
    {
        return i;
    }

    static 
    {
        d = (new ekm()).a(gnw.a).a();
    }
}
