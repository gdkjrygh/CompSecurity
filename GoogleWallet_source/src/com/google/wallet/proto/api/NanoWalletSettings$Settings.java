// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletSettings

public static final class clear extends ExtendableMessageNano
{

    public Long cloudPinTtlMinutes;
    public Boolean enableNotifications;
    public eSettings lowBalanceSettings;
    public Boolean marketingEmail;
    public gs p2PSettings;
    public String ringtoneLocation;
    public tting transactionNotificationSetting[];
    public Integer vibrationCondition;
    public tting wobNotificationSetting[];

    private clear clear()
    {
        wobNotificationSetting = tting.emptyArray();
        transactionNotificationSetting = tting.emptyArray();
        enableNotifications = null;
        marketingEmail = null;
        lowBalanceSettings = null;
        cloudPinTtlMinutes = null;
        p2PSettings = null;
        vibrationCondition = null;
        ringtoneLocation = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L12:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   10: 107
    //                   18: 231
    //                   24: 355
    //                   32: 369
    //                   42: 383
    //                   48: 412
    //                   58: 426
    //                   64: 455
    //                   74: 502;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
        tting atting[];
        int j;
        if (wobNotificationSetting == null)
        {
            j = 0;
        } else
        {
            j = wobNotificationSetting.length;
        }
        atting = new tting[j + i1];
        i1 = j;
        if (j != 0)
        {
            System.arraycopy(wobNotificationSetting, 0, atting, 0, j);
            i1 = j;
        }
        for (; i1 < atting.length - 1; i1++)
        {
            atting[i1] = new tting();
            codedinputbytebuffernano.readMessage(atting[i1]);
            codedinputbytebuffernano.readTag();
        }

        atting[i1] = new tting();
        codedinputbytebuffernano.readMessage(atting[i1]);
        wobNotificationSetting = atting;
          goto _L12
_L4:
        int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
        tting atting1[];
        int k;
        if (transactionNotificationSetting == null)
        {
            k = 0;
        } else
        {
            k = transactionNotificationSetting.length;
        }
        atting1 = new tting[k + j1];
        j1 = k;
        if (k != 0)
        {
            System.arraycopy(transactionNotificationSetting, 0, atting1, 0, k);
            j1 = k;
        }
        for (; j1 < atting1.length - 1; j1++)
        {
            atting1[j1] = new tting();
            codedinputbytebuffernano.readMessage(atting1[j1]);
            codedinputbytebuffernano.readTag();
        }

        atting1[j1] = new tting();
        codedinputbytebuffernano.readMessage(atting1[j1]);
        transactionNotificationSetting = atting1;
          goto _L12
_L5:
        enableNotifications = Boolean.valueOf(codedinputbytebuffernano.readBool());
          goto _L12
_L6:
        marketingEmail = Boolean.valueOf(codedinputbytebuffernano.readBool());
          goto _L12
_L7:
        if (lowBalanceSettings == null)
        {
            lowBalanceSettings = new eSettings();
        }
        codedinputbytebuffernano.readMessage(lowBalanceSettings);
          goto _L12
_L8:
        cloudPinTtlMinutes = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L12
_L9:
        if (p2PSettings == null)
        {
            p2PSettings = new gs();
        }
        codedinputbytebuffernano.readMessage(p2PSettings);
          goto _L12
_L10:
        int l = codedinputbytebuffernano.readInt32();
        switch (l)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            vibrationCondition = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        ringtoneLocation = codedinputbytebuffernano.readString();
        if (true) goto _L12; else goto _L13
_L13:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (wobNotificationSetting != null)
        {
            i = j;
            if (wobNotificationSetting.length > 0)
            {
                int k = 0;
                do
                {
                    i = j;
                    if (k >= wobNotificationSetting.length)
                    {
                        break;
                    }
                    tting tting = wobNotificationSetting[k];
                    i = j;
                    if (tting != null)
                    {
                        i = j + CodedOutputByteBufferNano.computeMessageSize(1, tting);
                    }
                    k++;
                    j = i;
                } while (true);
            }
        }
        j = i;
        if (transactionNotificationSetting != null)
        {
            j = i;
            if (transactionNotificationSetting.length > 0)
            {
                int l = 0;
                do
                {
                    j = i;
                    if (l >= transactionNotificationSetting.length)
                    {
                        break;
                    }
                    tting tting1 = transactionNotificationSetting[l];
                    j = i;
                    if (tting1 != null)
                    {
                        j = i + CodedOutputByteBufferNano.computeMessageSize(2, tting1);
                    }
                    l++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (enableNotifications != null)
        {
            i = j + CodedOutputByteBufferNano.computeBoolSize(3, enableNotifications.booleanValue());
        }
        j = i;
        if (marketingEmail != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(4, marketingEmail.booleanValue());
        }
        i = j;
        if (lowBalanceSettings != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(5, lowBalanceSettings);
        }
        j = i;
        if (cloudPinTtlMinutes != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(6, cloudPinTtlMinutes.longValue());
        }
        i = j;
        if (p2PSettings != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(7, p2PSettings);
        }
        j = i;
        if (vibrationCondition != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(8, vibrationCondition.intValue());
        }
        i = j;
        if (ringtoneLocation != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(9, ringtoneLocation);
        }
        return i;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (wobNotificationSetting != null && wobNotificationSetting.length > 0)
        {
            for (int i = 0; i < wobNotificationSetting.length; i++)
            {
                tting tting = wobNotificationSetting[i];
                if (tting != null)
                {
                    codedoutputbytebuffernano.writeMessage(1, tting);
                }
            }

        }
        if (transactionNotificationSetting != null && transactionNotificationSetting.length > 0)
        {
            for (int j = 0; j < transactionNotificationSetting.length; j++)
            {
                tting tting1 = transactionNotificationSetting[j];
                if (tting1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(2, tting1);
                }
            }

        }
        if (enableNotifications != null)
        {
            codedoutputbytebuffernano.writeBool(3, enableNotifications.booleanValue());
        }
        if (marketingEmail != null)
        {
            codedoutputbytebuffernano.writeBool(4, marketingEmail.booleanValue());
        }
        if (lowBalanceSettings != null)
        {
            codedoutputbytebuffernano.writeMessage(5, lowBalanceSettings);
        }
        if (cloudPinTtlMinutes != null)
        {
            codedoutputbytebuffernano.writeInt64(6, cloudPinTtlMinutes.longValue());
        }
        if (p2PSettings != null)
        {
            codedoutputbytebuffernano.writeMessage(7, p2PSettings);
        }
        if (vibrationCondition != null)
        {
            codedoutputbytebuffernano.writeInt32(8, vibrationCondition.intValue());
        }
        if (ringtoneLocation != null)
        {
            codedoutputbytebuffernano.writeString(9, ringtoneLocation);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public tting()
    {
        clear();
    }
}
