// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.nux;

import android.content.Intent;
import android.os.Bundle;
import com.facebook.base.activity.i;
import com.facebook.debug.log.b;
import com.facebook.o;
import com.facebook.widget.titlebar.a;
import com.facebook.widget.titlebar.c;

public class LearnMoreActivity extends i
{

    private static final Class p = com/facebook/orca/nux/LearnMoreActivity;

    public LearnMoreActivity()
    {
    }

    protected void b(Bundle bundle)
    {
        super.b(bundle);
        bundle = getIntent();
        if (bundle.hasExtra("layout"))
        {
            setContentView(bundle.getIntExtra("layout", -1));
        } else
        {
            com.facebook.debug.log.b.e(p, "No layout specified for learn more activity!");
        }
        c.a(this);
        ((a)findViewById(com.facebook.i.titlebar)).setTitle(o.nux_learn_more_activity_title);
    }

}
