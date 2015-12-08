// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.zip.Checksum;

// Referenced classes of package com.google.common.io:
//            InputSupplier, OutputSupplier, Closeables, ByteProcessor, 
//            ByteArrayDataInput, ByteArrayDataOutput, LimitInputStream, MultiInputStream

public final class ByteStreams
{
    private static class ByteArrayDataInputStream
        implements ByteArrayDataInput
    {

        final DataInput input;

        public boolean readBoolean()
        {
            boolean flag;
            try
            {
                flag = input.readBoolean();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return flag;
        }

        public byte readByte()
        {
            byte byte0;
            try
            {
                byte0 = input.readByte();
            }
            catch (EOFException eofexception)
            {
                throw new IllegalStateException(eofexception);
            }
            catch (IOException ioexception)
            {
                throw new AssertionError(ioexception);
            }
            return byte0;
        }

        public char readChar()
        {
            char c;
            try
            {
                c = input.readChar();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return c;
        }

        public double readDouble()
        {
            double d;
            try
            {
                d = input.readDouble();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return d;
        }

        public float readFloat()
        {
            float f;
            try
            {
                f = input.readFloat();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return f;
        }

        public void readFully(byte abyte0[])
        {
            try
            {
                input.readFully(abyte0);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new IllegalStateException(abyte0);
            }
        }

        public void readFully(byte abyte0[], int i, int j)
        {
            try
            {
                input.readFully(abyte0, i, j);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new IllegalStateException(abyte0);
            }
        }

        public int readInt()
        {
            int i;
            try
            {
                i = input.readInt();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return i;
        }

        public String readLine()
        {
            String s;
            try
            {
                s = input.readLine();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return s;
        }

        public long readLong()
        {
            long l;
            try
            {
                l = input.readLong();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return l;
        }

        public short readShort()
        {
            short word0;
            try
            {
                word0 = input.readShort();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return word0;
        }

        public String readUTF()
        {
            String s;
            try
            {
                s = input.readUTF();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return s;
        }

        public int readUnsignedByte()
        {
            int i;
            try
            {
                i = input.readUnsignedByte();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return i;
        }

        public int readUnsignedShort()
        {
            int i;
            try
            {
                i = input.readUnsignedShort();
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return i;
        }

        public int skipBytes(int i)
        {
            try
            {
                i = input.skipBytes(i);
            }
            catch (IOException ioexception)
            {
                throw new IllegalStateException(ioexception);
            }
            return i;
        }

        ByteArrayDataInputStream(byte abyte0[])
        {
            input = new DataInputStream(new ByteArrayInputStream(abyte0));
        }

        ByteArrayDataInputStream(byte abyte0[], int i)
        {
            input = new DataInputStream(new ByteArrayInputStream(abyte0, i, abyte0.length - i));
        }
    }

    private static class ByteArrayDataOutputStream
        implements ByteArrayDataOutput
    {

        final ByteArrayOutputStream byteArrayOutputSteam;
        final DataOutput output;

        public byte[] toByteArray()
        {
            return byteArrayOutputSteam.toByteArray();
        }

        public void write(int i)
        {
            try
            {
                output.write(i);
                return;
            }
            catch (IOException ioexception)
            {
                throw new AssertionError(ioexception);
            }
        }

        public void write(byte abyte0[])
        {
            try
            {
                output.write(abyte0);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new AssertionError(abyte0);
            }
        }

        public void write(byte abyte0[], int i, int j)
        {
            try
            {
                output.write(abyte0, i, j);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                throw new AssertionError(abyte0);
            }
        }

        public void writeBoolean(boolean flag)
        {
            try
            {
                output.writeBoolean(flag);
                return;
            }
            catch (IOException ioexception)
            {
                throw new AssertionError(ioexception);
            }
        }

        public void writeByte(int i)
        {
            try
            {
                output.writeByte(i);
                return;
            }
            catch (IOException ioexception)
            {
                throw new AssertionError(ioexception);
            }
        }

        public void writeBytes(String s)
        {
            try
            {
                output.writeBytes(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new AssertionError(s);
            }
        }

        public void writeChar(int i)
        {
            try
            {
                output.writeChar(i);
                return;
            }
            catch (IOException ioexception)
            {
                throw new AssertionError(ioexception);
            }
        }

        public void writeChars(String s)
        {
            try
            {
                output.writeChars(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new AssertionError(s);
            }
        }

        public void writeDouble(double d)
        {
            try
            {
                output.writeDouble(d);
                return;
            }
            catch (IOException ioexception)
            {
                throw new AssertionError(ioexception);
            }
        }

        public void writeFloat(float f)
        {
            try
            {
                output.writeFloat(f);
                return;
            }
            catch (IOException ioexception)
            {
                throw new AssertionError(ioexception);
            }
        }

        public void writeInt(int i)
        {
            try
            {
                output.writeInt(i);
                return;
            }
            catch (IOException ioexception)
            {
                throw new AssertionError(ioexception);
            }
        }

        public void writeLong(long l)
        {
            try
            {
                output.writeLong(l);
                return;
            }
            catch (IOException ioexception)
            {
                throw new AssertionError(ioexception);
            }
        }

        public void writeShort(int i)
        {
            try
            {
                output.writeShort(i);
                return;
            }
            catch (IOException ioexception)
            {
                throw new AssertionError(ioexception);
            }
        }

        public void writeUTF(String s)
        {
            try
            {
                output.writeUTF(s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw new AssertionError(s);
            }
        }

        ByteArrayDataOutputStream()
        {
            this(new ByteArrayOutputStream());
        }

        ByteArrayDataOutputStream(int i)
        {
            this(new ByteArrayOutputStream(i));
        }

        ByteArrayDataOutputStream(ByteArrayOutputStream bytearrayoutputstream)
        {
            byteArrayOutputSteam = bytearrayoutputstream;
            output = new DataOutputStream(bytearrayoutputstream);
        }
    }


    private static final int BUF_SIZE = 4096;

    private ByteStreams()
    {
    }

    public static long copy(InputSupplier inputsupplier, OutputSupplier outputsupplier)
        throws IOException
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        inputsupplier = (InputStream)inputsupplier.getInput();
        flag = flag1;
        outputsupplier = (OutputStream)outputsupplier.getOutput();
        long l = copy(((InputStream) (inputsupplier)), ((OutputStream) (outputsupplier)));
        flag = false;
        Closeables.close(outputsupplier, false);
        Closeables.close(inputsupplier, false);
        return l;
        Exception exception;
        exception;
        flag = flag1;
        Closeables.close(outputsupplier, true);
        flag = flag1;
        throw exception;
        outputsupplier;
        Closeables.close(inputsupplier, flag);
        throw outputsupplier;
    }

    public static long copy(InputSupplier inputsupplier, OutputStream outputstream)
        throws IOException
    {
        inputsupplier = (InputStream)inputsupplier.getInput();
        long l = copy(((InputStream) (inputsupplier)), outputstream);
        Closeables.close(inputsupplier, false);
        return l;
        outputstream;
        Closeables.close(inputsupplier, true);
        throw outputstream;
    }

    public static long copy(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        byte abyte0[] = new byte[4096];
        long l = 0L;
        do
        {
            int i = inputstream.read(abyte0);
            if (i == -1)
            {
                return l;
            }
            outputstream.write(abyte0, 0, i);
            l += i;
        } while (true);
    }

    public static long copy(ReadableByteChannel readablebytechannel, WritableByteChannel writablebytechannel)
        throws IOException
    {
        ByteBuffer bytebuffer = ByteBuffer.allocate(4096);
        long l = 0L;
        for (; readablebytechannel.read(bytebuffer) != -1; bytebuffer.clear())
        {
            bytebuffer.flip();
            while (bytebuffer.hasRemaining()) 
            {
                l += writablebytechannel.write(bytebuffer);
            }
        }

        return l;
    }

    public static boolean equal(InputSupplier inputsupplier, InputSupplier inputsupplier1)
        throws IOException
    {
        byte abyte0[];
        byte abyte1[];
        boolean flag;
        boolean flag1;
        abyte0 = new byte[4096];
        abyte1 = new byte[4096];
        flag1 = true;
        inputsupplier = (InputStream)inputsupplier.getInput();
        flag = flag1;
        inputsupplier1 = (InputStream)inputsupplier1.getInput();
_L2:
        int i;
        i = read(inputsupplier, abyte0, 0, 4096);
        if (i != read(inputsupplier1, abyte1, 0, 4096))
        {
            break MISSING_BLOCK_LABEL_76;
        }
        flag = Arrays.equals(abyte0, abyte1);
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = false;
        Closeables.close(inputsupplier1, false);
        Closeables.close(inputsupplier, false);
        return false;
        if (i == 4096) goto _L2; else goto _L1
_L1:
        flag = false;
        Closeables.close(inputsupplier1, false);
        Closeables.close(inputsupplier, false);
        return true;
        Exception exception;
        exception;
        flag = flag1;
        Closeables.close(inputsupplier1, true);
        flag = flag1;
        throw exception;
        inputsupplier1;
        Closeables.close(inputsupplier, flag);
        throw inputsupplier1;
    }

    public static long getChecksum(InputSupplier inputsupplier, Checksum checksum)
        throws IOException
    {
        return ((Long)readBytes(inputsupplier, new ByteProcessor(checksum) {

            final Checksum val$checksum;

            public Long getResult()
            {
                long l = checksum.getValue();
                checksum.reset();
                return Long.valueOf(l);
            }

            public volatile Object getResult()
            {
                return getResult();
            }

            public boolean processBytes(byte abyte0[], int i, int j)
            {
                checksum.update(abyte0, i, j);
                return true;
            }

            
            {
                checksum = checksum1;
                super();
            }
        })).longValue();
    }

    public static byte[] getDigest(InputSupplier inputsupplier, MessageDigest messagedigest)
        throws IOException
    {
        return (byte[])readBytes(inputsupplier, new ByteProcessor(messagedigest) {

            final MessageDigest val$md;

            public volatile Object getResult()
            {
                return getResult();
            }

            public byte[] getResult()
            {
                return md.digest();
            }

            public boolean processBytes(byte abyte0[], int i, int j)
            {
                md.update(abyte0, i, j);
                return true;
            }

            
            {
                md = messagedigest;
                super();
            }
        });
    }

    public static InputSupplier join(Iterable iterable)
    {
        return new InputSupplier(iterable) {

            final Iterable val$suppliers;

            public InputStream getInput()
                throws IOException
            {
                return new MultiInputStream(suppliers.iterator());
            }

            public volatile Object getInput()
                throws IOException
            {
                return getInput();
            }

            
            {
                suppliers = iterable;
                super();
            }
        };
    }

    public static transient InputSupplier join(InputSupplier ainputsupplier[])
    {
        return join(((Iterable) (Arrays.asList(ainputsupplier))));
    }

    public static long length(InputSupplier inputsupplier)
        throws IOException
    {
        long l;
        l = 0L;
        inputsupplier = (InputStream)inputsupplier.getInput();
_L2:
        long l1 = inputsupplier.skip(0x7fffffffL);
        if (l1 != 0L)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        int i = inputsupplier.read();
        if (i == -1)
        {
            Closeables.close(inputsupplier, false);
            return l;
        }
        l++;
        continue; /* Loop/switch isn't completed */
        l += l1;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        Closeables.close(inputsupplier, true);
        throw exception;
    }

    public static ByteArrayDataInput newDataInput(byte abyte0[])
    {
        return new ByteArrayDataInputStream(abyte0);
    }

    public static ByteArrayDataInput newDataInput(byte abyte0[], int i)
    {
        Preconditions.checkPositionIndex(i, abyte0.length);
        return new ByteArrayDataInputStream(abyte0, i);
    }

    public static ByteArrayDataOutput newDataOutput()
    {
        return new ByteArrayDataOutputStream();
    }

    public static ByteArrayDataOutput newDataOutput(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Invalid size: %s", new Object[] {
            Integer.valueOf(i)
        });
        return new ByteArrayDataOutputStream(i);
    }

    public static InputSupplier newInputStreamSupplier(byte abyte0[])
    {
        return newInputStreamSupplier(abyte0, 0, abyte0.length);
    }

    public static InputSupplier newInputStreamSupplier(byte abyte0[], int i, int j)
    {
        return new InputSupplier(abyte0, i, j) {

            final byte val$b[];
            final int val$len;
            final int val$off;

            public ByteArrayInputStream getInput()
            {
                return new ByteArrayInputStream(b, off, len);
            }

            public volatile Object getInput()
                throws IOException
            {
                return getInput();
            }

            
            {
                b = abyte0;
                off = i;
                len = j;
                super();
            }
        };
    }

    public static int read(InputStream inputstream, byte abyte0[], int i, int j)
        throws IOException
    {
        if (j < 0)
        {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int k = 0;
        do
        {
            int l;
label0:
            {
                if (k < j)
                {
                    l = inputstream.read(abyte0, i + k, j - k);
                    if (l != -1)
                    {
                        break label0;
                    }
                }
                return k;
            }
            k += l;
        } while (true);
    }

    public static Object readBytes(InputSupplier inputsupplier, ByteProcessor byteprocessor)
        throws IOException
    {
        byte abyte0[];
        boolean flag;
        boolean flag2;
        abyte0 = new byte[4096];
        flag2 = true;
        flag = true;
        inputsupplier = (InputStream)inputsupplier.getInput();
_L4:
        boolean flag1 = flag2;
        int i = inputsupplier.read(abyte0);
        if (i != -1) goto _L2; else goto _L1
_L1:
        flag = false;
_L3:
        flag1 = flag;
        byteprocessor = ((ByteProcessor) (byteprocessor.getResult()));
        Closeables.close(inputsupplier, flag);
        return byteprocessor;
_L2:
        flag1 = flag2;
        boolean flag3 = byteprocessor.processBytes(abyte0, 0, i);
        if (flag3) goto _L4; else goto _L3
        byteprocessor;
        Closeables.close(inputsupplier, flag1);
        throw byteprocessor;
    }

    public static void readFully(InputStream inputstream, byte abyte0[])
        throws IOException
    {
        readFully(inputstream, abyte0, 0, abyte0.length);
    }

    public static void readFully(InputStream inputstream, byte abyte0[], int i, int j)
        throws IOException
    {
        if (read(inputstream, abyte0, i, j) != j)
        {
            throw new EOFException();
        } else
        {
            return;
        }
    }

    public static void skipFully(InputStream inputstream, long l)
        throws IOException
    {
        while (l > 0L) 
        {
            long l1 = inputstream.skip(l);
            if (l1 == 0L)
            {
                if (inputstream.read() == -1)
                {
                    throw new EOFException();
                }
                l--;
            } else
            {
                l -= l1;
            }
        }
    }

    public static InputSupplier slice(InputSupplier inputsupplier, long l, long l1)
    {
        boolean flag1 = true;
        Preconditions.checkNotNull(inputsupplier);
        boolean flag;
        if (l >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "offset is negative");
        if (l1 >= 0L)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "length is negative");
        return new InputSupplier(inputsupplier, l, l1) {

            final long val$length;
            final long val$offset;
            final InputSupplier val$supplier;

            public InputStream getInput()
                throws IOException
            {
                InputStream inputstream = (InputStream)supplier.getInput();
                if (offset > 0L)
                {
                    try
                    {
                        ByteStreams.skipFully(inputstream, offset);
                    }
                    catch (IOException ioexception)
                    {
                        Closeables.closeQuietly(inputstream);
                        throw ioexception;
                    }
                }
                return new LimitInputStream(inputstream, length);
            }

            public volatile Object getInput()
                throws IOException
            {
                return getInput();
            }

            
            {
                supplier = inputsupplier;
                offset = l;
                length = l1;
                super();
            }
        };
    }

    public static byte[] toByteArray(InputSupplier inputsupplier)
        throws IOException
    {
        inputsupplier = (InputStream)inputsupplier.getInput();
        byte abyte0[] = toByteArray(((InputStream) (inputsupplier)));
        Closeables.close(inputsupplier, false);
        return abyte0;
        Exception exception;
        exception;
        Closeables.close(inputsupplier, true);
        throw exception;
    }

    public static byte[] toByteArray(InputStream inputstream)
        throws IOException
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        copy(inputstream, bytearrayoutputstream);
        return bytearrayoutputstream.toByteArray();
    }

    public static void write(byte abyte0[], OutputSupplier outputsupplier)
        throws IOException
    {
        Preconditions.checkNotNull(abyte0);
        outputsupplier = (OutputStream)outputsupplier.getOutput();
        outputsupplier.write(abyte0);
        Closeables.close(outputsupplier, false);
        return;
        abyte0;
        Closeables.close(outputsupplier, true);
        throw abyte0;
    }
}
