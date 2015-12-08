// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.proto.api;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.InternalNano;
import com.google.protobuf.nano.MessageNano;
import com.google.protobuf.nano.WireFormatNano;
import java.io.IOException;

// Referenced classes of package com.google.wallet.proto.api:
//            NanoWalletOcr

public static final class clear extends ExtendableMessageNano
{

    private static volatile ge _emptyArray[];
    public ge barcode[];
    public nstance giftCardRecognizedInstance;
    public stance loyaltyRecognizedInstance;
    public  textField[];

    private clear clear()
    {
        textField = .emptyArray();
        barcode = mptyArray();
        loyaltyRecognizedInstance = null;
        giftCardRecognizedInstance = null;
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
        do
        {
            int i = codedinputbytebuffernano.readTag();
            switch (i)
            {
            default:
                if (storeUnknownField(codedinputbytebuffernano, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                if (loyaltyRecognizedInstance == null)
                {
                    loyaltyRecognizedInstance = new stance();
                }
                codedinputbytebuffernano.readMessage(loyaltyRecognizedInstance);
                break;

            case 18: // '\022'
                if (giftCardRecognizedInstance == null)
                {
                    giftCardRecognizedInstance = new nstance();
                }
                codedinputbytebuffernano.readMessage(giftCardRecognizedInstance);
                break;

            case 26: // '\032'
                int l = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 26);
                 a[];
                int j;
                if (textField == null)
                {
                    j = 0;
                } else
                {
                    j = textField.length;
                }
                a = new [j + l];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(textField, 0, a, 0, j);
                    l = j;
                }
                for (; l < a.length - 1; l++)
                {
                    a[l] = new ();
                    codedinputbytebuffernano.readMessage(a[l]);
                    codedinputbytebuffernano.readTag();
                }

                a[l] = new ();
                codedinputbytebuffernano.readMessage(a[l]);
                textField = a;
                break;

            case 34: // '"'
                int i1 = WireFormatNano.getRepeatedFieldArrayLength(codedinputbytebuffernano, 34);
                 a1[];
                int k;
                if (barcode == null)
                {
                    k = 0;
                } else
                {
                    k = barcode.length;
                }
                a1 = new barcode[k + i1];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(barcode, 0, a1, 0, k);
                    i1 = k;
                }
                for (; i1 < a1.length - 1; i1++)
                {
                    a1[i1] = new init>();
                    codedinputbytebuffernano.readMessage(a1[i1]);
                    codedinputbytebuffernano.readTag();
                }

                a1[i1] = new init>();
                codedinputbytebuffernano.readMessage(a1[i1]);
                barcode = a1;
                break;
            }
        } while (true);
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if (loyaltyRecognizedInstance != null)
        {
            i = j + CodedOutputByteBufferNano.computeMessageSize(1, loyaltyRecognizedInstance);
        }
        j = i;
        if (giftCardRecognizedInstance != null)
        {
            j = i + CodedOutputByteBufferNano.computeMessageSize(2, giftCardRecognizedInstance);
        }
        i = j;
        if (textField != null)
        {
            i = j;
            if (textField.length > 0)
            {
                int l = 0;
                do
                {
                    i = j;
                    if (l >= textField.length)
                    {
                        break;
                    }
                      = textField[l];
                    i = j;
                    if ( != null)
                    {
                        i = j + CodedOutputByteBufferNano.computeMessageSize(3, );
                    }
                    l++;
                    j = i;
                } while (true);
            }
        }
        int i1 = i;
        if (barcode != null)
        {
            i1 = i;
            if (barcode.length > 0)
            {
                int k = 0;
                do
                {
                    i1 = i;
                    if (k >= barcode.length)
                    {
                        break;
                    }
                     1 = barcode[k];
                    i1 = i;
                    if (1 != null)
                    {
                        i1 = i + CodedOutputByteBufferNano.computeMessageSize(4, 1);
                    }
                    k++;
                    i = i1;
                } while (true);
            }
        }
        return i1;
    }

    public final volatile MessageNano mergeFrom(CodedInputByteBufferNano codedinputbytebuffernano)
        throws IOException
    {
        return mergeFrom(codedinputbytebuffernano);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
        throws IOException
    {
        if (loyaltyRecognizedInstance != null)
        {
            codedoutputbytebuffernano.writeMessage(1, loyaltyRecognizedInstance);
        }
        if (giftCardRecognizedInstance != null)
        {
            codedoutputbytebuffernano.writeMessage(2, giftCardRecognizedInstance);
        }
        if (textField != null && textField.length > 0)
        {
            for (int i = 0; i < textField.length; i++)
            {
                  = textField[i];
                if ( != null)
                {
                    codedoutputbytebuffernano.writeMessage(3, );
                }
            }

        }
        if (barcode != null && barcode.length > 0)
        {
            for (int j = 0; j < barcode.length; j++)
            {
                 1 = barcode[j];
                if (1 != null)
                {
                    codedoutputbytebuffernano.writeMessage(4, 1);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
