// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.phonenumbers;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public class metadata_
    implements Externalizable
{

    private List metadata_;

    public static Builder newBuilder()
    {
        class Builder extends Phonemetadata.PhoneMetadataCollection
        {

            public Builder()
            {
            }
        }

        return new Builder();
    }

    public int getMetadataCount()
    {
        return metadata_.size();
    }

    public List getMetadataList()
    {
        return metadata_;
    }

    public void readExternal(ObjectInput objectinput)
    {
        int j = objectinput.readInt();
        for (int i = 0; i < j; i++)
        {
            metadata_ metadata_1 = new metadata_();
            metadata_1.al(objectinput);
            metadata_.add(metadata_1);
        }

    }

    public void writeExternal(ObjectOutput objectoutput)
    {
        int j = getMetadataCount();
        objectoutput.writeInt(j);
        for (int i = 0; i < j; i++)
        {
            ((getMetadataCount)metadata_.get(i)).nal(objectoutput);
        }

    }

    public Builder()
    {
        metadata_ = new ArrayList();
    }
}
