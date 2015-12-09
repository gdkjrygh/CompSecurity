// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.encryption;

import org.keyczar.KeyMetadata;
import org.keyczar.KeyVersion;
import org.keyczar.enums.KeyPurpose;
import org.keyczar.enums.KeyStatus;
import org.keyczar.exceptions.KeyczarException;
import org.keyczar.interfaces.KeyType;
import org.keyczar.interfaces.KeyczarReader;

public final class JsonLiteralKeyczarReader
    implements KeyczarReader
{

    private final KeyMetadata mKeyMetadata;
    private final String mRawKey;

    public JsonLiteralKeyczarReader(KeyPurpose keypurpose, KeyType keytype, String s)
    {
        mRawKey = s;
        mKeyMetadata = new KeyMetadata("", keypurpose, keytype);
        keypurpose = new KeyVersion(1, KeyStatus.PRIMARY, false);
        mKeyMetadata.addVersion(keypurpose);
    }

    public final String getKey(int i)
        throws KeyczarException
    {
        return mRawKey;
    }

    public final String getMetadata()
        throws KeyczarException
    {
        return mKeyMetadata.toString();
    }
}
