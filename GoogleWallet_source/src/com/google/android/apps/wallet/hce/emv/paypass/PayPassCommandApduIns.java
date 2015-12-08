// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.emv.paypass;

import com.google.android.apps.wallet.hce.iso7816.CommandApduException;
import com.google.android.apps.wallet.hce.iso7816.ResponseApdu;
import com.google.android.apps.wallet.hce.primitives.AbstractNamedInt;

final class PayPassCommandApduIns extends AbstractNamedInt
{

    static final PayPassCommandApduIns CCC = new PayPassCommandApduIns("CCC", 4);
    static final PayPassCommandApduIns GPO = new PayPassCommandApduIns("GPO", 2);
    static final PayPassCommandApduIns READ_RECORD = new PayPassCommandApduIns("READ_RECORD", 3);
    static final PayPassCommandApduIns SELECT = new PayPassCommandApduIns("SELECT", 1);

    private PayPassCommandApduIns(String s, int i)
    {
        super(s, i);
    }

    static PayPassCommandApduIns fromByteArray(byte abyte0[])
        throws CommandApduException
    {
        byte byte1 = abyte0[0];
        byte byte0 = abyte0[1];
        switch (byte1)
        {
        default:
            throw new CommandApduException(ResponseApdu.SW_CLA_NOT_SUPPORTED);

        case -128: 
            return typeFromProprietary(byte0);

        case 0: // '\0'
            return typeFromBase(byte0);
        }
    }

    private static PayPassCommandApduIns typeFromBase(byte byte0)
        throws CommandApduException
    {
        switch (byte0)
        {
        default:
            throw new CommandApduException(ResponseApdu.SW_INS_NOT_SUPPORTED);

        case -92: 
            return SELECT;

        case -78: 
            return READ_RECORD;
        }
    }

    private static PayPassCommandApduIns typeFromProprietary(byte byte0)
        throws CommandApduException
    {
        switch (byte0)
        {
        default:
            throw new CommandApduException(ResponseApdu.SW_INS_NOT_SUPPORTED);

        case -88: 
            return GPO;

        case 42: // '*'
            return CCC;
        }
    }

}
