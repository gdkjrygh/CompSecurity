// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.activity;

import android.app.ListActivity;
import android.os.Bundle;

public class NetflixListActivity extends ListActivity
{

    public NetflixListActivity()
    {
    }

    protected void onCreate(Bundle bundle)
    {
        throw new IllegalAccessError("GKB: Don't use ListActivities - they kill our ability to maintain a single activity hierarchy (e.g. NetflixActivity)");
    }
}
