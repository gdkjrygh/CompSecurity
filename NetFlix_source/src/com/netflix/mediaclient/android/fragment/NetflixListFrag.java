// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.fragment;

import android.app.ListFragment;
import android.os.Bundle;

public abstract class NetflixListFrag extends ListFragment
{

    public NetflixListFrag()
    {
    }

    public void onCreate(Bundle bundle)
    {
        throw new IllegalAccessError("GKB: Don't use ListFragments - they kill our ability to maintain a single fragment hierarchy (e.g. NetflixFragment)");
    }
}
