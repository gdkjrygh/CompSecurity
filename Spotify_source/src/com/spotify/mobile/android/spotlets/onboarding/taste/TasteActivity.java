// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.onboarding.taste;

import aa;
import ah;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.widget.FrameLayout;
import edb;
import ewn;
import fou;
import java.util.Stack;

public class TasteActivity extends fou
{

    public Stack d;

    public TasteActivity()
    {
        d = new Stack();
    }

    public static Intent a(Context context)
    {
        return new Intent(context, com/spotify/mobile/android/spotlets/onboarding/taste/TasteActivity);
    }

    public final void a(Fragment fragment)
    {
        d.clear();
        a_().a().b(0x7f1100ff, fragment).c();
    }

    public final edb c()
    {
        return h;
    }

    public void onBackPressed()
    {
        if (d.size() > 0)
        {
            a_().a().a((Fragment)d.pop()).c();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = new FrameLayout(this);
        bundle.setId(0x7f1100ff);
        setContentView(bundle);
        a(new ewn());
    }
}
