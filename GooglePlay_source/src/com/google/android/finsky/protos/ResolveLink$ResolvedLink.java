// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.finsky.protos:
//            ResolveLink

public static final class cachedSize extends MessageNano
{

    public int backend;
    public String browseUrl;
    public String detailsUrl;
    public e directPurchase;
    public e docid;
    public boolean hasBackend;
    public boolean hasBrowseUrl;
    public boolean hasDetailsUrl;
    public boolean hasHomeUrl;
    public boolean hasMyAccountUrl;
    public boolean hasQuery;
    public boolean hasSearchUrl;
    public boolean hasServerLogsCookie;
    public boolean hasWishlistUrl;
    public String homeUrl;
    public String myAccountUrl;
    public String query;
    public d redeemGiftCard;
    public String searchUrl;
    public byte serverLogsCookie[];
    public String wishlistUrl;

    protected final int computeSerializedSize()
    {
        int i;
label0:
        {
            int j = super.computeSerializedSize();
            if (!hasDetailsUrl)
            {
                i = j;
                if (detailsUrl.equals(""))
                {
                    break label0;
                }
            }
            i = j + CodedOutputByteBufferNano.computeStringSize(1, detailsUrl);
        }
        int k;
label1:
        {
            if (!hasBrowseUrl)
            {
                k = i;
                if (browseUrl.equals(""))
                {
                    break label1;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(2, browseUrl);
        }
label2:
        {
            if (!hasSearchUrl)
            {
                i = k;
                if (searchUrl.equals(""))
                {
                    break label2;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(3, searchUrl);
        }
label3:
        {
            k = i;
            if (directPurchase != null)
            {
                k = i + CodedOutputByteBufferNano.computeMessageSize(4, directPurchase);
            }
            if (!hasHomeUrl)
            {
                i = k;
                if (homeUrl.equals(""))
                {
                    break label3;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(5, homeUrl);
        }
label4:
        {
            k = i;
            if (redeemGiftCard != null)
            {
                k = i + CodedOutputByteBufferNano.computeMessageSize(6, redeemGiftCard);
            }
            if (!hasServerLogsCookie)
            {
                i = k;
                if (Arrays.equals(serverLogsCookie, WireFormatNano.EMPTY_BYTES))
                {
                    break label4;
                }
            }
            i = k + CodedOutputByteBufferNano.computeBytesSize(7, serverLogsCookie);
        }
label5:
        {
            k = i;
            if (docid != null)
            {
                k = i + CodedOutputByteBufferNano.computeMessageSize(8, docid);
            }
            if (!hasWishlistUrl)
            {
                i = k;
                if (wishlistUrl.equals(""))
                {
                    break label5;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(9, wishlistUrl);
        }
label6:
        {
            if (backend == 0)
            {
                k = i;
                if (!hasBackend)
                {
                    break label6;
                }
            }
            k = i + CodedOutputByteBufferNano.computeInt32Size(10, backend);
        }
label7:
        {
            if (!hasQuery)
            {
                i = k;
                if (query.equals(""))
                {
                    break label7;
                }
            }
            i = k + CodedOutputByteBufferNano.computeStringSize(11, query);
        }
label8:
        {
            if (!hasMyAccountUrl)
            {
                k = i;
                if (myAccountUrl.equals(""))
                {
                    break label8;
                }
            }
            k = i + CodedOutputByteBufferNano.computeStringSize(12, myAccountUrl);
        }
        return k;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L15:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR lookupswitch 13: default 120
    //                   0: 128
    //                   10: 130
    //                   18: 146
    //                   26: 162
    //                   34: 178
    //                   42: 207
    //                   50: 223
    //                   58: 252
    //                   66: 268
    //                   74: 297
    //                   80: 313
    //                   90: 400
    //                   98: 416;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L15; else goto _L2
_L2:
        return this;
_L3:
        detailsUrl = codedinputbytebuffernano.readString();
        hasDetailsUrl = true;
          goto _L15
_L4:
        browseUrl = codedinputbytebuffernano.readString();
        hasBrowseUrl = true;
          goto _L15
_L5:
        searchUrl = codedinputbytebuffernano.readString();
        hasSearchUrl = true;
          goto _L15
_L6:
        if (directPurchase == null)
        {
            directPurchase = new e();
        }
        codedinputbytebuffernano.readMessage(directPurchase);
          goto _L15
_L7:
        homeUrl = codedinputbytebuffernano.readString();
        hasHomeUrl = true;
          goto _L15
_L8:
        if (redeemGiftCard == null)
        {
            redeemGiftCard = new d();
        }
        codedinputbytebuffernano.readMessage(redeemGiftCard);
          goto _L15
_L9:
        serverLogsCookie = codedinputbytebuffernano.readBytes();
        hasServerLogsCookie = true;
          goto _L15
_L10:
        if (docid == null)
        {
            docid = new docid();
        }
        codedinputbytebuffernano.readMessage(docid);
          goto _L15
_L11:
        wishlistUrl = codedinputbytebuffernano.readString();
        hasWishlistUrl = true;
          goto _L15
_L12:
        int j = codedinputbytebuffernano.readRawVarint32();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
            backend = j;
            hasBackend = true;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        query = codedinputbytebuffernano.readString();
        hasQuery = true;
        continue; /* Loop/switch isn't completed */
_L14:
        myAccountUrl = codedinputbytebuffernano.readString();
        hasMyAccountUrl = true;
        if (true) goto _L15; else goto _L16
_L16:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (hasDetailsUrl || !detailsUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(1, detailsUrl);
        }
        if (hasBrowseUrl || !browseUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(2, browseUrl);
        }
        if (hasSearchUrl || !searchUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(3, searchUrl);
        }
        if (directPurchase != null)
        {
            codedoutputbytebuffernano.writeMessage(4, directPurchase);
        }
        if (hasHomeUrl || !homeUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(5, homeUrl);
        }
        if (redeemGiftCard != null)
        {
            codedoutputbytebuffernano.writeMessage(6, redeemGiftCard);
        }
        if (hasServerLogsCookie || !Arrays.equals(serverLogsCookie, WireFormatNano.EMPTY_BYTES))
        {
            codedoutputbytebuffernano.writeBytes(7, serverLogsCookie);
        }
        if (docid != null)
        {
            codedoutputbytebuffernano.writeMessage(8, docid);
        }
        if (hasWishlistUrl || !wishlistUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(9, wishlistUrl);
        }
        if (backend != 0 || hasBackend)
        {
            codedoutputbytebuffernano.writeInt32(10, backend);
        }
        if (hasQuery || !query.equals(""))
        {
            codedoutputbytebuffernano.writeString(11, query);
        }
        if (hasMyAccountUrl || !myAccountUrl.equals(""))
        {
            codedoutputbytebuffernano.writeString(12, myAccountUrl);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public d()
    {
        detailsUrl = "";
        hasDetailsUrl = false;
        browseUrl = "";
        hasBrowseUrl = false;
        searchUrl = "";
        hasSearchUrl = false;
        wishlistUrl = "";
        hasWishlistUrl = false;
        myAccountUrl = "";
        hasMyAccountUrl = false;
        directPurchase = null;
        homeUrl = "";
        hasHomeUrl = false;
        redeemGiftCard = null;
        docid = null;
        serverLogsCookie = WireFormatNano.EMPTY_BYTES;
        hasServerLogsCookie = false;
        backend = 0;
        hasBackend = false;
        query = "";
        hasQuery = false;
        cachedSize = -1;
    }
}
