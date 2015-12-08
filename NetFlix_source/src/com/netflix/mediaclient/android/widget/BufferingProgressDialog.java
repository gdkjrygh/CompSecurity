// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.widget;

import android.app.ProgressDialog;
import android.view.KeyEvent;
import com.netflix.mediaclient.android.activity.NetflixActivity;

public class BufferingProgressDialog extends ProgressDialog
{

    private final NetflixActivity netflixActivity;

    public BufferingProgressDialog(NetflixActivity netflixactivity)
    {
        super(netflixactivity);
        netflixActivity = netflixactivity;
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    public BufferingProgressDialog(NetflixActivity netflixactivity, int i)
    {
        super(netflixactivity, i);
        netflixActivity = netflixactivity;
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            netflixActivity.onKeyDown(i, keyevent);
        } else
        if (i != 84)
        {
            return super.onKeyDown(i, keyevent);
        }
        return true;
    }

    public boolean onSearchRequested()
    {
        return false;
    }
}
