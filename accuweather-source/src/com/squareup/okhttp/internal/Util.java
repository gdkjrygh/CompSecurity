// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicReference;

public final class Util
{

    public static final byte EMPTY_BYTE_ARRAY[] = new byte[0];
    public static final String EMPTY_STRING_ARRAY[] = new String[0];
    public static final Charset ISO_8859_1 = Charset.forName("ISO-8859-1");
    public static final Charset US_ASCII = Charset.forName("US-ASCII");
    public static final Charset UTF_8 = Charset.forName("UTF-8");
    private static AtomicReference skipBuffer = new AtomicReference();

    private Util()
    {
    }

    public static void checkOffsetAndCount(int i, int j, int k)
    {
        if ((j | k) < 0 || j > i || i - j < k)
        {
            throw new ArrayIndexOutOfBoundsException();
        } else
        {
            return;
        }
    }

    public static void closeAll(Closeable closeable, Closeable closeable1)
        throws IOException
    {
        Object obj = null;
        closeable.close();
        closeable = obj;
_L1:
        closeable1.close();
        closeable1 = closeable;
_L2:
        if (closeable1 == null)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_39;
        closeable;
          goto _L1
        Throwable throwable;
        throwable;
        closeable1 = closeable;
        if (closeable == null)
        {
            closeable1 = throwable;
        }
          goto _L2
        if (closeable1 instanceof IOException)
        {
            throw (IOException)closeable1;
        }
        if (closeable1 instanceof RuntimeException)
        {
            throw (RuntimeException)closeable1;
        }
        if (closeable1 instanceof Error)
        {
            throw (Error)closeable1;
        } else
        {
            throw new AssertionError(closeable1);
        }
    }

    public static void closeQuietly(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
        throw closeable;
        closeable;
    }

    public static void closeQuietly(Socket socket)
    {
        if (socket == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        socket.close();
        return;
        socket;
        throw socket;
        socket;
    }

    public static int copy(InputStream inputstream, OutputStream outputstream)
        throws IOException
    {
        int i = 0;
        byte abyte0[] = new byte[8192];
        do
        {
            int j = inputstream.read(abyte0);
            if (j != -1)
            {
                i += j;
                outputstream.write(abyte0, 0, j);
            } else
            {
                return i;
            }
        } while (true);
    }

    public static ThreadFactory daemonThreadFactory(String s)
    {
        return new ThreadFactory(s) {

            final String val$name;

            public Thread newThread(Runnable runnable)
            {
                runnable = new Thread(runnable, name);
                runnable.setDaemon(true);
                return runnable;
            }

            
            {
                name = s;
                super();
            }
        };
    }

    public static void deleteContents(File file)
        throws IOException
    {
        File afile[] = file.listFiles();
        if (afile == null)
        {
            throw new IOException((new StringBuilder()).append("not a readable directory: ").append(file).toString());
        }
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            file = afile[i];
            if (file.isDirectory())
            {
                deleteContents(file);
            }
            if (!file.delete())
            {
                throw new IOException((new StringBuilder()).append("failed to delete file: ").append(file).toString());
            }
        }

    }

    public static boolean equal(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public static int getDefaultPort(String s)
    {
        if ("http".equalsIgnoreCase(s))
        {
            return 80;
        }
        return !"https".equalsIgnoreCase(s) ? -1 : 443;
    }

    private static int getEffectivePort(String s, int i)
    {
        if (i != -1)
        {
            return i;
        } else
        {
            return getDefaultPort(s);
        }
    }

    public static int getEffectivePort(URI uri)
    {
        return getEffectivePort(uri.getScheme(), uri.getPort());
    }

    public static int getEffectivePort(URL url)
    {
        return getEffectivePort(url.getProtocol(), url.getPort());
    }

    public static List immutableList(List list)
    {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static void pokeInt(byte abyte0[], int i, int j, ByteOrder byteorder)
    {
        if (byteorder == ByteOrder.BIG_ENDIAN)
        {
            int k = i + 1;
            abyte0[i] = (byte)(j >> 24 & 0xff);
            i = k + 1;
            abyte0[k] = (byte)(j >> 16 & 0xff);
            abyte0[i] = (byte)(j >> 8 & 0xff);
            abyte0[i + 1] = (byte)(j >> 0 & 0xff);
            return;
        } else
        {
            int l = i + 1;
            abyte0[i] = (byte)(j >> 0 & 0xff);
            i = l + 1;
            abyte0[l] = (byte)(j >> 8 & 0xff);
            abyte0[i] = (byte)(j >> 16 & 0xff);
            abyte0[i + 1] = (byte)(j >> 24 & 0xff);
            return;
        }
    }

    public static String readAsciiLine(InputStream inputstream)
        throws IOException
    {
        StringBuilder stringbuilder = new StringBuilder(80);
        do
        {
            int i = inputstream.read();
            if (i == -1)
            {
                throw new EOFException();
            }
            if (i == 10)
            {
                i = stringbuilder.length();
                if (i > 0 && stringbuilder.charAt(i - 1) == '\r')
                {
                    stringbuilder.setLength(i - 1);
                }
                return stringbuilder.toString();
            }
            stringbuilder.append((char)i);
        } while (true);
    }

    public static String readFully(Reader reader)
        throws IOException
    {
        Object obj;
        char ac[];
        obj = new StringWriter();
        ac = new char[1024];
_L1:
        int i = reader.read(ac);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        ((StringWriter) (obj)).write(ac, 0, i);
          goto _L1
        obj;
        reader.close();
        throw obj;
        obj = ((StringWriter) (obj)).toString();
        reader.close();
        return ((String) (obj));
    }

    public static void readFully(InputStream inputstream, byte abyte0[])
        throws IOException
    {
        readFully(inputstream, abyte0, 0, abyte0.length);
    }

    public static void readFully(InputStream inputstream, byte abyte0[], int i, int j)
        throws IOException
    {
        if (j != 0)
        {
            if (inputstream == null)
            {
                throw new NullPointerException("in == null");
            }
            if (abyte0 == null)
            {
                throw new NullPointerException("dst == null");
            }
            checkOffsetAndCount(abyte0.length, i, j);
            while (j > 0) 
            {
                int k = inputstream.read(abyte0, i, j);
                if (k < 0)
                {
                    throw new EOFException();
                }
                i += k;
                j -= k;
            }
        }
    }

    public static int readSingleByte(InputStream inputstream)
        throws IOException
    {
        int i = -1;
        byte abyte0[] = new byte[1];
        if (inputstream.read(abyte0, 0, 1) != -1)
        {
            i = abyte0[0] & 0xff;
        }
        return i;
    }

    public static void skipAll(InputStream inputstream)
        throws IOException
    {
        do
        {
            inputstream.skip(0x7fffffffffffffffL);
        } while (inputstream.read() != -1);
    }

    public static long skipByReading(InputStream inputstream, long l)
        throws IOException
    {
        byte abyte0[];
        long l1;
        if (l == 0L)
        {
            return 0L;
        }
        byte abyte1[] = (byte[])skipBuffer.getAndSet(null);
        abyte0 = abyte1;
        if (abyte1 == null)
        {
            abyte0 = new byte[4096];
        }
        l1 = 0L;
_L5:
        long l2 = l1;
        if (l1 >= l) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        i = (int)Math.min(l - l1, abyte0.length);
        j = inputstream.read(abyte0, 0, i);
        if (j != -1) goto _L4; else goto _L3
_L3:
        l2 = l1;
_L2:
        skipBuffer.set(abyte0);
        return l2;
_L4:
        l2 = l1 + (long)j;
        l1 = l2;
        if (j >= i) goto _L5; else goto _L2
    }

    public static void writeSingleByte(OutputStream outputstream, int i)
        throws IOException
    {
        outputstream.write(new byte[] {
            (byte)(i & 0xff)
        });
    }

}
