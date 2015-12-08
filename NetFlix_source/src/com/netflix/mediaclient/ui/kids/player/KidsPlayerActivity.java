// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.player;

import android.os.Bundle;
import com.netflix.mediaclient.ui.player.PlayerActivity;

public class KidsPlayerActivity extends PlayerActivity
{

    public KidsPlayerActivity()
    {
    }

    public boolean isForKids()
    {
        return true;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setRequestedOrientation(6);
    }

    protected boolean shouldShowKidsBackground()
    {
        return false;
    }
}
