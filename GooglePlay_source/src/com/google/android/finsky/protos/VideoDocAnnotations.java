// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

public interface VideoDocAnnotations
{
    public static final class VideoAnnotations extends MessageNano
    {

        public String alsoAvailableInListUrl;
        public boolean bundle;
        public String bundleContentListUrl;
        public Common.Docid bundleDocid[];
        public String extrasContentListUrl;
        public boolean hasAlsoAvailableInListUrl;
        public boolean hasBundle;
        public boolean hasBundleContentListUrl;
        public boolean hasExtrasContentListUrl;

        protected final int computeSerializedSize()
        {
            int i;
label0:
            {
                int j = super.computeSerializedSize();
                if (!hasBundle)
                {
                    i = j;
                    if (!bundle)
                    {
                        break label0;
                    }
                }
                i = j + (CodedOutputByteBufferNano.computeTagSize(1) + 1);
            }
            int k;
label1:
            {
                if (!hasBundleContentListUrl)
                {
                    k = i;
                    if (bundleContentListUrl.equals(""))
                    {
                        break label1;
                    }
                }
                k = i + CodedOutputByteBufferNano.computeStringSize(2, bundleContentListUrl);
            }
            int i1;
label2:
            {
                if (!hasExtrasContentListUrl)
                {
                    i1 = k;
                    if (extrasContentListUrl.equals(""))
                    {
                        break label2;
                    }
                }
                i1 = k + CodedOutputByteBufferNano.computeStringSize(3, extrasContentListUrl);
            }
label3:
            {
                if (!hasAlsoAvailableInListUrl)
                {
                    i = i1;
                    if (alsoAvailableInListUrl.equals(""))
                    {
                        break label3;
                    }
                }
                i = i1 + CodedOutputByteBufferNano.computeStringSize(4, alsoAvailableInListUrl);
            }
            i1 = i;
            if (bundleDocid != null)
            {
                i1 = i;
                if (bundleDocid.length > 0)
                {
                    int l = 0;
                    do
                    {
                        i1 = i;
                        if (l >= bundleDocid.length)
                        {
                            break;
                        }
                        Common.Docid docid = bundleDocid[l];
                        i1 = i;
                        if (docid != null)
                        {
                            i1 = i + CodedOutputByteBufferNano.computeMessageSize(5, docid);
                        }
                        l++;
                        i = i1;
                    } while (true);
                }
            }
            return i1;
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

                case 8: // '\b'
                    bundle = codedinputbytebuffernano.readBool();
                    hasBundle = true;
                    break;

                case 18: // '\022'
                    bundleContentListUrl = codedinputbytebuffernano.readString();
                    hasBundleContentListUrl = true;
                    break;

                case 26: // '\032'
                    extrasContentListUrl = codedinputbytebuffernano.readString();
                    hasExtrasContentListUrl = true;
                    break;

                case 34: // '"'
                    alsoAvailableInListUrl = codedinputbytebuffernano.readString();
                    hasAlsoAvailableInListUrl = true;
                    break;

                case 42: // '*'
                    int k = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 42);
                    Common.Docid adocid[];
                    int j;
                    if (bundleDocid == null)
                    {
                        j = 0;
                    } else
                    {
                        j = bundleDocid.length;
                    }
                    adocid = new Common.Docid[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(bundleDocid, 0, adocid, 0, j);
                        k = j;
                    }
                    for (; k < adocid.length - 1; k++)
                    {
                        adocid[k] = new Common.Docid();
                        codedinputbytebuffernano.readMessage(adocid[k]);
                        codedinputbytebuffernano.readTag();
                    }

                    adocid[k] = new Common.Docid();
                    codedinputbytebuffernano.readMessage(adocid[k]);
                    bundleDocid = adocid;
                    break;
                }
            } while (true);
        }

        public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            throws IOException
        {
            if (hasBundle || bundle)
            {
                codedoutputbytebuffernano.writeBool(1, bundle);
            }
            if (hasBundleContentListUrl || !bundleContentListUrl.equals(""))
            {
                codedoutputbytebuffernano.writeString(2, bundleContentListUrl);
            }
            if (hasExtrasContentListUrl || !extrasContentListUrl.equals(""))
            {
                codedoutputbytebuffernano.writeString(3, extrasContentListUrl);
            }
            if (hasAlsoAvailableInListUrl || !alsoAvailableInListUrl.equals(""))
            {
                codedoutputbytebuffernano.writeString(4, alsoAvailableInListUrl);
            }
            if (bundleDocid != null && bundleDocid.length > 0)
            {
                for (int i = 0; i < bundleDocid.length; i++)
                {
                    Common.Docid docid = bundleDocid[i];
                    if (docid != null)
                    {
                        codedoutputbytebuffernano.writeMessage(5, docid);
                    }
                }

            }
            super.writeTo(codedoutputbytebuffernano);
        }

        public VideoAnnotations()
        {
            bundle = false;
            hasBundle = false;
            bundleContentListUrl = "";
            hasBundleContentListUrl = false;
            extrasContentListUrl = "";
            hasExtrasContentListUrl = false;
            alsoAvailableInListUrl = "";
            hasAlsoAvailableInListUrl = false;
            bundleDocid = Common.Docid.emptyArray();
            cachedSize = -1;
        }
    }

}
