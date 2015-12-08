// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;

import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import com.cardinalblue.android.piccollage.a.f;
import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubePlayerFragment;
import com.google.android.youtube.player.b;
import com.google.android.youtube.player.d;

public class YoutubeActivity extends YouTubeBaseActivity
    implements com.google.android.youtube.player.d.a
{

    private String a;

    public YoutubeActivity()
    {
    }

    public void a(com.google.android.youtube.player.d.b b, b b1)
    {
        f.a(new IllegalStateException((new StringBuilder()).append("YoutubeActivity.onInitializationFailure provider : ").append(b).append(" result : ").append(b1).toString()));
        finish();
    }

    public void a(com.google.android.youtube.player.d.b b, d d1, boolean flag)
    {
        d1.a(a);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
        setContentView(0x7f030043);
        bundle = getIntent();
        if (bundle != null)
        {
            a = bundle.getStringExtra("extra_video_id");
        }
        ((YouTubePlayerFragment)getFragmentManager().findFragmentById(0x7f100106)).a(getString(0x7f0703b5), this);
    }
}
