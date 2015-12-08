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

    private int cachedSize;
    private boolean hasRequiredScopeId;
    private d requiredScopeId_;
    private List sharingTargetId_;

    public final d addSharingTargetId(d d)
    {
        if (sharingTargetId_.isEmpty())
        {
            sharingTargetId_ = new ArrayList();
        }
        sharingTargetId_.add(d);
        return this;
    }

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
        for (Iterator iterator = sharingTargetId_.iterator(); iterator.hasNext();)
        {
            i += CodedOutputStreamMicro.computeMessageSize(1, (d)iterator.next());
        }

        int j = i;
        if (hasRequiredScopeId)
        {
            j = i + CodedOutputStreamMicro.computeMessageSize(2, requiredScopeId_);
        }
        cachedSize = j;
        return j;
    }

    public final d getSharingTargetId(int i)
    {
        return (d)sharingTargetId_.get(i);
    }

    public final int getSharingTargetIdCount()
    {
        return sharingTargetId_.size();
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
                d d = new d();
                codedinputstreammicro.readMessage(d);
                addSharingTargetId(d);
                break;

            case 18: // '\022'
                d d1 = new d();
                codedinputstreammicro.readMessage(d1);
                hasRequiredScopeId = true;
                requiredScopeId_ = d1;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputStreamMicro codedoutputstreammicro)
        throws IOException
    {
        for (Iterator iterator = sharingTargetId_.iterator(); iterator.hasNext(); codedoutputstreammicro.writeMessage(1, (d)iterator.next())) { }
        if (hasRequiredScopeId)
        {
            codedoutputstreammicro.writeMessage(2, requiredScopeId_);
        }
    }

    public d()
    {
        sharingTargetId_ = Collections.emptyList();
        requiredScopeId_ = null;
        cachedSize = -1;
    }
}
