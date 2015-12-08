// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.checkout.commonui.purchaserecord.proto;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.checkout.commonui.purchaserecord.proto:
//            NanoView

public static final class clear extends ExtendableMessageNano
{

    private static volatile footerLinkUrl _emptyArray[];
    public erable content;
    public String footer;
    public String footerLinkUrl;
    public String header;
    public String headerLinkUrl;
    public erable rightContent;
    public Integer rule;
    public String tag[];

    private clear clear()
    {
        header = null;
        content = null;
        rightContent = null;
        footer = null;
        rule = null;
        tag = WireFormatNano.EMPTY_STRING_ARRAY;
        headerLinkUrl = null;
        footerLinkUrl = null;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    public static cachedSize[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (InternalNano.LAZY_INIT_LOCK)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private _emptyArray mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L11:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 9: default 88
    //                   0: 97
    //                   10: 99
    //                   18: 110
    //                   26: 139
    //                   34: 168
    //                   40: 179
    //                   50: 226
    //                   58: 328
    //                   66: 339;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (storeUnknownField(codedinputbytebuffernano, i)) goto _L11; else goto _L2
_L2:
        return this;
_L3:
        header = codedinputbytebuffernano.readString();
          goto _L11
_L4:
        if (content == null)
        {
            content = new erable();
        }
        codedinputbytebuffernano.readMessage(content);
          goto _L11
_L5:
        if (rightContent == null)
        {
            rightContent = new erable();
        }
        codedinputbytebuffernano.readMessage(rightContent);
          goto _L11
_L6:
        footer = codedinputbytebuffernano.readString();
          goto _L11
_L7:
        int j = codedinputbytebuffernano.readInt32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            rule = Integer.valueOf(j);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 50);
        String as[];
        int k;
        if (tag == null)
        {
            k = 0;
        } else
        {
            k = tag.length;
        }
        as = new String[k + l];
        l = k;
        if (k != 0)
        {
            System.arraycopy(tag, 0, as, 0, k);
            l = k;
        }
        for (; l < as.length - 1; l++)
        {
            as[l] = codedinputbytebuffernano.readString();
            codedinputbytebuffernano.readTag();
        }

        as[l] = codedinputbytebuffernano.readString();
        tag = as;
        continue; /* Loop/switch isn't completed */
_L9:
        headerLinkUrl = codedinputbytebuffernano.readString();
        continue; /* Loop/switch isn't completed */
_L10:
        footerLinkUrl = codedinputbytebuffernano.readString();
        if (true) goto _L11; else goto _L12
_L12:
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (header != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(1, header);
        }
        j = i;
        if (content != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, content);
        }
        i = j;
        if (rightContent != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(3, rightContent);
        }
        j = i;
        if (footer != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(4, footer);
        }
        i = j;
        if (rule != null)
        {
            i = j + CodedOutputByteBufferNano.computeInt32Size(5, rule.intValue());
        }
        j = i;
        if (tag != null)
        {
            j = i;
            if (tag.length > 0)
            {
                int i1 = 0;
                int k = 0;
                for (j = 0; j < tag.length;)
                {
                    String s = tag[j];
                    int j1 = i1;
                    int l = k;
                    if (s != null)
                    {
                        j1 = i1 + 1;
                        l = k + CodedOutputByteBufferNano.computeStringSizeNoTag(s);
                    }
                    j++;
                    i1 = j1;
                    k = l;
                }

                j = i + k + i1 * 1;
            }
        }
        i = j;
        if (headerLinkUrl != null)
        {
            i = j + CodedOutputByteBufferNano.computeStringSize(7, headerLinkUrl);
        }
        j = i;
        if (footerLinkUrl != null)
        {
            j = i + CodedOutputByteBufferNano.computeStringSize(8, footerLinkUrl);
        }
        return j;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (header != null)
        {
            codedoutputbytebuffernano.writeString(1, header);
        }
        if (content != null)
        {
            codedoutputbytebuffernano.writeMessage(2, content);
        }
        if (rightContent != null)
        {
            codedoutputbytebuffernano.writeMessage(3, rightContent);
        }
        if (footer != null)
        {
            codedoutputbytebuffernano.writeString(4, footer);
        }
        if (rule != null)
        {
            codedoutputbytebuffernano.writeInt32(5, rule.intValue());
        }
        if (tag != null && tag.length > 0)
        {
            for (int i = 0; i < tag.length; i++)
            {
                String s = tag[i];
                if (s != null)
                {
                    codedoutputbytebuffernano.writeString(6, s);
                }
            }

        }
        if (headerLinkUrl != null)
        {
            codedoutputbytebuffernano.writeString(7, headerLinkUrl);
        }
        if (footerLinkUrl != null)
        {
            codedoutputbytebuffernano.writeString(8, footerLinkUrl);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public erable()
    {
        clear();
    }
}
