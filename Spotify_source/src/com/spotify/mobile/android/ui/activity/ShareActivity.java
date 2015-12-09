// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.activity;

import aa;
import ah;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import com.spotify.android.paste.widget.DialogLayout;
import fou;
import fyw;
import fzq;

public class ShareActivity extends fou
{

    public ShareActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        Object obj = new DialogLayout(this);
        setContentView(((android.view.View) (obj)));
        String s = getIntent().getStringExtra("title");
        ((DialogLayout) (obj)).a(s);
        Object obj1 = new FrameLayout(this);
        ((FrameLayout) (obj1)).setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        ((FrameLayout) (obj1)).setId(0x7f1100ff);
        ((DialogLayout) (obj)).a(((android.view.View) (obj1)));
        obj = (Intent)getIntent().getParcelableExtra("intent");
        boolean flag = getIntent().getBooleanExtra("include_share_to_spotify", true);
        obj1 = getIntent().getStringExtra("twitter_share_text");
        String s1 = getIntent().getStringExtra("friend_to_friend_email_specific_subject");
        String s2 = getIntent().getStringExtra("friend_to_friend_email_specific_text");
        if (bundle == null)
        {
            bundle = fzq.a(((Intent) (obj)), s, flag, ((String) (obj1)), s1, s2, fyw.a(this));
            a_().a().a(0x7f1100ff, bundle).c();
        }
    }
}
