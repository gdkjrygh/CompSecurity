// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.coocent.android.exitwithrate;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class InstallTimeChecker
{

    public String promotionEndString;

    public InstallTimeChecker()
    {
        promotionEndString = "2015-06-10 23:59:59";
    }

    public Date apkUpdateTime(PackageManager packagemanager, String s)
    {
label0:
        {
            try
            {
                packagemanager = new File(packagemanager.getApplicationInfo(s, 0).sourceDir);
                if (!packagemanager.exists())
                {
                    break label0;
                }
                packagemanager = new Date(packagemanager.lastModified());
            }
            // Misplaced declaration of an exception variable
            catch (PackageManager packagemanager)
            {
                return null;
            }
            return packagemanager;
        }
        return null;
    }

    public boolean isPromotionTime(Context context)
    {
        SimpleDateFormat simpledateformat;
        simpledateformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = context.getPackageName();
        context = apkUpdateTime(context.getPackageManager(), s);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        boolean flag;
        GregorianCalendar gregoriancalendar = new GregorianCalendar();
        gregoriancalendar.setTime(simpledateformat.parse(promotionEndString));
        flag = context.before(gregoriancalendar.getTime());
        return flag;
        context;
        context.printStackTrace();
        return false;
    }

    public void setpromotionTime(String s)
    {
        promotionEndString = s;
    }
}
