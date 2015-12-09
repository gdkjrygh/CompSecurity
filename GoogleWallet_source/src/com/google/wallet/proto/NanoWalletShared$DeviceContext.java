// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletShared

public static final class clear extends ExtendableMessageNano
{

    public Long androidId;
    public Boolean batteryCharging;
    public String buildFingerprint;
    public String deviceId;
    public String deviceName;
    public String encodedCplc;
    public Integer hardwareType;
    public xt iosDeviceContext;
    public String manufacturer;
    public String model;
    public String oldDeprecatedAndroidId;
    public Integer percentBattery;
    public String phoneNumber;
    public String product;
    public String secureAndroidId;
    public String serial;
    public etails stableNetworkDetails;

    private clear clear()
    {
        oldDeprecatedAndroidId = null;
        serial = null;
        deviceId = null;
        phoneNumber = null;
        encodedCplc = null;
        product = null;
        model = null;
        manufacturer = null;
        hardwareType = null;
        iosDeviceContext = null;
        deviceName = null;
        percentBattery = null;
        batteryCharging = null;
        androidId = null;
        stableNetworkDetails = null;
        buildFingerprint = null;
        secureAndroidId = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L20:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 18: default 160
    //                   0: 169
    //                   10: 171
    //                   18: 182
    //                   26: 193
    //                   34: 204
    //                   42: 215
    //                   50: 226
    //                   58: 237
    //                   64: 248
    //                   74: 298
    //                   82: 327
    //                   88: 338
    //                   96: 352
    //                   104: 366
    //                   114: 380
    //                   122: 409
    //                   130: 420
    //                   138: 431;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L20; else goto _L2
_L2:
        return this;
_L3:
        oldDeprecatedAndroidId = codedinputbytebuffernano.readString();
          goto _L20
_L4:
        serial = codedinputbytebuffernano.readString();
          goto _L20
_L5:
        deviceId = codedinputbytebuffernano.readString();
          goto _L20
_L6:
        phoneNumber = codedinputbytebuffernano.readString();
          goto _L20
_L7:
        encodedCplc = codedinputbytebuffernano.readString();
          goto _L20
_L8:
        product = codedinputbytebuffernano.readString();
          goto _L20
_L9:
        model = codedinputbytebuffernano.readString();
          goto _L20
_L10:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            hardwareType = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        if (iosDeviceContext == null)
        {
            iosDeviceContext = new xt();
        }
        codedinputbytebuffernano.readMessage(iosDeviceContext);
        continue; /* Loop/switch isn't completed */
_L12:
        deviceName = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L13:
        percentBattery = Integer.valueOf(codedinputbytebuffernano.readInt32());
        continue; /* Loop/switch isn't completed */
_L14:
        batteryCharging = Boolean.valueOf(codedinputbytebuffernano.readBool());
        continue; /* Loop/switch isn't completed */
_L15:
        androidId = Long.valueOf(codedinputbytebuffernano.readInt64());
        continue; /* Loop/switch isn't completed */
_L16:
        if (stableNetworkDetails == null)
        {
            stableNetworkDetails = new etails();
        }
        codedinputbytebuffernano.readMessage(stableNetworkDetails);
        continue; /* Loop/switch isn't completed */
_L17:
        buildFingerprint = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L18:
        secureAndroidId = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L19:
        manufacturer = codedinputbytebuffernano.readString();
        if (true) goto _L20; else goto _L21
_L21:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (oldDeprecatedAndroidId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, oldDeprecatedAndroidId);
        }
        j = i;
        if (serial != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, serial);
        }
        i = j;
        if (deviceId != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, deviceId);
        }
        j = i;
        if (phoneNumber != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, phoneNumber);
        }
        i = j;
        if (encodedCplc != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, encodedCplc);
        }
        j = i;
        if (product != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, product);
        }
        i = j;
        if (model != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(7, model);
        }
        j = i;
        if (hardwareType != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(8, hardwareType.intValue());
        }
        i = j;
        if (iosDeviceContext != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(9, iosDeviceContext);
        }
        j = i;
        if (deviceName != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(10, deviceName);
        }
        i = j;
        if (percentBattery != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(11, percentBattery.intValue());
        }
        j = i;
        if (batteryCharging != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(12, batteryCharging.booleanValue());
        }
        i = j;
        if (androidId != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(13, androidId.longValue());
        }
        j = i;
        if (stableNetworkDetails != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(14, stableNetworkDetails);
        }
        i = j;
        if (buildFingerprint != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(15, buildFingerprint);
        }
        j = i;
        if (secureAndroidId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(16, secureAndroidId);
        }
        i = j;
        if (manufacturer != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(17, manufacturer);
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
        if (oldDeprecatedAndroidId != null)
        {
            codedoutputbytebuffernano.writeString(1, oldDeprecatedAndroidId);
        }
        if (serial != null)
        {
            codedoutputbytebuffernano.writeString(2, serial);
        }
        if (deviceId != null)
        {
            codedoutputbytebuffernano.writeString(3, deviceId);
        }
        if (phoneNumber != null)
        {
            codedoutputbytebuffernano.writeString(4, phoneNumber);
        }
        if (encodedCplc != null)
        {
            codedoutputbytebuffernano.writeString(5, encodedCplc);
        }
        if (product != null)
        {
            codedoutputbytebuffernano.writeString(6, product);
        }
        if (model != null)
        {
            codedoutputbytebuffernano.writeString(7, model);
        }
        if (hardwareType != null)
        {
            codedoutputbytebuffernano.writeInt32(8, hardwareType.intValue());
        }
        if (iosDeviceContext != null)
        {
            codedoutputbytebuffernano.writeMessage(9, iosDeviceContext);
        }
        if (deviceName != null)
        {
            codedoutputbytebuffernano.writeString(10, deviceName);
        }
        if (percentBattery != null)
        {
            codedoutputbytebuffernano.writeInt32(11, percentBattery.intValue());
        }
        if (batteryCharging != null)
        {
            codedoutputbytebuffernano.writeBool(12, batteryCharging.booleanValue());
        }
        if (androidId != null)
        {
            codedoutputbytebuffernano.writeInt64(13, androidId.longValue());
        }
        if (stableNetworkDetails != null)
        {
            codedoutputbytebuffernano.writeMessage(14, stableNetworkDetails);
        }
        if (buildFingerprint != null)
        {
            codedoutputbytebuffernano.writeString(15, buildFingerprint);
        }
        if (secureAndroidId != null)
        {
            codedoutputbytebuffernano.writeString(16, secureAndroidId);
        }
        if (manufacturer != null)
        {
            codedoutputbytebuffernano.writeString(17, manufacturer);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public etails()
    {
        clear();
    }
}
