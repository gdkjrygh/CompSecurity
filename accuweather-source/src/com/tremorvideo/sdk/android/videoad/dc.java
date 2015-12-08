// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.DatePickerDialog;
import android.content.Context;
import android.view.KeyEvent;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            dd

public class dc extends DatePickerDialog
{

    public dc(Context context, android.app.DatePickerDialog.OnDateSetListener ondatesetlistener, int i, int j, int k)
    {
        super(context, ondatesetlistener, i, j, k);
    }

    public static DatePickerDialog a(Context context, android.app.DatePickerDialog.OnDateSetListener ondatesetlistener, int i, int j, int k)
    {
        if (Integer.parseInt(android.os.Build.VERSION.SDK) < 5)
        {
            return new dc(context, ondatesetlistener, i, j, k);
        } else
        {
            return new dd(context, ondatesetlistener, i, j, k);
        }
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 84)
        {
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }
}
