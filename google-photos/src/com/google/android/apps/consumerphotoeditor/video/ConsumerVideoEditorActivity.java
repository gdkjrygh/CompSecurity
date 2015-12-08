// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.consumerphotoeditor.video;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import ay;
import b;
import bec;
import bgj;
import bgq;
import bgr;
import bgv;
import bp;
import c;
import imo;
import msp;
import mtj;
import mua;
import orr;
import oty;
import p;
import pwu;

public class ConsumerVideoEditorActivity extends bec
{

    private final bgq d;
    private bgv e;

    public ConsumerVideoEditorActivity()
    {
        d = new bgq(this, g);
    }

    public final void f()
    {
        if (getIntent() != null && getIntent().getData() != null)
        {
            Object obj = getIntent().getData();
            Object obj2 = e;
            if (!c.c(((bgv) (obj2)).b, obj))
            {
                if (((bgv) (obj2)).c != null)
                {
                    ((bgv) (obj2)).c.b(((orv) (obj2)));
                }
                if (((bgv) (obj2)).d != null)
                {
                    ((bgv) (obj2)).d.c();
                    obj2.e = null;
                }
                obj2.b = ((Uri) (obj));
                ((bgv) (obj2)).a.b.a(((am) (obj2)));
                mtj mtj1 = ((bgv) (obj2)).a;
                obj2 = new bgj(((bgv) (obj2)).ad, ((bgv) (obj2)).b);
                mtj1.b.a(((mtf) (obj2)), true);
                mtj1.a(((mtf) (obj2)));
            }
            Object obj1 = d;
            boolean flag;
            if (!b.c(((Uri) (obj))))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.a(flag, "No video URI provided.");
            if (!((Uri) (obj)).equals(((bgq) (obj1)).b))
            {
                obj1.b = ((Uri) (obj));
                obj1 = ((bgq) (obj1)).a;
                obj = (new imo()).a(((Uri) (obj)));
                obj.a = true;
                obj.b = true;
                ((mtj) (obj1)).a(((imo) (obj)).a());
            }
        }
    }

    public final boolean g()
    {
        return e.c != null && !e.c.b();
    }

    public final int h()
    {
        return 2;
    }

    protected final msp i()
    {
        return pwu.L;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(com.google.android.apps.consumerphotoeditor.R.layout.cpe_video_editor_activity);
        bundle = c();
        am am = bundle.a("ThumbnailProducerFragment");
        if (am != null)
        {
            if (!(am instanceof bgr))
            {
                bundle = String.valueOf(am.getClass().toString());
                if (bundle.length() != 0)
                {
                    bundle = "Unexpected ThumbnailProducerFragment bound! ".concat(bundle);
                } else
                {
                    bundle = new String("Unexpected ThumbnailProducerFragment bound! ");
                }
                throw new IllegalStateException(bundle);
            }
        } else
        {
            bgr bgr1 = new bgr();
            bundle.a().a(bgr1, "ThumbnailProducerFragment").b();
        }
        bundle = c();
        e = (bgv)bundle.a("VideoEditorFragment");
        if (e == null)
        {
            e = new bgv();
            bundle.a().a(com.google.android.apps.consumerphotoeditor.R.id.cpe_content_container, e, "VideoEditorFragment").b();
        }
    }
}
