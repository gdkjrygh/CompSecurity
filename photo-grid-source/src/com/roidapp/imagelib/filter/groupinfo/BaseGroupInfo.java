// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter.groupinfo;

import android.os.Parcel;
import com.roidapp.imagelib.filter.filterinfo.IFilterInfo;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.roidapp.imagelib.filter.groupinfo:
//            IGroupInfo

public abstract class BaseGroupInfo
    implements IGroupInfo
{

    protected IFilterInfo a[];
    private long b;
    private IFilterInfo c;

    public BaseGroupInfo(long l)
    {
        b = l;
    }

    public BaseGroupInfo(Parcel parcel)
    {
        b = parcel.readLong();
        c = (IFilterInfo)parcel.readParcelable(com/roidapp/imagelib/filter/filterinfo/IFilterInfo.getClassLoader());
        parcel = parcel.readParcelableArray(com/roidapp/imagelib/filter/filterinfo/IFilterInfo.getClassLoader());
        if (parcel != null)
        {
            a = (IFilterInfo[])Arrays.copyOf(parcel, parcel.length, [Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;);
        }
    }

    public final IFilterInfo a()
    {
        return c;
    }

    public final IFilterInfo a(int i)
    {
        return a[i];
    }

    public final void a(IFilterInfo ifilterinfo)
    {
        c = ifilterinfo;
    }

    public final void a(IFilterInfo aifilterinfo[])
    {
        a = aifilterinfo;
    }

    public final int b()
    {
        if (c != null && a != null)
        {
            int j = a.length;
            for (int i = 0; i < j; i++)
            {
                if (a[i].c() == c.c())
                {
                    return i;
                }
            }

        }
        return 0;
    }

    public final long c()
    {
        return b;
    }

    public final List d()
    {
        if (a != null)
        {
            return Arrays.asList(a);
        } else
        {
            return null;
        }
    }

    public final int e()
    {
        if (a != null)
        {
            return a.length;
        } else
        {
            return -1;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(b);
        parcel.writeParcelable(c, i);
        parcel.writeParcelableArray(a, i);
    }
}
