// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dq;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p.dl.a;
import p.dm.e;
import p.dm.f;
import p.dm.g;
import p.dm.i;
import p.dm.m;
import p.dn.b;
import p.ds.d;

// Referenced classes of package p.dq:
//            a, d, b

public class c
    implements Runnable
{

    InputStream a;
    OutputStream b;
    boolean c;
    boolean d;
    protected byte e;
    public int f;
    p.dq.d g;
    p.dq.b h;
    p.dq.a i;
    String j;
    String k;
    boolean l;

    c()
    {
        c = false;
        d = false;
        e = 0;
        f = -1;
        l = false;
    }

    public static StringBuffer a(byte abyte0[], boolean flag)
        throws i
    {
        StringBuffer stringbuffer;
        c c1;
        ByteArrayOutputStream bytearrayoutputstream;
        int i1;
        boolean flag3;
        boolean flag4;
        stringbuffer = null;
        c1 = a();
        if (abyte0 == null || abyte0.length == 0)
        {
            throw new i("frame content is null", null);
        }
        if (flag)
        {
            stringbuffer = new StringBuffer();
        }
        bytearrayoutputstream = new ByteArrayOutputStream(8192);
        i1 = 0;
        flag4 = false;
        flag3 = false;
_L2:
        if (i1 >= abyte0.length)
        {
            break MISSING_BLOCK_LABEL_320;
        }
        if (abyte0[i1] != a.k.c())
        {
            break MISSING_BLOCK_LABEL_93;
        }
        bytearrayoutputstream.reset();
        boolean flag1;
        boolean flag2;
        flag1 = false;
        flag2 = true;
        break MISSING_BLOCK_LABEL_329;
        flag1 = flag4;
        flag2 = flag3;
        if (!flag3)
        {
            break MISSING_BLOCK_LABEL_329;
        }
        f f1;
        if (abyte0[i1] != a.l.c())
        {
            break MISSING_BLOCK_LABEL_169;
        }
        f1 = c1.c(bytearrayoutputstream.toByteArray());
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_154;
        }
        stringbuffer.append(f1.a(g.c));
        stringbuffer.append('\n');
        bytearrayoutputstream.reset();
        flag2 = false;
        flag1 = flag4;
        break MISSING_BLOCK_LABEL_329;
        if (!flag4)
        {
            break MISSING_BLOCK_LABEL_276;
        }
        if (abyte0[i1] != a.n.c())
        {
            break MISSING_BLOCK_LABEL_208;
        }
        bytearrayoutputstream.write(a.k.b());
        flag1 = false;
        flag2 = flag3;
        break MISSING_BLOCK_LABEL_329;
        if (abyte0[i1] != a.o.c())
        {
            break MISSING_BLOCK_LABEL_242;
        }
        bytearrayoutputstream.write(a.l.b());
        flag1 = false;
        flag2 = flag3;
        break MISSING_BLOCK_LABEL_329;
        if (abyte0[i1] != a.p.c())
        {
            break MISSING_BLOCK_LABEL_322;
        }
        bytearrayoutputstream.write(a.m.b());
        flag1 = false;
        flag2 = flag3;
        break MISSING_BLOCK_LABEL_329;
        if (abyte0[i1] == a.m.c())
        {
            flag1 = true;
            flag2 = flag3;
            break MISSING_BLOCK_LABEL_329;
        }
        bytearrayoutputstream.write(abyte0[i1]);
        flag1 = flag4;
        flag2 = flag3;
        break MISSING_BLOCK_LABEL_329;
        abyte0;
        return stringbuffer;
        flag1 = false;
        flag2 = flag3;
        i1++;
        flag4 = flag1;
        flag3 = flag2;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static c a()
    {
        return new c();
    }

    public static void a(byte abyte0[])
        throws i
    {
        a(abyte0, false);
    }

    private boolean a(p.dm.d d1)
    {
        return d1.b().e == b.h;
    }

    public static byte[] a(byte byte0, p.dn.a a1)
    {
        try
        {
            a1 = b(new p.dm.d(byte0, a1));
        }
        // Misplaced declaration of an exception variable
        catch (p.dn.a a1)
        {
            return new byte[0];
        }
        return a1;
    }

    public static byte[] b(f f1)
        throws IOException
    {
        byte abyte0[] = (new p.ds.c(f1.d().length)).b();
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        int i1;
        if (f1 instanceof p.dm.d)
        {
            i1 = a.q.c();
        } else
        {
            i1 = a.r.c();
        }
        bytearrayoutputstream.write(i1);
        bytearrayoutputstream.write(f1.c());
        bytearrayoutputstream.write(abyte0);
        bytearrayoutputstream.write(f1.d());
        bytearrayoutputstream.write(p.dm.c.a(bytearrayoutputstream.toByteArray(), 0, bytearrayoutputstream.size()).b());
        f1 = new ByteArrayOutputStream();
        f1.write(a.k.b());
        f1.write(b(bytearrayoutputstream.toByteArray()));
        f1.write(a.l.b());
        return f1.toByteArray();
    }

    private static byte[] b(byte abyte0[])
    {
        ByteArrayOutputStream bytearrayoutputstream;
        int i1;
        i1 = 0;
        if (abyte0 == null)
        {
            return new byte[0];
        }
        bytearrayoutputstream = new ByteArrayOutputStream();
_L2:
label0:
        {
            if (i1 < abyte0.length)
            {
                if (abyte0[i1] == a.k.c())
                {
                    bytearrayoutputstream.write(a.m.b());
                    bytearrayoutputstream.write(a.n.b());
                    break MISSING_BLOCK_LABEL_148;
                }
                try
                {
                    if (abyte0[i1] == a.m.c())
                    {
                        bytearrayoutputstream.write(a.m.b());
                        bytearrayoutputstream.write(a.p.b());
                        break MISSING_BLOCK_LABEL_148;
                    }
                    break label0;
                }
                // Misplaced declaration of an exception variable
                catch (byte abyte0[])
                {
                    p.dm.m.c("Error escaping payload ", abyte0);
                }
            }
            return bytearrayoutputstream.toByteArray();
        }
        if (abyte0[i1] == a.l.c())
        {
            bytearrayoutputstream.write(a.m.b());
            bytearrayoutputstream.write(a.o.b());
            break MISSING_BLOCK_LABEL_148;
        }
        bytearrayoutputstream.write(abyte0[i1]);
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private String c(String s)
    {
        StringBuffer stringbuffer = new StringBuffer("[");
        stringbuffer.append(h());
        stringbuffer.append("] [");
        stringbuffer.append(p.dm.m.a(this));
        stringbuffer.append("] ");
        stringbuffer.append(s);
        return stringbuffer.toString();
    }

    private f c(byte abyte0[])
        throws i
    {
        byte byte0;
        byte abyte2[];
        byte abyte3[];
        byte byte1;
        int i1;
        if (abyte0 == null)
        {
            throw new i("frame content is null", null);
        }
        if (abyte0.length < 8)
        {
            throw new i((new StringBuilder()).append("frame content is too small, got length: ").append(abyte0.length).toString(), abyte0);
        }
        byte abyte1[] = new byte[4];
        abyte2 = new byte[abyte0.length - 8];
        abyte3 = new byte[2];
        byte1 = abyte0[0];
        byte0 = abyte0[1];
        try
        {
            System.arraycopy(abyte0, 2, abyte1, 0, abyte1.length);
            System.arraycopy(abyte0, abyte1.length + 2, abyte2, 0, abyte2.length);
            System.arraycopy(abyte0, abyte1.length + 2 + abyte2.length, abyte3, 0, abyte3.length);
            i1 = (new p.ds.c(abyte1)).c();
            if (abyte2.length != i1)
            {
                throw new i((new StringBuilder()).append("length does not match.  Declared payload length: ").append(i1).append(" Actual payload length: ").append(abyte2.length).toString(), abyte0);
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayindexoutofboundsexception)
        {
            throw new i((new StringBuilder()).append("Error parsing frame contents - structure/length mismatch. ").append(arrayindexoutofboundsexception.getMessage()).toString(), abyte0);
        }
        int j1 = (new p.ds.b(abyte3)).c();
        if (p.dm.c.a(abyte0, 0, abyte0.length - 2).c() != j1)
        {
            throw new i((new StringBuilder()).append("crc does not match.  Payload crc: ").append(Integer.toHexString(j1)).append(" Computed crc: ").append(Integer.toHexString(p.dm.c.a(abyte0, 0, abyte0.length - 2).c())).toString(), abyte0);
        }
        if (byte1 != a.q.c())
        {
            break MISSING_BLOCK_LABEL_336;
        }
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_325;
        }
        throw new i("data frame does not have a payload", abyte0);
        return new p.dm.d(byte0, abyte2);
        if (byte1 != a.r.c())
        {
            break MISSING_BLOCK_LABEL_373;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_364;
        }
        throw new i("ack frame should not have a payload", abyte0);
        return new p.dm.a(byte0);
        throw new i((new StringBuilder()).append("unknown frame type: ").append(byte1).toString(), abyte0);
    }

    public void a(int i1)
    {
        i.a = (byte)i1;
    }

    public void a(Class class1)
    {
        if (i() || i == null)
        {
            return;
        } else
        {
            i.a(class1);
            return;
        }
    }

    protected void a(String s)
    {
        if (g != null)
        {
            g.d(c(s));
        }
    }

    public void a(String s, f f1)
    {
        if (g == null || !m.bg.a(e.b)) goto _L2; else goto _L1
_L1:
        static class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[p.dm.g.values().length];
                try
                {
                    a[g.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[g.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        p.dq._cls1.a[g.ab().ordinal()];
        JVM INSTR tableswitch 1 2: default 56
    //                   1 57
    //                   2 57;
           goto _L2 _L3 _L3
_L2:
        return;
_L3:
        p.dm.m.l((new StringBuilder()).append(s).append(" INVALID COMMAND ").append(f1.toString()).toString());
        return;
    }

    protected void a(f f1)
        throws i
    {
        int i1 = 1;
        if (f1 != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!(f1 instanceof p.dm.d) && !(f1 instanceof p.dm.a))
        {
            throw new i((new StringBuilder()).append("FrameParser only supports DataFrames and AckFrames - received ").append(f1.getClass()).toString(), f1.e());
        }
        boolean flag = c(f1);
        if (flag)
        {
            b((new StringBuilder()).append("INVALID COMMAND, Ignoring.... Unable to determine COMMAND from frame ").append(f1.toString()).toString());
            a(j, f1);
        } else
        {
            b(j, f1);
        }
        if (g == null) goto _L4; else goto _L3
_L3:
        if (!g.S())
        {
            break; /* Loop/switch isn't completed */
        }
        if (!(f1 instanceof p.dm.d))
        {
            break MISSING_BLOCK_LABEL_290;
        }
        if (!d && a((p.dm.d)f1))
        {
            e = f1.c();
            c();
        }
        if (f1.c() == e || !p.cx.c.bi)
        {
            if (e == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            e = (byte)i1;
            i1 = 0;
        } else
        {
            b((new StringBuilder()).append("unexpected read sequence, frame will be ignored. expected:").append(e).append(", got:").append(f1.c()).toString());
        }
        try
        {
            i.a(new p.dm.a(e));
        }
        catch (IOException ioexception) { }
        if (i1 != 0) goto _L1; else goto _L5
_L5:
        if (!flag)
        {
            h.a(f1);
            return;
        }
          goto _L4
        if (f1 instanceof p.dm.a)
        {
            i.a(f1.c());
        }
        if (true) goto _L5; else goto _L6
_L6:
_L4:
        if (true) goto _L1; else goto _L7
_L7:
    }

    public void a(p.dn.a a1)
    {
        a(a1, false);
    }

    public void a(p.dn.a a1, boolean flag)
    {
        if (i() || i == null)
        {
            return;
        } else
        {
            i.a(a1, flag);
            return;
        }
    }

    public void a(p.dq.d d1)
    {
        g = d1;
        a("initialize getting io streams");
        a = d1.N();
        b = d1.O();
        l = false;
        j = "[Device --> Pandora]";
        k = "[Pandora --> Device]";
        i = new p.dq.a(this, d1.aa(), d1.S());
        h = new p.dq.b(this);
        d = false;
    }

    protected void b(String s)
    {
        if (g != null)
        {
            g.k(c(s));
        }
    }

    public void b(String s, f f1)
    {
        if (g == null || !m.bg.a(e.b)) goto _L2; else goto _L1
_L1:
        p.dq._cls1.a[g.ab().ordinal()];
        JVM INSTR tableswitch 1 2: default 56
    //                   1 57
    //                   2 91;
           goto _L2 _L3 _L4
_L2:
        return;
_L3:
        p.dm.m.l((new StringBuilder()).append(s).append(" ").append(f1.a(g.c)).toString());
        return;
_L4:
        p.dm.m.l((new StringBuilder()).append(s).append(" ").append(f1.a(g.b)).toString());
        return;
    }

    public void b(p.dn.a a1, boolean flag)
    {
        if (i() || i == null)
        {
            return;
        } else
        {
            i.b(a1, flag);
            return;
        }
    }

    public boolean b()
    {
        return g != null;
    }

    public void c()
    {
        d = true;
        a(0);
    }

    protected boolean c(f f1)
    {
        return (f1 instanceof p.dm.d) && ((p.dm.d)f1).b() == null;
    }

    public void d()
    {
        d = false;
        if (i != null)
        {
            i.a();
        }
    }

    public void e()
    {
        byte byte0;
        Object obj;
        ByteArrayOutputStream bytearrayoutputstream;
        ByteArrayOutputStream bytearrayoutputstream1;
        byte abyte0[];
        byte abyte1[];
        boolean flag;
        boolean flag1;
        bytearrayoutputstream1 = new ByteArrayOutputStream(8192);
        bytearrayoutputstream = new ByteArrayOutputStream(8192);
        abyte0 = new byte[8192];
        abyte1 = new byte[8192];
        obj = null;
        byte0 = 0;
        flag1 = false;
        flag = false;
_L5:
        byte byte2;
        byte byte3;
        Object obj1;
        Object obj2;
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        if (i()) goto _L2; else goto _L1
_L1:
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        Object obj3 = a;
        if (obj3 != null) goto _L3; else goto _L2
_L2:
        byte byte1;
        int i1;
        int j1;
        int l1;
        int k1;
        if (bytearrayoutputstream1 != null)
        {
            try
            {
                bytearrayoutputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            finally
            {
                throw obj;
            }
        }
        if (bytearrayoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_113;
        }
        bytearrayoutputstream.close();
_L4:
        return;
        obj;
        throw obj;
_L3:
        i1 = 0;
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        System.arraycopy(abyte0, 0, abyte1, 0, abyte1.length);
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        if (a.available() != 0)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        j1 = a.read(abyte1, 0, 1);
        i1 = j1;
        if (j1 != -1)
        {
            break MISSING_BLOCK_LABEL_272;
        }
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        throw new IOException("Input stream closed");
        obj;
        b("Lost Link Connection");
        g();
        if (bytearrayoutputstream1 != null)
        {
            try
            {
                bytearrayoutputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            finally
            {
                throw obj;
            }
        }
        if (bytearrayoutputstream != null)
        {
            try
            {
                bytearrayoutputstream.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return;
            }
            finally
            {
                throw obj;
            }
        }
          goto _L4
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        j1 = a.available();
        k1 = i1;
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_475;
        }
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        j1 = a.read(abyte1, i1, Math.min(j1, abyte1.length - i1));
        if (j1 != -1)
        {
            break MISSING_BLOCK_LABEL_468;
        }
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        throw new IOException("Input stream closed");
        obj;
        flag1 = false;
        flag = false;
        b((new StringBuilder()).append("drop bad frames on the floor ").append(((i) (obj)).getMessage()).toString());
        p.dm.m.c((new StringBuilder()).append(h()).append(" drop bad frames on the floor ").toString(), ((Throwable) (obj)));
        byte0 = byte2;
        obj = obj2;
          goto _L5
        obj;
        if (bytearrayoutputstream1 != null)
        {
            try
            {
                bytearrayoutputstream1.close();
            }
            catch (Exception exception) { }
            finally
            {
                throw obj;
            }
        }
        if (bytearrayoutputstream != null)
        {
            try
            {
                bytearrayoutputstream.close();
            }
            catch (Exception exception1) { }
            finally
            {
                throw obj;
            }
        }
        throw obj;
        k1 = i1 + j1;
        l1 = 0;
        i1 = ((flag) ? 1 : 0);
_L16:
        if (l1 >= k1) goto _L7; else goto _L6
_L6:
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        if (abyte1[l1] != a.k.c())
        {
            break MISSING_BLOCK_LABEL_590;
        }
        j1 = 1;
        flag = false;
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        bytearrayoutputstream1.reset();
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        bytearrayoutputstream.reset();
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        bytearrayoutputstream.write(abyte1[l1]);
        byte1 = byte0;
        obj3 = obj;
        break MISSING_BLOCK_LABEL_1380;
        flag = i1;
        j1 = ((flag1) ? 1 : 0);
        byte1 = byte0;
        obj3 = obj;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_1380;
        }
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        bytearrayoutputstream.write(abyte1[l1]);
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        if (abyte1[l1] != a.l.c())
        {
            break MISSING_BLOCK_LABEL_839;
        }
        j1 = 0;
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        obj3 = bytearrayoutputstream1.toByteArray();
        byte2 = byte0;
        obj2 = obj;
        byte1 = byte0;
        byte3 = byte0;
        obj1 = obj;
        if (obj3.length > 8)
        {
            byte1 = obj3[6];
        }
        byte2 = byte1;
        obj2 = obj;
        byte3 = byte1;
        obj1 = obj;
        obj = c(((byte []) (obj3)));
        byte2 = byte1;
        obj2 = obj;
        byte3 = byte1;
        obj1 = obj;
        obj.c = bytearrayoutputstream.toByteArray();
        byte2 = byte1;
        obj2 = obj;
        byte3 = byte1;
        obj1 = obj;
        bytearrayoutputstream1.reset();
        byte2 = byte1;
        obj2 = obj;
        byte3 = byte1;
        obj1 = obj;
        bytearrayoutputstream.reset();
        byte2 = byte1;
        obj2 = obj;
        byte3 = byte1;
        obj1 = obj;
        a(((f) (obj)));
        byte2 = byte1;
        obj2 = obj;
        byte3 = byte1;
        obj1 = obj;
        n();
        obj3 = null;
        byte1 = 0;
        flag = i1;
        break MISSING_BLOCK_LABEL_1380;
        if (!i1) goto _L9; else goto _L8
_L8:
        i1 = 0;
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        if (abyte1[l1] != a.n.c()) goto _L11; else goto _L10
_L10:
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        bytearrayoutputstream1.write(a.k.b());
        flag = i1;
        j1 = ((flag1) ? 1 : 0);
        byte1 = byte0;
        obj3 = obj;
        break MISSING_BLOCK_LABEL_1380;
        obj2;
        obj3 = (new StringBuilder()).append("Irrecoverable error processing frame ");
        if (byte3 == 0) goto _L13; else goto _L12
_L12:
        obj = (new StringBuilder()).append("Command : ").append(p.dn.a.b(new byte[] {
            byte3
        })).toString();
_L14:
        obj3 = ((StringBuilder) (obj3)).append(((String) (obj))).append(" Frame : ");
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_1324;
        }
        obj = ((f) (obj1)).a(g.c);
_L15:
        b(((StringBuilder) (obj3)).append(((String) (obj))).append(", shutting down PandoraLink connection [Error: ").append(((Throwable) (obj2)).toString()).append("]").toString());
        ((Throwable) (obj2)).printStackTrace();
        g();
        if (bytearrayoutputstream1 != null)
        {
            try
            {
                bytearrayoutputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
            finally
            {
                throw obj;
            }
        }
        if (bytearrayoutputstream != null)
        {
            try
            {
                bytearrayoutputstream.close();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return;
            }
            finally
            {
                throw obj;
            }
        }
          goto _L4
_L11:
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        if (abyte1[l1] != a.o.c())
        {
            break MISSING_BLOCK_LABEL_1134;
        }
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        bytearrayoutputstream1.write(a.l.b());
        flag = i1;
        j1 = ((flag1) ? 1 : 0);
        byte1 = byte0;
        obj3 = obj;
        break MISSING_BLOCK_LABEL_1380;
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        flag = i1;
        j1 = ((flag1) ? 1 : 0);
        byte1 = byte0;
        obj3 = obj;
        if (abyte1[l1] != a.p.c())
        {
            break MISSING_BLOCK_LABEL_1380;
        }
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        bytearrayoutputstream1.write(a.m.b());
        flag = i1;
        j1 = ((flag1) ? 1 : 0);
        byte1 = byte0;
        obj3 = obj;
        break MISSING_BLOCK_LABEL_1380;
_L9:
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        if (abyte1[l1] == a.m.c())
        {
            flag = true;
            j1 = ((flag1) ? 1 : 0);
            byte1 = byte0;
            obj3 = obj;
            break MISSING_BLOCK_LABEL_1380;
        }
        byte2 = byte0;
        obj2 = obj;
        byte3 = byte0;
        obj1 = obj;
        bytearrayoutputstream1.write(abyte1[l1]);
        flag = i1;
        j1 = ((flag1) ? 1 : 0);
        byte1 = byte0;
        obj3 = obj;
        break MISSING_BLOCK_LABEL_1380;
_L7:
        flag = i1;
          goto _L5
_L13:
        obj = "";
          goto _L14
        obj = "unknown";
          goto _L15
        obj;
        return;
        l1++;
        i1 = ((flag) ? 1 : 0);
        flag1 = j1;
        byte0 = byte1;
        obj = obj3;
          goto _L16
    }

    public boolean f()
    {
        if (i() || i == null)
        {
            return false;
        } else
        {
            return i.b();
        }
    }

    public void g()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = i();
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        flag = false;
        if (g != null)
        {
            a("notifyLostConnection");
            g.ag();
            flag = l;
        }
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        a("notifyLostConnection - stopping the parser read/write threads");
        k();
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public String h()
    {
        if (g != null)
        {
            return g.Y();
        } else
        {
            return "";
        }
    }

    public boolean i()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = c;
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }

    public void j()
    {
        this;
        JVM INSTR monitorenter ;
        c = false;
        (new Thread(this, getClass().getSimpleName())).start();
        i.start();
        h.start();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void k()
    {
        this;
        JVM INSTR monitorenter ;
        a("stop frame parser");
        c = true;
        if (i != null)
        {
            i.c();
        }
_L1:
        if (h != null)
        {
            h.a();
        }
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        p.dm.m.c("Error while stopping the frame writer", ((Throwable) (obj)));
          goto _L1
        obj;
        throw obj;
        obj;
        p.dm.m.c("Error while stopping the frame dispatcher", ((Throwable) (obj)));
          goto _L2
    }

    public void l()
    {
        this;
        JVM INSTR monitorenter ;
        i = null;
        h = null;
        if (b != null)
        {
            b.close();
        }
        b = null;
_L1:
        a = null;
        g = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        b = null;
          goto _L1
        obj;
        throw obj;
        obj;
        b = null;
        throw obj;
    }

    public void m()
    {
        this;
        JVM INSTR monitorenter ;
        a("onRefreshStreams");
        l = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void n()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = c;
        if (!flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (l && g != null)
        {
            a("refreshStreams getting io streams");
            a = g.N();
            b = g.O();
            l = false;
            a("refreshStreams notify consumer.onStreamsRefreshed");
            g.af();
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public void run()
    {
        e();
        l();
    }
}
