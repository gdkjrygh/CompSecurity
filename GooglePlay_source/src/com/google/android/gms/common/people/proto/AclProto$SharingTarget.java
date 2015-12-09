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
    public String displayName_;
    private String email_;
    private boolean hasDisplayName;
    private boolean hasEmail;
    private boolean hasId;
    public d id_;

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
        if (hasId)
        {
            j = CodedOutputStreamMicro.computeMessageSize(1, id_) + 0;
        }
        int i = j;
        if (hasDisplayName)
        {
            i = j + CodedOutputStreamMicro.computeStringSize(2, displayName_);
        }
        j = i;
        if (hasEmail)
        {
            j = i + CodedOutputStreamMicro.computeStringSize(3, email_);
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
                d d = new d();
                codedinputstreammicro.readMessage(d);
                hasId = true;
                id_ = d;
                break;

            case 18: // '\022'
                String s = codedinputstreammicro.readString();
                hasDisplayName = true;
                displayName_ = s;
                break;

            case 26: // '\032'
                String s1 = codedinputstreammicro.readString();
                hasEmail = true;
                email_ = s1;
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
        if (hasDisplayName)
        {
            codedoutputstreammicro.writeString(2, displayName_);
        }
        if (hasEmail)
        {
            codedoutputstreammicro.writeString(3, email_);
        }
    }

    public d()
    {
        id_ = null;
        displayName_ = "";
        email_ = "";
        cachedSize = -1;
    }
}
