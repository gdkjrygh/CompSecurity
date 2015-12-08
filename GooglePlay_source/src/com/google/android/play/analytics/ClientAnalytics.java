// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.analytics;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

public interface ClientAnalytics
{
    public static final class ActiveExperiments extends MessageNano
    {

        public String clientAlteringExperiment[];
        public int gwsExperiment[];
        public String otherExperiment[];
        public long playExperiment[];

        protected final int computeSerializedSize()
        {
            int l2 = super.computeSerializedSize();
            int i = l2;
            if (clientAlteringExperiment != null)
            {
                i = l2;
                if (clientAlteringExperiment.length > 0)
                {
                    int l1 = 0;
                    int j = 0;
                    for (i = 0; i < clientAlteringExperiment.length;)
                    {
                        String s = clientAlteringExperiment[i];
                        int j2 = l1;
                        int l = j;
                        if (s != null)
                        {
                            j2 = l1 + 1;
                            l = j + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        i++;
                        l1 = j2;
                        j = l;
                    }

                    i = l2 + j + l1 * 1;
                }
            }
            int k = i;
            if (otherExperiment != null)
            {
                k = i;
                if (otherExperiment.length > 0)
                {
                    int k2 = 0;
                    int i1 = 0;
                    for (k = 0; k < otherExperiment.length;)
                    {
                        String s1 = otherExperiment[k];
                        int i3 = k2;
                        int i2 = i1;
                        if (s1 != null)
                        {
                            i3 = k2 + 1;
                            i2 = i1 + CodedOutputByteBufferNano.computeStringSizeNoTag(s1);
                        }
                        k++;
                        k2 = i3;
                        i1 = i2;
                    }

                    k = i + i1 + k2 * 1;
                }
            }
            i = k;
            if (gwsExperiment != null)
            {
                i = k;
                if (gwsExperiment.length > 0)
                {
                    int j1 = 0;
                    for (i = 0; i < gwsExperiment.length; i++)
                    {
                        j1 += CodedOutputByteBufferNano.computeInt32SizeNoTag(gwsExperiment[i]);
                    }

                    i = k + j1 + gwsExperiment.length * 1;
                }
            }
            k = i;
            if (playExperiment != null)
            {
                k = i;
                if (playExperiment.length > 0)
                {
                    int k1 = 0;
                    for (k = 0; k < playExperiment.length; k++)
                    {
                        k1 += CodedOutputByteBufferNano.computeRawVarint64Size(playExperiment[k]);
                    }

                    k = i + k1 + playExperiment.length * 1;
                }
            }
            return k;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    int l1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                    String as[];
                    int j;
                    if (clientAlteringExperiment == null)
                    {
                        j = 0;
                    } else
                    {
                        j = clientAlteringExperiment.length;
                    }
                    as = new String[l1 + j];
                    l1 = j;
                    if (j != 0)
                    {
                        System.arraycopy(clientAlteringExperiment, 0, as, 0, j);
                        l1 = j;
                    }
                    for (; l1 < as.length - 1; l1++)
                    {
                        as[l1] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[l1] = codedinputbytebuffernano.readString();
                    clientAlteringExperiment = as;
                    break;

                case 18: // '\022'
                    int i2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    String as1[];
                    int k;
                    if (otherExperiment == null)
                    {
                        k = 0;
                    } else
                    {
                        k = otherExperiment.length;
                    }
                    as1 = new String[i2 + k];
                    i2 = k;
                    if (k != 0)
                    {
                        System.arraycopy(otherExperiment, 0, as1, 0, k);
                        i2 = k;
                    }
                    for (; i2 < as1.length - 1; i2++)
                    {
                        as1[i2] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as1[i2] = codedinputbytebuffernano.readString();
                    otherExperiment = as1;
                    break;

                case 24: // '\030'
                    int j2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 24);
                    int ai[];
                    int l;
                    if (gwsExperiment == null)
                    {
                        l = 0;
                    } else
                    {
                        l = gwsExperiment.length;
                    }
                    ai = new int[j2 + l];
                    j2 = l;
                    if (l != 0)
                    {
                        System.arraycopy(gwsExperiment, 0, ai, 0, l);
                        j2 = l;
                    }
                    for (; j2 < ai.length - 1; j2++)
                    {
                        ai[j2] = codedinputbytebuffernano.readRawVarint32();
                        codedinputbytebuffernano.readTag();
                    }

                    ai[j2] = codedinputbytebuffernano.readRawVarint32();
                    gwsExperiment = ai;
                    break;

                case 26: // '\032'
                    int j3 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                    int i1 = codedinputbytebuffernano.getPosition();
                    int k2;
                    for (k2 = 0; codedinputbytebuffernano.getBytesUntilLimit() > 0; k2++)
                    {
                        codedinputbytebuffernano.readRawVarint32();
                    }

                    codedinputbytebuffernano.rewindToPosition(i1);
                    int ai1[];
                    if (gwsExperiment == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = gwsExperiment.length;
                    }
                    ai1 = new int[k2 + i1];
                    k2 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(gwsExperiment, 0, ai1, 0, i1);
                        k2 = i1;
                    }
                    for (; k2 < ai1.length; k2++)
                    {
                        ai1[k2] = codedinputbytebuffernano.readRawVarint32();
                    }

                    gwsExperiment = ai1;
                    codedinputbytebuffernano.popLimit(j3);
                    break;

                case 32: // ' '
                    int l2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 32);
                    long al[];
                    int j1;
                    if (playExperiment == null)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = playExperiment.length;
                    }
                    al = new long[l2 + j1];
                    l2 = j1;
                    if (j1 != 0)
                    {
                        System.arraycopy(playExperiment, 0, al, 0, j1);
                        l2 = j1;
                    }
                    for (; l2 < al.length - 1; l2++)
                    {
                        al[l2] = codedinputbytebuffernano.readRawVarint64();
                        codedinputbytebuffernano.readTag();
                    }

                    al[l2] = codedinputbytebuffernano.readRawVarint64();
                    playExperiment = al;
                    break;

                case 34: // '"'
                    int k3 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                    int k1 = codedinputbytebuffernano.getPosition();
                    int i3;
                    for (i3 = 0; codedinputbytebuffernano.getBytesUntilLimit() > 0; i3++)
                    {
                        codedinputbytebuffernano.readRawVarint64();
                    }

                    codedinputbytebuffernano.rewindToPosition(k1);
                    long al1[];
                    if (playExperiment == null)
                    {
                        k1 = 0;
                    } else
                    {
                        k1 = playExperiment.length;
                    }
                    al1 = new long[i3 + k1];
                    i3 = k1;
                    if (k1 != 0)
                    {
                        System.arraycopy(playExperiment, 0, al1, 0, k1);
                        i3 = k1;
                    }
                    for (; i3 < al1.length; i3++)
                    {
                        al1[i3] = codedinputbytebuffernano.readRawVarint64();
                    }

                    playExperiment = al1;
                    codedinputbytebuffernano.popLimit(k3);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (clientAlteringExperiment != null && clientAlteringExperiment.length > 0)
            {
                for (int i = 0; i < clientAlteringExperiment.length; i++)
                {
                    String s = clientAlteringExperiment[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(1, s);
                    }
                }

            }
            if (otherExperiment != null && otherExperiment.length > 0)
            {
                for (int j = 0; j < otherExperiment.length; j++)
                {
                    String s1 = otherExperiment[j];
                    if (s1 != null)
                    {
                        codedoutputbytebuffernano.writeString(2, s1);
                    }
                }

            }
            if (gwsExperiment != null && gwsExperiment.length > 0)
            {
                for (int k = 0; k < gwsExperiment.length; k++)
                {
                    codedoutputbytebuffernano.writeInt32(3, gwsExperiment[k]);
                }

            }
            if (playExperiment != null && playExperiment.length > 0)
            {
                for (int l = 0; l < playExperiment.length; l++)
                {
                    codedoutputbytebuffernano.writeInt64(4, playExperiment[l]);
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ActiveExperiments()
        {
            clientAlteringExperiment = WireFormatNano.EMPTY_STRING_ARRAY;
            otherExperiment = WireFormatNano.EMPTY_STRING_ARRAY;
            gwsExperiment = WireFormatNano.EMPTY_INT_ARRAY;
            playExperiment = WireFormatNano.EMPTY_LONG_ARRAY;
            cachedSize = -1;
        }
    }

    public static final class AndroidClientInfo extends MessageNano
    {

        public long androidId;
        public String applicationBuild;
        public String board;
        public String brand;
        public String country;
        public String device;
        public long deviceId;
        public String fingerprint;
        public int gmsCoreVersionCode;
        public String hardware;
        public String locale;
        public String loggingId;
        public String manufacturer;
        public String mccMnc;
        public String model;
        public String osBuild;
        public String product;
        public String radioVersion;
        public int sdkVersion;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (androidId != 0L)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, androidId);
            }
            j = i;
            if (!loggingId.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, loggingId);
            }
            i = j;
            if (sdkVersion != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, sdkVersion);
            }
            j = i;
            if (!model.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, model);
            }
            i = j;
            if (!product.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, product);
            }
            j = i;
            if (!osBuild.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, osBuild);
            }
            i = j;
            if (!applicationBuild.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(7, applicationBuild);
            }
            j = i;
            if (!hardware.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(8, hardware);
            }
            i = j;
            if (!device.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(9, device);
            }
            j = i;
            if (!mccMnc.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(10, mccMnc);
            }
            i = j;
            if (!locale.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(11, locale);
            }
            j = i;
            if (!country.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(12, country);
            }
            i = j;
            if (!manufacturer.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(13, manufacturer);
            }
            j = i;
            if (!brand.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(14, brand);
            }
            i = j;
            if (!board.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(15, board);
            }
            j = i;
            if (!radioVersion.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(16, radioVersion);
            }
            i = j;
            if (!fingerprint.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(17, fingerprint);
            }
            j = i;
            if (deviceId != 0L)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(18, deviceId);
            }
            i = j;
            if (gmsCoreVersionCode != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(19, gmsCoreVersionCode);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 8: // '\b'
                    androidId = codedinputbytebuffernano.readRawVarint64();
                    break;

                case 18: // '\022'
                    loggingId = codedinputbytebuffernano.readString();
                    break;

                case 24: // '\030'
                    sdkVersion = codedinputbytebuffernano.readRawVarint32();
                    break;

                case 34: // '"'
                    model = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    product = codedinputbytebuffernano.readString();
                    break;

                case 50: // '2'
                    osBuild = codedinputbytebuffernano.readString();
                    break;

                case 58: // ':'
                    applicationBuild = codedinputbytebuffernano.readString();
                    break;

                case 66: // 'B'
                    hardware = codedinputbytebuffernano.readString();
                    break;

                case 74: // 'J'
                    device = codedinputbytebuffernano.readString();
                    break;

                case 82: // 'R'
                    mccMnc = codedinputbytebuffernano.readString();
                    break;

                case 90: // 'Z'
                    locale = codedinputbytebuffernano.readString();
                    break;

                case 98: // 'b'
                    country = codedinputbytebuffernano.readString();
                    break;

                case 106: // 'j'
                    manufacturer = codedinputbytebuffernano.readString();
                    break;

                case 114: // 'r'
                    brand = codedinputbytebuffernano.readString();
                    break;

                case 122: // 'z'
                    board = codedinputbytebuffernano.readString();
                    break;

                case 130: 
                    radioVersion = codedinputbytebuffernano.readString();
                    break;

                case 138: 
                    fingerprint = codedinputbytebuffernano.readString();
                    break;

                case 144: 
                    deviceId = codedinputbytebuffernano.readRawVarint64();
                    break;

                case 152: 
                    gmsCoreVersionCode = codedinputbytebuffernano.readRawVarint32();
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (androidId != 0L)
            {
                codedoutputbytebuffernano.writeInt64(1, androidId);
            }
            if (!loggingId.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, loggingId);
            }
            if (sdkVersion != 0)
            {
                codedoutputbytebuffernano.writeInt32(3, sdkVersion);
            }
            if (!model.equals(""))
            {
                codedoutputbytebuffernano.writeString(4, model);
            }
            if (!product.equals(""))
            {
                codedoutputbytebuffernano.writeString(5, product);
            }
            if (!osBuild.equals(""))
            {
                codedoutputbytebuffernano.writeString(6, osBuild);
            }
            if (!applicationBuild.equals(""))
            {
                codedoutputbytebuffernano.writeString(7, applicationBuild);
            }
            if (!hardware.equals(""))
            {
                codedoutputbytebuffernano.writeString(8, hardware);
            }
            if (!device.equals(""))
            {
                codedoutputbytebuffernano.writeString(9, device);
            }
            if (!mccMnc.equals(""))
            {
                codedoutputbytebuffernano.writeString(10, mccMnc);
            }
            if (!locale.equals(""))
            {
                codedoutputbytebuffernano.writeString(11, locale);
            }
            if (!country.equals(""))
            {
                codedoutputbytebuffernano.writeString(12, country);
            }
            if (!manufacturer.equals(""))
            {
                codedoutputbytebuffernano.writeString(13, manufacturer);
            }
            if (!brand.equals(""))
            {
                codedoutputbytebuffernano.writeString(14, brand);
            }
            if (!board.equals(""))
            {
                codedoutputbytebuffernano.writeString(15, board);
            }
            if (!radioVersion.equals(""))
            {
                codedoutputbytebuffernano.writeString(16, radioVersion);
            }
            if (!fingerprint.equals(""))
            {
                codedoutputbytebuffernano.writeString(17, fingerprint);
            }
            if (deviceId != 0L)
            {
                codedoutputbytebuffernano.writeInt64(18, deviceId);
            }
            if (gmsCoreVersionCode != 0)
            {
                codedoutputbytebuffernano.writeInt32(19, gmsCoreVersionCode);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public AndroidClientInfo()
        {
            androidId = 0L;
            loggingId = "";
            deviceId = 0L;
            sdkVersion = 0;
            model = "";
            product = "";
            hardware = "";
            device = "";
            osBuild = "";
            applicationBuild = "";
            mccMnc = "";
            locale = "";
            country = "";
            manufacturer = "";
            brand = "";
            board = "";
            radioVersion = "";
            fingerprint = "";
            gmsCoreVersionCode = 0;
            cachedSize = -1;
        }
    }

    public static final class AppUsage1pLogEvent extends MessageNano
    {

        public String androidPackageName;
        public int appType;
        public String version;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (appType != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, appType);
            }
            j = i;
            if (!androidPackageName.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, androidPackageName);
            }
            i = j;
            if (!version.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, version);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 56
        //                       8: 58
        //                       18: 199
        //                       26: 210;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
            case 23: // '\027'
            case 24: // '\030'
            case 25: // '\031'
            case 26: // '\032'
                appType = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            androidPackageName = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L5:
            version = codedinputbytebuffernano.readString();
            if (true) goto _L6; else goto _L7
_L7:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (appType != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, appType);
            }
            if (!androidPackageName.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, androidPackageName);
            }
            if (!version.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, version);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public AppUsage1pLogEvent()
        {
            appType = 0;
            androidPackageName = "";
            version = "";
            cachedSize = -1;
        }
    }

    public static final class ClientInfo extends MessageNano
    {

        public AndroidClientInfo androidClientInfo;
        public int clientType;
        public DesktopClientInfo desktopClientInfo;
        public IosClientInfo iosClientInfo;
        public PlayCeClientInfo playCeClientInfo;
        public String remoteHost;
        public String remoteHost6;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (clientType != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, clientType);
            }
            j = i;
            if (androidClientInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, androidClientInfo);
            }
            i = j;
            if (desktopClientInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, desktopClientInfo);
            }
            j = i;
            if (iosClientInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, iosClientInfo);
            }
            i = j;
            if (playCeClientInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, playCeClientInfo);
            }
            j = i;
            if (!remoteHost.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, remoteHost);
            }
            i = j;
            if (!remoteHost6.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(7, remoteHost6);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L10:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 8: default 80
        //                       0: 88
        //                       8: 90
        //                       18: 151
        //                       26: 180
        //                       34: 209
        //                       42: 238
        //                       50: 267
        //                       58: 278;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L10; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
                clientType = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (androidClientInfo == null)
            {
                androidClientInfo = new AndroidClientInfo();
            }
            codedinputbytebuffernano.readMessage(androidClientInfo);
            continue; /* Loop/switch isn't completed */
_L5:
            if (desktopClientInfo == null)
            {
                desktopClientInfo = new DesktopClientInfo();
            }
            codedinputbytebuffernano.readMessage(desktopClientInfo);
            continue; /* Loop/switch isn't completed */
_L6:
            if (iosClientInfo == null)
            {
                iosClientInfo = new IosClientInfo();
            }
            codedinputbytebuffernano.readMessage(iosClientInfo);
            continue; /* Loop/switch isn't completed */
_L7:
            if (playCeClientInfo == null)
            {
                playCeClientInfo = new PlayCeClientInfo();
            }
            codedinputbytebuffernano.readMessage(playCeClientInfo);
            continue; /* Loop/switch isn't completed */
_L8:
            remoteHost = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L9:
            remoteHost6 = codedinputbytebuffernano.readString();
            if (true) goto _L10; else goto _L11
_L11:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (clientType != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, clientType);
            }
            if (androidClientInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(2, androidClientInfo);
            }
            if (desktopClientInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(3, desktopClientInfo);
            }
            if (iosClientInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(4, iosClientInfo);
            }
            if (playCeClientInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(5, playCeClientInfo);
            }
            if (!remoteHost.equals(""))
            {
                codedoutputbytebuffernano.writeString(6, remoteHost);
            }
            if (!remoteHost6.equals(""))
            {
                codedoutputbytebuffernano.writeString(7, remoteHost6);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ClientInfo()
        {
            clientType = 0;
            remoteHost = "";
            remoteHost6 = "";
            androidClientInfo = null;
            desktopClientInfo = null;
            iosClientInfo = null;
            playCeClientInfo = null;
            cachedSize = -1;
        }
    }

    public static final class DesktopClientInfo extends MessageNano
    {

        public String applicationBuild;
        public String clientId;
        public String loggingId;
        public String os;
        public String osFullVersion;
        public String osMajorVersion;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (!clientId.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, clientId);
            }
            j = i;
            if (!loggingId.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, loggingId);
            }
            i = j;
            if (!os.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, os);
            }
            j = i;
            if (!osMajorVersion.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, osMajorVersion);
            }
            i = j;
            if (!osFullVersion.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, osFullVersion);
            }
            j = i;
            if (!applicationBuild.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, applicationBuild);
            }
            return j;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    clientId = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    loggingId = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    os = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    osMajorVersion = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    osFullVersion = codedinputbytebuffernano.readString();
                    break;

                case 50: // '2'
                    applicationBuild = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (!clientId.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, clientId);
            }
            if (!loggingId.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, loggingId);
            }
            if (!os.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, os);
            }
            if (!osMajorVersion.equals(""))
            {
                codedoutputbytebuffernano.writeString(4, osMajorVersion);
            }
            if (!osFullVersion.equals(""))
            {
                codedoutputbytebuffernano.writeString(5, osFullVersion);
            }
            if (!applicationBuild.equals(""))
            {
                codedoutputbytebuffernano.writeString(6, applicationBuild);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DesktopClientInfo()
        {
            clientId = "";
            loggingId = "";
            os = "";
            osMajorVersion = "";
            osFullVersion = "";
            applicationBuild = "";
            cachedSize = -1;
        }
    }

    public static final class ExperimentIdList extends MessageNano
    {

        public String id[];

        protected final int computeSerializedSize()
        {
            int j1 = super.computeSerializedSize();
            int i = j1;
            if (id != null)
            {
                i = j1;
                if (id.length > 0)
                {
                    int l = 0;
                    int j = 0;
                    for (i = 0; i < id.length;)
                    {
                        String s = id[i];
                        int i1 = l;
                        int k = j;
                        if (s != null)
                        {
                            i1 = l + 1;
                            k = j + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        i++;
                        l = i1;
                        j = k;
                    }

                    i = j1 + j + l * 1;
                }
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 10);
                    String as[];
                    int j;
                    if (id == null)
                    {
                        j = 0;
                    } else
                    {
                        j = id.length;
                    }
                    as = new String[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(id, 0, as, 0, j);
                        k = j;
                    }
                    for (; k < as.length - 1; k++)
                    {
                        as[k] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[k] = codedinputbytebuffernano.readString();
                    id = as;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (id != null && id.length > 0)
            {
                for (int i = 0; i < id.length; i++)
                {
                    String s = id[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(1, s);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ExperimentIdList()
        {
            id = WireFormatNano.EMPTY_STRING_ARRAY;
            cachedSize = -1;
        }
    }

    public static final class ExperimentIds extends MessageNano
    {

        public byte clearBlob[];
        public byte encryptedBlob[][];
        public boolean usersMatch;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (!Arrays.equals(clearBlob, WireFormatNano.EMPTY_BYTES))
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(1, clearBlob);
            }
            j = i;
            if (encryptedBlob != null)
            {
                j = i;
                if (encryptedBlob.length > 0)
                {
                    int i1 = 0;
                    int k = 0;
                    for (j = 0; j < encryptedBlob.length;)
                    {
                        byte abyte0[] = encryptedBlob[j];
                        int j1 = i1;
                        int l = k;
                        if (abyte0 != null)
                        {
                            j1 = i1 + 1;
                            l = k + CodedOutputByteBufferNano.computeBytesSizeNoTag(abyte0);
                        }
                        j++;
                        i1 = j1;
                        k = l;
                    }

                    j = i + k + i1 * 1;
                }
            }
            i = j;
            if (usersMatch)
            {
                i = j + (CodedOutputByteBufferNano.computeTagSize(3) + 1);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    clearBlob = codedinputbytebuffernano.readBytes();
                    break;

                case 18: // '\022'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    byte abyte0[][];
                    int j;
                    if (encryptedBlob == null)
                    {
                        j = 0;
                    } else
                    {
                        j = encryptedBlob.length;
                    }
                    abyte0 = new byte[k + j][];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(encryptedBlob, 0, abyte0, 0, j);
                        k = j;
                    }
                    for (; k < abyte0.length - 1; k++)
                    {
                        abyte0[k] = codedinputbytebuffernano.readBytes();
                        codedinputbytebuffernano.readTag();
                    }

                    abyte0[k] = codedinputbytebuffernano.readBytes();
                    encryptedBlob = abyte0;
                    break;

                case 24: // '\030'
                    usersMatch = codedinputbytebuffernano.readBool();
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (!Arrays.equals(clearBlob, WireFormatNano.EMPTY_BYTES))
            {
                codedoutputbytebuffernano.writeBytes(1, clearBlob);
            }
            if (encryptedBlob != null && encryptedBlob.length > 0)
            {
                for (int i = 0; i < encryptedBlob.length; i++)
                {
                    byte abyte0[] = encryptedBlob[i];
                    if (abyte0 != null)
                    {
                        codedoutputbytebuffernano.writeBytes(2, abyte0);
                    }
                }

            }
            if (usersMatch)
            {
                codedoutputbytebuffernano.writeBool(3, usersMatch);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public ExperimentIds()
        {
            clearBlob = WireFormatNano.EMPTY_BYTES;
            encryptedBlob = WireFormatNano.EMPTY_BYTES_ARRAY;
            usersMatch = false;
            cachedSize = -1;
        }
    }

    public static final class IosClientInfo extends MessageNano
    {

        public String applicationBuild;
        public String clientId;
        public String loggingId;
        public String osFullVersion;
        public String osMajorVersion;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (!clientId.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, clientId);
            }
            j = i;
            if (!loggingId.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, loggingId);
            }
            i = j;
            if (!osMajorVersion.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, osMajorVersion);
            }
            j = i;
            if (!osFullVersion.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, osFullVersion);
            }
            i = j;
            if (!applicationBuild.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, applicationBuild);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    clientId = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    loggingId = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    osMajorVersion = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    osFullVersion = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    applicationBuild = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (!clientId.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, clientId);
            }
            if (!loggingId.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, loggingId);
            }
            if (!osMajorVersion.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, osMajorVersion);
            }
            if (!osFullVersion.equals(""))
            {
                codedoutputbytebuffernano.writeString(4, osFullVersion);
            }
            if (!applicationBuild.equals(""))
            {
                codedoutputbytebuffernano.writeString(5, applicationBuild);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public IosClientInfo()
        {
            clientId = "";
            loggingId = "";
            osMajorVersion = "";
            osFullVersion = "";
            applicationBuild = "";
            cachedSize = -1;
        }
    }

    public static final class LogEvent extends MessageNano
    {

        private static volatile LogEvent _emptyArray[];
        public AppUsage1pLogEvent appUsage1P;
        public byte clientVe[];
        public int eventCode;
        public int eventFlowId;
        public long eventTimeMs;
        public long eventUptimeMs;
        public ActiveExperiments exp;
        public ExperimentIds experimentIds;
        public boolean isUserInitiated;
        public byte sourceExtension[];
        public byte sourceExtensionJs[];
        public byte sourceExtensionJson[];
        public String tag;
        public String testId;
        public long timezoneOffsetSeconds;
        public LogEventKeyValues value[];

        public static LogEvent[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new LogEvent[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final LogEvent clear()
        {
            eventTimeMs = 0L;
            eventUptimeMs = 0L;
            tag = "";
            eventCode = 0;
            eventFlowId = 0;
            isUserInitiated = false;
            value = LogEventKeyValues.emptyArray();
            appUsage1P = null;
            sourceExtension = WireFormatNano.EMPTY_BYTES;
            sourceExtensionJs = WireFormatNano.EMPTY_BYTES;
            sourceExtensionJson = WireFormatNano.EMPTY_BYTES;
            exp = null;
            testId = "";
            timezoneOffsetSeconds = 0x2bf20L;
            experimentIds = null;
            clientVe = WireFormatNano.EMPTY_BYTES;
            cachedSize = -1;
            return this;
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (eventTimeMs != 0L)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(1, eventTimeMs);
            }
            i = j;
            if (!tag.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(2, tag);
            }
            j = i;
            if (value != null)
            {
                j = i;
                if (value.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= value.length)
                        {
                            break;
                        }
                        LogEventKeyValues logeventkeyvalues = value[k];
                        j = i;
                        if (logeventkeyvalues != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(3, logeventkeyvalues);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (!Arrays.equals(sourceExtension, WireFormatNano.EMPTY_BYTES))
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(6, sourceExtension);
            }
            j = i;
            if (exp != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(7, exp);
            }
            i = j;
            if (!Arrays.equals(sourceExtensionJs, WireFormatNano.EMPTY_BYTES))
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(8, sourceExtensionJs);
            }
            j = i;
            if (appUsage1P != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(9, appUsage1P);
            }
            i = j;
            if (isUserInitiated)
            {
                i = j + (CodedOutputByteBufferNano.computeTagSize(10) + 1);
            }
            j = i;
            if (eventCode != 0)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(11, eventCode);
            }
            i = j;
            if (eventFlowId != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(12, eventFlowId);
            }
            j = i;
            if (!Arrays.equals(sourceExtensionJson, WireFormatNano.EMPTY_BYTES))
            {
                j = i + CodedOutputByteBufferNano.computeBytesSize(13, sourceExtensionJson);
            }
            i = j;
            if (!testId.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(14, testId);
            }
            j = i;
            if (timezoneOffsetSeconds != 0x2bf20L)
            {
                j = i + CodedOutputByteBufferNano.computeSInt64Size(15, timezoneOffsetSeconds);
            }
            i = j;
            if (experimentIds != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(16, experimentIds);
            }
            j = i;
            if (eventUptimeMs != 0L)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(17, eventUptimeMs);
            }
            i = j;
            if (!Arrays.equals(clientVe, WireFormatNano.EMPTY_BYTES))
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(18, clientVe);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 8: // '\b'
                    eventTimeMs = codedinputbytebuffernano.readRawVarint64();
                    break;

                case 18: // '\022'
                    tag = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    LogEventKeyValues alogeventkeyvalues[];
                    int j;
                    if (value == null)
                    {
                        j = 0;
                    } else
                    {
                        j = value.length;
                    }
                    alogeventkeyvalues = new LogEventKeyValues[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(value, 0, alogeventkeyvalues, 0, j);
                        k = j;
                    }
                    for (; k < alogeventkeyvalues.length - 1; k++)
                    {
                        alogeventkeyvalues[k] = new LogEventKeyValues();
                        codedinputbytebuffernano.readMessage(alogeventkeyvalues[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    alogeventkeyvalues[k] = new LogEventKeyValues();
                    codedinputbytebuffernano.readMessage(alogeventkeyvalues[k]);
                    value = alogeventkeyvalues;
                    break;

                case 50: // '2'
                    sourceExtension = codedinputbytebuffernano.readBytes();
                    break;

                case 58: // ':'
                    if (exp == null)
                    {
                        exp = new ActiveExperiments();
                    }
                    codedinputbytebuffernano.readMessage(exp);
                    break;

                case 66: // 'B'
                    sourceExtensionJs = codedinputbytebuffernano.readBytes();
                    break;

                case 74: // 'J'
                    if (appUsage1P == null)
                    {
                        appUsage1P = new AppUsage1pLogEvent();
                    }
                    codedinputbytebuffernano.readMessage(appUsage1P);
                    break;

                case 80: // 'P'
                    isUserInitiated = codedinputbytebuffernano.readBool();
                    break;

                case 88: // 'X'
                    eventCode = codedinputbytebuffernano.readRawVarint32();
                    break;

                case 96: // '`'
                    eventFlowId = codedinputbytebuffernano.readRawVarint32();
                    break;

                case 106: // 'j'
                    sourceExtensionJson = codedinputbytebuffernano.readBytes();
                    break;

                case 114: // 'r'
                    testId = codedinputbytebuffernano.readString();
                    break;

                case 120: // 'x'
                    timezoneOffsetSeconds = codedinputbytebuffernano.readSInt64();
                    break;

                case 130: 
                    if (experimentIds == null)
                    {
                        experimentIds = new ExperimentIds();
                    }
                    codedinputbytebuffernano.readMessage(experimentIds);
                    break;

                case 136: 
                    eventUptimeMs = codedinputbytebuffernano.readRawVarint64();
                    break;

                case 146: 
                    clientVe = codedinputbytebuffernano.readBytes();
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (eventTimeMs != 0L)
            {
                codedoutputbytebuffernano.writeInt64(1, eventTimeMs);
            }
            if (!tag.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, tag);
            }
            if (value != null && value.length > 0)
            {
                for (int i = 0; i < value.length; i++)
                {
                    LogEventKeyValues logeventkeyvalues = value[i];
                    if (logeventkeyvalues != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, logeventkeyvalues);
                    }
                }

            }
            if (!Arrays.equals(sourceExtension, WireFormatNano.EMPTY_BYTES))
            {
                codedoutputbytebuffernano.writeBytes(6, sourceExtension);
            }
            if (exp != null)
            {
                codedoutputbytebuffernano.writeMessage(7, exp);
            }
            if (!Arrays.equals(sourceExtensionJs, WireFormatNano.EMPTY_BYTES))
            {
                codedoutputbytebuffernano.writeBytes(8, sourceExtensionJs);
            }
            if (appUsage1P != null)
            {
                codedoutputbytebuffernano.writeMessage(9, appUsage1P);
            }
            if (isUserInitiated)
            {
                codedoutputbytebuffernano.writeBool(10, isUserInitiated);
            }
            if (eventCode != 0)
            {
                codedoutputbytebuffernano.writeInt32(11, eventCode);
            }
            if (eventFlowId != 0)
            {
                codedoutputbytebuffernano.writeInt32(12, eventFlowId);
            }
            if (!Arrays.equals(sourceExtensionJson, WireFormatNano.EMPTY_BYTES))
            {
                codedoutputbytebuffernano.writeBytes(13, sourceExtensionJson);
            }
            if (!testId.equals(""))
            {
                codedoutputbytebuffernano.writeString(14, testId);
            }
            if (timezoneOffsetSeconds != 0x2bf20L)
            {
                codedoutputbytebuffernano.writeSInt64(15, timezoneOffsetSeconds);
            }
            if (experimentIds != null)
            {
                codedoutputbytebuffernano.writeMessage(16, experimentIds);
            }
            if (eventUptimeMs != 0L)
            {
                codedoutputbytebuffernano.writeInt64(17, eventUptimeMs);
            }
            if (!Arrays.equals(clientVe, WireFormatNano.EMPTY_BYTES))
            {
                codedoutputbytebuffernano.writeBytes(18, clientVe);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LogEvent()
        {
            clear();
        }
    }

    public static final class LogEventKeyValues extends MessageNano
    {

        private static volatile LogEventKeyValues _emptyArray[];
        public String key;
        public String value;

        public static LogEventKeyValues[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new LogEventKeyValues[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final LogEventKeyValues clear()
        {
            key = "";
            value = "";
            cachedSize = -1;
            return this;
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (!key.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, key);
            }
            j = i;
            if (!value.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, value);
            }
            return j;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    key = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    value = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (!key.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, key);
            }
            if (!value.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, value);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LogEventKeyValues()
        {
            clear();
        }
    }

    public static final class LogRequest extends MessageNano
    {

        public ClientInfo clientInfo;
        public LogEvent logEvent[];
        public int logSource;
        public String logSourceName;
        public long requestTimeMs;
        public long requestUptimeMs;
        public byte serializedLogEvents[][];
        public String zwiebackCookie;

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (clientInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(1, clientInfo);
            }
            i = j;
            if (logSource != -1)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(2, logSource);
            }
            j = i;
            if (logEvent != null)
            {
                j = i;
                if (logEvent.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= logEvent.length)
                        {
                            break;
                        }
                        LogEvent logevent = logEvent[k];
                        j = i;
                        if (logevent != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(3, logevent);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (requestTimeMs != 0L)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(4, requestTimeMs);
            }
            j = i;
            if (serializedLogEvents != null)
            {
                j = i;
                if (serializedLogEvents.length > 0)
                {
                    int j1 = 0;
                    int l = 0;
                    for (j = 0; j < serializedLogEvents.length;)
                    {
                        byte abyte0[] = serializedLogEvents[j];
                        int k1 = j1;
                        int i1 = l;
                        if (abyte0 != null)
                        {
                            k1 = j1 + 1;
                            i1 = l + CodedOutputByteBufferNano.computeBytesSizeNoTag(abyte0);
                        }
                        j++;
                        j1 = k1;
                        l = i1;
                    }

                    j = i + l + j1 * 1;
                }
            }
            i = j;
            if (!logSourceName.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(6, logSourceName);
            }
            j = i;
            if (!zwiebackCookie.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(7, zwiebackCookie);
            }
            i = j;
            if (requestUptimeMs != 0L)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(8, requestUptimeMs);
            }
            return i;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L11:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 9: default 88
        //                       0: 96
        //                       10: 98
        //                       16: 127
        //                       26: 515
        //                       32: 639
        //                       42: 650
        //                       50: 752
        //                       58: 763
        //                       64: 774;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L11; else goto _L2
_L2:
            return this;
_L3:
            if (clientInfo == null)
            {
                clientInfo = new ClientInfo();
            }
            codedinputbytebuffernano.readMessage(clientInfo);
              goto _L11
_L4:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case -1: 
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
            case 23: // '\027'
            case 24: // '\030'
            case 25: // '\031'
            case 26: // '\032'
            case 27: // '\033'
            case 28: // '\034'
            case 29: // '\035'
            case 30: // '\036'
            case 31: // '\037'
            case 32: // ' '
            case 33: // '!'
            case 34: // '"'
            case 35: // '#'
            case 36: // '$'
            case 37: // '%'
            case 38: // '&'
            case 39: // '\''
            case 40: // '('
            case 41: // ')'
            case 42: // '*'
            case 43: // '+'
            case 44: // ','
            case 45: // '-'
            case 46: // '.'
            case 47: // '/'
            case 48: // '0'
            case 49: // '1'
            case 50: // '2'
            case 51: // '3'
            case 52: // '4'
            case 53: // '5'
            case 54: // '6'
            case 55: // '7'
            case 56: // '8'
            case 57: // '9'
            case 58: // ':'
            case 59: // ';'
            case 60: // '<'
            case 61: // '='
            case 62: // '>'
            case 63: // '?'
            case 64: // '@'
            case 65: // 'A'
            case 66: // 'B'
            case 67: // 'C'
            case 68: // 'D'
            case 69: // 'E'
            case 70: // 'F'
            case 71: // 'G'
            case 72: // 'H'
            case 73: // 'I'
            case 74: // 'J'
            case 75: // 'K'
            case 76: // 'L'
            case 77: // 'M'
            case 78: // 'N'
            case 79: // 'O'
            case 80: // 'P'
            case 81: // 'Q'
            case 82: // 'R'
            case 83: // 'S'
            case 84: // 'T'
            case 85: // 'U'
            case 86: // 'V'
            case 87: // 'W'
                logSource = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
            LogEvent alogevent[];
            int k;
            if (logEvent == null)
            {
                k = 0;
            } else
            {
                k = logEvent.length;
            }
            alogevent = new LogEvent[i1 + k];
            i1 = k;
            if (k != 0)
            {
                System.arraycopy(logEvent, 0, alogevent, 0, k);
                i1 = k;
            }
            for (; i1 < alogevent.length - 1; i1++)
            {
                alogevent[i1] = new LogEvent();
                codedinputbytebuffernano.readMessage(alogevent[i1]);
                codedinputbytebuffernano.readTag();
            }

            alogevent[i1] = new LogEvent();
            codedinputbytebuffernano.readMessage(alogevent[i1]);
            logEvent = alogevent;
            continue; /* Loop/switch isn't completed */
_L6:
            requestTimeMs = codedinputbytebuffernano.readRawVarint64();
            continue; /* Loop/switch isn't completed */
_L7:
            int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
            byte abyte0[][];
            int l;
            if (serializedLogEvents == null)
            {
                l = 0;
            } else
            {
                l = serializedLogEvents.length;
            }
            abyte0 = new byte[j1 + l][];
            j1 = l;
            if (l != 0)
            {
                System.arraycopy(serializedLogEvents, 0, abyte0, 0, l);
                j1 = l;
            }
            for (; j1 < abyte0.length - 1; j1++)
            {
                abyte0[j1] = codedinputbytebuffernano.readBytes();
                codedinputbytebuffernano.readTag();
            }

            abyte0[j1] = codedinputbytebuffernano.readBytes();
            serializedLogEvents = abyte0;
            continue; /* Loop/switch isn't completed */
_L8:
            logSourceName = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L9:
            zwiebackCookie = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L10:
            requestUptimeMs = codedinputbytebuffernano.readRawVarint64();
            if (true) goto _L11; else goto _L12
_L12:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (clientInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(1, clientInfo);
            }
            if (logSource != -1)
            {
                codedoutputbytebuffernano.writeInt32(2, logSource);
            }
            if (logEvent != null && logEvent.length > 0)
            {
                for (int i = 0; i < logEvent.length; i++)
                {
                    LogEvent logevent = logEvent[i];
                    if (logevent != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, logevent);
                    }
                }

            }
            if (requestTimeMs != 0L)
            {
                codedoutputbytebuffernano.writeInt64(4, requestTimeMs);
            }
            if (serializedLogEvents != null && serializedLogEvents.length > 0)
            {
                for (int j = 0; j < serializedLogEvents.length; j++)
                {
                    byte abyte0[] = serializedLogEvents[j];
                    if (abyte0 != null)
                    {
                        codedoutputbytebuffernano.writeBytes(5, abyte0);
                    }
                }

            }
            if (!logSourceName.equals(""))
            {
                codedoutputbytebuffernano.writeString(6, logSourceName);
            }
            if (!zwiebackCookie.equals(""))
            {
                codedoutputbytebuffernano.writeString(7, zwiebackCookie);
            }
            if (requestUptimeMs != 0L)
            {
                codedoutputbytebuffernano.writeInt64(8, requestUptimeMs);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LogRequest()
        {
            requestTimeMs = 0L;
            requestUptimeMs = 0L;
            clientInfo = null;
            logSource = -1;
            logSourceName = "";
            zwiebackCookie = "";
            logEvent = LogEvent.emptyArray();
            serializedLogEvents = WireFormatNano.EMPTY_BYTES_ARRAY;
            cachedSize = -1;
        }
    }

    public static final class LogResponse extends MessageNano
    {

        public ExperimentIdList experiments;
        public long nextRequestWaitMillis;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (nextRequestWaitMillis != -1L)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, nextRequestWaitMillis);
            }
            j = i;
            if (experiments != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, experiments);
            }
            return j;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 8: // '\b'
                    nextRequestWaitMillis = codedinputbytebuffernano.readRawVarint64();
                    break;

                case 18: // '\022'
                    if (experiments == null)
                    {
                        experiments = new ExperimentIdList();
                    }
                    codedinputbytebuffernano.readMessage(experiments);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (nextRequestWaitMillis != -1L)
            {
                codedoutputbytebuffernano.writeInt64(1, nextRequestWaitMillis);
            }
            if (experiments != null)
            {
                codedoutputbytebuffernano.writeMessage(2, experiments);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LogResponse()
        {
            nextRequestWaitMillis = -1L;
            experiments = null;
            cachedSize = -1;
        }
    }

    public static final class PlayCeClientInfo extends MessageNano
    {

        public String applicationBuild;
        public String clientId;
        public String loggingId;
        public String make;
        public String model;
        public String platformVersion;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (!clientId.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, clientId);
            }
            j = i;
            if (!make.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(3, make);
            }
            i = j;
            if (!model.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(4, model);
            }
            j = i;
            if (!applicationBuild.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(5, applicationBuild);
            }
            i = j;
            if (!platformVersion.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(6, platformVersion);
            }
            j = i;
            if (!loggingId.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(7, loggingId);
            }
            return j;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
            do
            {
                int i = codedinputbytebuffernano.readTag();
                switch (i)
                {
                default:
                    if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    clientId = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    make = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    model = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    applicationBuild = codedinputbytebuffernano.readString();
                    break;

                case 50: // '2'
                    platformVersion = codedinputbytebuffernano.readString();
                    break;

                case 58: // ':'
                    loggingId = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (!clientId.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, clientId);
            }
            if (!make.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, make);
            }
            if (!model.equals(""))
            {
                codedoutputbytebuffernano.writeString(4, model);
            }
            if (!applicationBuild.equals(""))
            {
                codedoutputbytebuffernano.writeString(5, applicationBuild);
            }
            if (!platformVersion.equals(""))
            {
                codedoutputbytebuffernano.writeString(6, platformVersion);
            }
            if (!loggingId.equals(""))
            {
                codedoutputbytebuffernano.writeString(7, loggingId);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlayCeClientInfo()
        {
            clientId = "";
            loggingId = "";
            make = "";
            model = "";
            applicationBuild = "";
            platformVersion = "";
            cachedSize = -1;
        }
    }

}
