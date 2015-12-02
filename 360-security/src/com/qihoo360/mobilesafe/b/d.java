// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.b;

import android.app.Activity;
import android.app.Dialog;

public class d
{

    public static void a(Dialog dialog)
    {
        if (dialog != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        android.content.Context context;
        try
        {
            context = dialog.getContext();
        }
        // Misplaced declaration of an exception variable
        catch (Dialog dialog)
        {
            return;
        }
        if (context == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if ((context instanceof Activity) && ((Activity)context).isFinishing()) goto _L1; else goto _L3
_L3:
        if (dialog == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (dialog.isShowing()) goto _L1; else goto _L4
_L4:
        dialog.show();
        return;
    }

    public static void b(Dialog dialog)
    {
        if (dialog != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        android.content.Context context;
        try
        {
            context = dialog.getContext();
        }
        // Misplaced declaration of an exception variable
        catch (Dialog dialog)
        {
            return;
        }
        if (context == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if ((context instanceof Activity) && ((Activity)context).isFinishing()) goto _L1; else goto _L3
_L3:
        if (dialog == null) goto _L1; else goto _L4
_L4:
        if (!dialog.isShowing()) goto _L1; else goto _L5
_L5:
        dialog.dismiss();
        return;
    }
}
