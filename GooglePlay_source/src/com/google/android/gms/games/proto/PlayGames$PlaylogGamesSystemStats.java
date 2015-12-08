// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.games.proto:
//            PlayGames

public static final class cachedSize extends MessageNano
{

    public long lastPlayedGameTimeMs;
    public int numInstalledGames;
    public int numSignedInGames;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (numInstalledGames != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, numInstalledGames);
        }
        j = i;
        if (numSignedInGames != 0)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, numSignedInGames);
        }
        i = j;
        if (lastPlayedGameTimeMs != 0L)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(3, lastPlayedGameTimeMs);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof lastPlayedGameTimeMs))
            {
                return false;
            }
            obj = (lastPlayedGameTimeMs)obj;
            if (numInstalledGames != ((numInstalledGames) (obj)).numInstalledGames)
            {
                return false;
            }
            if (numSignedInGames != ((numSignedInGames) (obj)).numSignedInGames)
            {
                return false;
            }
            if (lastPlayedGameTimeMs != ((lastPlayedGameTimeMs) (obj)).lastPlayedGameTimeMs)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (((getClass().getName().hashCode() + 527) * 31 + numInstalledGames) * 31 + numSignedInGames) * 31 + (int)(lastPlayedGameTimeMs ^ lastPlayedGameTimeMs >>> 32);
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
                numInstalledGames = codedinputbytebuffernano.readRawVarint32();
                break;

            case 16: // '\020'
                numSignedInGames = codedinputbytebuffernano.readRawVarint32();
                break;

            case 24: // '\030'
                lastPlayedGameTimeMs = codedinputbytebuffernano.readRawVarint64();
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (numInstalledGames != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, numInstalledGames);
        }
        if (numSignedInGames != 0)
        {
            codedoutputbytebuffernano.writeInt32(2, numSignedInGames);
        }
        if (lastPlayedGameTimeMs != 0L)
        {
            codedoutputbytebuffernano.writeInt64(3, lastPlayedGameTimeMs);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        numInstalledGames = 0;
        numSignedInGames = 0;
        lastPlayedGameTimeMs = 0L;
        cachedSize = -1;
    }
}
