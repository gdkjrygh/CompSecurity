// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder, a

public abstract class DataBuffer
    implements Iterable
{

    protected final DataHolder BB;

    protected DataBuffer(DataHolder dataholder)
    {
        BB = dataholder;
        if (BB != null)
        {
            BB.c(this);
        }
    }

    public void close()
    {
        if (BB != null)
        {
            BB.close();
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public abstract Object get(int i);

    public int getCount()
    {
        if (BB == null)
        {
            return 0;
        } else
        {
            return BB.getCount();
        }
    }

    public Bundle getMetadata()
    {
        return BB.getMetadata();
    }

    public boolean isClosed()
    {
        if (BB == null)
        {
            return true;
        } else
        {
            return BB.isClosed();
        }
    }

    public Iterator iterator()
    {
        return new a(this);
    }
}
