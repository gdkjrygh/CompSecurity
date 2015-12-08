// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.share.copylink;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import ifm;
import ifn;
import ifo;
import mmr;
import mnk;
import myf;
import olm;
import omr;

public final class CopyLinkActivity extends omr
    implements ifn
{

    private final mmr f;
    private myf g;

    public CopyLinkActivity()
    {
        mnk mnk1 = new mnk(this, e);
        mnk1.a = true;
        f = mnk1.a(d);
    }

    private String g()
    {
        return getIntent().getStringExtra("android.intent.extra.TEXT");
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        g = (myf)d.a(myf);
        d.a(ifn, this);
    }

    public final void e()
    {
        String s = g();
        ((ClipboardManager)getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("", s));
        setResult(-1);
        finish();
    }

    public final void f()
    {
        finish();
    }

    protected final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (TextUtils.isEmpty(g()))
        {
            finish();
        }
    }

    protected final void onStart()
    {
        super.onStart();
        if (g.a(ifo.a, f.d()))
        {
            ifm.a(g()).a(c(), "copy_link_dialog");
            return;
        } else
        {
            e();
            return;
        }
    }
}
