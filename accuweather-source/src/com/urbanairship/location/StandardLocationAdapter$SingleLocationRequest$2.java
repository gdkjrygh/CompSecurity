// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.location;

import com.urbanairship.Logger;

// Referenced classes of package com.urbanairship.location:
//            StandardLocationAdapter, LocationRequestOptions

class <init> extends <init>
{

    final this._cls1 this$1;
    final LocationRequestOptions val$options;
    final StandardLocationAdapter val$this$0;

    public void onProviderEnabled(String s)
    {
        Logger.verbose((new StringBuilder()).append("Standard Android location provider enabled: ").append(s).toString());
        this;
        JVM INSTR monitorenter ;
        if (Done())
        {
            break MISSING_BLOCK_LABEL_81;
        }
        s = StandardLocationAdapter.access$500(_fld0, cess._mth400(this._cls1.this), val$options);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_81;
        }
        if (!s.equals(cess._mth600(this._cls1.this)))
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
        val$this$0 = standardlocationadapter;
        val$options = LocationRequestOptions.this;
        super(null);
    }
}
