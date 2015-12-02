// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.qihoo360.mobilesafe.share.SharedPref;
import com.qihoo360.mobilesafe.support.a;
import com.qihoo360.mobilesafe.support.a.b;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.qihoo360.common.utils:
//            Utils

public class RootUtil
{

    private static final String a[] = {
        "360s", "su"
    };

    public RootUtil()
    {
    }

    public static boolean batchRemoveSystemPackage(Context context, b b, ArrayList arraylist)
    {
        return batchRemoveSystemPackage(context, b, arraylist, null);
    }

    public static final boolean batchRemoveSystemPackage(Context context, b b, ArrayList arraylist, ArrayList arraylist1)
    {
        ArrayList arraylist2;
        ArrayList arraylist4;
        arraylist2 = new ArrayList();
        arraylist4 = new ArrayList();
        arraylist = arraylist.iterator();
        do
        {
            if (!arraylist.hasNext())
            {
                if (arraylist2.isEmpty())
                {
                    return true;
                }
                break;
            }
            String s1 = (String)arraylist.next();
            try
            {
                ApplicationInfo applicationinfo = context.getPackageManager().getApplicationInfo(s1, 0);
                if (!TextUtils.isEmpty(applicationinfo.sourceDir))
                {
                    arraylist2.add(s1);
                    arraylist4.add(applicationinfo.sourceDir);
                }
            }
            catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception) { }
        } while (true);
        if (!mountSystem(context, b, "rw")) goto _L2; else goto _L1
_L1:
        arraylist = arraylist4.iterator();
_L11:
        if (arraylist.hasNext()) goto _L4; else goto _L3
_L3:
        if (arraylist1 == null) goto _L6; else goto _L5
_L5:
        arraylist = arraylist1.iterator();
_L8:
        if (arraylist.hasNext()) goto _L7; else goto _L6
_L6:
        arraylist = arraylist2.iterator();
_L9:
        if (!arraylist.hasNext())
        {
            mountSystem(context, b, "ro");
            return true;
        }
        break MISSING_BLOCK_LABEL_255;
_L4:
        String s = (String)arraylist.next();
        ArrayList arraylist6 = new ArrayList();
        arraylist6.add(s);
        com.qihoo360.mobilesafe.support.a.b(b, "/system/bin/rm", arraylist6, 5000L);
        continue; /* Loop/switch isn't completed */
_L7:
        arraylist1 = (String)arraylist.next();
        ArrayList arraylist5 = new ArrayList();
        arraylist5.add(arraylist1);
        com.qihoo360.mobilesafe.support.a.b(b, "/system/bin/rm", arraylist5, 5000L);
          goto _L8
        arraylist1 = (String)arraylist.next();
        ArrayList arraylist3 = new ArrayList();
        arraylist3.add("-c");
        arraylist3.add((new StringBuilder("pm uninstall ")).append(arraylist1).toString());
        com.qihoo360.mobilesafe.support.a.b(b, "sh", arraylist3, 60000L);
          goto _L9
_L2:
        return false;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public static boolean isPhoneRooted()
    {
        String as[] = a;
        int j = as.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return false;
            }
            if (Utils.isCmdExist(as[i]))
            {
                return true;
            }
            i++;
        } while (true);
    }

    public static boolean mountSystem(Context context, b b, String s)
    {
        context = SharedPref.a(context);
        if (!TextUtils.isEmpty(context))
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add("-o");
            arraylist.add((new StringBuilder("remount,")).append(s).toString());
            arraylist.add(context);
            arraylist.add("/system");
            if (com.qihoo360.mobilesafe.support.a.b(b, "/system/bin/mount", arraylist, 5000L) == 0)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean removePkg(Context context, b b, String s, boolean flag)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        ArrayList arraylist;
        arraylist = new ArrayList();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        if (!mountSystem(context, b, "rw"))
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = removeSystemPackage(context, b, s);
        mountSystem(context, b, "ro");
        return flag;
        int i;
        try
        {
            arraylist.clear();
            arraylist.add("-c");
            arraylist.add((new StringBuilder("pm uninstall ")).append(s).toString());
            i = com.qihoo360.mobilesafe.support.a.b(b, "sh", arraylist, 60000L);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        if (i == 0)
        {
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static boolean removeSystemPackage(Context context, b b, String s)
    {
        context = context.getPackageManager().getApplicationInfo(s, 0);
        if (TextUtils.isEmpty(((ApplicationInfo) (context)).sourceDir))
        {
            return false;
        }
        int i;
        try
        {
            ArrayList arraylist = new ArrayList();
            arraylist.add(((ApplicationInfo) (context)).sourceDir);
            com.qihoo360.mobilesafe.support.a.b(b, "/system/bin/rm", arraylist, 5000L);
            arraylist.clear();
            arraylist.add("-c");
            arraylist.add((new StringBuilder("pm uninstall ")).append(s).toString());
            i = com.qihoo360.mobilesafe.support.a.b(b, "sh", arraylist, 60000L);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
label0:
        {
            if (i == 0)
            {
                return true;
            }
            break label0;
        }
    }

}
