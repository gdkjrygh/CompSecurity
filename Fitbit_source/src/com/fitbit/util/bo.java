// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.content.Context;
import com.fitbit.FitBitApplication;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceVersion;
import com.fitbit.data.domain.device.ExerciseOption;
import com.fitbit.data.domain.device.TrackerScreen;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class bo
{

    public bo()
    {
    }

    public static int a(Device device)
    {
        return device == null || device.h() != DeviceVersion.SURGE ? 0x7f0800a4 : 0x7f0800a3;
    }

    public static TrackerScreen a(String s)
    {
        try
        {
            s = TrackerScreen.valueOf(s.toUpperCase());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return TrackerScreen.UNKNOWN;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return TrackerScreen.UNKNOWN;
        }
        return s;
    }

    public static String a(TrackerScreen trackerscreen)
    {
        FitBitApplication fitbitapplication = FitBitApplication.a();
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[TrackerScreen.values().length];
                try
                {
                    a[TrackerScreen.STEPS.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[TrackerScreen.ACTIVE_MINUTES.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[TrackerScreen.TIME.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[TrackerScreen.FLOORS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[TrackerScreen.CALORIES.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[TrackerScreen.DISTANCE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[TrackerScreen.HEART_RATE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[trackerscreen.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return fitbitapplication.getString(0x7f0804ef);

        case 2: // '\002'
            return fitbitapplication.getString(0x7f0802a3);

        case 3: // '\003'
            return fitbitapplication.getString(0x7f080101);

        case 4: // '\004'
            return fitbitapplication.getString(0x7f0801c7);

        case 5: // '\005'
            return fitbitapplication.getString(0x7f0800ac);

        case 6: // '\006'
            return fitbitapplication.getString(0x7f080162);

        case 7: // '\007'
            return fitbitapplication.getString(0x7f080242);
        }
    }

    public static String a(List list)
    {
        return a(list, false);
    }

    public static String a(List list, boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (list == null)
        {
            return stringbuilder.toString();
        }
        int i = 0;
        while (i < list.size()) 
        {
            Object obj;
            if (flag)
            {
                obj = a((TrackerScreen)list.get(i));
            } else
            {
                obj = (Serializable)list.get(i);
            }
            stringbuilder.append(obj);
            if (i == list.size() - 1)
            {
                continue;
            }
            stringbuilder.append(",");
            if (flag)
            {
                stringbuilder.append(" ");
            }
            i++;
        }
        return stringbuilder.toString();
    }

    public static String b(List list)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (list == null)
        {
            return stringbuilder.toString();
        }
        for (int i = 0; i < list.size(); i++)
        {
            stringbuilder.append(((ExerciseOption)list.get(i)).a());
            if (i != list.size() - 1)
            {
                stringbuilder.append(",");
            }
        }

        return stringbuilder.toString();
    }

    public static List b(String s)
    {
        ArrayList arraylist = new ArrayList(6);
        if (s != null)
        {
            s = s.split(",");
            int j = s.length;
            int i = 0;
            while (i < j) 
            {
                arraylist.add(a(s[i]));
                i++;
            }
        }
        return arraylist;
    }

    public static List c(String s)
    {
        ArrayList arraylist = new ArrayList();
        if (s != null)
        {
            s = s.split(",");
            int j = s.length;
            int i = 0;
            while (i < j) 
            {
                arraylist.add(new ExerciseOption(s[i], ""));
                i++;
            }
        }
        return arraylist;
    }
}
