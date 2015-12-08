// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.captioning;

import android.app.Activity;
import android.os.Bundle;

public class BrightcoveCaptionPropertiesActivity extends Activity
{

    public BrightcoveCaptionPropertiesActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(com.brightcove.player.R.layout.caption_prefs_activity);
    }
}
