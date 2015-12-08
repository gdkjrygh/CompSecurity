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

    protected final DataHolder II;

    protected DataBuffer(DataHolder dataholder)
    {
        II = dataholder;
        if (II != null)
        {
            II.e(this);
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

    public abstract Object get(int i);

    public int getCount()
    {
        if (II == null)
        {
            return 0;
        } else
        {
            return II.getCount();
        }
    }

    public Bundle gy()
    {
        return II.gy();
    }

    public boolean isClosed()
    {
        if (II == null)
        {
            return true;
        } else
        {
            return II.isClosed();
        }
    }

    public Iterator iterator()
    {
        return new c(this);
    }

    public void release()
    {
        if (II != null)
        {
            II.close();
        }
    }

    public Iterator singleRefIterator()
    {
        return new h(this);
    }
}
