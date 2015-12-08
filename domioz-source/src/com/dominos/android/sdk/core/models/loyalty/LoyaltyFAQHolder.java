// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.loyalty;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.dominos.android.sdk.core.models.loyalty:
//            LoyaltyFAQ

public class LoyaltyFAQHolder
    implements Parcelable
{

    private android.os.Parcelable.Creator CREATOR;
    private List faqs;

    private LoyaltyFAQHolder(Parcel parcel)
    {
        CREATOR = new _cls1();
        parcel = parcel.readBundle();
        parcel.setClassLoader(com/dominos/android/sdk/core/models/loyalty/LoyaltyFAQ.getClassLoader());
        faqs = parcel.getParcelableArrayList("faqs");
    }

    LoyaltyFAQHolder(Parcel parcel, _cls1 _pcls1)
    {
        this(parcel);
    }

    public int describeContents()
    {
        return 0;
    }

    public List getFaqs()
    {
        return faqs;
    }

    public void setFaqs(List list)
    {
        faqs = list;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Bundle bundle = new Bundle();
        ArrayList arraylist;
        if (faqs != null)
        {
            arraylist = (ArrayList)faqs;
        } else
        {
            arraylist = new ArrayList();
        }
        bundle.putParcelableArrayList("faqs", arraylist);
        parcel.writeBundle(bundle);
    }

    private class _cls1
        implements android.os.Parcelable.Creator
    {

        final LoyaltyFAQHolder this$0;

        public LoyaltyFAQHolder createFromParcel(Parcel parcel)
        {
            return new LoyaltyFAQHolder(parcel, null);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public LoyaltyFAQHolder[] newArray(int i)
        {
            return new LoyaltyFAQHolder[0];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
            this$0 = LoyaltyFAQHolder.this;
            super();
        }
    }

}
