// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import java.util.Comparator;

// Referenced classes of package com.akamai.android.analytics:
//            StateTimer, MyPair

class this._cls0
    implements Comparator
{

    final StateTimer this$0;

    public int compare(MyPair mypair, MyPair mypair1)
    {
        return ((Integer)mypair.second).compareTo((Integer)mypair1.second);
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((MyPair)obj, (MyPair)obj1);
    }

    ()
    {
        this$0 = StateTimer.this;
        super();
    }
}
