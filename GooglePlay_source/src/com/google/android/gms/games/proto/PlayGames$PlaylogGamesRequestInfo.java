// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.games.proto:
//            PlayGames

public static final class cachedSize extends MessageNano
{

    public long appVersionCode;
    public String applicationId;
    public String clientVersion;
    public String instanceId;
    public boolean isAbortedAction;
    public boolean isStartAction;
    public long modulesVersion;
    public long playGamesVersion;
    public long startTimestampMillis;
    public long targetId[];

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (isStartAction)
        {
            i = j + (CodedOutputByteBufferNano.computeTagSize(1) + 1);
        }
        j = i;
        if (!applicationId.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(2, applicationId);
        }
        i = j;
        if (startTimestampMillis != 0L)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(3, startTimestampMillis);
        }
        j = i;
        if (!instanceId.equals(""))
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, instanceId);
        }
        i = j;
        if (!clientVersion.equals(""))
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(5, clientVersion);
        }
        j = i;
        if (appVersionCode != 0L)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(6, appVersionCode);
        }
        i = j;
        if (modulesVersion != 0L)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(7, modulesVersion);
        }
        j = i;
        if (targetId != null)
        {
            j = i;
            if (targetId.length > 0)
            {
                int k = 0;
                for (j = 0; j < targetId.length; j++)
                {
                    k += CodedOutputByteBufferNano.computeRawVarint64Size(targetId[j]);
                }

                j = i + k + targetId.length * 1;
            }
        }
        i = j;
        if (isAbortedAction)
        {
            i = j + (CodedOutputByteBufferNano.computeTagSize(9) + 1);
        }
        j = i;
        if (playGamesVersion != 0L)
        {
            j = i + CodedOutputByteBufferNano.computeInt64Size(10, playGamesVersion);
        }
        return j;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof playGamesVersion))
            {
                return false;
            }
            obj = (playGamesVersion)obj;
            if (isStartAction != ((isStartAction) (obj)).isStartAction)
            {
                return false;
            }
            if (applicationId == null)
            {
                if (((applicationId) (obj)).applicationId != null)
                {
                    return false;
                }
            } else
            if (!applicationId.equals(((applicationId) (obj)).applicationId))
            {
                return false;
            }
            if (startTimestampMillis != ((startTimestampMillis) (obj)).startTimestampMillis)
            {
                return false;
            }
            if (instanceId == null)
            {
                if (((instanceId) (obj)).instanceId != null)
                {
                    return false;
                }
            } else
            if (!instanceId.equals(((instanceId) (obj)).instanceId))
            {
                return false;
            }
            if (clientVersion == null)
            {
                if (((clientVersion) (obj)).clientVersion != null)
                {
                    return false;
                }
            } else
            if (!clientVersion.equals(((clientVersion) (obj)).clientVersion))
            {
                return false;
            }
            if (appVersionCode != ((appVersionCode) (obj)).appVersionCode)
            {
                return false;
            }
            if (modulesVersion != ((modulesVersion) (obj)).modulesVersion)
            {
                return false;
            }
            if (!InternalNano.equals(targetId, ((targetId) (obj)).targetId))
            {
                return false;
            }
            if (isAbortedAction != ((isAbortedAction) (obj)).isAbortedAction)
            {
                return false;
            }
            if (playGamesVersion != ((playGamesVersion) (obj)).playGamesVersion)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        char c1 = '\u04CF';
        int k = 0;
        int l = getClass().getName().hashCode();
        char c;
        int i;
        int j;
        int i1;
        int j1;
        int k1;
        int l1;
        if (isStartAction)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (applicationId == null)
        {
            i = 0;
        } else
        {
            i = applicationId.hashCode();
        }
        i1 = (int)(startTimestampMillis ^ startTimestampMillis >>> 32);
        if (instanceId == null)
        {
            j = 0;
        } else
        {
            j = instanceId.hashCode();
        }
        if (clientVersion != null)
        {
            k = clientVersion.hashCode();
        }
        j1 = (int)(appVersionCode ^ appVersionCode >>> 32);
        k1 = (int)(modulesVersion ^ modulesVersion >>> 32);
        l1 = InternalNano.hashCode(targetId);
        if (!isAbortedAction)
        {
            c1 = '\u04D5';
        }
        return ((((((((((l + 527) * 31 + c) * 31 + i) * 31 + i1) * 31 + j) * 31 + k) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + c1) * 31 + (int)(playGamesVersion ^ playGamesVersion >>> 32);
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
                isStartAction = codedinputbytebuffernano.readBool();
                break;

            case 18: // '\022'
                applicationId = codedinputbytebuffernano.readString();
                break;

            case 24: // '\030'
                startTimestampMillis = codedinputbytebuffernano.readRawVarint64();
                break;

            case 34: // '"'
                instanceId = codedinputbytebuffernano.readString();
                break;

            case 42: // '*'
                clientVersion = codedinputbytebuffernano.readString();
                break;

            case 48: // '0'
                appVersionCode = codedinputbytebuffernano.readRawVarint64();
                break;

            case 56: // '8'
                modulesVersion = codedinputbytebuffernano.readRawVarint64();
                break;

            case 64: // '@'
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 64);
                long al[];
                int j;
                if (targetId == null)
                {
                    j = 0;
                } else
                {
                    j = targetId.length;
                }
                al = new long[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(targetId, 0, al, 0, j);
                    l = j;
                }
                for (; l < al.length - 1; l++)
                {
                    al[l] = codedinputbytebuffernano.readRawVarint64();
                    codedinputbytebuffernano.readTag();
                }

                al[l] = codedinputbytebuffernano.readRawVarint64();
                targetId = al;
                break;

            case 66: // 'B'
                int j1 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
                int k = codedinputbytebuffernano.getPosition();
                int i1;
                for (i1 = 0; codedinputbytebuffernano.getBytesUntilLimit() > 0; i1++)
                {
                    codedinputbytebuffernano.readRawVarint64();
                }

                codedinputbytebuffernano.rewindToPosition(k);
                long al1[];
                if (targetId == null)
                {
                    k = 0;
                } else
                {
                    k = targetId.length;
                }
                al1 = new long[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(targetId, 0, al1, 0, k);
                    i1 = k;
                }
                for (; i1 < al1.length; i1++)
                {
                    al1[i1] = codedinputbytebuffernano.readRawVarint64();
                }

                targetId = al1;
                codedinputbytebuffernano.popLimit(j1);
                break;

            case 72: // 'H'
                isAbortedAction = codedinputbytebuffernano.readBool();
                break;

            case 80: // 'P'
                playGamesVersion = codedinputbytebuffernano.readRawVarint64();
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (isStartAction)
        {
            codedoutputbytebuffernano.writeBool(1, isStartAction);
        }
        if (!applicationId.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, applicationId);
        }
        if (startTimestampMillis != 0L)
        {
            codedoutputbytebuffernano.writeInt64(3, startTimestampMillis);
        }
        if (!instanceId.equals(""))
        {
            codedoutputbytebuffernano.writeString(4, instanceId);
        }
        if (!clientVersion.equals(""))
        {
            codedoutputbytebuffernano.writeString(5, clientVersion);
        }
        if (appVersionCode != 0L)
        {
            codedoutputbytebuffernano.writeInt64(6, appVersionCode);
        }
        if (modulesVersion != 0L)
        {
            codedoutputbytebuffernano.writeInt64(7, modulesVersion);
        }
        if (targetId != null && targetId.length > 0)
        {
            for (int i = 0; i < targetId.length; i++)
            {
                codedoutputbytebuffernano.writeInt64(8, targetId[i]);
            }

        }
        if (isAbortedAction)
        {
            codedoutputbytebuffernano.writeBool(9, isAbortedAction);
        }
        if (playGamesVersion != 0L)
        {
            codedoutputbytebuffernano.writeInt64(10, playGamesVersion);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        isStartAction = false;
        applicationId = "";
        startTimestampMillis = 0L;
        instanceId = "";
        clientVersion = "";
        appVersionCode = 0L;
        modulesVersion = 0L;
        targetId = WireFormatNano.EMPTY_LONG_ARRAY;
        isAbortedAction = false;
        playGamesVersion = 0L;
        cachedSize = -1;
    }
}
