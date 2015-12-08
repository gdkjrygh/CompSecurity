// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.immersion.hapticmediasdk.controllers;

import com.immersion.hapticmediasdk.models.HapticFileInformation;
import com.immersion.hapticmediasdk.models.NotEnoughHapticBytesAvailableException;
import com.immersion.hapticmediasdk.utils.FileManager;
import com.immersion.hapticmediasdk.utils.Log;
import com.immersion.hapticmediasdk.utils.Profiler;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import rrrrrr.ccrrrr;

// Referenced classes of package com.immersion.hapticmediasdk.controllers:
//            IHapticFileReader

public class MemoryMappedFileReader
    implements IHapticFileReader
{

    private static final String a = "MemoryMappedFileReader";
    public static int b044A044A044A044A044A044A = 1;
    public static int b044A044A044A044A044A044A = 93;
    public static int b044A044A044A044A044A044A = 0;
    public static int b044A044A044A044A044A044A = 2;
    private static int g = 0;
    private static int h = 0;
    private static final int j = 4096;
    private static final int k = 12288;
    private File b;
    private FileChannel c;
    private ccrrrr d;
    private ccrrrr e;
    private int f;
    private HapticFileInformation i;
    private String l;
    private final Profiler m = new Profiler();
    private FileManager n;

    public MemoryMappedFileReader(String s, FileManager filemanager)
    {
        try
        {
            super();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        if (((b044A044A044A044A044A044A() + b044A044A044A044A044A044A) * b044A044A044A044A044A044A()) % b044A044A044A044A044A044A != b044A044A044A044A044A044A)
        {
            b044A044A044A044A044A044A = b044A044A044A044A044A044A();
        }
        try
        {
            l = s;
            n = filemanager;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
    }

    private int a(ccrrrr ccrrrr1, int i1)
    {
        int j1 = ccrrrr1.mHapticDataOffset;
        int k1 = b044A044A044A044A044A044A;
        switch ((k1 * (b044A044A044A044A044A044A() + k1)) % b044A044A044A044A044A044A)
        {
        default:
            b044A044A044A044A044A044A = b044A044A044A044A044A044A();
            b044A044A044A044A044A044A = b044A044A044A044A044A044A();
            // fall through

        case 0: // '\0'
            return (i1 - j1) % ccrrrr1.mMappedByteBuffer.capacity();
        }
    }

    private boolean a()
    {
        Object obj;
        RandomAccessFile randomaccessfile;
        Object obj1;
        obj1 = null;
        randomaccessfile = null;
        obj = obj1;
        break MISSING_BLOCK_LABEL_6;
_L2:
        obj = obj1;
        if (b != null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        obj = obj1;
        b = n.getHapticStorageFile(l);
        obj = obj1;
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        obj = obj1;
        randomaccessfile = new RandomAccessFile(b, "r");
        c = randomaccessfile.getChannel();
        obj = randomaccessfile;
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        obj = randomaccessfile;
        boolean flag;
        try
        {
            return b();
        }
        catch (FileNotFoundException filenotfoundexception)
        {
            randomaccessfile = ((RandomAccessFile) (obj));
            obj = filenotfoundexception;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return false;
        }
        break MISSING_BLOCK_LABEL_113;
        if (i != null)
        {
            return true;
        }
        obj = obj1;
        flag = a(12288);
        if (!flag) goto _L2; else goto _L1
_L1:
        return false;
_L4:
        Log.e("MemoryMappedFileReader", ((FileNotFoundException) (obj)).getMessage());
        n.closeCloseable(randomaccessfile);
        n.closeCloseable(c);
        return false;
        exception;
        if (true) goto _L4; else goto _L3
_L3:
        return false;
    }

    private boolean a(int i1)
    {
        boolean flag;
        if (f < i1)
        {
            flag = false;
        } else
        {
            flag = true;
            if (((b044A044A044A044A044A044A() + b044A044A044A044A044A044A) * b044A044A044A044A044A044A()) % b044A044A044A044A044A044A != b044A044A044A044A044A044A)
            {
                b044A044A044A044A044A044A = 58;
                b044A044A044A044A044A044A = 75;
                return true;
            }
        }
        return flag;
    }

    private int b(int i1)
    {
        int k1 = i1 / (1000 / i.getSampleHertz());
        if (((b044A044A044A044A044A044A + b044A044A044A044A044A044A) * b044A044A044A044A044A044A) % b044A044A044A044A044A044A != b044A044A044A044A044A044A)
        {
            b044A044A044A044A044A044A = 77;
            b044A044A044A044A044A044A = 64;
        }
        i1 = i.getBitsPerSample();
        int j1 = i.getNumberOfChannels();
        float f1 = (float)(i1 * j1) / 8F;
        float f2 = (i1 * j1) / 8;
        j1 = (int)f2;
        i1 = j1;
        if (f1 > f2)
        {
            i1 = j1 + 1;
        }
        return i1 * k1;
    }

    private boolean b()
    {
        ByteBuffer bytebuffer;
        bytebuffer = ByteBuffer.allocate(4);
        bytebuffer.order(ByteOrder.LITTLE_ENDIAN);
        bytebuffer.position(0);
        if (c.read(bytebuffer, 16L) != 4)
        {
            return false;
        }
        com.immersion.hapticmediasdk.models.HapticFileInformation.Builder builder;
        int ai[];
        byte byte0;
        bytebuffer.flip();
        int i1 = bytebuffer.getInt() + 28;
        bytebuffer = ByteBuffer.allocate(i1);
        bytebuffer.order(ByteOrder.LITTLE_ENDIAN);
        if (c.read(bytebuffer, 0L) != i1)
        {
            break MISSING_BLOCK_LABEL_382;
        }
        bytebuffer.flip();
        builder = new com.immersion.hapticmediasdk.models.HapticFileInformation.Builder();
        builder.setFilePath(b.getAbsolutePath());
        bytebuffer.position(4);
        builder.setTotalFileLength(bytebuffer.getInt() + 8);
        bytebuffer.position(20);
        builder.setMajorVersion(bytebuffer.get());
        builder.setMinorVersion(bytebuffer.get());
        builder.setEncoding(bytebuffer.get());
        bytebuffer.position(24);
        builder.setSampleHertz(bytebuffer.getInt());
        builder.setBitsPerSample(bytebuffer.get() | bytebuffer.get() << 8);
        byte0 = bytebuffer.get();
        builder.setNumberOfChannels(byte0);
        ai = new int[byte0];
        int j1 = 0;
_L2:
        if (j1 >= byte0)
        {
            break; /* Loop/switch isn't completed */
        }
        ai[j1] = bytebuffer.get();
        j1++;
        if (true) goto _L2; else goto _L1
_L1:
        builder.setActuatorArray(ai);
        builder.setCompressionScheme(bytebuffer.get());
        bytebuffer.position(bytebuffer.position() + 4);
        builder.setHapticDataLength(bytebuffer.getInt());
        builder.setHapticDataStartByteOffset(bytebuffer.position());
        i = builder.build();
        j1 = (g * i.getSampleHertz()) / 1000;
        int k1 = b044A044A044A044A044A044A;
        switch ((k1 * (b044A044A044A044A044A044A() + k1)) % b044A044A044A044A044A044A)
        {
        default:
            b044A044A044A044A044A044A = b044A044A044A044A044A044A();
            b044A044A044A044A044A044A = 51;
            break;

        case 0: // '\0'
            break;
        }
        h = (j1 * i.getBitsPerSample() * i.getNumberOfChannels()) / 8;
        return true;
        IOException ioexception;
        ioexception;
        ioexception.printStackTrace();
        return false;
    }

    private static boolean b(ccrrrr ccrrrr1, int i1)
    {
        if (i1 < ccrrrr1.mHapticDataOffset)
        {
            i1 = b044A044A044A044A044A044A;
            switch ((i1 * (b044A044A044A044A044A044A + i1)) % b044A044A044A044A044A044A)
            {
            default:
                b044A044A044A044A044A044A = b044A044A044A044A044A044A();
                b044A044A044A044A044A044A = b044A044A044A044A044A044A();
                // fall through

            case 0: // '\0'
                return true;
            }
        } else
        {
            return false;
        }
    }

    public static int b044A044A044A044A044A044A()
    {
        return 0;
    }

    public static int b044A044A044A044A044A044A()
    {
        return 1;
    }

    public static int b044A044A044A044A044A044A()
    {
        return 73;
    }

    public static int b044A044A044A044A044A044A()
    {
        return 2;
    }

    private int c(int i1)
    {
        HapticFileInformation hapticfileinformation;
        int j1;
        try
        {
            hapticfileinformation = i;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((b044A044A044A044A044A044A + b044A044A044A044A044A044A) * b044A044A044A044A044A044A) % b044A044A044A044A044A044A != b044A044A044A044A044A044A)
        {
            b044A044A044A044A044A044A = 98;
            b044A044A044A044A044A044A = 21;
        }
        j1 = hapticfileinformation.getHapticDataStartByteOffset();
        try
        {
            i1 = b(i1);
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        return j1 + i1;
    }

    private void c()
    {
        ccrrrr ccrrrr1;
        int i1;
        try
        {
            if (e == null)
            {
                return;
            }
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        i1 = e.mHapticDataOffset;
        ccrrrr1 = e;
        try
        {
            d = ccrrrr1;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((b044A044A044A044A044A044A() + b044A044A044A044A044A044A) * b044A044A044A044A044A044A()) % b044A044A044A044A044A044A() != b044A044A044A044A044A044A())
        {
            b044A044A044A044A044A044A = 80;
            b044A044A044A044A044A044A = 68;
        }
        e = d(i1 + 4096);
        return;
    }

    private static boolean c(ccrrrr ccrrrr1, int i1)
    {
        if (i1 >= ccrrrr1.mHapticDataOffset + ccrrrr1.mMappedByteBuffer.capacity())
        {
            if (((b044A044A044A044A044A044A + b044A044A044A044A044A044A) * b044A044A044A044A044A044A) % b044A044A044A044A044A044A != b044A044A044A044A044A044A)
            {
                b044A044A044A044A044A044A = b044A044A044A044A044A044A();
                b044A044A044A044A044A044A = b044A044A044A044A044A044A();
            }
            return true;
        } else
        {
            return false;
        }
    }

    private ccrrrr d(int i1)
    {
        m.startTiming();
        if (i1 < i.getHapticDataLength())
        {
            int k1 = i.getHapticDataStartByteOffset();
            MappedByteBuffer mappedbytebuffer;
            int j1;
            if (i1 + 4096 <= i.getHapticDataLength())
            {
                j1 = 4096;
            } else
            {
                j1 = i.getHapticDataLength() - i1;
            }
            if (i1 + j1 > f)
            {
                throw new NotEnoughHapticBytesAvailableException("Not enough bytes available yet.");
            }
            mappedbytebuffer = c.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, k1 + i1, j1);
            if (mappedbytebuffer != null)
            {
                mappedbytebuffer.order(ByteOrder.LITTLE_ENDIAN);
                ccrrrr ccrrrr1 = new ccrrrr(null);
                ccrrrr1.mMappedByteBuffer = mappedbytebuffer;
                ccrrrr1.mHapticDataOffset = i1;
                return ccrrrr1;
            }
        }
        return null;
    }

    private void d()
    {
        Log.d("MemoryMappedFileReader", "%%%%%%%%%%% logBufferState %%%%%%%%%%%");
        if (d != null)
        {
            Log.d("MemoryMappedFileReader", (new StringBuilder("mCurrentMMW capacity = ")).append(d.mMappedByteBuffer.capacity()).toString());
            Log.d("MemoryMappedFileReader", (new StringBuilder("mCurrentMMW position = ")).append(d.mMappedByteBuffer.position()).toString());
            Log.d("MemoryMappedFileReader", (new StringBuilder("mCurrentMMW remaining = ")).append(d.mMappedByteBuffer.remaining()).toString());
            Log.d("MemoryMappedFileReader", (new StringBuilder("mCurrentMMW mHapticDataOffset = ")).append(d.mHapticDataOffset).toString());
            StringBuilder stringbuilder = (new StringBuilder()).append("mCurrentMMW mHapticDataOffset + position = ");
            ccrrrr ccrrrr1 = d;
            if (((b044A044A044A044A044A044A() + b044A044A044A044A044A044A) * b044A044A044A044A044A044A()) % b044A044A044A044A044A044A() != b044A044A044A044A044A044A())
            {
                b044A044A044A044A044A044A = b044A044A044A044A044A044A();
                b044A044A044A044A044A044A = b044A044A044A044A044A044A();
            }
            Log.d("MemoryMappedFileReader", stringbuilder.append(ccrrrr1.mHapticDataOffset + d.mMappedByteBuffer.position()).toString());
        } else
        {
            Log.d("MemoryMappedFileReader", "mCurrentMMW is null");
        }
        Log.d("MemoryMappedFileReader", "--------------------------------------");
        if (e != null)
        {
            Log.d("MemoryMappedFileReader", (new StringBuilder()).append("mNextMMW capacity = ").append(e.mMappedByteBuffer.capacity()).toString());
            Log.d("MemoryMappedFileReader", (new StringBuilder("mNextMMW position = ")).append(e.mMappedByteBuffer.position()).toString());
            Log.d("MemoryMappedFileReader", (new StringBuilder()).append("mNextMMW remaining = ").append(e.mMappedByteBuffer.remaining()).toString());
            Log.d("MemoryMappedFileReader", (new StringBuilder("mNextMMW mHapticDataOffset = ")).append(e.mHapticDataOffset).toString());
            Log.d("MemoryMappedFileReader", (new StringBuilder("mNextMMW mHapticDataOffset + position = ")).append(e.mHapticDataOffset + e.mMappedByteBuffer.position()).toString());
        } else
        {
            Log.d("MemoryMappedFileReader", "mNextMMW is null");
        }
        Log.d("MemoryMappedFileReader", "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }

    private static boolean d(ccrrrr ccrrrr1, int i1)
    {
label0:
        {
label1:
            {
                boolean flag;
                try
                {
                    if (b(ccrrrr1, i1))
                    {
                        break label1;
                    }
                    flag = c(ccrrrr1, i1);
                }
                // Misplaced declaration of an exception variable
                catch (ccrrrr ccrrrr1)
                {
                    throw ccrrrr1;
                }
                if (((b044A044A044A044A044A044A + b044A044A044A044A044A044A) * b044A044A044A044A044A044A) % b044A044A044A044A044A044A != b044A044A044A044A044A044A)
                {
                    b044A044A044A044A044A044A = 52;
                    b044A044A044A044A044A044A = 7;
                }
                if (!flag)
                {
                    break label0;
                }
            }
            return true;
        }
        return false;
    }

    private static boolean e(ccrrrr ccrrrr1, int i1)
    {
        int j1 = b044A044A044A044A044A044A;
        switch ((j1 * (b044A044A044A044A044A044A() + j1)) % b044A044A044A044A044A044A)
        {
        default:
            b044A044A044A044A044A044A = 57;
            b044A044A044A044A044A044A = 27;
            break;

        case 0: // '\0'
            break;
        }
        boolean flag;
        try
        {
            j1 = h;
        }
        // Misplaced declaration of an exception variable
        catch (ccrrrr ccrrrr1)
        {
            throw ccrrrr1;
        }
        try
        {
            flag = c(ccrrrr1, j1 + i1);
        }
        // Misplaced declaration of an exception variable
        catch (ccrrrr ccrrrr1)
        {
            throw ccrrrr1;
        }
        return flag;
    }

    public boolean bufferAtPlaybackPosition(int i1)
    {
        if (!a())
        {
            return false;
        }
        boolean flag;
        i1 = b(i1);
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        flag = d(d, i1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        if (e == null || d(e, i1))
        {
            break MISSING_BLOCK_LABEL_70;
        }
        flag = e(e, i1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        int j1;
        if (d == null)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        j1 = d.mHapticDataOffset;
        if (j1 == i1)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        d = d(i1);
        if (e == null || e.mHapticDataOffset != i1 + 4096)
        {
            e = d(i1 + 4096);
        }
        break MISSING_BLOCK_LABEL_203;
        c();
        do
        {
        } while (true);
        NotEnoughHapticBytesAvailableException notenoughhapticbytesavailableexception;
        notenoughhapticbytesavailableexception;
        try
        {
            Log.w("MemoryMappedFileReader", notenoughhapticbytesavailableexception.getMessage());
        }
        catch (Exception exception)
        {
            throw exception;
        }
        return false;
        Object obj;
        IOException ioexception;
        try
        {
            obj = d;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        obj = d.mMappedByteBuffer;
        ((MappedByteBuffer) (obj)).position(a(d, i1));
        break MISSING_BLOCK_LABEL_205;
        ioexception;
        ioexception.printStackTrace();
        return false;
        return true;
        return true;
    }

    public void close()
    {
        int i1 = b044A044A044A044A044A044A;
        switch ((i1 * (b044A044A044A044A044A044A() + i1)) % b044A044A044A044A044A044A)
        {
        default:
            b044A044A044A044A044A044A = b044A044A044A044A044A044A();
            b044A044A044A044A044A044A = 35;
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            n.closeCloseable(c);
            return;
        }
        catch (Exception exception)
        {
            throw exception;
        }
    }

    public long getBlockOffset(long l1)
    {
        int i1 = b044A044A044A044A044A044A;
        switch ((i1 * (b044A044A044A044A044A044A + i1)) % b044A044A044A044A044A044A)
        {
        default:
            b044A044A044A044A044A044A = 89;
            b044A044A044A044A044A044A = 47;
            // fall through

        case 0: // '\0'
            return 0L;
        }
    }

    public int getBlockSizeMS()
    {
        int i1;
        try
        {
            i1 = g;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((b044A044A044A044A044A044A + b044A044A044A044A044A044A) * b044A044A044A044A044A044A) % b044A044A044A044A044A044A != b044A044A044A044A044A044A)
        {
            b044A044A044A044A044A044A = b044A044A044A044A044A044A();
            b044A044A044A044A044A044A = b044A044A044A044A044A044A();
        }
        return i1;
    }

    public byte[] getBufferForPlaybackPosition(int i1)
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Object obj;
        obj = d;
        if (((b044A044A044A044A044A044A + b044A044A044A044A044A044A) * b044A044A044A044A044A044A) % b044A044A044A044A044A044A != b044A044A044A044A044A044A)
        {
            b044A044A044A044A044A044A = b044A044A044A044A044A044A();
            b044A044A044A044A044A044A = 47;
        }
        if (((ccrrrr) (obj)).mHapticDataOffset + d.mMappedByteBuffer.position() >= i.getHapticDataLength()) goto _L1; else goto _L3
_L3:
        int j1;
        obj = new byte[h];
        if (h < d.mMappedByteBuffer.remaining())
        {
            break MISSING_BLOCK_LABEL_190;
        }
        j1 = d.mMappedByteBuffer.remaining();
        i1 = h - j1;
        d.mMappedByteBuffer.get(((byte []) (obj)), 0, j1);
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        if (e.mMappedByteBuffer.remaining() < i1)
        {
            try
            {
                i1 = e.mMappedByteBuffer.remaining();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
                return null;
            }
        }
        e.mMappedByteBuffer.get(((byte []) (obj)), j1, i1);
        c();
_L4:
        return ((byte []) (obj));
        d.mMappedByteBuffer.get(((byte []) (obj)), 0, h);
          goto _L4
    }

    public byte[] getEncryptedHapticHeader()
    {
        return new byte[0];
    }

    public int getHapticBlockIndex(long l1)
    {
        return 0;
    }

    public HapticFileInformation getHapticFileInformation()
    {
        return i;
    }

    public void setBlockSizeMS(int i1)
    {
        g = i1;
        i1 = b044A044A044A044A044A044A();
        switch ((i1 * (b044A044A044A044A044A044A() + i1)) % b044A044A044A044A044A044A)
        {
        default:
            b044A044A044A044A044A044A = 15;
            // fall through

        case 0: // '\0'
            return;
        }
    }

    public void setBytesAvailable(int i1)
    {
        f = i1;
        if (((b044A044A044A044A044A044A + b044A044A044A044A044A044A()) * b044A044A044A044A044A044A) % b044A044A044A044A044A044A != b044A044A044A044A044A044A())
        {
            b044A044A044A044A044A044A = 62;
            b044A044A044A044A044A044A = 4;
        }
        a();
    }

    static 
    {
        g = 40;
        if (((b044A044A044A044A044A044A + b044A044A044A044A044A044A) * b044A044A044A044A044A044A) % b044A044A044A044A044A044A != b044A044A044A044A044A044A)
        {
            b044A044A044A044A044A044A = 55;
            b044A044A044A044A044A044A = 34;
        }
        h = 0;
    }
}
