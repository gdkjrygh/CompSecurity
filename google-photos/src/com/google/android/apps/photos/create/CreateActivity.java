// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.create;

import android.content.Intent;
import android.os.Bundle;
import ay;
import b;
import bp;
import com.google.android.libraries.social.ui.views.expandingscrollview.ExpandingScrollView;
import eod;
import epd;
import fjg;
import fpj;
import hyv;
import mnk;
import olm;
import ome;
import s;

public class CreateActivity extends ome
{

    private hyv d;
    private final fjg e;

    public CreateActivity()
    {
        e = (new fjg(this, 20F, 80F)).a(f);
        mnk mnk1 = new mnk(this, g);
        mnk1.a = false;
        mnk1.a(f);
        (new fpj(g)).a(f);
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        d = (hyv)f.a(hyv);
        bundle = (epd)getIntent().getParcelableExtra("destination_album");
        if (bundle != null)
        {
            f.a(epd, bundle);
        }
    }

    public void finish()
    {
        super.finish();
        overridePendingTransition(0, b.mj);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.mm);
        bundle = c();
        if (bundle.a("fragment_create") == null)
        {
            Object obj = d.a(s.h);
            obj = eod.a(getIntent().getBooleanExtra("show_existing", false), getIntent().getBooleanExtra("show_only_albums", false), ((java.util.Collection) (obj)));
            bundle.a().a(s.d, ((am) (obj)), "fragment_create").b();
        }
        e.a((ExpandingScrollView)findViewById(s.c));
    }
}
