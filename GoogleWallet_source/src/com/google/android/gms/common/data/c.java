// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.internal.kl;
import com.google.android.gms.internal.kn;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public abstract class c
{

    protected int TX;
    private int TY;
    protected final DataHolder mDataHolder;

    public c(DataHolder dataholder, int i)
    {
        mDataHolder = (DataHolder)kn.k(dataholder);
        cV(i);
    }

    private void cV(int i)
    {
        boolean flag;
        if (i >= 0 && i < mDataHolder.getCount())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        kn.K(flag);
        TX = i;
        TY = mDataHolder.cW(TX);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof c)
        {
            obj = (c)obj;
            flag = flag1;
            if (kl.equal(Integer.valueOf(((c) (obj)).TX), Integer.valueOf(TX)))
            {
                flag = flag1;
                if (kl.equal(Integer.valueOf(((c) (obj)).TY), Integer.valueOf(TY)))
                {
                    flag = flag1;
                    if (((c) (obj)).mDataHolder == mDataHolder)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    protected final String getString(String s)
    {
        return mDataHolder.c(s, TX, TY);
    }

    public int hashCode()
    {
        return kl.hashCode(new Object[] {
            Integer.valueOf(TX), Integer.valueOf(TY), mDataHolder
        });
    }
}
