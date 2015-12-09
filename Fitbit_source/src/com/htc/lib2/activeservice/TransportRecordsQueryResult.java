// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.activeservice;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

// Referenced classes of package com.htc.lib2.activeservice:
//            TransportModeRecord

public class TransportRecordsQueryResult
    implements Parcelable
{

    protected static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final int MAX_NUMBER_QUERY_TRANSPORT_RECORDS = 1000;
    public static final int STATUS_COMPLETE_RECORDS = 1;
    public static final int STATUS_INCOMPLETE_RECORDS = 2;
    public static final int STATUS_SERVICE_DISCONNECTED = 0;
    private ArrayList records;
    private int status;

    public TransportRecordsQueryResult(int i, ArrayList arraylist)
    {
        status = i;
        if (arraylist != null)
        {
            records = arraylist;
            return;
        } else
        {
            records = null;
            return;
        }
    }

    TransportRecordsQueryResult(Parcel parcel)
    {
        status = parcel.readInt();
        records = parcel.readArrayList(com/htc/lib2/activeservice/TransportModeRecord.getClassLoader());
    }

    public int describeContents()
    {
        return 0;
    }

    public ArrayList getRecords()
    {
        return records;
    }

    public int getStatus()
    {
        return status;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(status);
        parcel.writeList(records);
    }


    /* member class not found */
    class _cls1 {}

}
