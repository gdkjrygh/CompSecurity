// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.assistant.locationreporting;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.widget.Button;
import android.widget.TextView;
import b;
import duv;
import dxl;
import dxm;
import dxn;
import dxo;
import mmr;
import mnk;
import olm;
import omr;

public class InfoScreenActivity extends omr
{

    private final mmr f;
    private dxo g;
    private duv h;

    public InfoScreenActivity()
    {
        f = new mnk(this, e);
    }

    public static void a(InfoScreenActivity infoscreenactivity, boolean flag)
    {
        Intent intent = new Intent();
        intent.putExtra("LocationHistoryOptIn", flag);
        infoscreenactivity.setResult(-1, intent);
        infoscreenactivity.finish();
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        g = (dxo)d.a(dxo);
        h = (duv)d.a(duv);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.kA);
        ((TextView)findViewById(b.ky)).setMovementMethod(LinkMovementMethod.getInstance());
        bundle = new dxn(f.d(), h, g);
        ((Button)findViewById(b.kz)).setOnClickListener(new dxl(this, bundle));
        ((Button)findViewById(b.kx)).setOnClickListener(new dxm(this));
    }
}
