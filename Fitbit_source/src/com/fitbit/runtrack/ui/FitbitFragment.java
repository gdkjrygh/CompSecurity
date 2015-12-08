// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.runtrack.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;

public class FitbitFragment extends Fragment
{

    private Runnable a;

    public FitbitFragment()
    {
    }

    public void a(Runnable runnable)
    {
        a = runnable;
    }

    public void onDestroy()
    {
        super.onDestroy();
        a = null;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (a != null)
        {
            a.run();
        }
    }
}
