// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a.a.a.a;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.g;

// Referenced classes of package b.a.a.a.a:
//            g, h

public final class i extends b
{

    public b.a.a.a.a.g a;
    public h b;

    public i()
    {
        a = null;
        b = null;
        unknownFieldData = null;
        cachedSize = -1;
    }

    protected final int computeSerializedSize()
    {
        int k = super.computeSerializedSize();
        int j = k;
        if (a != null)
        {
            j = k + CodedOutputByteBufferNano.c(1, a);
        }
        k = j;
        if (b != null)
        {
            k = j + CodedOutputByteBufferNano.c(2, b);
        }
        return k;
    }

    public final g mergeFrom(a a1)
    {
        do
        {
            int j = a1.a();
            switch (j)
            {
            default:
                if (super.storeUnknownField(a1, j))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (a == null)
                {
                    a = new b.a.a.a.a.g();
                }
                a1.a(a);
                break;

            case 18: // '\022'
                if (b == null)
                {
                    b = new h();
                }
                a1.a(b);
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (a != null)
        {
            codedoutputbytebuffernano.a(1, a);
        }
        if (b != null)
        {
            codedoutputbytebuffernano.a(2, b);
        }
        super.writeTo(codedoutputbytebuffernano);
    }
}
