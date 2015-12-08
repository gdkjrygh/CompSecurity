// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.api.Releasable;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder, c, h

public abstract class DataBuffer
    implements Releasable, Iterable
{

    protected final DataHolder JG;

    protected DataBuffer(DataHolder dataholder)
    {
        JG = dataholder;
        if (JG != null)
        {
            JG.e(this);
        }
    }

    public final void close()
    {
        release();
    }

    public int describeContents()
    {
        return 0;
    }

    public Bundle gV()
    {
        return JG.gV();
    }

    public abstract Object get(int i);

    public int getCount()
    {
        if (JG == null)
        {
            return 0;
        } else
        {
            return JG.getCount();
        }
    }

    public boolean isClosed()
    {
        if (JG == null)
        {
            return true;
        } else
        {
            return JG.isClosed();
        }
    }

    public Iterator iterator()
    {
        return new c(this);
    }

    public void release()
    {
        if (JG != null)
        {
            JG.close();
        }
    }

    public Iterator singleRefIterator()
    {
        return new h(this);
    }
}
