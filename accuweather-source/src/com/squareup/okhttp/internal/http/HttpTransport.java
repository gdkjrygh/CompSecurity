// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.http;

import com.squareup.okhttp.Connection;
import com.squareup.okhttp.internal.AbstractOutputStream;
import com.squareup.okhttp.internal.Util;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CacheRequest;
import java.net.ProtocolException;
import java.net.Socket;

// Referenced classes of package com.squareup.okhttp.internal.http:
//            Transport, HttpEngine, RequestHeaders, Policy, 
//            RetryableOutputStream, ResponseHeaders, UnknownLengthHttpInputStream, RawHeaders, 
//            AbstractHttpInputStream

public final class HttpTransport
    implements Transport
{
    private static class ChunkedInputStream extends AbstractHttpInputStream
    {

        private static final int NO_CHUNK_YET = -1;
        private int bytesRemainingInChunk;
        private boolean hasMoreChunks;
        private final HttpTransport transport;

        private void readChunkSize()
            throws IOException
        {
            if (bytesRemainingInChunk != -1)
            {
                Util.readAsciiLine(in);
            }
            String s = Util.readAsciiLine(in);
            int i = s.indexOf(";");
            Object obj = s;
            if (i != -1)
            {
                obj = s.substring(0, i);
            }
            try
            {
                bytesRemainingInChunk = Integer.parseInt(((String) (obj)).trim(), 16);
            }
            catch (NumberFormatException numberformatexception)
            {
                throw new ProtocolException((new StringBuilder()).append("Expected a hex chunk size but was ").append(((String) (obj))).toString());
            }
            if (bytesRemainingInChunk == 0)
            {
                hasMoreChunks = false;
                obj = httpEngine.responseHeaders.getHeaders();
                RawHeaders.readHeaders(transport.socketIn, ((RawHeaders) (obj)));
                httpEngine.receiveHeaders(((RawHeaders) (obj)));
                endOfInput();
            }
        }

        public int available()
            throws IOException
        {
            checkNotClosed();
            if (!hasMoreChunks || bytesRemainingInChunk == -1)
            {
                return 0;
            } else
            {
                return Math.min(in.available(), bytesRemainingInChunk);
            }
        }

        public void close()
            throws IOException
        {
            if (closed)
            {
                return;
            }
            if (hasMoreChunks && !HttpTransport.discardStream(httpEngine, this))
            {
                unexpectedEndOfInput();
            }
            closed = true;
        }

        public int read(byte abyte0[], int i, int j)
            throws IOException
        {
            Util.checkOffsetAndCount(abyte0.length, i, j);
            checkNotClosed();
            if (!hasMoreChunks)
            {
                return -1;
            }
            if (bytesRemainingInChunk == 0 || bytesRemainingInChunk == -1)
            {
                readChunkSize();
                if (!hasMoreChunks)
                {
                    return -1;
                }
            }
            j = in.read(abyte0, i, Math.min(j, bytesRemainingInChunk));
            if (j == -1)
            {
                unexpectedEndOfInput();
                throw new IOException("unexpected end of stream");
            } else
            {
                bytesRemainingInChunk = bytesRemainingInChunk - j;
                cacheWrite(abyte0, i, j);
                return j;
            }
        }

        ChunkedInputStream(InputStream inputstream, CacheRequest cacherequest, HttpTransport httptransport)
            throws IOException
        {
            super(inputstream, httptransport.httpEngine, cacherequest);
            bytesRemainingInChunk = -1;
            hasMoreChunks = true;
            transport = httptransport;
        }
    }

    private static final class ChunkedOutputStream extends AbstractOutputStream
    {

        private static final byte CRLF[] = {
            13, 10
        };
        private static final byte FINAL_CHUNK[] = {
            48, 13, 10, 13, 10
        };
        private static final byte HEX_DIGITS[] = {
            48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 
            97, 98, 99, 100, 101, 102
        };
        private final ByteArrayOutputStream bufferedChunk;
        private final byte hex[] = {
            0, 0, 0, 0, 0, 0, 0, 0, 13, 10
        };
        private final int maxChunkLength;
        private final OutputStream socketOut;

        private int dataLength(int i)
        {
            int k = 4;
            for (int j = i - 4; j > 0; j >>= 4)
            {
                k++;
            }

            return i - k;
        }

        private void writeBufferedChunkToSocket()
            throws IOException
        {
            int i = bufferedChunk.size();
            if (i <= 0)
            {
                return;
            } else
            {
                writeHex(i);
                bufferedChunk.writeTo(socketOut);
                bufferedChunk.reset();
                socketOut.write(CRLF);
                return;
            }
        }

        private void writeHex(int i)
            throws IOException
        {
            int j = 8;
            int k;
            int l;
            do
            {
                byte abyte0[] = hex;
                k = j - 1;
                abyte0[k] = HEX_DIGITS[i & 0xf];
                l = i >>> 4;
                j = k;
                i = l;
            } while (l != 0);
            socketOut.write(hex, k, hex.length - k);
        }

        public void close()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag = closed;
            if (!flag) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            closed = true;
            writeBufferedChunkToSocket();
            socketOut.write(FINAL_CHUNK);
            if (true) goto _L1; else goto _L3
_L3:
            Exception exception;
            exception;
            throw exception;
        }

        public void flush()
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            boolean flag = closed;
            if (!flag) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            writeBufferedChunkToSocket();
            socketOut.flush();
            if (true) goto _L1; else goto _L3
_L3:
            Exception exception;
            exception;
            throw exception;
        }

        public void write(byte abyte0[], int i, int j)
            throws IOException
        {
            this;
            JVM INSTR monitorenter ;
            checkNotClosed();
            Util.checkOffsetAndCount(abyte0.length, i, j);
_L2:
            if (j <= 0)
            {
                break MISSING_BLOCK_LABEL_134;
            }
            int l;
            if (bufferedChunk.size() <= 0 && j >= maxChunkLength)
            {
                break MISSING_BLOCK_LABEL_93;
            }
            l = Math.min(j, maxChunkLength - bufferedChunk.size());
            bufferedChunk.write(abyte0, i, l);
            int k = l;
            if (bufferedChunk.size() != maxChunkLength)
            {
                break MISSING_BLOCK_LABEL_137;
            }
            writeBufferedChunkToSocket();
            k = l;
            break MISSING_BLOCK_LABEL_137;
            k = maxChunkLength;
            writeHex(k);
            socketOut.write(abyte0, i, k);
            socketOut.write(CRLF);
            break MISSING_BLOCK_LABEL_137;
            abyte0;
            throw abyte0;
            this;
            JVM INSTR monitorexit ;
            return;
            i += k;
            j -= k;
            if (true) goto _L2; else goto _L1
_L1:
        }


        private ChunkedOutputStream(OutputStream outputstream, int i)
        {
            socketOut = outputstream;
            maxChunkLength = Math.max(1, dataLength(i));
            bufferedChunk = new ByteArrayOutputStream(i);
        }

    }

    private static class FixedLengthInputStream extends AbstractHttpInputStream
    {

        private int bytesRemaining;

        public int available()
            throws IOException
        {
            checkNotClosed();
            if (bytesRemaining == 0)
            {
                return 0;
            } else
            {
                return Math.min(in.available(), bytesRemaining);
            }
        }

        public void close()
            throws IOException
        {
            if (closed)
            {
                return;
            }
            if (bytesRemaining != 0 && !HttpTransport.discardStream(httpEngine, this))
            {
                unexpectedEndOfInput();
            }
            closed = true;
        }

        public int read(byte abyte0[], int i, int j)
            throws IOException
        {
            Util.checkOffsetAndCount(abyte0.length, i, j);
            checkNotClosed();
            if (bytesRemaining == 0)
            {
                i = -1;
            } else
            {
                j = in.read(abyte0, i, Math.min(j, bytesRemaining));
                if (j == -1)
                {
                    unexpectedEndOfInput();
                    throw new ProtocolException("unexpected end of stream");
                }
                bytesRemaining = bytesRemaining - j;
                cacheWrite(abyte0, i, j);
                i = j;
                if (bytesRemaining == 0)
                {
                    endOfInput();
                    return j;
                }
            }
            return i;
        }

        public FixedLengthInputStream(InputStream inputstream, CacheRequest cacherequest, HttpEngine httpengine, int i)
            throws IOException
        {
            super(inputstream, httpengine, cacherequest);
            bytesRemaining = i;
            if (bytesRemaining == 0)
            {
                endOfInput();
            }
        }
    }

    private static final class FixedLengthOutputStream extends AbstractOutputStream
    {

        private long bytesRemaining;
        private final OutputStream socketOut;

        public void close()
            throws IOException
        {
            if (!closed)
            {
                closed = true;
                if (bytesRemaining > 0L)
                {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush()
            throws IOException
        {
            if (closed)
            {
                return;
            } else
            {
                socketOut.flush();
                return;
            }
        }

        public void write(byte abyte0[], int i, int j)
            throws IOException
        {
            checkNotClosed();
            Util.checkOffsetAndCount(abyte0.length, i, j);
            if ((long)j > bytesRemaining)
            {
                throw new ProtocolException((new StringBuilder()).append("expected ").append(bytesRemaining).append(" bytes but received ").append(j).toString());
            } else
            {
                socketOut.write(abyte0, i, j);
                bytesRemaining = bytesRemaining - (long)j;
                return;
            }
        }

        private FixedLengthOutputStream(OutputStream outputstream, long l)
        {
            socketOut = outputstream;
            bytesRemaining = l;
        }

        FixedLengthOutputStream(OutputStream outputstream, long l, _cls1 _pcls1)
        {
            this(outputstream, l);
        }
    }


    public static final int DEFAULT_CHUNK_LENGTH = 1024;
    private static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;
    private final HttpEngine httpEngine;
    private OutputStream requestOut;
    private final InputStream socketIn;
    private final OutputStream socketOut;

    public HttpTransport(HttpEngine httpengine, OutputStream outputstream, InputStream inputstream)
    {
        httpEngine = httpengine;
        socketOut = outputstream;
        requestOut = outputstream;
        socketIn = inputstream;
    }

    private static boolean discardStream(HttpEngine httpengine, InputStream inputstream)
    {
        httpengine = httpengine.connection;
        if (httpengine != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if ((httpengine = httpengine.getSocket()) == null) goto _L1; else goto _L3
_L3:
        int i;
        try
        {
            i = httpengine.getSoTimeout();
            httpengine.setSoTimeout(100);
        }
        // Misplaced declaration of an exception variable
        catch (HttpEngine httpengine)
        {
            return false;
        }
        Util.skipAll(inputstream);
        httpengine.setSoTimeout(i);
        return true;
        inputstream;
        httpengine.setSoTimeout(i);
        throw inputstream;
    }

    public OutputStream createRequestBody()
        throws IOException
    {
        boolean flag1 = httpEngine.requestHeaders.isChunked();
        boolean flag = flag1;
        if (!flag1)
        {
            flag = flag1;
            if (httpEngine.policy.getChunkLength() > 0)
            {
                flag = flag1;
                if (httpEngine.connection.getHttpMinorVersion() != 0)
                {
                    httpEngine.requestHeaders.setChunked();
                    flag = true;
                }
            }
        }
        if (flag)
        {
            int j = httpEngine.policy.getChunkLength();
            int i = j;
            if (j == -1)
            {
                i = 1024;
            }
            writeRequestHeaders();
            return new ChunkedOutputStream(requestOut, i);
        }
        long l = httpEngine.policy.getFixedContentLength();
        if (l != -1L)
        {
            httpEngine.requestHeaders.setContentLength(l);
            writeRequestHeaders();
            return new FixedLengthOutputStream(requestOut, l);
        }
        l = httpEngine.requestHeaders.getContentLength();
        if (l > 0x7fffffffL)
        {
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2 GiB.");
        }
        if (l != -1L)
        {
            writeRequestHeaders();
            return new RetryableOutputStream((int)l);
        } else
        {
            return new RetryableOutputStream();
        }
    }

    public void flushRequest()
        throws IOException
    {
        requestOut.flush();
        requestOut = socketOut;
    }

    public InputStream getTransferStream(CacheRequest cacherequest)
        throws IOException
    {
        if (!httpEngine.hasResponseBody())
        {
            return new FixedLengthInputStream(socketIn, cacherequest, httpEngine, 0);
        }
        if (httpEngine.responseHeaders.isChunked())
        {
            return new ChunkedInputStream(socketIn, cacherequest, this);
        }
        if (httpEngine.responseHeaders.getContentLength() != -1)
        {
            return new FixedLengthInputStream(socketIn, cacherequest, httpEngine, httpEngine.responseHeaders.getContentLength());
        } else
        {
            return new UnknownLengthHttpInputStream(socketIn, cacherequest, httpEngine);
        }
    }

    public boolean makeReusable(boolean flag, OutputStream outputstream, InputStream inputstream)
    {
        while (flag || outputstream != null && !((AbstractOutputStream)outputstream).isClosed() || httpEngine.requestHeaders.hasConnectionClose() || httpEngine.responseHeaders != null && httpEngine.responseHeaders.hasConnectionClose() || (inputstream instanceof UnknownLengthHttpInputStream)) 
        {
            return false;
        }
        if (inputstream != null)
        {
            return discardStream(httpEngine, inputstream);
        } else
        {
            return true;
        }
    }

    public ResponseHeaders readResponseHeaders()
        throws IOException
    {
        Object obj = RawHeaders.fromBytes(socketIn);
        httpEngine.connection.setHttpMinorVersion(((RawHeaders) (obj)).getHttpMinorVersion());
        httpEngine.receiveHeaders(((RawHeaders) (obj)));
        obj = new ResponseHeaders(httpEngine.uri, ((RawHeaders) (obj)));
        ((ResponseHeaders) (obj)).setTransport("http/1.1");
        return ((ResponseHeaders) (obj));
    }

    public void writeRequestBody(RetryableOutputStream retryableoutputstream)
        throws IOException
    {
        retryableoutputstream.writeToSocket(requestOut);
    }

    public void writeRequestHeaders()
        throws IOException
    {
        httpEngine.writingRequestHeaders();
        byte abyte0[] = httpEngine.requestHeaders.getHeaders().toBytes();
        requestOut.write(abyte0);
    }



}
