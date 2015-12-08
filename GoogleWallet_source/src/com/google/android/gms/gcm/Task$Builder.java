// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.text.TextUtils;
import com.google.android.gms.internal.kn;

// Referenced classes of package com.google.android.gms.gcm:
//            Task

public static abstract class 
{

    protected String gcmTaskService;
    protected boolean isPersisted;
    protected String tag;
    protected boolean updateCurrent;

    protected void checkConditions()
    {
        boolean flag1 = true;
        boolean flag;
        if (!TextUtils.isEmpty(tag))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.b(flag, "Must provide a valid tag by calling setTag(String).");
        if (gcmTaskService != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        kn.b(flag, "Must provide an endpoint for this task by calling setService(ComponentName).");
    }

    public ()
    {
    }
}
