// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.spdy;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.BufferedSource;
import okio.ByteString;

// Referenced classes of package com.squareup.okhttp.internal.spdy:
//            FrameReader, Http2, ErrorCode, HeadersMode, 
//            Settings

static final class continuation
    implements FrameReader
{

    private final boolean client;
    private final ationSource continuation;
    final ationSource hpackReader;
    private final BufferedSource source;

    private void readData(andler andler, int i, byte byte0, int j)
        throws IOException
    {
        boolean flag = true;
        int k = 0;
        boolean flag1;
        if ((byte0 & 1) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if ((byte0 & 0x20) == 0)
        {
            flag = false;
        }
        if (flag)
        {
            throw Http2.access$200("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        if ((byte0 & 8) != 0)
        {
            k = (short)(source.readByte() & 0xff);
        }
        i = Http2.access$400(i, byte0, k);
        andler.data(flag1, j, source, i);
        source.skip(k);
    }

    private void readGoAway(andler andler, int i, byte byte0, int j)
        throws IOException
    {
        if (i < 8)
        {
            throw Http2.access$200("TYPE_GOAWAY length < 8: %s", new Object[] {
                Integer.valueOf(i)
            });
        }
        if (j != 0)
        {
            throw Http2.access$200("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        byte0 = source.readInt();
        j = source.readInt();
        i -= 8;
        ErrorCode errorcode = ErrorCode.fromHttp2(j);
        if (errorcode == null)
        {
            throw Http2.access$200("TYPE_GOAWAY unexpected error code: %d", new Object[] {
                Integer.valueOf(j)
            });
        }
        ByteString bytestring = ByteString.EMPTY;
        if (i > 0)
        {
            bytestring = source.readByteString(i);
        }
        andler.goAway(byte0, errorcode, bytestring);
    }

    private List readHeaderBlock(int i, short word0, byte byte0, int j)
        throws IOException
    {
        ationSource ationsource = continuation;
        continuation.left = i;
        ationsource.length = i;
        continuation.padding = word0;
        continuation.flags = byte0;
        continuation.streamId = j;
        hpackReader.readHeaders();
        return hpackReader.getAndResetHeaderList();
    }

    private void readHeaders(andler andler, int i, byte byte0, int j)
        throws IOException
    {
        if (j == 0)
        {
            throw Http2.access$200("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        short word0;
        int k;
        boolean flag;
        if ((byte0 & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((byte0 & 8) != 0)
        {
            word0 = (short)(source.readByte() & 0xff);
        } else
        {
            word0 = 0;
        }
        k = i;
        if ((byte0 & 0x20) != 0)
        {
            readPriority(andler, j);
            k = i - 5;
        }
        andler.headers(false, flag, j, -1, readHeaderBlock(Http2.access$400(k, byte0, word0), word0, byte0, j), HeadersMode.HTTP_20_HEADERS);
    }

    private void readPing(andler andler, int i, byte byte0, int j)
        throws IOException
    {
        boolean flag = true;
        if (i != 8)
        {
            throw Http2.access$200("TYPE_PING length != 8: %s", new Object[] {
                Integer.valueOf(i)
            });
        }
        if (j != 0)
        {
            throw Http2.access$200("TYPE_PING streamId != 0", new Object[0]);
        }
        i = source.readInt();
        j = source.readInt();
        if ((byte0 & 1) == 0)
        {
            flag = false;
        }
        andler.ping(flag, i, j);
    }

    private void readPriority(andler andler, int i)
        throws IOException
    {
        int j = source.readInt();
        boolean flag;
        if ((0x80000000 & j) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        andler.priority(i, j & 0x7fffffff, (source.readByte() & 0xff) + 1, flag);
    }

    private void readPriority(andler andler, int i, byte byte0, int j)
        throws IOException
    {
        if (i != 5)
        {
            throw Http2.access$200("TYPE_PRIORITY length: %d != 5", new Object[] {
                Integer.valueOf(i)
            });
        }
        if (j == 0)
        {
            throw Http2.access$200("TYPE_PRIORITY streamId == 0", new Object[0]);
        } else
        {
            readPriority(andler, j);
            return;
        }
    }

    private void readPushPromise(andler andler, int i, byte byte0, int j)
        throws IOException
    {
        short word0 = 0;
        if (j == 0)
        {
            throw Http2.access$200("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        if ((byte0 & 8) != 0)
        {
            word0 = (short)(source.readByte() & 0xff);
        }
        andler.pushPromise(j, source.readInt() & 0x7fffffff, readHeaderBlock(Http2.access$400(i - 4, byte0, word0), word0, byte0, j));
    }

    private void readRstStream(andler andler, int i, byte byte0, int j)
        throws IOException
    {
        if (i != 4)
        {
            throw Http2.access$200("TYPE_RST_STREAM length: %d != 4", new Object[] {
                Integer.valueOf(i)
            });
        }
        if (j == 0)
        {
            throw Http2.access$200("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        i = source.readInt();
        ErrorCode errorcode = ErrorCode.fromHttp2(i);
        if (errorcode == null)
        {
            throw Http2.access$200("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                Integer.valueOf(i)
            });
        } else
        {
            andler.rstStream(j, errorcode);
            return;
        }
    }

    private void readSettings(andler andler, int i, byte byte0, int j)
        throws IOException
    {
        if (j != 0)
        {
            throw Http2.access$200("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((byte0 & 1) == 0) goto _L2; else goto _L1
_L1:
        if (i != 0)
        {
            throw Http2.access$200("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
        }
        andler.ackSettings();
_L15:
        return;
_L2:
        Settings settings;
        if (i % 6 != 0)
        {
            throw Http2.access$200("TYPE_SETTINGS length %% 6 != 0: %s", new Object[] {
                Integer.valueOf(i)
            });
        }
        settings = new Settings();
        byte0 = 0;
_L10:
        short word0;
        int k;
        if (byte0 >= i)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        word0 = source.readShort();
        k = source.readInt();
        j = word0;
        word0;
        JVM INSTR tableswitch 1 6: default 148
    //                   1 198
    //                   2 166
    //                   3 195
    //                   4 217
    //                   5 236
    //                   6 198;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L4
_L7:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L3:
        throw Http2.access$200("PROTOCOL_ERROR invalid settings id: %s", new Object[] {
            Short.valueOf(word0)
        });
_L5:
        j = word0;
        if (k != 0)
        {
            j = word0;
            if (k != 1)
            {
                throw Http2.access$200("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
            }
        }
        break; /* Loop/switch isn't completed */
_L6:
        j = 4;
_L12:
        settings.set(j, 0, k);
        byte0 += 6;
        if (true) goto _L10; else goto _L9
_L9:
        j = 7;
        if (k >= 0) goto _L12; else goto _L11
_L11:
        throw Http2.access$200("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
_L8:
        if (k < 16384)
        {
            break; /* Loop/switch isn't completed */
        }
        j = word0;
        if (k <= 0xffffff) goto _L12; else goto _L13
_L13:
        throw Http2.access$200("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new Object[] {
            Integer.valueOf(k)
        });
        andler.settings(false, settings);
        if (settings.getHeaderTableSize() >= 0)
        {
            hpackReader.headerTableSizeSetting(settings.getHeaderTableSize());
            return;
        }
        if (true) goto _L15; else goto _L14
_L14:
    }

    private void readWindowUpdate(andler andler, int i, byte byte0, int j)
        throws IOException
    {
        if (i != 4)
        {
            throw Http2.access$200("TYPE_WINDOW_UPDATE length !=4: %s", new Object[] {
                Integer.valueOf(i)
            });
        }
        long l = (long)source.readInt() & 0x7fffffffL;
        if (l == 0L)
        {
            throw Http2.access$200("windowSizeIncrement was 0", new Object[] {
                Long.valueOf(l)
            });
        } else
        {
            andler.windowUpdate(j, l);
            return;
        }
    }

    public void close()
        throws IOException
    {
        source.close();
    }

    public boolean nextFrame(andler andler)
        throws IOException
    {
        int i;
        try
        {
            source.require(9L);
        }
        // Misplaced declaration of an exception variable
        catch (andler andler)
        {
            return false;
        }
        i = Http2.access$300(source);
        if (i < 0 || i > 16384)
        {
            throw Http2.access$200("FRAME_SIZE_ERROR: %s", new Object[] {
                Integer.valueOf(i)
            });
        }
        byte byte0 = (byte)(source.readByte() & 0xff);
        byte byte1 = (byte)(source.readByte() & 0xff);
        int j = source.readInt() & 0x7fffffff;
        if (Http2.access$100().isLoggable(Level.FINE))
        {
            Http2.access$100().fine(gger.formatHeader(true, j, i, byte0, byte1));
        }
        switch (byte0)
        {
        default:
            source.skip(i);
            return true;

        case 0: // '\0'
            readData(andler, i, byte1, j);
            return true;

        case 1: // '\001'
            readHeaders(andler, i, byte1, j);
            return true;

        case 2: // '\002'
            readPriority(andler, i, byte1, j);
            return true;

        case 3: // '\003'
            readRstStream(andler, i, byte1, j);
            return true;

        case 4: // '\004'
            readSettings(andler, i, byte1, j);
            return true;

        case 5: // '\005'
            readPushPromise(andler, i, byte1, j);
            return true;

        case 6: // '\006'
            readPing(andler, i, byte1, j);
            return true;

        case 7: // '\007'
            readGoAway(andler, i, byte1, j);
            return true;

        case 8: // '\b'
            readWindowUpdate(andler, i, byte1, j);
            break;
        }
        return true;
    }

    public void readConnectionPreface()
        throws IOException
    {
        if (!client)
        {
            ByteString bytestring = source.readByteString(Http2.access$000().size());
            if (Http2.access$100().isLoggable(Level.FINE))
            {
                Http2.access$100().fine(String.format("<< CONNECTION %s", new Object[] {
                    bytestring.hex()
                }));
            }
            if (!Http2.access$000().equals(bytestring))
            {
                throw Http2.access$200("Expected a connection header but was %s", new Object[] {
                    bytestring.utf8()
                });
            }
        }
    }

    andler(BufferedSource bufferedsource, int i, boolean flag)
    {
        source = bufferedsource;
        client = flag;
        continuation = new ationSource(source);
        hpackReader = new <init>(i, continuation);
    }
}
