// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicReference;

public final class azx
{

    public static ByteBuffer a(File file)
    {
        IOException ioexception2 = null;
        RandomAccessFile randomaccessfile = new RandomAccessFile(file, "r");
        FileChannel filechannel = randomaccessfile.getChannel();
        file = filechannel.map(java.nio.channels.FileChannel.MapMode.READ_ONLY, 0L, file.length()).load();
        if (filechannel != null)
        {
            try
            {
                filechannel.close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception2) { }
        }
        try
        {
            randomaccessfile.close();
        }
        catch (IOException ioexception)
        {
            return file;
        }
        return file;
        file;
        randomaccessfile = null;
_L2:
        if (ioexception2 != null)
        {
            try
            {
                ioexception2.close();
            }
            // Misplaced declaration of an exception variable
            catch (IOException ioexception2) { }
        }
        if (randomaccessfile != null)
        {
            try
            {
                randomaccessfile.close();
            }
            catch (IOException ioexception1) { }
        }
        throw file;
        file;
        continue; /* Loop/switch isn't completed */
        file;
        ioexception2 = filechannel;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static void a(ByteBuffer bytebuffer, File file)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = null;
        RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
        file = obj1;
        obj = randomaccessfile.getChannel();
        file = ((File) (obj));
        ((FileChannel) (obj)).write(bytebuffer);
        file = ((File) (obj));
        ((FileChannel) (obj)).force(false);
        file = ((File) (obj));
        ((FileChannel) (obj)).close();
        file = ((File) (obj));
        randomaccessfile.close();
        if (obj != null)
        {
            try
            {
                ((FileChannel) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (ByteBuffer bytebuffer) { }
        }
        try
        {
            randomaccessfile.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ByteBuffer bytebuffer)
        {
            return;
        }
        bytebuffer;
        file = null;
_L2:
        if (obj != null)
        {
            try
            {
                ((FileChannel) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        throw bytebuffer;
        bytebuffer;
        obj = file;
        file = randomaccessfile;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static byte[] a(ByteBuffer bytebuffer)
    {
        azz azz1;
        if (!bytebuffer.isReadOnly() && bytebuffer.hasArray())
        {
            azz1 = new azz(bytebuffer.array(), bytebuffer.arrayOffset(), bytebuffer.limit());
        } else
        {
            azz1 = null;
        }
        if (azz1 != null && azz1.a == 0 && azz1.b == azz1.c.length)
        {
            return bytebuffer.array();
        } else
        {
            bytebuffer = bytebuffer.asReadOnlyBuffer();
            byte abyte0[] = new byte[bytebuffer.limit()];
            bytebuffer.position(0);
            bytebuffer.get(abyte0);
            return abyte0;
        }
    }

    public static InputStream b(ByteBuffer bytebuffer)
    {
        return new azy(bytebuffer);
    }

    static 
    {
        new AtomicReference();
    }
}
