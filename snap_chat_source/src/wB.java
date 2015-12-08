// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.snapchat.android.ui.RotateLayout;

public final class wB
{

    public RotateLayout a;
    public int b;
    private final Context c;

    public wB(Context context)
    {
        b = 1;
        c = context;
    }

    public final void a(int i)
    {
        boolean flag = true;
        if (a != null && b != i && i != 256)
        {
            if (android.provider.Settings.System.getInt(c.getContentResolver(), "accelerometer_rotation", 1) == 0)
            {
                flag = false;
            }
            if (flag)
            {
                b(i);
                return;
            }
        }
    }

    public final boolean a()
    {
        return b == 16 || b == 4096;
    }

    public final void b(int i)
    {
        if (i != 16) goto _L2; else goto _L1
_L1:
        a.setAngle(270);
_L4:
        b = i;
        return;
_L2:
        if (i == 1)
        {
            a.setAngle(0);
        } else
        if (i == 4096)
        {
            a.setAngle(90);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
