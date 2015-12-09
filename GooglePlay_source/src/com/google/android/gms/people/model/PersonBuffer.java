// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.model;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.people.internal.PersonRef;

// Referenced classes of package com.google.android.gms.people.model:
//            DataBufferWithSyncInfo, Person

public final class PersonBuffer extends DataBufferWithSyncInfo
{

    private final com.google.android.gms.people.internal.agg.PhoneEmailDecoder.EmailDecoder mEmailDecoder;
    private final com.google.android.gms.people.internal.agg.PhoneEmailDecoder.PhoneDecoder mPhoneDecoder;

    public PersonBuffer(DataHolder dataholder, com.google.android.gms.people.internal.agg.PhoneEmailDecoder.PhoneDecoder phonedecoder, com.google.android.gms.people.internal.agg.PhoneEmailDecoder.EmailDecoder emaildecoder)
    {
        super(dataholder);
        mPhoneDecoder = phonedecoder;
        mEmailDecoder = emaildecoder;
    }

    public final Person get(int i)
    {
        return new PersonRef(mDataHolder, i, getMetadata(), mPhoneDecoder, mEmailDecoder);
    }

    public final volatile Object get(int i)
    {
        return get(i);
    }

    public final String toString()
    {
        return (new StringBuilder("People:size=")).append(getCount()).toString();
    }
}
