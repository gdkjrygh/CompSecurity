// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.view;

import java.util.ArrayList;

// Referenced classes of package com.nineoldandroids.view:
//            ViewPropertyAnimatorHC

private static class mNameValuesHolder
{

    ArrayList mNameValuesHolder;
    int mPropertyMask;

    boolean cancel(int i)
    {
        if ((mPropertyMask & i) != 0 && mNameValuesHolder != null)
        {
            int k = mNameValuesHolder.size();
            for (int j = 0; j < k; j++)
            {
                if (((r)mNameValuesHolder.get(j)).mNameConstant == i)
                {
                    mNameValuesHolder.remove(j);
                    mPropertyMask = mPropertyMask & ~i;
                    return true;
                }
            }

        }
        return false;
    }

    r(int i, ArrayList arraylist)
    {
        mPropertyMask = i;
        mNameValuesHolder = arraylist;
    }
}
