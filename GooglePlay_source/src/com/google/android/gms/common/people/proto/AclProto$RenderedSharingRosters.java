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

    private List applicationPolicies_;
    private int cachedSize;
    public List resourceSharingRosters_;
    public List targets_;

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
        for (Iterator iterator = resourceSharingRosters_.iterator(); iterator.hasNext();)
        {
            i += CodedOutputStreamMicro.computeMessageSize(1, (resourceSharingRosters_)iterator.next());
        }

        for (Iterator iterator1 = applicationPolicies_.iterator(); iterator1.hasNext();)
        {
            i += CodedOutputStreamMicro.computeMessageSize(2, (y)iterator1.next());
        }

        for (Iterator iterator2 = targets_.iterator(); iterator2.hasNext();)
        {
            i += CodedOutputStreamMicro.computeMessageSize(3, (targets_)iterator2.next());
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

            case 10: // '\n'
                cachedSize cachedsize = new init>();
                codedinputstreammicro.readMessage(cachedsize);
                if (resourceSharingRosters_.isEmpty())
                {
                    resourceSharingRosters_ = new ArrayList();
                }
                resourceSharingRosters_.add(cachedsize);
                break;

            case 18: // '\022'
                y y = new y();
                codedinputstreammicro.readMessage(y);
                if (applicationPolicies_.isEmpty())
                {
                    applicationPolicies_ = new ArrayList();
                }
                applicationPolicies_.add(y);
                break;

            case 26: // '\032'
                y y1 = new applicationPolicies_();
                codedinputstreammicro.readMessage(y1);
                if (targets_.isEmpty())
                {
                    targets_ = new ArrayList();
                }
                targets_.add(y1);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputStreamMicro codedoutputstreammicro)
        throws IOException
    {
        for (Iterator iterator = resourceSharingRosters_.iterator(); iterator.hasNext(); codedoutputstreammicro.writeMessage(1, (resourceSharingRosters_)iterator.next())) { }
        for (Iterator iterator1 = applicationPolicies_.iterator(); iterator1.hasNext(); codedoutputstreammicro.writeMessage(2, (y)iterator1.next())) { }
        for (Iterator iterator2 = targets_.iterator(); iterator2.hasNext(); codedoutputstreammicro.writeMessage(3, (targets_)iterator2.next())) { }
    }

    public y()
    {
        resourceSharingRosters_ = Collections.emptyList();
        applicationPolicies_ = Collections.emptyList();
        targets_ = Collections.emptyList();
        cachedSize = -1;
    }
}
