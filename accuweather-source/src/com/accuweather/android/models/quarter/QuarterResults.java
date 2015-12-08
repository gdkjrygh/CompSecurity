// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.quarter;

import com.accuweather.android.models.ExpirableModel;
import com.accuweather.android.utilities.IClock;
import java.io.Serializable;
import java.util.ArrayList;

public class QuarterResults extends ArrayList
    implements Serializable
{

    private ExpirableModel expirableModel;

    public QuarterResults()
    {
        expirableModel = new ExpirableModel() {

            final QuarterResults this$0;

            protected int getExpirationTimeInMinutes()
            {
                return 30;
            }

            
            {
                this$0 = QuarterResults.this;
                super();
            }
        };
    }

    public long getUpdateTime()
    {
        return expirableModel.getUpdateTime();
    }

    public final boolean isExpired(IClock iclock)
    {
        return expirableModel.isExpired(iclock);
    }

    public void setUpdateTime(long l)
    {
        expirableModel.setUpdateTime(l);
    }
}
