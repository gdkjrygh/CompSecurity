// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.common;

import com.lyft.scoop.Screen;

// Referenced classes of package me.lyft.android.common:
//            SingleInstance, ObjectUtils

public class ScreenUtils
{

    public ScreenUtils()
    {
    }

    public static String getFormattedName(Screen screen)
    {
        screen = screen.getName().replaceAll(".*\\$", "");
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < screen.length(); i++)
        {
            char c1 = screen.charAt(i);
            char c = c1;
            if (Character.isUpperCase(c1))
            {
                c1 = Character.toLowerCase(c1);
                c = c1;
                if (i != 0)
                {
                    stringbuilder.append('_');
                    c = c1;
                }
            }
            stringbuilder.append(c);
        }

        return stringbuilder.toString().replaceAll("_screen$", "");
    }

    public static boolean sameSingleInstanceScreen(Screen screen, Screen screen1)
    {
        return ObjectUtils.hasAnnotation(screen, me/lyft/android/common/SingleInstance) && screen.equals(screen1);
    }
}
