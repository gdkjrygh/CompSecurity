// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.response;

import java.util.Comparator;

// Referenced classes of package com.auditude.ads.response:
//            VMAPParser, VMAPAdBreak

public class this._cls0
    implements Comparator
{

    final VMAPParser this$0;

    public int compare(VMAPAdBreak vmapadbreak, VMAPAdBreak vmapadbreak1)
    {
        return vmapadbreak.getStartTime() - vmapadbreak1.getStartTime();
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((VMAPAdBreak)obj, (VMAPAdBreak)obj1);
    }

    public ()
    {
        this$0 = VMAPParser.this;
        super();
    }
}
