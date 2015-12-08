// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.people.proto;

import com.google.protobuf.micro.CodedInputStreamMicro;
import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.MessageMicro;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.common.people.proto:
//            AclProto

public static final class cachedSize extends MessageMicro
{

    private int applicationId_;
    private int cachedSize;
    private boolean hasApplicationId;
    private boolean hasItemId;
    private String itemId_;

    public final int getCachedSize()
    {
        if (cachedSize < 0)
        {
            getSerializedSize();
        }
        return cachedSize;
    }

    public final int getSerializedSize()
    {
        int i = 0;
        if (hasApplicationId)
        {
            i = CodedOutputStreamMicro.computeInt32Size(1, applicationId_) + 0;
        }
        int j = i;
        if (hasItemId)
        {
            j = i + CodedOutputStreamMicro.computeStringSize(2, itemId_);
        }
        cachedSize = j;
        return j;
    }

    public final volatile MessageMicro mergeFrom(CodedInputStreamMicro codedinputstreammicro)
        throws IOException
    {
        do
        {
            int i = codedinputstreammicro.readTag();
            switch (i)
            {
            default:
                if (codedinputstreammicro.skipField(i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                int j = codedinputstreammicro.readRawVarint32();
                hasApplicationId = true;
                applicationId_ = j;
                break;

            case 18: // '\022'
                String s = codedinputstreammicro.readString();
                hasItemId = true;
                itemId_ = s;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputStreamMicro codedoutputstreammicro)
        throws IOException
    {
        if (hasApplicationId)
        {
            codedoutputstreammicro.writeInt32(1, applicationId_);
        }
        if (hasItemId)
        {
            codedoutputstreammicro.writeString(2, itemId_);
        }
    }

    public ()
    {
        applicationId_ = 1;
        itemId_ = "";
        cachedSize = -1;
    }
}
