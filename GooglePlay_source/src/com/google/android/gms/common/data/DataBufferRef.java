// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.database.CharArrayBuffer;
import android.database.CursorWindow;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.data:
//            DataHolder

public abstract class DataBufferRef
{

    public final DataHolder mDataHolder;
    public int mDataRow;
    private int mWindowIndex;

    public DataBufferRef(DataHolder dataholder, int i)
    {
        mDataHolder = (DataHolder)Preconditions.checkNotNull(dataholder);
        setDataRow(i);
    }

    public final void copyToBuffer(String s, CharArrayBuffer chararraybuffer)
    {
        DataHolder dataholder = mDataHolder;
        int i = mDataRow;
        int j = mWindowIndex;
        dataholder.checkColumnAndRow(s, i);
        dataholder.mWindows[j].copyStringToBuffer(i, dataholder.mColumnBundle.getInt(s), chararraybuffer);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof DataBufferRef)
        {
            obj = (DataBufferRef)obj;
            flag = flag1;
            if (Objects.equal(Integer.valueOf(((DataBufferRef) (obj)).mDataRow), Integer.valueOf(mDataRow)))
            {
                flag = flag1;
                if (Objects.equal(Integer.valueOf(((DataBufferRef) (obj)).mWindowIndex), Integer.valueOf(mWindowIndex)))
                {
                    flag = flag1;
                    if (((DataBufferRef) (obj)).mDataHolder == mDataHolder)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public final boolean getBoolean(String s)
    {
        return mDataHolder.getBoolean(s, mDataRow, mWindowIndex);
    }

    public final byte[] getByteArray(String s)
    {
        DataHolder dataholder = mDataHolder;
        int i = mDataRow;
        int j = mWindowIndex;
        dataholder.checkColumnAndRow(s, i);
        return dataholder.mWindows[j].getBlob(i, dataholder.mColumnBundle.getInt(s));
    }

    public final float getFloat(String s)
    {
        DataHolder dataholder = mDataHolder;
        int i = mDataRow;
        int j = mWindowIndex;
        dataholder.checkColumnAndRow(s, i);
        return dataholder.mWindows[j].getFloat(i, dataholder.mColumnBundle.getInt(s));
    }

    public final int getInteger(String s)
    {
        return mDataHolder.getInteger(s, mDataRow, mWindowIndex);
    }

    public final long getLong(String s)
    {
        return mDataHolder.getLong(s, mDataRow, mWindowIndex);
    }

    public final String getString(String s)
    {
        return mDataHolder.getString(s, mDataRow, mWindowIndex);
    }

    public final boolean hasColumn(String s)
    {
        return mDataHolder.hasColumn(s);
    }

    public final boolean hasNull(String s)
    {
        return mDataHolder.hasNull(s, mDataRow, mWindowIndex);
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(mDataRow), Integer.valueOf(mWindowIndex), mDataHolder
        });
    }

    public final boolean isDataValid()
    {
        return !mDataHolder.isClosed();
    }

    public final Uri parseUri(String s)
    {
        s = mDataHolder.getString(s, mDataRow, mWindowIndex);
        if (s == null)
        {
            return null;
        } else
        {
            return Uri.parse(s);
        }
    }

    protected final void setDataRow(int i)
    {
        boolean flag;
        if (i >= 0 && i < mDataHolder.mRowCount)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        mDataRow = i;
        mWindowIndex = mDataHolder.getWindowIndex(mDataRow);
    }
}
