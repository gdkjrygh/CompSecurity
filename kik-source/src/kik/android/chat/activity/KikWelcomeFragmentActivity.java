// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.activity;

import android.content.Intent;
import android.os.Bundle;
import kik.android.chat.KikApplication;
import kik.android.chat.fragment.KikWelcomeFragment;
import kik.android.chat.fragment.SimpleFragmentWrapperActivity;

public class KikWelcomeFragmentActivity extends SimpleFragmentWrapperActivity
{

    public KikWelcomeFragmentActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        if (getIntent() != null)
        {
            getIntent().putExtra("SimpleFragmentWrapperActivity.fragmentlaunchclass", kik/android/chat/fragment/KikWelcomeFragment.getCanonicalName());
        }
        super.onCreate(bundle);
    }

    protected void onPause()
    {
        super.onPause();
        ((KikApplication)getApplication()).c(this);
    }

    protected void onResume()
    {
        super.onResume();
        ((KikApplication)getApplication()).d(this);
    }
}
