// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import com.phunware.nbc.sochi.caption.fragment.CaptionListFragment;

public class CaptionStylingActivity extends AppCompatActivity
{

    private static final String TAG_FRAG_CAPTION_LIST = "frag_caption_list";

    public CaptionStylingActivity()
    {
    }

    public void onAttachedToWindow()
    {
        if (!getResources().getBoolean(0x7f0b0004))
        {
            setRequestedOrientation(1);
        }
        super.onAttachedToWindow();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getSupportActionBar().setIcon(0x7f030000);
        setContentView(0x7f040019);
        if (bundle == null)
        {
            getSupportFragmentManager().beginTransaction().replace(0x7f0f006a, new CaptionListFragment(), "frag_caption_list").commit();
        }
    }
}
