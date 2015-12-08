// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.hm;

// Referenced classes of package com.google.android.gms.wallet:
//            m

public final class NotifyTransactionStatusRequest
    implements SafeParcelable
{
    public final class Builder
    {

        final NotifyTransactionStatusRequest ajS;

        public NotifyTransactionStatusRequest build()
        {
            boolean flag1 = true;
            boolean flag;
            if (!TextUtils.isEmpty(ajS.aiQ))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hm.b(flag, "googleTransactionId is required");
            if (ajS.status >= 1 && ajS.status <= 8)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            hm.b(flag, "status is an unrecognized value");
            return ajS;
        }

        public Builder setDetailedReason(String s)
        {
            ajS.ajR = s;
            return this;
        }

        public Builder setGoogleTransactionId(String s)
        {
            ajS.aiQ = s;
            return this;
        }

        public Builder setStatus(int i)
        {
            ajS.status = i;
            return this;
        }

        private Builder()
        {
            ajS = NotifyTransactionStatusRequest.this;
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
    String aiQ;
    String ajR;
    int status;
    final int xM;

    NotifyTransactionStatusRequest()
    {
        xM = 1;
    }

    NotifyTransactionStatusRequest(int i, String s, int j, String s1)
    {
        xM = i;
        aiQ = s;
        status = j;
        ajR = s1;
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
        return ajR;
    }

    public String getGoogleTransactionId()
    {
        return aiQ;
    }

    public int getStatus()
    {
        return status;
    }

    public int getVersionCode()
    {
        return xM;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        m.a(this, parcel, i);
    }

}
