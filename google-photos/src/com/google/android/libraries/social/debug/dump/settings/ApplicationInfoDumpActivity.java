// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.social.debug.dump.settings;

import android.os.Bundle;
import ay;
import b;
import bp;
import mnk;
import mwb;
import ome;
import q;

public final class ApplicationInfoDumpActivity extends ome
{

    public ApplicationInfoDumpActivity()
    {
        (new mnk(this, g)).a(f);
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.Ex);
        bundle = c();
        if (bundle.a(q.bo) == null)
        {
            mwb mwb1 = new mwb();
            bundle.a().a(q.bo, mwb1).b();
        }
    }
}
