// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface BookDocDetails
{
    public static final class BookDetails extends MessageNano
    {

        public String aboutTheAuthor;
        public boolean hasAboutTheAuthor;
        public boolean hasIsbn;
        public boolean hasNumberOfPages;
        public boolean hasPublicationDate;
        public boolean hasPublisher;
        public String isbn;
        public int numberOfPages;
        public String publicationDate;
        public String publisher;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasPublisher)
                {
                    i = j;
                    if (publisher.equals(""))
                    {
                        break label0;
                    }
                }
                i = j + CodedOutputByteBufferNano.computeStringSize(4, publisher);
            }
            int k;
label1:
            {
                if (!hasPublicationDate)
                {
                    k = i;
                    if (publicationDate.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(5, publicationDate);
            }
label2:
            {
                if (!hasIsbn)
                {
                    i = k;
                    if (isbn.equals(""))
                    {
                        break label2;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(6, isbn);
            }
label3:
            {
                if (!hasNumberOfPages)
                {
                    k = i;
                    if (numberOfPages == 0)
                    {
                        break label3;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeInt32Size(7, numberOfPages);
            }
label4:
            {
                if (!hasAboutTheAuthor)
                {
                    i = k;
                    if (aboutTheAuthor.equals(""))
                    {
                        break label4;
                    }
                }
                i = k + CodedOutputByteBufferNano.computeStringSize(17, aboutTheAuthor);
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

                case 34: // '"'
                    publisher = codedinputbytebuffernano.readString();
                    hasPublisher = true;
                    break;

                case 42: // '*'
                    publicationDate = codedinputbytebuffernano.readString();
                    hasPublicationDate = true;
                    break;

                case 50: // '2'
                    isbn = codedinputbytebuffernano.readString();
                    hasIsbn = true;
                    break;

                case 56: // '8'
                    numberOfPages = codedinputbytebuffernano.readRawVarint32();
                    hasNumberOfPages = true;
                    break;

                case 138: 
                    aboutTheAuthor = codedinputbytebuffernano.readString();
                    hasAboutTheAuthor = true;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasPublisher || !publisher.equals(""))
            {
                codedoutputbytebuffernano.writeString(4, publisher);
            }
            if (hasPublicationDate || !publicationDate.equals(""))
            {
                codedoutputbytebuffernano.writeString(5, publicationDate);
            }
            if (hasIsbn || !isbn.equals(""))
            {
                codedoutputbytebuffernano.writeString(6, isbn);
            }
            if (hasNumberOfPages || numberOfPages != 0)
            {
                codedoutputbytebuffernano.writeInt32(7, numberOfPages);
            }
            if (hasAboutTheAuthor || !aboutTheAuthor.equals(""))
            {
                codedoutputbytebuffernano.writeString(17, aboutTheAuthor);
            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public BookDetails()
        {
            publisher = "";
            hasPublisher = false;
            publicationDate = "";
            hasPublicationDate = false;
            isbn = "";
            hasIsbn = false;
            numberOfPages = 0;
            hasNumberOfPages = false;
            aboutTheAuthor = "";
            hasAboutTheAuthor = false;
            cachedSize = -1;
        }
    }

}
