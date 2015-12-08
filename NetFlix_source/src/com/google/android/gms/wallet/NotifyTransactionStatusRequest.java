// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.fq;

// Referenced classes of package com.google.android.gms.wallet:
//            m

public final class NotifyTransactionStatusRequest
    implements SafeParcelable
{
    public final class Builder
    {

        final NotifyTransactionStatusRequest aci;

        public NotifyTransactionStatusRequest build()
        {
            boolean flag1 = true;
            boolean flag;
            if (!TextUtils.isEmpty(aci.abh))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            fq.b(flag, "googleTransactionId is required");
            if (aci.status >= 1 && aci.status <= 8)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            fq.b(flag, "status is an unrecognized value");
            return aci;
        }

        public Builder setDetailedReason(String s)
        {
            aci.ach = s;
            return this;
        }

        public Builder setGoogleTransactionId(String s)
        {
            aci.abh = s;
            return this;
        }

        public Builder setStatus(int i)
        {
            aci.status = i;
            return this;
        }

        private Builder()
        {
            aci = NotifyTransactionStatusRequest.this;
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


    public static final android.os.Parcelable.Creator CREATOR = new m();
    String abh;
    String ach;
    int status;
    final int xH;

    NotifyTransactionStatusRequest()
    {
        xH = 1;
    }

    NotifyTransactionStatusRequest(int i, String s, int j, String s1)
    {
        xH = i;
        abh = s;
        status = j;
        ach = s1;
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
        return ach;
    }

    public String getGoogleTransactionId()
    {
        return abh;
    }

    public int getStatus()
    {
        return status;
    }

    public int getVersionCode()
    {
        return xH;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        m.a(this, parcel, i);
    }

}
