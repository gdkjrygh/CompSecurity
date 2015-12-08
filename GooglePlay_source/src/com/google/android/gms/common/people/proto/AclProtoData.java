// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.people.proto;

import com.google.protobuf.micro.CodedInputStreamMicro;
import com.google.protobuf.micro.CodedOutputStreamMicro;
import com.google.protobuf.micro.MessageMicro;
import java.io.IOException;

public final class AclProtoData
{
    public static final class data extends MessageMicro
    {

        private int cachedSize;

        public final int getCachedSize()
        {
            return 0;
        }

        public final int getSerializedSize()
        {
            cachedSize = 0;
            return 0;
        }

        public final volatile MessageMicro mergeFrom(CodedInputStreamMicro codedinputstreammicro)
            throws IOException
        {
_L3:
            int i = codedinputstreammicro.readTag();
            i;
            JVM INSTR tableswitch 0 0: default 24
        //                       0 32;
               goto _L1 _L2
_L1:
            if (codedinputstreammicro.skipField(i)) goto _L3; else goto _L2
_L2:
            return this;
        }

        public final void writeTo(CodedOutputStreamMicro codedoutputstreammicro)
        {
        }
    }

    public static final class data.CircleMemberId extends MessageMicro
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

        public final data.CircleMemberId setEmail(String s)
        {
            hasEmail = true;
            email_ = s;
            return this;
        }

        public final data.CircleMemberId setObfuscatedGaiaId(String s)
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

        public data.CircleMemberId()
        {
            email_ = "";
            contactId_ = "";
            obfuscatedGaiaId_ = "";
            phone_ = "";
            url_ = "";
            cachedSize = -1;
        }
    }

}
