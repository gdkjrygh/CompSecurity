// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            PlusData

public static final class cachedSize extends MessageNano
{

    private static volatile profileImage _emptyArray[];
    public String displayName;
    public boolean hasDisplayName;
    public boolean hasProfileImageUrl;
    public profileImage profileImage;
    public String profileImageUrl;

    public static cachedSize[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (InternalNano.LAZY_INIT_LOCK)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
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
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasDisplayName)
            {
                i = j;
                if (displayName.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(2, displayName);
        }
        int k;
label1:
        {
            if (!hasProfileImageUrl)
            {
                k = i;
                if (profileImageUrl.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(4, profileImageUrl);
        }
        i = k;
        if (profileImage != null)
        {
            i = k + CodedOutputByteBufferNano.computeMessageSize(5, profileImage);
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

            case 18: // '\022'
                displayName = codedinputbytebuffernano.readString();
                hasDisplayName = true;
                break;

            case 34: // '"'
                profileImageUrl = codedinputbytebuffernano.readString();
                hasProfileImageUrl = true;
                break;

            case 42: // '*'
                if (profileImage == null)
                {
                    profileImage = new profileImage();
                }
                codedinputbytebuffernano.readMessage(profileImage);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasDisplayName || !displayName.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, displayName);
        }
        if (hasProfileImageUrl || !profileImageUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(4, profileImageUrl);
        }
        if (profileImage != null)
        {
            codedoutputbytebuffernano.writeMessage(5, profileImage);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        displayName = "";
        hasDisplayName = false;
        profileImageUrl = "";
        hasProfileImageUrl = false;
        profileImage = null;
        cachedSize = -1;
    }
}
