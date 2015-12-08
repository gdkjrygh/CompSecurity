// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import com.kohls.mcommerce.opal.wallet.rest.containers.RewardInformation;
import com.kohls.mcommerce.opal.wallet.rest.containers.TransactionInformation;
import com.kohls.mcommerce.opal.wallet.util.DateUtils;
import java.util.Comparator;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            DisplayActivityList

class this._cls0
    implements Comparator
{

    final DisplayActivityList this$0;

    private Long getTimeStamp(Object obj)
    {
        if (obj instanceof TransactionInformation)
        {
            return DateUtils.getDateInMiliSeconds(((TransactionInformation)obj).getDate());
        }
        if (obj instanceof RewardInformation)
        {
            return DateUtils.getDateInMiliSeconds(((RewardInformation)obj).getDate());
        } else
        {
            return null;
        }
    }

    public int compare(Object obj, Object obj1)
    {
        return getTimeStamp(obj1).compareTo(getTimeStamp(obj));
    }

    on()
    {
        this$0 = DisplayActivityList.this;
        super();
    }
}
