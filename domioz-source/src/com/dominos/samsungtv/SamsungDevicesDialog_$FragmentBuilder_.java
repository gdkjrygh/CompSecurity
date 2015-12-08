// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.samsungtv;

import android.os.Bundle;
import java.util.ArrayList;
import org.androidannotations.api.a.d;

// Referenced classes of package com.dominos.samsungtv:
//            SamsungDevicesDialog_, SamsungDevicesDialog

public class  extends d
{

    public SamsungDevicesDialog build()
    {
        SamsungDevicesDialog_ samsungdevicesdialog_ = new SamsungDevicesDialog_();
        samsungdevicesdialog_.setArguments(args);
        return samsungdevicesdialog_;
    }

    public volatile Object build()
    {
        return build();
    }

    public build mDeviceList(ArrayList arraylist)
    {
        args.putSerializable("mDeviceList", arraylist);
        return this;
    }

    public args mFirstTime(boolean flag)
    {
        args.putBoolean("mFirstTime", flag);
        return this;
    }

    public ()
    {
    }
}
