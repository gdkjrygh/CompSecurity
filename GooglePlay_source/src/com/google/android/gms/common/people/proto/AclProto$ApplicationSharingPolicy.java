// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.people.proto;

import com.google.protobuf.micro.CodedInputStreamMicro;
import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.MessageMicro;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.gms.common.people.proto:
//            AclProto

public static final class cachedSize extends MessageMicro
{

    private boolean allowSquares_;
    private List allowedGroupType_;
    private int applicationId_;
    private int cachedSize;
    private boolean hasAllowSquares;
    private boolean hasApplicationId;
    private boolean hasShowUnderageWarnings;
    private boolean showUnderageWarnings_;

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
        for (Iterator iterator = allowedGroupType_.iterator(); iterator.hasNext();)
        {
            i += CodedOutputStreamMicro.computeInt32SizeNoTag(((Integer)iterator.next()).intValue());
        }

        int j = i + 0 + allowedGroupType_.size() * 1;
        i = j;
        if (hasShowUnderageWarnings)
        {
            i = j + (CodedOutputStreamMicro.computeTagSize(2) + 1);
        }
        j = i;
        if (hasAllowSquares)
        {
            j = i + (CodedOutputStreamMicro.computeTagSize(3) + 1);
        }
        i = j;
        if (hasApplicationId)
        {
            i = j + CodedOutputStreamMicro.computeInt32Size(4, applicationId_);
        }
        cachedSize = i;
        return i;
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
                if (allowedGroupType_.isEmpty())
                {
                    allowedGroupType_ = new ArrayList();
                }
                allowedGroupType_.add(Integer.valueOf(j));
                break;

            case 16: // '\020'
                boolean flag = codedinputstreammicro.readBool();
                hasShowUnderageWarnings = true;
                showUnderageWarnings_ = flag;
                break;

            case 24: // '\030'
                boolean flag1 = codedinputstreammicro.readBool();
                hasAllowSquares = true;
                allowSquares_ = flag1;
                break;

            case 32: // ' '
                int k = codedinputstreammicro.readRawVarint32();
                hasApplicationId = true;
                applicationId_ = k;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputStreamMicro codedoutputstreammicro)
        throws IOException
    {
        for (Iterator iterator = allowedGroupType_.iterator(); iterator.hasNext(); codedoutputstreammicro.writeInt32(1, ((Integer)iterator.next()).intValue())) { }
        if (hasShowUnderageWarnings)
        {
            codedoutputstreammicro.writeBool(2, showUnderageWarnings_);
        }
        if (hasAllowSquares)
        {
            codedoutputstreammicro.writeBool(3, allowSquares_);
        }
        if (hasApplicationId)
        {
            codedoutputstreammicro.writeInt32(4, applicationId_);
        }
    }

    public ()
    {
        applicationId_ = 1;
        allowedGroupType_ = Collections.emptyList();
        showUnderageWarnings_ = true;
        allowSquares_ = true;
        cachedSize = -1;
    }
}
