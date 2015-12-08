// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.stories;

import am;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import ar;
import ay;
import b;
import c;
import dfo;
import dhk;
import dui;
import ekq;
import fpj;
import get;
import hfo;
import hhi;
import hhj;
import hhk;
import hpc;
import hpe;
import inf;
import inl;
import inw;
import iod;
import ioe;
import iof;
import iog;
import ipu;
import itf;
import iwd;
import java.util.List;
import mmr;
import mnk;
import mov;
import moy;
import moz;
import msr;
import mti;
import mtj;
import mua;
import mue;
import nwn;
import nws;
import nww;
import oce;
import ojz;
import oka;
import olm;
import ome;
import pwr;
import rv;
import s;

public class StoryActivity extends ome
    implements hhk, iog, moy, msr, mti, nwn, ojz
{

    private final hhi d;
    private final inf e;
    private final nws h;
    private final mtj i;
    private final iof j;
    private inl k;
    private mmr l;

    public StoryActivity()
    {
        new nww(this, g);
        (new mov(this, g, c.fm)).a(f).c(this);
        new hfo(this, g);
        (new mnk(this, g)).a(f);
        (new oka(this, g)).a(this);
        (new iwd(this, s.ca)).a(f);
        (new fpj(g)).a(f);
        Object obj = new hhj(g);
        obj.a = this;
        obj.b = get.j;
        d = ((hhj) (obj)).a();
        e = new inf(this, s.br);
        h = (new nws(this, g, this)).a(f);
        i = (new mtj(this, g)).a(this).a(f);
        obj = new iof(this);
        f.a(iof, obj);
        j = ((iof) (obj));
    }

    private void a(String s1, ekq ekq1)
    {
        Object obj = getIntent();
        s1 = new inw(s1, ((Intent) (obj)).getStringExtra("owner_id"), ((Intent) (obj)).getBooleanExtra("from_url_gateway", false));
        s1.e = ((Intent) (obj)).getStringExtra("auth_key");
        s1.f = (dui)((Intent) (obj)).getParcelableExtra("card_id");
        if (ekq1 != null)
        {
            s1.d = ekq1;
        }
        ekq1 = new inl();
        obj = new Bundle();
        ((Bundle) (obj)).putParcelable("story_media_collection", ((inw) (s1)).d);
        ((Bundle) (obj)).putString("story_media_key", ((inw) (s1)).a);
        ((Bundle) (obj)).putString("auth_key", ((inw) (s1)).e);
        ((Bundle) (obj)).putParcelable("card_id", ((inw) (s1)).f);
        ((Bundle) (obj)).putBoolean("from_url_gateway", ((inw) (s1)).c);
        ((Bundle) (obj)).putString("owner_id", ((inw) (s1)).b);
        ekq1.f(((Bundle) (obj)));
        k = ekq1;
        s1 = e;
        s1.a(k, ((inf) (s1)).a, "HostedStoryFragment");
        h.c();
    }

    private void f()
    {
        Log.e("StoryActivity", "Error loading media collection!");
        setResult(0);
        finish();
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        f.a(msr, this);
        l = (mmr)f.a(mmr);
    }

    public final void a(String s1, mue mue1, mua mua)
    {
        if (!"LoadResolvedMediaCollectionFeatureTask".equals(s1)) goto _L2; else goto _L1
_L1:
        if (mue1 != null && !mue1.c()) goto _L4; else goto _L3
_L3:
        f();
_L6:
        return;
_L4:
        mua = (ekq)mue1.a().getParcelable("story_media_collection");
        a(((hpe)mua.a(hpe)).a.a, ((ekq) (mua)));
_L2:
        if ("LoadMediaCollectionTask".equals(s1))
        {
            if (mue1 == null || mue1.c())
            {
                f();
                return;
            }
            s1 = mue1.a();
            mue1 = (ekq)s1.getParcelable("story_media_collection");
            mua = s1.getString("mediaKey");
            if (s1.getBoolean("collectionNotFound"))
            {
                a(((String) (mua)), null);
                return;
            } else
            {
                a(((String) (mua)), ((ekq) (mue1)));
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(moz moz)
    {
    }

    public final void a(rv rv1)
    {
        rv1.a(true);
        rv1.b(null);
    }

    public final boolean a()
    {
        return k != null && k.s();
    }

    public final boolean a(MenuItem menuitem)
    {
        return false;
    }

    public final void ad_()
    {
        boolean flag;
        if (!j.c.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            return;
        } else
        {
            String s1 = getIntent().getStringExtra("story_media_key");
            j.c.remove(s1);
            i.a(new iod(l.d(), s1));
            return;
        }
    }

    public final void b()
    {
        d.a();
    }

    public void onBackPressed()
    {
        if (k == null) goto _L2; else goto _L1
_L1:
        inl inl1 = k;
        if (!inl1.b) goto _L4; else goto _L3
_L3:
        ipu ipu1 = (ipu)inl1.O_().c().a("StoryEditLocationFragment");
        if (ipu1 == null) goto _L6; else goto _L5
_L5:
        boolean flag;
        if (ipu1.a != null && ipu1.b != null)
        {
            ipu1.a.startAnimation(ipu1.b);
        }
        inl1.d.a(pwr.b);
        flag = true;
_L7:
        if (flag)
        {
            return;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (inl1.c)
        {
            itf itf1 = (itf)inl1.O_().c().a("whitebox");
            if (itf1 != null)
            {
                if (itf1.b)
                {
                    itf1.s();
                } else
                {
                    itf1.t();
                }
                inl1.d.a(pwr.b);
                dfo.a(Boolean.valueOf(true), ((am) (inl1)).R);
                flag = true;
                continue; /* Loop/switch isn't completed */
            }
        } else
        if (inl1.s())
        {
            inl1.d.a(pwr.b);
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
_L6:
        flag = false;
        if (true) goto _L7; else goto _L2
_L2:
        super.onBackPressed();
        return;
    }

    public void onContextMenuClosed(Menu menu)
    {
        super.onContextMenuClosed(menu);
        if (k != null)
        {
            menu = k;
            if (!((inl) (menu)).a)
            {
                menu.a(true);
            }
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.AJ);
        if (bundle != null)
        {
            k = (inl)c().a("HostedStoryFragment");
            return;
        }
        (new oce(5)).b(this);
        bundle = (ekq)getIntent().getParcelableExtra("story_media_collection");
        if (bundle == null)
        {
            bundle = getIntent().getStringExtra("story_media_key");
            if (bundle == null)
            {
                Log.e("StoryActivity", "Either a MediaCollection or MediaKey must be specified to open a story.");
                setResult(0);
                finish();
                return;
            } else
            {
                i.a(new iod(l.d(), bundle));
                return;
            }
        }
        if (ioe.a(bundle))
        {
            a(((hpe)bundle.a(hpe)).a.a, bundle);
            return;
        } else
        {
            i.a(new ioe(bundle));
            return;
        }
    }

    public final am u()
    {
        return c().a("HostedStoryFragment");
    }
}
