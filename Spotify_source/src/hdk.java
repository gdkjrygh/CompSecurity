// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Closeable;
import java.io.EOFException;
import java.math.BigInteger;
import org.msgpack.core.MessageFormat;
import org.msgpack.core.MessageSizeException;
import org.msgpack.core.MessageTypeException;
import org.msgpack.core.buffer.MessageBuffer;
import org.msgpack.core.buffer.MessageBufferInput;
import org.msgpack.value.ValueType;
import org.msgpack.value.holder.FloatHolder;
import org.msgpack.value.holder.IntegerHolder;

public class hdk
    implements Closeable
{

    public static final MessageBuffer a = MessageBuffer.wrap(new byte[0]);
    private static boolean j;
    public MessageBufferInput b;
    public MessageBuffer c;
    public int d;
    public long e;
    public MessageBuffer f;
    public boolean g;
    private final hdh h;
    private final MessageBuffer i;

    public hdk(MessageBufferInput messagebufferinput)
    {
        this(messagebufferinput, hdf.b);
    }

    private hdk(MessageBufferInput messagebufferinput, hdh hdh1)
    {
        c = a;
        f = null;
        i = MessageBuffer.wrap(new byte[24]);
        g = false;
        b = (MessageBufferInput)hdm.a(messagebufferinput, "MessageBufferInput is null");
        h = (hdh)hdm.a(hdh1, "Config");
    }

    private int a(byte byte0)
    {
        switch (byte0)
        {
        default:
            return -1;

        case -39: 
            return o();

        case -38: 
            return k() & 0xffff;

        case -37: 
            return p();
        }
    }

    private static MessageTypeException a(String s, byte byte0)
    {
        ValueType valuetype = ValueType.a(byte0);
        return new MessageTypeException(String.format("Expected %s, but got %s (%02x)", new Object[] {
            s, (new StringBuilder()).append(valuetype.name().substring(0, 1)).append(valuetype.name().substring(1).toLowerCase()).toString(), Byte.valueOf(byte0)
        }));
    }

    private int b(byte byte0)
    {
        switch (byte0)
        {
        default:
            return -1;

        case -60: 
            return o();

        case -59: 
            return k() & 0xffff;

        case -58: 
            return p();
        }
    }

    private void b(int i1)
    {
        if (!j && i1 < 0)
        {
            throw new AssertionError();
        }
        if (d + i1 < 0)
        {
            g();
        }
        d = d + i1;
    }

    private MessageBuffer c(int i1)
    {
        boolean flag;
        if (i1 >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hdm.a(flag);
        if (!a(i1))
        {
            throw new EOFException();
        } else
        {
            MessageBuffer messagebuffer = c.slice(d, i1);
            d = d + i1;
            return messagebuffer;
        }
    }

    private boolean g()
    {
        for (; c != null && d >= c.size(); c = h())
        {
            int i1 = c.size();
            d = d - i1;
            long l1 = e;
            e = (long)i1 + l1;
        }

        return c != null;
    }

    private MessageBuffer h()
    {
        MessageBuffer messagebuffer1 = null;
        if (!g)
        {
            MessageBuffer messagebuffer;
            if (f == null)
            {
                messagebuffer = b.next();
            } else
            {
                messagebuffer = f;
                f = null;
            }
            messagebuffer1 = messagebuffer;
            if (messagebuffer == null)
            {
                g = true;
                return messagebuffer;
            }
        }
        return messagebuffer1;
    }

    private byte i()
    {
        byte byte0 = b();
        d = d + 1;
        return byte0;
    }

    private byte j()
    {
        if (!a(1))
        {
            throw new EOFException("insufficient data length for reading byte value");
        } else
        {
            byte byte0 = c.getByte(d);
            b(1);
            return byte0;
        }
    }

    private short k()
    {
        if (!a(2))
        {
            throw new EOFException("insufficient data length for reading short value");
        } else
        {
            short word0 = c.getShort(d);
            b(2);
            return word0;
        }
    }

    private int l()
    {
        if (!a(4))
        {
            throw new EOFException("insufficient data length for reading int value");
        } else
        {
            int i1 = c.getInt(d);
            b(4);
            return i1;
        }
    }

    private long m()
    {
        if (!a(8))
        {
            throw new EOFException("insufficient data length for reading long value");
        } else
        {
            long l1 = c.getLong(d);
            b(8);
            return l1;
        }
    }

    private double n()
    {
        if (!a(8))
        {
            throw new EOFException("insufficient data length for reading double value");
        } else
        {
            double d1 = c.getDouble(d);
            b(8);
            return d1;
        }
    }

    private int o()
    {
        return j() & 0xff;
    }

    private int p()
    {
        int i1 = l();
        if (i1 < 0)
        {
            throw new MessageSizeException((long)(i1 & 0x7fffffff) + 0x80000000L);
        } else
        {
            return i1;
        }
    }

    public final long a()
    {
        return e + (long)d;
    }

    public final MessageFormat a(hen hen1)
    {
        MessageFormat messageformat;
        int i1;
        i1 = 0;
        messageformat = MessageFormat.a(b());
        final class _cls1
        {

            static final int a[];
            private static int b[];

            static 
            {
                a = new int[ValueType.values().length];
                try
                {
                    a[ValueType.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror44) { }
                try
                {
                    a[ValueType.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror43) { }
                try
                {
                    a[ValueType.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror42) { }
                try
                {
                    a[ValueType.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror41) { }
                try
                {
                    a[ValueType.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror40) { }
                try
                {
                    a[ValueType.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror39) { }
                try
                {
                    a[ValueType.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror38) { }
                try
                {
                    a[ValueType.h.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror37) { }
                try
                {
                    a[ValueType.i.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror36) { }
                b = new int[MessageFormat.values().length];
                try
                {
                    b[MessageFormat.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror35) { }
                try
                {
                    b[MessageFormat.J.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror34) { }
                try
                {
                    b[MessageFormat.g.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror33) { }
                try
                {
                    b[MessageFormat.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror32) { }
                try
                {
                    b[MessageFormat.b.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror31) { }
                try
                {
                    b[MessageFormat.c.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror30) { }
                try
                {
                    b[MessageFormat.d.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror29) { }
                try
                {
                    b[MessageFormat.t.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror28) { }
                try
                {
                    b[MessageFormat.p.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror27) { }
                try
                {
                    b[MessageFormat.u.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror26) { }
                try
                {
                    b[MessageFormat.q.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror25) { }
                try
                {
                    b[MessageFormat.v.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror24) { }
                try
                {
                    b[MessageFormat.r.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror23) { }
                try
                {
                    b[MessageFormat.n.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror22) { }
                try
                {
                    b[MessageFormat.w.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror21) { }
                try
                {
                    b[MessageFormat.s.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror20) { }
                try
                {
                    b[MessageFormat.o.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror19) { }
                try
                {
                    b[MessageFormat.h.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror18) { }
                try
                {
                    b[MessageFormat.C.ordinal()] = 19;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    b[MessageFormat.i.ordinal()] = 20;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    b[MessageFormat.D.ordinal()] = 21;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    b[MessageFormat.j.ordinal()] = 22;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    b[MessageFormat.E.ordinal()] = 23;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    b[MessageFormat.x.ordinal()] = 24;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    b[MessageFormat.y.ordinal()] = 25;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    b[MessageFormat.z.ordinal()] = 26;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    b[MessageFormat.A.ordinal()] = 27;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    b[MessageFormat.B.ordinal()] = 28;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[MessageFormat.k.ordinal()] = 29;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[MessageFormat.l.ordinal()] = 30;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[MessageFormat.m.ordinal()] = 31;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[MessageFormat.F.ordinal()] = 32;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[MessageFormat.G.ordinal()] = 33;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    b[MessageFormat.H.ordinal()] = 34;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    b[MessageFormat.I.ordinal()] = 35;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    b[MessageFormat.f.ordinal()] = 36;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[messageformat.a().ordinal()];
        JVM INSTR tableswitch 1 9: default 76
    //                   1 79
    //                   2 99
    //                   3 137
    //                   4 477
    //                   5 612
    //                   6 722
    //                   7 832
    //                   8 893
    //                   9 933;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        return messageformat;
_L2:
        c();
        ValueType valuetype = ValueType.a;
        hen1.g = heu.a();
        return messageformat;
_L3:
        boolean flag = d();
        Object obj = ValueType.b;
        if (flag)
        {
            obj = her.a;
        } else
        {
            obj = her.b;
        }
        hen1.g = ((hei) (obj));
        return messageformat;
_L4:
        byte byte0;
        Object obj1;
        obj1 = hen1.a;
        byte0 = i();
        int k1 = byte0 & 0xff;
        if (k1 <= 127 || k1 >= 224)
        {
            i1 = 1;
        }
        if (!i1) goto _L12; else goto _L11
_L11:
        ((IntegerHolder) (obj1)).a(byte0);
_L14:
        obj1 = ValueType.c;
        hen1.g = hen1.a;
        return messageformat;
_L12:
        switch (byte0)
        {
        default:
            throw a("Integer", byte0);

        case -48: 
            ((IntegerHolder) (obj1)).a(j());
            break;

        case -47: 
            ((IntegerHolder) (obj1)).a(k());
            break;

        case -46: 
            ((IntegerHolder) (obj1)).a(l());
            break;

        case -45: 
            ((IntegerHolder) (obj1)).a(m());
            break;

        case -52: 
            byte0 = j();
            if (byte0 < 0)
            {
                ((IntegerHolder) (obj1)).a((short)(byte0 & 0xff));
            } else
            {
                ((IntegerHolder) (obj1)).a(byte0);
            }
            break;

        case -51: 
            short word0 = k();
            if (word0 < 0)
            {
                ((IntegerHolder) (obj1)).a(word0 & 0xffff);
            } else
            {
                ((IntegerHolder) (obj1)).a(word0);
            }
            break;

        case -50: 
            i1 = l();
            if (i1 < 0)
            {
                ((IntegerHolder) (obj1)).a((long)(i1 & 0x7fffffff) + 0x80000000L);
            } else
            {
                ((IntegerHolder) (obj1)).a(i1);
            }
            break;

        case -49: 
            long l2 = m();
            if (l2 < 0L)
            {
                BigInteger biginteger = BigInteger.valueOf(l2 + 0x7fffffffffffffffL + 1L).setBit(63);
                obj1.a = org.msgpack.value.holder.IntegerHolder.Type.e;
                obj1.b = biginteger;
            } else
            {
                ((IntegerHolder) (obj1)).a(l2);
            }
            break;
        }
        if (true) goto _L14; else goto _L13
_L13:
_L5:
        obj1 = hen1.b;
        byte0 = i();
        byte0;
        JVM INSTR tableswitch -54 -53: default 512
    //                   -54 521
    //                   -53 590;
           goto _L15 _L16 _L17
_L15:
        throw a("Float", byte0);
_L16:
        if (!a(4))
        {
            throw new EOFException("insufficient data length for reading float value");
        }
        float f1 = c.getFloat(d);
        b(4);
        obj1.a = org.msgpack.value.holder.FloatHolder.Type.a;
        obj1.b = f1;
_L18:
        obj1 = ValueType.d;
        hen1.g = hen1.b;
        return messageformat;
_L17:
        double d1 = n();
        obj1.a = org.msgpack.value.holder.FloatHolder.Type.b;
        obj1.b = d1;
          goto _L18
_L6:
        byte0 = i();
        if (!hdg.c(byte0)) goto _L20; else goto _L19
_L19:
        i1 = byte0 & 0x1f;
_L22:
        obj1 = c(i1);
        ValueType valuetype1 = ValueType.e;
        hen1.c.a(((MessageBuffer) (obj1)));
        hen1.g = hen1.c.a;
        return messageformat;
_L20:
        int l1;
        l1 = a(byte0);
        i1 = l1;
        if (l1 >= 0) goto _L22; else goto _L21
_L21:
        if (!h.b)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = b(byte0);
        i1 = l1;
        if (l1 >= 0) goto _L22; else goto _L23
_L23:
        throw a("String", byte0);
_L7:
        byte0 = i();
        if (!hdg.c(byte0)) goto _L25; else goto _L24
_L24:
        i1 = byte0 & 0x1f;
_L27:
        obj1 = c(i1);
        ValueType valuetype2 = ValueType.f;
        hen1.c.b(((MessageBuffer) (obj1)));
        hen1.g = hen1.c.b;
        return messageformat;
_L25:
        l1 = b(byte0);
        i1 = l1;
        if (l1 >= 0) goto _L27; else goto _L26
_L26:
        if (!h.a)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = a(byte0);
        i1 = l1;
        if (l1 >= 0) goto _L27; else goto _L28
_L28:
        throw a("Binary", byte0);
_L8:
        obj1 = ValueType.g;
        hen1.e = new heq(new hen());
        obj1 = hen1.e;
        obj1.a = this;
        obj1.c = e();
        obj1.b = 0;
        hen1.g = hen1.e;
        return messageformat;
_L9:
        obj1 = ValueType.h;
        new hen();
        hen1.f = new het();
        f();
        hen1.g = hen1.f;
        return messageformat;
_L10:
        byte0 = i();
        byte0;
        JVM INSTR tableswitch -57 -40: default 1028
    //                   -57 1175
    //                   -56 1195
    //                   -55 1218
    //                   -54 1028
    //                   -53 1028
    //                   -52 1028
    //                   -51 1028
    //                   -50 1028
    //                   -49 1028
    //                   -48 1028
    //                   -47 1028
    //                   -46 1028
    //                   -45 1028
    //                   -44 1037
    //                   -43 1105
    //                   -42 1122
    //                   -41 1139
    //                   -40 1157;
           goto _L29 _L30 _L31 _L32 _L29 _L29 _L29 _L29 _L29 _L29 _L29 _L29 _L29 _L29 _L33 _L34 _L35 _L36 _L37
_L29:
        throw a("Ext", byte0);
_L33:
        obj1 = new hde(1, j());
_L39:
        int j1 = ((hde) (obj1)).b;
        obj1 = c(((hde) (obj1)).a);
        Object obj2 = ValueType.i;
        obj2 = hen1.d;
        obj2.a = j1;
        obj2.b = ((MessageBuffer) (obj1));
        hen1.g = hen1.d;
        return messageformat;
_L34:
        obj1 = new hde(2, j());
        continue; /* Loop/switch isn't completed */
_L35:
        obj1 = new hde(4, j());
        continue; /* Loop/switch isn't completed */
_L36:
        obj1 = new hde(8, j());
        continue; /* Loop/switch isn't completed */
_L37:
        obj1 = new hde(16, j());
        continue; /* Loop/switch isn't completed */
_L30:
        obj1 = new hde(o(), j());
        continue; /* Loop/switch isn't completed */
_L31:
        obj1 = new hde(k() & 0xffff, j());
        continue; /* Loop/switch isn't completed */
_L32:
        obj1 = new hde(p(), j());
        if (true) goto _L39; else goto _L38
_L38:
    }

    public final boolean a(int i1)
    {
        if (i1 == 0)
        {
            return true;
        }
        if (!g())
        {
            return false;
        }
        if (d + i1 <= c.size())
        {
            return true;
        }
        MessageBuffer messagebuffer;
        int j1;
        if (i1 <= i.size())
        {
            messagebuffer = i;
        } else
        {
            messagebuffer = MessageBuffer.newBuffer(i1);
        }
        j1 = c.size() - d;
        if (j1 > 0)
        {
            c.copyTo(d, messagebuffer, 0, j1);
        }
        while (j1 < i1) 
        {
            f = h();
            if (f == null)
            {
                return false;
            }
            int k1 = Math.min(i1 - j1, f.size());
            f.copyTo(0, messagebuffer, j1, k1);
            MessageBuffer messagebuffer1;
            if (k1 == f.size())
            {
                messagebuffer1 = null;
            } else
            {
                messagebuffer1 = f.slice(k1, f.size() - k1);
            }
            f = messagebuffer1;
            j1 += k1;
        }
        e = e + (long)d;
        if (i1 != messagebuffer.size())
        {
            messagebuffer = messagebuffer.slice(0, i1);
        }
        c = messagebuffer;
        d = 0;
        return true;
    }

    public final byte b()
    {
        if (a(1))
        {
            return c.getByte(d);
        } else
        {
            throw new EOFException();
        }
    }

    public final Object c()
    {
        byte byte0 = i();
        if (byte0 == -64)
        {
            return null;
        } else
        {
            throw a("Nil", byte0);
        }
    }

    public void close()
    {
        b.close();
    }

    public final boolean d()
    {
        byte byte0 = i();
        if (byte0 == -62)
        {
            return false;
        }
        if (byte0 == -61)
        {
            return true;
        } else
        {
            throw a("boolean", byte0);
        }
    }

    public final int e()
    {
        byte byte0 = i();
        if (hdg.a(byte0))
        {
            return byte0 & 0xf;
        }
        switch (byte0)
        {
        default:
            throw a("Array", byte0);

        case -36: 
            return k() & 0xffff;

        case -35: 
            return p();
        }
    }

    public final int f()
    {
        byte byte0 = i();
        if (hdg.b(byte0))
        {
            return byte0 & 0xf;
        }
        switch (byte0)
        {
        default:
            throw a("Map", byte0);

        case -34: 
            return k() & 0xffff;

        case -33: 
            return p();
        }
    }

    static 
    {
        boolean flag;
        if (!hdk.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
    }
}
