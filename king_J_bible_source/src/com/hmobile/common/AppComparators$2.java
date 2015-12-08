// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.common;

import com.hmobile.model.LikeShareInfo;
import java.util.Comparator;

// Referenced classes of package com.hmobile.common:
//            AppComparators

class this._cls0
    implements Comparator
{

    final AppComparators this$0;

    public int compare(LikeShareInfo likeshareinfo, LikeShareInfo likeshareinfo1)
    {
        int i = likeshareinfo.shares;
        int j = likeshareinfo1.shares;
        if (i == j)
        {
            return 0;
        }
        return i <= j ? 1 : -1;
    }

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((LikeShareInfo)obj, (LikeShareInfo)obj1);
    }

    ()
    {
        this$0 = AppComparators.this;
        super();
    }
}
