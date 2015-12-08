// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import android.location.Location;
import com.urbanairship.Logger;

// Referenced classes of package com.urbanairship.location:
//            StandardLocationAdapter

class <init> extends <init>
{

    final this._cls1 this$1;
    final StandardLocationAdapter val$this$0;

    public void onLocationChanged(Location location)
    {
        cess._mth200(this._cls1.this);
        tResult(location);
    }

    public void onProviderDisabled(String s)
    {
        Logger.verbose((new StringBuilder()).append("Standard Android location provider disabled: ").append(s).toString());
        this;
        JVM INSTR monitorenter ;
        if (!Done())
        {
            cess._mth300(this._cls1.this);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    ()
    {
        this$1 = final_;
        val$this$0 = StandardLocationAdapter.this;
        super(null);
    }
}
