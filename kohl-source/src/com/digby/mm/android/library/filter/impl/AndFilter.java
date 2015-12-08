// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.filter.impl;

import com.digby.mm.android.library.filter.IFilter;
import com.digby.mm.android.library.utils.Logger;

public class AndFilter
    implements IFilter
{

    IFilter mFilters[];

    public transient AndFilter(IFilter aifilter[])
    {
        mFilters = aifilter;
    }

    public boolean matches(Object obj)
    {
        boolean flag = true;
        int i = 0;
        do
        {
label0:
            {
label1:
                {
                    boolean flag1 = flag;
                    try
                    {
                        if (i >= mFilters.length)
                        {
                            break label1;
                        }
                        flag1 = mFilters[i].matches(obj);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj)
                    {
                        Logger.Error("AndFilter_matches", ((Exception) (obj)));
                        return flag;
                    }
                    flag = flag1;
                    if (flag)
                    {
                        break label0;
                    }
                    flag1 = flag;
                }
                return flag1;
            }
            i++;
        } while (true);
    }
}
