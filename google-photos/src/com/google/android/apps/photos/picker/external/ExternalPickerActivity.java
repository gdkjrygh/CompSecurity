// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.picker.external;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import aw;
import ay;
import b;
import bp;
import dfu;
import ejv;
import ekw;
import eky;
import euv;
import hek;
import hex;
import hfb;
import java.util.Arrays;
import java.util.Set;
import mms;
import mmt;
import mov;
import msi;
import nfw;
import ngg;
import oka;
import olm;
import ome;
import pwx;
import rv;
import ss;
import su;

public class ExternalPickerActivity extends ome
    implements mmt
{

    private final hfb d;
    private final hex e;
    private final nfw h;
    private final dfu i;

    public ExternalPickerActivity()
    {
        d = new hfb(g);
        hex hex1 = new hex();
        f.a(hex, hex1);
        e = hex1;
        h = (new nfw(this, g)).a(f).b(this);
        i = new dfu(this, g);
        (new mov(this, g, b.vs)).a(f);
        new oka(this, g);
        (new msi(pwx.d)).a(f);
    }

    protected final void a(Bundle bundle)
    {
        boolean flag = false;
        super.a(bundle);
        hex hex1 = e;
        Intent intent = getIntent();
        bundle = intent.getAction();
        String s = intent.getType();
        hex1.b = false;
        Object obj = null;
        Object obj1 = null;
        if ("android.intent.action.GET_CONTENT".equalsIgnoreCase(bundle) || "android.intent.action.PICK".equalsIgnoreCase(bundle))
        {
            hex1.b = intent.getBooleanExtra("android.intent.extra.ALLOW_MULTIPLE", false);
            boolean flag1 = intent.getBooleanExtra("android.intent.extra.LOCAL_ONLY", false);
            obj = intent.getData();
            bundle = obj1;
            if (obj != null)
            {
                bundle = obj1;
                if (b.h(((android.net.Uri) (obj))))
                {
                    if (b.g(((android.net.Uri) (obj))))
                    {
                        bundle = euv.c;
                    } else
                    {
                        bundle = euv.b;
                    }
                }
            }
            obj = bundle;
            flag = flag1;
            if (bundle == null)
            {
                obj = bundle;
                flag = flag1;
                if (!TextUtils.isEmpty(s))
                {
                    obj = ejv.d(intent.getType());
                    flag = flag1;
                }
            }
        }
        bundle = new eky();
        if (obj != null && !euv.a.equals(obj))
        {
            bundle.a(((euv) (obj)));
        }
        if (flag)
        {
            bundle.h = true;
        }
        hex1.a = bundle.a();
    }

    public final void a(boolean flag, mms mms1, mms mms2, int j, int k)
    {
        if (!flag)
        {
            return;
        }
        if (mms2 == mms.c)
        {
            i.a();
        }
        c().a().b(aw.b, new hek()).b();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.vn);
        a((Toolbar)findViewById(aw.l));
        Object obj = e().a();
        bundle = d;
        Object obj1 = e;
        byte byte0;
        if (((hex) (obj1)).b)
        {
            byte0 = 10;
        } else
        {
            byte0 = 1;
        }
        obj1 = ((hex) (obj1)).a.f;
        if (((Set) (obj1)).containsAll(Arrays.asList(new euv[] {
    euv.c, euv.b
})))
        {
            bundle = ((hfb) (bundle)).a.getQuantityString(b.vx, byte0);
        } else
        if (((Set) (obj1)).contains(euv.c))
        {
            bundle = ((hfb) (bundle)).a.getQuantityString(b.vy, byte0);
        } else
        {
            bundle = ((hfb) (bundle)).a.getQuantityString(b.vw, byte0);
        }
        ((rv) (obj)).a(bundle);
        bundle = h;
        obj = new ngg();
        obj.j = true;
        obj.f = true;
        obj.g = true;
        bundle.a(((ngg) (obj)));
    }
}
