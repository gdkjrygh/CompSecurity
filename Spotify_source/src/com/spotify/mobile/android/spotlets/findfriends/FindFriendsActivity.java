// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.findfriends;

import aa;
import ah;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import esh;
import fou;
import fyw;

public class FindFriendsActivity extends fou
{

    public FindFriendsActivity()
    {
    }

    public static Intent a(Context context, Flags flags)
    {
        Intent intent = new Intent();
        intent.setClass(context, com/spotify/mobile/android/spotlets/findfriends/FindFriendsActivity);
        fyw.a(intent, flags);
        return intent;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Object obj = new FrameLayout(this);
        ((FrameLayout) (obj)).setId(0x7f1100ff);
        ((FrameLayout) (obj)).setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        setContentView(((android.view.View) (obj)));
        obj = fyw.a(this);
        if (bundle == null)
        {
            bundle = esh.a(((Flags) (obj)));
            a_().a().b(0x7f1100ff, bundle).c();
        }
    }
}
