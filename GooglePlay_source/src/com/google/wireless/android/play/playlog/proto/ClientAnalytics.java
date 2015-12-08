// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wireless.android.play.playlog.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.FieldArray;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

public interface ClientAnalytics
{
    public static final class ActiveExperiments extends ExtendableMessageNano
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

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof ActiveExperiments))
                {
                    return false;
                }
                obj = (ActiveExperiments)obj;
                if (!InternalNano.equals(clientAlteringExperiment, ((ActiveExperiments) (obj)).clientAlteringExperiment))
                {
                    return false;
                }
                if (!InternalNano.equals(otherExperiment, ((ActiveExperiments) (obj)).otherExperiment))
                {
                    return false;
                }
                if (!InternalNano.equals(gwsExperiment, ((ActiveExperiments) (obj)).gwsExperiment))
                {
                    return false;
                }
                if (!InternalNano.equals(playExperiment, ((ActiveExperiments) (obj)).playExperiment))
                {
                    return false;
                }
                if (unknownFieldData == null || unknownFieldData.isEmpty())
                {
                    if (((ActiveExperiments) (obj)).unknownFieldData != null && !((ActiveExperiments) (obj)).unknownFieldData.isEmpty())
                    {
                        return false;
                    }
                } else
                {
                    return unknownFieldData.equals(((ActiveExperiments) (obj)).unknownFieldData);
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int j = getClass().getName().hashCode();
            int k = InternalNano.hashCode(clientAlteringExperiment);
            int l = InternalNano.hashCode(otherExperiment);
            int i1 = InternalNano.hashCode(gwsExperiment);
            int j1 = InternalNano.hashCode(playExperiment);
            int i;
            if (unknownFieldData == null || unknownFieldData.isEmpty())
            {
                i = 0;
            } else
            {
                i = unknownFieldData.hashCode();
            }
            return i + (((((j + 527) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31;
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
                    if (storeUnknownField(codedinputbytebuffernano, i))
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
            unknownFieldData = null;
            cachedSize = -1;
        }
    }

    public static final class AppUsage1pLogEvent extends ExtendableMessageNano
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

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof AppUsage1pLogEvent))
                {
                    return false;
                }
                obj = (AppUsage1pLogEvent)obj;
                if (appType != ((AppUsage1pLogEvent) (obj)).appType)
                {
                    return false;
                }
                if (androidPackageName == null)
                {
                    if (((AppUsage1pLogEvent) (obj)).androidPackageName != null)
                    {
                        return false;
                    }
                } else
                if (!androidPackageName.equals(((AppUsage1pLogEvent) (obj)).androidPackageName))
                {
                    return false;
                }
                if (version == null)
                {
                    if (((AppUsage1pLogEvent) (obj)).version != null)
                    {
                        return false;
                    }
                } else
                if (!version.equals(((AppUsage1pLogEvent) (obj)).version))
                {
                    return false;
                }
                if (unknownFieldData == null || unknownFieldData.isEmpty())
                {
                    if (((AppUsage1pLogEvent) (obj)).unknownFieldData != null && !((AppUsage1pLogEvent) (obj)).unknownFieldData.isEmpty())
                    {
                        return false;
                    }
                } else
                {
                    return unknownFieldData.equals(((AppUsage1pLogEvent) (obj)).unknownFieldData);
                }
            }
            return true;
        }

        public final int hashCode()
        {
            boolean flag = false;
            int l = getClass().getName().hashCode();
            int i1 = appType;
            int i;
            int j;
            int k;
            if (androidPackageName == null)
            {
                i = 0;
            } else
            {
                i = androidPackageName.hashCode();
            }
            if (version == null)
            {
                j = 0;
            } else
            {
                j = version.hashCode();
            }
            k = ((flag) ? 1 : 0);
            if (unknownFieldData != null)
            {
                if (unknownFieldData.isEmpty())
                {
                    k = ((flag) ? 1 : 0);
                } else
                {
                    k = unknownFieldData.hashCode();
                }
            }
            return ((((l + 527) * 31 + i1) * 31 + i) * 31 + j) * 31 + k;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       8: 59
        //                       18: 199
        //                       26: 210;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
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
            unknownFieldData = null;
            cachedSize = -1;
        }
    }

    public static final class ExperimentIds extends ExtendableMessageNano
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

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof ExperimentIds))
                {
                    return false;
                }
                obj = (ExperimentIds)obj;
                if (!Arrays.equals(clearBlob, ((ExperimentIds) (obj)).clearBlob))
                {
                    return false;
                }
                if (!InternalNano.equals(encryptedBlob, ((ExperimentIds) (obj)).encryptedBlob))
                {
                    return false;
                }
                if (usersMatch != ((ExperimentIds) (obj)).usersMatch)
                {
                    return false;
                }
                if (unknownFieldData == null || unknownFieldData.isEmpty())
                {
                    if (((ExperimentIds) (obj)).unknownFieldData != null && !((ExperimentIds) (obj)).unknownFieldData.isEmpty())
                    {
                        return false;
                    }
                } else
                {
                    return unknownFieldData.equals(((ExperimentIds) (obj)).unknownFieldData);
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int j = getClass().getName().hashCode();
            int k = Arrays.hashCode(clearBlob);
            int l = InternalNano.hashCode(encryptedBlob);
            char c;
            int i;
            if (usersMatch)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            if (unknownFieldData == null || unknownFieldData.isEmpty())
            {
                i = 0;
            } else
            {
                i = unknownFieldData.hashCode();
            }
            return i + ((((j + 527) * 31 + k) * 31 + l) * 31 + c) * 31;
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
                    if (storeUnknownField(codedinputbytebuffernano, i))
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
            unknownFieldData = null;
            cachedSize = -1;
        }
    }

    public static final class LogEvent extends ExtendableMessageNano
    {

        public AppUsage1pLogEvent appUsage1P;
        public byte clientVe[];
        public int eventCode;
        public int eventFlowId;
        public long eventTimeMs;
        public long eventUptimeMs;
        public ActiveExperiments exp;
        public ExperimentIds experimentIds;
        public int internalEvent;
        public boolean isUserInitiated;
        public long sequencePosition;
        public byte sourceExtension[];
        public byte sourceExtensionJs[];
        public byte sourceExtensionJson[];
        public String tag;
        public int testCode[];
        public String testId;
        public long timezoneOffsetSeconds;
        public LogEventKeyValues value[];

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
            int l = j;
            if (!Arrays.equals(clientVe, WireFormatNano.EMPTY_BYTES))
            {
                l = j + CodedOutputByteBufferNano.computeBytesSize(18, clientVe);
            }
            i = l;
            if (internalEvent != 0)
            {
                i = l + CodedOutputByteBufferNano.computeInt32Size(19, internalEvent);
            }
            j = i;
            if (testCode != null)
            {
                j = i;
                if (testCode.length > 0)
                {
                    int i1 = 0;
                    for (j = 0; j < testCode.length; j++)
                    {
                        i1 += CodedOutputByteBufferNano.computeInt32SizeNoTag(testCode[j]);
                    }

                    j = i + i1 + testCode.length * 2;
                }
            }
            i = j;
            if (sequencePosition != 0L)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(21, sequencePosition);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof LogEvent))
                {
                    return false;
                }
                obj = (LogEvent)obj;
                if (eventTimeMs != ((LogEvent) (obj)).eventTimeMs)
                {
                    return false;
                }
                if (eventUptimeMs != ((LogEvent) (obj)).eventUptimeMs)
                {
                    return false;
                }
                if (sequencePosition != ((LogEvent) (obj)).sequencePosition)
                {
                    return false;
                }
                if (tag == null)
                {
                    if (((LogEvent) (obj)).tag != null)
                    {
                        return false;
                    }
                } else
                if (!tag.equals(((LogEvent) (obj)).tag))
                {
                    return false;
                }
                if (eventCode != ((LogEvent) (obj)).eventCode)
                {
                    return false;
                }
                if (eventFlowId != ((LogEvent) (obj)).eventFlowId)
                {
                    return false;
                }
                if (isUserInitiated != ((LogEvent) (obj)).isUserInitiated)
                {
                    return false;
                }
                if (!InternalNano.equals(value, ((LogEvent) (obj)).value))
                {
                    return false;
                }
                if (appUsage1P == null)
                {
                    if (((LogEvent) (obj)).appUsage1P != null)
                    {
                        return false;
                    }
                } else
                if (!appUsage1P.equals(((LogEvent) (obj)).appUsage1P))
                {
                    return false;
                }
                if (!Arrays.equals(sourceExtension, ((LogEvent) (obj)).sourceExtension))
                {
                    return false;
                }
                if (!Arrays.equals(sourceExtensionJs, ((LogEvent) (obj)).sourceExtensionJs))
                {
                    return false;
                }
                if (!Arrays.equals(sourceExtensionJson, ((LogEvent) (obj)).sourceExtensionJson))
                {
                    return false;
                }
                if (exp == null)
                {
                    if (((LogEvent) (obj)).exp != null)
                    {
                        return false;
                    }
                } else
                if (!exp.equals(((LogEvent) (obj)).exp))
                {
                    return false;
                }
                if (testId == null)
                {
                    if (((LogEvent) (obj)).testId != null)
                    {
                        return false;
                    }
                } else
                if (!testId.equals(((LogEvent) (obj)).testId))
                {
                    return false;
                }
                if (timezoneOffsetSeconds != ((LogEvent) (obj)).timezoneOffsetSeconds)
                {
                    return false;
                }
                if (experimentIds == null)
                {
                    if (((LogEvent) (obj)).experimentIds != null)
                    {
                        return false;
                    }
                } else
                if (!experimentIds.equals(((LogEvent) (obj)).experimentIds))
                {
                    return false;
                }
                if (!Arrays.equals(clientVe, ((LogEvent) (obj)).clientVe))
                {
                    return false;
                }
                if (internalEvent != ((LogEvent) (obj)).internalEvent)
                {
                    return false;
                }
                if (!InternalNano.equals(testCode, ((LogEvent) (obj)).testCode))
                {
                    return false;
                }
                if (unknownFieldData == null || unknownFieldData.isEmpty())
                {
                    if (((LogEvent) (obj)).unknownFieldData != null && !((LogEvent) (obj)).unknownFieldData.isEmpty())
                    {
                        return false;
                    }
                } else
                {
                    return unknownFieldData.equals(((LogEvent) (obj)).unknownFieldData);
                }
            }
            return true;
        }

        public final int hashCode()
        {
            boolean flag = false;
            int k1 = getClass().getName().hashCode();
            int l1 = (int)(eventTimeMs ^ eventTimeMs >>> 32);
            int i2 = (int)(eventUptimeMs ^ eventUptimeMs >>> 32);
            int j2 = (int)(sequencePosition ^ sequencePosition >>> 32);
            int i;
            char c;
            int j;
            int k;
            int l;
            int i1;
            int j1;
            int k2;
            int l2;
            int i3;
            int j3;
            int k3;
            int l3;
            int i4;
            int j4;
            int k4;
            int l4;
            if (tag == null)
            {
                i = 0;
            } else
            {
                i = tag.hashCode();
            }
            k2 = eventCode;
            l2 = eventFlowId;
            if (isUserInitiated)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            i3 = InternalNano.hashCode(value);
            if (appUsage1P == null)
            {
                j = 0;
            } else
            {
                j = appUsage1P.hashCode();
            }
            j3 = Arrays.hashCode(sourceExtension);
            k3 = Arrays.hashCode(sourceExtensionJs);
            l3 = Arrays.hashCode(sourceExtensionJson);
            if (exp == null)
            {
                k = 0;
            } else
            {
                k = exp.hashCode();
            }
            if (testId == null)
            {
                l = 0;
            } else
            {
                l = testId.hashCode();
            }
            i4 = (int)(timezoneOffsetSeconds ^ timezoneOffsetSeconds >>> 32);
            if (experimentIds == null)
            {
                i1 = 0;
            } else
            {
                i1 = experimentIds.hashCode();
            }
            j4 = Arrays.hashCode(clientVe);
            k4 = internalEvent;
            l4 = InternalNano.hashCode(testCode);
            j1 = ((flag) ? 1 : 0);
            if (unknownFieldData != null)
            {
                if (unknownFieldData.isEmpty())
                {
                    j1 = ((flag) ? 1 : 0);
                } else
                {
                    j1 = unknownFieldData.hashCode();
                }
            }
            return ((((((((((((((((((((k1 + 527) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + i) * 31 + k2) * 31 + l2) * 31 + c) * 31 + i3) * 31 + j) * 31 + j3) * 31 + k3) * 31 + l3) * 31 + k) * 31 + l) * 31 + i4) * 31 + i1) * 31 + j4) * 31 + k4) * 31 + l4) * 31 + j1;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L23:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 21: default 184
        //                       0: 193
        //                       8: 195
        //                       18: 206
        //                       26: 217
        //                       50: 341
        //                       58: 352
        //                       66: 381
        //                       74: 392
        //                       80: 421
        //                       88: 432
        //                       96: 443
        //                       106: 454
        //                       114: 465
        //                       120: 476
        //                       130: 487
        //                       136: 516
        //                       146: 527
        //                       152: 538
        //                       160: 583
        //                       162: 685
        //                       168: 813;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L1:
            if (storeUnknownField(codedinputbytebuffernano, i)) goto _L23; else goto _L2
_L2:
            return this;
_L3:
            eventTimeMs = codedinputbytebuffernano.readRawVarint64();
              goto _L23
_L4:
            tag = codedinputbytebuffernano.readString();
              goto _L23
_L5:
            int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
            LogEventKeyValues alogeventkeyvalues[];
            int j;
            if (value == null)
            {
                j = 0;
            } else
            {
                j = value.length;
            }
            alogeventkeyvalues = new LogEventKeyValues[j1 + j];
            j1 = j;
            if (j != 0)
            {
                System.arraycopy(value, 0, alogeventkeyvalues, 0, j);
                j1 = j;
            }
            for (; j1 < alogeventkeyvalues.length - 1; j1++)
            {
                alogeventkeyvalues[j1] = new LogEventKeyValues();
                codedinputbytebuffernano.readMessage(alogeventkeyvalues[j1]);
                codedinputbytebuffernano.readTag();
            }

            alogeventkeyvalues[j1] = new LogEventKeyValues();
            codedinputbytebuffernano.readMessage(alogeventkeyvalues[j1]);
            value = alogeventkeyvalues;
              goto _L23
_L6:
            sourceExtension = codedinputbytebuffernano.readBytes();
              goto _L23
_L7:
            if (exp == null)
            {
                exp = new ActiveExperiments();
            }
            codedinputbytebuffernano.readMessage(exp);
              goto _L23
_L8:
            sourceExtensionJs = codedinputbytebuffernano.readBytes();
              goto _L23
_L9:
            if (appUsage1P == null)
            {
                appUsage1P = new AppUsage1pLogEvent();
            }
            codedinputbytebuffernano.readMessage(appUsage1P);
              goto _L23
_L10:
            isUserInitiated = codedinputbytebuffernano.readBool();
              goto _L23
_L11:
            eventCode = codedinputbytebuffernano.readRawVarint32();
              goto _L23
_L12:
            eventFlowId = codedinputbytebuffernano.readRawVarint32();
              goto _L23
_L13:
            sourceExtensionJson = codedinputbytebuffernano.readBytes();
              goto _L23
_L14:
            testId = codedinputbytebuffernano.readString();
              goto _L23
_L15:
            timezoneOffsetSeconds = codedinputbytebuffernano.readSInt64();
              goto _L23
_L16:
            if (experimentIds == null)
            {
                experimentIds = new ExperimentIds();
            }
            codedinputbytebuffernano.readMessage(experimentIds);
              goto _L23
_L17:
            eventUptimeMs = codedinputbytebuffernano.readRawVarint64();
              goto _L23
_L18:
            clientVe = codedinputbytebuffernano.readBytes();
              goto _L23
_L19:
            int k = codedinputbytebuffernano.readRawVarint32();
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                internalEvent = k;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L20:
            int k1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 160);
            int ai[];
            int l;
            if (testCode == null)
            {
                l = 0;
            } else
            {
                l = testCode.length;
            }
            ai = new int[k1 + l];
            k1 = l;
            if (l != 0)
            {
                System.arraycopy(testCode, 0, ai, 0, l);
                k1 = l;
            }
            for (; k1 < ai.length - 1; k1++)
            {
                ai[k1] = codedinputbytebuffernano.readRawVarint32();
                codedinputbytebuffernano.readTag();
            }

            ai[k1] = codedinputbytebuffernano.readRawVarint32();
            testCode = ai;
            continue; /* Loop/switch isn't completed */
_L21:
            int i2 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
            int i1 = codedinputbytebuffernano.getPosition();
            int l1;
            for (l1 = 0; codedinputbytebuffernano.getBytesUntilLimit() > 0; l1++)
            {
                codedinputbytebuffernano.readRawVarint32();
            }

            codedinputbytebuffernano.rewindToPosition(i1);
            int ai1[];
            if (testCode == null)
            {
                i1 = 0;
            } else
            {
                i1 = testCode.length;
            }
            ai1 = new int[l1 + i1];
            l1 = i1;
            if (i1 != 0)
            {
                System.arraycopy(testCode, 0, ai1, 0, i1);
                l1 = i1;
            }
            for (; l1 < ai1.length; l1++)
            {
                ai1[l1] = codedinputbytebuffernano.readRawVarint32();
            }

            testCode = ai1;
            codedinputbytebuffernano.popLimit(i2);
            continue; /* Loop/switch isn't completed */
_L22:
            sequencePosition = codedinputbytebuffernano.readRawVarint64();
            if (true) goto _L23; else goto _L24
_L24:
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
            if (internalEvent != 0)
            {
                codedoutputbytebuffernano.writeInt32(19, internalEvent);
            }
            if (testCode != null && testCode.length > 0)
            {
                for (int j = 0; j < testCode.length; j++)
                {
                    codedoutputbytebuffernano.writeInt32(20, testCode[j]);
                }

            }
            if (sequencePosition != 0L)
            {
                codedoutputbytebuffernano.writeInt64(21, sequencePosition);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public LogEvent()
        {
            eventTimeMs = 0L;
            eventUptimeMs = 0L;
            sequencePosition = 0L;
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
            internalEvent = 0;
            testCode = WireFormatNano.EMPTY_INT_ARRAY;
            unknownFieldData = null;
            cachedSize = -1;
        }
    }

    public static final class LogEventKeyValues extends ExtendableMessageNano
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

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof LogEventKeyValues))
                {
                    return false;
                }
                obj = (LogEventKeyValues)obj;
                if (key == null)
                {
                    if (((LogEventKeyValues) (obj)).key != null)
                    {
                        return false;
                    }
                } else
                if (!key.equals(((LogEventKeyValues) (obj)).key))
                {
                    return false;
                }
                if (value == null)
                {
                    if (((LogEventKeyValues) (obj)).value != null)
                    {
                        return false;
                    }
                } else
                if (!value.equals(((LogEventKeyValues) (obj)).value))
                {
                    return false;
                }
                if (unknownFieldData == null || unknownFieldData.isEmpty())
                {
                    if (((LogEventKeyValues) (obj)).unknownFieldData != null && !((LogEventKeyValues) (obj)).unknownFieldData.isEmpty())
                    {
                        return false;
                    }
                } else
                {
                    return unknownFieldData.equals(((LogEventKeyValues) (obj)).unknownFieldData);
                }
            }
            return true;
        }

        public final int hashCode()
        {
            boolean flag = false;
            int l = getClass().getName().hashCode();
            int i;
            int j;
            int k;
            if (key == null)
            {
                i = 0;
            } else
            {
                i = key.hashCode();
            }
            if (value == null)
            {
                j = 0;
            } else
            {
                j = value.hashCode();
            }
            k = ((flag) ? 1 : 0);
            if (unknownFieldData != null)
            {
                if (unknownFieldData.isEmpty())
                {
                    k = ((flag) ? 1 : 0);
                } else
                {
                    k = unknownFieldData.hashCode();
                }
            }
            return (((l + 527) * 31 + i) * 31 + j) * 31 + k;
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
                    if (storeUnknownField(codedinputbytebuffernano, i))
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
            key = "";
            value = "";
            unknownFieldData = null;
            cachedSize = -1;
        }
    }

}
