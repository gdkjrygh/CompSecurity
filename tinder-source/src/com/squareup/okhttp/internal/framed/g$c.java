// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.ByteString;
import okio.e;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            a, g, f, e, 
//            HeadersMode, ErrorCode, m

static final class c
    implements a
{

    final b a;
    private final e b;
    private final b c;
    private final boolean d;

    private List a(int i, short word0, byte byte0, int j)
        throws IOException
    {
        Object obj = c;
        c.d = i;
        obj.a = i;
        c.e = word0;
        c.b = byte0;
        c.c = j;
        for (obj = a; !((a) (obj)).b.d();)
        {
            i = ((b) (obj)).b.f() & 0xff;
            if (i == 128)
            {
                throw new IOException("index == 0");
            }
            if ((i & 0x80) == 128)
            {
                i = ((b) (obj)).a(i, 127) - 1;
                if (c(i))
                {
                    com.squareup.okhttp.internal.framed.e e1 = f.a()[i];
                    ((c) (obj)).a.add(e1);
                } else
                {
                    j = ((a) (obj)).a(i - f.a().length);
                    if (j < 0 || j > ((a) (obj)).e.length - 1)
                    {
                        throw new IOException((new StringBuilder("Header index too large ")).append(i + 1).toString());
                    }
                    ((e) (obj)).a.add(((a) (obj)).e[j]);
                }
            } else
            if (i == 64)
            {
                ((e) (obj)).a(new com.squareup.okhttp.internal.framed.e(f.a(((nit>) (obj)).b()), ((b) (obj)).b()));
            } else
            if ((i & 0x40) == 64)
            {
                ((b) (obj)).a(new com.squareup.okhttp.internal.framed.e(((nit>) (obj)).b(((b) (obj)).a(i, 63) - 1), ((a) (obj)).b()));
            } else
            if ((i & 0x20) == 32)
            {
                obj.d = ((d) (obj)).a(i, 31);
                if (((a) (obj)).d < 0 || ((d) (obj)).d > ((d) (obj)).c)
                {
                    throw new IOException((new StringBuilder("Invalid dynamic table size update ")).append(((c) (obj)).d).toString());
                }
                ((d) (obj)).a();
            } else
            if (i == 16 || i == 0)
            {
                ByteString bytestring = f.a(((a) (obj)).b());
                ByteString bytestring2 = ((b) (obj)).b();
                ((b) (obj)).a.add(new com.squareup.okhttp.internal.framed.e(bytestring, bytestring2));
            } else
            {
                ByteString bytestring1 = ((nit>) (obj)).b(((b) (obj)).a(i, 15) - 1);
                ByteString bytestring3 = ((a) (obj)).b();
                ((b) (obj)).a.add(new com.squareup.okhttp.internal.framed.e(bytestring1, bytestring3));
            }
        }

        obj = a;
        ArrayList arraylist = new ArrayList(((a) (obj)).a);
        ((a) (obj)).a.clear();
        return arraylist;
    }

    private void b()
        throws IOException
    {
        b.h();
        b.f();
    }

    public final void a()
        throws IOException
    {
        if (!d)
        {
            ByteString bytestring = b.c(g.a().c.length);
            if (g.b().isLoggable(Level.FINE))
            {
                g.b().fine(String.format("<< CONNECTION %s", new Object[] {
                    bytestring.b()
                }));
            }
            if (!g.a().equals(bytestring))
            {
                throw g.a("Expected a connection header but was %s", new Object[] {
                    bytestring.a()
                });
            }
        }
    }

    public final boolean a(b b1)
        throws IOException
    {
        int i;
        boolean flag;
        int j2;
        boolean flag2;
        boolean flag6;
        flag2 = true;
        flag = false;
        flag6 = false;
        i = 0;
        try
        {
            b.a(9L);
            break MISSING_BLOCK_LABEL_24;
        }
        // Misplaced declaration of an exception variable
        catch (b b1)
        {
            flag2 = false;
        }
_L12:
        return flag2;
        byte byte0;
        byte byte1;
        int i2;
        j2 = g.a(b);
        if (j2 < 0 || j2 > 16384)
        {
            throw g.a("FRAME_SIZE_ERROR: %s", new Object[] {
                Integer.valueOf(j2)
            });
        }
        byte0 = (byte)(b.f() & 0xff);
        byte1 = (byte)(b.f() & 0xff);
        i2 = b.h() & 0x7fffffff;
        if (g.b().isLoggable(Level.FINE))
        {
            g.b().fine(a(true, i2, j2, byte0, byte1));
        }
        byte0;
        JVM INSTR tableswitch 0 8: default 196
    //                   0 210
    //                   1 319
    //                   2 432
    //                   3 477
    //                   4 570
    //                   5 899
    //                   6 981
    //                   7 1072
    //                   8 1206;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        b.f(j2);
        return true;
_L2:
        boolean flag1;
        boolean flag3;
        if ((byte1 & 1) != 0)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if ((byte1 & 0x20) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1)
        {
            throw g.a("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        if ((byte1 & 8) != 0)
        {
            i = (short)(b.f() & 0xff);
        }
        int j = g.a(j2, byte1, i);
        b1.a(flag3, i2, b, j);
        b.f(i);
        return true;
_L3:
        if (i2 == 0)
        {
            throw g.a("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        int k;
        boolean flag4;
        if ((byte1 & 1) != 0)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if ((byte1 & 8) != 0)
        {
            i = (short)(b.f() & 0xff);
        } else
        {
            i = 0;
        }
        k = j2;
        if ((byte1 & 0x20) != 0)
        {
            b();
            k = j2 - 5;
        }
        b1.a(false, flag4, i2, a(g.a(k, byte1, i), i, byte1, i2), HeadersMode.d);
        return true;
_L4:
        if (j2 != 5)
        {
            throw g.a("TYPE_PRIORITY length: %d != 5", new Object[] {
                Integer.valueOf(j2)
            });
        }
        if (i2 == 0)
        {
            throw g.a("TYPE_PRIORITY streamId == 0", new Object[0]);
        } else
        {
            b();
            return true;
        }
_L5:
        if (j2 != 4)
        {
            throw g.a("TYPE_RST_STREAM length: %d != 4", new Object[] {
                Integer.valueOf(j2)
            });
        }
        if (i2 == 0)
        {
            throw g.a("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        int l = b.h();
        ErrorCode errorcode = ErrorCode.b(l);
        if (errorcode == null)
        {
            throw g.a("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                Integer.valueOf(l)
            });
        } else
        {
            b1.a(i2, errorcode);
            return true;
        }
_L6:
        if (i2 != 0)
        {
            throw g.a("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((byte1 & 1) == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (j2 != 0)
        {
            throw g.a("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
        }
        if (true) goto _L12; else goto _L11
_L11:
        m m1;
        int i1;
        if (j2 % 6 != 0)
        {
            throw g.a("TYPE_SETTINGS length %% 6 != 0: %s", new Object[] {
                Integer.valueOf(j2)
            });
        }
        m1 = new m();
        i1 = 0;
_L21:
        if (i1 >= j2) goto _L14; else goto _L13
_L13:
        int k2;
        i = b.g();
        k2 = b.h();
        i2 = i;
        i;
        JVM INSTR tableswitch 1 6: default 720
    //                   1 772
    //                   2 739
    //                   3 769
    //                   4 793
    //                   5 813
    //                   6 772;
           goto _L15 _L16 _L17 _L18 _L19 _L20 _L16
_L16:
        break; /* Loop/switch isn't completed */
_L15:
        throw g.a("PROTOCOL_ERROR invalid settings id: %s", new Object[] {
            Short.valueOf(i)
        });
_L17:
        i2 = i;
        if (k2 != 0)
        {
            i2 = i;
            if (k2 != 1)
            {
                throw g.a("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
            }
        }
        break; /* Loop/switch isn't completed */
_L18:
        i2 = 4;
_L23:
        m1.a(i2, 0, k2);
        i1 += 6;
          goto _L21
_L19:
        i2 = 7;
        if (k2 >= 0) goto _L23; else goto _L22
_L22:
        throw g.a("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
_L20:
        if (k2 < 16384)
        {
            break; /* Loop/switch isn't completed */
        }
        i2 = i;
        if (k2 <= 0xffffff) goto _L23; else goto _L24
_L24:
        throw g.a("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new Object[] {
            Integer.valueOf(k2)
        });
_L14:
        b1.a(false, m1);
        if (m1.a() >= 0)
        {
            b1 = a;
            int j1 = m1.a();
            b1.c = j1;
            b1.d = j1;
            b1.a();
            return true;
        }
          goto _L12
_L7:
        if (i2 == 0)
        {
            throw g.a("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        short word0 = flag;
        if ((byte1 & 8) != 0)
        {
            word0 = (short)(b.f() & 0xff);
        }
        b1.a(b.h() & 0x7fffffff, a(g.a(j2 - 4, byte1, word0), word0, byte1, i2));
        return true;
_L8:
        if (j2 != 8)
        {
            throw g.a("TYPE_PING length != 8: %s", new Object[] {
                Integer.valueOf(j2)
            });
        }
        if (i2 != 0)
        {
            throw g.a("TYPE_PING streamId != 0", new Object[0]);
        }
        int k1 = b.h();
        i2 = b.h();
        boolean flag5 = flag6;
        if ((byte1 & 1) != 0)
        {
            flag5 = true;
        }
        b1.a(flag5, k1, i2);
        return true;
_L9:
        if (j2 < 8)
        {
            throw g.a("TYPE_GOAWAY length < 8: %s", new Object[] {
                Integer.valueOf(j2)
            });
        }
        if (i2 != 0)
        {
            throw g.a("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        int l1 = b.h();
        i2 = b.h();
        j2 -= 8;
        if (ErrorCode.b(i2) == null)
        {
            throw g.a("TYPE_GOAWAY unexpected error code: %d", new Object[] {
                Integer.valueOf(i2)
            });
        }
        ByteString bytestring = ByteString.b;
        if (j2 > 0)
        {
            bytestring = b.c(j2);
        }
        b1.a(l1, bytestring);
        return true;
_L10:
        if (j2 != 4)
        {
            throw g.a("TYPE_WINDOW_UPDATE length !=4: %s", new Object[] {
                Integer.valueOf(j2)
            });
        }
        long l2 = (long)b.h() & 0x7fffffffL;
        if (l2 == 0L)
        {
            throw g.a("windowSizeIncrement was 0", new Object[] {
                Long.valueOf(l2)
            });
        } else
        {
            b1.a(i2, l2);
            return true;
        }
    }

    public final void close()
        throws IOException
    {
        b.close();
    }

    rCode(e e1, boolean flag)
    {
        b = e1;
        d = flag;
        c = new <init>(b);
        a = new <init>(c);
    }
}
