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
import java.util.Arrays;

public interface PlayGames
{
    public static final class PlaylogGamesAndroidNotificationAction extends MessageNano
    {

        public int actionType;
        public int displayedCount;
        public PlaylogGamesAndroidNotificationDetails notificationDetails[];
        public String notificationId[];

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (actionType != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, actionType);
            }
            j = i;
            if (notificationId != null)
            {
                j = i;
                if (notificationId.length > 0)
                {
                    int k1 = 0;
                    int l = 0;
                    for (j = 0; j < notificationId.length;)
                    {
                        String s = notificationId[j];
                        int l1 = k1;
                        int j1 = l;
                        if (s != null)
                        {
                            l1 = k1 + 1;
                            j1 = l + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        j++;
                        k1 = l1;
                        l = j1;
                    }

                    j = i + l + k1 * 1;
                }
            }
            i = j;
            if (displayedCount != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, displayedCount);
            }
            int i1 = i;
            if (notificationDetails != null)
            {
                i1 = i;
                if (notificationDetails.length > 0)
                {
                    int k = 0;
                    do
                    {
                        i1 = i;
                        if (k >= notificationDetails.length)
                        {
                            break;
                        }
                        PlaylogGamesAndroidNotificationDetails playloggamesandroidnotificationdetails = notificationDetails[k];
                        i1 = i;
                        if (playloggamesandroidnotificationdetails != null)
                        {
                            i1 = i + CodedOutputByteBufferNano.computeMessageSize(4, playloggamesandroidnotificationdetails);
                        }
                        k++;
                        i = i1;
                    } while (true);
                }
            }
            return i1;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesAndroidNotificationAction))
                {
                    return false;
                }
                obj = (PlaylogGamesAndroidNotificationAction)obj;
                if (actionType != ((PlaylogGamesAndroidNotificationAction) (obj)).actionType)
                {
                    return false;
                }
                if (!InternalNano.equals(notificationId, ((PlaylogGamesAndroidNotificationAction) (obj)).notificationId))
                {
                    return false;
                }
                if (displayedCount != ((PlaylogGamesAndroidNotificationAction) (obj)).displayedCount)
                {
                    return false;
                }
                if (!InternalNano.equals(notificationDetails, ((PlaylogGamesAndroidNotificationAction) (obj)).notificationDetails))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return ((((getClass().getName().hashCode() + 527) * 31 + actionType) * 31 + InternalNano.hashCode(notificationId)) * 31 + displayedCount) * 31 + InternalNano.hashCode(notificationDetails);
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 64
        //                       8: 66
        //                       18: 127
        //                       24: 229
        //                       34: 240;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
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
                actionType = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
            String as[];
            int k;
            if (notificationId == null)
            {
                k = 0;
            } else
            {
                k = notificationId.length;
            }
            as = new String[i1 + k];
            i1 = k;
            if (k != 0)
            {
                System.arraycopy(notificationId, 0, as, 0, k);
                i1 = k;
            }
            for (; i1 < as.length - 1; i1++)
            {
                as[i1] = codedinputbytebuffernano.readString();
                codedinputbytebuffernano.readTag();
            }

            as[i1] = codedinputbytebuffernano.readString();
            notificationId = as;
            continue; /* Loop/switch isn't completed */
_L5:
            displayedCount = codedinputbytebuffernano.readRawVarint32();
            continue; /* Loop/switch isn't completed */
_L6:
            int j1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
            PlaylogGamesAndroidNotificationDetails aplayloggamesandroidnotificationdetails[];
            int l;
            if (notificationDetails == null)
            {
                l = 0;
            } else
            {
                l = notificationDetails.length;
            }
            aplayloggamesandroidnotificationdetails = new PlaylogGamesAndroidNotificationDetails[j1 + l];
            j1 = l;
            if (l != 0)
            {
                System.arraycopy(notificationDetails, 0, aplayloggamesandroidnotificationdetails, 0, l);
                j1 = l;
            }
            for (; j1 < aplayloggamesandroidnotificationdetails.length - 1; j1++)
            {
                aplayloggamesandroidnotificationdetails[j1] = new PlaylogGamesAndroidNotificationDetails();
                codedinputbytebuffernano.readMessage(aplayloggamesandroidnotificationdetails[j1]);
                codedinputbytebuffernano.readTag();
            }

            aplayloggamesandroidnotificationdetails[j1] = new PlaylogGamesAndroidNotificationDetails();
            codedinputbytebuffernano.readMessage(aplayloggamesandroidnotificationdetails[j1]);
            notificationDetails = aplayloggamesandroidnotificationdetails;
            if (true) goto _L7; else goto _L8
_L8:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (actionType != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, actionType);
            }
            if (notificationId != null && notificationId.length > 0)
            {
                for (int i = 0; i < notificationId.length; i++)
                {
                    String s = notificationId[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(2, s);
                    }
                }

            }
            if (displayedCount != 0)
            {
                codedoutputbytebuffernano.writeInt32(3, displayedCount);
            }
            if (notificationDetails != null && notificationDetails.length > 0)
            {
                for (int j = 0; j < notificationDetails.length; j++)
                {
                    PlaylogGamesAndroidNotificationDetails playloggamesandroidnotificationdetails = notificationDetails[j];
                    if (playloggamesandroidnotificationdetails != null)
                    {
                        codedoutputbytebuffernano.writeMessage(4, playloggamesandroidnotificationdetails);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesAndroidNotificationAction()
        {
            actionType = 0;
            notificationId = WireFormatNano.EMPTY_STRING_ARRAY;
            displayedCount = 0;
            notificationDetails = PlaylogGamesAndroidNotificationDetails.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesAndroidNotificationDetails extends MessageNano
    {

        private static volatile PlaylogGamesAndroidNotificationDetails _emptyArray[];
        public String applicationId;
        public String notificationId;
        public int notificationType;

        public static PlaylogGamesAndroidNotificationDetails[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new PlaylogGamesAndroidNotificationDetails[0];
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
            if (!applicationId.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, applicationId);
            }
            j = i;
            if (!notificationId.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, notificationId);
            }
            i = j;
            if (notificationType != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, notificationType);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesAndroidNotificationDetails))
                {
                    return false;
                }
                obj = (PlaylogGamesAndroidNotificationDetails)obj;
                if (applicationId == null)
                {
                    if (((PlaylogGamesAndroidNotificationDetails) (obj)).applicationId != null)
                    {
                        return false;
                    }
                } else
                if (!applicationId.equals(((PlaylogGamesAndroidNotificationDetails) (obj)).applicationId))
                {
                    return false;
                }
                if (notificationId == null)
                {
                    if (((PlaylogGamesAndroidNotificationDetails) (obj)).notificationId != null)
                    {
                        return false;
                    }
                } else
                if (!notificationId.equals(((PlaylogGamesAndroidNotificationDetails) (obj)).notificationId))
                {
                    return false;
                }
                if (notificationType != ((PlaylogGamesAndroidNotificationDetails) (obj)).notificationType)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int j = 0;
            int k = getClass().getName().hashCode();
            int i;
            if (applicationId == null)
            {
                i = 0;
            } else
            {
                i = applicationId.hashCode();
            }
            if (notificationId != null)
            {
                j = notificationId.hashCode();
            }
            return (((k + 527) * 31 + i) * 31 + j) * 31 + notificationType;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 56
        //                       10: 58
        //                       18: 69
        //                       24: 80;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            applicationId = codedinputbytebuffernano.readString();
              goto _L6
_L4:
            notificationId = codedinputbytebuffernano.readString();
              goto _L6
_L5:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
                notificationType = j;
                break;
            }
            if (true) goto _L6; else goto _L7
_L7:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (!applicationId.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, applicationId);
            }
            if (!notificationId.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, notificationId);
            }
            if (notificationType != 0)
            {
                codedoutputbytebuffernano.writeInt32(3, notificationType);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesAndroidNotificationDetails()
        {
            applicationId = "";
            notificationId = "";
            notificationType = 0;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesAndroidSignIn extends MessageNano
    {

        public long elapsedTimeMillis;
        public long sessionId;
        public int status;
        public int step;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (step != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, step);
            }
            j = i;
            if (sessionId != 0L)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, sessionId);
            }
            i = j;
            if (status != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, status);
            }
            j = i;
            if (elapsedTimeMillis != 0L)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(4, elapsedTimeMillis);
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesAndroidSignIn))
                {
                    return false;
                }
                obj = (PlaylogGamesAndroidSignIn)obj;
                if (step != ((PlaylogGamesAndroidSignIn) (obj)).step)
                {
                    return false;
                }
                if (sessionId != ((PlaylogGamesAndroidSignIn) (obj)).sessionId)
                {
                    return false;
                }
                if (status != ((PlaylogGamesAndroidSignIn) (obj)).status)
                {
                    return false;
                }
                if (elapsedTimeMillis != ((PlaylogGamesAndroidSignIn) (obj)).elapsedTimeMillis)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return ((((getClass().getName().hashCode() + 527) * 31 + step) * 31 + (int)(sessionId ^ sessionId >>> 32)) * 31 + status) * 31 + (int)(elapsedTimeMillis ^ elapsedTimeMillis >>> 32);
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 64
        //                       8: 66
        //                       16: 199
        //                       24: 210
        //                       32: 221;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
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
                step = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            sessionId = codedinputbytebuffernano.readRawVarint64();
            continue; /* Loop/switch isn't completed */
_L5:
            status = codedinputbytebuffernano.readRawVarint32();
            continue; /* Loop/switch isn't completed */
_L6:
            elapsedTimeMillis = codedinputbytebuffernano.readRawVarint64();
            if (true) goto _L7; else goto _L8
_L8:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (step != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, step);
            }
            if (sessionId != 0L)
            {
                codedoutputbytebuffernano.writeInt64(2, sessionId);
            }
            if (status != 0)
            {
                codedoutputbytebuffernano.writeInt32(3, status);
            }
            if (elapsedTimeMillis != 0L)
            {
                codedoutputbytebuffernano.writeInt64(4, elapsedTimeMillis);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesAndroidSignIn()
        {
            step = 0;
            sessionId = 0L;
            status = 0;
            elapsedTimeMillis = 0L;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesAndroidSyncAction extends MessageNano
    {

        public String authority;
        public long durationMillis;
        public String feed;
        public boolean newSyncPending;
        public int numErrors;
        public boolean periodic;
        public boolean success;
        public int syncOps[];

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (!authority.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, authority);
            }
            j = i;
            if (!feed.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, feed);
            }
            i = j;
            if (durationMillis != 0L)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(3, durationMillis);
            }
            j = i;
            if (success)
            {
                j = i + (CodedOutputByteBufferNano.computeTagSize(4) + 1);
            }
            i = j;
            if (numErrors != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(5, numErrors);
            }
            j = i;
            if (newSyncPending)
            {
                j = i + (CodedOutputByteBufferNano.computeTagSize(6) + 1);
            }
            i = j;
            if (periodic)
            {
                i = j + (CodedOutputByteBufferNano.computeTagSize(7) + 1);
            }
            j = i;
            if (syncOps != null)
            {
                j = i;
                if (syncOps.length > 0)
                {
                    int k = 0;
                    for (j = 0; j < syncOps.length; j++)
                    {
                        k += CodedOutputByteBufferNano.computeInt32SizeNoTag(syncOps[j]);
                    }

                    j = i + k + syncOps.length * 1;
                }
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesAndroidSyncAction))
                {
                    return false;
                }
                obj = (PlaylogGamesAndroidSyncAction)obj;
                if (authority == null)
                {
                    if (((PlaylogGamesAndroidSyncAction) (obj)).authority != null)
                    {
                        return false;
                    }
                } else
                if (!authority.equals(((PlaylogGamesAndroidSyncAction) (obj)).authority))
                {
                    return false;
                }
                if (feed == null)
                {
                    if (((PlaylogGamesAndroidSyncAction) (obj)).feed != null)
                    {
                        return false;
                    }
                } else
                if (!feed.equals(((PlaylogGamesAndroidSyncAction) (obj)).feed))
                {
                    return false;
                }
                if (durationMillis != ((PlaylogGamesAndroidSyncAction) (obj)).durationMillis)
                {
                    return false;
                }
                if (success != ((PlaylogGamesAndroidSyncAction) (obj)).success)
                {
                    return false;
                }
                if (numErrors != ((PlaylogGamesAndroidSyncAction) (obj)).numErrors)
                {
                    return false;
                }
                if (newSyncPending != ((PlaylogGamesAndroidSyncAction) (obj)).newSyncPending)
                {
                    return false;
                }
                if (periodic != ((PlaylogGamesAndroidSyncAction) (obj)).periodic)
                {
                    return false;
                }
                if (!InternalNano.equals(syncOps, ((PlaylogGamesAndroidSyncAction) (obj)).syncOps))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int j = 0;
            char c2 = '\u04CF';
            int k = getClass().getName().hashCode();
            int i;
            char c;
            char c1;
            int l;
            int i1;
            if (authority == null)
            {
                i = 0;
            } else
            {
                i = authority.hashCode();
            }
            if (feed != null)
            {
                j = feed.hashCode();
            }
            l = (int)(durationMillis ^ durationMillis >>> 32);
            if (success)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            i1 = numErrors;
            if (newSyncPending)
            {
                c1 = '\u04CF';
            } else
            {
                c1 = '\u04D5';
            }
            if (!periodic)
            {
                c2 = '\u04D5';
            }
            return ((((((((k + 527) * 31 + i) * 31 + j) * 31 + l) * 31 + c) * 31 + i1) * 31 + c1) * 31 + c2) * 31 + InternalNano.hashCode(syncOps);
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L26:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 10: default 100
        //                       0: 109
        //                       10: 111
        //                       18: 122
        //                       24: 133
        //                       32: 144
        //                       40: 155
        //                       48: 166
        //                       56: 177
        //                       64: 188
        //                       66: 464;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
            {
                continue; /* Loop/switch isn't completed */
            }
_L2:
            return this;
_L3:
            authority = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L4:
            feed = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L5:
            durationMillis = codedinputbytebuffernano.readRawVarint64();
            continue; /* Loop/switch isn't completed */
_L6:
            success = codedinputbytebuffernano.readBool();
            continue; /* Loop/switch isn't completed */
_L7:
            numErrors = codedinputbytebuffernano.readRawVarint32();
            continue; /* Loop/switch isn't completed */
_L8:
            newSyncPending = codedinputbytebuffernano.readBool();
            continue; /* Loop/switch isn't completed */
_L9:
            periodic = codedinputbytebuffernano.readBool();
            continue; /* Loop/switch isn't completed */
_L10:
            int ai[];
            int j;
            int i1;
            i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 64);
            ai = new int[i1];
            j = 0;
            i = 0;
_L18:
            if (j >= i1) goto _L13; else goto _L12
_L12:
            int j1;
            if (j != 0)
            {
                codedinputbytebuffernano.readTag();
            }
            j1 = codedinputbytebuffernano.readRawVarint32();
            j1;
            JVM INSTR tableswitch 0 24: default 348
        //                       0 357
        //                       1 357
        //                       2 357
        //                       3 357
        //                       4 357
        //                       5 357
        //                       6 357
        //                       7 357
        //                       8 357
        //                       9 357
        //                       10 357
        //                       11 357
        //                       12 357
        //                       13 357
        //                       14 357
        //                       15 357
        //                       16 357
        //                       17 357
        //                       18 357
        //                       19 357
        //                       20 357
        //                       21 357
        //                       22 357
        //                       23 357
        //                       24 357;
               goto _L14 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15 _L15
_L14:
            j++;
              goto _L16
_L15:
            int k = i + 1;
            ai[i] = j1;
            i = k;
            if (true) goto _L14; else goto _L16
_L16:
            if (true) goto _L18; else goto _L17
_L17:
_L13:
            if (i != 0)
            {
                if (syncOps == null)
                {
                    j = 0;
                } else
                {
                    j = syncOps.length;
                }
                if (j == 0 && i == ai.length)
                {
                    syncOps = ai;
                } else
                {
                    int ai1[] = new int[j + i];
                    if (j != 0)
                    {
                        System.arraycopy(syncOps, 0, ai1, 0, j);
                    }
                    System.arraycopy(ai, 0, ai1, j, i);
                    syncOps = ai1;
                }
            }
            continue; /* Loop/switch isn't completed */
_L11:
            int l;
            l = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
            i = codedinputbytebuffernano.getPosition();
            j = 0;
_L24:
            if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
            {
                switch (codedinputbytebuffernano.readRawVarint32())
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
                    j++;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
            if (j == 0) goto _L20; else goto _L19
_L19:
            codedinputbytebuffernano.rewindToPosition(i);
            if (syncOps == null)
            {
                i = 0;
            } else
            {
                i = syncOps.length;
            }
            ai = new int[j + i];
            j = i;
            if (i != 0)
            {
                System.arraycopy(syncOps, 0, ai, 0, i);
                j = i;
            }
_L22:
            if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
            {
                i = codedinputbytebuffernano.readRawVarint32();
                switch (i)
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
                    ai[j] = i;
                    j++;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
            syncOps = ai;
              goto _L20
            if (true) goto _L22; else goto _L21
_L21:
            if (true) goto _L24; else goto _L23
_L23:
_L20:
            codedinputbytebuffernano.popLimit(l);
            if (true) goto _L26; else goto _L25
_L25:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (!authority.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, authority);
            }
            if (!feed.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, feed);
            }
            if (durationMillis != 0L)
            {
                codedoutputbytebuffernano.writeInt64(3, durationMillis);
            }
            if (success)
            {
                codedoutputbytebuffernano.writeBool(4, success);
            }
            if (numErrors != 0)
            {
                codedoutputbytebuffernano.writeInt32(5, numErrors);
            }
            if (newSyncPending)
            {
                codedoutputbytebuffernano.writeBool(6, newSyncPending);
            }
            if (periodic)
            {
                codedoutputbytebuffernano.writeBool(7, periodic);
            }
            if (syncOps != null && syncOps.length > 0)
            {
                for (int i = 0; i < syncOps.length; i++)
                {
                    codedoutputbytebuffernano.writeInt32(8, syncOps[i]);
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesAndroidSyncAction()
        {
            authority = "";
            feed = "";
            durationMillis = 0L;
            success = false;
            numErrors = 0;
            newSyncPending = false;
            periodic = false;
            syncOps = WireFormatNano.EMPTY_INT_ARRAY;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesAppData extends MessageNano
    {

        public int oldVersion;
        public int version;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (version != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, version);
            }
            j = i;
            if (oldVersion != 0)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, oldVersion);
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesAppData))
                {
                    return false;
                }
                obj = (PlaylogGamesAppData)obj;
                if (version != ((PlaylogGamesAppData) (obj)).version)
                {
                    return false;
                }
                if (oldVersion != ((PlaylogGamesAppData) (obj)).oldVersion)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return ((getClass().getName().hashCode() + 527) * 31 + version) * 31 + oldVersion;
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
                    version = codedinputbytebuffernano.readRawVarint32();
                    break;

                case 16: // '\020'
                    oldVersion = codedinputbytebuffernano.readRawVarint32();
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (version != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, version);
            }
            if (oldVersion != 0)
            {
                codedoutputbytebuffernano.writeInt32(2, oldVersion);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesAppData()
        {
            version = 0;
            oldVersion = 0;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesBackgroundActionEvent extends MessageNano
    {

        public int actionType;
        public PlaylogGamesAppData appData;
        public int errorCode;
        public String exceptionType;
        public int fromSetting;
        public boolean operationSuccess;
        public String reason;
        public int toSetting;

        public final PlaylogGamesBackgroundActionEvent clear()
        {
            actionType = 0;
            reason = "";
            errorCode = 0;
            exceptionType = "";
            fromSetting = 0;
            toSetting = 0;
            appData = null;
            operationSuccess = false;
            cachedSize = -1;
            return this;
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (actionType != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, actionType);
            }
            j = i;
            if (!reason.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, reason);
            }
            i = j;
            if (errorCode != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, errorCode);
            }
            j = i;
            if (!exceptionType.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, exceptionType);
            }
            i = j;
            if (fromSetting != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(5, fromSetting);
            }
            j = i;
            if (toSetting != 0)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(6, toSetting);
            }
            i = j;
            if (appData != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(7, appData);
            }
            j = i;
            if (operationSuccess)
            {
                j = i + (CodedOutputByteBufferNano.computeTagSize(8) + 1);
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesBackgroundActionEvent))
                {
                    return false;
                }
                obj = (PlaylogGamesBackgroundActionEvent)obj;
                if (actionType != ((PlaylogGamesBackgroundActionEvent) (obj)).actionType)
                {
                    return false;
                }
                if (reason == null)
                {
                    if (((PlaylogGamesBackgroundActionEvent) (obj)).reason != null)
                    {
                        return false;
                    }
                } else
                if (!reason.equals(((PlaylogGamesBackgroundActionEvent) (obj)).reason))
                {
                    return false;
                }
                if (errorCode != ((PlaylogGamesBackgroundActionEvent) (obj)).errorCode)
                {
                    return false;
                }
                if (exceptionType == null)
                {
                    if (((PlaylogGamesBackgroundActionEvent) (obj)).exceptionType != null)
                    {
                        return false;
                    }
                } else
                if (!exceptionType.equals(((PlaylogGamesBackgroundActionEvent) (obj)).exceptionType))
                {
                    return false;
                }
                if (fromSetting != ((PlaylogGamesBackgroundActionEvent) (obj)).fromSetting)
                {
                    return false;
                }
                if (toSetting != ((PlaylogGamesBackgroundActionEvent) (obj)).toSetting)
                {
                    return false;
                }
                if (appData == null)
                {
                    if (((PlaylogGamesBackgroundActionEvent) (obj)).appData != null)
                    {
                        return false;
                    }
                } else
                if (!appData.equals(((PlaylogGamesBackgroundActionEvent) (obj)).appData))
                {
                    return false;
                }
                if (operationSuccess != ((PlaylogGamesBackgroundActionEvent) (obj)).operationSuccess)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int k = 0;
            int l = getClass().getName().hashCode();
            int i1 = actionType;
            int i;
            int j;
            char c;
            int j1;
            int k1;
            int l1;
            if (reason == null)
            {
                i = 0;
            } else
            {
                i = reason.hashCode();
            }
            j1 = errorCode;
            if (exceptionType == null)
            {
                j = 0;
            } else
            {
                j = exceptionType.hashCode();
            }
            k1 = fromSetting;
            l1 = toSetting;
            if (appData != null)
            {
                k = appData.hashCode();
            }
            if (operationSuccess)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            return c + ((((((((l + 527) * 31 + i1) * 31 + i) * 31 + j1) * 31 + j) * 31 + k1) * 31 + l1) * 31 + k) * 31;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L11:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 9: default 88
        //                       0: 96
        //                       8: 98
        //                       18: 183
        //                       24: 194
        //                       34: 205
        //                       40: 216
        //                       48: 227
        //                       58: 238
        //                       64: 267;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L11; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 100: // 'd'
            case 101: // 'e'
            case 102: // 'f'
            case 103: // 'g'
            case 104: // 'h'
                actionType = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            reason = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L5:
            errorCode = codedinputbytebuffernano.readRawVarint32();
            continue; /* Loop/switch isn't completed */
_L6:
            exceptionType = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L7:
            fromSetting = codedinputbytebuffernano.readRawVarint32();
            continue; /* Loop/switch isn't completed */
_L8:
            toSetting = codedinputbytebuffernano.readRawVarint32();
            continue; /* Loop/switch isn't completed */
_L9:
            if (appData == null)
            {
                appData = new PlaylogGamesAppData();
            }
            codedinputbytebuffernano.readMessage(appData);
            continue; /* Loop/switch isn't completed */
_L10:
            operationSuccess = codedinputbytebuffernano.readBool();
            if (true) goto _L11; else goto _L12
_L12:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (actionType != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, actionType);
            }
            if (!reason.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, reason);
            }
            if (errorCode != 0)
            {
                codedoutputbytebuffernano.writeInt32(3, errorCode);
            }
            if (!exceptionType.equals(""))
            {
                codedoutputbytebuffernano.writeString(4, exceptionType);
            }
            if (fromSetting != 0)
            {
                codedoutputbytebuffernano.writeInt32(5, fromSetting);
            }
            if (toSetting != 0)
            {
                codedoutputbytebuffernano.writeInt32(6, toSetting);
            }
            if (appData != null)
            {
                codedoutputbytebuffernano.writeMessage(7, appData);
            }
            if (operationSuccess)
            {
                codedoutputbytebuffernano.writeBool(8, operationSuccess);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesBackgroundActionEvent()
        {
            clear();
        }
    }

    public static final class PlaylogGamesClickEvent extends MessageNano
    {

        public PlaylogGamesUiElement elementPath[];
        public PlaylogGamesUiElementPath path;

        public final PlaylogGamesClickEvent clear()
        {
            elementPath = PlaylogGamesUiElement.emptyArray();
            path = null;
            cachedSize = -1;
            return this;
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (elementPath != null)
            {
                j = i;
                if (elementPath.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= elementPath.length)
                        {
                            break;
                        }
                        PlaylogGamesUiElement playloggamesuielement = elementPath[k];
                        j = i;
                        if (playloggamesuielement != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(1, playloggamesuielement);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (path != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(2, path);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (!(obj instanceof PlaylogGamesClickEvent))
            {
                return false;
            }
            obj = (PlaylogGamesClickEvent)obj;
            if (!InternalNano.equals(elementPath, ((PlaylogGamesClickEvent) (obj)).elementPath))
            {
                return false;
            }
            if (path != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((PlaylogGamesClickEvent) (obj)).path == null) goto _L1; else goto _L3
_L3:
            return false;
            if (path.equals(((PlaylogGamesClickEvent) (obj)).path)) goto _L1; else goto _L4
_L4:
            return false;
        }

        public final int hashCode()
        {
            int j = getClass().getName().hashCode();
            int k = InternalNano.hashCode(elementPath);
            int i;
            if (path == null)
            {
                i = 0;
            } else
            {
                i = path.hashCode();
            }
            return i + ((j + 527) * 31 + k) * 31;
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
                    PlaylogGamesUiElement aplayloggamesuielement[];
                    int j;
                    if (elementPath == null)
                    {
                        j = 0;
                    } else
                    {
                        j = elementPath.length;
                    }
                    aplayloggamesuielement = new PlaylogGamesUiElement[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(elementPath, 0, aplayloggamesuielement, 0, j);
                        k = j;
                    }
                    for (; k < aplayloggamesuielement.length - 1; k++)
                    {
                        aplayloggamesuielement[k] = new PlaylogGamesUiElement();
                        codedinputbytebuffernano.readMessage(aplayloggamesuielement[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    aplayloggamesuielement[k] = new PlaylogGamesUiElement();
                    codedinputbytebuffernano.readMessage(aplayloggamesuielement[k]);
                    elementPath = aplayloggamesuielement;
                    break;

                case 18: // '\022'
                    if (path == null)
                    {
                        path = new PlaylogGamesUiElementPath();
                    }
                    codedinputbytebuffernano.readMessage(path);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (elementPath != null && elementPath.length > 0)
            {
                for (int i = 0; i < elementPath.length; i++)
                {
                    PlaylogGamesUiElement playloggamesuielement = elementPath[i];
                    if (playloggamesuielement != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, playloggamesuielement);
                    }
                }

            }
            if (path != null)
            {
                codedoutputbytebuffernano.writeMessage(2, path);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesClickEvent()
        {
            clear();
        }
    }

    public static final class PlaylogGamesDeepLinkEvent extends MessageNano
    {

        public boolean canResolve;
        public int minVersion;
        public boolean newEnough;
        public String packageName;
        public int resolvedType;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (resolvedType != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, resolvedType);
            }
            j = i;
            if (!packageName.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, packageName);
            }
            i = j;
            if (minVersion != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, minVersion);
            }
            j = i;
            if (newEnough)
            {
                j = i + (CodedOutputByteBufferNano.computeTagSize(4) + 1);
            }
            i = j;
            if (canResolve)
            {
                i = j + (CodedOutputByteBufferNano.computeTagSize(5) + 1);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesDeepLinkEvent))
                {
                    return false;
                }
                obj = (PlaylogGamesDeepLinkEvent)obj;
                if (resolvedType != ((PlaylogGamesDeepLinkEvent) (obj)).resolvedType)
                {
                    return false;
                }
                if (packageName == null)
                {
                    if (((PlaylogGamesDeepLinkEvent) (obj)).packageName != null)
                    {
                        return false;
                    }
                } else
                if (!packageName.equals(((PlaylogGamesDeepLinkEvent) (obj)).packageName))
                {
                    return false;
                }
                if (minVersion != ((PlaylogGamesDeepLinkEvent) (obj)).minVersion)
                {
                    return false;
                }
                if (newEnough != ((PlaylogGamesDeepLinkEvent) (obj)).newEnough)
                {
                    return false;
                }
                if (canResolve != ((PlaylogGamesDeepLinkEvent) (obj)).canResolve)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            char c1 = '\u04CF';
            int j = getClass().getName().hashCode();
            int k = resolvedType;
            int i;
            char c;
            int l;
            if (packageName == null)
            {
                i = 0;
            } else
            {
                i = packageName.hashCode();
            }
            l = minVersion;
            if (newEnough)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            if (!canResolve)
            {
                c1 = '\u04D5';
            }
            return (((((j + 527) * 31 + k) * 31 + i) * 31 + l) * 31 + c) * 31 + c1;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L8:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 6: default 64
        //                       0: 72
        //                       8: 74
        //                       18: 151
        //                       24: 162
        //                       32: 173
        //                       40: 184;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L8; else goto _L2
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
                resolvedType = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            packageName = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L5:
            minVersion = codedinputbytebuffernano.readRawVarint32();
            continue; /* Loop/switch isn't completed */
_L6:
            newEnough = codedinputbytebuffernano.readBool();
            continue; /* Loop/switch isn't completed */
_L7:
            canResolve = codedinputbytebuffernano.readBool();
            if (true) goto _L8; else goto _L9
_L9:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (resolvedType != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, resolvedType);
            }
            if (!packageName.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, packageName);
            }
            if (minVersion != 0)
            {
                codedoutputbytebuffernano.writeInt32(3, minVersion);
            }
            if (newEnough)
            {
                codedoutputbytebuffernano.writeBool(4, newEnough);
            }
            if (canResolve)
            {
                codedoutputbytebuffernano.writeBool(5, canResolve);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesDeepLinkEvent()
        {
            resolvedType = 0;
            packageName = "";
            minVersion = 0;
            newEnough = false;
            canResolve = false;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesDestinationAppAction extends MessageNano
    {

        public String experimentIds;
        public PlaylogGamesDestinationAppGameAction gameAction;
        public PlaylogGamesDestinationAppGameTabInfo gameTabInfo;
        public PlaylogGamesDestinationAppOnboardingAction onboardingEvent;
        public PlaylogGamesOneTouchCirclesAction oneTouchCirclesAction;
        public int pageType;
        public PlaylogGamesDestinationAppPlayerAction playerAction;
        public PlaylogGamesDestinationAppPlayerTabInfo playerTabInfo;
        public PlaylogGamesDestinationAppSettingsAction settingsAction;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (pageType != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, pageType);
            }
            j = i;
            if (gameTabInfo != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, gameTabInfo);
            }
            i = j;
            if (gameAction != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, gameAction);
            }
            j = i;
            if (settingsAction != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, settingsAction);
            }
            i = j;
            if (playerTabInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, playerTabInfo);
            }
            j = i;
            if (playerAction != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, playerAction);
            }
            i = j;
            if (onboardingEvent != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(7, onboardingEvent);
            }
            j = i;
            if (!experimentIds.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(8, experimentIds);
            }
            i = j;
            if (oneTouchCirclesAction != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(9, oneTouchCirclesAction);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (!(obj instanceof PlaylogGamesDestinationAppAction))
            {
                return false;
            }
            obj = (PlaylogGamesDestinationAppAction)obj;
            if (pageType != ((PlaylogGamesDestinationAppAction) (obj)).pageType)
            {
                return false;
            }
            if (gameTabInfo == null)
            {
                if (((PlaylogGamesDestinationAppAction) (obj)).gameTabInfo != null)
                {
                    return false;
                }
            } else
            if (!gameTabInfo.equals(((PlaylogGamesDestinationAppAction) (obj)).gameTabInfo))
            {
                return false;
            }
            if (gameAction == null)
            {
                if (((PlaylogGamesDestinationAppAction) (obj)).gameAction != null)
                {
                    return false;
                }
            } else
            if (!gameAction.equals(((PlaylogGamesDestinationAppAction) (obj)).gameAction))
            {
                return false;
            }
            if (settingsAction == null)
            {
                if (((PlaylogGamesDestinationAppAction) (obj)).settingsAction != null)
                {
                    return false;
                }
            } else
            if (!settingsAction.equals(((PlaylogGamesDestinationAppAction) (obj)).settingsAction))
            {
                return false;
            }
            if (playerTabInfo == null)
            {
                if (((PlaylogGamesDestinationAppAction) (obj)).playerTabInfo != null)
                {
                    return false;
                }
            } else
            if (!playerTabInfo.equals(((PlaylogGamesDestinationAppAction) (obj)).playerTabInfo))
            {
                return false;
            }
            if (playerAction == null)
            {
                if (((PlaylogGamesDestinationAppAction) (obj)).playerAction != null)
                {
                    return false;
                }
            } else
            if (!playerAction.equals(((PlaylogGamesDestinationAppAction) (obj)).playerAction))
            {
                return false;
            }
            if (onboardingEvent == null)
            {
                if (((PlaylogGamesDestinationAppAction) (obj)).onboardingEvent != null)
                {
                    return false;
                }
            } else
            if (!onboardingEvent.equals(((PlaylogGamesDestinationAppAction) (obj)).onboardingEvent))
            {
                return false;
            }
            if (experimentIds == null)
            {
                if (((PlaylogGamesDestinationAppAction) (obj)).experimentIds != null)
                {
                    return false;
                }
            } else
            if (!experimentIds.equals(((PlaylogGamesDestinationAppAction) (obj)).experimentIds))
            {
                return false;
            }
            if (oneTouchCirclesAction != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((PlaylogGamesDestinationAppAction) (obj)).oneTouchCirclesAction == null) goto _L1; else goto _L3
_L3:
            return false;
            if (oneTouchCirclesAction.equals(((PlaylogGamesDestinationAppAction) (obj)).oneTouchCirclesAction)) goto _L1; else goto _L4
_L4:
            return false;
        }

        public final int hashCode()
        {
            int l1 = 0;
            int i2 = getClass().getName().hashCode();
            int j2 = pageType;
            int i;
            int j;
            int k;
            int l;
            int i1;
            int j1;
            int k1;
            if (gameTabInfo == null)
            {
                i = 0;
            } else
            {
                i = gameTabInfo.hashCode();
            }
            if (gameAction == null)
            {
                j = 0;
            } else
            {
                j = gameAction.hashCode();
            }
            if (settingsAction == null)
            {
                k = 0;
            } else
            {
                k = settingsAction.hashCode();
            }
            if (playerTabInfo == null)
            {
                l = 0;
            } else
            {
                l = playerTabInfo.hashCode();
            }
            if (playerAction == null)
            {
                i1 = 0;
            } else
            {
                i1 = playerAction.hashCode();
            }
            if (onboardingEvent == null)
            {
                j1 = 0;
            } else
            {
                j1 = onboardingEvent.hashCode();
            }
            if (experimentIds == null)
            {
                k1 = 0;
            } else
            {
                k1 = experimentIds.hashCode();
            }
            if (oneTouchCirclesAction != null)
            {
                l1 = oneTouchCirclesAction.hashCode();
            }
            return (((((((((i2 + 527) * 31 + j2) * 31 + i) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L12:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 10: default 96
        //                       0: 104
        //                       8: 106
        //                       18: 187
        //                       26: 216
        //                       34: 245
        //                       42: 274
        //                       50: 303
        //                       58: 332
        //                       66: 361
        //                       74: 372;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L12; else goto _L2
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
                pageType = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (gameTabInfo == null)
            {
                gameTabInfo = new PlaylogGamesDestinationAppGameTabInfo();
            }
            codedinputbytebuffernano.readMessage(gameTabInfo);
            continue; /* Loop/switch isn't completed */
_L5:
            if (gameAction == null)
            {
                gameAction = new PlaylogGamesDestinationAppGameAction();
            }
            codedinputbytebuffernano.readMessage(gameAction);
            continue; /* Loop/switch isn't completed */
_L6:
            if (settingsAction == null)
            {
                settingsAction = new PlaylogGamesDestinationAppSettingsAction();
            }
            codedinputbytebuffernano.readMessage(settingsAction);
            continue; /* Loop/switch isn't completed */
_L7:
            if (playerTabInfo == null)
            {
                playerTabInfo = new PlaylogGamesDestinationAppPlayerTabInfo();
            }
            codedinputbytebuffernano.readMessage(playerTabInfo);
            continue; /* Loop/switch isn't completed */
_L8:
            if (playerAction == null)
            {
                playerAction = new PlaylogGamesDestinationAppPlayerAction();
            }
            codedinputbytebuffernano.readMessage(playerAction);
            continue; /* Loop/switch isn't completed */
_L9:
            if (onboardingEvent == null)
            {
                onboardingEvent = new PlaylogGamesDestinationAppOnboardingAction();
            }
            codedinputbytebuffernano.readMessage(onboardingEvent);
            continue; /* Loop/switch isn't completed */
_L10:
            experimentIds = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L11:
            if (oneTouchCirclesAction == null)
            {
                oneTouchCirclesAction = new PlaylogGamesOneTouchCirclesAction();
            }
            codedinputbytebuffernano.readMessage(oneTouchCirclesAction);
            if (true) goto _L12; else goto _L13
_L13:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (pageType != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, pageType);
            }
            if (gameTabInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(2, gameTabInfo);
            }
            if (gameAction != null)
            {
                codedoutputbytebuffernano.writeMessage(3, gameAction);
            }
            if (settingsAction != null)
            {
                codedoutputbytebuffernano.writeMessage(4, settingsAction);
            }
            if (playerTabInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(5, playerTabInfo);
            }
            if (playerAction != null)
            {
                codedoutputbytebuffernano.writeMessage(6, playerAction);
            }
            if (onboardingEvent != null)
            {
                codedoutputbytebuffernano.writeMessage(7, onboardingEvent);
            }
            if (!experimentIds.equals(""))
            {
                codedoutputbytebuffernano.writeString(8, experimentIds);
            }
            if (oneTouchCirclesAction != null)
            {
                codedoutputbytebuffernano.writeMessage(9, oneTouchCirclesAction);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesDestinationAppAction()
        {
            pageType = 0;
            gameTabInfo = null;
            gameAction = null;
            settingsAction = null;
            playerTabInfo = null;
            playerAction = null;
            onboardingEvent = null;
            experimentIds = "";
            oneTouchCirclesAction = null;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesDestinationAppGameAction extends MessageNano
    {

        public String applicationId;
        public String discoveryTid;
        public PlaylogGamesDestinationAppGamePurchase gamePurchase;
        public boolean launchedGame;
        public PlaylogGamesLeaderboardAction leaderboard;
        public int rankingPosition;
        public int section;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (!applicationId.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, applicationId);
            }
            j = i;
            if (section != 0)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, section);
            }
            i = j;
            if (launchedGame)
            {
                i = j + (CodedOutputByteBufferNano.computeTagSize(3) + 1);
            }
            j = i;
            if (leaderboard != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, leaderboard);
            }
            i = j;
            if (gamePurchase != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, gamePurchase);
            }
            j = i;
            if (!discoveryTid.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, discoveryTid);
            }
            i = j;
            if (rankingPosition != 0)
            {
                i = j + CodedOutputByteBufferNano.computeUInt32Size(7, rankingPosition);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesDestinationAppGameAction))
                {
                    return false;
                }
                obj = (PlaylogGamesDestinationAppGameAction)obj;
                if (applicationId == null)
                {
                    if (((PlaylogGamesDestinationAppGameAction) (obj)).applicationId != null)
                    {
                        return false;
                    }
                } else
                if (!applicationId.equals(((PlaylogGamesDestinationAppGameAction) (obj)).applicationId))
                {
                    return false;
                }
                if (section != ((PlaylogGamesDestinationAppGameAction) (obj)).section)
                {
                    return false;
                }
                if (launchedGame != ((PlaylogGamesDestinationAppGameAction) (obj)).launchedGame)
                {
                    return false;
                }
                if (leaderboard == null)
                {
                    if (((PlaylogGamesDestinationAppGameAction) (obj)).leaderboard != null)
                    {
                        return false;
                    }
                } else
                if (!leaderboard.equals(((PlaylogGamesDestinationAppGameAction) (obj)).leaderboard))
                {
                    return false;
                }
                if (gamePurchase == null)
                {
                    if (((PlaylogGamesDestinationAppGameAction) (obj)).gamePurchase != null)
                    {
                        return false;
                    }
                } else
                if (!gamePurchase.equals(((PlaylogGamesDestinationAppGameAction) (obj)).gamePurchase))
                {
                    return false;
                }
                if (discoveryTid == null)
                {
                    if (((PlaylogGamesDestinationAppGameAction) (obj)).discoveryTid != null)
                    {
                        return false;
                    }
                } else
                if (!discoveryTid.equals(((PlaylogGamesDestinationAppGameAction) (obj)).discoveryTid))
                {
                    return false;
                }
                if (rankingPosition != ((PlaylogGamesDestinationAppGameAction) (obj)).rankingPosition)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int l = 0;
            int i1 = getClass().getName().hashCode();
            int i;
            char c;
            int j;
            int k;
            int j1;
            if (applicationId == null)
            {
                i = 0;
            } else
            {
                i = applicationId.hashCode();
            }
            j1 = section;
            if (launchedGame)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            if (leaderboard == null)
            {
                j = 0;
            } else
            {
                j = leaderboard.hashCode();
            }
            if (gamePurchase == null)
            {
                k = 0;
            } else
            {
                k = gamePurchase.hashCode();
            }
            if (discoveryTid != null)
            {
                l = discoveryTid.hashCode();
            }
            return (((((((i1 + 527) * 31 + i) * 31 + j1) * 31 + c) * 31 + j) * 31 + k) * 31 + l) * 31 + rankingPosition;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L10:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 8: default 80
        //                       0: 88
        //                       10: 90
        //                       16: 101
        //                       24: 155
        //                       34: 166
        //                       42: 195
        //                       50: 224
        //                       56: 235;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L10; else goto _L2
_L2:
            return this;
_L3:
            applicationId = codedinputbytebuffernano.readString();
              goto _L10
_L4:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
                section = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            launchedGame = codedinputbytebuffernano.readBool();
            continue; /* Loop/switch isn't completed */
_L6:
            if (leaderboard == null)
            {
                leaderboard = new PlaylogGamesLeaderboardAction();
            }
            codedinputbytebuffernano.readMessage(leaderboard);
            continue; /* Loop/switch isn't completed */
_L7:
            if (gamePurchase == null)
            {
                gamePurchase = new PlaylogGamesDestinationAppGamePurchase();
            }
            codedinputbytebuffernano.readMessage(gamePurchase);
            continue; /* Loop/switch isn't completed */
_L8:
            discoveryTid = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L9:
            rankingPosition = codedinputbytebuffernano.readRawVarint32();
            if (true) goto _L10; else goto _L11
_L11:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (!applicationId.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, applicationId);
            }
            if (section != 0)
            {
                codedoutputbytebuffernano.writeInt32(2, section);
            }
            if (launchedGame)
            {
                codedoutputbytebuffernano.writeBool(3, launchedGame);
            }
            if (leaderboard != null)
            {
                codedoutputbytebuffernano.writeMessage(4, leaderboard);
            }
            if (gamePurchase != null)
            {
                codedoutputbytebuffernano.writeMessage(5, gamePurchase);
            }
            if (!discoveryTid.equals(""))
            {
                codedoutputbytebuffernano.writeString(6, discoveryTid);
            }
            if (rankingPosition != 0)
            {
                codedoutputbytebuffernano.writeUInt32(7, rankingPosition);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesDestinationAppGameAction()
        {
            applicationId = "";
            section = 0;
            launchedGame = false;
            leaderboard = null;
            gamePurchase = null;
            discoveryTid = "";
            rankingPosition = 0;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesDestinationAppGamePurchase extends MessageNano
    {

        public String discoveryTid;
        public boolean hasCompletedPurchase;
        public long priceMicros;
        public int rankingPosition;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (priceMicros != 0L)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, priceMicros);
            }
            j = i;
            if (hasCompletedPurchase)
            {
                j = i + (CodedOutputByteBufferNano.computeTagSize(2) + 1);
            }
            i = j;
            if (!discoveryTid.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, discoveryTid);
            }
            j = i;
            if (rankingPosition != 0)
            {
                j = i + CodedOutputByteBufferNano.computeUInt32Size(4, rankingPosition);
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesDestinationAppGamePurchase))
                {
                    return false;
                }
                obj = (PlaylogGamesDestinationAppGamePurchase)obj;
                if (priceMicros != ((PlaylogGamesDestinationAppGamePurchase) (obj)).priceMicros)
                {
                    return false;
                }
                if (hasCompletedPurchase != ((PlaylogGamesDestinationAppGamePurchase) (obj)).hasCompletedPurchase)
                {
                    return false;
                }
                if (discoveryTid == null)
                {
                    if (((PlaylogGamesDestinationAppGamePurchase) (obj)).discoveryTid != null)
                    {
                        return false;
                    }
                } else
                if (!discoveryTid.equals(((PlaylogGamesDestinationAppGamePurchase) (obj)).discoveryTid))
                {
                    return false;
                }
                if (rankingPosition != ((PlaylogGamesDestinationAppGamePurchase) (obj)).rankingPosition)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int j = getClass().getName().hashCode();
            int k = (int)(priceMicros ^ priceMicros >>> 32);
            char c;
            int i;
            if (hasCompletedPurchase)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            if (discoveryTid == null)
            {
                i = 0;
            } else
            {
                i = discoveryTid.hashCode();
            }
            return ((((j + 527) * 31 + k) * 31 + c) * 31 + i) * 31 + rankingPosition;
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
                    priceMicros = codedinputbytebuffernano.readRawVarint64();
                    break;

                case 16: // '\020'
                    hasCompletedPurchase = codedinputbytebuffernano.readBool();
                    break;

                case 26: // '\032'
                    discoveryTid = codedinputbytebuffernano.readString();
                    break;

                case 32: // ' '
                    rankingPosition = codedinputbytebuffernano.readRawVarint32();
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (priceMicros != 0L)
            {
                codedoutputbytebuffernano.writeInt64(1, priceMicros);
            }
            if (hasCompletedPurchase)
            {
                codedoutputbytebuffernano.writeBool(2, hasCompletedPurchase);
            }
            if (!discoveryTid.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, discoveryTid);
            }
            if (rankingPosition != 0)
            {
                codedoutputbytebuffernano.writeUInt32(4, rankingPosition);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesDestinationAppGamePurchase()
        {
            priceMicros = 0L;
            hasCompletedPurchase = false;
            discoveryTid = "";
            rankingPosition = 0;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesDestinationAppGameTabInfo extends MessageNano
    {

        public int collection;
        public String discoveryTid;
        public boolean topOfList;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (collection != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, collection);
            }
            j = i;
            if (topOfList)
            {
                j = i + (CodedOutputByteBufferNano.computeTagSize(2) + 1);
            }
            i = j;
            if (!discoveryTid.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, discoveryTid);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (!(obj instanceof PlaylogGamesDestinationAppGameTabInfo))
            {
                return false;
            }
            obj = (PlaylogGamesDestinationAppGameTabInfo)obj;
            if (collection != ((PlaylogGamesDestinationAppGameTabInfo) (obj)).collection)
            {
                return false;
            }
            if (topOfList != ((PlaylogGamesDestinationAppGameTabInfo) (obj)).topOfList)
            {
                return false;
            }
            if (discoveryTid != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((PlaylogGamesDestinationAppGameTabInfo) (obj)).discoveryTid == null) goto _L1; else goto _L3
_L3:
            return false;
            if (discoveryTid.equals(((PlaylogGamesDestinationAppGameTabInfo) (obj)).discoveryTid)) goto _L1; else goto _L4
_L4:
            return false;
        }

        public final int hashCode()
        {
            int j = getClass().getName().hashCode();
            int k = collection;
            char c;
            int i;
            if (topOfList)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            if (discoveryTid == null)
            {
                i = 0;
            } else
            {
                i = discoveryTid.hashCode();
            }
            return i + (((j + 527) * 31 + k) * 31 + c) * 31;
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
        //                       16: 135
        //                       26: 146;
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
                collection = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            topOfList = codedinputbytebuffernano.readBool();
            continue; /* Loop/switch isn't completed */
_L5:
            discoveryTid = codedinputbytebuffernano.readString();
            if (true) goto _L6; else goto _L7
_L7:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (collection != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, collection);
            }
            if (topOfList)
            {
                codedoutputbytebuffernano.writeBool(2, topOfList);
            }
            if (!discoveryTid.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, discoveryTid);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesDestinationAppGameTabInfo()
        {
            collection = 0;
            topOfList = false;
            discoveryTid = "";
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesDestinationAppOnboardingAction extends MessageNano
    {

        public int onboardingEvent;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (onboardingEvent != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, onboardingEvent);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesDestinationAppOnboardingAction))
                {
                    return false;
                }
                obj = (PlaylogGamesDestinationAppOnboardingAction)obj;
                if (onboardingEvent != ((PlaylogGamesDestinationAppOnboardingAction) (obj)).onboardingEvent)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return (getClass().getName().hashCode() + 527) * 31 + onboardingEvent;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L4:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 2: default 32
        //                       0: 40
        //                       8: 42;
               goto _L1 _L2 _L3
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L4; else goto _L2
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
                onboardingEvent = j;
                break;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (onboardingEvent != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, onboardingEvent);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesDestinationAppOnboardingAction()
        {
            onboardingEvent = 0;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesDestinationAppPlayerAction extends MessageNano
    {

        public String discoveryTid;
        public int rankingPosition;
        public int section;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (section != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, section);
            }
            j = i;
            if (!discoveryTid.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, discoveryTid);
            }
            i = j;
            if (rankingPosition != 0)
            {
                i = j + CodedOutputByteBufferNano.computeUInt32Size(3, rankingPosition);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesDestinationAppPlayerAction))
                {
                    return false;
                }
                obj = (PlaylogGamesDestinationAppPlayerAction)obj;
                if (section != ((PlaylogGamesDestinationAppPlayerAction) (obj)).section)
                {
                    return false;
                }
                if (discoveryTid == null)
                {
                    if (((PlaylogGamesDestinationAppPlayerAction) (obj)).discoveryTid != null)
                    {
                        return false;
                    }
                } else
                if (!discoveryTid.equals(((PlaylogGamesDestinationAppPlayerAction) (obj)).discoveryTid))
                {
                    return false;
                }
                if (rankingPosition != ((PlaylogGamesDestinationAppPlayerAction) (obj)).rankingPosition)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int j = getClass().getName().hashCode();
            int k = section;
            int i;
            if (discoveryTid == null)
            {
                i = 0;
            } else
            {
                i = discoveryTid.hashCode();
            }
            return (((j + 527) * 31 + k) * 31 + i) * 31 + rankingPosition;
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
        //                       18: 111
        //                       24: 122;
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
                section = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            discoveryTid = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L5:
            rankingPosition = codedinputbytebuffernano.readRawVarint32();
            if (true) goto _L6; else goto _L7
_L7:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (section != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, section);
            }
            if (!discoveryTid.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, discoveryTid);
            }
            if (rankingPosition != 0)
            {
                codedoutputbytebuffernano.writeUInt32(3, rankingPosition);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesDestinationAppPlayerAction()
        {
            section = 0;
            discoveryTid = "";
            rankingPosition = 0;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesDestinationAppPlayerTabInfo extends MessageNano
    {

        public int collection;
        public String discoveryTid;
        public boolean topOfList;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (collection != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, collection);
            }
            j = i;
            if (topOfList)
            {
                j = i + (CodedOutputByteBufferNano.computeTagSize(2) + 1);
            }
            i = j;
            if (!discoveryTid.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, discoveryTid);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (!(obj instanceof PlaylogGamesDestinationAppPlayerTabInfo))
            {
                return false;
            }
            obj = (PlaylogGamesDestinationAppPlayerTabInfo)obj;
            if (collection != ((PlaylogGamesDestinationAppPlayerTabInfo) (obj)).collection)
            {
                return false;
            }
            if (topOfList != ((PlaylogGamesDestinationAppPlayerTabInfo) (obj)).topOfList)
            {
                return false;
            }
            if (discoveryTid != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((PlaylogGamesDestinationAppPlayerTabInfo) (obj)).discoveryTid == null) goto _L1; else goto _L3
_L3:
            return false;
            if (discoveryTid.equals(((PlaylogGamesDestinationAppPlayerTabInfo) (obj)).discoveryTid)) goto _L1; else goto _L4
_L4:
            return false;
        }

        public final int hashCode()
        {
            int j = getClass().getName().hashCode();
            int k = collection;
            char c;
            int i;
            if (topOfList)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            if (discoveryTid == null)
            {
                i = 0;
            } else
            {
                i = discoveryTid.hashCode();
            }
            return i + (((j + 527) * 31 + k) * 31 + c) * 31;
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
        //                       16: 107
        //                       26: 118;
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
                collection = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            topOfList = codedinputbytebuffernano.readBool();
            continue; /* Loop/switch isn't completed */
_L5:
            discoveryTid = codedinputbytebuffernano.readString();
            if (true) goto _L6; else goto _L7
_L7:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (collection != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, collection);
            }
            if (topOfList)
            {
                codedoutputbytebuffernano.writeBool(2, topOfList);
            }
            if (!discoveryTid.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, discoveryTid);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesDestinationAppPlayerTabInfo()
        {
            collection = 0;
            topOfList = false;
            discoveryTid = "";
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesDestinationAppSettingsAction extends MessageNano
    {

        public boolean emailNotificationsEnabled;
        public boolean mobileNotificationsEnabled;
        public boolean socialSharingEnabled;
        public boolean switchedAccount;
        public String unmutedNotificationsAppId[];

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (switchedAccount)
            {
                i = j + (CodedOutputByteBufferNano.computeTagSize(1) + 1);
            }
            j = i;
            if (mobileNotificationsEnabled)
            {
                j = i + (CodedOutputByteBufferNano.computeTagSize(2) + 1);
            }
            int k = j;
            if (emailNotificationsEnabled)
            {
                k = j + (CodedOutputByteBufferNano.computeTagSize(3) + 1);
            }
            i = k;
            if (socialSharingEnabled)
            {
                i = k + (CodedOutputByteBufferNano.computeTagSize(4) + 1);
            }
            j = i;
            if (unmutedNotificationsAppId != null)
            {
                j = i;
                if (unmutedNotificationsAppId.length > 0)
                {
                    int j1 = 0;
                    int l = 0;
                    for (j = 0; j < unmutedNotificationsAppId.length;)
                    {
                        String s = unmutedNotificationsAppId[j];
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

                    j = i + l + j1 * 1;
                }
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesDestinationAppSettingsAction))
                {
                    return false;
                }
                obj = (PlaylogGamesDestinationAppSettingsAction)obj;
                if (switchedAccount != ((PlaylogGamesDestinationAppSettingsAction) (obj)).switchedAccount)
                {
                    return false;
                }
                if (mobileNotificationsEnabled != ((PlaylogGamesDestinationAppSettingsAction) (obj)).mobileNotificationsEnabled)
                {
                    return false;
                }
                if (emailNotificationsEnabled != ((PlaylogGamesDestinationAppSettingsAction) (obj)).emailNotificationsEnabled)
                {
                    return false;
                }
                if (socialSharingEnabled != ((PlaylogGamesDestinationAppSettingsAction) (obj)).socialSharingEnabled)
                {
                    return false;
                }
                if (!InternalNano.equals(unmutedNotificationsAppId, ((PlaylogGamesDestinationAppSettingsAction) (obj)).unmutedNotificationsAppId))
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
            char c;
            char c1;
            char c2;
            if (switchedAccount)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            if (mobileNotificationsEnabled)
            {
                c1 = '\u04CF';
            } else
            {
                c1 = '\u04D5';
            }
            if (emailNotificationsEnabled)
            {
                c2 = '\u04CF';
            } else
            {
                c2 = '\u04D5';
            }
            if (!socialSharingEnabled)
            {
                c3 = '\u04D5';
            }
            return (((((i + 527) * 31 + c) * 31 + c1) * 31 + c2) * 31 + c3) * 31 + InternalNano.hashCode(unmutedNotificationsAppId);
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
                    switchedAccount = codedinputbytebuffernano.readBool();
                    break;

                case 16: // '\020'
                    mobileNotificationsEnabled = codedinputbytebuffernano.readBool();
                    break;

                case 24: // '\030'
                    emailNotificationsEnabled = codedinputbytebuffernano.readBool();
                    break;

                case 32: // ' '
                    socialSharingEnabled = codedinputbytebuffernano.readBool();
                    break;

                case 42: // '*'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
                    String as[];
                    int j;
                    if (unmutedNotificationsAppId == null)
                    {
                        j = 0;
                    } else
                    {
                        j = unmutedNotificationsAppId.length;
                    }
                    as = new String[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(unmutedNotificationsAppId, 0, as, 0, j);
                        k = j;
                    }
                    for (; k < as.length - 1; k++)
                    {
                        as[k] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[k] = codedinputbytebuffernano.readString();
                    unmutedNotificationsAppId = as;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (switchedAccount)
            {
                codedoutputbytebuffernano.writeBool(1, switchedAccount);
            }
            if (mobileNotificationsEnabled)
            {
                codedoutputbytebuffernano.writeBool(2, mobileNotificationsEnabled);
            }
            if (emailNotificationsEnabled)
            {
                codedoutputbytebuffernano.writeBool(3, emailNotificationsEnabled);
            }
            if (socialSharingEnabled)
            {
                codedoutputbytebuffernano.writeBool(4, socialSharingEnabled);
            }
            if (unmutedNotificationsAppId != null && unmutedNotificationsAppId.length > 0)
            {
                for (int i = 0; i < unmutedNotificationsAppId.length; i++)
                {
                    String s = unmutedNotificationsAppId[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(5, s);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesDestinationAppSettingsAction()
        {
            switchedAccount = false;
            mobileNotificationsEnabled = false;
            emailNotificationsEnabled = false;
            socialSharingEnabled = false;
            unmutedNotificationsAppId = WireFormatNano.EMPTY_STRING_ARRAY;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesExtension extends MessageNano
    {

        public PlaylogGamesDestinationAppAction destApp;
        public PlaylogGamesGenericNotificationAction genericNotification;
        public PlaylogGamesInGameAction inGame;
        public PlaylogGamesIosDeviceAction iosAction;
        public PlaylogGamesLatencyAction latency;
        public PlaylogGamesLogEvent logflowEvent;
        public PlaylogGamesModifyCirclesAction modifyCircles;
        public PlaylogNearbyConnectionsSession nearbyConnectionsSession;
        public PlaylogGamesNearbyPlayerAction nearbyPlayer;
        public PlaylogGamesNotificationActionDeprecated notification;
        public PlaylogPlusUpgrade plusUpgrade;
        public PlaylogGamesRequestInfo requestInfo;
        public PlaylogGamesRtmpSession rtmpSession;
        public PlaylogRtmpWaitingRoomSession rtmpWaitingRoomSession;
        public PlaylogGamesSelectedPlayers selectedPlayers;
        public PlaylogGamesSignInAction signIn;
        public PlaylogGamesSnapshotAction snapshot;
        public PlaylogGamesAndroidSyncAction sync;
        public PlaylogGamesSystemStats systemStats;
        public PlaylogGamesVideoAction video;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (requestInfo != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, requestInfo);
            }
            j = i;
            if (signIn != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, signIn);
            }
            i = j;
            if (inGame != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, inGame);
            }
            j = i;
            if (destApp != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, destApp);
            }
            i = j;
            if (notification != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, notification);
            }
            j = i;
            if (genericNotification != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(6, genericNotification);
            }
            i = j;
            if (iosAction != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(7, iosAction);
            }
            j = i;
            if (modifyCircles != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(8, modifyCircles);
            }
            i = j;
            if (sync != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(9, sync);
            }
            j = i;
            if (rtmpSession != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(10, rtmpSession);
            }
            i = j;
            if (snapshot != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(11, snapshot);
            }
            j = i;
            if (rtmpWaitingRoomSession != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(12, rtmpWaitingRoomSession);
            }
            i = j;
            if (nearbyPlayer != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(13, nearbyPlayer);
            }
            j = i;
            if (selectedPlayers != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(14, selectedPlayers);
            }
            i = j;
            if (logflowEvent != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(15, logflowEvent);
            }
            j = i;
            if (systemStats != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(16, systemStats);
            }
            i = j;
            if (nearbyConnectionsSession != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(17, nearbyConnectionsSession);
            }
            j = i;
            if (plusUpgrade != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(18, plusUpgrade);
            }
            i = j;
            if (video != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(19, video);
            }
            j = i;
            if (latency != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(20, latency);
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (!(obj instanceof PlaylogGamesExtension))
            {
                return false;
            }
            obj = (PlaylogGamesExtension)obj;
            if (requestInfo == null)
            {
                if (((PlaylogGamesExtension) (obj)).requestInfo != null)
                {
                    return false;
                }
            } else
            if (!requestInfo.equals(((PlaylogGamesExtension) (obj)).requestInfo))
            {
                return false;
            }
            if (signIn == null)
            {
                if (((PlaylogGamesExtension) (obj)).signIn != null)
                {
                    return false;
                }
            } else
            if (!signIn.equals(((PlaylogGamesExtension) (obj)).signIn))
            {
                return false;
            }
            if (inGame == null)
            {
                if (((PlaylogGamesExtension) (obj)).inGame != null)
                {
                    return false;
                }
            } else
            if (!inGame.equals(((PlaylogGamesExtension) (obj)).inGame))
            {
                return false;
            }
            if (destApp == null)
            {
                if (((PlaylogGamesExtension) (obj)).destApp != null)
                {
                    return false;
                }
            } else
            if (!destApp.equals(((PlaylogGamesExtension) (obj)).destApp))
            {
                return false;
            }
            if (notification == null)
            {
                if (((PlaylogGamesExtension) (obj)).notification != null)
                {
                    return false;
                }
            } else
            if (!notification.equals(((PlaylogGamesExtension) (obj)).notification))
            {
                return false;
            }
            if (genericNotification == null)
            {
                if (((PlaylogGamesExtension) (obj)).genericNotification != null)
                {
                    return false;
                }
            } else
            if (!genericNotification.equals(((PlaylogGamesExtension) (obj)).genericNotification))
            {
                return false;
            }
            if (iosAction == null)
            {
                if (((PlaylogGamesExtension) (obj)).iosAction != null)
                {
                    return false;
                }
            } else
            if (!iosAction.equals(((PlaylogGamesExtension) (obj)).iosAction))
            {
                return false;
            }
            if (modifyCircles == null)
            {
                if (((PlaylogGamesExtension) (obj)).modifyCircles != null)
                {
                    return false;
                }
            } else
            if (!modifyCircles.equals(((PlaylogGamesExtension) (obj)).modifyCircles))
            {
                return false;
            }
            if (sync == null)
            {
                if (((PlaylogGamesExtension) (obj)).sync != null)
                {
                    return false;
                }
            } else
            if (!sync.equals(((PlaylogGamesExtension) (obj)).sync))
            {
                return false;
            }
            if (rtmpSession == null)
            {
                if (((PlaylogGamesExtension) (obj)).rtmpSession != null)
                {
                    return false;
                }
            } else
            if (!rtmpSession.equals(((PlaylogGamesExtension) (obj)).rtmpSession))
            {
                return false;
            }
            if (snapshot == null)
            {
                if (((PlaylogGamesExtension) (obj)).snapshot != null)
                {
                    return false;
                }
            } else
            if (!snapshot.equals(((PlaylogGamesExtension) (obj)).snapshot))
            {
                return false;
            }
            if (rtmpWaitingRoomSession == null)
            {
                if (((PlaylogGamesExtension) (obj)).rtmpWaitingRoomSession != null)
                {
                    return false;
                }
            } else
            if (!rtmpWaitingRoomSession.equals(((PlaylogGamesExtension) (obj)).rtmpWaitingRoomSession))
            {
                return false;
            }
            if (nearbyPlayer == null)
            {
                if (((PlaylogGamesExtension) (obj)).nearbyPlayer != null)
                {
                    return false;
                }
            } else
            if (!nearbyPlayer.equals(((PlaylogGamesExtension) (obj)).nearbyPlayer))
            {
                return false;
            }
            if (selectedPlayers == null)
            {
                if (((PlaylogGamesExtension) (obj)).selectedPlayers != null)
                {
                    return false;
                }
            } else
            if (!selectedPlayers.equals(((PlaylogGamesExtension) (obj)).selectedPlayers))
            {
                return false;
            }
            if (logflowEvent == null)
            {
                if (((PlaylogGamesExtension) (obj)).logflowEvent != null)
                {
                    return false;
                }
            } else
            if (!logflowEvent.equals(((PlaylogGamesExtension) (obj)).logflowEvent))
            {
                return false;
            }
            if (systemStats == null)
            {
                if (((PlaylogGamesExtension) (obj)).systemStats != null)
                {
                    return false;
                }
            } else
            if (!systemStats.equals(((PlaylogGamesExtension) (obj)).systemStats))
            {
                return false;
            }
            if (nearbyConnectionsSession == null)
            {
                if (((PlaylogGamesExtension) (obj)).nearbyConnectionsSession != null)
                {
                    return false;
                }
            } else
            if (!nearbyConnectionsSession.equals(((PlaylogGamesExtension) (obj)).nearbyConnectionsSession))
            {
                return false;
            }
            if (plusUpgrade == null)
            {
                if (((PlaylogGamesExtension) (obj)).plusUpgrade != null)
                {
                    return false;
                }
            } else
            if (!plusUpgrade.equals(((PlaylogGamesExtension) (obj)).plusUpgrade))
            {
                return false;
            }
            if (video == null)
            {
                if (((PlaylogGamesExtension) (obj)).video != null)
                {
                    return false;
                }
            } else
            if (!video.equals(((PlaylogGamesExtension) (obj)).video))
            {
                return false;
            }
            if (latency != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((PlaylogGamesExtension) (obj)).latency == null) goto _L1; else goto _L3
_L3:
            return false;
            if (latency.equals(((PlaylogGamesExtension) (obj)).latency)) goto _L1; else goto _L4
_L4:
            return false;
        }

        public final int hashCode()
        {
            int l4 = 0;
            int i5 = getClass().getName().hashCode();
            int i;
            int j;
            int k;
            int l;
            int i1;
            int j1;
            int k1;
            int l1;
            int i2;
            int j2;
            int k2;
            int l2;
            int i3;
            int j3;
            int k3;
            int l3;
            int i4;
            int j4;
            int k4;
            if (requestInfo == null)
            {
                i = 0;
            } else
            {
                i = requestInfo.hashCode();
            }
            if (signIn == null)
            {
                j = 0;
            } else
            {
                j = signIn.hashCode();
            }
            if (inGame == null)
            {
                k = 0;
            } else
            {
                k = inGame.hashCode();
            }
            if (destApp == null)
            {
                l = 0;
            } else
            {
                l = destApp.hashCode();
            }
            if (notification == null)
            {
                i1 = 0;
            } else
            {
                i1 = notification.hashCode();
            }
            if (genericNotification == null)
            {
                j1 = 0;
            } else
            {
                j1 = genericNotification.hashCode();
            }
            if (iosAction == null)
            {
                k1 = 0;
            } else
            {
                k1 = iosAction.hashCode();
            }
            if (modifyCircles == null)
            {
                l1 = 0;
            } else
            {
                l1 = modifyCircles.hashCode();
            }
            if (sync == null)
            {
                i2 = 0;
            } else
            {
                i2 = sync.hashCode();
            }
            if (rtmpSession == null)
            {
                j2 = 0;
            } else
            {
                j2 = rtmpSession.hashCode();
            }
            if (snapshot == null)
            {
                k2 = 0;
            } else
            {
                k2 = snapshot.hashCode();
            }
            if (rtmpWaitingRoomSession == null)
            {
                l2 = 0;
            } else
            {
                l2 = rtmpWaitingRoomSession.hashCode();
            }
            if (nearbyPlayer == null)
            {
                i3 = 0;
            } else
            {
                i3 = nearbyPlayer.hashCode();
            }
            if (selectedPlayers == null)
            {
                j3 = 0;
            } else
            {
                j3 = selectedPlayers.hashCode();
            }
            if (logflowEvent == null)
            {
                k3 = 0;
            } else
            {
                k3 = logflowEvent.hashCode();
            }
            if (systemStats == null)
            {
                l3 = 0;
            } else
            {
                l3 = systemStats.hashCode();
            }
            if (nearbyConnectionsSession == null)
            {
                i4 = 0;
            } else
            {
                i4 = nearbyConnectionsSession.hashCode();
            }
            if (plusUpgrade == null)
            {
                j4 = 0;
            } else
            {
                j4 = plusUpgrade.hashCode();
            }
            if (video == null)
            {
                k4 = 0;
            } else
            {
                k4 = video.hashCode();
            }
            if (latency != null)
            {
                l4 = latency.hashCode();
            }
            return ((((((((((((((((((((i5 + 527) * 31 + i) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + l3) * 31 + i4) * 31 + j4) * 31 + k4) * 31 + l4;
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
                    if (requestInfo == null)
                    {
                        requestInfo = new PlaylogGamesRequestInfo();
                    }
                    codedinputbytebuffernano.readMessage(requestInfo);
                    break;

                case 18: // '\022'
                    if (signIn == null)
                    {
                        signIn = new PlaylogGamesSignInAction();
                    }
                    codedinputbytebuffernano.readMessage(signIn);
                    break;

                case 26: // '\032'
                    if (inGame == null)
                    {
                        inGame = new PlaylogGamesInGameAction();
                    }
                    codedinputbytebuffernano.readMessage(inGame);
                    break;

                case 34: // '"'
                    if (destApp == null)
                    {
                        destApp = new PlaylogGamesDestinationAppAction();
                    }
                    codedinputbytebuffernano.readMessage(destApp);
                    break;

                case 42: // '*'
                    if (notification == null)
                    {
                        notification = new PlaylogGamesNotificationActionDeprecated();
                    }
                    codedinputbytebuffernano.readMessage(notification);
                    break;

                case 50: // '2'
                    if (genericNotification == null)
                    {
                        genericNotification = new PlaylogGamesGenericNotificationAction();
                    }
                    codedinputbytebuffernano.readMessage(genericNotification);
                    break;

                case 58: // ':'
                    if (iosAction == null)
                    {
                        iosAction = new PlaylogGamesIosDeviceAction();
                    }
                    codedinputbytebuffernano.readMessage(iosAction);
                    break;

                case 66: // 'B'
                    if (modifyCircles == null)
                    {
                        modifyCircles = new PlaylogGamesModifyCirclesAction();
                    }
                    codedinputbytebuffernano.readMessage(modifyCircles);
                    break;

                case 74: // 'J'
                    if (sync == null)
                    {
                        sync = new PlaylogGamesAndroidSyncAction();
                    }
                    codedinputbytebuffernano.readMessage(sync);
                    break;

                case 82: // 'R'
                    if (rtmpSession == null)
                    {
                        rtmpSession = new PlaylogGamesRtmpSession();
                    }
                    codedinputbytebuffernano.readMessage(rtmpSession);
                    break;

                case 90: // 'Z'
                    if (snapshot == null)
                    {
                        snapshot = new PlaylogGamesSnapshotAction();
                    }
                    codedinputbytebuffernano.readMessage(snapshot);
                    break;

                case 98: // 'b'
                    if (rtmpWaitingRoomSession == null)
                    {
                        rtmpWaitingRoomSession = new PlaylogRtmpWaitingRoomSession();
                    }
                    codedinputbytebuffernano.readMessage(rtmpWaitingRoomSession);
                    break;

                case 106: // 'j'
                    if (nearbyPlayer == null)
                    {
                        nearbyPlayer = new PlaylogGamesNearbyPlayerAction();
                    }
                    codedinputbytebuffernano.readMessage(nearbyPlayer);
                    break;

                case 114: // 'r'
                    if (selectedPlayers == null)
                    {
                        selectedPlayers = new PlaylogGamesSelectedPlayers();
                    }
                    codedinputbytebuffernano.readMessage(selectedPlayers);
                    break;

                case 122: // 'z'
                    if (logflowEvent == null)
                    {
                        logflowEvent = new PlaylogGamesLogEvent();
                    }
                    codedinputbytebuffernano.readMessage(logflowEvent);
                    break;

                case 130: 
                    if (systemStats == null)
                    {
                        systemStats = new PlaylogGamesSystemStats();
                    }
                    codedinputbytebuffernano.readMessage(systemStats);
                    break;

                case 138: 
                    if (nearbyConnectionsSession == null)
                    {
                        nearbyConnectionsSession = new PlaylogNearbyConnectionsSession();
                    }
                    codedinputbytebuffernano.readMessage(nearbyConnectionsSession);
                    break;

                case 146: 
                    if (plusUpgrade == null)
                    {
                        plusUpgrade = new PlaylogPlusUpgrade();
                    }
                    codedinputbytebuffernano.readMessage(plusUpgrade);
                    break;

                case 154: 
                    if (video == null)
                    {
                        video = new PlaylogGamesVideoAction();
                    }
                    codedinputbytebuffernano.readMessage(video);
                    break;

                case 162: 
                    if (latency == null)
                    {
                        latency = new PlaylogGamesLatencyAction();
                    }
                    codedinputbytebuffernano.readMessage(latency);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (requestInfo != null)
            {
                codedoutputbytebuffernano.writeMessage(1, requestInfo);
            }
            if (signIn != null)
            {
                codedoutputbytebuffernano.writeMessage(2, signIn);
            }
            if (inGame != null)
            {
                codedoutputbytebuffernano.writeMessage(3, inGame);
            }
            if (destApp != null)
            {
                codedoutputbytebuffernano.writeMessage(4, destApp);
            }
            if (notification != null)
            {
                codedoutputbytebuffernano.writeMessage(5, notification);
            }
            if (genericNotification != null)
            {
                codedoutputbytebuffernano.writeMessage(6, genericNotification);
            }
            if (iosAction != null)
            {
                codedoutputbytebuffernano.writeMessage(7, iosAction);
            }
            if (modifyCircles != null)
            {
                codedoutputbytebuffernano.writeMessage(8, modifyCircles);
            }
            if (sync != null)
            {
                codedoutputbytebuffernano.writeMessage(9, sync);
            }
            if (rtmpSession != null)
            {
                codedoutputbytebuffernano.writeMessage(10, rtmpSession);
            }
            if (snapshot != null)
            {
                codedoutputbytebuffernano.writeMessage(11, snapshot);
            }
            if (rtmpWaitingRoomSession != null)
            {
                codedoutputbytebuffernano.writeMessage(12, rtmpWaitingRoomSession);
            }
            if (nearbyPlayer != null)
            {
                codedoutputbytebuffernano.writeMessage(13, nearbyPlayer);
            }
            if (selectedPlayers != null)
            {
                codedoutputbytebuffernano.writeMessage(14, selectedPlayers);
            }
            if (logflowEvent != null)
            {
                codedoutputbytebuffernano.writeMessage(15, logflowEvent);
            }
            if (systemStats != null)
            {
                codedoutputbytebuffernano.writeMessage(16, systemStats);
            }
            if (nearbyConnectionsSession != null)
            {
                codedoutputbytebuffernano.writeMessage(17, nearbyConnectionsSession);
            }
            if (plusUpgrade != null)
            {
                codedoutputbytebuffernano.writeMessage(18, plusUpgrade);
            }
            if (video != null)
            {
                codedoutputbytebuffernano.writeMessage(19, video);
            }
            if (latency != null)
            {
                codedoutputbytebuffernano.writeMessage(20, latency);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesExtension()
        {
            requestInfo = null;
            signIn = null;
            inGame = null;
            destApp = null;
            notification = null;
            genericNotification = null;
            iosAction = null;
            modifyCircles = null;
            sync = null;
            rtmpSession = null;
            snapshot = null;
            rtmpWaitingRoomSession = null;
            nearbyPlayer = null;
            selectedPlayers = null;
            logflowEvent = null;
            systemStats = null;
            nearbyConnectionsSession = null;
            plusUpgrade = null;
            video = null;
            latency = null;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesGPlusUpgrade extends MessageNano
    {

        public int state;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (state != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, state);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesGPlusUpgrade))
                {
                    return false;
                }
                obj = (PlaylogGamesGPlusUpgrade)obj;
                if (state != ((PlaylogGamesGPlusUpgrade) (obj)).state)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return (getClass().getName().hashCode() + 527) * 31 + state;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L4:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 2: default 32
        //                       0: 40
        //                       8: 42;
               goto _L1 _L2 _L3
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L4; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                state = j;
                break;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (state != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, state);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesGPlusUpgrade()
        {
            state = 0;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesGenericNotificationAction extends MessageNano
    {

        public int actionType;
        public PlaylogGamesAndroidNotificationAction androidAction;
        public PlaylogGamesIosNotificationAction iosAction;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (actionType != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, actionType);
            }
            j = i;
            if (androidAction != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, androidAction);
            }
            i = j;
            if (iosAction != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, iosAction);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (!(obj instanceof PlaylogGamesGenericNotificationAction))
            {
                return false;
            }
            obj = (PlaylogGamesGenericNotificationAction)obj;
            if (actionType != ((PlaylogGamesGenericNotificationAction) (obj)).actionType)
            {
                return false;
            }
            if (androidAction == null)
            {
                if (((PlaylogGamesGenericNotificationAction) (obj)).androidAction != null)
                {
                    return false;
                }
            } else
            if (!androidAction.equals(((PlaylogGamesGenericNotificationAction) (obj)).androidAction))
            {
                return false;
            }
            if (iosAction != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((PlaylogGamesGenericNotificationAction) (obj)).iosAction == null) goto _L1; else goto _L3
_L3:
            return false;
            if (iosAction.equals(((PlaylogGamesGenericNotificationAction) (obj)).iosAction)) goto _L1; else goto _L4
_L4:
            return false;
        }

        public final int hashCode()
        {
            int j = 0;
            int k = getClass().getName().hashCode();
            int l = actionType;
            int i;
            if (androidAction == null)
            {
                i = 0;
            } else
            {
                i = androidAction.hashCode();
            }
            if (iosAction != null)
            {
                j = iosAction.hashCode();
            }
            return (((k + 527) * 31 + l) * 31 + i) * 31 + j;
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
        //                       18: 103
        //                       26: 132;
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
                actionType = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (androidAction == null)
            {
                androidAction = new PlaylogGamesAndroidNotificationAction();
            }
            codedinputbytebuffernano.readMessage(androidAction);
            continue; /* Loop/switch isn't completed */
_L5:
            if (iosAction == null)
            {
                iosAction = new PlaylogGamesIosNotificationAction();
            }
            codedinputbytebuffernano.readMessage(iosAction);
            if (true) goto _L6; else goto _L7
_L7:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (actionType != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, actionType);
            }
            if (androidAction != null)
            {
                codedoutputbytebuffernano.writeMessage(2, androidAction);
            }
            if (iosAction != null)
            {
                codedoutputbytebuffernano.writeMessage(3, iosAction);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesGenericNotificationAction()
        {
            actionType = 0;
            androidAction = null;
            iosAction = null;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesImpressionEvent extends MessageNano
    {

        public PlaylogGamesUiElementPath content[];
        public long id;
        public PlaylogGamesUiElement tree;

        public final PlaylogGamesImpressionEvent clear()
        {
            tree = null;
            id = 0L;
            content = PlaylogGamesUiElementPath.emptyArray();
            cachedSize = -1;
            return this;
        }

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (tree != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(1, tree);
            }
            i = j;
            if (id != 0L)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(2, id);
            }
            int l = i;
            if (content != null)
            {
                l = i;
                if (content.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= content.length)
                        {
                            break;
                        }
                        PlaylogGamesUiElementPath playloggamesuielementpath = content[k];
                        l = i;
                        if (playloggamesuielementpath != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(3, playloggamesuielementpath);
                        }
                        k++;
                        i = l;
                    } while (true);
                }
            }
            return l;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesImpressionEvent))
                {
                    return false;
                }
                obj = (PlaylogGamesImpressionEvent)obj;
                if (tree == null)
                {
                    if (((PlaylogGamesImpressionEvent) (obj)).tree != null)
                    {
                        return false;
                    }
                } else
                if (!tree.equals(((PlaylogGamesImpressionEvent) (obj)).tree))
                {
                    return false;
                }
                if (id != ((PlaylogGamesImpressionEvent) (obj)).id)
                {
                    return false;
                }
                if (!InternalNano.equals(content, ((PlaylogGamesImpressionEvent) (obj)).content))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int j = getClass().getName().hashCode();
            int i;
            if (tree == null)
            {
                i = 0;
            } else
            {
                i = tree.hashCode();
            }
            return (((j + 527) * 31 + i) * 31 + (int)(id ^ id >>> 32)) * 31 + InternalNano.hashCode(content);
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
                    if (tree == null)
                    {
                        tree = new PlaylogGamesUiElement();
                    }
                    codedinputbytebuffernano.readMessage(tree);
                    break;

                case 16: // '\020'
                    id = codedinputbytebuffernano.readRawVarint64();
                    break;

                case 26: // '\032'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    PlaylogGamesUiElementPath aplayloggamesuielementpath[];
                    int j;
                    if (content == null)
                    {
                        j = 0;
                    } else
                    {
                        j = content.length;
                    }
                    aplayloggamesuielementpath = new PlaylogGamesUiElementPath[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(content, 0, aplayloggamesuielementpath, 0, j);
                        k = j;
                    }
                    for (; k < aplayloggamesuielementpath.length - 1; k++)
                    {
                        aplayloggamesuielementpath[k] = new PlaylogGamesUiElementPath();
                        codedinputbytebuffernano.readMessage(aplayloggamesuielementpath[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    aplayloggamesuielementpath[k] = new PlaylogGamesUiElementPath();
                    codedinputbytebuffernano.readMessage(aplayloggamesuielementpath[k]);
                    content = aplayloggamesuielementpath;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (tree != null)
            {
                codedoutputbytebuffernano.writeMessage(1, tree);
            }
            if (id != 0L)
            {
                codedoutputbytebuffernano.writeInt64(2, id);
            }
            if (content != null && content.length > 0)
            {
                for (int i = 0; i < content.length; i++)
                {
                    PlaylogGamesUiElementPath playloggamesuielementpath = content[i];
                    if (playloggamesuielementpath != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, playloggamesuielementpath);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesImpressionEvent()
        {
            clear();
        }
    }

    public static final class PlaylogGamesInGameAction extends MessageNano
    {

        public PlaylogGamesLeaderboardAction leaderboard;
        public int type;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (type != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, type);
            }
            j = i;
            if (leaderboard != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, leaderboard);
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (!(obj instanceof PlaylogGamesInGameAction))
            {
                return false;
            }
            obj = (PlaylogGamesInGameAction)obj;
            if (type != ((PlaylogGamesInGameAction) (obj)).type)
            {
                return false;
            }
            if (leaderboard != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((PlaylogGamesInGameAction) (obj)).leaderboard == null) goto _L1; else goto _L3
_L3:
            return false;
            if (leaderboard.equals(((PlaylogGamesInGameAction) (obj)).leaderboard)) goto _L1; else goto _L4
_L4:
            return false;
        }

        public final int hashCode()
        {
            int j = getClass().getName().hashCode();
            int k = type;
            int i;
            if (leaderboard == null)
            {
                i = 0;
            } else
            {
                i = leaderboard.hashCode();
            }
            return i + ((j + 527) * 31 + k) * 31;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 48
        //                       8: 50
        //                       18: 263;
               goto _L1 _L2 _L3 _L4
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
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
                type = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (leaderboard == null)
            {
                leaderboard = new PlaylogGamesLeaderboardAction();
            }
            codedinputbytebuffernano.readMessage(leaderboard);
            if (true) goto _L5; else goto _L6
_L6:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (type != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, type);
            }
            if (leaderboard != null)
            {
                codedoutputbytebuffernano.writeMessage(2, leaderboard);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesInGameAction()
        {
            type = 0;
            leaderboard = null;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesIosDeviceAction extends MessageNano
    {

        public int actionType;
        public PlaylogGamesIosDeviceRegister registerAction;
        public PlaylogGamesIosDeviceUnregister unregisterAction;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (actionType != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, actionType);
            }
            j = i;
            if (registerAction != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, registerAction);
            }
            i = j;
            if (unregisterAction != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, unregisterAction);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (!(obj instanceof PlaylogGamesIosDeviceAction))
            {
                return false;
            }
            obj = (PlaylogGamesIosDeviceAction)obj;
            if (actionType != ((PlaylogGamesIosDeviceAction) (obj)).actionType)
            {
                return false;
            }
            if (registerAction == null)
            {
                if (((PlaylogGamesIosDeviceAction) (obj)).registerAction != null)
                {
                    return false;
                }
            } else
            if (!registerAction.equals(((PlaylogGamesIosDeviceAction) (obj)).registerAction))
            {
                return false;
            }
            if (unregisterAction != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((PlaylogGamesIosDeviceAction) (obj)).unregisterAction == null) goto _L1; else goto _L3
_L3:
            return false;
            if (unregisterAction.equals(((PlaylogGamesIosDeviceAction) (obj)).unregisterAction)) goto _L1; else goto _L4
_L4:
            return false;
        }

        public final int hashCode()
        {
            int j = 0;
            int k = getClass().getName().hashCode();
            int l = actionType;
            int i;
            if (registerAction == null)
            {
                i = 0;
            } else
            {
                i = registerAction.hashCode();
            }
            if (unregisterAction != null)
            {
                j = unregisterAction.hashCode();
            }
            return (((k + 527) * 31 + l) * 31 + i) * 31 + j;
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
        //                       18: 103
        //                       26: 132;
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
                actionType = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            if (registerAction == null)
            {
                registerAction = new PlaylogGamesIosDeviceRegister();
            }
            codedinputbytebuffernano.readMessage(registerAction);
            continue; /* Loop/switch isn't completed */
_L5:
            if (unregisterAction == null)
            {
                unregisterAction = new PlaylogGamesIosDeviceUnregister();
            }
            codedinputbytebuffernano.readMessage(unregisterAction);
            if (true) goto _L6; else goto _L7
_L7:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (actionType != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, actionType);
            }
            if (registerAction != null)
            {
                codedoutputbytebuffernano.writeMessage(2, registerAction);
            }
            if (unregisterAction != null)
            {
                codedoutputbytebuffernano.writeMessage(3, unregisterAction);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesIosDeviceAction()
        {
            actionType = 0;
            registerAction = null;
            unregisterAction = null;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesIosDeviceRegister extends MessageNano
    {

        public byte apnsDeviceToken[];
        public String language;
        public String sdkVersion;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (!Arrays.equals(apnsDeviceToken, WireFormatNano.EMPTY_BYTES))
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(1, apnsDeviceToken);
            }
            j = i;
            if (!sdkVersion.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, sdkVersion);
            }
            i = j;
            if (!language.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, language);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (!(obj instanceof PlaylogGamesIosDeviceRegister))
            {
                return false;
            }
            obj = (PlaylogGamesIosDeviceRegister)obj;
            if (!Arrays.equals(apnsDeviceToken, ((PlaylogGamesIosDeviceRegister) (obj)).apnsDeviceToken))
            {
                return false;
            }
            if (sdkVersion == null)
            {
                if (((PlaylogGamesIosDeviceRegister) (obj)).sdkVersion != null)
                {
                    return false;
                }
            } else
            if (!sdkVersion.equals(((PlaylogGamesIosDeviceRegister) (obj)).sdkVersion))
            {
                return false;
            }
            if (language != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((PlaylogGamesIosDeviceRegister) (obj)).language == null) goto _L1; else goto _L3
_L3:
            return false;
            if (language.equals(((PlaylogGamesIosDeviceRegister) (obj)).language)) goto _L1; else goto _L4
_L4:
            return false;
        }

        public final int hashCode()
        {
            int j = 0;
            int k = getClass().getName().hashCode();
            int l = Arrays.hashCode(apnsDeviceToken);
            int i;
            if (sdkVersion == null)
            {
                i = 0;
            } else
            {
                i = sdkVersion.hashCode();
            }
            if (language != null)
            {
                j = language.hashCode();
            }
            return (((k + 527) * 31 + l) * 31 + i) * 31 + j;
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
                    apnsDeviceToken = codedinputbytebuffernano.readBytes();
                    break;

                case 18: // '\022'
                    sdkVersion = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    language = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (!Arrays.equals(apnsDeviceToken, WireFormatNano.EMPTY_BYTES))
            {
                codedoutputbytebuffernano.writeBytes(1, apnsDeviceToken);
            }
            if (!sdkVersion.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, sdkVersion);
            }
            if (!language.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, language);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesIosDeviceRegister()
        {
            apnsDeviceToken = WireFormatNano.EMPTY_BYTES;
            sdkVersion = "";
            language = "";
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesIosDeviceUnregister extends MessageNano
    {

        public byte apnsDeviceToken[];

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (!Arrays.equals(apnsDeviceToken, WireFormatNano.EMPTY_BYTES))
            {
                i = j + CodedOutputByteBufferNano.computeBytesSize(1, apnsDeviceToken);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesIosDeviceUnregister))
                {
                    return false;
                }
                obj = (PlaylogGamesIosDeviceUnregister)obj;
                if (!Arrays.equals(apnsDeviceToken, ((PlaylogGamesIosDeviceUnregister) (obj)).apnsDeviceToken))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return (getClass().getName().hashCode() + 527) * 31 + Arrays.hashCode(apnsDeviceToken);
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
                    apnsDeviceToken = codedinputbytebuffernano.readBytes();
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (!Arrays.equals(apnsDeviceToken, WireFormatNano.EMPTY_BYTES))
            {
                codedoutputbytebuffernano.writeBytes(1, apnsDeviceToken);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesIosDeviceUnregister()
        {
            apnsDeviceToken = WireFormatNano.EMPTY_BYTES;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesIosNotificationAction extends MessageNano
    {

        public int actionType;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (actionType != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, actionType);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesIosNotificationAction))
                {
                    return false;
                }
                obj = (PlaylogGamesIosNotificationAction)obj;
                if (actionType != ((PlaylogGamesIosNotificationAction) (obj)).actionType)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return (getClass().getName().hashCode() + 527) * 31 + actionType;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L4:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 2: default 32
        //                       0: 40
        //                       8: 42;
               goto _L1 _L2 _L3
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L4; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
                actionType = j;
                break;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (actionType != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, actionType);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesIosNotificationAction()
        {
            actionType = 0;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesLatencyAction extends MessageNano
    {

        public LatencyEvent events[];
        public int latencyId;
        public long startTimestampMs;

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (latencyId != 0)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(1, latencyId);
            }
            i = j;
            if (startTimestampMs != 0L)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(2, startTimestampMs);
            }
            int l = i;
            if (events != null)
            {
                l = i;
                if (events.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= events.length)
                        {
                            break;
                        }
                        LatencyEvent latencyevent = events[k];
                        l = i;
                        if (latencyevent != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(3, latencyevent);
                        }
                        k++;
                        i = l;
                    } while (true);
                }
            }
            return l;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesLatencyAction))
                {
                    return false;
                }
                obj = (PlaylogGamesLatencyAction)obj;
                if (latencyId != ((PlaylogGamesLatencyAction) (obj)).latencyId)
                {
                    return false;
                }
                if (startTimestampMs != ((PlaylogGamesLatencyAction) (obj)).startTimestampMs)
                {
                    return false;
                }
                if (!InternalNano.equals(events, ((PlaylogGamesLatencyAction) (obj)).events))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return (((getClass().getName().hashCode() + 527) * 31 + latencyId) * 31 + (int)(startTimestampMs ^ startTimestampMs >>> 32)) * 31 + InternalNano.hashCode(events);
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
        //                       16: 279
        //                       26: 290;
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
            case 200: 
            case 201: 
            case 400: 
                latencyId = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            startTimestampMs = codedinputbytebuffernano.readRawVarint64();
            continue; /* Loop/switch isn't completed */
_L5:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
            LatencyEvent alatencyevent[];
            int k;
            if (events == null)
            {
                k = 0;
            } else
            {
                k = events.length;
            }
            alatencyevent = new LatencyEvent[l + k];
            l = k;
            if (k != 0)
            {
                System.arraycopy(events, 0, alatencyevent, 0, k);
                l = k;
            }
            for (; l < alatencyevent.length - 1; l++)
            {
                alatencyevent[l] = new LatencyEvent();
                codedinputbytebuffernano.readMessage(alatencyevent[l]);
                codedinputbytebuffernano.readTag();
            }

            alatencyevent[l] = new LatencyEvent();
            codedinputbytebuffernano.readMessage(alatencyevent[l]);
            events = alatencyevent;
            if (true) goto _L6; else goto _L7
_L7:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (latencyId != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, latencyId);
            }
            if (startTimestampMs != 0L)
            {
                codedoutputbytebuffernano.writeInt64(2, startTimestampMs);
            }
            if (events != null && events.length > 0)
            {
                for (int i = 0; i < events.length; i++)
                {
                    LatencyEvent latencyevent = events[i];
                    if (latencyevent != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, latencyevent);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesLatencyAction()
        {
            latencyId = 0;
            startTimestampMs = 0L;
            events = LatencyEvent.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesLatencyAction.LatencyEvent extends MessageNano
    {

        private static volatile PlaylogGamesLatencyAction.LatencyEvent _emptyArray[];
        public long deltaMs;
        public int eventType;

        public static PlaylogGamesLatencyAction.LatencyEvent[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new PlaylogGamesLatencyAction.LatencyEvent[0];
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
            if (eventType != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, eventType);
            }
            j = i;
            if (deltaMs != 0L)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, deltaMs);
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesLatencyAction.LatencyEvent))
                {
                    return false;
                }
                obj = (PlaylogGamesLatencyAction.LatencyEvent)obj;
                if (eventType != ((PlaylogGamesLatencyAction.LatencyEvent) (obj)).eventType)
                {
                    return false;
                }
                if (deltaMs != ((PlaylogGamesLatencyAction.LatencyEvent) (obj)).deltaMs)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return ((getClass().getName().hashCode() + 527) * 31 + eventType) * 31 + (int)(deltaMs ^ deltaMs >>> 32);
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 48
        //                       8: 50
        //                       16: 119;
               goto _L1 _L2 _L3 _L4
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
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
                eventType = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            deltaMs = codedinputbytebuffernano.readRawVarint64();
            if (true) goto _L5; else goto _L6
_L6:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (eventType != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, eventType);
            }
            if (deltaMs != 0L)
            {
                codedoutputbytebuffernano.writeInt64(2, deltaMs);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesLatencyAction.LatencyEvent()
        {
            eventType = 0;
            deltaMs = 0L;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesLeaderboardAction extends MessageNano
    {

        public String leaderboardId;
        public int leaderboardType;
        public int scoreWindowType;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (!leaderboardId.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, leaderboardId);
            }
            j = i;
            if (leaderboardType != 0)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, leaderboardType);
            }
            i = j;
            if (scoreWindowType != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, scoreWindowType);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesLeaderboardAction))
                {
                    return false;
                }
                obj = (PlaylogGamesLeaderboardAction)obj;
                if (leaderboardId == null)
                {
                    if (((PlaylogGamesLeaderboardAction) (obj)).leaderboardId != null)
                    {
                        return false;
                    }
                } else
                if (!leaderboardId.equals(((PlaylogGamesLeaderboardAction) (obj)).leaderboardId))
                {
                    return false;
                }
                if (leaderboardType != ((PlaylogGamesLeaderboardAction) (obj)).leaderboardType)
                {
                    return false;
                }
                if (scoreWindowType != ((PlaylogGamesLeaderboardAction) (obj)).scoreWindowType)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int j = getClass().getName().hashCode();
            int i;
            if (leaderboardId == null)
            {
                i = 0;
            } else
            {
                i = leaderboardId.hashCode();
            }
            return (((j + 527) * 31 + i) * 31 + leaderboardType) * 31 + scoreWindowType;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L6:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 56
        //                       10: 58
        //                       16: 69
        //                       24: 111;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            leaderboardId = codedinputbytebuffernano.readString();
              goto _L6
_L4:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                leaderboardType = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            int k = codedinputbytebuffernano.readRawVarint32();
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                scoreWindowType = k;
                break;
            }
            if (true) goto _L6; else goto _L7
_L7:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (!leaderboardId.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, leaderboardId);
            }
            if (leaderboardType != 0)
            {
                codedoutputbytebuffernano.writeInt32(2, leaderboardType);
            }
            if (scoreWindowType != 0)
            {
                codedoutputbytebuffernano.writeInt32(3, scoreWindowType);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesLeaderboardAction()
        {
            leaderboardId = "";
            leaderboardType = 0;
            scoreWindowType = 0;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesLogEvent extends MessageNano
    {

        public PlaylogGamesBackgroundActionEvent backgroundAction;
        public PlaylogGamesClickEvent click;
        public PlaylogGamesDeepLinkEvent deepLink;
        public PlaylogGamesImpressionEvent impression;
        public PlaylogGamesSearchEvent search;
        public int uiSource;

        public final PlaylogGamesLogEvent clear()
        {
            impression = null;
            click = null;
            backgroundAction = null;
            search = null;
            deepLink = null;
            uiSource = 1;
            cachedSize = -1;
            return this;
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (impression != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, impression);
            }
            j = i;
            if (click != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, click);
            }
            i = j;
            if (backgroundAction != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(3, backgroundAction);
            }
            j = i;
            if (search != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, search);
            }
            i = j;
            if (deepLink != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(5, deepLink);
            }
            j = i;
            if (uiSource != 1)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(6, uiSource);
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesLogEvent))
                {
                    return false;
                }
                obj = (PlaylogGamesLogEvent)obj;
                if (impression == null)
                {
                    if (((PlaylogGamesLogEvent) (obj)).impression != null)
                    {
                        return false;
                    }
                } else
                if (!impression.equals(((PlaylogGamesLogEvent) (obj)).impression))
                {
                    return false;
                }
                if (click == null)
                {
                    if (((PlaylogGamesLogEvent) (obj)).click != null)
                    {
                        return false;
                    }
                } else
                if (!click.equals(((PlaylogGamesLogEvent) (obj)).click))
                {
                    return false;
                }
                if (backgroundAction == null)
                {
                    if (((PlaylogGamesLogEvent) (obj)).backgroundAction != null)
                    {
                        return false;
                    }
                } else
                if (!backgroundAction.equals(((PlaylogGamesLogEvent) (obj)).backgroundAction))
                {
                    return false;
                }
                if (search == null)
                {
                    if (((PlaylogGamesLogEvent) (obj)).search != null)
                    {
                        return false;
                    }
                } else
                if (!search.equals(((PlaylogGamesLogEvent) (obj)).search))
                {
                    return false;
                }
                if (deepLink == null)
                {
                    if (((PlaylogGamesLogEvent) (obj)).deepLink != null)
                    {
                        return false;
                    }
                } else
                if (!deepLink.equals(((PlaylogGamesLogEvent) (obj)).deepLink))
                {
                    return false;
                }
                if (uiSource != ((PlaylogGamesLogEvent) (obj)).uiSource)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int i1 = 0;
            int j1 = getClass().getName().hashCode();
            int i;
            int j;
            int k;
            int l;
            if (impression == null)
            {
                i = 0;
            } else
            {
                i = impression.hashCode();
            }
            if (click == null)
            {
                j = 0;
            } else
            {
                j = click.hashCode();
            }
            if (backgroundAction == null)
            {
                k = 0;
            } else
            {
                k = backgroundAction.hashCode();
            }
            if (search == null)
            {
                l = 0;
            } else
            {
                l = search.hashCode();
            }
            if (deepLink != null)
            {
                i1 = deepLink.hashCode();
            }
            return ((((((j1 + 527) * 31 + i) * 31 + j) * 31 + k) * 31 + l) * 31 + i1) * 31 + uiSource;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L9:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 7: default 72
        //                       0: 80
        //                       10: 82
        //                       18: 111
        //                       26: 140
        //                       34: 169
        //                       42: 198
        //                       48: 227;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
_L2:
            return this;
_L3:
            if (impression == null)
            {
                impression = new PlaylogGamesImpressionEvent();
            }
            codedinputbytebuffernano.readMessage(impression);
              goto _L9
_L4:
            if (click == null)
            {
                click = new PlaylogGamesClickEvent();
            }
            codedinputbytebuffernano.readMessage(click);
              goto _L9
_L5:
            if (backgroundAction == null)
            {
                backgroundAction = new PlaylogGamesBackgroundActionEvent();
            }
            codedinputbytebuffernano.readMessage(backgroundAction);
              goto _L9
_L6:
            if (search == null)
            {
                search = new PlaylogGamesSearchEvent();
            }
            codedinputbytebuffernano.readMessage(search);
              goto _L9
_L7:
            if (deepLink == null)
            {
                deepLink = new PlaylogGamesDeepLinkEvent();
            }
            codedinputbytebuffernano.readMessage(deepLink);
              goto _L9
_L8:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                uiSource = j;
                break;
            }
            if (true) goto _L9; else goto _L10
_L10:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (impression != null)
            {
                codedoutputbytebuffernano.writeMessage(1, impression);
            }
            if (click != null)
            {
                codedoutputbytebuffernano.writeMessage(2, click);
            }
            if (backgroundAction != null)
            {
                codedoutputbytebuffernano.writeMessage(3, backgroundAction);
            }
            if (search != null)
            {
                codedoutputbytebuffernano.writeMessage(4, search);
            }
            if (deepLink != null)
            {
                codedoutputbytebuffernano.writeMessage(5, deepLink);
            }
            if (uiSource != 1)
            {
                codedoutputbytebuffernano.writeInt32(6, uiSource);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesLogEvent()
        {
            clear();
        }
    }

    public static final class PlaylogGamesModifyCirclesAction extends MessageNano
    {

        public boolean added;
        public int source;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (source != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, source);
            }
            j = i;
            if (added)
            {
                j = i + (CodedOutputByteBufferNano.computeTagSize(2) + 1);
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesModifyCirclesAction))
                {
                    return false;
                }
                obj = (PlaylogGamesModifyCirclesAction)obj;
                if (source != ((PlaylogGamesModifyCirclesAction) (obj)).source)
                {
                    return false;
                }
                if (added != ((PlaylogGamesModifyCirclesAction) (obj)).added)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int i = getClass().getName().hashCode();
            int j = source;
            char c;
            if (added)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            return c + ((i + 527) * 31 + j) * 31;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 48
        //                       8: 50
        //                       16: 111;
               goto _L1 _L2 _L3 _L4
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
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
                source = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            added = codedinputbytebuffernano.readBool();
            if (true) goto _L5; else goto _L6
_L6:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (source != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, source);
            }
            if (added)
            {
                codedoutputbytebuffernano.writeBool(2, added);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesModifyCirclesAction()
        {
            source = 0;
            added = false;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesNearbyPlayerAction extends MessageNano
    {

        public int numNearbyPlayers;
        public int type;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (type != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, type);
            }
            j = i;
            if (numNearbyPlayers != 0)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, numNearbyPlayers);
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesNearbyPlayerAction))
                {
                    return false;
                }
                obj = (PlaylogGamesNearbyPlayerAction)obj;
                if (type != ((PlaylogGamesNearbyPlayerAction) (obj)).type)
                {
                    return false;
                }
                if (numNearbyPlayers != ((PlaylogGamesNearbyPlayerAction) (obj)).numNearbyPlayers)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return ((getClass().getName().hashCode() + 527) * 31 + type) * 31 + numNearbyPlayers;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 48
        //                       8: 50
        //                       16: 91;
               goto _L1 _L2 _L3 _L4
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
                type = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            numNearbyPlayers = codedinputbytebuffernano.readRawVarint32();
            if (true) goto _L5; else goto _L6
_L6:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (type != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, type);
            }
            if (numNearbyPlayers != 0)
            {
                codedoutputbytebuffernano.writeInt32(2, numNearbyPlayers);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesNearbyPlayerAction()
        {
            type = 0;
            numNearbyPlayers = 0;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesNotificationActionDeprecated extends MessageNano
    {

        public int actionType;
        public int displayedCount;
        public String notificationId[];

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (actionType != 1)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, actionType);
            }
            j = i;
            if (notificationId != null)
            {
                j = i;
                if (notificationId.length > 0)
                {
                    int i1 = 0;
                    int k = 0;
                    for (j = 0; j < notificationId.length;)
                    {
                        String s = notificationId[j];
                        int j1 = i1;
                        int l = k;
                        if (s != null)
                        {
                            j1 = i1 + 1;
                            l = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        j++;
                        i1 = j1;
                        k = l;
                    }

                    j = i + k + i1 * 1;
                }
            }
            i = j;
            if (displayedCount != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, displayedCount);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesNotificationActionDeprecated))
                {
                    return false;
                }
                obj = (PlaylogGamesNotificationActionDeprecated)obj;
                if (actionType != ((PlaylogGamesNotificationActionDeprecated) (obj)).actionType)
                {
                    return false;
                }
                if (!InternalNano.equals(notificationId, ((PlaylogGamesNotificationActionDeprecated) (obj)).notificationId))
                {
                    return false;
                }
                if (displayedCount != ((PlaylogGamesNotificationActionDeprecated) (obj)).displayedCount)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return (((getClass().getName().hashCode() + 527) * 31 + actionType) * 31 + InternalNano.hashCode(notificationId)) * 31 + displayedCount;
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
        //                       18: 115
        //                       24: 217;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
                actionType = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
            String as[];
            int k;
            if (notificationId == null)
            {
                k = 0;
            } else
            {
                k = notificationId.length;
            }
            as = new String[l + k];
            l = k;
            if (k != 0)
            {
                System.arraycopy(notificationId, 0, as, 0, k);
                l = k;
            }
            for (; l < as.length - 1; l++)
            {
                as[l] = codedinputbytebuffernano.readString();
                codedinputbytebuffernano.readTag();
            }

            as[l] = codedinputbytebuffernano.readString();
            notificationId = as;
            continue; /* Loop/switch isn't completed */
_L5:
            displayedCount = codedinputbytebuffernano.readRawVarint32();
            if (true) goto _L6; else goto _L7
_L7:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (actionType != 1)
            {
                codedoutputbytebuffernano.writeInt32(1, actionType);
            }
            if (notificationId != null && notificationId.length > 0)
            {
                for (int i = 0; i < notificationId.length; i++)
                {
                    String s = notificationId[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(2, s);
                    }
                }

            }
            if (displayedCount != 0)
            {
                codedoutputbytebuffernano.writeInt32(3, displayedCount);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesNotificationActionDeprecated()
        {
            actionType = 1;
            notificationId = WireFormatNano.EMPTY_STRING_ARRAY;
            displayedCount = 0;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesOneTouchCirclesAction extends MessageNano
    {

        public int circlesAction;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (circlesAction != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, circlesAction);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesOneTouchCirclesAction))
                {
                    return false;
                }
                obj = (PlaylogGamesOneTouchCirclesAction)obj;
                if (circlesAction != ((PlaylogGamesOneTouchCirclesAction) (obj)).circlesAction)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return (getClass().getName().hashCode() + 527) * 31 + circlesAction;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L4:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 2: default 32
        //                       0: 40
        //                       8: 42;
               goto _L1 _L2 _L3
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L4; else goto _L2
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
                circlesAction = j;
                break;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (circlesAction != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, circlesAction);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesOneTouchCirclesAction()
        {
            circlesAction = 0;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesRequestInfo extends MessageNano
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
                if (!(obj instanceof PlaylogGamesRequestInfo))
                {
                    return false;
                }
                obj = (PlaylogGamesRequestInfo)obj;
                if (isStartAction != ((PlaylogGamesRequestInfo) (obj)).isStartAction)
                {
                    return false;
                }
                if (applicationId == null)
                {
                    if (((PlaylogGamesRequestInfo) (obj)).applicationId != null)
                    {
                        return false;
                    }
                } else
                if (!applicationId.equals(((PlaylogGamesRequestInfo) (obj)).applicationId))
                {
                    return false;
                }
                if (startTimestampMillis != ((PlaylogGamesRequestInfo) (obj)).startTimestampMillis)
                {
                    return false;
                }
                if (instanceId == null)
                {
                    if (((PlaylogGamesRequestInfo) (obj)).instanceId != null)
                    {
                        return false;
                    }
                } else
                if (!instanceId.equals(((PlaylogGamesRequestInfo) (obj)).instanceId))
                {
                    return false;
                }
                if (clientVersion == null)
                {
                    if (((PlaylogGamesRequestInfo) (obj)).clientVersion != null)
                    {
                        return false;
                    }
                } else
                if (!clientVersion.equals(((PlaylogGamesRequestInfo) (obj)).clientVersion))
                {
                    return false;
                }
                if (appVersionCode != ((PlaylogGamesRequestInfo) (obj)).appVersionCode)
                {
                    return false;
                }
                if (modulesVersion != ((PlaylogGamesRequestInfo) (obj)).modulesVersion)
                {
                    return false;
                }
                if (!InternalNano.equals(targetId, ((PlaylogGamesRequestInfo) (obj)).targetId))
                {
                    return false;
                }
                if (isAbortedAction != ((PlaylogGamesRequestInfo) (obj)).isAbortedAction)
                {
                    return false;
                }
                if (playGamesVersion != ((PlaylogGamesRequestInfo) (obj)).playGamesVersion)
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

        public PlaylogGamesRequestInfo()
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

    public static final class PlaylogGamesRtmpSession extends MessageNano
    {

        public String activeCellNetworkOperator;
        public int activeCellNetworkType;
        public long connectXmppEndTimeMs;
        public boolean connectXmppResult;
        public int connectXmppRetries;
        public long connectXmppStartTimeMs;
        public PlaylogGamesRtmpDcmSession dcmSession;
        public long enterCallEndTimeMs;
        public boolean enterCallResult;
        public long enterCallStartTimeMs;
        public int entryState;
        public int inRoomLeaveType;
        public boolean libjingleLoadRetryRequired;
        public boolean mismatchedConnector;
        public int networkSubtype;
        public int networkType;
        public int numConnectedPeers;
        public int numPeers;
        public long peerConnectTimeMs;
        public boolean requestedSockets;
        public String roomId;
        public long roomLeaveDoneMs;
        public boolean roomLeaveResult;
        public long roomLeaveTimeMs;
        public int roomUpdateCount;
        public int sessionInitiator;
        public long sessionStartTimeMs;
        public String simCellNetworkOperator;
        public boolean unableToReportP2PStatus;
        public boolean usedLegacySockets;
        public boolean usedNativeSockets;
        public long waitForDiagEndLeaveStartTimeMs;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (!roomId.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, roomId);
            }
            j = i;
            if (entryState != 0)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, entryState);
            }
            i = j;
            if (sessionStartTimeMs != 0L)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(3, sessionStartTimeMs);
            }
            j = i;
            if (sessionInitiator != 0)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, sessionInitiator);
            }
            i = j;
            if (!simCellNetworkOperator.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, simCellNetworkOperator);
            }
            j = i;
            if (!activeCellNetworkOperator.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(6, activeCellNetworkOperator);
            }
            i = j;
            if (activeCellNetworkType != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(7, activeCellNetworkType);
            }
            j = i;
            if (networkType != 0)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(8, networkType);
            }
            i = j;
            if (networkSubtype != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(9, networkSubtype);
            }
            j = i;
            if (connectXmppStartTimeMs != 0L)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(10, connectXmppStartTimeMs);
            }
            i = j;
            if (connectXmppEndTimeMs != 0L)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(11, connectXmppEndTimeMs);
            }
            j = i;
            if (connectXmppRetries != 0)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(12, connectXmppRetries);
            }
            i = j;
            if (connectXmppResult)
            {
                i = j + (CodedOutputByteBufferNano.computeTagSize(13) + 1);
            }
            j = i;
            if (enterCallStartTimeMs != 0L)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(14, enterCallStartTimeMs);
            }
            i = j;
            if (enterCallEndTimeMs != 0L)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(15, enterCallEndTimeMs);
            }
            j = i;
            if (enterCallResult)
            {
                j = i + (CodedOutputByteBufferNano.computeTagSize(16) + 1);
            }
            i = j;
            if (numPeers != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(17, numPeers);
            }
            j = i;
            if (numConnectedPeers != 0)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(18, numConnectedPeers);
            }
            i = j;
            if (peerConnectTimeMs != 0L)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(19, peerConnectTimeMs);
            }
            j = i;
            if (roomLeaveTimeMs != 0L)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(20, roomLeaveTimeMs);
            }
            i = j;
            if (inRoomLeaveType != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(21, inRoomLeaveType);
            }
            j = i;
            if (waitForDiagEndLeaveStartTimeMs != 0L)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(22, waitForDiagEndLeaveStartTimeMs);
            }
            i = j;
            if (roomLeaveDoneMs != 0L)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(23, roomLeaveDoneMs);
            }
            j = i;
            if (roomLeaveResult)
            {
                j = i + (CodedOutputByteBufferNano.computeTagSize(24) + 1);
            }
            i = j;
            if (mismatchedConnector)
            {
                i = j + (CodedOutputByteBufferNano.computeTagSize(25) + 1);
            }
            j = i;
            if (libjingleLoadRetryRequired)
            {
                j = i + (CodedOutputByteBufferNano.computeTagSize(26) + 1);
            }
            i = j;
            if (requestedSockets)
            {
                i = j + (CodedOutputByteBufferNano.computeTagSize(27) + 1);
            }
            j = i;
            if (usedNativeSockets)
            {
                j = i + (CodedOutputByteBufferNano.computeTagSize(28) + 1);
            }
            i = j;
            if (usedLegacySockets)
            {
                i = j + (CodedOutputByteBufferNano.computeTagSize(29) + 1);
            }
            j = i;
            if (unableToReportP2PStatus)
            {
                j = i + (CodedOutputByteBufferNano.computeTagSize(30) + 1);
            }
            i = j;
            if (roomUpdateCount != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(31, roomUpdateCount);
            }
            j = i;
            if (dcmSession != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(32, dcmSession);
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (!(obj instanceof PlaylogGamesRtmpSession))
            {
                return false;
            }
            obj = (PlaylogGamesRtmpSession)obj;
            if (roomId == null)
            {
                if (((PlaylogGamesRtmpSession) (obj)).roomId != null)
                {
                    return false;
                }
            } else
            if (!roomId.equals(((PlaylogGamesRtmpSession) (obj)).roomId))
            {
                return false;
            }
            if (entryState != ((PlaylogGamesRtmpSession) (obj)).entryState)
            {
                return false;
            }
            if (sessionStartTimeMs != ((PlaylogGamesRtmpSession) (obj)).sessionStartTimeMs)
            {
                return false;
            }
            if (sessionInitiator != ((PlaylogGamesRtmpSession) (obj)).sessionInitiator)
            {
                return false;
            }
            if (simCellNetworkOperator == null)
            {
                if (((PlaylogGamesRtmpSession) (obj)).simCellNetworkOperator != null)
                {
                    return false;
                }
            } else
            if (!simCellNetworkOperator.equals(((PlaylogGamesRtmpSession) (obj)).simCellNetworkOperator))
            {
                return false;
            }
            if (activeCellNetworkOperator == null)
            {
                if (((PlaylogGamesRtmpSession) (obj)).activeCellNetworkOperator != null)
                {
                    return false;
                }
            } else
            if (!activeCellNetworkOperator.equals(((PlaylogGamesRtmpSession) (obj)).activeCellNetworkOperator))
            {
                return false;
            }
            if (activeCellNetworkType != ((PlaylogGamesRtmpSession) (obj)).activeCellNetworkType)
            {
                return false;
            }
            if (networkType != ((PlaylogGamesRtmpSession) (obj)).networkType)
            {
                return false;
            }
            if (networkSubtype != ((PlaylogGamesRtmpSession) (obj)).networkSubtype)
            {
                return false;
            }
            if (connectXmppStartTimeMs != ((PlaylogGamesRtmpSession) (obj)).connectXmppStartTimeMs)
            {
                return false;
            }
            if (connectXmppEndTimeMs != ((PlaylogGamesRtmpSession) (obj)).connectXmppEndTimeMs)
            {
                return false;
            }
            if (connectXmppRetries != ((PlaylogGamesRtmpSession) (obj)).connectXmppRetries)
            {
                return false;
            }
            if (connectXmppResult != ((PlaylogGamesRtmpSession) (obj)).connectXmppResult)
            {
                return false;
            }
            if (enterCallStartTimeMs != ((PlaylogGamesRtmpSession) (obj)).enterCallStartTimeMs)
            {
                return false;
            }
            if (enterCallEndTimeMs != ((PlaylogGamesRtmpSession) (obj)).enterCallEndTimeMs)
            {
                return false;
            }
            if (enterCallResult != ((PlaylogGamesRtmpSession) (obj)).enterCallResult)
            {
                return false;
            }
            if (numPeers != ((PlaylogGamesRtmpSession) (obj)).numPeers)
            {
                return false;
            }
            if (numConnectedPeers != ((PlaylogGamesRtmpSession) (obj)).numConnectedPeers)
            {
                return false;
            }
            if (peerConnectTimeMs != ((PlaylogGamesRtmpSession) (obj)).peerConnectTimeMs)
            {
                return false;
            }
            if (roomLeaveTimeMs != ((PlaylogGamesRtmpSession) (obj)).roomLeaveTimeMs)
            {
                return false;
            }
            if (inRoomLeaveType != ((PlaylogGamesRtmpSession) (obj)).inRoomLeaveType)
            {
                return false;
            }
            if (waitForDiagEndLeaveStartTimeMs != ((PlaylogGamesRtmpSession) (obj)).waitForDiagEndLeaveStartTimeMs)
            {
                return false;
            }
            if (roomLeaveDoneMs != ((PlaylogGamesRtmpSession) (obj)).roomLeaveDoneMs)
            {
                return false;
            }
            if (roomLeaveResult != ((PlaylogGamesRtmpSession) (obj)).roomLeaveResult)
            {
                return false;
            }
            if (mismatchedConnector != ((PlaylogGamesRtmpSession) (obj)).mismatchedConnector)
            {
                return false;
            }
            if (libjingleLoadRetryRequired != ((PlaylogGamesRtmpSession) (obj)).libjingleLoadRetryRequired)
            {
                return false;
            }
            if (requestedSockets != ((PlaylogGamesRtmpSession) (obj)).requestedSockets)
            {
                return false;
            }
            if (usedNativeSockets != ((PlaylogGamesRtmpSession) (obj)).usedNativeSockets)
            {
                return false;
            }
            if (usedLegacySockets != ((PlaylogGamesRtmpSession) (obj)).usedLegacySockets)
            {
                return false;
            }
            if (unableToReportP2PStatus != ((PlaylogGamesRtmpSession) (obj)).unableToReportP2PStatus)
            {
                return false;
            }
            if (roomUpdateCount != ((PlaylogGamesRtmpSession) (obj)).roomUpdateCount)
            {
                return false;
            }
            if (dcmSession != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((PlaylogGamesRtmpSession) (obj)).dcmSession == null) goto _L1; else goto _L3
_L3:
            return false;
            if (dcmSession.equals(((PlaylogGamesRtmpSession) (obj)).dcmSession)) goto _L1; else goto _L4
_L4:
            return false;
        }

        public final int hashCode()
        {
            int l = 0;
            char c8 = '\u04CF';
            int i1 = getClass().getName().hashCode();
            int i;
            int j;
            int k;
            char c;
            char c1;
            char c2;
            char c3;
            char c4;
            char c5;
            char c6;
            char c7;
            int j1;
            int k1;
            int l1;
            int i2;
            int j2;
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
            int i5;
            int j5;
            int k5;
            int l5;
            if (roomId == null)
            {
                i = 0;
            } else
            {
                i = roomId.hashCode();
            }
            j1 = entryState;
            k1 = (int)(sessionStartTimeMs ^ sessionStartTimeMs >>> 32);
            l1 = sessionInitiator;
            if (simCellNetworkOperator == null)
            {
                j = 0;
            } else
            {
                j = simCellNetworkOperator.hashCode();
            }
            if (activeCellNetworkOperator == null)
            {
                k = 0;
            } else
            {
                k = activeCellNetworkOperator.hashCode();
            }
            i2 = activeCellNetworkType;
            j2 = networkType;
            k2 = networkSubtype;
            l2 = (int)(connectXmppStartTimeMs ^ connectXmppStartTimeMs >>> 32);
            i3 = (int)(connectXmppEndTimeMs ^ connectXmppEndTimeMs >>> 32);
            j3 = connectXmppRetries;
            if (connectXmppResult)
            {
                c = '\u04CF';
            } else
            {
                c = '\u04D5';
            }
            k3 = (int)(enterCallStartTimeMs ^ enterCallStartTimeMs >>> 32);
            l3 = (int)(enterCallEndTimeMs ^ enterCallEndTimeMs >>> 32);
            if (enterCallResult)
            {
                c1 = '\u04CF';
            } else
            {
                c1 = '\u04D5';
            }
            i4 = numPeers;
            j4 = numConnectedPeers;
            k4 = (int)(peerConnectTimeMs ^ peerConnectTimeMs >>> 32);
            l4 = (int)(roomLeaveTimeMs ^ roomLeaveTimeMs >>> 32);
            i5 = inRoomLeaveType;
            j5 = (int)(waitForDiagEndLeaveStartTimeMs ^ waitForDiagEndLeaveStartTimeMs >>> 32);
            k5 = (int)(roomLeaveDoneMs ^ roomLeaveDoneMs >>> 32);
            if (roomLeaveResult)
            {
                c2 = '\u04CF';
            } else
            {
                c2 = '\u04D5';
            }
            if (mismatchedConnector)
            {
                c3 = '\u04CF';
            } else
            {
                c3 = '\u04D5';
            }
            if (libjingleLoadRetryRequired)
            {
                c4 = '\u04CF';
            } else
            {
                c4 = '\u04D5';
            }
            if (requestedSockets)
            {
                c5 = '\u04CF';
            } else
            {
                c5 = '\u04D5';
            }
            if (usedNativeSockets)
            {
                c6 = '\u04CF';
            } else
            {
                c6 = '\u04D5';
            }
            if (usedLegacySockets)
            {
                c7 = '\u04CF';
            } else
            {
                c7 = '\u04D5';
            }
            if (!unableToReportP2PStatus)
            {
                c8 = '\u04D5';
            }
            l5 = roomUpdateCount;
            if (dcmSession != null)
            {
                l = dcmSession.hashCode();
            }
            return ((((((((((((((((((((((((((((((((i1 + 527) * 31 + i) * 31 + j1) * 31 + k1) * 31 + l1) * 31 + j) * 31 + k) * 31 + i2) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + c) * 31 + k3) * 31 + l3) * 31 + c1) * 31 + i4) * 31 + j4) * 31 + k4) * 31 + l4) * 31 + i5) * 31 + j5) * 31 + k5) * 31 + c2) * 31 + c3) * 31 + c4) * 31 + c5) * 31 + c6) * 31 + c7) * 31 + c8) * 31 + l5) * 31 + l;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L35:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 33: default 280
        //                       0: 288
        //                       10: 290
        //                       16: 301
        //                       24: 395
        //                       32: 406
        //                       42: 451
        //                       50: 462
        //                       56: 473
        //                       64: 484
        //                       72: 495
        //                       80: 506
        //                       88: 517
        //                       96: 528
        //                       104: 539
        //                       112: 550
        //                       120: 561
        //                       128: 572
        //                       136: 583
        //                       144: 594
        //                       152: 605
        //                       160: 616
        //                       168: 627
        //                       176: 695
        //                       184: 706
        //                       192: 717
        //                       200: 728
        //                       208: 739
        //                       216: 750
        //                       224: 761
        //                       232: 772
        //                       240: 783
        //                       248: 794
        //                       258: 805;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L35; else goto _L2
_L2:
            return this;
_L3:
            roomId = codedinputbytebuffernano.readString();
              goto _L35
_L4:
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
                entryState = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            sessionStartTimeMs = codedinputbytebuffernano.readRawVarint64();
            continue; /* Loop/switch isn't completed */
_L6:
            int k = codedinputbytebuffernano.readRawVarint32();
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                sessionInitiator = k;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L7:
            simCellNetworkOperator = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L8:
            activeCellNetworkOperator = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L9:
            activeCellNetworkType = codedinputbytebuffernano.readRawVarint32();
            continue; /* Loop/switch isn't completed */
_L10:
            networkType = codedinputbytebuffernano.readRawVarint32();
            continue; /* Loop/switch isn't completed */
_L11:
            networkSubtype = codedinputbytebuffernano.readRawVarint32();
            continue; /* Loop/switch isn't completed */
_L12:
            connectXmppStartTimeMs = codedinputbytebuffernano.readRawVarint64();
            continue; /* Loop/switch isn't completed */
_L13:
            connectXmppEndTimeMs = codedinputbytebuffernano.readRawVarint64();
            continue; /* Loop/switch isn't completed */
_L14:
            connectXmppRetries = codedinputbytebuffernano.readRawVarint32();
            continue; /* Loop/switch isn't completed */
_L15:
            connectXmppResult = codedinputbytebuffernano.readBool();
            continue; /* Loop/switch isn't completed */
_L16:
            enterCallStartTimeMs = codedinputbytebuffernano.readRawVarint64();
            continue; /* Loop/switch isn't completed */
_L17:
            enterCallEndTimeMs = codedinputbytebuffernano.readRawVarint64();
            continue; /* Loop/switch isn't completed */
_L18:
            enterCallResult = codedinputbytebuffernano.readBool();
            continue; /* Loop/switch isn't completed */
_L19:
            numPeers = codedinputbytebuffernano.readRawVarint32();
            continue; /* Loop/switch isn't completed */
_L20:
            numConnectedPeers = codedinputbytebuffernano.readRawVarint32();
            continue; /* Loop/switch isn't completed */
_L21:
            peerConnectTimeMs = codedinputbytebuffernano.readRawVarint64();
            continue; /* Loop/switch isn't completed */
_L22:
            roomLeaveTimeMs = codedinputbytebuffernano.readRawVarint64();
            continue; /* Loop/switch isn't completed */
_L23:
            int l = codedinputbytebuffernano.readRawVarint32();
            switch (l)
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
                inRoomLeaveType = l;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L24:
            waitForDiagEndLeaveStartTimeMs = codedinputbytebuffernano.readRawVarint64();
            continue; /* Loop/switch isn't completed */
_L25:
            roomLeaveDoneMs = codedinputbytebuffernano.readRawVarint64();
            continue; /* Loop/switch isn't completed */
_L26:
            roomLeaveResult = codedinputbytebuffernano.readBool();
            continue; /* Loop/switch isn't completed */
_L27:
            mismatchedConnector = codedinputbytebuffernano.readBool();
            continue; /* Loop/switch isn't completed */
_L28:
            libjingleLoadRetryRequired = codedinputbytebuffernano.readBool();
            continue; /* Loop/switch isn't completed */
_L29:
            requestedSockets = codedinputbytebuffernano.readBool();
            continue; /* Loop/switch isn't completed */
_L30:
            usedNativeSockets = codedinputbytebuffernano.readBool();
            continue; /* Loop/switch isn't completed */
_L31:
            usedLegacySockets = codedinputbytebuffernano.readBool();
            continue; /* Loop/switch isn't completed */
_L32:
            unableToReportP2PStatus = codedinputbytebuffernano.readBool();
            continue; /* Loop/switch isn't completed */
_L33:
            roomUpdateCount = codedinputbytebuffernano.readRawVarint32();
            continue; /* Loop/switch isn't completed */
_L34:
            if (dcmSession == null)
            {
                dcmSession = new PlaylogGamesRtmpDcmSession();
            }
            codedinputbytebuffernano.readMessage(dcmSession);
            if (true) goto _L35; else goto _L36
_L36:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (!roomId.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, roomId);
            }
            if (entryState != 0)
            {
                codedoutputbytebuffernano.writeInt32(2, entryState);
            }
            if (sessionStartTimeMs != 0L)
            {
                codedoutputbytebuffernano.writeInt64(3, sessionStartTimeMs);
            }
            if (sessionInitiator != 0)
            {
                codedoutputbytebuffernano.writeInt32(4, sessionInitiator);
            }
            if (!simCellNetworkOperator.equals(""))
            {
                codedoutputbytebuffernano.writeString(5, simCellNetworkOperator);
            }
            if (!activeCellNetworkOperator.equals(""))
            {
                codedoutputbytebuffernano.writeString(6, activeCellNetworkOperator);
            }
            if (activeCellNetworkType != 0)
            {
                codedoutputbytebuffernano.writeInt32(7, activeCellNetworkType);
            }
            if (networkType != 0)
            {
                codedoutputbytebuffernano.writeInt32(8, networkType);
            }
            if (networkSubtype != 0)
            {
                codedoutputbytebuffernano.writeInt32(9, networkSubtype);
            }
            if (connectXmppStartTimeMs != 0L)
            {
                codedoutputbytebuffernano.writeInt64(10, connectXmppStartTimeMs);
            }
            if (connectXmppEndTimeMs != 0L)
            {
                codedoutputbytebuffernano.writeInt64(11, connectXmppEndTimeMs);
            }
            if (connectXmppRetries != 0)
            {
                codedoutputbytebuffernano.writeInt32(12, connectXmppRetries);
            }
            if (connectXmppResult)
            {
                codedoutputbytebuffernano.writeBool(13, connectXmppResult);
            }
            if (enterCallStartTimeMs != 0L)
            {
                codedoutputbytebuffernano.writeInt64(14, enterCallStartTimeMs);
            }
            if (enterCallEndTimeMs != 0L)
            {
                codedoutputbytebuffernano.writeInt64(15, enterCallEndTimeMs);
            }
            if (enterCallResult)
            {
                codedoutputbytebuffernano.writeBool(16, enterCallResult);
            }
            if (numPeers != 0)
            {
                codedoutputbytebuffernano.writeInt32(17, numPeers);
            }
            if (numConnectedPeers != 0)
            {
                codedoutputbytebuffernano.writeInt32(18, numConnectedPeers);
            }
            if (peerConnectTimeMs != 0L)
            {
                codedoutputbytebuffernano.writeInt64(19, peerConnectTimeMs);
            }
            if (roomLeaveTimeMs != 0L)
            {
                codedoutputbytebuffernano.writeInt64(20, roomLeaveTimeMs);
            }
            if (inRoomLeaveType != 0)
            {
                codedoutputbytebuffernano.writeInt32(21, inRoomLeaveType);
            }
            if (waitForDiagEndLeaveStartTimeMs != 0L)
            {
                codedoutputbytebuffernano.writeInt64(22, waitForDiagEndLeaveStartTimeMs);
            }
            if (roomLeaveDoneMs != 0L)
            {
                codedoutputbytebuffernano.writeInt64(23, roomLeaveDoneMs);
            }
            if (roomLeaveResult)
            {
                codedoutputbytebuffernano.writeBool(24, roomLeaveResult);
            }
            if (mismatchedConnector)
            {
                codedoutputbytebuffernano.writeBool(25, mismatchedConnector);
            }
            if (libjingleLoadRetryRequired)
            {
                codedoutputbytebuffernano.writeBool(26, libjingleLoadRetryRequired);
            }
            if (requestedSockets)
            {
                codedoutputbytebuffernano.writeBool(27, requestedSockets);
            }
            if (usedNativeSockets)
            {
                codedoutputbytebuffernano.writeBool(28, usedNativeSockets);
            }
            if (usedLegacySockets)
            {
                codedoutputbytebuffernano.writeBool(29, usedLegacySockets);
            }
            if (unableToReportP2PStatus)
            {
                codedoutputbytebuffernano.writeBool(30, unableToReportP2PStatus);
            }
            if (roomUpdateCount != 0)
            {
                codedoutputbytebuffernano.writeInt32(31, roomUpdateCount);
            }
            if (dcmSession != null)
            {
                codedoutputbytebuffernano.writeMessage(32, dcmSession);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesRtmpSession()
        {
            roomId = "";
            entryState = 0;
            sessionStartTimeMs = 0L;
            sessionInitiator = 0;
            simCellNetworkOperator = "";
            activeCellNetworkOperator = "";
            activeCellNetworkType = 0;
            networkType = 0;
            networkSubtype = 0;
            connectXmppStartTimeMs = 0L;
            connectXmppEndTimeMs = 0L;
            connectXmppRetries = 0;
            connectXmppResult = false;
            enterCallStartTimeMs = 0L;
            enterCallEndTimeMs = 0L;
            enterCallResult = false;
            numPeers = 0;
            numConnectedPeers = 0;
            peerConnectTimeMs = 0L;
            roomLeaveTimeMs = 0L;
            inRoomLeaveType = 0;
            waitForDiagEndLeaveStartTimeMs = 0L;
            roomLeaveDoneMs = 0L;
            roomLeaveResult = false;
            mismatchedConnector = false;
            libjingleLoadRetryRequired = false;
            requestedSockets = false;
            usedNativeSockets = false;
            usedLegacySockets = false;
            unableToReportP2PStatus = false;
            roomUpdateCount = 0;
            dcmSession = null;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession extends MessageNano
    {

        public String myJidHash;
        public PlaylogGamesRtmpPeerSession peers[];
        public PlaylogGamesRtmpPeerConnectionRetryInfo retryInfo[];

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (!myJidHash.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(1, myJidHash);
            }
            i = j;
            if (peers != null)
            {
                i = j;
                if (peers.length > 0)
                {
                    int l = 0;
                    do
                    {
                        i = j;
                        if (l >= peers.length)
                        {
                            break;
                        }
                        PlaylogGamesRtmpPeerSession playloggamesrtmppeersession = peers[l];
                        i = j;
                        if (playloggamesrtmppeersession != null)
                        {
                            i = j + CodedOutputByteBufferNano.computeMessageSize(2, playloggamesrtmppeersession);
                        }
                        l++;
                        j = i;
                    } while (true);
                }
            }
            int i1 = i;
            if (retryInfo != null)
            {
                i1 = i;
                if (retryInfo.length > 0)
                {
                    int k = 0;
                    do
                    {
                        i1 = i;
                        if (k >= retryInfo.length)
                        {
                            break;
                        }
                        PlaylogGamesRtmpPeerConnectionRetryInfo playloggamesrtmppeerconnectionretryinfo = retryInfo[k];
                        i1 = i;
                        if (playloggamesrtmppeerconnectionretryinfo != null)
                        {
                            i1 = i + CodedOutputByteBufferNano.computeMessageSize(3, playloggamesrtmppeerconnectionretryinfo);
                        }
                        k++;
                        i = i1;
                    } while (true);
                }
            }
            return i1;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession))
                {
                    return false;
                }
                obj = (PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession)obj;
                if (myJidHash == null)
                {
                    if (((PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession) (obj)).myJidHash != null)
                    {
                        return false;
                    }
                } else
                if (!myJidHash.equals(((PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession) (obj)).myJidHash))
                {
                    return false;
                }
                if (!InternalNano.equals(peers, ((PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession) (obj)).peers))
                {
                    return false;
                }
                if (!InternalNano.equals(retryInfo, ((PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession) (obj)).retryInfo))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int j = getClass().getName().hashCode();
            int i;
            if (myJidHash == null)
            {
                i = 0;
            } else
            {
                i = myJidHash.hashCode();
            }
            return (((j + 527) * 31 + i) * 31 + InternalNano.hashCode(peers)) * 31 + InternalNano.hashCode(retryInfo);
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
                    myJidHash = codedinputbytebuffernano.readString();
                    break;

                case 18: // '\022'
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
                    PlaylogGamesRtmpPeerSession aplayloggamesrtmppeersession[];
                    int j;
                    if (peers == null)
                    {
                        j = 0;
                    } else
                    {
                        j = peers.length;
                    }
                    aplayloggamesrtmppeersession = new PlaylogGamesRtmpPeerSession[l + j];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(peers, 0, aplayloggamesrtmppeersession, 0, j);
                        l = j;
                    }
                    for (; l < aplayloggamesrtmppeersession.length - 1; l++)
                    {
                        aplayloggamesrtmppeersession[l] = new PlaylogGamesRtmpPeerSession();
                        codedinputbytebuffernano.readMessage(aplayloggamesrtmppeersession[l]);
                        codedinputbytebuffernano.readTag();
                    }

                    aplayloggamesrtmppeersession[l] = new PlaylogGamesRtmpPeerSession();
                    codedinputbytebuffernano.readMessage(aplayloggamesrtmppeersession[l]);
                    peers = aplayloggamesrtmppeersession;
                    break;

                case 26: // '\032'
                    int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    PlaylogGamesRtmpPeerConnectionRetryInfo aplayloggamesrtmppeerconnectionretryinfo[];
                    int k;
                    if (retryInfo == null)
                    {
                        k = 0;
                    } else
                    {
                        k = retryInfo.length;
                    }
                    aplayloggamesrtmppeerconnectionretryinfo = new PlaylogGamesRtmpPeerConnectionRetryInfo[i1 + k];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(retryInfo, 0, aplayloggamesrtmppeerconnectionretryinfo, 0, k);
                        i1 = k;
                    }
                    for (; i1 < aplayloggamesrtmppeerconnectionretryinfo.length - 1; i1++)
                    {
                        aplayloggamesrtmppeerconnectionretryinfo[i1] = new PlaylogGamesRtmpPeerConnectionRetryInfo();
                        codedinputbytebuffernano.readMessage(aplayloggamesrtmppeerconnectionretryinfo[i1]);
                        codedinputbytebuffernano.readTag();
                    }

                    aplayloggamesrtmppeerconnectionretryinfo[i1] = new PlaylogGamesRtmpPeerConnectionRetryInfo();
                    codedinputbytebuffernano.readMessage(aplayloggamesrtmppeerconnectionretryinfo[i1]);
                    retryInfo = aplayloggamesrtmppeerconnectionretryinfo;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (!myJidHash.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, myJidHash);
            }
            if (peers != null && peers.length > 0)
            {
                for (int i = 0; i < peers.length; i++)
                {
                    PlaylogGamesRtmpPeerSession playloggamesrtmppeersession = peers[i];
                    if (playloggamesrtmppeersession != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, playloggamesrtmppeersession);
                    }
                }

            }
            if (retryInfo != null && retryInfo.length > 0)
            {
                for (int j = 0; j < retryInfo.length; j++)
                {
                    PlaylogGamesRtmpPeerConnectionRetryInfo playloggamesrtmppeerconnectionretryinfo = retryInfo[j];
                    if (playloggamesrtmppeerconnectionretryinfo != null)
                    {
                        codedoutputbytebuffernano.writeMessage(3, playloggamesrtmppeerconnectionretryinfo);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession()
        {
            myJidHash = "";
            peers = PlaylogGamesRtmpPeerSession.emptyArray();
            retryInfo = PlaylogGamesRtmpPeerConnectionRetryInfo.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerConnectionRetryInfo extends MessageNano
    {

        private static volatile PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerConnectionRetryInfo _emptyArray[];
        public String participantId;
        public int reconnectRetryCount;
        public int reconnectRetrySucessfulCount;

        public static PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerConnectionRetryInfo[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerConnectionRetryInfo[0];
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
            if (!participantId.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, participantId);
            }
            j = i;
            if (reconnectRetryCount != 0)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, reconnectRetryCount);
            }
            i = j;
            if (reconnectRetrySucessfulCount != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, reconnectRetrySucessfulCount);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerConnectionRetryInfo))
                {
                    return false;
                }
                obj = (PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerConnectionRetryInfo)obj;
                if (participantId == null)
                {
                    if (((PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerConnectionRetryInfo) (obj)).participantId != null)
                    {
                        return false;
                    }
                } else
                if (!participantId.equals(((PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerConnectionRetryInfo) (obj)).participantId))
                {
                    return false;
                }
                if (reconnectRetryCount != ((PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerConnectionRetryInfo) (obj)).reconnectRetryCount)
                {
                    return false;
                }
                if (reconnectRetrySucessfulCount != ((PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerConnectionRetryInfo) (obj)).reconnectRetrySucessfulCount)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int j = getClass().getName().hashCode();
            int i;
            if (participantId == null)
            {
                i = 0;
            } else
            {
                i = participantId.hashCode();
            }
            return (((j + 527) * 31 + i) * 31 + reconnectRetryCount) * 31 + reconnectRetrySucessfulCount;
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
                    participantId = codedinputbytebuffernano.readString();
                    break;

                case 16: // '\020'
                    reconnectRetryCount = codedinputbytebuffernano.readRawVarint32();
                    break;

                case 24: // '\030'
                    reconnectRetrySucessfulCount = codedinputbytebuffernano.readRawVarint32();
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (!participantId.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, participantId);
            }
            if (reconnectRetryCount != 0)
            {
                codedoutputbytebuffernano.writeInt32(2, reconnectRetryCount);
            }
            if (reconnectRetrySucessfulCount != 0)
            {
                codedoutputbytebuffernano.writeInt32(3, reconnectRetrySucessfulCount);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerConnectionRetryInfo()
        {
            participantId = "";
            reconnectRetryCount = 0;
            reconnectRetrySucessfulCount = 0;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession extends MessageNano
    {

        private static volatile PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession _emptyArray[];
        public int directPresenceRecieved;
        public int directPresenceSent;
        public String remoteJidHash;
        public PeerStateTransition transitions[];

        public static PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession[0];
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
            if (!remoteJidHash.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, remoteJidHash);
            }
            j = i;
            if (directPresenceRecieved != 0)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, directPresenceRecieved);
            }
            i = j;
            if (directPresenceSent != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, directPresenceSent);
            }
            int l = i;
            if (transitions != null)
            {
                l = i;
                if (transitions.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= transitions.length)
                        {
                            break;
                        }
                        PeerStateTransition peerstatetransition = transitions[k];
                        l = i;
                        if (peerstatetransition != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(4, peerstatetransition);
                        }
                        k++;
                        i = l;
                    } while (true);
                }
            }
            return l;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession))
                {
                    return false;
                }
                obj = (PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession)obj;
                if (remoteJidHash == null)
                {
                    if (((PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession) (obj)).remoteJidHash != null)
                    {
                        return false;
                    }
                } else
                if (!remoteJidHash.equals(((PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession) (obj)).remoteJidHash))
                {
                    return false;
                }
                if (directPresenceRecieved != ((PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession) (obj)).directPresenceRecieved)
                {
                    return false;
                }
                if (directPresenceSent != ((PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession) (obj)).directPresenceSent)
                {
                    return false;
                }
                if (!InternalNano.equals(transitions, ((PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession) (obj)).transitions))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int j = getClass().getName().hashCode();
            int i;
            if (remoteJidHash == null)
            {
                i = 0;
            } else
            {
                i = remoteJidHash.hashCode();
            }
            return ((((j + 527) * 31 + i) * 31 + directPresenceRecieved) * 31 + directPresenceSent) * 31 + InternalNano.hashCode(transitions);
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
                    remoteJidHash = codedinputbytebuffernano.readString();
                    break;

                case 16: // '\020'
                    directPresenceRecieved = codedinputbytebuffernano.readRawVarint32();
                    break;

                case 24: // '\030'
                    directPresenceSent = codedinputbytebuffernano.readRawVarint32();
                    break;

                case 34: // '"'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                    PeerStateTransition apeerstatetransition[];
                    int j;
                    if (transitions == null)
                    {
                        j = 0;
                    } else
                    {
                        j = transitions.length;
                    }
                    apeerstatetransition = new PeerStateTransition[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(transitions, 0, apeerstatetransition, 0, j);
                        k = j;
                    }
                    for (; k < apeerstatetransition.length - 1; k++)
                    {
                        apeerstatetransition[k] = new PeerStateTransition();
                        codedinputbytebuffernano.readMessage(apeerstatetransition[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    apeerstatetransition[k] = new PeerStateTransition();
                    codedinputbytebuffernano.readMessage(apeerstatetransition[k]);
                    transitions = apeerstatetransition;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (!remoteJidHash.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, remoteJidHash);
            }
            if (directPresenceRecieved != 0)
            {
                codedoutputbytebuffernano.writeInt32(2, directPresenceRecieved);
            }
            if (directPresenceSent != 0)
            {
                codedoutputbytebuffernano.writeInt32(3, directPresenceSent);
            }
            if (transitions != null && transitions.length > 0)
            {
                for (int i = 0; i < transitions.length; i++)
                {
                    PeerStateTransition peerstatetransition = transitions[i];
                    if (peerstatetransition != null)
                    {
                        codedoutputbytebuffernano.writeMessage(4, peerstatetransition);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession()
        {
            remoteJidHash = "";
            directPresenceRecieved = 0;
            directPresenceSent = 0;
            transitions = PeerStateTransition.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession.PeerStateTransition extends MessageNano
    {

        private static volatile PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession.PeerStateTransition _emptyArray[];
        public long deltaMs;
        public int state;

        public static PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession.PeerStateTransition[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession.PeerStateTransition[0];
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
            if (state != 1)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, state);
            }
            j = i;
            if (deltaMs != 0L)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, deltaMs);
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession.PeerStateTransition))
                {
                    return false;
                }
                obj = (PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession.PeerStateTransition)obj;
                if (state != ((PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession.PeerStateTransition) (obj)).state)
                {
                    return false;
                }
                if (deltaMs != ((PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession.PeerStateTransition) (obj)).deltaMs)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return ((getClass().getName().hashCode() + 527) * 31 + state) * 31 + (int)(deltaMs ^ deltaMs >>> 32);
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 48
        //                       8: 50
        //                       16: 111;
               goto _L1 _L2 _L3 _L4
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
                state = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            deltaMs = codedinputbytebuffernano.readRawVarint64();
            if (true) goto _L5; else goto _L6
_L6:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (state != 1)
            {
                codedoutputbytebuffernano.writeInt32(1, state);
            }
            if (deltaMs != 0L)
            {
                codedoutputbytebuffernano.writeInt64(2, deltaMs);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesRtmpSession.PlaylogGamesRtmpDcmSession.PlaylogGamesRtmpPeerSession.PeerStateTransition()
        {
            state = 1;
            deltaMs = 0L;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesSearchEvent extends MessageNano
    {

        public String query;
        public int type;

        public final PlaylogGamesSearchEvent clear()
        {
            type = 0;
            query = "";
            cachedSize = -1;
            return this;
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (type != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, type);
            }
            j = i;
            if (!query.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, query);
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (!(obj instanceof PlaylogGamesSearchEvent))
            {
                return false;
            }
            obj = (PlaylogGamesSearchEvent)obj;
            if (type != ((PlaylogGamesSearchEvent) (obj)).type)
            {
                return false;
            }
            if (query != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((PlaylogGamesSearchEvent) (obj)).query == null) goto _L1; else goto _L3
_L3:
            return false;
            if (query.equals(((PlaylogGamesSearchEvent) (obj)).query)) goto _L1; else goto _L4
_L4:
            return false;
        }

        public final int hashCode()
        {
            int j = getClass().getName().hashCode();
            int k = type;
            int i;
            if (query == null)
            {
                i = 0;
            } else
            {
                i = query.hashCode();
            }
            return i + ((j + 527) * 31 + k) * 31;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 48
        //                       8: 50
        //                       18: 95;
               goto _L1 _L2 _L3 _L4
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
                type = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            query = codedinputbytebuffernano.readString();
            if (true) goto _L5; else goto _L6
_L6:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (type != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, type);
            }
            if (!query.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, query);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesSearchEvent()
        {
            clear();
        }
    }

    public static final class PlaylogGamesSelectedPlayers extends MessageNano
    {

        public int numAutomatch;
        public int source[];

        protected final int computeSerializedSize()
        {
            int l = super.computeSerializedSize();
            int i = l;
            if (source != null)
            {
                i = l;
                if (source.length > 0)
                {
                    int j = 0;
                    for (i = 0; i < source.length; i++)
                    {
                        j += CodedOutputByteBufferNano.computeInt32SizeNoTag(source[i]);
                    }

                    i = l + j + source.length * 1;
                }
            }
            int k = i;
            if (numAutomatch != 0)
            {
                k = i + CodedOutputByteBufferNano.computeInt32Size(2, numAutomatch);
            }
            return k;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesSelectedPlayers))
                {
                    return false;
                }
                obj = (PlaylogGamesSelectedPlayers)obj;
                if (!InternalNano.equals(source, ((PlaylogGamesSelectedPlayers) (obj)).source))
                {
                    return false;
                }
                if (numAutomatch != ((PlaylogGamesSelectedPlayers) (obj)).numAutomatch)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return ((getClass().getName().hashCode() + 527) * 31 + InternalNano.hashCode(source)) * 31 + numAutomatch;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L20:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 4: default 52
        //                       0: 61
        //                       8: 63
        //                       10: 264
        //                       16: 502;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i))
            {
                continue; /* Loop/switch isn't completed */
            }
_L2:
            return this;
_L3:
            int ai[];
            int j;
            int i1;
            i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 8);
            ai = new int[i1];
            j = 0;
            i = 0;
_L12:
            if (j >= i1) goto _L7; else goto _L6
_L6:
            int j1;
            if (j != 0)
            {
                codedinputbytebuffernano.readTag();
            }
            j1 = codedinputbytebuffernano.readRawVarint32();
            j1;
            JVM INSTR tableswitch 0 6: default 148
        //                       0 157
        //                       1 157
        //                       2 157
        //                       3 157
        //                       4 157
        //                       5 157
        //                       6 157;
               goto _L8 _L9 _L9 _L9 _L9 _L9 _L9 _L9
_L8:
            j++;
              goto _L10
_L9:
            int k = i + 1;
            ai[i] = j1;
            i = k;
            if (true) goto _L8; else goto _L10
_L10:
            if (true) goto _L12; else goto _L11
_L11:
_L7:
            if (i != 0)
            {
                if (source == null)
                {
                    j = 0;
                } else
                {
                    j = source.length;
                }
                if (j == 0 && i == ai.length)
                {
                    source = ai;
                } else
                {
                    int ai1[] = new int[j + i];
                    if (j != 0)
                    {
                        System.arraycopy(source, 0, ai1, 0, j);
                    }
                    System.arraycopy(ai, 0, ai1, j, i);
                    source = ai1;
                }
            }
            continue; /* Loop/switch isn't completed */
_L4:
            int l;
            l = codedinputbytebuffernano.pushLimit(codedinputbytebuffernano.readRawVarint32());
            i = codedinputbytebuffernano.getPosition();
            j = 0;
_L18:
            if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
            {
                switch (codedinputbytebuffernano.readRawVarint32())
                {
                case 0: // '\0'
                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                case 4: // '\004'
                case 5: // '\005'
                case 6: // '\006'
                    j++;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
            if (j == 0) goto _L14; else goto _L13
_L13:
            codedinputbytebuffernano.rewindToPosition(i);
            if (source == null)
            {
                i = 0;
            } else
            {
                i = source.length;
            }
            ai = new int[j + i];
            j = i;
            if (i != 0)
            {
                System.arraycopy(source, 0, ai, 0, i);
                j = i;
            }
_L16:
            if (codedinputbytebuffernano.getBytesUntilLimit() > 0)
            {
                i = codedinputbytebuffernano.readRawVarint32();
                switch (i)
                {
                case 0: // '\0'
                case 1: // '\001'
                case 2: // '\002'
                case 3: // '\003'
                case 4: // '\004'
                case 5: // '\005'
                case 6: // '\006'
                    ai[j] = i;
                    j++;
                    break;
                }
                continue; /* Loop/switch isn't completed */
            }
            source = ai;
              goto _L14
            if (true) goto _L16; else goto _L15
_L15:
            if (true) goto _L18; else goto _L17
_L17:
_L14:
            codedinputbytebuffernano.popLimit(l);
            continue; /* Loop/switch isn't completed */
_L5:
            numAutomatch = codedinputbytebuffernano.readRawVarint32();
            if (true) goto _L20; else goto _L19
_L19:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (source != null && source.length > 0)
            {
                for (int i = 0; i < source.length; i++)
                {
                    codedoutputbytebuffernano.writeInt32(1, source[i]);
                }

            }
            if (numAutomatch != 0)
            {
                codedoutputbytebuffernano.writeInt32(2, numAutomatch);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesSelectedPlayers()
        {
            source = WireFormatNano.EMPTY_INT_ARRAY;
            numAutomatch = 0;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesSignInAccount extends MessageNano
    {

        public int status;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (status != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, status);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesSignInAccount))
                {
                    return false;
                }
                obj = (PlaylogGamesSignInAccount)obj;
                if (status != ((PlaylogGamesSignInAccount) (obj)).status)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return (getClass().getName().hashCode() + 527) * 31 + status;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L4:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 2: default 32
        //                       0: 40
        //                       8: 42;
               goto _L1 _L2 _L3
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L4; else goto _L2
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
                status = j;
                break;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (status != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, status);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesSignInAccount()
        {
            status = 0;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesSignInAction extends MessageNano
    {

        public PlaylogGamesSignInAccount account;
        public PlaylogGamesAndroidSignIn androidAction;
        public PlaylogGamesGPlusUpgrade gplusUpgrade;
        public int type;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (account != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, account);
            }
            j = i;
            if (gplusUpgrade != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(2, gplusUpgrade);
            }
            i = j;
            if (type != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, type);
            }
            j = i;
            if (androidAction != null)
            {
                j = i + CodedOutputByteBufferNano.computeMessageSize(4, androidAction);
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (!(obj instanceof PlaylogGamesSignInAction))
            {
                return false;
            }
            obj = (PlaylogGamesSignInAction)obj;
            if (account == null)
            {
                if (((PlaylogGamesSignInAction) (obj)).account != null)
                {
                    return false;
                }
            } else
            if (!account.equals(((PlaylogGamesSignInAction) (obj)).account))
            {
                return false;
            }
            if (gplusUpgrade == null)
            {
                if (((PlaylogGamesSignInAction) (obj)).gplusUpgrade != null)
                {
                    return false;
                }
            } else
            if (!gplusUpgrade.equals(((PlaylogGamesSignInAction) (obj)).gplusUpgrade))
            {
                return false;
            }
            if (type != ((PlaylogGamesSignInAction) (obj)).type)
            {
                return false;
            }
            if (androidAction != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((PlaylogGamesSignInAction) (obj)).androidAction == null) goto _L1; else goto _L3
_L3:
            return false;
            if (androidAction.equals(((PlaylogGamesSignInAction) (obj)).androidAction)) goto _L1; else goto _L4
_L4:
            return false;
        }

        public final int hashCode()
        {
            int k = 0;
            int l = getClass().getName().hashCode();
            int i;
            int j;
            int i1;
            if (account == null)
            {
                i = 0;
            } else
            {
                i = account.hashCode();
            }
            if (gplusUpgrade == null)
            {
                j = 0;
            } else
            {
                j = gplusUpgrade.hashCode();
            }
            i1 = type;
            if (androidAction != null)
            {
                k = androidAction.hashCode();
            }
            return ((((l + 527) * 31 + i) * 31 + j) * 31 + i1) * 31 + k;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 64
        //                       10: 66
        //                       18: 95
        //                       24: 124
        //                       34: 171;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
_L2:
            return this;
_L3:
            if (account == null)
            {
                account = new PlaylogGamesSignInAccount();
            }
            codedinputbytebuffernano.readMessage(account);
              goto _L7
_L4:
            if (gplusUpgrade == null)
            {
                gplusUpgrade = new PlaylogGamesGPlusUpgrade();
            }
            codedinputbytebuffernano.readMessage(gplusUpgrade);
              goto _L7
_L5:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                type = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            if (androidAction == null)
            {
                androidAction = new PlaylogGamesAndroidSignIn();
            }
            codedinputbytebuffernano.readMessage(androidAction);
            if (true) goto _L7; else goto _L8
_L8:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (account != null)
            {
                codedoutputbytebuffernano.writeMessage(1, account);
            }
            if (gplusUpgrade != null)
            {
                codedoutputbytebuffernano.writeMessage(2, gplusUpgrade);
            }
            if (type != 0)
            {
                codedoutputbytebuffernano.writeInt32(3, type);
            }
            if (androidAction != null)
            {
                codedoutputbytebuffernano.writeMessage(4, androidAction);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesSignInAction()
        {
            account = null;
            gplusUpgrade = null;
            type = 0;
            androidAction = null;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesSnapshotAction extends MessageNano
    {

        public int actionStatus;
        public int actionType;
        public long contentSizeBytes;
        public String coverImageFingerprintMd5;
        public String snapshotId;
        public int source;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (actionType != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, actionType);
            }
            j = i;
            if (!snapshotId.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, snapshotId);
            }
            i = j;
            if (source != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, source);
            }
            j = i;
            if (!coverImageFingerprintMd5.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, coverImageFingerprintMd5);
            }
            i = j;
            if (actionStatus != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(5, actionStatus);
            }
            j = i;
            if (contentSizeBytes != 0L)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(6, contentSizeBytes);
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesSnapshotAction))
                {
                    return false;
                }
                obj = (PlaylogGamesSnapshotAction)obj;
                if (actionType != ((PlaylogGamesSnapshotAction) (obj)).actionType)
                {
                    return false;
                }
                if (snapshotId == null)
                {
                    if (((PlaylogGamesSnapshotAction) (obj)).snapshotId != null)
                    {
                        return false;
                    }
                } else
                if (!snapshotId.equals(((PlaylogGamesSnapshotAction) (obj)).snapshotId))
                {
                    return false;
                }
                if (source != ((PlaylogGamesSnapshotAction) (obj)).source)
                {
                    return false;
                }
                if (coverImageFingerprintMd5 == null)
                {
                    if (((PlaylogGamesSnapshotAction) (obj)).coverImageFingerprintMd5 != null)
                    {
                        return false;
                    }
                } else
                if (!coverImageFingerprintMd5.equals(((PlaylogGamesSnapshotAction) (obj)).coverImageFingerprintMd5))
                {
                    return false;
                }
                if (actionStatus != ((PlaylogGamesSnapshotAction) (obj)).actionStatus)
                {
                    return false;
                }
                if (contentSizeBytes != ((PlaylogGamesSnapshotAction) (obj)).contentSizeBytes)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int j = 0;
            int k = getClass().getName().hashCode();
            int l = actionType;
            int i;
            int i1;
            if (snapshotId == null)
            {
                i = 0;
            } else
            {
                i = snapshotId.hashCode();
            }
            i1 = source;
            if (coverImageFingerprintMd5 != null)
            {
                j = coverImageFingerprintMd5.hashCode();
            }
            return ((((((k + 527) * 31 + l) * 31 + i) * 31 + i1) * 31 + j) * 31 + actionStatus) * 31 + (int)(contentSizeBytes ^ contentSizeBytes >>> 32);
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L9:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 7: default 72
        //                       0: 80
        //                       8: 82
        //                       18: 143
        //                       24: 154
        //                       34: 195
        //                       40: 206
        //                       48: 259;
               goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L9; else goto _L2
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
                actionType = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            snapshotId = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L5:
            int k = codedinputbytebuffernano.readRawVarint32();
            switch (k)
            {
            case 0: // '\0'
            case 1: // '\001'
                source = k;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L6:
            coverImageFingerprintMd5 = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L7:
            int l = codedinputbytebuffernano.readRawVarint32();
            switch (l)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
                actionStatus = l;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L8:
            contentSizeBytes = codedinputbytebuffernano.readRawVarint64();
            if (true) goto _L9; else goto _L10
_L10:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (actionType != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, actionType);
            }
            if (!snapshotId.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, snapshotId);
            }
            if (source != 0)
            {
                codedoutputbytebuffernano.writeInt32(3, source);
            }
            if (!coverImageFingerprintMd5.equals(""))
            {
                codedoutputbytebuffernano.writeString(4, coverImageFingerprintMd5);
            }
            if (actionStatus != 0)
            {
                codedoutputbytebuffernano.writeInt32(5, actionStatus);
            }
            if (contentSizeBytes != 0L)
            {
                codedoutputbytebuffernano.writeInt64(6, contentSizeBytes);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesSnapshotAction()
        {
            actionType = 0;
            snapshotId = "";
            source = 0;
            coverImageFingerprintMd5 = "";
            actionStatus = 0;
            contentSizeBytes = 0L;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesSystemStats extends MessageNano
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
                if (!(obj instanceof PlaylogGamesSystemStats))
                {
                    return false;
                }
                obj = (PlaylogGamesSystemStats)obj;
                if (numInstalledGames != ((PlaylogGamesSystemStats) (obj)).numInstalledGames)
                {
                    return false;
                }
                if (numSignedInGames != ((PlaylogGamesSystemStats) (obj)).numSignedInGames)
                {
                    return false;
                }
                if (lastPlayedGameTimeMs != ((PlaylogGamesSystemStats) (obj)).lastPlayedGameTimeMs)
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

        public PlaylogGamesSystemStats()
        {
            numInstalledGames = 0;
            numSignedInGames = 0;
            lastPlayedGameTimeMs = 0L;
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesUiElement extends MessageNano
    {

        private static volatile PlaylogGamesUiElement _emptyArray[];
        public PlaylogGamesUiElement child[];
        public String id;
        public byte serverLogsCookie[];
        public int type;

        public static PlaylogGamesUiElement[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new PlaylogGamesUiElement[0];
                    }
                }
            }
            return _emptyArray;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final PlaylogGamesUiElement clear()
        {
            type = 0;
            child = emptyArray();
            id = "";
            serverLogsCookie = WireFormatNano.EMPTY_BYTES;
            cachedSize = -1;
            return this;
        }

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (type != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, type);
            }
            j = i;
            if (child != null)
            {
                j = i;
                if (child.length > 0)
                {
                    int k = 0;
                    do
                    {
                        j = i;
                        if (k >= child.length)
                        {
                            break;
                        }
                        PlaylogGamesUiElement playloggamesuielement = child[k];
                        j = i;
                        if (playloggamesuielement != null)
                        {
                            j = i + CodedOutputByteBufferNano.computeMessageSize(2, playloggamesuielement);
                        }
                        k++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (!id.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, id);
            }
            j = i;
            if (!Arrays.equals(serverLogsCookie, WireFormatNano.EMPTY_BYTES))
            {
                j = i + CodedOutputByteBufferNano.computeBytesSize(4, serverLogsCookie);
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesUiElement))
                {
                    return false;
                }
                obj = (PlaylogGamesUiElement)obj;
                if (type != ((PlaylogGamesUiElement) (obj)).type)
                {
                    return false;
                }
                if (!InternalNano.equals(child, ((PlaylogGamesUiElement) (obj)).child))
                {
                    return false;
                }
                if (id == null)
                {
                    if (((PlaylogGamesUiElement) (obj)).id != null)
                    {
                        return false;
                    }
                } else
                if (!id.equals(((PlaylogGamesUiElement) (obj)).id))
                {
                    return false;
                }
                if (!Arrays.equals(serverLogsCookie, ((PlaylogGamesUiElement) (obj)).serverLogsCookie))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int j = getClass().getName().hashCode();
            int k = type;
            int l = InternalNano.hashCode(child);
            int i;
            if (id == null)
            {
                i = 0;
            } else
            {
                i = id.hashCode();
            }
            return ((((j + 527) * 31 + k) * 31 + l) * 31 + i) * 31 + Arrays.hashCode(serverLogsCookie);
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 64
        //                       8: 66
        //                       18: 1695
        //                       26: 1819
        //                       34: 1830;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
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
            case 200: 
            case 201: 
            case 202: 
            case 203: 
            case 204: 
            case 205: 
            case 206: 
            case 207: 
            case 208: 
            case 209: 
            case 210: 
            case 211: 
            case 212: 
            case 213: 
            case 214: 
            case 215: 
            case 216: 
            case 217: 
            case 218: 
            case 219: 
            case 220: 
            case 221: 
            case 222: 
            case 223: 
            case 224: 
            case 225: 
            case 250: 
            case 251: 
            case 252: 
            case 253: 
            case 254: 
            case 255: 
            case 300: 
            case 301: 
            case 302: 
            case 303: 
            case 304: 
            case 305: 
            case 306: 
            case 400: 
            case 500: 
            case 501: 
            case 502: 
            case 503: 
            case 504: 
            case 505: 
            case 506: 
            case 507: 
            case 508: 
            case 509: 
            case 510: 
            case 511: 
            case 512: 
            case 513: 
            case 514: 
            case 575: 
            case 576: 
            case 577: 
            case 600: 
            case 601: 
            case 602: 
            case 603: 
            case 604: 
            case 605: 
            case 606: 
            case 607: 
            case 608: 
            case 609: 
            case 610: 
            case 611: 
            case 612: 
            case 613: 
            case 614: 
            case 615: 
            case 616: 
            case 617: 
            case 700: 
            case 701: 
            case 702: 
            case 703: 
            case 704: 
            case 705: 
            case 706: 
            case 707: 
            case 708: 
            case 801: 
            case 802: 
            case 803: 
            case 804: 
            case 805: 
            case 806: 
            case 807: 
            case 900: 
            case 901: 
            case 1000: 
            case 1001: 
            case 1002: 
            case 1003: 
            case 1004: 
            case 1005: 
            case 1006: 
            case 1007: 
            case 1008: 
            case 1009: 
            case 1010: 
            case 1011: 
            case 1012: 
            case 1013: 
            case 1014: 
            case 1015: 
            case 1016: 
            case 1017: 
            case 1018: 
            case 1050: 
            case 1051: 
            case 1052: 
            case 1053: 
            case 1054: 
            case 1055: 
            case 1056: 
            case 1057: 
            case 1058: 
            case 1059: 
            case 1060: 
            case 1100: 
            case 1101: 
            case 1102: 
            case 1103: 
            case 1104: 
            case 1105: 
            case 1106: 
            case 1107: 
            case 1108: 
            case 1109: 
            case 1110: 
            case 1111: 
            case 1112: 
            case 1113: 
            case 1114: 
            case 1140: 
            case 1141: 
            case 1142: 
            case 1143: 
            case 1144: 
            case 1145: 
            case 1146: 
            case 1147: 
            case 1148: 
            case 1149: 
            case 1150: 
            case 1151: 
            case 1152: 
            case 1153: 
            case 1154: 
            case 1155: 
                type = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 18);
            PlaylogGamesUiElement aplayloggamesuielement[];
            int k;
            if (child == null)
            {
                k = 0;
            } else
            {
                k = child.length;
            }
            aplayloggamesuielement = new PlaylogGamesUiElement[l + k];
            l = k;
            if (k != 0)
            {
                System.arraycopy(child, 0, aplayloggamesuielement, 0, k);
                l = k;
            }
            for (; l < aplayloggamesuielement.length - 1; l++)
            {
                aplayloggamesuielement[l] = new PlaylogGamesUiElement();
                codedinputbytebuffernano.readMessage(aplayloggamesuielement[l]);
                codedinputbytebuffernano.readTag();
            }

            aplayloggamesuielement[l] = new PlaylogGamesUiElement();
            codedinputbytebuffernano.readMessage(aplayloggamesuielement[l]);
            child = aplayloggamesuielement;
            continue; /* Loop/switch isn't completed */
_L5:
            id = codedinputbytebuffernano.readString();
            continue; /* Loop/switch isn't completed */
_L6:
            serverLogsCookie = codedinputbytebuffernano.readBytes();
            if (true) goto _L7; else goto _L8
_L8:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (type != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, type);
            }
            if (child != null && child.length > 0)
            {
                for (int i = 0; i < child.length; i++)
                {
                    PlaylogGamesUiElement playloggamesuielement = child[i];
                    if (playloggamesuielement != null)
                    {
                        codedoutputbytebuffernano.writeMessage(2, playloggamesuielement);
                    }
                }

            }
            if (!id.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, id);
            }
            if (!Arrays.equals(serverLogsCookie, WireFormatNano.EMPTY_BYTES))
            {
                codedoutputbytebuffernano.writeBytes(4, serverLogsCookie);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesUiElement()
        {
            clear();
        }
    }

    public static final class PlaylogGamesUiElementPath extends MessageNano
    {

        private static volatile PlaylogGamesUiElementPath _emptyArray[];
        public PlaylogGamesUiElement e[];

        public static PlaylogGamesUiElementPath[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new PlaylogGamesUiElementPath[0];
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
            int i = super.computeSerializedSize();
            int k = i;
            if (e != null)
            {
                k = i;
                if (e.length > 0)
                {
                    int j = 0;
                    do
                    {
                        k = i;
                        if (j >= e.length)
                        {
                            break;
                        }
                        PlaylogGamesUiElement playloggamesuielement = e[j];
                        k = i;
                        if (playloggamesuielement != null)
                        {
                            k = i + CodedOutputByteBufferNano.computeMessageSize(1, playloggamesuielement);
                        }
                        j++;
                        i = k;
                    } while (true);
                }
            }
            return k;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogGamesUiElementPath))
                {
                    return false;
                }
                obj = (PlaylogGamesUiElementPath)obj;
                if (!InternalNano.equals(e, ((PlaylogGamesUiElementPath) (obj)).e))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return (getClass().getName().hashCode() + 527) * 31 + InternalNano.hashCode(e);
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
                    PlaylogGamesUiElement aplayloggamesuielement[];
                    int j;
                    if (e == null)
                    {
                        j = 0;
                    } else
                    {
                        j = e.length;
                    }
                    aplayloggamesuielement = new PlaylogGamesUiElement[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(e, 0, aplayloggamesuielement, 0, j);
                        k = j;
                    }
                    for (; k < aplayloggamesuielement.length - 1; k++)
                    {
                        aplayloggamesuielement[k] = new PlaylogGamesUiElement();
                        codedinputbytebuffernano.readMessage(aplayloggamesuielement[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    aplayloggamesuielement[k] = new PlaylogGamesUiElement();
                    codedinputbytebuffernano.readMessage(aplayloggamesuielement[k]);
                    e = aplayloggamesuielement;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (e != null && e.length > 0)
            {
                for (int i = 0; i < e.length; i++)
                {
                    PlaylogGamesUiElement playloggamesuielement = e[i];
                    if (playloggamesuielement != null)
                    {
                        codedoutputbytebuffernano.writeMessage(1, playloggamesuielement);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogGamesUiElementPath()
        {
            e = PlaylogGamesUiElement.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class PlaylogGamesVideoAction extends MessageNano
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
                if (!(obj instanceof PlaylogGamesVideoAction))
                {
                    return false;
                }
                obj = (PlaylogGamesVideoAction)obj;
                if (recordingState != ((PlaylogGamesVideoAction) (obj)).recordingState)
                {
                    return false;
                }
                if (statusCode != ((PlaylogGamesVideoAction) (obj)).statusCode)
                {
                    return false;
                }
                if (uiState != ((PlaylogGamesVideoAction) (obj)).uiState)
                {
                    return false;
                }
                if (isCameraAvailable != ((PlaylogGamesVideoAction) (obj)).isCameraAvailable)
                {
                    return false;
                }
                if (isCameraEnabled != ((PlaylogGamesVideoAction) (obj)).isCameraEnabled)
                {
                    return false;
                }
                if (isMicAvailable != ((PlaylogGamesVideoAction) (obj)).isMicAvailable)
                {
                    return false;
                }
                if (isMicEnabled != ((PlaylogGamesVideoAction) (obj)).isMicEnabled)
                {
                    return false;
                }
                if (Float.floatToIntBits(profiledRecordingDurationSeconds) != Float.floatToIntBits(((PlaylogGamesVideoAction) (obj)).profiledRecordingDurationSeconds))
                {
                    return false;
                }
                if (Float.floatToIntBits(profiledCaptureFramesPerSecond) != Float.floatToIntBits(((PlaylogGamesVideoAction) (obj)).profiledCaptureFramesPerSecond))
                {
                    return false;
                }
                if (Float.floatToIntBits(profiledVideoFramesPerSecond) != Float.floatToIntBits(((PlaylogGamesVideoAction) (obj)).profiledVideoFramesPerSecond))
                {
                    return false;
                }
                if (profiledVideoWidth != ((PlaylogGamesVideoAction) (obj)).profiledVideoWidth)
                {
                    return false;
                }
                if (profiledVideoHeight != ((PlaylogGamesVideoAction) (obj)).profiledVideoHeight)
                {
                    return false;
                }
                if (profiledVideoBitrate != ((PlaylogGamesVideoAction) (obj)).profiledVideoBitrate)
                {
                    return false;
                }
                if (profiledAudioChannels != ((PlaylogGamesVideoAction) (obj)).profiledAudioChannels)
                {
                    return false;
                }
                if (profiledAudioSampleRate != ((PlaylogGamesVideoAction) (obj)).profiledAudioSampleRate)
                {
                    return false;
                }
                if (profiledAudioBitrate != ((PlaylogGamesVideoAction) (obj)).profiledAudioBitrate)
                {
                    return false;
                }
                if (profiledFileSizeBytes != ((PlaylogGamesVideoAction) (obj)).profiledFileSizeBytes)
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
        //                       0: 168
        //                       8: 170
        //                       16: 231
        //                       24: 242
        //                       32: 323
        //                       40: 334
        //                       48: 345
        //                       56: 356
        //                       69: 367
        //                       77: 381
        //                       85: 395
        //                       88: 409
        //                       96: 420
        //                       104: 431
        //                       112: 442
        //                       120: 453
        //                       128: 464
        //                       136: 475;
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

        public PlaylogGamesVideoAction()
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

    public static final class PlaylogNearbyConnectionsSession extends MessageNano
    {

        public String advertisedServiceId;
        public String discoveredServiceIds[];
        public String discoveryServiceIds[];
        public int numConnectionRequestsAccepted;
        public int numConnectionRequestsReceived;
        public int numConnectionRequestsRejected;
        public int numConnectionRequestsSent;
        public int numReliableMessagesReceived;
        public int numReliableMessagesSent;
        public int numUnreliableMessagesReceived;
        public int numUnreliableMessagesSent;
        public long sessionDurationMillis;

        protected final int computeSerializedSize()
        {
            int i = super.computeSerializedSize();
            int j = i;
            if (sessionDurationMillis != 0L)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(1, sessionDurationMillis);
            }
            i = j;
            if (!advertisedServiceId.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(2, advertisedServiceId);
            }
            j = i;
            if (discoveryServiceIds != null)
            {
                j = i;
                if (discoveryServiceIds.length > 0)
                {
                    int k1 = 0;
                    int k = 0;
                    for (j = 0; j < discoveryServiceIds.length;)
                    {
                        String s = discoveryServiceIds[j];
                        int i2 = k1;
                        int i1 = k;
                        if (s != null)
                        {
                            i2 = k1 + 1;
                            i1 = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                        }
                        j++;
                        k1 = i2;
                        k = i1;
                    }

                    j = i + k + k1 * 1;
                }
            }
            i = j;
            if (discoveredServiceIds != null)
            {
                i = j;
                if (discoveredServiceIds.length > 0)
                {
                    int l1 = 0;
                    int l = 0;
                    for (i = 0; i < discoveredServiceIds.length;)
                    {
                        String s1 = discoveredServiceIds[i];
                        int j2 = l1;
                        int j1 = l;
                        if (s1 != null)
                        {
                            j2 = l1 + 1;
                            j1 = l + CodedOutputByteBufferNano.computeStringSizeNoTag(s1);
                        }
                        i++;
                        l1 = j2;
                        l = j1;
                    }

                    i = j + l + l1 * 1;
                }
            }
            j = i;
            if (numConnectionRequestsSent != 0)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(5, numConnectionRequestsSent);
            }
            i = j;
            if (numConnectionRequestsReceived != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(6, numConnectionRequestsReceived);
            }
            j = i;
            if (numConnectionRequestsAccepted != 0)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(7, numConnectionRequestsAccepted);
            }
            i = j;
            if (numConnectionRequestsRejected != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(8, numConnectionRequestsRejected);
            }
            j = i;
            if (numReliableMessagesSent != 0)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(9, numReliableMessagesSent);
            }
            i = j;
            if (numReliableMessagesReceived != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(10, numReliableMessagesReceived);
            }
            j = i;
            if (numUnreliableMessagesSent != 0)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(11, numUnreliableMessagesSent);
            }
            i = j;
            if (numUnreliableMessagesReceived != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(12, numUnreliableMessagesReceived);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogNearbyConnectionsSession))
                {
                    return false;
                }
                obj = (PlaylogNearbyConnectionsSession)obj;
                if (sessionDurationMillis != ((PlaylogNearbyConnectionsSession) (obj)).sessionDurationMillis)
                {
                    return false;
                }
                if (advertisedServiceId == null)
                {
                    if (((PlaylogNearbyConnectionsSession) (obj)).advertisedServiceId != null)
                    {
                        return false;
                    }
                } else
                if (!advertisedServiceId.equals(((PlaylogNearbyConnectionsSession) (obj)).advertisedServiceId))
                {
                    return false;
                }
                if (!InternalNano.equals(discoveryServiceIds, ((PlaylogNearbyConnectionsSession) (obj)).discoveryServiceIds))
                {
                    return false;
                }
                if (!InternalNano.equals(discoveredServiceIds, ((PlaylogNearbyConnectionsSession) (obj)).discoveredServiceIds))
                {
                    return false;
                }
                if (numConnectionRequestsSent != ((PlaylogNearbyConnectionsSession) (obj)).numConnectionRequestsSent)
                {
                    return false;
                }
                if (numConnectionRequestsReceived != ((PlaylogNearbyConnectionsSession) (obj)).numConnectionRequestsReceived)
                {
                    return false;
                }
                if (numConnectionRequestsAccepted != ((PlaylogNearbyConnectionsSession) (obj)).numConnectionRequestsAccepted)
                {
                    return false;
                }
                if (numConnectionRequestsRejected != ((PlaylogNearbyConnectionsSession) (obj)).numConnectionRequestsRejected)
                {
                    return false;
                }
                if (numReliableMessagesSent != ((PlaylogNearbyConnectionsSession) (obj)).numReliableMessagesSent)
                {
                    return false;
                }
                if (numReliableMessagesReceived != ((PlaylogNearbyConnectionsSession) (obj)).numReliableMessagesReceived)
                {
                    return false;
                }
                if (numUnreliableMessagesSent != ((PlaylogNearbyConnectionsSession) (obj)).numUnreliableMessagesSent)
                {
                    return false;
                }
                if (numUnreliableMessagesReceived != ((PlaylogNearbyConnectionsSession) (obj)).numUnreliableMessagesReceived)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int j = getClass().getName().hashCode();
            int k = (int)(sessionDurationMillis ^ sessionDurationMillis >>> 32);
            int i;
            if (advertisedServiceId == null)
            {
                i = 0;
            } else
            {
                i = advertisedServiceId.hashCode();
            }
            return ((((((((((((j + 527) * 31 + k) * 31 + i) * 31 + InternalNano.hashCode(discoveryServiceIds)) * 31 + InternalNano.hashCode(discoveredServiceIds)) * 31 + numConnectionRequestsSent) * 31 + numConnectionRequestsReceived) * 31 + numConnectionRequestsAccepted) * 31 + numConnectionRequestsRejected) * 31 + numReliableMessagesSent) * 31 + numReliableMessagesReceived) * 31 + numUnreliableMessagesSent) * 31 + numUnreliableMessagesReceived;
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
                    sessionDurationMillis = codedinputbytebuffernano.readRawVarint64();
                    break;

                case 18: // '\022'
                    advertisedServiceId = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                    String as[];
                    int j;
                    if (discoveryServiceIds == null)
                    {
                        j = 0;
                    } else
                    {
                        j = discoveryServiceIds.length;
                    }
                    as = new String[l + j];
                    l = j;
                    if (j != 0)
                    {
                        System.arraycopy(discoveryServiceIds, 0, as, 0, j);
                        l = j;
                    }
                    for (; l < as.length - 1; l++)
                    {
                        as[l] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as[l] = codedinputbytebuffernano.readString();
                    discoveryServiceIds = as;
                    break;

                case 34: // '"'
                    int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                    String as1[];
                    int k;
                    if (discoveredServiceIds == null)
                    {
                        k = 0;
                    } else
                    {
                        k = discoveredServiceIds.length;
                    }
                    as1 = new String[i1 + k];
                    i1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(discoveredServiceIds, 0, as1, 0, k);
                        i1 = k;
                    }
                    for (; i1 < as1.length - 1; i1++)
                    {
                        as1[i1] = codedinputbytebuffernano.readString();
                        codedinputbytebuffernano.readTag();
                    }

                    as1[i1] = codedinputbytebuffernano.readString();
                    discoveredServiceIds = as1;
                    break;

                case 40: // '('
                    numConnectionRequestsSent = codedinputbytebuffernano.readRawVarint32();
                    break;

                case 48: // '0'
                    numConnectionRequestsReceived = codedinputbytebuffernano.readRawVarint32();
                    break;

                case 56: // '8'
                    numConnectionRequestsAccepted = codedinputbytebuffernano.readRawVarint32();
                    break;

                case 64: // '@'
                    numConnectionRequestsRejected = codedinputbytebuffernano.readRawVarint32();
                    break;

                case 72: // 'H'
                    numReliableMessagesSent = codedinputbytebuffernano.readRawVarint32();
                    break;

                case 80: // 'P'
                    numReliableMessagesReceived = codedinputbytebuffernano.readRawVarint32();
                    break;

                case 88: // 'X'
                    numUnreliableMessagesSent = codedinputbytebuffernano.readRawVarint32();
                    break;

                case 96: // '`'
                    numUnreliableMessagesReceived = codedinputbytebuffernano.readRawVarint32();
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (sessionDurationMillis != 0L)
            {
                codedoutputbytebuffernano.writeInt64(1, sessionDurationMillis);
            }
            if (!advertisedServiceId.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, advertisedServiceId);
            }
            if (discoveryServiceIds != null && discoveryServiceIds.length > 0)
            {
                for (int i = 0; i < discoveryServiceIds.length; i++)
                {
                    String s = discoveryServiceIds[i];
                    if (s != null)
                    {
                        codedoutputbytebuffernano.writeString(3, s);
                    }
                }

            }
            if (discoveredServiceIds != null && discoveredServiceIds.length > 0)
            {
                for (int j = 0; j < discoveredServiceIds.length; j++)
                {
                    String s1 = discoveredServiceIds[j];
                    if (s1 != null)
                    {
                        codedoutputbytebuffernano.writeString(4, s1);
                    }
                }

            }
            if (numConnectionRequestsSent != 0)
            {
                codedoutputbytebuffernano.writeInt32(5, numConnectionRequestsSent);
            }
            if (numConnectionRequestsReceived != 0)
            {
                codedoutputbytebuffernano.writeInt32(6, numConnectionRequestsReceived);
            }
            if (numConnectionRequestsAccepted != 0)
            {
                codedoutputbytebuffernano.writeInt32(7, numConnectionRequestsAccepted);
            }
            if (numConnectionRequestsRejected != 0)
            {
                codedoutputbytebuffernano.writeInt32(8, numConnectionRequestsRejected);
            }
            if (numReliableMessagesSent != 0)
            {
                codedoutputbytebuffernano.writeInt32(9, numReliableMessagesSent);
            }
            if (numReliableMessagesReceived != 0)
            {
                codedoutputbytebuffernano.writeInt32(10, numReliableMessagesReceived);
            }
            if (numUnreliableMessagesSent != 0)
            {
                codedoutputbytebuffernano.writeInt32(11, numUnreliableMessagesSent);
            }
            if (numUnreliableMessagesReceived != 0)
            {
                codedoutputbytebuffernano.writeInt32(12, numUnreliableMessagesReceived);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogNearbyConnectionsSession()
        {
            sessionDurationMillis = 0L;
            advertisedServiceId = "";
            discoveryServiceIds = WireFormatNano.EMPTY_STRING_ARRAY;
            discoveredServiceIds = WireFormatNano.EMPTY_STRING_ARRAY;
            numConnectionRequestsSent = 0;
            numConnectionRequestsReceived = 0;
            numConnectionRequestsAccepted = 0;
            numConnectionRequestsRejected = 0;
            numReliableMessagesSent = 0;
            numReliableMessagesReceived = 0;
            numUnreliableMessagesSent = 0;
            numUnreliableMessagesReceived = 0;
            cachedSize = -1;
        }
    }

    public static final class PlaylogPlusUpgrade extends MessageNano
    {

        public int resultCode;
        public int upgradeSource;
        public int upgradeStep;
        public int upgradeSubSource;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (upgradeStep != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, upgradeStep);
            }
            j = i;
            if (upgradeSource != 0)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(2, upgradeSource);
            }
            i = j;
            if (upgradeSubSource != 0)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(3, upgradeSubSource);
            }
            j = i;
            if (resultCode != 0)
            {
                j = i + CodedOutputByteBufferNano.computeInt32Size(4, resultCode);
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogPlusUpgrade))
                {
                    return false;
                }
                obj = (PlaylogPlusUpgrade)obj;
                if (upgradeStep != ((PlaylogPlusUpgrade) (obj)).upgradeStep)
                {
                    return false;
                }
                if (upgradeSource != ((PlaylogPlusUpgrade) (obj)).upgradeSource)
                {
                    return false;
                }
                if (upgradeSubSource != ((PlaylogPlusUpgrade) (obj)).upgradeSubSource)
                {
                    return false;
                }
                if (resultCode != ((PlaylogPlusUpgrade) (obj)).resultCode)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return ((((getClass().getName().hashCode() + 527) * 31 + upgradeStep) * 31 + upgradeSource) * 31 + upgradeSubSource) * 31 + resultCode;
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L7:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 5: default 56
        //                       0: 64
        //                       8: 66
        //                       16: 123
        //                       24: 223
        //                       32: 234;
               goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L7; else goto _L2
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
                upgradeStep = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
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
            case 12: // '\f'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
                upgradeSource = k;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L5:
            upgradeSubSource = codedinputbytebuffernano.readRawVarint32();
            continue; /* Loop/switch isn't completed */
_L6:
            resultCode = codedinputbytebuffernano.readRawVarint32();
            if (true) goto _L7; else goto _L8
_L8:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (upgradeStep != 0)
            {
                codedoutputbytebuffernano.writeInt32(1, upgradeStep);
            }
            if (upgradeSource != 0)
            {
                codedoutputbytebuffernano.writeInt32(2, upgradeSource);
            }
            if (upgradeSubSource != 0)
            {
                codedoutputbytebuffernano.writeInt32(3, upgradeSubSource);
            }
            if (resultCode != 0)
            {
                codedoutputbytebuffernano.writeInt32(4, resultCode);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogPlusUpgrade()
        {
            upgradeStep = 0;
            upgradeSource = 0;
            upgradeSubSource = 0;
            resultCode = 0;
            cachedSize = -1;
        }
    }

    public static final class PlaylogRtmpWaitingRoomSession extends MessageNano
    {

        public RtmpWaitingRoomEvent events[];
        public long onStopTimeMs;
        public int resultCode;
        public String roomId;
        public long sessionStartTimeMs;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (!roomId.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(1, roomId);
            }
            j = i;
            if (sessionStartTimeMs != 0L)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(2, sessionStartTimeMs);
            }
            int l = j;
            if (resultCode != 0)
            {
                l = j + CodedOutputByteBufferNano.computeInt32Size(3, resultCode);
            }
            i = l;
            if (onStopTimeMs != 0L)
            {
                i = l + CodedOutputByteBufferNano.computeInt64Size(4, onStopTimeMs);
            }
            l = i;
            if (events != null)
            {
                l = i;
                if (events.length > 0)
                {
                    int k = 0;
                    do
                    {
                        l = i;
                        if (k >= events.length)
                        {
                            break;
                        }
                        RtmpWaitingRoomEvent rtmpwaitingroomevent = events[k];
                        l = i;
                        if (rtmpwaitingroomevent != null)
                        {
                            l = i + CodedOutputByteBufferNano.computeMessageSize(5, rtmpwaitingroomevent);
                        }
                        k++;
                        i = l;
                    } while (true);
                }
            }
            return l;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogRtmpWaitingRoomSession))
                {
                    return false;
                }
                obj = (PlaylogRtmpWaitingRoomSession)obj;
                if (roomId == null)
                {
                    if (((PlaylogRtmpWaitingRoomSession) (obj)).roomId != null)
                    {
                        return false;
                    }
                } else
                if (!roomId.equals(((PlaylogRtmpWaitingRoomSession) (obj)).roomId))
                {
                    return false;
                }
                if (sessionStartTimeMs != ((PlaylogRtmpWaitingRoomSession) (obj)).sessionStartTimeMs)
                {
                    return false;
                }
                if (resultCode != ((PlaylogRtmpWaitingRoomSession) (obj)).resultCode)
                {
                    return false;
                }
                if (onStopTimeMs != ((PlaylogRtmpWaitingRoomSession) (obj)).onStopTimeMs)
                {
                    return false;
                }
                if (!InternalNano.equals(events, ((PlaylogRtmpWaitingRoomSession) (obj)).events))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            int j = getClass().getName().hashCode();
            int i;
            if (roomId == null)
            {
                i = 0;
            } else
            {
                i = roomId.hashCode();
            }
            return (((((j + 527) * 31 + i) * 31 + (int)(sessionStartTimeMs ^ sessionStartTimeMs >>> 32)) * 31 + resultCode) * 31 + (int)(onStopTimeMs ^ onStopTimeMs >>> 32)) * 31 + InternalNano.hashCode(events);
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
                    roomId = codedinputbytebuffernano.readString();
                    break;

                case 16: // '\020'
                    sessionStartTimeMs = codedinputbytebuffernano.readRawVarint64();
                    break;

                case 24: // '\030'
                    resultCode = codedinputbytebuffernano.readRawVarint32();
                    break;

                case 32: // ' '
                    onStopTimeMs = codedinputbytebuffernano.readRawVarint64();
                    break;

                case 42: // '*'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
                    RtmpWaitingRoomEvent artmpwaitingroomevent[];
                    int j;
                    if (events == null)
                    {
                        j = 0;
                    } else
                    {
                        j = events.length;
                    }
                    artmpwaitingroomevent = new RtmpWaitingRoomEvent[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(events, 0, artmpwaitingroomevent, 0, j);
                        k = j;
                    }
                    for (; k < artmpwaitingroomevent.length - 1; k++)
                    {
                        artmpwaitingroomevent[k] = new RtmpWaitingRoomEvent();
                        codedinputbytebuffernano.readMessage(artmpwaitingroomevent[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    artmpwaitingroomevent[k] = new RtmpWaitingRoomEvent();
                    codedinputbytebuffernano.readMessage(artmpwaitingroomevent[k]);
                    events = artmpwaitingroomevent;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (!roomId.equals(""))
            {
                codedoutputbytebuffernano.writeString(1, roomId);
            }
            if (sessionStartTimeMs != 0L)
            {
                codedoutputbytebuffernano.writeInt64(2, sessionStartTimeMs);
            }
            if (resultCode != 0)
            {
                codedoutputbytebuffernano.writeInt32(3, resultCode);
            }
            if (onStopTimeMs != 0L)
            {
                codedoutputbytebuffernano.writeInt64(4, onStopTimeMs);
            }
            if (events != null && events.length > 0)
            {
                for (int i = 0; i < events.length; i++)
                {
                    RtmpWaitingRoomEvent rtmpwaitingroomevent = events[i];
                    if (rtmpwaitingroomevent != null)
                    {
                        codedoutputbytebuffernano.writeMessage(5, rtmpwaitingroomevent);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogRtmpWaitingRoomSession()
        {
            roomId = "";
            sessionStartTimeMs = 0L;
            resultCode = 0;
            onStopTimeMs = 0L;
            events = RtmpWaitingRoomEvent.emptyArray();
            cachedSize = -1;
        }
    }

    public static final class PlaylogRtmpWaitingRoomSession.RtmpWaitingRoomEvent extends MessageNano
    {

        private static volatile PlaylogRtmpWaitingRoomSession.RtmpWaitingRoomEvent _emptyArray[];
        public long deltaMs;
        public int eventType;

        public static PlaylogRtmpWaitingRoomSession.RtmpWaitingRoomEvent[] emptyArray()
        {
            if (_emptyArray == null)
            {
                synchronized (InternalNano.LAZY_INIT_LOCK)
                {
                    if (_emptyArray == null)
                    {
                        _emptyArray = new PlaylogRtmpWaitingRoomSession.RtmpWaitingRoomEvent[0];
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
            if (eventType != 1)
            {
                i = j + CodedOutputByteBufferNano.computeInt32Size(1, eventType);
            }
            j = i;
            if (deltaMs != 0L)
            {
                j = i + CodedOutputByteBufferNano.computeInt64Size(4, deltaMs);
            }
            return j;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof PlaylogRtmpWaitingRoomSession.RtmpWaitingRoomEvent))
                {
                    return false;
                }
                obj = (PlaylogRtmpWaitingRoomSession.RtmpWaitingRoomEvent)obj;
                if (eventType != ((PlaylogRtmpWaitingRoomSession.RtmpWaitingRoomEvent) (obj)).eventType)
                {
                    return false;
                }
                if (deltaMs != ((PlaylogRtmpWaitingRoomSession.RtmpWaitingRoomEvent) (obj)).deltaMs)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return ((getClass().getName().hashCode() + 527) * 31 + eventType) * 31 + (int)(deltaMs ^ deltaMs >>> 32);
        }

        public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
            throws IOException
        {
_L5:
            int i = codedinputbytebuffernano.readTag();
            i;
            JVM INSTR lookupswitch 3: default 40
        //                       0: 48
        //                       8: 50
        //                       32: 87;
               goto _L1 _L2 _L3 _L4
_L1:
            if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L5; else goto _L2
_L2:
            return this;
_L3:
            int j = codedinputbytebuffernano.readRawVarint32();
            switch (j)
            {
            case 1: // '\001'
                eventType = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            deltaMs = codedinputbytebuffernano.readRawVarint64();
            if (true) goto _L5; else goto _L6
_L6:
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (eventType != 1)
            {
                codedoutputbytebuffernano.writeInt32(1, eventType);
            }
            if (deltaMs != 0L)
            {
                codedoutputbytebuffernano.writeInt64(4, deltaMs);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public PlaylogRtmpWaitingRoomSession.RtmpWaitingRoomEvent()
        {
            eventType = 1;
            deltaMs = 0L;
            cachedSize = -1;
        }
    }

}
