// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.immersion.hapticmediasdk.controllers;

import com.immersion.content.HapticHeaderUtils;
import com.immersion.content.HeaderUtils;
import com.immersion.hapticmediasdk.utils.FileManager;
import com.immersion.hapticmediasdk.utils.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;

// Referenced classes of package com.immersion.hapticmediasdk.controllers:
//            MemoryAlignedFileReader, MemoryMappedFileReader, IHapticFileReader

public class FileReaderFactory
{

    private static final String a = "FileReaderFactory";
    public static int b044604460446044604460446 = 2;
    public static int b044604460446044604460446 = 0;
    public static int b044604460446044604460446 = 72;
    public static int b044604460446044604460446 = 1;

    public FileReaderFactory()
    {
        int i = b044604460446044604460446;
        switch ((i * (b044604460446044604460446() + i)) % b044604460446044604460446)
        {
        default:
            b044604460446044604460446 = b044604460446044604460446();
            b044604460446044604460446 = b044604460446044604460446();
            // fall through

        case 0: // '\0'
            super();
            break;
        }
    }

    private static int a(String s, FileManager filemanager)
    {
        int i;
        int j;
        boolean flag;
        {
            j = 0;
            flag = false;
            if (filemanager == null)
            {
                break MISSING_BLOCK_LABEL_32;
            }
            i = ((flag) ? 1 : 0);
            try
            {
                s = filemanager.getHapticStorageFile(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                try
                {
                    s.printStackTrace();
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    throw s;
                }
                return i;
            }
        }
        i = ((flag) ? 1 : 0);
        if (s.length() == 0L)
        {
            return -1;
        }
        break; /* Loop/switch isn't completed */
        i = j;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        i = ((flag) ? 1 : 0);
        s = new File(s);
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_18;
_L1:
        i = ((flag) ? 1 : 0);
        s = (new RandomAccessFile(s, "r")).getChannel();
        i = j;
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        i = ((flag) ? 1 : 0);
        j = a(((FileChannel) (s)));
        i = j;
        s.close();
        try
        {
            throw new NullPointerException();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            b044604460446044604460446 = b044604460446044604460446();
        }
        i = j;
        return i;
    }

    private static int a(FileChannel filechannel)
    {
        ByteBuffer bytebuffer;
        int i;
        try
        {
            bytebuffer = ByteBuffer.allocate(4);
            bytebuffer.order(ByteOrder.LITTLE_ENDIAN);
        }
        // Misplaced declaration of an exception variable
        catch (FileChannel filechannel)
        {
            filechannel.printStackTrace();
            return 0;
        }
        if (((b044604460446044604460446() + b044604460446044604460446()) * b044604460446044604460446()) % b044604460446044604460446() != b044604460446044604460446)
        {
            b044604460446044604460446 = b044604460446044604460446();
            b044604460446044604460446 = 93;
        }
        bytebuffer.position(0);
        if (filechannel.read(bytebuffer, 16L) != 4)
        {
            return 0;
        }
          goto _L1
_L3:
        bytebuffer.position(4);
        bytebuffer.getInt();
        bytebuffer.position(20);
        filechannel = new HapticHeaderUtils();
        filechannel.setEncryptedHSI(bytebuffer, i);
        i = filechannel.getMajorVersionNumber();
        return i;
_L1:
        bytebuffer.flip();
        i = bytebuffer.getInt();
        int j = i + 28;
        int k;
        bytebuffer = ByteBuffer.allocate(j);
        bytebuffer.order(ByteOrder.LITTLE_ENDIAN);
        k = filechannel.read(bytebuffer, 0L);
        if (k != j)
        {
            return 0;
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

    public static int b044604460446044604460446()
    {
        return 0;
    }

    public static int b044604460446044604460446()
    {
        return 2;
    }

    public static int b044604460446044604460446()
    {
        return 1;
    }

    public static int b044604460446044604460446()
    {
        return 47;
    }

    public static IHapticFileReader getHapticFileReaderInstance(String s, FileManager filemanager)
    {
        a(s, filemanager);
        JVM INSTR tableswitch -1 3: default 132
    //                   -1 49
    //                   0 40
    //                   1 120
    //                   2 98
    //                   3 109;
           goto _L1 _L2 _L1 _L3 _L4 _L5
_L1:
        Log.e("FileReaderFactory", "Unsupported HAPT file version");
        return null;
_L2:
        try
        {
            Log.i("FileReaderFactory", "Can't retrieve Major version! Not enough bytes available yet.");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            if (((b044604460446044604460446 + b044604460446044604460446) * b044604460446044604460446) % b044604460446044604460446 != b044604460446044604460446())
            {
                b044604460446044604460446 = b044604460446044604460446();
                b044604460446044604460446 = b044604460446044604460446();
                return null;
            } else
            {
                return null;
            }
        }
        return null;
_L4:
        return new MemoryAlignedFileReader(s, filemanager, 2);
_L5:
        return new MemoryAlignedFileReader(s, filemanager, 3);
_L3:
        s = new MemoryMappedFileReader(s, filemanager);
        return s;
    }
}
