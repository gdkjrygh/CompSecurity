// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.barcode.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.Loader;
import com.fitbit.data.bl.ci;

public class a
    implements android.support.v4.app.LoaderManager.LoaderCallbacks
{

    private FragmentActivity a;
    private boolean b;

    public a(FragmentActivity fragmentactivity)
    {
        b = false;
        a = fragmentactivity;
    }

    public void a(Loader loader, Boolean boolean1)
    {
        b = boolean1.booleanValue();
        if (a != null)
        {
            a.supportInvalidateOptionsMenu();
        }
    }

    public boolean a()
    {
        return b;
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        return new _cls1(a, ci.c());
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (Boolean)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    /* member class not found */
    class _cls1 {}

}
