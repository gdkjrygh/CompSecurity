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
//            NanoWalletLogging

public static final class clear extends ExtendableMessageNano
{

    public Long barcodeDetectionToOcrRecognitionInMs;
    public Integer barcodeStatus;
    public Long cameraStartToBarcodeDetectionInMs;
    public Integer connectionType;
    public Integer discoverableIdStatus;
    public Long durationBackCardCaptureInMs;
    public Long durationFrontCardCaptureInMs;
    public numCapturedFrontCard experiment[];
    public Long frameProcessingMillis;
    public Integer mobileNetworkType;
    public Integer numAutoFocuses;
    public Integer numCaptureAttemptsBackCard;
    public Integer numCaptureAttemptsFrontCard;
    public Integer numCapturedBackCard;
    public Integer numCapturedFrontCard;
    public Integer numOcrRetries;
    public Integer ocrCompletionReason;
    public Integer ocrSubmissionReason;
    public Integer readableIdStatus;
    public String recognizedSubType[];
    public String savedSubType;
    public Integer subtypeStatus;
    public Long timeSinceOcrStartInMs;
    public Long timeToClientResultInMs;
    public Long timeToFirstValidFrameInMs;
    public Long timeToOcrCompletedInMs;
    public Long timeToOcrConfirm;
    public Long timeToServerResultInMs;
    public Long totalMillis;
    public int type[];
    public Boolean usesFlashlight;

    private clear clear()
    {
        type = WireFormatNano.EMPTY_INT_ARRAY;
        totalMillis = null;
        frameProcessingMillis = null;
        numOcrRetries = null;
        usesFlashlight = null;
        numAutoFocuses = null;
        recognizedSubType = WireFormatNano.EMPTY_STRING_ARRAY;
        savedSubType = null;
        cameraStartToBarcodeDetectionInMs = null;
        barcodeDetectionToOcrRecognitionInMs = null;
        timeSinceOcrStartInMs = null;
        timeToFirstValidFrameInMs = null;
        timeToClientResultInMs = null;
        timeToServerResultInMs = null;
        timeToOcrCompletedInMs = null;
        subtypeStatus = null;
        discoverableIdStatus = null;
        barcodeStatus = null;
        readableIdStatus = null;
        ocrCompletionReason = null;
        ocrSubmissionReason = null;
        connectionType = null;
        mobileNetworkType = null;
        experiment = rray();
        timeToOcrConfirm = null;
        durationBackCardCaptureInMs = null;
        durationFrontCardCaptureInMs = null;
        numCaptureAttemptsBackCard = null;
        numCaptureAttemptsFrontCard = null;
        numCapturedBackCard = null;
        numCapturedFrontCard = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    private cachedSize mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L35:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 33: default 284
    //                   0: 294
    //                   8: 296
    //                   10: 488
    //                   16: 702
    //                   24: 716
    //                   32: 730
    //                   40: 744
    //                   48: 758
    //                   58: 772
    //                   66: 881
    //                   72: 892
    //                   80: 906
    //                   88: 920
    //                   96: 934
    //                   104: 948
    //                   112: 962
    //                   120: 976
    //                   128: 990
    //                   136: 1043
    //                   144: 1095
    //                   152: 1147
    //                   160: 1199
    //                   168: 1259
    //                   176: 1319
    //                   184: 1333
    //                   194: 1347
    //                   200: 1479
    //                   216: 1493
    //                   224: 1507
    //                   232: 1521
    //                   240: 1535
    //                   248: 1549
    //                   256: 1563;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L35; else goto _L2
_L2:
        return this;
_L3:
        int ai[];
        int j2;
        int k3;
        k3 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 8);
        ai = new int[k3];
        j2 = 0;
        i = 0;
_L42:
        if (j2 >= k3) goto _L37; else goto _L36
_L36:
        int l3;
        if (j2 != 0)
        {
            codedinputbytebuffernano.readTag();
        }
        l3 = codedinputbytebuffernano.readInt32();
        l3;
        JVM INSTR tableswitch 1 4: default 372
    //                   1 381
    //                   2 381
    //                   3 381
    //                   4 381;
           goto _L38 _L39 _L39 _L39 _L39
_L38:
        j2++;
          goto _L40
_L39:
        int i3 = i + 1;
        ai[i] = l3;
        i = i3;
        if (true) goto _L38; else goto _L40
_L40:
        if (true) goto _L42; else goto _L41
_L41:
_L37:
        if (i != 0)
        {
            if (type == null)
            {
                j2 = 0;
            } else
            {
                j2 = type.length;
            }
            if (j2 == 0 && i == k3)
            {
                type = ai;
            } else
            {
                int ai1[] = new int[j2 + i];
                if (j2 != 0)
                {
                    System.arraycopy(type, 0, ai1, 0, j2);
                }
                System.arraycopy(ai, 0, ai1, j2, i);
                type = ai1;
            }
        }
          goto _L35
_L4:
        int j3;
        j3 = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
        j2 = 0;
        i = codedinputbytebuffernano.getPosition();
_L48:
        if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
        {
            switch (codedinputbytebuffernano.readInt32())
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                j2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j2 == 0) goto _L44; else goto _L43
_L43:
        codedinputbytebuffernano.rewindToPosition(i);
        if (type == null)
        {
            i = 0;
        } else
        {
            i = type.length;
        }
        ai = new int[i + j2];
        j2 = i;
        if (i != 0)
        {
            System.arraycopy(type, 0, ai, 0, i);
            j2 = i;
        }
_L46:
        if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
        {
            i = codedinputbytebuffernano.readInt32();
            switch (i)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                ai[j2] = i;
                j2++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        type = ai;
          goto _L44
        if (true) goto _L46; else goto _L45
_L45:
        if (true) goto _L48; else goto _L47
_L47:
_L44:
        codedinputbytebuffernano.popLimit(j3);
          goto _L35
_L5:
        totalMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L35
_L6:
        frameProcessingMillis = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L35
_L7:
        numOcrRetries = Integer.valueOf(codedinputbytebuffernano.readInt32());
          goto _L35
_L8:
        usesFlashlight = Boolean.valueOf(codedinputbytebuffernano.readBool());
          goto _L35
_L9:
        numAutoFocuses = Integer.valueOf(codedinputbytebuffernano.readInt32());
          goto _L35
_L10:
        int k2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 58);
        String as[];
        int j;
        if (recognizedSubType == null)
        {
            j = 0;
        } else
        {
            j = recognizedSubType.length;
        }
        as = new String[j + k2];
        k2 = j;
        if (j != 0)
        {
            System.arraycopy(recognizedSubType, 0, as, 0, j);
            k2 = j;
        }
        for (; k2 < as.length - 1; k2++)
        {
            as[k2] = codedinputbytebuffernano.readString();
            codedinputbytebuffernano.readTag();
        }

        as[k2] = codedinputbytebuffernano.readString();
        recognizedSubType = as;
          goto _L35
_L11:
        savedSubType = codedinputbytebuffernano.readString();
          goto _L35
_L12:
        cameraStartToBarcodeDetectionInMs = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L35
_L13:
        barcodeDetectionToOcrRecognitionInMs = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L35
_L14:
        timeSinceOcrStartInMs = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L35
_L15:
        timeToFirstValidFrameInMs = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L35
_L16:
        timeToClientResultInMs = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L35
_L17:
        timeToServerResultInMs = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L35
_L18:
        timeToOcrCompletedInMs = Long.valueOf(codedinputbytebuffernano.readInt64());
          goto _L35
_L19:
        int k = codedinputbytebuffernano.readInt32();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            subtypeStatus = Integer.valueOf(k);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L20:
        int l = codedinputbytebuffernano.readInt32();
        switch (l)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            discoverableIdStatus = Integer.valueOf(l);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L21:
        int i1 = codedinputbytebuffernano.readInt32();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            barcodeStatus = Integer.valueOf(i1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L22:
        int j1 = codedinputbytebuffernano.readInt32();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            readableIdStatus = Integer.valueOf(j1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L23:
        int k1 = codedinputbytebuffernano.readInt32();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            ocrCompletionReason = Integer.valueOf(k1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L24:
        int l1 = codedinputbytebuffernano.readInt32();
        switch (l1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
            ocrSubmissionReason = Integer.valueOf(l1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L25:
        connectionType = Integer.valueOf(codedinputbytebuffernano.readInt32());
        continue; /* Loop/switch isn't completed */
_L26:
        mobileNetworkType = Integer.valueOf(codedinputbytebuffernano.readInt32());
        continue; /* Loop/switch isn't completed */
_L27:
        int l2 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 194);
        cachedSize acachedsize[];
        int i2;
        if (experiment == null)
        {
            i2 = 0;
        } else
        {
            i2 = experiment.length;
        }
        acachedsize = new experiment[i2 + l2];
        l2 = i2;
        if (i2 != 0)
        {
            System.arraycopy(experiment, 0, acachedsize, 0, i2);
            l2 = i2;
        }
        for (; l2 < acachedsize.length - 1; l2++)
        {
            acachedsize[l2] = new ();
            codedinputbytebuffernano.readMessage(acachedsize[l2]);
            codedinputbytebuffernano.readTag();
        }

        acachedsize[l2] = new ();
        codedinputbytebuffernano.readMessage(acachedsize[l2]);
        experiment = acachedsize;
        continue; /* Loop/switch isn't completed */
_L28:
        timeToOcrConfirm = Long.valueOf(codedinputbytebuffernano.readInt64());
        continue; /* Loop/switch isn't completed */
_L29:
        durationBackCardCaptureInMs = Long.valueOf(codedinputbytebuffernano.readInt64());
        continue; /* Loop/switch isn't completed */
_L30:
        durationFrontCardCaptureInMs = Long.valueOf(codedinputbytebuffernano.readInt64());
        continue; /* Loop/switch isn't completed */
_L31:
        numCaptureAttemptsBackCard = Integer.valueOf(codedinputbytebuffernano.readInt32());
        continue; /* Loop/switch isn't completed */
_L32:
        numCaptureAttemptsFrontCard = Integer.valueOf(codedinputbytebuffernano.readInt32());
        continue; /* Loop/switch isn't completed */
_L33:
        numCapturedBackCard = Integer.valueOf(codedinputbytebuffernano.readInt32());
        continue; /* Loop/switch isn't completed */
_L34:
        numCapturedFrontCard = Integer.valueOf(codedinputbytebuffernano.readInt32());
        if (true) goto _L35; else goto _L49
_L49:
    }

    protected final int computeSerializedSize()
    {
        int l = super.computeSerializedSize();
        int i = l;
        if (type != null)
        {
            i = l;
            if (type.length > 0)
            {
                int j = 0;
                for (i = 0; i < type.length; i++)
                {
                    j += CodedOutputByteBufferNano.computeInt32SizeNoTag(type[i]);
                }

                i = l + j + type.length * 1;
            }
        }
        int k = i;
        if (totalMillis != null)
        {
            k = i + CodedOutputByteBufferNano.computeInt64Size(2, totalMillis.longValue());
        }
        i = k;
        if (frameProcessingMillis != null)
        {
            i = k + CodedOutputByteBufferNano.computeInt64Size(3, frameProcessingMillis.longValue());
        }
        k = i;
        if (numOcrRetries != null)
        {
            k = i + CodedOutputByteBufferNano.computeInt32Size(4, numOcrRetries.intValue());
        }
        l = k;
        if (usesFlashlight != null)
        {
            l = k + CodedOutputByteBufferNano.computeBoolSize(5, usesFlashlight.booleanValue());
        }
        i = l;
        if (numAutoFocuses != null)
        {
            i = l + CodedOutputByteBufferNano.computeInt32Size(6, numAutoFocuses.intValue());
        }
        k = i;
        if (recognizedSubType != null)
        {
            k = i;
            if (recognizedSubType.length > 0)
            {
                int k1 = 0;
                l = 0;
                for (k = 0; k < recognizedSubType.length;)
                {
                    String s = recognizedSubType[k];
                    int l1 = k1;
                    int j1 = l;
                    if (s != null)
                    {
                        l1 = k1 + 1;
                        j1 = l + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    k++;
                    k1 = l1;
                    l = j1;
                }

                k = i + l + k1 * 1;
            }
        }
        i = k;
        if (savedSubType != null)
        {
            i = k + CodedOutputByteBufferNano.computeStringSize(8, savedSubType);
        }
        k = i;
        if (cameraStartToBarcodeDetectionInMs != null)
        {
            k = i + CodedOutputByteBufferNano.computeInt64Size(9, cameraStartToBarcodeDetectionInMs.longValue());
        }
        i = k;
        if (barcodeDetectionToOcrRecognitionInMs != null)
        {
            i = k + CodedOutputByteBufferNano.computeInt64Size(10, barcodeDetectionToOcrRecognitionInMs.longValue());
        }
        k = i;
        if (timeSinceOcrStartInMs != null)
        {
            k = i + CodedOutputByteBufferNano.computeInt64Size(11, timeSinceOcrStartInMs.longValue());
        }
        i = k;
        if (timeToFirstValidFrameInMs != null)
        {
            i = k + CodedOutputByteBufferNano.computeInt64Size(12, timeToFirstValidFrameInMs.longValue());
        }
        k = i;
        if (timeToClientResultInMs != null)
        {
            k = i + CodedOutputByteBufferNano.computeInt64Size(13, timeToClientResultInMs.longValue());
        }
        i = k;
        if (timeToServerResultInMs != null)
        {
            i = k + CodedOutputByteBufferNano.computeInt64Size(14, timeToServerResultInMs.longValue());
        }
        k = i;
        if (timeToOcrCompletedInMs != null)
        {
            k = i + CodedOutputByteBufferNano.computeInt64Size(15, timeToOcrCompletedInMs.longValue());
        }
        i = k;
        if (subtypeStatus != null)
        {
            i = k + CodedOutputByteBufferNano.computeInt32Size(16, subtypeStatus.intValue());
        }
        k = i;
        if (discoverableIdStatus != null)
        {
            k = i + CodedOutputByteBufferNano.computeInt32Size(17, discoverableIdStatus.intValue());
        }
        i = k;
        if (barcodeStatus != null)
        {
            i = k + CodedOutputByteBufferNano.computeInt32Size(18, barcodeStatus.intValue());
        }
        k = i;
        if (readableIdStatus != null)
        {
            k = i + CodedOutputByteBufferNano.computeInt32Size(19, readableIdStatus.intValue());
        }
        i = k;
        if (ocrCompletionReason != null)
        {
            i = k + CodedOutputByteBufferNano.computeInt32Size(20, ocrCompletionReason.intValue());
        }
        k = i;
        if (ocrSubmissionReason != null)
        {
            k = i + CodedOutputByteBufferNano.computeInt32Size(21, ocrSubmissionReason.intValue());
        }
        l = k;
        if (connectionType != null)
        {
            l = k + CodedOutputByteBufferNano.computeInt32Size(22, connectionType.intValue());
        }
        i = l;
        if (mobileNetworkType != null)
        {
            i = l + CodedOutputByteBufferNano.computeInt32Size(23, mobileNetworkType.intValue());
        }
        k = i;
        if (experiment != null)
        {
            k = i;
            if (experiment.length > 0)
            {
                int i1 = 0;
                do
                {
                    k = i;
                    if (i1 >= experiment.length)
                    {
                        break;
                    }
                    numCapturedFrontCard numcapturedfrontcard = experiment[i1];
                    k = i;
                    if (numcapturedfrontcard != null)
                    {
                        k = i + CodedOutputByteBufferNano.computeMessageSize(24, numcapturedfrontcard);
                    }
                    i1++;
                    i = k;
                } while (true);
            }
        }
        i = k;
        if (timeToOcrConfirm != null)
        {
            i = k + CodedOutputByteBufferNano.computeInt64Size(25, timeToOcrConfirm.longValue());
        }
        k = i;
        if (durationBackCardCaptureInMs != null)
        {
            k = i + CodedOutputByteBufferNano.computeInt64Size(27, durationBackCardCaptureInMs.longValue());
        }
        i = k;
        if (durationFrontCardCaptureInMs != null)
        {
            i = k + CodedOutputByteBufferNano.computeInt64Size(28, durationFrontCardCaptureInMs.longValue());
        }
        k = i;
        if (numCaptureAttemptsBackCard != null)
        {
            k = i + CodedOutputByteBufferNano.computeInt32Size(29, numCaptureAttemptsBackCard.intValue());
        }
        i = k;
        if (numCaptureAttemptsFrontCard != null)
        {
            i = k + CodedOutputByteBufferNano.computeInt32Size(30, numCaptureAttemptsFrontCard.intValue());
        }
        k = i;
        if (numCapturedBackCard != null)
        {
            k = i + CodedOutputByteBufferNano.computeInt32Size(31, numCapturedBackCard.intValue());
        }
        i = k;
        if (numCapturedFrontCard != null)
        {
            i = k + CodedOutputByteBufferNano.computeInt32Size(32, numCapturedFrontCard.intValue());
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
        if (type != null && type.length > 0)
        {
            for (int i = 0; i < type.length; i++)
            {
                codedoutputbytebuffernano.writeInt32(1, type[i]);
            }

        }
        if (totalMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(2, totalMillis.longValue());
        }
        if (frameProcessingMillis != null)
        {
            codedoutputbytebuffernano.writeInt64(3, frameProcessingMillis.longValue());
        }
        if (numOcrRetries != null)
        {
            codedoutputbytebuffernano.writeInt32(4, numOcrRetries.intValue());
        }
        if (usesFlashlight != null)
        {
            codedoutputbytebuffernano.writeBool(5, usesFlashlight.booleanValue());
        }
        if (numAutoFocuses != null)
        {
            codedoutputbytebuffernano.writeInt32(6, numAutoFocuses.intValue());
        }
        if (recognizedSubType != null && recognizedSubType.length > 0)
        {
            for (int j = 0; j < recognizedSubType.length; j++)
            {
                String s = recognizedSubType[j];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(7, s);
                }
            }

        }
        if (savedSubType != null)
        {
            codedoutputbytebuffernano.writeString(8, savedSubType);
        }
        if (cameraStartToBarcodeDetectionInMs != null)
        {
            codedoutputbytebuffernano.writeInt64(9, cameraStartToBarcodeDetectionInMs.longValue());
        }
        if (barcodeDetectionToOcrRecognitionInMs != null)
        {
            codedoutputbytebuffernano.writeInt64(10, barcodeDetectionToOcrRecognitionInMs.longValue());
        }
        if (timeSinceOcrStartInMs != null)
        {
            codedoutputbytebuffernano.writeInt64(11, timeSinceOcrStartInMs.longValue());
        }
        if (timeToFirstValidFrameInMs != null)
        {
            codedoutputbytebuffernano.writeInt64(12, timeToFirstValidFrameInMs.longValue());
        }
        if (timeToClientResultInMs != null)
        {
            codedoutputbytebuffernano.writeInt64(13, timeToClientResultInMs.longValue());
        }
        if (timeToServerResultInMs != null)
        {
            codedoutputbytebuffernano.writeInt64(14, timeToServerResultInMs.longValue());
        }
        if (timeToOcrCompletedInMs != null)
        {
            codedoutputbytebuffernano.writeInt64(15, timeToOcrCompletedInMs.longValue());
        }
        if (subtypeStatus != null)
        {
            codedoutputbytebuffernano.writeInt32(16, subtypeStatus.intValue());
        }
        if (discoverableIdStatus != null)
        {
            codedoutputbytebuffernano.writeInt32(17, discoverableIdStatus.intValue());
        }
        if (barcodeStatus != null)
        {
            codedoutputbytebuffernano.writeInt32(18, barcodeStatus.intValue());
        }
        if (readableIdStatus != null)
        {
            codedoutputbytebuffernano.writeInt32(19, readableIdStatus.intValue());
        }
        if (ocrCompletionReason != null)
        {
            codedoutputbytebuffernano.writeInt32(20, ocrCompletionReason.intValue());
        }
        if (ocrSubmissionReason != null)
        {
            codedoutputbytebuffernano.writeInt32(21, ocrSubmissionReason.intValue());
        }
        if (connectionType != null)
        {
            codedoutputbytebuffernano.writeInt32(22, connectionType.intValue());
        }
        if (mobileNetworkType != null)
        {
            codedoutputbytebuffernano.writeInt32(23, mobileNetworkType.intValue());
        }
        if (experiment != null && experiment.length > 0)
        {
            for (int k = 0; k < experiment.length; k++)
            {
                mergeFrom mergefrom = experiment[k];
                if (mergefrom != null)
                {
                    codedoutputbytebuffernano.writeMessage(24, mergefrom);
                }
            }

        }
        if (timeToOcrConfirm != null)
        {
            codedoutputbytebuffernano.writeInt64(25, timeToOcrConfirm.longValue());
        }
        if (durationBackCardCaptureInMs != null)
        {
            codedoutputbytebuffernano.writeInt64(27, durationBackCardCaptureInMs.longValue());
        }
        if (durationFrontCardCaptureInMs != null)
        {
            codedoutputbytebuffernano.writeInt64(28, durationFrontCardCaptureInMs.longValue());
        }
        if (numCaptureAttemptsBackCard != null)
        {
            codedoutputbytebuffernano.writeInt32(29, numCaptureAttemptsBackCard.intValue());
        }
        if (numCaptureAttemptsFrontCard != null)
        {
            codedoutputbytebuffernano.writeInt32(30, numCaptureAttemptsFrontCard.intValue());
        }
        if (numCapturedBackCard != null)
        {
            codedoutputbytebuffernano.writeInt32(31, numCapturedBackCard.intValue());
        }
        if (numCapturedFrontCard != null)
        {
            codedoutputbytebuffernano.writeInt32(32, numCapturedFrontCard.intValue());
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
