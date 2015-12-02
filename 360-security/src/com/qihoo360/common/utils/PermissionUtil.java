// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageParser;
import android.content.pm.Signature;
import android.os.Binder;
import android.os.Process;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.qihoo360.mobilesafe.support.NativeManager;
import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package com.qihoo360.common.utils:
//            Utils

public class PermissionUtil
{

    private static final String a[] = {
        "dc6dbd6e49682a57a8b82889043b93a8", "2731710b7b726b51ab58e8ccbcfeb586", "3bd87d5c8d98f7d711eff0d82d8fe7b9", "1d4dcf3a79293e05fa9744444263d048", "ca45263bc938da16ef1b069c95e61ba2", "85b6bfbb179f2467bd5e5e53577d8b15", "3093dc0f7ce2079d807d78a798231e9b", "fec53268a38f029357056d46098c9384", "bb5cf8250d16d684a7b1e28b12780636"
    };
    private static final String b[] = {
        "dc6dbd6e49682a57a8b82889043b93a8", "2731710b7b726b51ab58e8ccbcfeb586", "3bd87d5c8d98f7d711eff0d82d8fe7b9", "1d4dcf3a79293e05fa9744444263d048", "ca45263bc938da16ef1b069c95e61ba2", "85b6bfbb179f2467bd5e5e53577d8b15", "3093dc0f7ce2079d807d78a798231e9b", "a281859a082fa0105c5324e37901db1e", "6a58ae93009f378a4d81d16b99084a1d", "5dc8201f7db1ba4b9c8fc44146c5bcc2", 
        "e89b158e4bcf988ebd09eb83f5378e87", "fec53268a38f029357056d46098c9384", "bb5cf8250d16d684a7b1e28b12780636"
    };
    private static final String c[] = {
        "com.qihoo360.messager"
    };

    public PermissionUtil()
    {
    }

    private static boolean a()
    {
        return Math.abs((System.currentTimeMillis() - b()) / 0x5265c00L) < 60L;
    }

    private static boolean a(PackageManager packagemanager, String s)
    {
        String as[];
        int i;
        int j;
        int k;
        int l;
        boolean flag;
        try
        {
            packagemanager = packagemanager.getPackageInfo(s, 64).signatures;
        }
        // Misplaced declaration of an exception variable
        catch (PackageManager packagemanager)
        {
            return false;
        }
        if (packagemanager == null) goto _L2; else goto _L1
_L1:
        if (packagemanager.length <= 0) goto _L2; else goto _L3
_L3:
        k = packagemanager.length;
        i = 0;
          goto _L4
_L6:
        s = Utils.getMD5(packagemanager[i].toByteArray());
        as = a;
        l = as.length;
        j = 0;
          goto _L5
_L8:
        flag = as[j].equals(s);
        if (flag)
        {
            return true;
        }
        j++;
        continue; /* Loop/switch isn't completed */
_L4:
        if (i < k) goto _L6; else goto _L2
_L2:
        return false;
_L5:
        if (j < l) goto _L8; else goto _L7
_L7:
        i++;
          goto _L4
    }

    private static boolean a(PackageManager packagemanager, String s, String s1)
    {
        int i;
        int j;
        boolean flag;
        try
        {
            packagemanager = packagemanager.getPackageInfo(s, 64).signatures;
        }
        // Misplaced declaration of an exception variable
        catch (PackageManager packagemanager)
        {
            return false;
        }
        if (packagemanager == null) goto _L2; else goto _L1
_L1:
        if (packagemanager.length <= 0) goto _L2; else goto _L3
_L3:
        j = packagemanager.length;
        i = 0;
          goto _L4
_L5:
        flag = ensureCallerByKey(Utils.getMD5(packagemanager[i].toByteArray()), s1);
        if (flag)
        {
            return true;
        }
        i++;
_L4:
        if (i < j) goto _L5; else goto _L2
_L2:
        return false;
    }

    private static Signature[] a(String s)
    {
        PackageParser packageparser;
        packageparser = new PackageParser(s);
        DisplayMetrics displaymetrics = new DisplayMetrics();
        displaymetrics.setToDefaults();
        s = packageparser.parsePackage(new File(s), s, displaymetrics, 0);
        break MISSING_BLOCK_LABEL_37;
        if (s != null && packageparser.collectCertificates(s, 64))
        {
            int i = ((android.content.pm.PackageParser.Package) (s)).mSignatures.length;
            if (i > 0)
            {
                Signature asignature[] = new Signature[i];
                System.arraycopy(((android.content.pm.PackageParser.Package) (s)).mSignatures, 0, asignature, 0, i);
                return asignature;
            }
        }
        return null;
    }

    private static long b()
    {
        Date date;
        Object obj;
        obj = new SimpleDateFormat("yyyyMMdd'B'");
        date = null;
        obj = ((SimpleDateFormat) (obj)).parse("20121217B");
        date = ((Date) (obj));
_L2:
        return date.getTime();
        ParseException parseexception;
        parseexception;
        parseexception.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static boolean b(PackageManager packagemanager, String s)
    {
        String as[];
        int i;
        int j;
        int k;
        int l;
        boolean flag;
        try
        {
            packagemanager = packagemanager.getPackageInfo(s, 64).signatures;
        }
        // Misplaced declaration of an exception variable
        catch (PackageManager packagemanager)
        {
            return false;
        }
        if (packagemanager == null) goto _L2; else goto _L1
_L1:
        if (packagemanager.length <= 0) goto _L2; else goto _L3
_L3:
        k = packagemanager.length;
        i = 0;
          goto _L4
_L6:
        s = Utils.getMD5(packagemanager[i].toByteArray());
        as = b;
        l = as.length;
        j = 0;
          goto _L5
_L8:
        flag = as[j].equals(s);
        if (flag)
        {
            return true;
        }
        j++;
        continue; /* Loop/switch isn't completed */
_L4:
        if (i < k) goto _L6; else goto _L2
_L2:
        return false;
_L5:
        if (j < l) goto _L8; else goto _L7
_L7:
        i++;
          goto _L4
    }

    public static boolean checkTargetUidPermissionBySignature(int i, String s, PackageManager packagemanager)
        throws SecurityException
    {
        s = packagemanager.getPackagesForUid(i);
        if (s == null || s.length <= 0) goto _L2; else goto _L1
_L1:
        int j;
        j = s.length;
        i = 0;
_L5:
        if (i < j) goto _L3; else goto _L2
_L2:
        return false;
_L3:
        if (a(packagemanager, s[i]))
        {
            return true;
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static boolean ensureCallerByKey(String s, String s1)
    {
        return !TextUtils.isEmpty(s) && !TextUtils.isEmpty(s1) && s1.equals(Utils.getMD5(Utils.DES_encrypt(s, NativeManager.b)));
    }

    public static void ensureCallerPermissionByPackageName(String s, PackageManager packagemanager)
        throws SecurityException
    {
        int i = Binder.getCallingUid();
        if (i != Process.myUid()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        packagemanager = packagemanager.getPackagesForUid(i);
        if (packagemanager == null || packagemanager.length <= 0) goto _L4; else goto _L3
_L3:
        int k;
        k = packagemanager.length;
        i = 0;
_L7:
        if (i < k) goto _L5; else goto _L4
_L4:
        throw new SecurityException((new StringBuilder("Permission denied: invoke this method of the ")).append(s).append(".").toString());
_L5:
        String s1;
        String as[];
        int j;
        int l;
        s1 = packagemanager[i];
        as = c;
        l = as.length;
        j = 0;
_L9:
        if (j < l)
        {
            continue; /* Loop/switch isn't completed */
        }
        i++;
        if (true) goto _L7; else goto _L6
_L6:
        if (s1.equals(as[j])) goto _L1; else goto _L8
_L8:
        j++;
          goto _L9
    }

    public static void ensureCallerPermissionBySignature(String s, PackageManager packagemanager)
        throws SecurityException
    {
        int i = Binder.getCallingUid();
        if (i != Process.myUid()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String as[] = packagemanager.getPackagesForUid(i);
        if (as == null || as.length <= 0) goto _L4; else goto _L3
_L3:
        int j;
        j = as.length;
        i = 0;
_L6:
        if (i < j)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        throw new SecurityException((new StringBuilder("Permission denied: invoke this method of the ")).append(s).append(".").toString());
        if (a(packagemanager, as[i])) goto _L1; else goto _L5
_L5:
        i++;
          goto _L6
        if (true) goto _L1; else goto _L7
_L7:
    }

    public static void ensureCallerPermissionBySignature(String s, PackageManager packagemanager, String s1)
        throws SecurityException
    {
        int i = Binder.getCallingUid();
        if (i != Process.myUid()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String as[] = packagemanager.getPackagesForUid(i);
        if (as == null || as.length <= 0) goto _L4; else goto _L3
_L3:
        int j;
        j = as.length;
        i = 0;
_L6:
        if (i < j)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        throw new SecurityException((new StringBuilder("Permission denied: invoke this method of the ")).append(s).append(".").toString());
        if (a(packagemanager, as[i], s1)) goto _L1; else goto _L5
_L5:
        i++;
          goto _L6
        if (true) goto _L1; else goto _L7
_L7:
    }

    public static void ensureCallerPermissionBySignatureForZTE(String s, PackageManager packagemanager)
        throws SecurityException
    {
        int i = Binder.getCallingUid();
        if (i != Process.myUid()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String as[] = packagemanager.getPackagesForUid(i);
        if (as == null || as.length <= 0) goto _L4; else goto _L3
_L3:
        int j;
        j = as.length;
        i = 0;
_L6:
        if (i < j)
        {
            continue; /* Loop/switch isn't completed */
        }
_L4:
        throw new SecurityException((new StringBuilder("Permission denied: invoke this method of the ")).append(s).append(".").toString());
        if (b(packagemanager, as[i])) goto _L1; else goto _L5
_L5:
        i++;
          goto _L6
        if (true) goto _L1; else goto _L7
_L7:
    }

    public static void ensureCallerPermissionByUid(String s)
        throws SecurityException
    {
        if (Binder.getCallingUid() == Process.myUid())
        {
            return;
        } else
        {
            throw new SecurityException((new StringBuilder("Permission denied: invoke this method of the ")).append(s).append(".").toString());
        }
    }

    public static boolean isArchievePkgMySignature(String s)
    {
        String s1;
        String as[];
        int i;
        int j;
        int k;
        int l;
        boolean flag;
        try
        {
            s = a(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        if (s == null) goto _L2; else goto _L1
_L1:
        if (s.length <= 0) goto _L2; else goto _L3
_L3:
        k = s.length;
        i = 0;
          goto _L4
_L6:
        s1 = Utils.getMD5(s[i].toByteArray());
        as = a;
        l = as.length;
        j = 0;
          goto _L5
_L8:
        flag = as[j].equals(s1);
        if (flag)
        {
            return true;
        }
        j++;
        continue; /* Loop/switch isn't completed */
_L4:
        if (i < k) goto _L6; else goto _L2
_L2:
        return false;
_L5:
        if (j < l) goto _L8; else goto _L7
_L7:
        i++;
          goto _L4
    }

    public static boolean isPkgMySignature(PackageManager packagemanager, String s)
    {
        return a(packagemanager, s);
    }

}
