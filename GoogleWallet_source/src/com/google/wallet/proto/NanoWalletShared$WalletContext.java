// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto:
//            NanoWalletShared

public static final class clear extends ExtendableMessageNano
{

    public String androidFeatureset;
    public String androidVersionCode;
    public String androidVersionName;
    public String buildId;
    public String buildRelease;
    public String buildTags;
    public Integer clientType;
    public String cloudConfig;
    public Integer controllerAppletVersion;
    public xt iosWalletContext;
    public String languageCode;
    public String locale;
    public Integer osType;
    public Integer sdkVersion;
    public String supportedLanguageCode[];
    public Long systemCurrentTimeMillis;
    public Long systemGmtOffsetMillis;
    public String timeZone;
    public Boolean twelveHourClock;
    public String walletUuid;

    private clear clear()
    {
        walletUuid = null;
        androidVersionCode = null;
        androidVersionName = null;
        androidFeatureset = null;
        cloudConfig = null;
        buildId = null;
        buildTags = null;
        osType = null;
        clientType = null;
        iosWalletContext = null;
        buildRelease = null;
        sdkVersion = null;
        locale = null;
        controllerAppletVersion = null;
        systemCurrentTimeMillis = null;
        systemGmtOffsetMillis = null;
        timeZone = null;
        supportedLanguageCode = WireFormatNano.EMPTY_STRING_ARRAY;
        languageCode = null;
        twelveHourClock = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L23:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 21: default 184
    //                   0: 193
    //                   10: 195
    //                   18: 206
    //                   26: 217
    //                   34: 228
    //                   42: 239
    //                   50: 250
    //                   58: 261
    //                   64: 272
    //                   74: 322
    //                   82: 351
    //                   88: 362
    //                   98: 376
    //                   104: 387
    //                   112: 401
    //                   120: 415
    //                   130: 429
    //                   138: 440
    //                   146: 543
    //                   152: 554
    //                   160: 568;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L23; else goto _L2
_L2:
        return this;
_L3:
        walletUuid = codedinputbytebuffernano.readString();
          goto _L23
_L4:
        androidVersionCode = codedinputbytebuffernano.readString();
          goto _L23
_L5:
        androidVersionName = codedinputbytebuffernano.readString();
          goto _L23
_L6:
        androidFeatureset = codedinputbytebuffernano.readString();
          goto _L23
_L7:
        cloudConfig = codedinputbytebuffernano.readString();
          goto _L23
_L8:
        buildId = codedinputbytebuffernano.readString();
          goto _L23
_L9:
        buildTags = codedinputbytebuffernano.readString();
          goto _L23
_L10:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            osType = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        if (iosWalletContext == null)
        {
            iosWalletContext = new xt();
        }
        codedinputbytebuffernano.readMessage(iosWalletContext);
        continue; /* Loop/switch isn't completed */
_L12:
        buildRelease = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L13:
        sdkVersion = Integer.valueOf(codedinputbytebuffernano.readInt32());
        continue; /* Loop/switch isn't completed */
_L14:
        locale = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L15:
        controllerAppletVersion = Integer.valueOf(codedinputbytebuffernano.readInt32());
        continue; /* Loop/switch isn't completed */
_L16:
        systemCurrentTimeMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
        continue; /* Loop/switch isn't completed */
_L17:
        systemGmtOffsetMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
        continue; /* Loop/switch isn't completed */
_L18:
        timeZone = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L19:
        int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 138);
        String as[];
        int k;
        if (supportedLanguageCode == null)
        {
            k = 0;
        } else
        {
            k = supportedLanguageCode.length;
        }
        as = new String[k + i1];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(supportedLanguageCode, 0, as, 0, k);
            i1 = k;
        }
        for (; i1 < as.length - 1; i1++)
        {
            as[i1] = codedinputbytebuffernano.readString();
            codedinputbytebuffernano.readTag();
        }

        as[i1] = codedinputbytebuffernano.readString();
        supportedLanguageCode = as;
        continue; /* Loop/switch isn't completed */
_L20:
        languageCode = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L21:
        twelveHourClock = Boolean.valueOf(codedinputbytebuffernano.readBool());
        continue; /* Loop/switch isn't completed */
_L22:
        int l = codedinputbytebuffernano.readInt32();
        switch (l)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            clientType = Integer.valueOf(l);
            break;
        }
        if (true) goto _L23; else goto _L24
_L24:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (walletUuid != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, walletUuid);
        }
        j = i;
        if (androidVersionCode != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, androidVersionCode);
        }
        i = j;
        if (androidVersionName != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(3, androidVersionName);
        }
        j = i;
        if (androidFeatureset != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, androidFeatureset);
        }
        i = j;
        if (cloudConfig != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, cloudConfig);
        }
        j = i;
        if (buildId != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(6, buildId);
        }
        i = j;
        if (buildTags != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(7, buildTags);
        }
        j = i;
        if (osType != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(8, osType.intValue());
        }
        i = j;
        if (iosWalletContext != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(9, iosWalletContext);
        }
        j = i;
        if (buildRelease != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(10, buildRelease);
        }
        i = j;
        if (sdkVersion != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(11, sdkVersion.intValue());
        }
        j = i;
        if (locale != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(12, locale);
        }
        i = j;
        if (controllerAppletVersion != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(13, controllerAppletVersion.intValue());
        }
        j = i;
        if (systemCurrentTimeMillis != null)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(14, systemCurrentTimeMillis.longValue());
        }
        int k = j;
        if (systemGmtOffsetMillis != null)
        {
            k = j + CodedOutputByteBufferNano.computeInt64Size(15, systemGmtOffsetMillis.longValue());
        }
        i = k;
        if (timeZone != null)
        {
            i = k + CodedOutputByteBufferNano.computeStringSize(16, timeZone);
        }
        j = i;
        if (supportedLanguageCode != null)
        {
            j = i;
            if (supportedLanguageCode.length > 0)
            {
                int j1 = 0;
                int l = 0;
                for (j = 0; j < supportedLanguageCode.length;)
                {
                    String s = supportedLanguageCode[j];
                    int k1 = j1;
                    int i1 = l;
                    if (s != null)
                    {
                        k1 = j1 + 1;
                        i1 = l + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    j++;
                    j1 = k1;
                    l = i1;
                }

                j = i + l + j1 * 2;
            }
        }
        i = j;
        if (languageCode != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(18, languageCode);
        }
        j = i;
        if (twelveHourClock != null)
        {
            j = i + CodedOutputByteBufferNano.computeBoolSize(19, twelveHourClock.booleanValue());
        }
        i = j;
        if (clientType != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(20, clientType.intValue());
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
        if (walletUuid != null)
        {
            codedoutputbytebuffernano.writeString(1, walletUuid);
        }
        if (androidVersionCode != null)
        {
            codedoutputbytebuffernano.writeString(2, androidVersionCode);
        }
        if (androidVersionName != null)
        {
            codedoutputbytebuffernano.writeString(3, androidVersionName);
        }
        if (androidFeatureset != null)
        {
            codedoutputbytebuffernano.writeString(4, androidFeatureset);
        }
        if (cloudConfig != null)
        {
            codedoutputbytebuffernano.writeString(5, cloudConfig);
        }
        if (buildId != null)
        {
            codedoutputbytebuffernano.writeString(6, buildId);
        }
        if (buildTags != null)
        {
            codedoutputbytebuffernano.writeString(7, buildTags);
        }
        if (osType != null)
        {
            codedoutputbytebuffernano.writeInt32(8, osType.intValue());
        }
        if (iosWalletContext != null)
        {
            codedoutputbytebuffernano.writeMessage(9, iosWalletContext);
        }
        if (buildRelease != null)
        {
            codedoutputbytebuffernano.writeString(10, buildRelease);
        }
        if (sdkVersion != null)
        {
            codedoutputbytebuffernano.writeInt32(11, sdkVersion.intValue());
        }
        if (locale != null)
        {
            codedoutputbytebuffernano.writeString(12, locale);
        }
        if (controllerAppletVersion != null)
        {
            codedoutputbytebuffernano.writeInt32(13, controllerAppletVersion.intValue());
        }
        if (systemCurrentTimeMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(14, systemCurrentTimeMillis.longValue());
        }
        if (systemGmtOffsetMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(15, systemGmtOffsetMillis.longValue());
        }
        if (timeZone != null)
        {
            codedoutputbytebuffernano.writeString(16, timeZone);
        }
        if (supportedLanguageCode != null && supportedLanguageCode.length > 0)
        {
            for (int i = 0; i < supportedLanguageCode.length; i++)
            {
                String s = supportedLanguageCode[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(17, s);
                }
            }

        }
        if (languageCode != null)
        {
            codedoutputbytebuffernano.writeString(18, languageCode);
        }
        if (twelveHourClock != null)
        {
            codedoutputbytebuffernano.writeBool(19, twelveHourClock.booleanValue());
        }
        if (clientType != null)
        {
            codedoutputbytebuffernano.writeInt32(20, clientType.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public xt()
    {
        clear();
    }
}
