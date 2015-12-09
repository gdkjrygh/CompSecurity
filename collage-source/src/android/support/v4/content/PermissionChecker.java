// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.content;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import android.support.v4.app.AppOpsManagerCompat;
import java.lang.annotation.Annotation;

public final class PermissionChecker
{
    public static interface PermissionResult
        extends Annotation
    {
    }


    public static final int PERMISSION_DENIED = -1;
    public static final int PERMISSION_DENIED_APP_OP = -2;
    public static final int PERMISSION_GRANTED = 0;

    private PermissionChecker()
    {
    }

    public static int checkCallingOrSelfPermission(Context context, String s)
    {
        String s1;
        if (Binder.getCallingPid() == Process.myPid())
        {
            s1 = context.getPackageName();
        } else
        {
            s1 = null;
        }
        return checkPermission(context, s, Binder.getCallingPid(), Binder.getCallingUid(), s1);
    }

    public static int checkCallingPermission(Context context, String s, String s1)
    {
        if (Binder.getCallingPid() == Process.myPid())
        {
            return -1;
        } else
        {
            return checkPermission(context, s, Binder.getCallingPid(), Binder.getCallingUid(), s1);
        }
    }

    public static int checkPermission(Context context, String s, int i, int j, String s1)
    {
        if (context.checkPermission(s, i, j) != -1) goto _L2; else goto _L1
_L1:
        return -1;
_L2:
        String s2;
        s2 = AppOpsManagerCompat.permissionToOp(s);
        if (s2 == null)
        {
            return 0;
        }
        s = s1;
        if (s1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        s = context.getPackageManager().getPackagesForUid(j);
        if (s == null || s.length <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        s = s[0];
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        return AppOpsManagerCompat.noteProxyOp(context, s2, s) == 0 ? 0 : -2;
    }

    public static int checkSelfPermission(Context context, String s)
    {
        return checkPermission(context, s, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
