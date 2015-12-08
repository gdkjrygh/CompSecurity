// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.mdm.internal;

import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.mdm.internal:
//            DeviceManagerClientImpl, DeviceInfo

final class val.statusCode
    implements com.google.android.gms.mdm.lbacks._cls1
{

    final val.statusCode this$0;
    final DeviceInfo val$info;
    final int val$statusCode;

    public final String getModel()
    {
        if (val$info == null)
        {
            return null;
        } else
        {
            return val$info.mModelName;
        }
    }

    public final String getName()
    {
        if (val$info == null)
        {
            return null;
        } else
        {
            return val$info.mNickname;
        }
    }

    public final Status getStatus()
    {
        return new Status(val$statusCode);
    }

    ()
    {
        this$0 = final_;
        val$info = deviceinfo;
        val$statusCode = I.this;
        super();
    }
}
