// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.viewintents;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import ar;
import b;
import ejv;
import ekw;
import ele;
import euv;
import fjs;
import fjz;
import fkb;
import mmr;
import mms;
import mmt;
import mtj;
import nfw;
import ngg;
import noy;
import noz;
import omr;
import oql;

public class ViewIntentHandlerActivity extends omr
    implements mmt
{

    private final nfw f;
    private final fkb g;

    public ViewIntentHandlerActivity()
    {
        f = (new nfw(this, e)).a(d).b(this);
        g = new fkb(this, e);
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
    }

    public final void a(boolean flag, mms mms, mms mms1, int i, int j)
    {
        if (!flag)
        {
            return;
        }
        mms = getIntent();
        Uri uri = mms.getData();
        mms1 = g;
        String s = mms.getType();
        i = mms.getFlags();
        if (((fkb) (mms1)).e.a())
        {
            noy.a("uri", uri);
            noy.a("flags", Integer.valueOf(i));
        }
        mms1.f = uri;
        mms1.h = i;
        mms1.i = false;
        if (!TextUtils.isEmpty(s))
        {
            mms1.g = s;
        } else
        {
            mms1.g = oql.b(((fkb) (mms1)).b.getContentResolver(), uri);
        }
        if (((fkb) (mms1)).e.a())
        {
            mms = String.valueOf(((fkb) (mms1)).g);
            if (mms.length() != 0)
            {
                "Resolved content type: ".concat(mms);
            } else
            {
                new String("Resolved content type: ");
            }
        }
        if (b.c(uri))
        {
            mms1.b();
            return;
        }
        if ("rtsp".equalsIgnoreCase(uri.getScheme()))
        {
            mms = euv.c;
        } else
        {
            mms = ejv.d(((fkb) (mms1)).g);
        }
        mms = new fjz(uri, mms, System.currentTimeMillis());
        mms = new fjs(((fkb) (mms1)).d.d(), mms);
        ((fkb) (mms1)).c.b(new ele(mms, ekw.a, fkb.a, b.pC));
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = f;
        ngg ngg1 = new ngg();
        ngg1.j = true;
        ngg1.f = true;
        ngg1.g = true;
        bundle.a(ngg1);
    }
}
