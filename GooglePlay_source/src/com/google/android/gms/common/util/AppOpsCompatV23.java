// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import android.app.AppOpsManager;
import android.content.Context;

// Referenced classes of package com.google.android.gms.common.util:
//            AppOpsCompatV19

public final class AppOpsCompatV23 extends AppOpsCompatV19
{

    AppOpsCompatV23(Context context)
    {
        super(context);
    }

    public final String permissionToOp(String s)
    {
        return AppOpsManager.permissionToOp(s);
    }
}
