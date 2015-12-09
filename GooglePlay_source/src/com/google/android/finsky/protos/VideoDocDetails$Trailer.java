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
//            VideoDocDetails

public static final class cachedSize extends MessageNano
{

    private static volatile duration _emptyArray[];
    public String duration;
    public boolean hasDuration;
    public boolean hasThumbnailUrl;
    public boolean hasTitle;
    public boolean hasTrailerId;
    public boolean hasWatchUrl;
    public String thumbnailUrl;
    public String title;
    public String trailerId;
    public String watchUrl;

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
            if (!hasTrailerId)
            {
                i = j;
                if (trailerId.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, trailerId);
        }
        int k;
label1:
        {
            if (!hasTitle)
            {
                k = i;
                if (title.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, title);
        }
label2:
        {
            if (!hasThumbnailUrl)
            {
                i = k;
                if (thumbnailUrl.equals(""))
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(3, thumbnailUrl);
        }
label3:
        {
            if (!hasWatchUrl)
            {
                k = i;
                if (watchUrl.equals(""))
                {
                    break label3;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(4, watchUrl);
        }
label4:
        {
            if (!hasDuration)
            {
                i = k;
                if (duration.equals(""))
                {
                    break label4;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(5, duration);
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
                trailerId = codedinputbytebuffernano.readString();
                hasTrailerId = true;
                break;

            case 18: // '\022'
                title = codedinputbytebuffernano.readString();
                hasTitle = true;
                break;

            case 26: // '\032'
                thumbnailUrl = codedinputbytebuffernano.readString();
                hasThumbnailUrl = true;
                break;

            case 34: // '"'
                watchUrl = codedinputbytebuffernano.readString();
                hasWatchUrl = true;
                break;

            case 42: // '*'
                duration = codedinputbytebuffernano.readString();
                hasDuration = true;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasTrailerId || !trailerId.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, trailerId);
        }
        if (hasTitle || !title.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, title);
        }
        if (hasThumbnailUrl || !thumbnailUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, thumbnailUrl);
        }
        if (hasWatchUrl || !watchUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(4, watchUrl);
        }
        if (hasDuration || !duration.equals(""))
        {
            codedoutputbytebuffernano.writeString(5, duration);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        trailerId = "";
        hasTrailerId = false;
        title = "";
        hasTitle = false;
        thumbnailUrl = "";
        hasThumbnailUrl = false;
        watchUrl = "";
        hasWatchUrl = false;
        duration = "";
        hasDuration = false;
        cachedSize = -1;
    }
}
