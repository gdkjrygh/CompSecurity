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
            if (!(obj instanceof unmutedNotificationsAppId))
            {
                return false;
            }
            obj = (unmutedNotificationsAppId)obj;
            if (switchedAccount != ((switchedAccount) (obj)).switchedAccount)
            {
                return false;
            }
            if (mobileNotificationsEnabled != ((mobileNotificationsEnabled) (obj)).mobileNotificationsEnabled)
            {
                return false;
            }
            if (emailNotificationsEnabled != ((emailNotificationsEnabled) (obj)).emailNotificationsEnabled)
            {
                return false;
            }
            if (socialSharingEnabled != ((socialSharingEnabled) (obj)).socialSharingEnabled)
            {
                return false;
            }
            if (!InternalNano.equals(unmutedNotificationsAppId, ((unmutedNotificationsAppId) (obj)).unmutedNotificationsAppId))
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

    public ()
    {
        switchedAccount = false;
        mobileNotificationsEnabled = false;
        emailNotificationsEnabled = false;
        socialSharingEnabled = false;
        unmutedNotificationsAppId = WireFormatNano.EMPTY_STRING_ARRAY;
        cachedSize = -1;
    }
}
