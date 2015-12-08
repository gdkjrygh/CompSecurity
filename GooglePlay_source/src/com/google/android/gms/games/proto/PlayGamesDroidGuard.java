// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface PlayGamesDroidGuard
{
    public static final class DroidGuardSubmittedScore extends MessageNano
    {

        public String externalGameId;
        public String externalLeaderboardId;
        public String packageName;
        public String scoreTag;
        public long scoreValue;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (scoreValue != 0L)
            {
                i = j + CodedOutputByteBufferNano.computeInt64Size(1, scoreValue);
            }
            j = i;
            if (!externalLeaderboardId.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(2, externalLeaderboardId);
            }
            i = j;
            if (!externalGameId.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(3, externalGameId);
            }
            j = i;
            if (!packageName.equals(""))
            {
                j = i + CodedOutputByteBufferNano.computeStringSize(4, packageName);
            }
            i = j;
            if (!scoreTag.equals(""))
            {
                i = j + CodedOutputByteBufferNano.computeStringSize(5, scoreTag);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (!(obj instanceof DroidGuardSubmittedScore))
            {
                return false;
            }
            obj = (DroidGuardSubmittedScore)obj;
            if (scoreValue != ((DroidGuardSubmittedScore) (obj)).scoreValue)
            {
                return false;
            }
            if (externalLeaderboardId == null)
            {
                if (((DroidGuardSubmittedScore) (obj)).externalLeaderboardId != null)
                {
                    return false;
                }
            } else
            if (!externalLeaderboardId.equals(((DroidGuardSubmittedScore) (obj)).externalLeaderboardId))
            {
                return false;
            }
            if (externalGameId == null)
            {
                if (((DroidGuardSubmittedScore) (obj)).externalGameId != null)
                {
                    return false;
                }
            } else
            if (!externalGameId.equals(((DroidGuardSubmittedScore) (obj)).externalGameId))
            {
                return false;
            }
            if (packageName == null)
            {
                if (((DroidGuardSubmittedScore) (obj)).packageName != null)
                {
                    return false;
                }
            } else
            if (!packageName.equals(((DroidGuardSubmittedScore) (obj)).packageName))
            {
                return false;
            }
            if (scoreTag != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((DroidGuardSubmittedScore) (obj)).scoreTag == null) goto _L1; else goto _L3
_L3:
            return false;
            if (scoreTag.equals(((DroidGuardSubmittedScore) (obj)).scoreTag)) goto _L1; else goto _L4
_L4:
            return false;
        }

        public final int hashCode()
        {
            int l = 0;
            int i1 = getClass().getName().hashCode();
            int j1 = (int)(scoreValue ^ scoreValue >>> 32);
            int i;
            int j;
            int k;
            if (externalLeaderboardId == null)
            {
                i = 0;
            } else
            {
                i = externalLeaderboardId.hashCode();
            }
            if (externalGameId == null)
            {
                j = 0;
            } else
            {
                j = externalGameId.hashCode();
            }
            if (packageName == null)
            {
                k = 0;
            } else
            {
                k = packageName.hashCode();
            }
            if (scoreTag != null)
            {
                l = scoreTag.hashCode();
            }
            return (((((i1 + 527) * 31 + j1) * 31 + i) * 31 + j) * 31 + k) * 31 + l;
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
                    scoreValue = codedinputbytebuffernano.readRawVarint64();
                    break;

                case 18: // '\022'
                    externalLeaderboardId = codedinputbytebuffernano.readString();
                    break;

                case 26: // '\032'
                    externalGameId = codedinputbytebuffernano.readString();
                    break;

                case 34: // '"'
                    packageName = codedinputbytebuffernano.readString();
                    break;

                case 42: // '*'
                    scoreTag = codedinputbytebuffernano.readString();
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (scoreValue != 0L)
            {
                codedoutputbytebuffernano.writeInt64(1, scoreValue);
            }
            if (!externalLeaderboardId.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, externalLeaderboardId);
            }
            if (!externalGameId.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, externalGameId);
            }
            if (!packageName.equals(""))
            {
                codedoutputbytebuffernano.writeString(4, packageName);
            }
            if (!scoreTag.equals(""))
            {
                codedoutputbytebuffernano.writeString(5, scoreTag);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public DroidGuardSubmittedScore()
        {
            scoreValue = 0L;
            externalLeaderboardId = "";
            externalGameId = "";
            packageName = "";
            scoreTag = "";
            cachedSize = -1;
        }
    }

    public static final class GamesDroidGuardSignedData extends MessageNano
    {

        public DroidGuardSubmittedScore submittedScore;

        protected final int computeSerializedSize()
        {
            int j = super.computeSerializedSize();
            int i = j;
            if (submittedScore != null)
            {
                i = j + CodedOutputByteBufferNano.computeMessageSize(1, submittedScore);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            if (obj != this) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (!(obj instanceof GamesDroidGuardSignedData))
            {
                return false;
            }
            obj = (GamesDroidGuardSignedData)obj;
            if (submittedScore != null)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((GamesDroidGuardSignedData) (obj)).submittedScore == null) goto _L1; else goto _L3
_L3:
            return false;
            if (submittedScore.equals(((GamesDroidGuardSignedData) (obj)).submittedScore)) goto _L1; else goto _L4
_L4:
            return false;
        }

        public final int hashCode()
        {
            int j = getClass().getName().hashCode();
            int i;
            if (submittedScore == null)
            {
                i = 0;
            } else
            {
                i = submittedScore.hashCode();
            }
            return i + (j + 527) * 31;
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
                    if (submittedScore == null)
                    {
                        submittedScore = new DroidGuardSubmittedScore();
                    }
                    codedinputbytebuffernano.readMessage(submittedScore);
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (submittedScore != null)
            {
                codedoutputbytebuffernano.writeMessage(1, submittedScore);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public GamesDroidGuardSignedData()
        {
            submittedScore = null;
            cachedSize = -1;
        }
    }

}
