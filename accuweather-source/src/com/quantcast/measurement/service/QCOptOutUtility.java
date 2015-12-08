// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.quantcast.measurement.service;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.quantcast.measurement.service:
//            QCNotificationCenter

class QCOptOutUtility
{

    private static final String QCMEASUREMENT_OPTOUT_STRING = "QC-OPT-OUT";
    public static final String QC_NOTIF_OPT_OUT_CHANGED = "QC_OUC";

    QCOptOutUtility()
    {
    }

    static void askEveryone(Context context, boolean flag, boolean flag1)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj = Boolean.valueOf(false);
        obj2 = context.getPackageManager();
        obj1 = obj;
        if (obj2 == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = ((PackageManager) (obj2)).getInstalledPackages(0).iterator();
_L5:
        do
        {
            obj1 = obj;
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            obj1 = (PackageInfo)iterator.next();
        } while (((PackageInfo) (obj1)).packageName.equals(context.getPackageName()));
        obj2 = obj;
        obj1 = context.createPackageContext(((PackageInfo) (obj1)).packageName, 0);
        if (!flag1) goto _L4; else goto _L3
_L3:
        obj2 = obj;
        if (isQuantified(((Context) (obj1))))
        {
            obj2 = obj;
            boolean flag2;
            try
            {
                createOptOut(((Context) (obj1)), flag);
            }
            catch (Exception exception)
            {
                exception = ((Exception) (obj2));
            }
        }
        if (true) goto _L5; else goto _L4
_L4:
        obj2 = obj;
        obj1 = Boolean.valueOf(isOptedOut(((Context) (obj1)), false));
        obj2 = obj1;
        flag2 = ((Boolean) (obj1)).booleanValue();
        obj = obj1;
        if (!flag2) goto _L6; else goto _L2
_L6:
        break; /* Loop/switch isn't completed */
_L2:
        if (!flag1)
        {
            createOptOut(context, ((Boolean) (obj1)).booleanValue());
        }
        return;
    }

    static void createOptOut(Context context, boolean flag)
    {
        Context context1;
        Context context2;
        context2 = null;
        context1 = null;
        context = context.openFileOutput("QC-OPT-OUT", 3);
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        context1 = context;
        context2 = context;
        context.write(i);
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        context.close();
_L2:
        return;
        context;
        if (context1 == null) goto _L2; else goto _L1
_L1:
        try
        {
            context1.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
        context;
        if (context2 != null)
        {
            try
            {
                context2.close();
            }
            catch (IOException ioexception) { }
        }
        throw context;
        context;
    }

    static boolean isOptedOut(Context context)
    {
        return isOptedOut(context, true);
    }

    private static boolean isOptedOut(Context context, boolean flag)
    {
        FileInputStream fileinputstream;
        Object obj;
        FileInputStream fileinputstream2;
        boolean flag1;
        flag1 = false;
        fileinputstream2 = null;
        obj = null;
        fileinputstream = null;
        FileInputStream fileinputstream1 = context.openFileInput("QC-OPT-OUT");
        fileinputstream = fileinputstream1;
        fileinputstream2 = fileinputstream1;
        obj = fileinputstream1;
        int i = fileinputstream1.read();
        if (i != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = flag;
        if (fileinputstream1 != null)
        {
            try
            {
                fileinputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return flag;
            }
            flag1 = flag;
        }
        return flag1;
        obj;
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = fileinputstream;
        askEveryone(context, false, false);
        if (fileinputstream == null) goto _L2; else goto _L1
_L1:
        break MISSING_BLOCK_LABEL_83;
_L2:
        break MISSING_BLOCK_LABEL_58;
        try
        {
            fileinputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return false;
        context;
        if (fileinputstream2 != null)
        {
            try
            {
                fileinputstream2.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return false;
            }
            return false;
        } else
        {
            break MISSING_BLOCK_LABEL_58;
        }
        context;
        if (obj != null)
        {
            try
            {
                ((FileInputStream) (obj)).close();
            }
            catch (IOException ioexception) { }
        }
        throw context;
    }

    static boolean isQuantified(Context context)
    {
        context = context.getFileStreamPath("QC-OPT-OUT");
        return context != null && context.exists();
    }

    static void saveOptOutStatus(Context context, boolean flag)
    {
        createOptOut(context, flag);
        askEveryone(context, flag, true);
        QCNotificationCenter.INSTANCE.postNotification("QC_OUC", Boolean.valueOf(flag));
    }
}
