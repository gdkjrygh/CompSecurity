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

    private int cachedSize;
    public String circleId_;
    public int groupType_;
    public boolean hasCircleId;
    public boolean hasGroupType;
    private boolean hasPersonId;
    public emberId personId_;

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
        int j = 0;
        if (hasPersonId)
        {
            j = CodedOutputStreamMicro.computeMessageSize(1, personId_) + 0;
        }
        int i = j;
        if (hasCircleId)
        {
            i = j + CodedOutputStreamMicro.computeStringSize(2, circleId_);
        }
        j = i;
        if (hasGroupType)
        {
            j = i + CodedOutputStreamMicro.computeInt32Size(3, groupType_);
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

            case 10: // '\n'
                emberId emberid = new emberId();
                codedinputstreammicro.readMessage(emberid);
                setPersonId(emberid);
                break;

            case 18: // '\022'
                setCircleId(codedinputstreammicro.readString());
                break;

            case 24: // '\030'
                setGroupType(codedinputstreammicro.readRawVarint32());
                break;
            }
        } while (true);
    }

    public final setGroupType setCircleId(String s)
    {
        hasCircleId = true;
        circleId_ = s;
        return this;
    }

    public final circleId_ setGroupType(int i)
    {
        hasGroupType = true;
        groupType_ = i;
        return this;
    }

    public final emberId setPersonId(emberId emberid)
    {
        hasPersonId = true;
        personId_ = emberid;
        return this;
    }

    public final void writeTo(CodedOutputStreamMicro codedoutputstreammicro)
        throws IOException
    {
        if (hasPersonId)
        {
            codedoutputstreammicro.writeMessage(1, personId_);
        }
        if (hasCircleId)
        {
            codedoutputstreammicro.writeString(2, circleId_);
        }
        if (hasGroupType)
        {
            codedoutputstreammicro.writeInt32(3, groupType_);
        }
    }

    public emberId()
    {
        personId_ = null;
        circleId_ = "";
        groupType_ = 1;
        cachedSize = -1;
    }
}
