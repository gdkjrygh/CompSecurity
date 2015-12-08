// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.Display;
import android.view.WindowManager;

// Referenced classes of package crittercism.android:
//            bv, bw

public static final class 
    implements bv
{

    private Integer a;

    public final String a()
    {
        return "orientation";
    }

    public final volatile Object b()
    {
        return a;
    }

    public r()
    {
        a = null;
        bw.b();
        int j = bw.b().getResources().getConfiguration().orientation;
        int i = j;
        if (j == 0)
        {
            Display display = ((WindowManager)bw.b().getSystemService("window")).getDefaultDisplay();
            if (display.getWidth() == display.getHeight())
            {
                i = 3;
            } else
            if (display.getWidth() > display.getHeight())
            {
                i = 2;
            } else
            {
                i = 1;
            }
        }
        a = Integer.valueOf(i);
    }
}
