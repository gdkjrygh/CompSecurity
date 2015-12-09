// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.supersonicads.sdk.controller;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.OrientationEventListener;
import com.supersonicads.sdk.b.d;

// Referenced classes of package com.supersonicads.sdk.controller:
//            ControllerActivity

private class b extends OrientationEventListener
{

    public int a;
    public int b;
    final ControllerActivity c;

    public void onOrientationChanged(int i)
    {
        if (i != -1) goto _L2; else goto _L1
_L1:
        c.setRequestedOrientation(ControllerActivity.a(c));
_L21:
        return;
_L2:
        if (i > 45 && i <= 315) goto _L4; else goto _L3
_L3:
        c.b;
        JVM INSTR tableswitch 0 2: default 68
    //                   0 83
    //                   1 116
    //                   2 128;
           goto _L5 _L6 _L7 _L8
_L5:
        c.setRequestedOrientation(ControllerActivity.a(c));
        return;
_L6:
        if (a == 2)
        {
            ControllerActivity.a(c, 9);
        } else
        {
            ControllerActivity.a(c, 1);
        }
        continue; /* Loop/switch isn't completed */
_L7:
        ControllerActivity.a(c, 0);
        continue; /* Loop/switch isn't completed */
_L8:
        if (a == 2)
        {
            if (b == 2)
            {
                ControllerActivity.a(c, 0);
            } else
            {
                ControllerActivity.a(c, 0);
            }
        } else
        {
            ControllerActivity.a(c, 1);
        }
        if (true) goto _L5; else goto _L4
_L4:
        if (i <= 45 || i > 135) goto _L10; else goto _L9
_L9:
        c.b;
        JVM INSTR tableswitch 0 2: default 228
    //                   0 243
    //                   1 255
    //                   2 268;
           goto _L11 _L12 _L13 _L14
_L11:
        c.setRequestedOrientation(ControllerActivity.a(c));
        return;
_L12:
        ControllerActivity.a(c, 1);
        continue; /* Loop/switch isn't completed */
_L13:
        ControllerActivity.a(c, 8);
        continue; /* Loop/switch isn't completed */
_L14:
        if (a == 2)
        {
            ControllerActivity.a(c, 1);
        } else
        {
            ControllerActivity.a(c, 8);
        }
        if (true) goto _L11; else goto _L10
_L10:
        if (i <= 135 || i > 225)
        {
            continue; /* Loop/switch isn't completed */
        }
        c.b;
        JVM INSTR tableswitch 0 2: default 348
    //                   0 363
    //                   1 396
    //                   2 409;
           goto _L15 _L16 _L17 _L18
_L15:
        c.setRequestedOrientation(ControllerActivity.a(c));
        return;
_L16:
        if (a == 2)
        {
            ControllerActivity.a(c, 9);
        } else
        {
            ControllerActivity.a(c, 1);
        }
        continue; /* Loop/switch isn't completed */
_L17:
        ControllerActivity.a(c, 8);
        continue; /* Loop/switch isn't completed */
_L18:
        if (a == 2)
        {
            if (b == 2)
            {
                ControllerActivity.a(c, 8);
            } else
            {
                ControllerActivity.a(c, 8);
            }
        } else
        {
            ControllerActivity.a(c, 9);
        }
        if (true) goto _L15; else goto _L19
_L19:
        if (i <= 225 || i > 315) goto _L21; else goto _L20
_L20:
        c.b;
        JVM INSTR tableswitch 0 2: default 512
    //                   0 527
    //                   1 540
    //                   2 552;
           goto _L22 _L23 _L24 _L25
_L22:
        c.setRequestedOrientation(ControllerActivity.a(c));
        return;
_L23:
        ControllerActivity.a(c, 9);
        continue; /* Loop/switch isn't completed */
_L24:
        ControllerActivity.a(c, 0);
        continue; /* Loop/switch isn't completed */
_L25:
        if (a == 2)
        {
            if (b == 2)
            {
                ControllerActivity.a(c, 9);
            } else
            {
                ControllerActivity.a(c, 9);
            }
        } else
        {
            ControllerActivity.a(c, 0);
        }
        if (true) goto _L22; else goto _L26
_L26:
    }

    public (ControllerActivity controlleractivity, Context context, int i)
    {
        c = controlleractivity;
        super(context, i);
        a = 1;
        b = 1;
        a = d.b(context);
        b = context.getResources().getConfiguration().orientation;
    }
}
