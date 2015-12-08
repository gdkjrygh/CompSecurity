// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//            d, a

public abstract class DataBuffer
    implements Iterable
{

    protected final d jf;

    protected DataBuffer(d d1)
    {
        jf = d1;
        if (jf != null)
        {
            jf.b(this);
        }
    }

    public void close()
    {
        jf.close();
    }

    public int describeContents()
    {
        return 0;
    }

    public abstract Object get(int i);

    public int getCount()
    {
        return jf.getCount();
    }

    public boolean isClosed()
    {
        return jf.isClosed();
    }

    public Iterator iterator()
    {
        return new a(this);
    }
}
