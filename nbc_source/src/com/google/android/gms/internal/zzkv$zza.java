// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Iterator;

// Referenced classes of package com.google.android.gms.internal:
//            zzkv

final class etSize
    implements Iterator
{

    boolean mCanRemove;
    int mIndex;
    final int mOffset;
    int mSize;
    final zzkv zzabx;

    public boolean hasNext()
    {
        return mIndex < mSize;
    }

    public Object next()
    {
        Object obj = zzabx.colGetEntry(mIndex, mOffset);
        mIndex = mIndex + 1;
        mCanRemove = true;
        return obj;
    }

    public void remove()
    {
        if (!mCanRemove)
        {
            throw new IllegalStateException();
        } else
        {
            mIndex = mIndex - 1;
            mSize = mSize - 1;
            mCanRemove = false;
            zzabx.colRemoveAt(mIndex);
            return;
        }
    }

    (zzkv zzkv1, int i)
    {
        zzabx = zzkv1;
        super();
        mCanRemove = false;
        mOffset = i;
        mSize = zzkv1.colGetSize();
    }
}
