// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.activities;

import android.content.Intent;
import android.os.Bundle;
import com.tinder.base.a;
import com.tinder.enums.UserType;
import com.tinder.fragments.bm;
import com.tinder.model.User;

public class ActivityProfile extends a
{

    bm a;
    User b;
    boolean c;

    public ActivityProfile()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getIntent();
        if (bundle == null)
        {
            finish();
            return;
        } else
        {
            b = (User)bundle.getParcelableExtra("user");
            c = bundle.getBooleanExtra("from_wear", false);
            a = bm.a(b, UserType.REC);
            b(a);
            return;
        }
    }
}
