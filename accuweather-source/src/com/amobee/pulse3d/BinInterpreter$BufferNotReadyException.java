// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


// Referenced classes of package com.amobee.pulse3d:
//            BinInterpreter

public class this._cls0 extends Exception
{

    final BinInterpreter this$0;

    public String getMessage()
    {
        return "Buffer is not ready for reading, you can't request access to it. You can callisReady method to know the status of the buffer";
    }

    public ()
    {
        this$0 = BinInterpreter.this;
        super();
    }
}
