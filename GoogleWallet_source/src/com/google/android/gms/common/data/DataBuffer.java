// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.common.api.Releasable;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder, b

public abstract class DataBuffer
    implements Releasable, Iterable
{

    protected final DataHolder mDataHolder;

    protected DataBuffer(DataHolder dataholder)
    {
        mDataHolder = dataholder;
        if (mDataHolder != null)
        {
            mDataHolder.g(this);
        }
    }

    public final void close()
    {
        release();
    }

    public abstract Object get(int i);

    public final int getCount()
    {
        if (mDataHolder == null)
        {
            return 0;
        } else
        {
            return mDataHolder.getCount();
        }
    }

    public Iterator iterator()
    {
        return new b(this);
    }

    public final void release()
    {
        if (mDataHolder != null)
        {
            mDataHolder.close();
        }
    }
}
