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
    private boolean hasId;
    public boolean hasSharingRoster;
    private sharingRoster_ id_;
    public sharingRoster_ sharingRoster_;

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
        if (hasId)
        {
            i = CodedOutputStreamMicro.computeMessageSize(1, id_) + 0;
        }
        int j = i;
        if (hasSharingRoster)
        {
            j = i + CodedOutputStreamMicro.computeMessageSize(2, sharingRoster_);
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
                cachedSize cachedsize = new >();
                codedinputstreammicro.readMessage(cachedsize);
                hasId = true;
                id_ = cachedsize;
                break;

            case 18: // '\022'
                cachedSize cachedsize1 = new id_();
                codedinputstreammicro.readMessage(cachedsize1);
                hasSharingRoster = true;
                sharingRoster_ = cachedsize1;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputStreamMicro codedoutputstreammicro)
        throws IOException
    {
        if (hasId)
        {
            codedoutputstreammicro.writeMessage(1, id_);
        }
        if (hasSharingRoster)
        {
            codedoutputstreammicro.writeMessage(2, sharingRoster_);
        }
    }

    public ()
    {
        id_ = null;
        sharingRoster_ = null;
        cachedSize = -1;
    }
}
