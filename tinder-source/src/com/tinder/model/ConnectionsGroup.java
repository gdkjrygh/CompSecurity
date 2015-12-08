// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.tinder.model:
//            CommonConnection

public class ConnectionsGroup
    implements Parcelable, Serializable
{
    private static class DegreeComparator
        implements Comparator
    {

        public int compare(CommonConnection commonconnection, CommonConnection commonconnection1)
        {
            int i = commonconnection.degree;
            int j = commonconnection1.degree;
            if (i > j)
            {
                return 1;
            }
            return i != j ? -1 : 0;
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((CommonConnection)obj, (CommonConnection)obj1);
        }

        private DegreeComparator()
        {
        }

    }


    private static final DegreeComparator COMPARATOR = new DegreeComparator();
    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final ConnectionsGroup createFromParcel(Parcel parcel)
        {
            return new ConnectionsGroup(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final ConnectionsGroup[] newArray(int i)
        {
            return new ConnectionsGroup[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private List mCompleteCxns;
    private boolean mIgnoreUnbuilt;
    private HashMap mUnbuiltCxns;

    protected ConnectionsGroup(Parcel parcel)
    {
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mIgnoreUnbuilt = flag;
        mCompleteCxns = new ArrayList();
        parcel.readList(mCompleteCxns, java/util/List.getClassLoader());
        mUnbuiltCxns = (HashMap)parcel.readSerializable();
    }

    public ConnectionsGroup(List list, List list1)
    {
        mCompleteCxns = list;
        mUnbuiltCxns = new HashMap();
        buildMap(list1);
        sort();
    }

    private void buildMap(List list)
    {
        CommonConnection commonconnection;
        for (list = list.iterator(); list.hasNext(); mUnbuiltCxns.put(commonconnection.id, commonconnection))
        {
            commonconnection = (CommonConnection)list.next();
        }

    }

    public int describeContents()
    {
        return 0;
    }

    public void fillIn(List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            CommonConnection commonconnection = (CommonConnection)list.next();
            String s = commonconnection.id;
            if (mUnbuiltCxns.containsKey(s))
            {
                mUnbuiltCxns.remove(s);
                mCompleteCxns.add(commonconnection);
            }
        } while (true);
        sort();
    }

    public List getCompleteConnections()
    {
        return mCompleteCxns;
    }

    public int getDegreeCount(int i)
    {
        int j;
        if (mCompleteCxns != null)
        {
            Iterator iterator = mCompleteCxns.iterator();
            int k = 0;
            do
            {
                j = k;
                if (!iterator.hasNext())
                {
                    break;
                }
                if (((CommonConnection)iterator.next()).degree == i)
                {
                    j = 1;
                } else
                {
                    j = 0;
                }
                k = j + k;
            } while (true);
        } else
        {
            j = 0;
        }
        int l = j;
        if (!mUnbuiltCxns.isEmpty())
        {
            Iterator iterator1 = mUnbuiltCxns.values().iterator();
            do
            {
                l = j;
                if (!iterator1.hasNext())
                {
                    break;
                }
                if (((CommonConnection)iterator1.next()).degree == i)
                {
                    l = 1;
                } else
                {
                    l = 0;
                }
                j += l;
            } while (true);
        }
        return l;
    }

    public boolean getIgnoreUnresolvableIds()
    {
        return mIgnoreUnbuilt;
    }

    public Map getUnbuiltConnections()
    {
        return mUnbuiltCxns;
    }

    public List getUnbuiltIds()
    {
        String as[] = new String[mUnbuiltCxns.size()];
        return Arrays.asList(mUnbuiltCxns.keySet().toArray(as));
    }

    public boolean needsFill()
    {
        return !mIgnoreUnbuilt && mUnbuiltCxns.size() > 0;
    }

    public void setIgnoreUnresolvableIds(boolean flag)
    {
        mIgnoreUnbuilt = flag;
    }

    public int size()
    {
        return mUnbuiltCxns.size() + mCompleteCxns.size();
    }

    public void sort()
    {
        Collections.sort(mCompleteCxns, COMPARATOR);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        byte byte0;
        if (mIgnoreUnbuilt)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        parcel.writeList(mCompleteCxns);
        parcel.writeSerializable(mUnbuiltCxns);
    }

}
