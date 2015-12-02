// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.phonenumbers;

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class exampleNumber_
    implements Externalizable
{

    private String exampleNumber_;
    private boolean hasExampleNumber;
    private boolean hasNationalNumberPattern;
    private boolean hasPossibleNumberPattern;
    private String nationalNumberPattern_;
    private String possibleNumberPattern_;

    public static Builder newBuilder()
    {
        class Builder extends Phonemetadata.PhoneNumberDesc
        {

            public Builder()
            {
            }
        }

        return new Builder();
    }

    public String getNationalNumberPattern()
    {
        return nationalNumberPattern_;
    }

    public String getPossibleNumberPattern()
    {
        return possibleNumberPattern_;
    }

    public boolean hasNationalNumberPattern()
    {
        return hasNationalNumberPattern;
    }

    public void readExternal(ObjectInput objectinput)
    {
        if (objectinput.readBoolean())
        {
            setNationalNumberPattern(objectinput.readUTF());
        }
        if (objectinput.readBoolean())
        {
            setPossibleNumberPattern(objectinput.readUTF());
        }
        if (objectinput.readBoolean())
        {
            setExampleNumber(objectinput.readUTF());
        }
    }

    public setExampleNumber setExampleNumber(String s)
    {
        hasExampleNumber = true;
        exampleNumber_ = s;
        return this;
    }

    public exampleNumber_ setNationalNumberPattern(String s)
    {
        hasNationalNumberPattern = true;
        nationalNumberPattern_ = s;
        return this;
    }

    public nationalNumberPattern_ setPossibleNumberPattern(String s)
    {
        hasPossibleNumberPattern = true;
        possibleNumberPattern_ = s;
        return this;
    }

    public void writeExternal(ObjectOutput objectoutput)
    {
        objectoutput.writeBoolean(hasNationalNumberPattern);
        if (hasNationalNumberPattern)
        {
            objectoutput.writeUTF(nationalNumberPattern_);
        }
        objectoutput.writeBoolean(hasPossibleNumberPattern);
        if (hasPossibleNumberPattern)
        {
            objectoutput.writeUTF(possibleNumberPattern_);
        }
        objectoutput.writeBoolean(hasExampleNumber);
        if (hasExampleNumber)
        {
            objectoutput.writeUTF(exampleNumber_);
        }
    }

    public Builder()
    {
        nationalNumberPattern_ = "";
        possibleNumberPattern_ = "";
        exampleNumber_ = "";
    }
}
