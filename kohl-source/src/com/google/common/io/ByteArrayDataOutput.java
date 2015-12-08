// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.DataOutput;

public interface ByteArrayDataOutput
    extends DataOutput
{

    public abstract byte[] toByteArray();

    public abstract void write(int i);

    public abstract void write(byte abyte0[]);

    public abstract void write(byte abyte0[], int i, int j);

    public abstract void writeBoolean(boolean flag);

    public abstract void writeByte(int i);

    public abstract void writeBytes(String s);

    public abstract void writeChar(int i);

    public abstract void writeChars(String s);

    public abstract void writeDouble(double d);

    public abstract void writeFloat(float f);

    public abstract void writeInt(int i);

    public abstract void writeLong(long l);

    public abstract void writeShort(int i);

    public abstract void writeUTF(String s);
}
