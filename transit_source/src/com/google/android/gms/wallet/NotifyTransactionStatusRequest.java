// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.dm;

// Referenced classes of package com.google.android.gms.wallet:
//            i

public class NotifyTransactionStatusRequest
    implements SafeParcelable
{
    public final class Builder
    {

        final NotifyTransactionStatusRequest uk;

        public NotifyTransactionStatusRequest build()
        {
            boolean flag1 = true;
            boolean flag;
            if (!TextUtils.isEmpty(uk.tH))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            dm.b(flag, "googleTransactionId is required");
            if (uk.status >= 1 && uk.status <= 8)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            dm.b(flag, "status is an unrecognized value");
            return uk;
        }

        public Builder setDetailedReason(String s)
        {
            uk.uj = s;
            return this;
        }

        public Builder setGoogleTransactionId(String s)
        {
            uk.tH = s;
            return this;
        }

        public Builder setStatus(int j)
        {
            uk.status = j;
            return this;
        }

        private Builder()
        {
            uk = NotifyTransactionStatusRequest.this;
            super();
        }

    }

    public static interface Status
    {

        public static final int SUCCESS = 1;
    }

    public static interface Status.Error
    {

        public static final int AVS_DECLINE = 7;
        public static final int BAD_CARD = 4;
        public static final int BAD_CVC = 3;
        public static final int DECLINED = 5;
        public static final int FRAUD_DECLINE = 8;
        public static final int OTHER = 6;
        public static final int UNKNOWN = 2;
    }


    public static final android.os.Parcelable.Creator CREATOR = new i();
    final int iM;
    int status;
    String tH;
    String uj;

    public NotifyTransactionStatusRequest()
    {
        iM = 1;
    }

    NotifyTransactionStatusRequest(int j, String s, int k, String s1)
    {
        iM = j;
        tH = s;
        status = k;
        uj = s1;
    }

    public static Builder newBuilder()
    {
        NotifyTransactionStatusRequest notifytransactionstatusrequest = new NotifyTransactionStatusRequest();
        notifytransactionstatusrequest.getClass();
        return notifytransactionstatusrequest. new Builder();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getDetailedReason()
    {
        return uj;
    }

    public String getGoogleTransactionId()
    {
        return tH;
    }

    public int getStatus()
    {
        return status;
    }

    public int getVersionCode()
    {
        return iM;
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        i.a(this, parcel, j);
    }

}
