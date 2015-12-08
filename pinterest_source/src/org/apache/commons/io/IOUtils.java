// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.ByteBuffer;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.Selector;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.codec.Charsets;
import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.io.output.StringBuilderWriter;

// Referenced classes of package org.apache.commons.io:
//            LineIterator

public class IOUtils
{

    private static final int DEFAULT_BUFFER_SIZE = 4096;
    public static final char DIR_SEPARATOR;
    public static final char DIR_SEPARATOR_UNIX = 47;
    public static final char DIR_SEPARATOR_WINDOWS = 92;
    public static final int EOF = -1;
    public static final String LINE_SEPARATOR;
    public static final String LINE_SEPARATOR_UNIX = "\n";
    public static final String LINE_SEPARATOR_WINDOWS = "\r\n";
    private static final int SKIP_BUFFER_SIZE = 2048;
    private static byte SKIP_BYTE_BUFFER[];
    private static char SKIP_CHAR_BUFFER[];

    public IOUtils()
    {
    }

    public static BufferedInputStream buffer(InputStream inputstream)
    {
        if (inputstream == null)
        {
            throw new NullPointerException();
        }
        if (inputstream instanceof BufferedInputStream)
        {
            return (BufferedInputStream)inputstream;
        } else
        {
            return new BufferedInputStream(inputstream);
        }
    }

    public static BufferedInputStream buffer(InputStream inputstream, int i)
    {
        if (inputstream == null)
        {
            throw new NullPointerException();
        }
        if (inputstream instanceof BufferedInputStream)
        {
            return (BufferedInputStream)inputstream;
        } else
        {
            return new BufferedInputStream(inputstream, i);
        }
    }

    public static BufferedOutputStream buffer(OutputStream outputstream)
    {
        if (outputstream == null)
        {
            throw new NullPointerException();
        }
        if (outputstream instanceof BufferedOutputStream)
        {
            return (BufferedOutputStream)outputstream;
        } else
        {
            return new BufferedOutputStream(outputstream);
        }
    }

    public static BufferedOutputStream buffer(OutputStream outputstream, int i)
    {
        if (outputstream == null)
        {
            throw new NullPointerException();
        }
        if (outputstream instanceof BufferedOutputStream)
        {
            return (BufferedOutputStream)outputstream;
        } else
        {
            return new BufferedOutputStream(outputstream, i);
        }
    }

    public static BufferedReader buffer(Reader reader)
    {
        if (reader instanceof BufferedReader)
        {
            return (BufferedReader)reader;
        } else
        {
            return new BufferedReader(reader);
        }
    }

    public static BufferedReader buffer(Reader reader, int i)
    {
        if (reader instanceof BufferedReader)
        {
            return (BufferedReader)reader;
        } else
        {
            return new BufferedReader(reader, i);
        }
    }

    public static BufferedWriter buffer(Writer writer)
    {
        if (writer instanceof BufferedWriter)
        {
            return (BufferedWriter)writer;
        } else
        {
            return new BufferedWriter(writer);
        }
    }

    public static BufferedWriter buffer(Writer writer, int i)
    {
        if (writer instanceof BufferedWriter)
        {
            return (BufferedWriter)writer;
        } else
        {
            return new BufferedWriter(writer, i);
        }
    }

    public static void close(URLConnection urlconnection)
    {
        if (urlconnection instanceof HttpURLConnection)
        {
            ((HttpURLConnection)urlconnection).disconnect();
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
    }

    public static void closeQuietly(InputStream inputstream)
    {
        closeQuietly(((Closeable) (inputstream)));
    }

    public static void closeQuietly(OutputStream outputstream)
    {
        closeQuietly(((Closeable) (outputstream)));
    }

    public static void closeQuietly(Reader reader)
    {
        closeQuietly(((Closeable) (reader)));
    }

    public static void closeQuietly(Writer writer)
    {
        closeQuietly(((Closeable) (writer)));
    }

    public static void closeQuietly(ServerSocket serversocket)
    {
        if (serversocket == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        serversocket.close();
        return;
        serversocket;
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
    }

    public static void closeQuietly(Selector selector)
    {
        if (selector == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        selector.close();
        return;
        selector;
    }

    public static transient void closeQuietly(Closeable acloseable[])
    {
        if (acloseable != null)
        {
            int j = acloseable.length;
            int i = 0;
            while (i < j) 
            {
                closeQuietly(acloseable[i]);
                i++;
            }
        }
    }

    public static boolean contentEquals(InputStream inputstream, InputStream inputstream1)
    {
        if (inputstream == inputstream1)
        {
            return true;
        }
        Object obj = inputstream;
        if (!(inputstream instanceof BufferedInputStream))
        {
            obj = new BufferedInputStream(inputstream);
        }
        inputstream = inputstream1;
        if (!(inputstream1 instanceof BufferedInputStream))
        {
            inputstream = new BufferedInputStream(inputstream1);
        }
        for (int i = ((InputStream) (obj)).read(); -1 != i; i = ((InputStream) (obj)).read())
        {
            if (i != inputstream.read())
            {
                return false;
            }
        }

        return inputstream.read() == -1;
    }

    public static boolean contentEquals(Reader reader, Reader reader1)
    {
        if (reader != reader1)
        {
            reader = toBufferedReader(reader);
            reader1 = toBufferedReader(reader1);
            for (int i = reader.read(); -1 != i; i = reader.read())
            {
                if (i != reader1.read())
                {
                    return false;
                }
            }

            if (reader1.read() != -1)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean contentEqualsIgnoreEOL(Reader reader, Reader reader1)
    {
        if (reader != reader1)
        {
            BufferedReader bufferedreader = toBufferedReader(reader);
            BufferedReader bufferedreader1 = toBufferedReader(reader1);
            reader1 = bufferedreader.readLine();
            for (reader = bufferedreader1.readLine(); reader1 != null && reader != null && reader1.equals(reader); reader = bufferedreader1.readLine())
            {
                reader1 = bufferedreader.readLine();
            }

            if (reader1 == null)
            {
                if (reader != null)
                {
                    return false;
                }
            } else
            {
                return reader1.equals(reader);
            }
        }
        return true;
    }

    public static int copy(InputStream inputstream, OutputStream outputstream)
    {
        long l = copyLarge(inputstream, outputstream);
        if (l > 0x7fffffffL)
        {
            return -1;
        } else
        {
            return (int)l;
        }
    }

    public static int copy(Reader reader, Writer writer)
    {
        long l = copyLarge(reader, writer);
        if (l > 0x7fffffffL)
        {
            return -1;
        } else
        {
            return (int)l;
        }
    }

    public static long copy(InputStream inputstream, OutputStream outputstream, int i)
    {
        return copyLarge(inputstream, outputstream, new byte[i]);
    }

    public static void copy(InputStream inputstream, Writer writer)
    {
        copy(inputstream, writer, Charset.defaultCharset());
    }

    public static void copy(InputStream inputstream, Writer writer, String s)
    {
        copy(inputstream, writer, Charsets.toCharset(s));
    }

    public static void copy(InputStream inputstream, Writer writer, Charset charset)
    {
        copy(((Reader) (new InputStreamReader(inputstream, Charsets.toCharset(charset)))), writer);
    }

    public static void copy(Reader reader, OutputStream outputstream)
    {
        copy(reader, outputstream, Charset.defaultCharset());
    }

    public static void copy(Reader reader, OutputStream outputstream, String s)
    {
        copy(reader, outputstream, Charsets.toCharset(s));
    }

    public static void copy(Reader reader, OutputStream outputstream, Charset charset)
    {
        outputstream = new OutputStreamWriter(outputstream, Charsets.toCharset(charset));
        copy(reader, ((Writer) (outputstream)));
        outputstream.flush();
    }

    public static long copyLarge(InputStream inputstream, OutputStream outputstream)
    {
        return copy(inputstream, outputstream, 4096);
    }

    public static long copyLarge(InputStream inputstream, OutputStream outputstream, long l, long l1)
    {
        return copyLarge(inputstream, outputstream, l, l1, new byte[4096]);
    }

    public static long copyLarge(InputStream inputstream, OutputStream outputstream, long l, long l1, byte abyte0[])
    {
        if (l > 0L)
        {
            skipFully(inputstream, l);
        }
        if (l1 == 0L)
        {
            return 0L;
        }
        int j = abyte0.length;
        int i;
        if (l1 > 0L && l1 < (long)j)
        {
            i = (int)l1;
        } else
        {
            i = j;
        }
        l = 0L;
        do
        {
            if (i <= 0)
            {
                break;
            }
            int k = inputstream.read(abyte0, 0, i);
            if (-1 == k)
            {
                break;
            }
            outputstream.write(abyte0, 0, k);
            long l2 = l + (long)k;
            l = l2;
            if (l1 > 0L)
            {
                i = (int)Math.min(l1 - l2, j);
                l = l2;
            }
        } while (true);
        return l;
    }

    public static long copyLarge(InputStream inputstream, OutputStream outputstream, byte abyte0[])
    {
        long l = 0L;
        do
        {
            int i = inputstream.read(abyte0);
            if (-1 != i)
            {
                outputstream.write(abyte0, 0, i);
                l += i;
            } else
            {
                return l;
            }
        } while (true);
    }

    public static long copyLarge(Reader reader, Writer writer)
    {
        return copyLarge(reader, writer, new char[4096]);
    }

    public static long copyLarge(Reader reader, Writer writer, long l, long l1)
    {
        return copyLarge(reader, writer, l, l1, new char[4096]);
    }

    public static long copyLarge(Reader reader, Writer writer, long l, long l1, char ac[])
    {
        if (l > 0L)
        {
            skipFully(reader, l);
        }
        if (l1 != 0L) goto _L2; else goto _L1
_L1:
        long l2 = 0L;
_L4:
        return l2;
_L2:
        int i;
        int j = ac.length;
        i = j;
        if (l1 > 0L)
        {
            i = j;
            if (l1 < (long)ac.length)
            {
                i = (int)l1;
            }
        }
        l = 0L;
_L6:
        l2 = l;
        if (i <= 0) goto _L4; else goto _L3
_L3:
        int k;
        k = reader.read(ac, 0, i);
        l2 = l;
        if (-1 == k) goto _L4; else goto _L5
_L5:
        writer.write(ac, 0, k);
        long l3 = l + (long)k;
        l = l3;
        if (l1 > 0L)
        {
            i = (int)Math.min(l1 - l3, ac.length);
            l = l3;
        }
          goto _L6
    }

    public static long copyLarge(Reader reader, Writer writer, char ac[])
    {
        long l = 0L;
        do
        {
            int i = reader.read(ac);
            if (-1 != i)
            {
                writer.write(ac, 0, i);
                l += i;
            } else
            {
                return l;
            }
        } while (true);
    }

    public static LineIterator lineIterator(InputStream inputstream, String s)
    {
        return lineIterator(inputstream, Charsets.toCharset(s));
    }

    public static LineIterator lineIterator(InputStream inputstream, Charset charset)
    {
        return new LineIterator(new InputStreamReader(inputstream, Charsets.toCharset(charset)));
    }

    public static LineIterator lineIterator(Reader reader)
    {
        return new LineIterator(reader);
    }

    public static int read(InputStream inputstream, byte abyte0[])
    {
        return read(inputstream, abyte0, 0, abyte0.length);
    }

    public static int read(InputStream inputstream, byte abyte0[], int i, int j)
    {
        if (j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Length must not be negative: ")).append(j).toString());
        }
        int k = j;
        do
        {
            if (k <= 0)
            {
                break;
            }
            int l = inputstream.read(abyte0, (j - k) + i, k);
            if (-1 == l)
            {
                break;
            }
            k -= l;
        } while (true);
        return j - k;
    }

    public static int read(Reader reader, char ac[])
    {
        return read(reader, ac, 0, ac.length);
    }

    public static int read(Reader reader, char ac[], int i, int j)
    {
        if (j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Length must not be negative: ")).append(j).toString());
        }
        int k = j;
        do
        {
            if (k <= 0)
            {
                break;
            }
            int l = reader.read(ac, (j - k) + i, k);
            if (-1 == l)
            {
                break;
            }
            k -= l;
        } while (true);
        return j - k;
    }

    public static int read(ReadableByteChannel readablebytechannel, ByteBuffer bytebuffer)
    {
        int i = bytebuffer.remaining();
        while (bytebuffer.remaining() > 0 && -1 != readablebytechannel.read(bytebuffer)) ;
        return i - bytebuffer.remaining();
    }

    public static void readFully(InputStream inputstream, byte abyte0[])
    {
        readFully(inputstream, abyte0, 0, abyte0.length);
    }

    public static void readFully(InputStream inputstream, byte abyte0[], int i, int j)
    {
        i = read(inputstream, abyte0, i, j);
        if (i != j)
        {
            throw new EOFException((new StringBuilder("Length to read: ")).append(j).append(" actual: ").append(i).toString());
        } else
        {
            return;
        }
    }

    public static void readFully(Reader reader, char ac[])
    {
        readFully(reader, ac, 0, ac.length);
    }

    public static void readFully(Reader reader, char ac[], int i, int j)
    {
        i = read(reader, ac, i, j);
        if (i != j)
        {
            throw new EOFException((new StringBuilder("Length to read: ")).append(j).append(" actual: ").append(i).toString());
        } else
        {
            return;
        }
    }

    public static void readFully(ReadableByteChannel readablebytechannel, ByteBuffer bytebuffer)
    {
        int i = bytebuffer.remaining();
        int j = read(readablebytechannel, bytebuffer);
        if (j != i)
        {
            throw new EOFException((new StringBuilder("Length to read: ")).append(i).append(" actual: ").append(j).toString());
        } else
        {
            return;
        }
    }

    public static byte[] readFully(InputStream inputstream, int i)
    {
        byte abyte0[] = new byte[i];
        readFully(inputstream, abyte0, 0, i);
        return abyte0;
    }

    public static List readLines(InputStream inputstream)
    {
        return readLines(inputstream, Charset.defaultCharset());
    }

    public static List readLines(InputStream inputstream, String s)
    {
        return readLines(inputstream, Charsets.toCharset(s));
    }

    public static List readLines(InputStream inputstream, Charset charset)
    {
        return readLines(((Reader) (new InputStreamReader(inputstream, Charsets.toCharset(charset)))));
    }

    public static List readLines(Reader reader)
    {
        BufferedReader bufferedreader = toBufferedReader(reader);
        ArrayList arraylist = new ArrayList();
        for (reader = bufferedreader.readLine(); reader != null; reader = bufferedreader.readLine())
        {
            arraylist.add(reader);
        }

        return arraylist;
    }

    public static long skip(InputStream inputstream, long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("Skip count must be non-negative, actual: ")).append(l).toString());
        }
        if (SKIP_BYTE_BUFFER == null)
        {
            SKIP_BYTE_BUFFER = new byte[2048];
        }
        long l1 = l;
        do
        {
            if (l1 <= 0L)
            {
                break;
            }
            long l2 = inputstream.read(SKIP_BYTE_BUFFER, 0, (int)Math.min(l1, 2048L));
            if (l2 < 0L)
            {
                break;
            }
            l1 -= l2;
        } while (true);
        return l - l1;
    }

    public static long skip(Reader reader, long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("Skip count must be non-negative, actual: ")).append(l).toString());
        }
        if (SKIP_CHAR_BUFFER == null)
        {
            SKIP_CHAR_BUFFER = new char[2048];
        }
        long l1 = l;
        do
        {
            if (l1 <= 0L)
            {
                break;
            }
            long l2 = reader.read(SKIP_CHAR_BUFFER, 0, (int)Math.min(l1, 2048L));
            if (l2 < 0L)
            {
                break;
            }
            l1 -= l2;
        } while (true);
        return l - l1;
    }

    public static long skip(ReadableByteChannel readablebytechannel, long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("Skip count must be non-negative, actual: ")).append(l).toString());
        }
        ByteBuffer bytebuffer = ByteBuffer.allocate((int)Math.min(l, 2048L));
        long l1 = l;
        do
        {
            if (l1 <= 0L)
            {
                break;
            }
            bytebuffer.position(0);
            bytebuffer.limit((int)Math.min(l1, 2048L));
            int i = readablebytechannel.read(bytebuffer);
            if (i == -1)
            {
                break;
            }
            l1 -= i;
        } while (true);
        return l - l1;
    }

    public static void skipFully(InputStream inputstream, long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("Bytes to skip must not be negative: ")).append(l).toString());
        }
        long l1 = skip(inputstream, l);
        if (l1 != l)
        {
            throw new EOFException((new StringBuilder("Bytes to skip: ")).append(l).append(" actual: ").append(l1).toString());
        } else
        {
            return;
        }
    }

    public static void skipFully(Reader reader, long l)
    {
        long l1 = skip(reader, l);
        if (l1 != l)
        {
            throw new EOFException((new StringBuilder("Chars to skip: ")).append(l).append(" actual: ").append(l1).toString());
        } else
        {
            return;
        }
    }

    public static void skipFully(ReadableByteChannel readablebytechannel, long l)
    {
        if (l < 0L)
        {
            throw new IllegalArgumentException((new StringBuilder("Bytes to skip must not be negative: ")).append(l).toString());
        }
        long l1 = skip(readablebytechannel, l);
        if (l1 != l)
        {
            throw new EOFException((new StringBuilder("Bytes to skip: ")).append(l).append(" actual: ").append(l1).toString());
        } else
        {
            return;
        }
    }

    public static InputStream toBufferedInputStream(InputStream inputstream)
    {
        return ByteArrayOutputStream.toBufferedInputStream(inputstream);
    }

    public static InputStream toBufferedInputStream(InputStream inputstream, int i)
    {
        return ByteArrayOutputStream.toBufferedInputStream(inputstream, i);
    }

    public static BufferedReader toBufferedReader(Reader reader)
    {
        if (reader instanceof BufferedReader)
        {
            return (BufferedReader)reader;
        } else
        {
            return new BufferedReader(reader);
        }
    }

    public static BufferedReader toBufferedReader(Reader reader, int i)
    {
        if (reader instanceof BufferedReader)
        {
            return (BufferedReader)reader;
        } else
        {
            return new BufferedReader(reader, i);
        }
    }

    public static byte[] toByteArray(InputStream inputstream)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        copy(inputstream, bytearrayoutputstream);
        return bytearrayoutputstream.toByteArray();
    }

    public static byte[] toByteArray(InputStream inputstream, int i)
    {
        int j = 0;
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Size must be equal or greater than zero: ")).append(i).toString());
        }
        if (i == 0)
        {
            inputstream = new byte[0];
        } else
        {
            byte abyte0[] = new byte[i];
            do
            {
                if (j >= i)
                {
                    break;
                }
                int k = inputstream.read(abyte0, j, i - j);
                if (k == -1)
                {
                    break;
                }
                j += k;
            } while (true);
            inputstream = abyte0;
            if (j != i)
            {
                throw new IOException((new StringBuilder("Unexpected readed size. current: ")).append(j).append(", excepted: ").append(i).toString());
            }
        }
        return inputstream;
    }

    public static byte[] toByteArray(InputStream inputstream, long l)
    {
        if (l > 0x7fffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder("Size cannot be greater than Integer max value: ")).append(l).toString());
        } else
        {
            return toByteArray(inputstream, (int)l);
        }
    }

    public static byte[] toByteArray(Reader reader)
    {
        return toByteArray(reader, Charset.defaultCharset());
    }

    public static byte[] toByteArray(Reader reader, String s)
    {
        return toByteArray(reader, Charsets.toCharset(s));
    }

    public static byte[] toByteArray(Reader reader, Charset charset)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        copy(reader, bytearrayoutputstream, charset);
        return bytearrayoutputstream.toByteArray();
    }

    public static byte[] toByteArray(String s)
    {
        return s.getBytes(Charset.defaultCharset());
    }

    public static byte[] toByteArray(URI uri)
    {
        return toByteArray(uri.toURL());
    }

    public static byte[] toByteArray(URL url)
    {
        url = url.openConnection();
        byte abyte0[] = toByteArray(((URLConnection) (url)));
        close(url);
        return abyte0;
        Exception exception;
        exception;
        close(url);
        throw exception;
    }

    public static byte[] toByteArray(URLConnection urlconnection)
    {
        urlconnection = urlconnection.getInputStream();
        byte abyte0[] = toByteArray(((InputStream) (urlconnection)));
        urlconnection.close();
        return abyte0;
        Exception exception;
        exception;
        urlconnection.close();
        throw exception;
    }

    public static char[] toCharArray(InputStream inputstream)
    {
        return toCharArray(inputstream, Charset.defaultCharset());
    }

    public static char[] toCharArray(InputStream inputstream, String s)
    {
        return toCharArray(inputstream, Charsets.toCharset(s));
    }

    public static char[] toCharArray(InputStream inputstream, Charset charset)
    {
        CharArrayWriter chararraywriter = new CharArrayWriter();
        copy(inputstream, chararraywriter, charset);
        return chararraywriter.toCharArray();
    }

    public static char[] toCharArray(Reader reader)
    {
        CharArrayWriter chararraywriter = new CharArrayWriter();
        copy(reader, chararraywriter);
        return chararraywriter.toCharArray();
    }

    public static InputStream toInputStream(CharSequence charsequence)
    {
        return toInputStream(charsequence, Charset.defaultCharset());
    }

    public static InputStream toInputStream(CharSequence charsequence, String s)
    {
        return toInputStream(charsequence, Charsets.toCharset(s));
    }

    public static InputStream toInputStream(CharSequence charsequence, Charset charset)
    {
        return toInputStream(charsequence.toString(), charset);
    }

    public static InputStream toInputStream(String s)
    {
        return toInputStream(s, Charset.defaultCharset());
    }

    public static InputStream toInputStream(String s, String s1)
    {
        return new ByteArrayInputStream(s.getBytes(Charsets.toCharset(s1)));
    }

    public static InputStream toInputStream(String s, Charset charset)
    {
        return new ByteArrayInputStream(s.getBytes(Charsets.toCharset(charset)));
    }

    public static String toString(InputStream inputstream)
    {
        return toString(inputstream, Charset.defaultCharset());
    }

    public static String toString(InputStream inputstream, String s)
    {
        return toString(inputstream, Charsets.toCharset(s));
    }

    public static String toString(InputStream inputstream, Charset charset)
    {
        StringBuilderWriter stringbuilderwriter = new StringBuilderWriter();
        copy(inputstream, stringbuilderwriter, charset);
        return stringbuilderwriter.toString();
    }

    public static String toString(Reader reader)
    {
        StringBuilderWriter stringbuilderwriter = new StringBuilderWriter();
        copy(reader, stringbuilderwriter);
        return stringbuilderwriter.toString();
    }

    public static String toString(URI uri)
    {
        return toString(uri, Charset.defaultCharset());
    }

    public static String toString(URI uri, String s)
    {
        return toString(uri, Charsets.toCharset(s));
    }

    public static String toString(URI uri, Charset charset)
    {
        return toString(uri.toURL(), Charsets.toCharset(charset));
    }

    public static String toString(URL url)
    {
        return toString(url, Charset.defaultCharset());
    }

    public static String toString(URL url, String s)
    {
        return toString(url, Charsets.toCharset(s));
    }

    public static String toString(URL url, Charset charset)
    {
        url = url.openStream();
        charset = toString(((InputStream) (url)), charset);
        url.close();
        return charset;
        charset;
        url.close();
        throw charset;
    }

    public static String toString(byte abyte0[])
    {
        return new String(abyte0, Charset.defaultCharset());
    }

    public static String toString(byte abyte0[], String s)
    {
        return new String(abyte0, Charsets.toCharset(s));
    }

    public static void write(CharSequence charsequence, OutputStream outputstream)
    {
        write(charsequence, outputstream, Charset.defaultCharset());
    }

    public static void write(CharSequence charsequence, OutputStream outputstream, String s)
    {
        write(charsequence, outputstream, Charsets.toCharset(s));
    }

    public static void write(CharSequence charsequence, OutputStream outputstream, Charset charset)
    {
        if (charsequence != null)
        {
            write(charsequence.toString(), outputstream, charset);
        }
    }

    public static void write(CharSequence charsequence, Writer writer)
    {
        if (charsequence != null)
        {
            write(charsequence.toString(), writer);
        }
    }

    public static void write(String s, OutputStream outputstream)
    {
        write(s, outputstream, Charset.defaultCharset());
    }

    public static void write(String s, OutputStream outputstream, String s1)
    {
        write(s, outputstream, Charsets.toCharset(s1));
    }

    public static void write(String s, OutputStream outputstream, Charset charset)
    {
        if (s != null)
        {
            outputstream.write(s.getBytes(Charsets.toCharset(charset)));
        }
    }

    public static void write(String s, Writer writer)
    {
        if (s != null)
        {
            writer.write(s);
        }
    }

    public static void write(StringBuffer stringbuffer, OutputStream outputstream)
    {
        write(stringbuffer, outputstream, ((String) (null)));
    }

    public static void write(StringBuffer stringbuffer, OutputStream outputstream, String s)
    {
        if (stringbuffer != null)
        {
            outputstream.write(stringbuffer.toString().getBytes(Charsets.toCharset(s)));
        }
    }

    public static void write(StringBuffer stringbuffer, Writer writer)
    {
        if (stringbuffer != null)
        {
            writer.write(stringbuffer.toString());
        }
    }

    public static void write(byte abyte0[], OutputStream outputstream)
    {
        if (abyte0 != null)
        {
            outputstream.write(abyte0);
        }
    }

    public static void write(byte abyte0[], Writer writer)
    {
        write(abyte0, writer, Charset.defaultCharset());
    }

    public static void write(byte abyte0[], Writer writer, String s)
    {
        write(abyte0, writer, Charsets.toCharset(s));
    }

    public static void write(byte abyte0[], Writer writer, Charset charset)
    {
        if (abyte0 != null)
        {
            writer.write(new String(abyte0, Charsets.toCharset(charset)));
        }
    }

    public static void write(char ac[], OutputStream outputstream)
    {
        write(ac, outputstream, Charset.defaultCharset());
    }

    public static void write(char ac[], OutputStream outputstream, String s)
    {
        write(ac, outputstream, Charsets.toCharset(s));
    }

    public static void write(char ac[], OutputStream outputstream, Charset charset)
    {
        if (ac != null)
        {
            outputstream.write((new String(ac)).getBytes(Charsets.toCharset(charset)));
        }
    }

    public static void write(char ac[], Writer writer)
    {
        if (ac != null)
        {
            writer.write(ac);
        }
    }

    public static void writeChunked(byte abyte0[], OutputStream outputstream)
    {
        if (abyte0 != null)
        {
            int j = abyte0.length;
            int k;
            for (int i = 0; j > 0; i += k)
            {
                k = Math.min(j, 4096);
                outputstream.write(abyte0, i, k);
                j -= k;
            }

        }
    }

    public static void writeChunked(char ac[], Writer writer)
    {
        if (ac != null)
        {
            int j = ac.length;
            int k;
            for (int i = 0; j > 0; i += k)
            {
                k = Math.min(j, 4096);
                writer.write(ac, i, k);
                j -= k;
            }

        }
    }

    public static void writeLines(Collection collection, String s, OutputStream outputstream)
    {
        writeLines(collection, s, outputstream, Charset.defaultCharset());
    }

    public static void writeLines(Collection collection, String s, OutputStream outputstream, String s1)
    {
        writeLines(collection, s, outputstream, Charsets.toCharset(s1));
    }

    public static void writeLines(Collection collection, String s, OutputStream outputstream, Charset charset)
    {
        if (collection != null)
        {
            String s1 = s;
            if (s == null)
            {
                s1 = LINE_SEPARATOR;
            }
            s = Charsets.toCharset(charset);
            collection = collection.iterator();
            while (collection.hasNext()) 
            {
                charset = ((Charset) (collection.next()));
                if (charset != null)
                {
                    outputstream.write(charset.toString().getBytes(s));
                }
                outputstream.write(s1.getBytes(s));
            }
        }
    }

    public static void writeLines(Collection collection, String s, Writer writer)
    {
        if (collection != null)
        {
            String s1 = s;
            if (s == null)
            {
                s1 = LINE_SEPARATOR;
            }
            collection = collection.iterator();
            while (collection.hasNext()) 
            {
                s = ((String) (collection.next()));
                if (s != null)
                {
                    writer.write(s.toString());
                }
                writer.write(s1);
            }
        }
    }

    static 
    {
        DIR_SEPARATOR = File.separatorChar;
        StringBuilderWriter stringbuilderwriter = new StringBuilderWriter(4);
        PrintWriter printwriter = new PrintWriter(stringbuilderwriter);
        printwriter.println();
        LINE_SEPARATOR = stringbuilderwriter.toString();
        printwriter.close();
    }
}
