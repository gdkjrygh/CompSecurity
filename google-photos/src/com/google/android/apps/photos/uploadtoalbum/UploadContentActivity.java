// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.uploadtoalbum;

import aly;
import ame;
import amh;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import awl;
import ayt;
import b;
import c;
import dsu;
import egf;
import hfx;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jcy;
import jcz;
import jda;
import jdb;
import jde;
import jdi;
import jdj;
import jdk;
import jdm;
import mms;
import mmt;
import mmv;
import mnc;
import msi;
import msj;
import msm;
import mti;
import mtj;
import mua;
import mue;
import nfw;
import ngg;
import olm;
import omr;
import oqm;
import pwt;

public final class UploadContentActivity extends omr
    implements android.view.View.OnClickListener, jda, jde, mmt, mnc, mti
{

    private final nfw f;
    private final hfx g;
    private mtj h;
    private mmv i;
    private jdk j;
    private List k;
    private ImageView l;
    private TextView m;
    private TextView n;
    private jcy o;
    private Spinner p;
    private Button q;
    private Button r;
    private long s;

    public UploadContentActivity()
    {
        f = (new nfw(this, e)).a(d).b(this);
        g = new hfx(this, e, this);
        (new msi(pwt.U)).a(d);
        new dsu(e, (byte)0);
        (new egf(e)).a(d);
    }

    public static void a(UploadContentActivity uploadcontentactivity)
    {
        int i1 = (int)uploadcontentactivity.p.getSelectedItemId();
        uploadcontentactivity.h.b("UploadContentToAlbumTask");
        jdm jdm1 = new jdm(i1, "instant", uploadcontentactivity.k);
        uploadcontentactivity.h.a(jdm1);
        uploadcontentactivity.g.a(uploadcontentactivity.getString(b.Cg)).a(true).b();
    }

    private void e()
    {
        Toast.makeText(this, b.Cf, 0).show();
    }

    public final void a()
    {
        finish();
    }

    public final void a(int i1, int j1, long l1, long l2)
    {
        double d = 1.0D / (double)j1;
        double d1 = (double)l1 / (double)l2;
        double d2 = i1;
        l1 = System.currentTimeMillis();
        if (l1 - s < 100L)
        {
            return;
        } else
        {
            s = l1;
            g.a(false).a(d * d1 + d2 * d);
            return;
        }
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        h = ((mtj)d.a(mtj)).a(this);
        i = (mmv)d.a(mmv);
        j = (jdk)d.a(jdk);
        d.a(jda, this);
    }

    public final void a(String s1, mue mue1, mua mua)
    {
        if ("UploadContentToAlbumTask".equals(s1))
        {
            if (mue1 == null || mue1.c())
            {
                Toast.makeText(this, b.Ci, 0).show();
            } else
            {
                Toast.makeText(this, b.Ch, 0).show();
            }
            g.c();
            finish();
        } else
        if ("com.google.android.apps.photos.uploadtoalbum.GetContentMetadataTask".equals(s1))
        {
            if (mue1 == null || mue1.c())
            {
                e();
                finish();
                return;
            } else
            {
                s1 = mue1.a();
                int i1 = s1.getInt("num_photos") + s1.getInt("num_videos");
                float f1 = (float)s1.getLong("total_bytes") / (float)(oqm.c.f * 1L);
                m.setText(getResources().getQuantityString(b.Cc, i1, new Object[] {
                    Integer.valueOf(i1)
                }));
                n.setText(getString(b.Cj, new Object[] {
                    Float.valueOf(f1)
                }));
                q.setEnabled(true);
                return;
            }
        }
    }

    public final void a(boolean flag, mms mms1, mms mms2, int i1, int j1)
    {
        while (!flag || mms2 != mms.c) 
        {
            return;
        }
        p.setSelection(o.a.indexOf(Integer.valueOf(j1)));
    }

    public final void onClick(View view)
    {
        h.b("UploadContentToAlbumTask");
        g.c();
        finish();
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Object obj = getIntent();
        bundle = new ArrayList();
        if (((Intent) (obj)).hasExtra("android.intent.extra.STREAM"))
        {
            if ("android.intent.action.SEND_MULTIPLE".equals(((Intent) (obj)).getAction()))
            {
                obj = ((Intent) (obj)).getParcelableArrayListExtra("android.intent.extra.STREAM").iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    Parcelable parcelable = (Parcelable)((Iterator) (obj)).next();
                    if (parcelable instanceof Uri)
                    {
                        bundle.add((Uri)parcelable);
                    }
                } while (true);
            } else
            {
                obj = ((Intent) (obj)).getExtras().getParcelable("android.intent.extra.STREAM");
                if (obj instanceof Uri)
                {
                    bundle.add((Uri)obj);
                }
            }
        }
        k = Collections.unmodifiableList(bundle);
        if (k.isEmpty())
        {
            e();
            finish();
            return;
        }
        setContentView(b.Cb);
        l = (ImageView)findViewById(c.fw);
        m = (TextView)findViewById(c.fv);
        n = (TextView)findViewById(c.fx);
        p = (Spinner)findViewById(c.ft);
        q = (Button)findViewById(c.fy);
        q.setEnabled(false);
        q.setOnClickListener(new msj(new jdi(this)));
        b.a(q, new msm(pwt.T));
        r = (Button)findViewById(c.fu);
        r.setOnClickListener(new msj(new jdj(this)));
        b.a(r, new msm(pwt.t));
        o = new jcy(this, i);
        o.a();
        if (o.getCount() <= 0)
        {
            (new jcz()).a(c(), "account_required");
        } else
        {
            p.setAdapter(o);
            bundle = new jdb(k);
            h.a(bundle);
            bundle = (Uri)k.get(0);
            aly.a(this).a(bundle).a(ayt.c(this)).a(awl.b()).a(l);
        }
        bundle = f;
        obj = new ngg();
        obj.d = false;
        obj.j = true;
        obj.f = true;
        obj.g = true;
        bundle.a(((ngg) (obj)));
    }

    protected final void onStart()
    {
        super.onStart();
        j.a.add(this);
        i.a(this);
    }

    protected final void onStop()
    {
        super.onStop();
        j.a.remove(this);
        i.b(this);
    }

    public final void r()
    {
        o.a();
    }
}
