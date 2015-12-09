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

    public boolean isCameraAvailable;
    public boolean isCameraEnabled;
    public boolean isMicAvailable;
    public boolean isMicEnabled;
    public int profiledAudioBitrate;
    public int profiledAudioChannels;
    public int profiledAudioSampleRate;
    public float profiledCaptureFramesPerSecond;
    public long profiledFileSizeBytes;
    public float profiledRecordingDurationSeconds;
    public int profiledVideoBitrate;
    public float profiledVideoFramesPerSecond;
    public int profiledVideoHeight;
    public int profiledVideoWidth;
    public int recordingState;
    public int statusCode;
    public int uiState;

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (recordingState != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(1, recordingState);
        }
        j = i;
        if (statusCode != 0)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(2, statusCode);
        }
        i = j;
        if (uiState != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(3, uiState);
        }
        j = i;
        if (isCameraAvailable)
        {
            j = i + (CodedOutputByteBufferNano.computeTagSize(4) + 1);
        }
        i = j;
        if (isCameraEnabled)
        {
            i = j + (CodedOutputByteBufferNano.computeTagSize(5) + 1);
        }
        j = i;
        if (isMicAvailable)
        {
            j = i + (CodedOutputByteBufferNano.computeTagSize(6) + 1);
        }
        i = j;
        if (isMicEnabled)
        {
            i = j + (CodedOutputByteBufferNano.computeTagSize(7) + 1);
        }
        j = i;
        if (Float.floatToIntBits(profiledRecordingDurationSeconds) != Float.floatToIntBits(0.0F))
        {
            j = i + (CodedOutputByteBufferNano.computeTagSize(8) + 4);
        }
        i = j;
        if (Float.floatToIntBits(profiledCaptureFramesPerSecond) != Float.floatToIntBits(0.0F))
        {
            i = j + (CodedOutputByteBufferNano.computeTagSize(9) + 4);
        }
        j = i;
        if (Float.floatToIntBits(profiledVideoFramesPerSecond) != Float.floatToIntBits(0.0F))
        {
            j = i + (CodedOutputByteBufferNano.computeTagSize(10) + 4);
        }
        i = j;
        if (profiledVideoWidth != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(11, profiledVideoWidth);
        }
        j = i;
        if (profiledVideoHeight != 0)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(12, profiledVideoHeight);
        }
        i = j;
        if (profiledVideoBitrate != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(13, profiledVideoBitrate);
        }
        j = i;
        if (profiledAudioChannels != 0)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(14, profiledAudioChannels);
        }
        i = j;
        if (profiledAudioSampleRate != 0)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(15, profiledAudioSampleRate);
        }
        j = i;
        if (profiledAudioBitrate != 0)
        {
            j = i + CodedOutputByteBufferNano.computeInt32Size(16, profiledAudioBitrate);
        }
        i = j;
        if (profiledFileSizeBytes != 0L)
        {
            i = j + CodedOutputByteBufferNano.computeInt64Size(17, profiledFileSizeBytes);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof profiledFileSizeBytes))
            {
                return false;
            }
            obj = (profiledFileSizeBytes)obj;
            if (recordingState != ((recordingState) (obj)).recordingState)
            {
                return false;
            }
            if (statusCode != ((statusCode) (obj)).statusCode)
            {
                return false;
            }
            if (uiState != ((uiState) (obj)).uiState)
            {
                return false;
            }
            if (isCameraAvailable != ((isCameraAvailable) (obj)).isCameraAvailable)
            {
                return false;
            }
            if (isCameraEnabled != ((isCameraEnabled) (obj)).isCameraEnabled)
            {
                return false;
            }
            if (isMicAvailable != ((isMicAvailable) (obj)).isMicAvailable)
            {
                return false;
            }
            if (isMicEnabled != ((isMicEnabled) (obj)).isMicEnabled)
            {
                return false;
            }
            if (Float.floatToIntBits(profiledRecordingDurationSeconds) != Float.floatToIntBits(((profiledRecordingDurationSeconds) (obj)).profiledRecordingDurationSeconds))
            {
                return false;
            }
            if (Float.floatToIntBits(profiledCaptureFramesPerSecond) != Float.floatToIntBits(((profiledCaptureFramesPerSecond) (obj)).profiledCaptureFramesPerSecond))
            {
                return false;
            }
            if (Float.floatToIntBits(profiledVideoFramesPerSecond) != Float.floatToIntBits(((profiledVideoFramesPerSecond) (obj)).profiledVideoFramesPerSecond))
            {
                return false;
            }
            if (profiledVideoWidth != ((profiledVideoWidth) (obj)).profiledVideoWidth)
            {
                return false;
            }
            if (profiledVideoHeight != ((profiledVideoHeight) (obj)).profiledVideoHeight)
            {
                return false;
            }
            if (profiledVideoBitrate != ((profiledVideoBitrate) (obj)).profiledVideoBitrate)
            {
                return false;
            }
            if (profiledAudioChannels != ((profiledAudioChannels) (obj)).profiledAudioChannels)
            {
                return false;
            }
            if (profiledAudioSampleRate != ((profiledAudioSampleRate) (obj)).profiledAudioSampleRate)
            {
                return false;
            }
            if (profiledAudioBitrate != ((profiledAudioBitrate) (obj)).profiledAudioBitrate)
            {
                return false;
            }
            if (profiledFileSizeBytes != ((profiledFileSizeBytes) (obj)).profiledFileSizeBytes)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        char c3 = '\u04CF';
        int i = getClass().getName().hashCode();
        int j = recordingState;
        int k = statusCode;
        int l = uiState;
        char c;
        char c1;
        char c2;
        if (isCameraAvailable)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (isCameraEnabled)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        if (isMicAvailable)
        {
            c2 = '\u04CF';
        } else
        {
            c2 = '\u04D5';
        }
        if (!isMicEnabled)
        {
            c3 = '\u04D5';
        }
        return (((((((((((((((((i + 527) * 31 + j) * 31 + k) * 31 + l) * 31 + c) * 31 + c1) * 31 + c2) * 31 + c3) * 31 + Float.floatToIntBits(profiledRecordingDurationSeconds)) * 31 + Float.floatToIntBits(profiledCaptureFramesPerSecond)) * 31 + Float.floatToIntBits(profiledVideoFramesPerSecond)) * 31 + profiledVideoWidth) * 31 + profiledVideoHeight) * 31 + profiledVideoBitrate) * 31 + profiledAudioChannels) * 31 + profiledAudioSampleRate) * 31 + profiledAudioBitrate) * 31 + (int)(profiledFileSizeBytes ^ profiledFileSizeBytes >>> 32);
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L20:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 18: default 160
    //                   0: 168
    //                   8: 170
    //                   16: 231
    //                   24: 242
    //                   32: 323
    //                   40: 334
    //                   48: 345
    //                   56: 356
    //                   69: 367
    //                   77: 381
    //                   85: 395
    //                   88: 409
    //                   96: 420
    //                   104: 431
    //                   112: 442
    //                   120: 453
    //                   128: 464
    //                   136: 475;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L20; else goto _L2
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
            recordingState = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        statusCode = codedinputbytebuffernano.readRawVarint32();
        continue; /* Loop/switch isn't completed */
_L5:
        int k = codedinputbytebuffernano.readRawVarint32();
        switch (k)
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
            uiState = k;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        isCameraAvailable = codedinputbytebuffernano.readBool();
        continue; /* Loop/switch isn't completed */
_L7:
        isCameraEnabled = codedinputbytebuffernano.readBool();
        continue; /* Loop/switch isn't completed */
_L8:
        isMicAvailable = codedinputbytebuffernano.readBool();
        continue; /* Loop/switch isn't completed */
_L9:
        isMicEnabled = codedinputbytebuffernano.readBool();
        continue; /* Loop/switch isn't completed */
_L10:
        profiledRecordingDurationSeconds = Float.intBitsToFloat(codedinputbytebuffernano.readRawLittleEndian32());
        continue; /* Loop/switch isn't completed */
_L11:
        profiledCaptureFramesPerSecond = Float.intBitsToFloat(codedinputbytebuffernano.readRawLittleEndian32());
        continue; /* Loop/switch isn't completed */
_L12:
        profiledVideoFramesPerSecond = Float.intBitsToFloat(codedinputbytebuffernano.readRawLittleEndian32());
        continue; /* Loop/switch isn't completed */
_L13:
        profiledVideoWidth = codedinputbytebuffernano.readRawVarint32();
        continue; /* Loop/switch isn't completed */
_L14:
        profiledVideoHeight = codedinputbytebuffernano.readRawVarint32();
        continue; /* Loop/switch isn't completed */
_L15:
        profiledVideoBitrate = codedinputbytebuffernano.readRawVarint32();
        continue; /* Loop/switch isn't completed */
_L16:
        profiledAudioChannels = codedinputbytebuffernano.readRawVarint32();
        continue; /* Loop/switch isn't completed */
_L17:
        profiledAudioSampleRate = codedinputbytebuffernano.readRawVarint32();
        continue; /* Loop/switch isn't completed */
_L18:
        profiledAudioBitrate = codedinputbytebuffernano.readRawVarint32();
        continue; /* Loop/switch isn't completed */
_L19:
        profiledFileSizeBytes = codedinputbytebuffernano.readRawVarint64();
        if (true) goto _L20; else goto _L21
_L21:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (recordingState != 0)
        {
            codedoutputbytebuffernano.writeInt32(1, recordingState);
        }
        if (statusCode != 0)
        {
            codedoutputbytebuffernano.writeInt32(2, statusCode);
        }
        if (uiState != 0)
        {
            codedoutputbytebuffernano.writeInt32(3, uiState);
        }
        if (isCameraAvailable)
        {
            codedoutputbytebuffernano.writeBool(4, isCameraAvailable);
        }
        if (isCameraEnabled)
        {
            codedoutputbytebuffernano.writeBool(5, isCameraEnabled);
        }
        if (isMicAvailable)
        {
            codedoutputbytebuffernano.writeBool(6, isMicAvailable);
        }
        if (isMicEnabled)
        {
            codedoutputbytebuffernano.writeBool(7, isMicEnabled);
        }
        if (Float.floatToIntBits(profiledRecordingDurationSeconds) != Float.floatToIntBits(0.0F))
        {
            codedoutputbytebuffernano.writeFloat(8, profiledRecordingDurationSeconds);
        }
        if (Float.floatToIntBits(profiledCaptureFramesPerSecond) != Float.floatToIntBits(0.0F))
        {
            codedoutputbytebuffernano.writeFloat(9, profiledCaptureFramesPerSecond);
        }
        if (Float.floatToIntBits(profiledVideoFramesPerSecond) != Float.floatToIntBits(0.0F))
        {
            codedoutputbytebuffernano.writeFloat(10, profiledVideoFramesPerSecond);
        }
        if (profiledVideoWidth != 0)
        {
            codedoutputbytebuffernano.writeInt32(11, profiledVideoWidth);
        }
        if (profiledVideoHeight != 0)
        {
            codedoutputbytebuffernano.writeInt32(12, profiledVideoHeight);
        }
        if (profiledVideoBitrate != 0)
        {
            codedoutputbytebuffernano.writeInt32(13, profiledVideoBitrate);
        }
        if (profiledAudioChannels != 0)
        {
            codedoutputbytebuffernano.writeInt32(14, profiledAudioChannels);
        }
        if (profiledAudioSampleRate != 0)
        {
            codedoutputbytebuffernano.writeInt32(15, profiledAudioSampleRate);
        }
        if (profiledAudioBitrate != 0)
        {
            codedoutputbytebuffernano.writeInt32(16, profiledAudioBitrate);
        }
        if (profiledFileSizeBytes != 0L)
        {
            codedoutputbytebuffernano.writeInt64(17, profiledFileSizeBytes);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        recordingState = 0;
        statusCode = 0;
        uiState = 0;
        isCameraAvailable = false;
        isCameraEnabled = false;
        isMicAvailable = false;
        isMicEnabled = false;
        profiledRecordingDurationSeconds = 0.0F;
        profiledCaptureFramesPerSecond = 0.0F;
        profiledVideoFramesPerSecond = 0.0F;
        profiledVideoWidth = 0;
        profiledVideoHeight = 0;
        profiledVideoBitrate = 0;
        profiledAudioChannels = 0;
        profiledAudioSampleRate = 0;
        profiledAudioBitrate = 0;
        profiledFileSizeBytes = 0L;
        cachedSize = -1;
    }
}
