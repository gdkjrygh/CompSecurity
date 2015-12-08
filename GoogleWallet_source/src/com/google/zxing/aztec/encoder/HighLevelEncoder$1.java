// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.aztec.encoder;

import java.util.Comparator;

// Referenced classes of package com.google.zxing.aztec.encoder:
//            HighLevelEncoder, State

final class this._cls0
    implements Comparator
{

    final HighLevelEncoder this$0;

    private static int compare(State state, State state1)
    {
        return state.getBitCount() - state1.getBitCount();
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((State)obj, (State)obj1);
    }

    ()
    {
        this$0 = HighLevelEncoder.this;
        super();
    }
}
