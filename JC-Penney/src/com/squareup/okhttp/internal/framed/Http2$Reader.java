// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import c.j;
import c.k;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            FrameReader, Http2, ErrorCode, HeadersMode, 
//            Settings

final class continuation
    implements FrameReader
{

    private final boolean client;
    private final ationSource continuation;
    final ationSource hpackReader;
    private final j source;

    private void readData(andler andler, int i, byte byte0, int l)
    {
        boolean flag = true;
        int i1 = 0;
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
            i1 = (short)(source.i() & 0xff);
        }
        i = Http2.access$400(i, byte0, i1);
        andler.data(flag1, l, source, i);
        source.g(i1);
    }

    private void readGoAway(andler andler, int i, byte byte0, int l)
    {
        if (i < 8)
        {
            throw Http2.access$200("TYPE_GOAWAY length < 8: %s", new Object[] {
                Integer.valueOf(i)
            });
        }
        if (l != 0)
        {
            throw Http2.access$200("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        byte0 = source.k();
        l = source.k();
        i -= 8;
        ErrorCode errorcode = ErrorCode.fromHttp2(l);
        if (errorcode == null)
        {
            throw Http2.access$200("TYPE_GOAWAY unexpected error code: %d", new Object[] {
                Integer.valueOf(l)
            });
        }
        k k1 = k.b;
        if (i > 0)
        {
            k1 = source.c(i);
        }
        andler.goAway(byte0, errorcode, k1);
    }

    private List readHeaderBlock(int i, short word0, byte byte0, int l)
    {
        ationSource ationsource = continuation;
        continuation.left = i;
        ationsource.length = i;
        continuation.padding = word0;
        continuation.flags = byte0;
        continuation.streamId = l;
        hpackReader.readHeaders();
        return hpackReader.getAndResetHeaderList();
    }

    private void readHeaders(andler andler, int i, byte byte0, int l)
    {
        if (l == 0)
        {
            throw Http2.access$200("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        short word0;
        int i1;
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
            word0 = (short)(source.i() & 0xff);
        } else
        {
            word0 = 0;
        }
        i1 = i;
        if ((byte0 & 0x20) != 0)
        {
            readPriority(andler, l);
            i1 = i - 5;
        }
        andler.headers(false, flag, l, -1, readHeaderBlock(Http2.access$400(i1, byte0, word0), word0, byte0, l), HeadersMode.HTTP_20_HEADERS);
    }

    private void readPing(andler andler, int i, byte byte0, int l)
    {
        boolean flag = true;
        if (i != 8)
        {
            throw Http2.access$200("TYPE_PING length != 8: %s", new Object[] {
                Integer.valueOf(i)
            });
        }
        if (l != 0)
        {
            throw Http2.access$200("TYPE_PING streamId != 0", new Object[0]);
        }
        i = source.k();
        l = source.k();
        if ((byte0 & 1) == 0)
        {
            flag = false;
        }
        andler.ping(flag, i, l);
    }

    private void readPriority(andler andler, int i)
    {
        int l = source.k();
        boolean flag;
        if ((0x80000000 & l) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        andler.priority(i, l & 0x7fffffff, (source.i() & 0xff) + 1, flag);
    }

    private void readPriority(andler andler, int i, byte byte0, int l)
    {
        if (i != 5)
        {
            throw Http2.access$200("TYPE_PRIORITY length: %d != 5", new Object[] {
                Integer.valueOf(i)
            });
        }
        if (l == 0)
        {
            throw Http2.access$200("TYPE_PRIORITY streamId == 0", new Object[0]);
        } else
        {
            readPriority(andler, l);
            return;
        }
    }

    private void readPushPromise(andler andler, int i, byte byte0, int l)
    {
        short word0 = 0;
        if (l == 0)
        {
            throw Http2.access$200("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        if ((byte0 & 8) != 0)
        {
            word0 = (short)(source.i() & 0xff);
        }
        andler.pushPromise(l, source.k() & 0x7fffffff, readHeaderBlock(Http2.access$400(i - 4, byte0, word0), word0, byte0, l));
    }

    private void readRstStream(andler andler, int i, byte byte0, int l)
    {
        if (i != 4)
        {
            throw Http2.access$200("TYPE_RST_STREAM length: %d != 4", new Object[] {
                Integer.valueOf(i)
            });
        }
        if (l == 0)
        {
            throw Http2.access$200("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        i = source.k();
        ErrorCode errorcode = ErrorCode.fromHttp2(i);
        if (errorcode == null)
        {
            throw Http2.access$200("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                Integer.valueOf(i)
            });
        } else
        {
            andler.rstStream(l, errorcode);
            return;
        }
    }

    private void readSettings(andler andler, int i, byte byte0, int l)
    {
        if (l != 0)
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
        int i1;
        if (byte0 >= i)
        {
            break MISSING_BLOCK_LABEL_273;
        }
        word0 = source.j();
        i1 = source.k();
        l = word0;
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
        l = word0;
        if (i1 != 0)
        {
            l = word0;
            if (i1 != 1)
            {
                throw Http2.access$200("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
            }
        }
        break; /* Loop/switch isn't completed */
_L6:
        l = 4;
_L12:
        settings.set(l, 0, i1);
        byte0 += 6;
        if (true) goto _L10; else goto _L9
_L9:
        l = 7;
        if (i1 >= 0) goto _L12; else goto _L11
_L11:
        throw Http2.access$200("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
_L8:
        if (i1 < 16384)
        {
            break; /* Loop/switch isn't completed */
        }
        l = word0;
        if (i1 <= 0xffffff) goto _L12; else goto _L13
_L13:
        throw Http2.access$200("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new Object[] {
            Integer.valueOf(i1)
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

    private void readWindowUpdate(andler andler, int i, byte byte0, int l)
    {
        if (i != 4)
        {
            throw Http2.access$200("TYPE_WINDOW_UPDATE length !=4: %s", new Object[] {
                Integer.valueOf(i)
            });
        }
        long l1 = (long)source.k() & 0x7fffffffL;
        if (l1 == 0L)
        {
            throw Http2.access$200("windowSizeIncrement was 0", new Object[] {
                Long.valueOf(l1)
            });
        } else
        {
            andler.windowUpdate(l, l1);
            return;
        }
    }

    public void close()
    {
        source.close();
    }

    public boolean nextFrame(andler andler)
    {
        int i;
        try
        {
            source.a(9L);
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
        byte byte0 = (byte)(source.i() & 0xff);
        byte byte1 = (byte)(source.i() & 0xff);
        int l = source.k() & 0x7fffffff;
        if (Http2.access$100().isLoggable(Level.FINE))
        {
            Http2.access$100().fine(gger.formatHeader(true, l, i, byte0, byte1));
        }
        switch (byte0)
        {
        default:
            source.g(i);
            return true;

        case 0: // '\0'
            readData(andler, i, byte1, l);
            return true;

        case 1: // '\001'
            readHeaders(andler, i, byte1, l);
            return true;

        case 2: // '\002'
            readPriority(andler, i, byte1, l);
            return true;

        case 3: // '\003'
            readRstStream(andler, i, byte1, l);
            return true;

        case 4: // '\004'
            readSettings(andler, i, byte1, l);
            return true;

        case 5: // '\005'
            readPushPromise(andler, i, byte1, l);
            return true;

        case 6: // '\006'
            readPing(andler, i, byte1, l);
            return true;

        case 7: // '\007'
            readGoAway(andler, i, byte1, l);
            return true;

        case 8: // '\b'
            readWindowUpdate(andler, i, byte1, l);
            break;
        }
        return true;
    }

    public void readConnectionPreface()
    {
        if (!client)
        {
            k k1 = source.c(Http2.access$000().f());
            if (Http2.access$100().isLoggable(Level.FINE))
            {
                Http2.access$100().fine(String.format("<< CONNECTION %s", new Object[] {
                    k1.d()
                }));
            }
            if (!Http2.access$000().equals(k1))
            {
                throw Http2.access$200("Expected a connection header but was %s", new Object[] {
                    k1.a()
                });
            }
        }
    }

    andler(j j1, int i, boolean flag)
    {
        source = j1;
        client = flag;
        continuation = new ationSource(source);
        hpackReader = new <init>(i, continuation);
    }
}
