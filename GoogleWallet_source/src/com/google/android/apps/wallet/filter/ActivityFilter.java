// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.filter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Menu;
import android.view.MenuItem;

public abstract class ActivityFilter
{

    public ActivityFilter()
    {
    }

    protected static boolean onCreateOptionsMenu(Menu menu)
    {
        return false;
    }

    protected void onAttachFragment(Fragment fragment)
    {
    }

    protected Intent onCreate(Bundle bundle)
    {
        return null;
    }

    protected void onDestroy()
    {
    }

    protected boolean onOptionsMenuSelected(MenuItem menuitem)
    {
        return false;
    }

    protected void onPause()
    {
    }

    protected void onPostCreate(Bundle bundle)
    {
    }

    protected void onPostResume()
    {
    }

    protected boolean onPrepareOptionsMenu(Menu menu)
    {
        return false;
    }

    protected void onResume()
    {
    }

    protected void onStart()
    {
    }
}
