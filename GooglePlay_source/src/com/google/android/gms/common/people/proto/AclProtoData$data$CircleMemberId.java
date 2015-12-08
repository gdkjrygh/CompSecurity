// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.people.proto;

import com.google.protobuf.micro.CodedInputStreamMicro;
import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.MessageMicro;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.common.people.proto:
//            AclProtoData

public static final class cachedSize extends MessageMicro
{

    private int cachedSize;
    private String contactId_;
    public String email_;
    private boolean hasContactId;
    public boolean hasEmail;
    public boolean hasObfuscatedGaiaId;
    private boolean hasPhone;
    private boolean hasUrl;
    public String obfuscatedGaiaId_;
    private String phone_;
    private String url_;

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
        if (hasEmail)
        {
            j = CodedOutputStreamMicro.computeStringSize(1, email_) + 0;
        }
        int i = j;
        if (hasContactId)
        {
            i = j + CodedOutputStreamMicro.computeStringSize(2, contactId_);
        }
        j = i;
        if (hasObfuscatedGaiaId)
        {
            j = i + CodedOutputStreamMicro.computeStringSize(3, obfuscatedGaiaId_);
        }
        i = j;
        if (hasPhone)
        {
            i = j + CodedOutputStreamMicro.computeStringSize(4, phone_);
        }
        j = i;
        if (hasUrl)
        {
            j = i + CodedOutputStreamMicro.computeStringSize(5, url_);
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
                setEmail(codedinputstreammicro.readString());
                break;

            case 18: // '\022'
                String s = codedinputstreammicro.readString();
                hasContactId = true;
                contactId_ = s;
                break;

            case 26: // '\032'
                setObfuscatedGaiaId(codedinputstreammicro.readString());
                break;

            case 34: // '"'
                String s1 = codedinputstreammicro.readString();
                hasPhone = true;
                phone_ = s1;
                break;

            case 42: // '*'
                String s2 = codedinputstreammicro.readString();
                hasUrl = true;
                url_ = s2;
                break;
            }
        } while (true);
    }

    public final url_ setEmail(String s)
    {
        hasEmail = true;
        email_ = s;
        return this;
    }

    public final email_ setObfuscatedGaiaId(String s)
    {
        hasObfuscatedGaiaId = true;
        obfuscatedGaiaId_ = s;
        return this;
    }

    public final void writeTo(CodedOutputStreamMicro codedoutputstreammicro)
        throws IOException
    {
        if (hasEmail)
        {
            codedoutputstreammicro.writeString(1, email_);
        }
        if (hasContactId)
        {
            codedoutputstreammicro.writeString(2, contactId_);
        }
        if (hasObfuscatedGaiaId)
        {
            codedoutputstreammicro.writeString(3, obfuscatedGaiaId_);
        }
        if (hasPhone)
        {
            codedoutputstreammicro.writeString(4, phone_);
        }
        if (hasUrl)
        {
            codedoutputstreammicro.writeString(5, url_);
        }
    }

    public Q()
    {
        email_ = "";
        contactId_ = "";
        obfuscatedGaiaId_ = "";
        phone_ = "";
        url_ = "";
        cachedSize = -1;
    }
}
