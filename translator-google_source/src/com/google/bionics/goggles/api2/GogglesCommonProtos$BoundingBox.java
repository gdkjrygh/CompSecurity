// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.bionics.goggles.api2;

import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.a;
import com.google.protobuf.nano.b;
import com.google.protobuf.nano.f;
import com.google.protobuf.nano.g;

public final class clear extends b
{

    private static volatile height_ _emptyArray[];
    private int bitField0_;
    private int height_;
    private int width_;
    private int x_;
    private int y_;

    public static clear[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (f.a)
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

    public static _emptyArray parseFrom(a a1)
    {
        return (new <init>()).mergeFrom(a1);
    }

    public static mergeFrom parseFrom(byte abyte0[])
    {
        return (mergeFrom)g.mergeFrom(new <init>(), abyte0);
    }

    public final <init> clear()
    {
        bitField0_ = 0;
        x_ = 0;
        y_ = 0;
        width_ = 0;
        height_ = 0;
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    public final cachedSize clearHeight()
    {
        height_ = 0;
        bitField0_ = bitField0_ & -9;
        return this;
    }

    public final bitField0_ clearWidth()
    {
        width_ = 0;
        bitField0_ = bitField0_ & -5;
        return this;
    }

    public final bitField0_ clearX()
    {
        x_ = 0;
        bitField0_ = bitField0_ & -2;
        return this;
    }

    public final bitField0_ clearY()
    {
        y_ = 0;
        bitField0_ = bitField0_ & -3;
        return this;
    }

    protected final int computeSerializedSize()
    {
        int j = super.computeSerializedSize();
        int i = j;
        if ((bitField0_ & 1) != 0)
        {
            i = j + CodedOutputByteBufferNano.d(1, x_);
        }
        j = i;
        if ((bitField0_ & 2) != 0)
        {
            j = i + CodedOutputByteBufferNano.d(2, y_);
        }
        i = j;
        if ((bitField0_ & 4) != 0)
        {
            i = j + CodedOutputByteBufferNano.d(3, width_);
        }
        j = i;
        if ((bitField0_ & 8) != 0)
        {
            j = i + CodedOutputByteBufferNano.d(4, height_);
        }
        return j;
    }

    public final int getHeight()
    {
        return height_;
    }

    public final int getWidth()
    {
        return width_;
    }

    public final int getX()
    {
        return x_;
    }

    public final int getY()
    {
        return y_;
    }

    public final boolean hasHeight()
    {
        return (bitField0_ & 8) != 0;
    }

    public final boolean hasWidth()
    {
        return (bitField0_ & 4) != 0;
    }

    public final boolean hasX()
    {
        return (bitField0_ & 1) != 0;
    }

    public final boolean hasY()
    {
        return (bitField0_ & 2) != 0;
    }

    public final bitField0_ mergeFrom(a a1)
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

            case 8: // '\b'
                x_ = a1.e();
                bitField0_ = bitField0_ | 1;
                break;

            case 16: // '\020'
                y_ = a1.e();
                bitField0_ = bitField0_ | 2;
                break;

            case 24: // '\030'
                width_ = a1.e();
                bitField0_ = bitField0_ | 4;
                break;

            case 32: // ' '
                height_ = a1.e();
                bitField0_ = bitField0_ | 8;
                break;
            }
        } while (true);
    }

    public final volatile g mergeFrom(a a1)
    {
        return mergeFrom(a1);
    }

    public final mergeFrom setHeight(int i)
    {
        height_ = i;
        bitField0_ = bitField0_ | 8;
        return this;
    }

    public final bitField0_ setWidth(int i)
    {
        width_ = i;
        bitField0_ = bitField0_ | 4;
        return this;
    }

    public final bitField0_ setX(int i)
    {
        x_ = i;
        bitField0_ = bitField0_ | 1;
        return this;
    }

    public final bitField0_ setY(int i)
    {
        y_ = i;
        bitField0_ = bitField0_ | 2;
        return this;
    }

    public final void writeTo(CodedOutputByteBufferNano codedoutputbytebuffernano)
    {
        if ((bitField0_ & 1) != 0)
        {
            codedoutputbytebuffernano.a(1, x_);
        }
        if ((bitField0_ & 2) != 0)
        {
            codedoutputbytebuffernano.a(2, y_);
        }
        if ((bitField0_ & 4) != 0)
        {
            codedoutputbytebuffernano.a(3, width_);
        }
        if ((bitField0_ & 8) != 0)
        {
            codedoutputbytebuffernano.a(4, height_);
        }
        super.writeTo(codedoutputbytebuffernano);
    }

    public ()
    {
        clear();
    }
}
