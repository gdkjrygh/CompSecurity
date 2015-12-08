// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.bionics.goggles.api2;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.c;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;
import com.google.protobuf.nano.j;

// Referenced classes of package com.google.bionics.goggles.api2:
//            a

public final class cachedSize extends b
{

    public static final c a = com.google.protobuf.nano.c.a(com/google/bionics/goggles/api2/GogglesStructuredResponseProtos$RecognizedText, 0x1661851aL);
    private static final b c[] = new b[0];
    public Word b[];

    protected final int computeSerializedSize()
    {
        int i = super.computeSerializedSize();
        int l = i;
        if (b != null)
        {
            l = i;
            if (b.length > 0)
            {
                int k = 0;
                do
                {
                    l = i;
                    if (k >= b.length)
                    {
                        break;
                    }
                    Word word = b[k];
                    l = i;
                    if (word != null)
                    {
                        l = i + CodedOutputByteBufferNano.c(2, word);
                    }
                    k++;
                    i = l;
                } while (true);
            }
        }
        return l;
    }

    public final g mergeFrom(a a1)
    {
        do
        {
            int i = a1.a();
            switch (i)
            {
            default:
                if (super.storeUnknownField(a1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 18: // '\022'
                int l = j.a(a1, 18);
                Word aword[];
                int k;
                if (b == null)
                {
                    k = 0;
                } else
                {
                    k = b.length;
                }
                aword = new Word[l + k];
                l = k;
                if (k != 0)
                {
                    System.arraycopy(b, 0, aword, 0, k);
                    l = k;
                }
                for (; l < aword.length - 1; l++)
                {
                    aword[l] = new Word();
                    a1.a(aword[l]);
                    a1.a();
                }

                aword[l] = new Word();
                a1.a(aword[l]);
                b = aword;
                break;
            }
        } while (true);
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if (b != null && b.length > 0)
        {
            for (int i = 0; i < b.length; i++)
            {
                Word word = b[i];
                if (word != null)
                {
                    codedoutputbytebuffernano.a(2, word);
                }
            }

        }
        super.writeTo(codedoutputbytebuffernano);
    }


    public Word.clear()
    {
        class Word extends b
        {

            private static volatile Word _emptyArray[];
            private int bitField0_;
            public GogglesCommonProtos.BoundingBox box;
            public GogglesCommonProtos.BoundingBox characterBoxes[];
            public com.google.bionics.goggles.api2.a characterQuads[];
            public com.google.bionics.goggles.api2.a quad;
            private String text_;

            public static Word[] emptyArray()
            {
                if (_emptyArray == null)
                {
                    synchronized (f.a)
                    {
                        if (_emptyArray == null)
                        {
                            _emptyArray = new Word[0];
                        }
                    }
                }
                return _emptyArray;
                exception;
                obj;
                JVM INSTR monitorexit ;
                throw exception;
            }

            public static Word parseFrom(a a1)
            {
                return (new Word()).mergeFrom(a1);
            }

            public static Word parseFrom(byte abyte0[])
            {
                return (Word)g.mergeFrom(new Word(), abyte0);
            }

            public final Word clear()
            {
                bitField0_ = 0;
                text_ = "";
                box = null;
                characterBoxes = GogglesCommonProtos.BoundingBox.emptyArray();
                quad = null;
                characterQuads = com.google.bionics.goggles.api2.a.a();
                unknownFieldData = null;
                cachedSize = -1;
                return this;
            }

            public final Word clearText()
            {
                text_ = "";
                bitField0_ = bitField0_ & -2;
                return this;
            }

            protected final int computeSerializedSize()
            {
                boolean flag = false;
                int i = super.computeSerializedSize();
                int k = i;
                if ((bitField0_ & 1) != 0)
                {
                    k = i + CodedOutputByteBufferNano.b(1, text_);
                }
                i = k;
                if (box != null)
                {
                    i = k + CodedOutputByteBufferNano.c(2, box);
                }
                k = i;
                if (characterBoxes != null)
                {
                    k = i;
                    if (characterBoxes.length > 0)
                    {
                        for (k = 0; k < characterBoxes.length;)
                        {
                            GogglesCommonProtos.BoundingBox boundingbox = characterBoxes[k];
                            int i1 = i;
                            if (boundingbox != null)
                            {
                                i1 = i + CodedOutputByteBufferNano.c(3, boundingbox);
                            }
                            k++;
                            i = i1;
                        }

                        k = i;
                    }
                }
                i = k;
                if (quad != null)
                {
                    i = k + CodedOutputByteBufferNano.c(4, quad);
                }
                int j1 = i;
                if (characterQuads != null)
                {
                    j1 = i;
                    if (characterQuads.length > 0)
                    {
                        int l = ((flag) ? 1 : 0);
                        do
                        {
                            j1 = i;
                            if (l >= characterQuads.length)
                            {
                                break;
                            }
                            com.google.bionics.goggles.api2.a a1 = characterQuads[l];
                            j1 = i;
                            if (a1 != null)
                            {
                                j1 = i + CodedOutputByteBufferNano.c(5, a1);
                            }
                            l++;
                            i = j1;
                        } while (true);
                    }
                }
                return j1;
            }

            public final String getText()
            {
                return text_;
            }

            public final boolean hasText()
            {
                return (bitField0_ & 1) != 0;
            }

            public final Word mergeFrom(a a1)
            {
                do
                {
                    int i = a1.a();
                    switch (i)
                    {
                    default:
                        if (super.storeUnknownField(a1, i))
                        {
                            continue;
                        }
                        // fall through

                    case 0: // '\0'
                        return this;

                    case 10: // '\n'
                        text_ = a1.c();
                        bitField0_ = bitField0_ | 1;
                        break;

                    case 18: // '\022'
                        if (box == null)
                        {
                            box = new GogglesCommonProtos.BoundingBox();
                        }
                        a1.a(box);
                        break;

                    case 26: // '\032'
                        int i1 = j.a(a1, 26);
                        GogglesCommonProtos.BoundingBox aboundingbox[];
                        int k;
                        if (characterBoxes == null)
                        {
                            k = 0;
                        } else
                        {
                            k = characterBoxes.length;
                        }
                        aboundingbox = new GogglesCommonProtos.BoundingBox[i1 + k];
                        i1 = k;
                        if (k != 0)
                        {
                            System.arraycopy(characterBoxes, 0, aboundingbox, 0, k);
                            i1 = k;
                        }
                        for (; i1 < aboundingbox.length - 1; i1++)
                        {
                            aboundingbox[i1] = new GogglesCommonProtos.BoundingBox();
                            a1.a(aboundingbox[i1]);
                            a1.a();
                        }

                        aboundingbox[i1] = new GogglesCommonProtos.BoundingBox();
                        a1.a(aboundingbox[i1]);
                        characterBoxes = aboundingbox;
                        break;

                    case 34: // '"'
                        if (quad == null)
                        {
                            quad = new com.google.bionics.goggles.api2.a();
                        }
                        a1.a(quad);
                        break;

                    case 42: // '*'
                        int j1 = j.a(a1, 42);
                        com.google.bionics.goggles.api2.a aa[];
                        int l;
                        if (characterQuads == null)
                        {
                            l = 0;
                        } else
                        {
                            l = characterQuads.length;
                        }
                        aa = new com.google.bionics.goggles.api2.a[j1 + l];
                        j1 = l;
                        if (l != 0)
                        {
                            System.arraycopy(characterQuads, 0, aa, 0, l);
                            j1 = l;
                        }
                        for (; j1 < aa.length - 1; j1++)
                        {
                            aa[j1] = new com.google.bionics.goggles.api2.a();
                            a1.a(aa[j1]);
                            a1.a();
                        }

                        aa[j1] = new com.google.bionics.goggles.api2.a();
                        a1.a(aa[j1]);
                        characterQuads = aa;
                        break;
                    }
                } while (true);
            }

            public final volatile g mergeFrom(a a1)
            {
                return mergeFrom(a1);
            }

            public final Word setText(String s)
            {
                if (s == null)
                {
                    throw new NullPointerException();
                } else
                {
                    text_ = s;
                    bitField0_ = bitField0_ | 1;
                    return this;
                }
            }

            public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
            {
                boolean flag = false;
                if ((bitField0_ & 1) != 0)
                {
                    codedoutputbytebuffernano.a(1, text_);
                }
                if (box != null)
                {
                    codedoutputbytebuffernano.a(2, box);
                }
                if (characterBoxes != null && characterBoxes.length > 0)
                {
                    for (int i = 0; i < characterBoxes.length; i++)
                    {
                        GogglesCommonProtos.BoundingBox boundingbox = characterBoxes[i];
                        if (boundingbox != null)
                        {
                            codedoutputbytebuffernano.a(3, boundingbox);
                        }
                    }

                }
                if (quad != null)
                {
                    codedoutputbytebuffernano.a(4, quad);
                }
                if (characterQuads != null && characterQuads.length > 0)
                {
                    for (int k = ((flag) ? 1 : 0); k < characterQuads.length; k++)
                    {
                        com.google.bionics.goggles.api2.a a1 = characterQuads[k];
                        if (a1 != null)
                        {
                            codedoutputbytebuffernano.a(5, a1);
                        }
                    }

                }
                super.writeTo(codedoutputbytebuffernano);
            }

            public Word()
            {
                clear();
            }
        }

        b = Word.emptyArray();
        unknownFieldData = null;
        cachedSize = -1;
    }
}
