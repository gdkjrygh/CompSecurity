// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.scanner;


// Referenced classes of package com.dominos.beacon.scanner:
//            BeaconScanner

class this._cls0
    implements Runnable
{

    final BeaconScanner this$0;

    public void run()
    {
        stop();
        if (BeaconScanner.access$000(BeaconScanner.this) != null)
        {
            BeaconScanner.access$000(BeaconScanner.this).onScanFinished();
        }
    }

    BeaconListener()
    {
        this$0 = BeaconScanner.this;
        super();
    }
}
