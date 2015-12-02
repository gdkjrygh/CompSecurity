// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import android.content.pm.PackageParser;
import android.util.DisplayMetrics;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class PortPackageParser
{

    private static final String a = com/qihoo360/common/utils/PortPackageParser.getSimpleName();

    public PortPackageParser()
    {
    }

    public static PackageParser newPackageParser(String s)
    {
        try
        {
            Constructor constructor = android/content/pm/PackageParser.getConstructor(new Class[] {
                java/lang/String
            });
            constructor.setAccessible(true);
            s = (PackageParser)constructor.newInstance(new Object[] {
                s
            });
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            try
            {
                s = android/content/pm/PackageParser.getConstructor(new Class[0]);
                s.setAccessible(true);
                s = (PackageParser)s.newInstance(new Object[0]);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            return s;
        }
        return s;
    }

    public static android.content.pm.PackageParser.Package parsePackage(File file, String s, DisplayMetrics displaymetrics, int i)
    {
        PackageParser packageparser;
        packageparser = newPackageParser(file.getAbsolutePath());
        if (packageparser == null)
        {
            return null;
        }
        Method method = android/content/pm/PackageParser.getMethod("parsePackage", new Class[] {
            java/io/File, java/lang/String, android/util/DisplayMetrics, Integer.TYPE
        });
        method.setAccessible(true);
        s = (android.content.pm.PackageParser.Package)method.invoke(packageparser, new Object[] {
            file, s, displaymetrics, Integer.valueOf(i)
        });
        return s;
        s;
        file = (android.content.pm.PackageParser.Package)android/content/pm/PackageParser.getMethod("parsePackage", new Class[] {
            java/io/File, Integer.TYPE
        }).invoke(packageparser, new Object[] {
            file, Integer.valueOf(i)
        });
        return file;
        file;
_L2:
        return null;
        file;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static android.content.pm.PackageParser.Package parsePackage(String s)
    {
        newPackageParser(s);
        DisplayMetrics displaymetrics = new DisplayMetrics();
        displaymetrics.setToDefaults();
        return parsePackage(new File(s), s, displaymetrics, 0);
    }

}
