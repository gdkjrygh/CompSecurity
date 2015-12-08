// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.phonenumbers;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// Referenced classes of package com.google.android.libraries.phonenumbers:
//            Phonemetadata

public static final class exampleNumber_
    implements Externalizable
{

    private String exampleNumber_;
    private boolean hasExampleNumber;
    private boolean hasNationalNumberPattern;
    private boolean hasPossibleNumberPattern;
    private String nationalNumberPattern_;
    private String possibleNumberPattern_;

    private exampleNumber_ setExampleNumber(String s)
    {
        hasExampleNumber = true;
        exampleNumber_ = s;
        return this;
    }

    private exampleNumber_ setNationalNumberPattern(String s)
    {
        hasNationalNumberPattern = true;
        nationalNumberPattern_ = s;
        return this;
    }

    private nationalNumberPattern_ setPossibleNumberPattern(String s)
    {
        hasPossibleNumberPattern = true;
        possibleNumberPattern_ = s;
        return this;
    }

    public final String getNationalNumberPattern()
    {
        return nationalNumberPattern_;
    }

    public final String getPossibleNumberPattern()
    {
        return possibleNumberPattern_;
    }

    public final void readExternal(ObjectInput objectinput)
        throws IOException
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

    public final void writeExternal(ObjectOutput objectoutput)
        throws IOException
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

    public ()
    {
        nationalNumberPattern_ = "";
        possibleNumberPattern_ = "";
        exampleNumber_ = "";
    }
}
