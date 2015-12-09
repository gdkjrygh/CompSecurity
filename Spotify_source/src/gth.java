// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.squareup.okhttp.internal.framed.ErrorCode;
import com.squareup.okhttp.internal.framed.HeadersMode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.ByteString;

final class gth
    implements gsq
{

    private final hcj a;
    private final gtf b;
    private final boolean c;
    private gtc d;

    gth(hcj hcj1, boolean flag)
    {
        a = hcj1;
        c = flag;
        b = new gtf(a);
        d = new gtc(b);
    }

    private List a(int i, short word0, byte byte0, int j)
    {
        Object obj = b;
        b.d = i;
        obj.a = i;
        b.e = word0;
        b.b = byte0;
        b.c = j;
        for (obj = d; !((gtc) (obj)).b.e();)
        {
            i = ((gtc) (obj)).b.g() & 0xff;
            if (i == 128)
            {
                throw new IOException("index == 0");
            }
            if ((i & 0x80) == 128)
            {
                i = ((gtc) (obj)).a(i, 127) - 1;
                if (gtc.c(i))
                {
                    gta gta1 = gtb.a()[i];
                    ((gtc) (obj)).a.add(gta1);
                } else
                {
                    j = ((gtc) (obj)).a(i - gtb.a().length);
                    if (j < 0 || j > ((gtc) (obj)).e.length - 1)
                    {
                        throw new IOException((new StringBuilder("Header index too large ")).append(i + 1).toString());
                    }
                    ((gtc) (obj)).a.add(((gtc) (obj)).e[j]);
                }
            } else
            if (i == 64)
            {
                ((gtc) (obj)).a(new gta(gtb.a(((gtc) (obj)).b()), ((gtc) (obj)).b()));
            } else
            if ((i & 0x40) == 64)
            {
                ((gtc) (obj)).a(new gta(((gtc) (obj)).b(((gtc) (obj)).a(i, 63) - 1), ((gtc) (obj)).b()));
            } else
            if ((i & 0x20) == 32)
            {
                obj.d = ((gtc) (obj)).a(i, 31);
                if (((gtc) (obj)).d < 0 || ((gtc) (obj)).d > ((gtc) (obj)).c)
                {
                    throw new IOException((new StringBuilder("Invalid dynamic table size update ")).append(((gtc) (obj)).d).toString());
                }
                ((gtc) (obj)).a();
            } else
            if (i == 16 || i == 0)
            {
                ByteString bytestring = gtb.a(((gtc) (obj)).b());
                ByteString bytestring2 = ((gtc) (obj)).b();
                ((gtc) (obj)).a.add(new gta(bytestring, bytestring2));
            } else
            {
                ByteString bytestring1 = ((gtc) (obj)).b(((gtc) (obj)).a(i, 15) - 1);
                ByteString bytestring3 = ((gtc) (obj)).b();
                ((gtc) (obj)).a.add(new gta(bytestring1, bytestring3));
            }
        }

        obj = d;
        ArrayList arraylist = new ArrayList(((gtc) (obj)).a);
        ((gtc) (obj)).a.clear();
        return arraylist;
    }

    private void b()
    {
        a.i();
        a.g();
    }

    public final void a()
    {
        if (!c)
        {
            ByteString bytestring = a.c(gte.a().f());
            if (gte.b().isLoggable(Level.FINE))
            {
                gte.b().fine(String.format("<< CONNECTION %s", new Object[] {
                    bytestring.d()
                }));
            }
            if (!gte.a().equals(bytestring))
            {
                throw gte.a("Expected a connection header but was %s", new Object[] {
                    bytestring.a()
                });
            }
        }
    }

    public final boolean a(gsr gsr1)
    {
        int i;
        boolean flag;
        int k2;
        boolean flag2;
        boolean flag6;
        flag2 = true;
        flag = false;
        flag6 = false;
        i = 0;
        try
        {
            a.a(9L);
            break MISSING_BLOCK_LABEL_24;
        }
        // Misplaced declaration of an exception variable
        catch (gsr gsr1)
        {
            flag2 = false;
        }
_L12:
        return flag2;
        byte byte0;
        byte byte1;
        int j2;
        k2 = gte.a(a);
        if (k2 < 0 || k2 > 16384)
        {
            throw gte.a("FRAME_SIZE_ERROR: %s", new Object[] {
                Integer.valueOf(k2)
            });
        }
        byte0 = a.g();
        byte1 = a.g();
        j2 = a.i() & 0x7fffffff;
        if (gte.b().isLoggable(Level.FINE))
        {
            gte.b().fine(gtg.a(true, j2, k2, byte0, byte1));
        }
        byte0;
        JVM INSTR tableswitch 0 8: default 184
    //                   0 198
    //                   1 307
    //                   2 420
    //                   3 465
    //                   4 558
    //                   5 887
    //                   6 974
    //                   7 1065
    //                   8 1199;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        a.f(k2);
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
            throw gte.a("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        if ((byte1 & 8) != 0)
        {
            i = (short)(a.g() & 0xff);
        }
        int j = gte.a(k2, byte1, i);
        gsr1.a(flag3, j2, a, j);
        a.f(i);
        return true;
_L3:
        if (j2 == 0)
        {
            throw gte.a("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
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
            i = (short)(a.g() & 0xff);
        } else
        {
            i = 0;
        }
        k = k2;
        if ((byte1 & 0x20) != 0)
        {
            b();
            k = k2 - 5;
        }
        gsr1.a(false, flag4, j2, a(gte.a(k, byte1, i), i, byte1, j2), HeadersMode.d);
        return true;
_L4:
        if (k2 != 5)
        {
            throw gte.a("TYPE_PRIORITY length: %d != 5", new Object[] {
                Integer.valueOf(k2)
            });
        }
        if (j2 == 0)
        {
            throw gte.a("TYPE_PRIORITY streamId == 0", new Object[0]);
        } else
        {
            b();
            return true;
        }
_L5:
        if (k2 != 4)
        {
            throw gte.a("TYPE_RST_STREAM length: %d != 4", new Object[] {
                Integer.valueOf(k2)
            });
        }
        if (j2 == 0)
        {
            throw gte.a("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        int l = a.i();
        ErrorCode errorcode = ErrorCode.b(l);
        if (errorcode == null)
        {
            throw gte.a("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                Integer.valueOf(l)
            });
        } else
        {
            gsr1.a(j2, errorcode);
            return true;
        }
_L6:
        if (j2 != 0)
        {
            throw gte.a("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((byte1 & 1) == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (k2 != 0)
        {
            throw gte.a("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
        }
        if (true) goto _L12; else goto _L11
_L11:
        gtp gtp1;
        int i1;
        if (k2 % 6 != 0)
        {
            throw gte.a("TYPE_SETTINGS length %% 6 != 0: %s", new Object[] {
                Integer.valueOf(k2)
            });
        }
        gtp1 = new gtp();
        i1 = 0;
_L21:
        if (i1 >= k2) goto _L14; else goto _L13
_L13:
        int l2;
        i = a.h();
        l2 = a.i();
        j2 = i;
        i;
        JVM INSTR tableswitch 1 6: default 708
    //                   1 760
    //                   2 727
    //                   3 757
    //                   4 781
    //                   5 801
    //                   6 760;
           goto _L15 _L16 _L17 _L18 _L19 _L20 _L16
_L16:
        break; /* Loop/switch isn't completed */
_L15:
        throw gte.a("PROTOCOL_ERROR invalid settings id: %s", new Object[] {
            Short.valueOf(i)
        });
_L17:
        j2 = i;
        if (l2 != 0)
        {
            j2 = i;
            if (l2 != 1)
            {
                throw gte.a("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
            }
        }
        break; /* Loop/switch isn't completed */
_L18:
        j2 = 4;
_L23:
        gtp1.a(j2, 0, l2);
        i1 += 6;
          goto _L21
_L19:
        j2 = 7;
        if (l2 >= 0) goto _L23; else goto _L22
_L22:
        throw gte.a("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
_L20:
        if (l2 < 16384)
        {
            break; /* Loop/switch isn't completed */
        }
        j2 = i;
        if (l2 <= 0xffffff) goto _L23; else goto _L24
_L24:
        throw gte.a("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", new Object[] {
            Integer.valueOf(l2)
        });
_L14:
        gsr1.a(false, gtp1);
        if (gtp1.a() >= 0)
        {
            gsr1 = d;
            int j1 = gtp1.a();
            gsr1.c = j1;
            gsr1.d = j1;
            gsr1.a();
            return true;
        }
          goto _L12
_L7:
        if (j2 == 0)
        {
            throw gte.a("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        short word0 = flag;
        if ((byte1 & 8) != 0)
        {
            word0 = (short)(a.g() & 0xff);
        }
        int k1 = a.i();
        a(gte.a(k2 - 4, byte1, word0), word0, byte1, j2);
        gsr1.a(k1 & 0x7fffffff);
        return true;
_L8:
        if (k2 != 8)
        {
            throw gte.a("TYPE_PING length != 8: %s", new Object[] {
                Integer.valueOf(k2)
            });
        }
        if (j2 != 0)
        {
            throw gte.a("TYPE_PING streamId != 0", new Object[0]);
        }
        int l1 = a.i();
        j2 = a.i();
        boolean flag5 = flag6;
        if ((byte1 & 1) != 0)
        {
            flag5 = true;
        }
        gsr1.a(flag5, l1, j2);
        return true;
_L9:
        if (k2 < 8)
        {
            throw gte.a("TYPE_GOAWAY length < 8: %s", new Object[] {
                Integer.valueOf(k2)
            });
        }
        if (j2 != 0)
        {
            throw gte.a("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        int i2 = a.i();
        j2 = a.i();
        k2 -= 8;
        if (ErrorCode.b(j2) == null)
        {
            throw gte.a("TYPE_GOAWAY unexpected error code: %d", new Object[] {
                Integer.valueOf(j2)
            });
        }
        ByteString bytestring = ByteString.a;
        if (k2 > 0)
        {
            bytestring = a.c(k2);
        }
        gsr1.a(i2, bytestring);
        return true;
_L10:
        if (k2 != 4)
        {
            throw gte.a("TYPE_WINDOW_UPDATE length !=4: %s", new Object[] {
                Integer.valueOf(k2)
            });
        }
        long l3 = (long)a.i() & 0x7fffffffL;
        if (l3 == 0L)
        {
            throw gte.a("windowSizeIncrement was 0", new Object[] {
                Long.valueOf(l3)
            });
        } else
        {
            gsr1.a(j2, l3);
            return true;
        }
    }

    public final void close()
    {
        a.close();
    }
}
