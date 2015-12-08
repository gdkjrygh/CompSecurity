// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.stateful;


// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2.stateful:
//            StatefulPlayerValue

public class mUpdateCounter
{

    private int mUpdateCounter;
    final StatefulPlayerValue this$0;

    public boolean tryComplete()
    {
        if (StatefulPlayerValue.access$000(StatefulPlayerValue.this) != mUpdateCounter)
        {
            return false;
        } else
        {
            StatefulPlayerValue.access$002(StatefulPlayerValue.this, 0);
            return true;
        }
    }

    public Y()
    {
        this$0 = StatefulPlayerValue.this;
        super();
        mUpdateCounter = StatefulPlayerValue.access$000(StatefulPlayerValue.this);
    }
}
