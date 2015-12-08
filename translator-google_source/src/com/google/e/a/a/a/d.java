// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.e.a.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;

public final class d extends b
{

    private static volatile d a[];
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private boolean g;
    private boolean h;

    public d()
    {
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        g = false;
        h = false;
        unknownFieldData = null;
        cachedSize = -1;
    }

    public static d[] a()
    {
        if (a == null)
        {
            synchronized (f.a)
            {
                if (a == null)
                {
                    a = new d[0];
                }
            }
        }
        return a;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if ((b & 1) != 0)
        {
            i = j + CodedOutputByteBufferNano.d(1, c);
        }
        j = i;
        if ((b & 2) != 0)
        {
            j = i + CodedOutputByteBufferNano.d(2, d);
        }
        i = j;
        if ((b & 4) != 0)
        {
            i = j + CodedOutputByteBufferNano.d(3, e);
        }
        j = i;
        if ((b & 0x10) != 0)
        {
            j = i + (CodedOutputByteBufferNano.b(4) + 1);
        }
        i = j;
        if ((b & 8) != 0)
        {
            i = j + CodedOutputByteBufferNano.d(5, f);
        }
        j = i;
        if ((b & 0x20) != 0)
        {
            j = i + (CodedOutputByteBufferNano.b(6) + 1);
        }
        return j;
    }

    public final g mergeFrom(a a1)
    {
_L9:
        int i = a1.a();
        i;
        JVM INSTR lookupswitch 7: default 72
    //                   0: 81
    //                   8: 83
    //                   16: 185
    //                   24: 325
    //                   32: 346
    //                   40: 368
    //                   48: 390;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
        if (super.storeUnknownField(a1, i)) goto _L9; else goto _L2
_L2:
        return this;
_L3:
        int j = a1.e();
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
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
            c = j;
            b = b | 1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        int k = a1.e();
        switch (k)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
            d = k;
            b = b | 2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        e = a1.e();
        b = b | 4;
        continue; /* Loop/switch isn't completed */
_L6:
        g = a1.b();
        b = b | 0x10;
        continue; /* Loop/switch isn't completed */
_L7:
        f = a1.e();
        b = b | 8;
        continue; /* Loop/switch isn't completed */
_L8:
        h = a1.b();
        b = b | 0x20;
        if (true) goto _L9; else goto _L10
_L10:
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((b & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, c);
        }
        if ((b & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, d);
        }
        if ((b & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, e);
        }
        if ((b & 0x10) != 0)
        {
            codedoutputbytebuffernano.a(4, g);
        }
        if ((b & 8) != 0)
        {
            codedoutputbytebuffernano.a(5, f);
        }
        if ((b & 0x20) != 0)
        {
            codedoutputbytebuffernano.a(6, h);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
