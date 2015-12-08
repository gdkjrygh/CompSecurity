// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.permission;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import com.google.android.gms.common.app.GmsApplicationContext;
import com.google.android.gms.common.util.CollectionUtils;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class PermissionUtils
{

    private static final Map GROUP_NAME_MAP = CollectionUtils.mapOfKeyValueArrays(new String[] {
        "android.permission-group.SENSORS", "android.permission-group.CALENDAR", "android.permission-group.CAMERA", "android.permission-group.CONTACTS", "android.permission-group.MICROPHONE", "android.permission-group.PHONE", "android.permission-group.SMS", "android.permission-group.STORAGE"
    }, new Integer[] {
        Integer.valueOf(0x7f100332), Integer.valueOf(0x7f10032c), Integer.valueOf(0x7f10032d), Integer.valueOf(0x7f10032e), Integer.valueOf(0x7f100330), Integer.valueOf(0x7f100331), Integer.valueOf(0x7f100333), Integer.valueOf(0x7f100334)
    });
    private static final PermissionUtils INSTANCE = new PermissionUtils();
    private static final Map PERMISSION_MAP = CollectionUtils.mapOfKeyValueArrays(new String[] {
        "android.permission-group.SENSORS", "android.permission-group.CALENDAR", "android.permission-group.CAMERA", "android.permission-group.CONTACTS", "android.permission-group.MICROPHONE", "android.permission-group.PHONE", "android.permission-group.SMS", "android.permission-group.STORAGE"
    }, new String[] {
        "android.permission.BODY_SENSORS", "android.permission.READ_CALENDAR", "android.permission.CAMERA", "android.permission.READ_CONTACTS", "android.permission.RECORD_AUDIO", "android.permission.READ_PHONE_STATE", "android.permission.SEND_SMS", "android.permission.READ_EXTERNAL_STORAGE"
    });
    private volatile Set mMissingPermGroups;

    private PermissionUtils()
    {
        mMissingPermGroups = null;
    }

    public static Set getAllPermissionGroups()
    {
        return PERMISSION_MAP.keySet();
    }

    public static PermissionUtils getInstance()
    {
        return INSTANCE;
    }

    public static PendingIntent getRecoverPermissionIntent(Context context, Set set)
    {
        return PendingIntent.getActivity(context, 0, (new Intent("com.google.android.gms.RECOVER_PERMISSION")).putStringArrayListExtra("requiredGroups", new ArrayList(set)), 0x8000000);
    }

    public final Set getMissingPermissionGroups()
    {
        Object obj;
        Set set;
        set = mMissingPermGroups;
        obj = set;
        if (set != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        set = mMissingPermGroups;
        obj = set;
        if (set != null)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        obj = new HashSet();
        GmsApplicationContext gmsapplicationcontext = GmsApplicationContext.getInstance();
        if (PlatformVersion.checkVersion(23))
        {
            Iterator iterator = PERMISSION_MAP.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (gmsapplicationcontext.checkSelfPermission((String)entry.getValue()) == -1)
                {
                    ((HashSet) (obj)).add(entry.getKey());
                }
            } while (true);
        }
        break MISSING_BLOCK_LABEL_116;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        obj = Collections.unmodifiableSet(((Set) (obj)));
        mMissingPermGroups = ((Set) (obj));
        this;
        JVM INSTR monitorexit ;
_L2:
        return ((Set) (obj));
    }

    public final void resetMissingPermissionGroups()
    {
        this;
        JVM INSTR monitorenter ;
        mMissingPermGroups = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }


    // Unreferenced inner class com/google/android/gms/common/permission/PermissionUtils$1

/* anonymous class */
    public final class _cls1
        implements android.content.pm.PackageManager.OnPermissionsChangedListener
    {

        final PermissionUtils this$0;

        public final void onPermissionsChanged(int i)
        {
            if (Process.myUid() == i)
            {
                resetMissingPermissionGroups();
            }
        }

            public 
            {
                this$0 = PermissionUtils.this;
                super();
            }
    }

}
