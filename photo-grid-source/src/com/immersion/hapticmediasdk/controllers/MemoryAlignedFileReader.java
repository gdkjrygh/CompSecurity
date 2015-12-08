// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.immersion.hapticmediasdk.controllers;

import com.immersion.content.HapticHeaderUtils;
import com.immersion.content.HeaderUtils;
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
import rrrrrr.rcrcrr;

// Referenced classes of package com.immersion.hapticmediasdk.controllers:
//            IHapticFileReader

public class MemoryAlignedFileReader
    implements IHapticFileReader
{

    private static final String a = "MemoryAlignedFileReader";
    public static int b041504150415041504150415 = 10;
    public static int b041504150415041504150415 = 1;
    public static int b041504150415041504150415 = 0;
    public static int b041504150415041504150415 = 2;
    private static int h = 0;
    private static int i = 0;
    private static final int k = 1024;
    private static final int l = 3072;
    private static final int t = 16;
    private File b;
    private FileChannel c;
    private rcrcrr d;
    private rcrcrr e;
    private int f;
    private int g;
    private HapticFileInformation j;
    private String m;
    private FileManager n;
    private HeaderUtils o;
    private byte p[];
    private final Profiler q;
    private int r;
    private int s;

    public MemoryAlignedFileReader(String s1, HeaderUtils headerutils)
    {
        int i1;
        try
        {
            super();
            f = 0;
            m = null;
            n = null;
            p = null;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        try
        {
            q = new Profiler();
            m = s1;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        i1 = b041504150415041504150415;
        switch ((i1 * (b041504150415041504150415 + i1)) % b041504150415041504150415)
        {
        default:
            b041504150415041504150415 = b041504150415041504150415();
            b041504150415041504150415 = 92;
            break;

        case 0: // '\0'
            break;
        }
        o = headerutils;
        return;
    }

    public MemoryAlignedFileReader(String s1, FileManager filemanager, int i1)
    {
        try
        {
            super();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
        if (((b041504150415041504150415 + b041504150415041504150415()) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415)
        {
            b041504150415041504150415 = b041504150415041504150415();
            b041504150415041504150415 = b041504150415041504150415();
        }
        f = 0;
        m = null;
        n = null;
        p = null;
        q = new Profiler();
        try
        {
            m = s1;
            n = filemanager;
            o = new HapticHeaderUtils();
            f = i1;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw s1;
        }
    }

    private int a(rcrcrr rcrcrr1, int i1)
    {
        if (((b041504150415041504150415 + b041504150415041504150415) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415)
        {
            b041504150415041504150415 = 0;
            b041504150415041504150415 = b041504150415041504150415();
        }
        int j1;
        int k1;
        try
        {
            j1 = rcrcrr1.mHapticDataOffset;
        }
        // Misplaced declaration of an exception variable
        catch (rcrcrr rcrcrr1)
        {
            throw rcrcrr1;
        }
        try
        {
            k1 = rcrcrr1.mMappedByteBuffer.capacity();
        }
        // Misplaced declaration of an exception variable
        catch (rcrcrr rcrcrr1)
        {
            throw rcrcrr1;
        }
        return (i1 - j1) % k1;
    }

    private boolean a()
    {
        Object obj;
        Object obj1;
        FileChannel filechannel;
        filechannel = null;
        obj1 = null;
        obj = filechannel;
        if (j != null)
        {
            return true;
        }
        obj = filechannel;
        if (b != null) goto _L2; else goto _L1
_L1:
        obj = filechannel;
        if (n == null) goto _L4; else goto _L3
_L3:
        obj = filechannel;
        b = n.getHapticStorageFile(m);
_L2:
        obj = filechannel;
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        obj = filechannel;
        obj1 = new RandomAccessFile(b, "r");
        c = ((RandomAccessFile) (obj1)).getChannel();
        obj = obj1;
        filechannel = c;
        if (filechannel != null) goto _L6; else goto _L5
_L5:
        if (((b041504150415041504150415 + b041504150415041504150415) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415)
        {
            b041504150415041504150415 = b041504150415041504150415();
            b041504150415041504150415 = 96;
            return false;
        }
          goto _L7
        obj1;
_L8:
        try
        {
            Log.e("MemoryAlignedFileReader", "FileNotFoundException");
            n.closeCloseable(((java.io.Closeable) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        try
        {
            n.closeCloseable(c);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw obj;
        }
        return false;
        obj;
        ((Exception) (obj)).printStackTrace();
        return false;
_L6:
        obj = obj1;
        return b();
_L4:
        obj = filechannel;
        if (m == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = filechannel;
        b = new File(m);
        continue; /* Loop/switch isn't completed */
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        filenotfoundexception = ((FileNotFoundException) (obj1));
        if (true) goto _L8; else goto _L7
_L7:
        return false;
        if (true) goto _L2; else goto _L9
_L9:
    }

    private boolean a(int i1)
    {
        if (((b041504150415041504150415 + b041504150415041504150415()) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415)
        {
            b041504150415041504150415 = 31;
            b041504150415041504150415 = 17;
        }
        int j1;
        try
        {
            j1 = g;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        return j1 >= i1;
    }

    private int b(int i1)
    {
        if (o != null)
        {
            int j1 = b041504150415041504150415;
            switch ((j1 * (b041504150415041504150415 + j1)) % b041504150415041504150415)
            {
            default:
                b041504150415041504150415 = 53;
                b041504150415041504150415 = 85;
                // fall through

            case 0: // '\0'
                return o.calculateByteOffsetIntoHapticData(i1);
            }
        } else
        {
            return 0;
        }
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
          goto _L1
_L3:
        int i1;
        int j1;
        bytebuffer.position(4);
        r = (bytebuffer.getInt() + 8) - j1;
        s = j1;
        bytebuffer.position(20);
        p = new byte[i1];
        bytebuffer.duplicate().get(p, 0, i1);
        o.setEncryptedHSI(bytebuffer, i1);
        i1 = o.calculateBlockSize();
        if (i1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i = i1 * 2;
        i1 = o.calculateBlockRate();
        if (i1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        int k1;
        try
        {
            h = i1;
            break MISSING_BLOCK_LABEL_188;
        }
        catch (IOException ioexception)
        {
            ioexception.printStackTrace();
        }
        break; /* Loop/switch isn't completed */
_L1:
        bytebuffer.flip();
        i1 = bytebuffer.getInt();
        j1 = i1 + 28;
        bytebuffer = ByteBuffer.allocate(j1);
        bytebuffer.order(ByteOrder.LITTLE_ENDIAN);
        k1 = c.read(bytebuffer, 0L);
        if (k1 != j1)
        {
            return false;
        }
        if (true) goto _L3; else goto _L2
_L2:
        return false;
        do
        {
        } while (true);
    }

    private static boolean b(rcrcrr rcrcrr1, int i1)
    {
        if (i1 < rcrcrr1.mHapticDataOffset)
        {
            if (((b041504150415041504150415 + b041504150415041504150415) * b041504150415041504150415) % b041504150415041504150415() != b041504150415041504150415)
            {
                b041504150415041504150415 = 22;
                b041504150415041504150415 = b041504150415041504150415();
            }
            return true;
        } else
        {
            return false;
        }
    }

    public static int b041504150415041504150415()
    {
        return 1;
    }

    public static int b041504150415041504150415()
    {
        return 23;
    }

    public static int b041504150415041504150415()
    {
        return 2;
    }

    public static int b041504150415041504150415()
    {
        return 0;
    }

    private int c(int i1)
    {
        return s + b(i1);
    }

    private void c()
    {
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        int i1;
        int j1;
        try
        {
            i1 = e.mHapticDataOffset;
            d = e;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        try
        {
            j1 = i / 2;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        e = d((i1 + 1024) - j1);
        return;
        do
        {
        } while (true);
    }

    private static boolean c(rcrcrr rcrcrr1, int i1)
    {
        int j1;
        int k1;
        try
        {
            j1 = rcrcrr1.mHapticDataOffset;
            k1 = rcrcrr1.mMappedByteBuffer.capacity();
        }
        // Misplaced declaration of an exception variable
        catch (rcrcrr rcrcrr1)
        {
            throw rcrcrr1;
        }
        if (i1 >= j1 + k1)
        {
            if (((b041504150415041504150415 + b041504150415041504150415) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415())
            {
                b041504150415041504150415 = b041504150415041504150415();
                b041504150415041504150415 = b041504150415041504150415();
            }
            return true;
        } else
        {
            return false;
        }
    }

    private int d()
    {
        HeaderUtils headerutils;
        try
        {
            headerutils = o;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (headerutils != null)
        {
            int i1;
            try
            {
                i1 = o.getNumChannels();
            }
            catch (Exception exception1)
            {
                throw exception1;
            }
            if (((b041504150415041504150415 + b041504150415041504150415) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415)
            {
                b041504150415041504150415 = b041504150415041504150415();
                b041504150415041504150415 = b041504150415041504150415();
            }
            return i1;
        } else
        {
            return 0;
        }
    }

    private rcrcrr d(int i1)
    {
        int k1;
        q.startTiming();
        if (i1 >= r)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        k1 = s;
        MappedByteBuffer mappedbytebuffer;
        rcrcrr rcrcrr1;
        int j1;
        int l1;
        try
        {
            j1 = f();
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        try
        {
            l1 = r;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (i1 + 1024 + j1 > l1) goto _L2; else goto _L1
_L1:
        if (((b041504150415041504150415 + b041504150415041504150415) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415)
        {
            b041504150415041504150415 = 31;
            b041504150415041504150415 = 69;
        }
        j1 += 1024;
_L4:
        if (i1 + j1 > g)
        {
            throw new NotEnoughHapticBytesAvailableException("Not enough bytes available yet.");
        }
        break; /* Loop/switch isn't completed */
_L2:
        j1 = r;
        j1 -= i1;
        if (true) goto _L4; else goto _L3
_L3:
        mappedbytebuffer = c.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, k1 + i1, j1);
        if (mappedbytebuffer == null)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        mappedbytebuffer.order(ByteOrder.BIG_ENDIAN);
        rcrcrr1 = new rcrcrr(null);
        rcrcrr1.mMappedByteBuffer = mappedbytebuffer;
        rcrcrr1.mHapticDataOffset = i1;
        return rcrcrr1;
        return null;
    }

    private static boolean d(rcrcrr rcrcrr1, int i1)
    {
label0:
        {
            if (!b(rcrcrr1, i1))
            {
                if (!c(rcrcrr1, i1))
                {
                    break label0;
                }
                i1 = b041504150415041504150415();
                switch ((i1 * (b041504150415041504150415 + i1)) % b041504150415041504150415)
                {
                default:
                    b041504150415041504150415 = b041504150415041504150415();
                    b041504150415041504150415 = 24;
                    break;

                case 0: // '\0'
                    break;
                }
            }
            return true;
        }
        return false;
    }

    private void e()
    {
        Log.d("MemoryAlignedFileReader", "%%%%%%%%%%% logBufferState %%%%%%%%%%%");
        if (d != null)
        {
            Log.d("MemoryAlignedFileReader", (new StringBuilder("mCurrentMMW capacity = ")).append(d.mMappedByteBuffer.capacity()).toString());
            Log.d("MemoryAlignedFileReader", (new StringBuilder()).append("mCurrentMMW position = ").append(d.mMappedByteBuffer.position()).toString());
            Log.d("MemoryAlignedFileReader", (new StringBuilder("mCurrentMMW remaining = ")).append(d.mMappedByteBuffer.remaining()).toString());
            Log.d("MemoryAlignedFileReader", (new StringBuilder("mCurrentMMW mHapticDataOffset = ")).append(d.mHapticDataOffset).toString());
            Log.d("MemoryAlignedFileReader", (new StringBuilder("mCurrentMMW mHapticDataOffset + position = ")).append(d.mHapticDataOffset + d.mMappedByteBuffer.position()).toString());
        } else
        {
            Log.d("MemoryAlignedFileReader", "mCurrentMMW is null");
        }
        Log.d("MemoryAlignedFileReader", "--------------------------------------");
        if (e != null)
        {
            Log.d("MemoryAlignedFileReader", (new StringBuilder("mNextMMW capacity = ")).append(e.mMappedByteBuffer.capacity()).toString());
            Log.d("MemoryAlignedFileReader", (new StringBuilder("mNextMMW position = ")).append(e.mMappedByteBuffer.position()).toString());
            Log.d("MemoryAlignedFileReader", (new StringBuilder()).append("mNextMMW remaining = ").append(e.mMappedByteBuffer.remaining()).toString());
            Log.d("MemoryAlignedFileReader", (new StringBuilder("mNextMMW mHapticDataOffset = ")).append(e.mHapticDataOffset).toString());
            StringBuilder stringbuilder = new StringBuilder("mNextMMW mHapticDataOffset + position = ");
            if (((b041504150415041504150415 + b041504150415041504150415()) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415)
            {
                b041504150415041504150415 = b041504150415041504150415();
                b041504150415041504150415 = b041504150415041504150415();
            }
            Log.d("MemoryAlignedFileReader", stringbuilder.append(e.mHapticDataOffset + e.mMappedByteBuffer.position()).toString());
        } else
        {
            Log.d("MemoryAlignedFileReader", "mNextMMW is null");
        }
        Log.d("MemoryAlignedFileReader", "%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
    }

    private static boolean e(rcrcrr rcrcrr1, int i1)
    {
        int j1;
        int k1;
        boolean flag;
        try
        {
            j1 = i;
        }
        // Misplaced declaration of an exception variable
        catch (rcrcrr rcrcrr1)
        {
            throw rcrcrr1;
        }
        k1 = b041504150415041504150415;
        switch ((k1 * (b041504150415041504150415 + k1)) % b041504150415041504150415)
        {
        default:
            b041504150415041504150415 = 4;
            b041504150415041504150415 = 62;
            break;

        case 0: // '\0'
            break;
        }
        flag = c(rcrcrr1, j1 + i1);
        return flag;
    }

    private int f()
    {
        int i1;
        for (i1 = 0; (i1 + 1024) % (i / 2) != 0; i1 += 16) { }
        return i1;
    }

    public boolean bufferAtPlaybackPosition(int i1)
    {
        if (a()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if ((i1 = b(i1)) >= r) goto _L1; else goto _L3
_L3:
        if (d != null && !d(d, i1))
        {
            break MISSING_BLOCK_LABEL_188;
        }
        int j1;
        int k1;
        if (e != null && !d(e, i1) && !e(e, i1))
        {
            break MISSING_BLOCK_LABEL_184;
        }
        if (d == null || d.mHapticDataOffset != i1)
        {
            d = d(i1);
        }
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_162;
        }
        j1 = e.mHapticDataOffset;
        k1 = i / 2;
        if (((b041504150415041504150415() + b041504150415041504150415) * b041504150415041504150415()) % b041504150415041504150415 != b041504150415041504150415)
        {
            b041504150415041504150415 = 98;
            b041504150415041504150415 = 73;
        }
        if (j1 == (i1 + 1024) - k1)
        {
            break MISSING_BLOCK_LABEL_223;
        }
        try
        {
            e = d((i1 + 1024) - i / 2);
        }
        catch (NotEnoughHapticBytesAvailableException notenoughhapticbytesavailableexception)
        {
            return false;
        }
        catch (IOException ioexception)
        {
            return false;
        }
        break MISSING_BLOCK_LABEL_223;
        c();
        if (d != null)
        {
            d.mMappedByteBuffer.position(a(d, i1));
        }
        return true;
        return true;
    }

    public void close()
    {
        n.closeCloseable(c);
        o.dispose();
    }

    public long getBlockOffset(long l1)
    {
        long l2 = h;
        int i1 = b041504150415041504150415;
        switch ((i1 * (b041504150415041504150415 + i1)) % b041504150415041504150415)
        {
        default:
            b041504150415041504150415 = b041504150415041504150415();
            b041504150415041504150415 = 40;
            // fall through

        case 0: // '\0'
            return ((l1 % l2) * 16L) / (long)h;
        }
    }

    public int getBlockSizeMS()
    {
        int i1 = h;
        if (((b041504150415041504150415 + b041504150415041504150415) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415)
        {
            b041504150415041504150415 = 57;
            b041504150415041504150415 = 94;
        }
        return i1;
    }

    public byte[] getBufferForPlaybackPosition(int i1)
    {
        boolean flag = false;
        if (d != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if ((i1 = b(i1)) >= r - i) goto _L1; else goto _L3
_L3:
        byte abyte0[];
        MappedByteBuffer mappedbytebuffer;
        int k1;
        try
        {
            abyte0 = new byte[i];
            if (d.mMappedByteBuffer.remaining() < i)
            {
                c();
            }
            k1 = d.mMappedByteBuffer.position() + d.mHapticDataOffset;
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return null;
        }
        if (k1 >= i1 && k1 <= i1) goto _L5; else goto _L4
_L4:
        i1 = (i1 - k1) + d.mMappedByteBuffer.position();
        if (i1 >= 0) goto _L7; else goto _L6
_L6:
        i1 = ((flag) ? 1 : 0);
_L10:
        d.mMappedByteBuffer.position(i1);
_L5:
        i1 = d.mMappedByteBuffer.remaining();
        int j1 = b041504150415041504150415;
        switch ((j1 * (b041504150415041504150415 + j1)) % b041504150415041504150415())
        {
        default:
            b041504150415041504150415 = b041504150415041504150415();
            b041504150415041504150415 = b041504150415041504150415();
            break;

        case 0: // '\0'
            break;
        }
        mappedbytebuffer = d.mMappedByteBuffer;
        if (i1 >= i)
        {
            break MISSING_BLOCK_LABEL_236;
        }
_L8:
        mappedbytebuffer.get(abyte0, 0, i1);
        d.mMappedByteBuffer.position(d.mMappedByteBuffer.position() - i / 2);
        return abyte0;
        i1 = i;
          goto _L8
_L7:
        if (d.mMappedByteBuffer.limit() >= i1)
        {
            continue; /* Loop/switch isn't completed */
        }
        i1 = d.mMappedByteBuffer.limit();
        i1--;
        if (true) goto _L10; else goto _L9
_L9:
    }

    public byte[] getEncryptedHapticHeader()
    {
        return p;
    }

    public int getHapticBlockIndex(long l1)
    {
        int i1 = (int)l1;
        int j1;
        try
        {
            i1 = b(i1);
            j1 = f;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((b041504150415041504150415 + b041504150415041504150415()) * b041504150415041504150415) % b041504150415041504150415 != b041504150415041504150415)
        {
            b041504150415041504150415 = 2;
            b041504150415041504150415 = b041504150415041504150415();
        }
        if (j1 != 2)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        return i1 / 16;
        if (f < 3)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        j1 = d();
        try
        {
            i1 /= j1 * 16;
        }
        catch (Exception exception1)
        {
            throw exception1;
        }
        return i1;
        return 0;
    }

    public HapticFileInformation getHapticFileInformation()
    {
        return j;
    }

    public void setBlockSizeMS(int i1)
    {
        int j1 = b041504150415041504150415;
        switch ((j1 * (b041504150415041504150415() + j1)) % b041504150415041504150415)
        {
        default:
            b041504150415041504150415 = b041504150415041504150415();
            b041504150415041504150415 = b041504150415041504150415();
            break;

        case 0: // '\0'
            break;
        }
        try
        {
            h = i1;
            return;
        }
        catch (Exception exception)
        {
            throw exception;
        }
    }

    public void setBytesAvailable(int i1)
    {
        g = i1;
        if (g <= 0)
        {
            g = i1;
            a();
        }
    }

    static 
    {
        h = 80;
        i = 0;
    }
}
