// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.DatePickerDialog;
import android.content.Context;
import android.view.KeyEvent;

public class dd extends DatePickerDialog
{

    public dd(Context context, android.app.DatePickerDialog.OnDateSetListener ondatesetlistener, int i, int j, int k)
    {
        super(context, ondatesetlistener, i, j, k);
    }

    public boolean onKeyLongPress(int i, KeyEvent keyevent)
    {
        if (i == 84)
        {
            return true;
        } else
        {
            return super.onKeyLongPress(i, keyevent);
        }
    }
}
