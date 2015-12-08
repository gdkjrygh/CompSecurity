// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.onboarding;

import android.content.Intent;
import android.os.Bundle;
import ay;
import b;
import bp;
import fnt;
import ggp;
import gia;
import gil;
import nfw;
import omr;
import s;

public class AccountPickerActivity extends omr
{

    public AccountPickerActivity()
    {
        (new nfw(this, e)).a(d);
        new gil(this, e);
        (new fnt(this, e)).a(d);
        (new gia()).a(d);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(b.rK);
        boolean flag = getIntent().getBooleanExtra("show_account_list_opened", false);
        bundle = c();
        if (bundle.a(s.ab) == null)
        {
            bundle.a().a(s.ab, ggp.a(flag)).b();
        }
    }
}
