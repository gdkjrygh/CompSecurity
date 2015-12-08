// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.app;

import android.view.View;
import android.widget.AdapterView;

class NavItemSelectedListener
    implements android.widget.AdapterView.OnItemSelectedListener
{

    private final android.support.v7.app.ActionBar.OnNavigationListener mListener;

    public NavItemSelectedListener(android.support.v7.app.ActionBar.OnNavigationListener onnavigationlistener)
    {
        mListener = onnavigationlistener;
    }

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (mListener != null)
        {
            mListener.onNavigationItemSelected(i, l);
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }
}
