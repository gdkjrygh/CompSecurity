// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.policies;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import com.soundcloud.android.dialog.ImageAlertDialog;
import java.util.concurrent.TimeUnit;

class GoBackOnlineDialogPresenter
{

    private final Resources resources;

    public GoBackOnlineDialogPresenter(Resources resources1)
    {
        resources = resources1;
    }

    private String getContentText(int i)
    {
        if (i == 0)
        {
            return resources.getString(0x7f0702d9);
        } else
        {
            return resources.getQuantityString(0x7f09001e, i, new Object[] {
                Integer.valueOf(i)
            });
        }
    }

    private String getTitleText(int i)
    {
        if (i == 0)
        {
            return resources.getString(0x7f0702da);
        } else
        {
            return resources.getQuantityString(0x7f09001f, i, new Object[] {
                Integer.valueOf(i)
            });
        }
    }

    int getRemainingDaysToGoOnline(long l)
    {
        return (int)Math.max(30L - TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - l), 0L);
    }

    public void show(Activity activity, long l)
    {
        int i = getRemainingDaysToGoOnline(l);
        (new ImageAlertDialog(activity)).setContent(0x7f0200f7, getTitleText(i), getContentText(i)).setPositiveButton(0x7f0702d8, null).create().show();
    }
}
