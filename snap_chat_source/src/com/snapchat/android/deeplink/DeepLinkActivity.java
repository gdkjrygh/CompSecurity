// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.deeplink;

import Bt;
import HZ;
import android.content.Intent;
import android.os.Bundle;
import com.snapchat.android.SnapchatActivity;

public class DeepLinkActivity extends SnapchatActivity
{

    public DeepLinkActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getIntent().putExtra("deep_link_intent", true);
        if (Bt.t())
        {
            HZ.a(this, true);
            return;
        } else
        {
            HZ.a(this, true, false);
            return;
        }
    }
}
