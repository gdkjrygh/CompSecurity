// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.permission;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import android.support.v4.app.d;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.util.permission:
//            Permission

public class PermissionUtil
{

    protected static final Logger c = Logger.getLogger("Permission");
    private Context a;

    public PermissionUtil(Context context)
    {
        a = context;
    }

    protected static boolean a()
    {
        return android.os.Build.VERSION.SDK_INT >= 23;
    }

    public final boolean a(Permission permission)
    {
        boolean flag = true;
        if (a())
        {
            flag = b(permission);
        }
        return flag;
    }

    public final boolean a(Set set)
    {
        boolean flag;
label0:
        {
            boolean flag1 = true;
            flag = flag1;
            if (!a())
            {
                break label0;
            }
            set = set.iterator();
            do
            {
                flag = flag1;
                if (!set.hasNext())
                {
                    break label0;
                }
            } while (b((Permission)set.next()));
            flag = false;
        }
        return flag;
    }

    protected final boolean b(Permission permission)
    {
        Context context;
        String s1;
        int i;
        context = a;
        permission = permission.a();
        i = Process.myPid();
        int j = Process.myUid();
        String s = context.getPackageName();
        if (context.checkPermission(permission, i, j) == -1)
        {
            i = -1;
        } else
        {
label0:
            {
                s1 = d.a(permission);
                if (s1 == null)
                {
                    break MISSING_BLOCK_LABEL_111;
                }
                permission = s;
                if (s != null)
                {
                    break MISSING_BLOCK_LABEL_94;
                }
                permission = context.getPackageManager().getPackagesForUid(j);
                if (permission != null && permission.length > 0)
                {
                    break label0;
                }
                i = -1;
            }
        }
_L1:
        return i == 0;
        permission = permission[0];
        if (d.a(context, s1, permission) == 0)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        i = -2;
          goto _L1
        i = 0;
          goto _L1
    }

}
