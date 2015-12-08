// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.filter.impl;

import com.digby.mm.android.library.filter.IFilter;
import com.digby.mm.android.library.geofence.IGeoFence;

public class ValidEventsFilter
    implements IFilter
{

    private Class mEventTypes[];

    public transient ValidEventsFilter(Class aclass[])
    {
        mEventTypes = aclass;
    }

    public boolean matches(IGeoFence igeofence)
    {
        boolean flag1 = true;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < mEventTypes.length)
                {
                    if (igeofence.isValidEventType(mEventTypes[i]))
                    {
                        break label0;
                    }
                    flag = false;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    public volatile boolean matches(Object obj)
    {
        return matches((IGeoFence)obj);
    }
}
