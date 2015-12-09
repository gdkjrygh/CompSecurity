// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.finsky.protos;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.android.finsky.protos:
//            DocumentV2

public static final class cachedSize extends MessageNano
{

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
_L3:
        int i = codedinputbytebuffernano.readTag();
        i;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 32;
           goto _L1 _L2
_L1:
        if (WireFormatNano.parseUnknownField(codedinputbytebuffernano, i)) goto _L3; else goto _L2
_L2:
        return this;
    }

    public A()
    {
        cachedSize = -1;
    }
}
