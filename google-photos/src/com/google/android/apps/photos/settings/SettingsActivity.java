// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.settings;

import android.os.Bundle;
import b;
import dsu;
import fnt;
import ica;
import mnk;
import msi;
import oka;
import ome;
import pwt;

public class SettingsActivity extends ome
{

    public SettingsActivity()
    {
        (new fnt(this, g)).a(f);
        new oka(this, g);
        mnk mnk1 = new mnk(this, g);
        mnk1.a = false;
        mnk1.a(f);
        new ica(this, this, g);
        (new msi(pwt.D)).a(f);
        new dsu(g, (byte)0);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.yz);
    }
}
