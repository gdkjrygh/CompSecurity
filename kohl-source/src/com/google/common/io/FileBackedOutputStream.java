// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.google.common.io:
//            InputSupplier

public final class FileBackedOutputStream extends OutputStream
{
    private static class MemoryOutput extends ByteArrayOutputStream
    {

        byte[] getBuffer()
        {
            return buf;
        }

        int getCount()
        {
            return count;
        }

        private MemoryOutput()
        {
        }

    }


    private File file;
    private final int fileThreshold;
    private MemoryOutput memory;
    private OutputStream out;
    private final boolean resetOnFinalize;
    private final InputSupplier supplier;

    public FileBackedOutputStream(int i)
    {
        this(i, false);
    }

    public FileBackedOutputStream(int i, boolean flag)
    {
        fileThreshold = i;
        resetOnFinalize = flag;
        memory = new MemoryOutput();
        out = memory;
        if (flag)
        {
            supplier = new InputSupplier() {

                final FileBackedOutputStream this$0;

                protected void finalize()
                {
                    try
                    {
                        reset();
                        return;
                    }
                    catch (Throwable throwable)
                    {
                        throwable.printStackTrace(System.err);
                    }
                }

                public InputStream getInput()
                    throws IOException
                {
                    return openStream();
                }

                public volatile Object getInput()
                    throws IOException
                {
                    return getInput();
                }

            
            {
                this$0 = FileBackedOutputStream.this;
                super();
            }
            };
            return;
        } else
        {
            supplier = new InputSupplier() {

                final FileBackedOutputStream this$0;

                public InputStream getInput()
                    throws IOException
                {
                    return openStream();
                }

                public volatile Object getInput()
                    throws IOException
                {
                    return getInput();
                }

            
            {
                this$0 = FileBackedOutputStream.this;
                super();
            }
            };
            return;
        }
    }

    private InputStream openStream()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (file == null) goto _L2; else goto _L1
_L1:
        Object obj = new FileInputStream(file);
_L4:
        this;
        JVM INSTR monitorexit ;
        return ((InputStream) (obj));
_L2:
        obj = new ByteArrayInputStream(memory.getBuffer(), 0, memory.getCount());
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void update(int i)
        throws IOException
    {
        if (file == null && memory.getCount() + i > fileThreshold)
        {
            File file1 = File.createTempFile("FileBackedOutputStream", null);
            if (resetOnFinalize)
            {
                file1.deleteOnExit();
            }
            FileOutputStream fileoutputstream = new FileOutputStream(file1);
            fileoutputstream.write(memory.getBuffer(), 0, memory.getCount());
            fileoutputstream.flush();
            out = fileoutputstream;
            file = file1;
            memory = null;
        }
    }

    public void close()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        out.close();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void flush()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        out.flush();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    File getFile()
    {
        this;
        JVM INSTR monitorenter ;
        File file1 = file;
        this;
        JVM INSTR monitorexit ;
        return file1;
        Exception exception;
        exception;
        throw exception;
    }

    public InputSupplier getSupplier()
    {
        return supplier;
    }

    public void reset()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        close();
        if (memory != null)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        memory = new MemoryOutput();
_L1:
        out = memory;
        if (file != null)
        {
            File file1 = file;
            file = null;
            if (!file1.delete())
            {
                throw new IOException((new StringBuilder()).append("Could not delete: ").append(file1).toString());
            }
        }
        break MISSING_BLOCK_LABEL_190;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        memory.reset();
          goto _L1
        exception;
        if (memory == null)
        {
            memory = new MemoryOutput();
        } else
        {
            memory.reset();
        }
        out = memory;
        if (file != null)
        {
            File file2 = file;
            file = null;
            if (!file2.delete())
            {
                throw new IOException((new StringBuilder()).append("Could not delete: ").append(file2).toString());
            }
        }
        throw exception;
        this;
        JVM INSTR monitorexit ;
    }

    public void write(int i)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        update(1);
        out.write(i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void write(byte abyte0[])
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        write(abyte0, 0, abyte0.length);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        update(j);
        out.write(abyte0, i, j);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

}
