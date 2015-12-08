// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.Display;
import android.view.WindowManager;
import com.spotify.mobile.android.util.Assertion;

public final class flr
{

    public final int a;
    private final Context b;

    public flr(Context context)
    {
        int i;
        int j;
        i = 0;
        j = 0;
        super();
        b = (Context)cvp.a(context);
        context = b.getResources().getConfiguration();
        if (((Configuration) (context)).orientation != 0) goto _L2; else goto _L1
_L1:
        i = j;
_L6:
        a = i;
        return;
_L2:
        j = ((WindowManager)b.getSystemService("window")).getDefaultDisplay().getRotation();
        j;
        JVM INSTR tableswitch 0 3: default 96
    //                   0 124
    //                   1 142
    //                   2 124
    //                   3 142;
           goto _L3 _L4 _L5 _L4 _L5
_L3:
        Assertion.a((new StringBuilder("Unexpected orientation ")).append(j).toString());
_L7:
        if (i != 0)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        if (true) goto _L6; else goto _L4
_L4:
        if (((Configuration) (context)).orientation == 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
          goto _L7
_L5:
        if (((Configuration) (context)).orientation == 2)
        {
            i = 1;
        }
          goto _L7
    }

    public static boolean b(int i)
    {
        while (i < 0 || i <= 335 && i >= 25 && (i <= 155 || i >= 205)) 
        {
            return false;
        }
        return true;
    }

    public static boolean c(int i)
    {
        while (i < 0 || Math.abs(i - 90) >= 15 && Math.abs(i - 270) >= 15) 
        {
            return false;
        }
        return true;
    }

    public final boolean a()
    {
        int i;
        try
        {
            i = android.provider.Settings.System.getInt(b.getContentResolver(), "accelerometer_rotation");
        }
        catch (android.provider.Settings.SettingNotFoundException settingnotfoundexception)
        {
            return false;
        }
        return i == 1;
    }

    public final boolean a(int i)
    {
        if (a == 2)
        {
            return b(i);
        }
        if (a == 1)
        {
            return c(i);
        } else
        {
            return false;
        }
    }
}
