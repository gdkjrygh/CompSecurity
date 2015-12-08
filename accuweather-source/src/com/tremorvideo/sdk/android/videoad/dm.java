// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.ProgressDialog;
import android.content.Context;
import android.view.KeyEvent;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            dn

public class dm extends ProgressDialog
{

    protected dm(Context context)
    {
        super(context);
        setCancelable(false);
    }

    public static dm a(Context context)
    {
        if (Integer.parseInt(android.os.Build.VERSION.SDK) < 5)
        {
            return new dm(context);
        } else
        {
            return new dn(context);
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
