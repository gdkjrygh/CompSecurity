// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.permission;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Process;
import com.google.android.gms.common.app.GmsApplicationContext;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AppOpsCompat;
import com.google.android.gms.common.util.PlatformVersion;

public final class PermissionChecker
{

    public static final PermissionChecker GMS_PERMISSION_CHECKER;
    private final AppOpsCompat mAppOps;
    private final ClientContext mClientContext;
    private final Context mContext;

    private PermissionChecker(Context context, ClientContext clientcontext)
    {
        this(AppOpsCompat.create(context), context, clientcontext);
    }

    private PermissionChecker(AppOpsCompat appopscompat, Context context, ClientContext clientcontext)
    {
        mAppOps = (AppOpsCompat)Preconditions.checkNotNull(appopscompat);
        mContext = (Context)Preconditions.checkNotNull(context);
        mClientContext = (ClientContext)Preconditions.checkNotNull(clientcontext);
        boolean flag;
        if (mClientContext.mCallingUid >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Calling UID is not available.");
        Preconditions.checkNotNull(mClientContext.mCallingPackageName, "Calling package name is not available.");
    }

    public static PermissionChecker createInstance(Context context, ClientContext clientcontext)
    {
        return new PermissionChecker(context, clientcontext);
    }

    public final int checkPermission(String s)
    {
        boolean flag = true;
        String s1 = mClientContext.mCallingPackageName;
        byte byte0;
        if (mContext.getPackageManager().checkPermission(s, s1) == -1)
        {
            byte0 = 3;
        } else
        {
            int i = mClientContext.mCallingUid;
            byte0 = flag;
            if (PlatformVersion.checkVersion(23))
            {
                s = mAppOps.permissionToOp(s);
                byte0 = flag;
                if (s != null)
                {
                    byte0 = flag;
                    if (mAppOps.noteOpNoThrow(s, i, s1) != 0)
                    {
                        return 2;
                    }
                }
            }
        }
        return byte0;
    }

    static 
    {
        ClientContext clientcontext = new ClientContext();
        clientcontext.mCallingUid = Process.myUid();
        clientcontext.mCallingPackageName = "com.google.android.gms";
        GMS_PERMISSION_CHECKER = createInstance(GmsApplicationContext.getInstance(), clientcontext);
    }
}
