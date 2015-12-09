// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.a.a.b;

import com.nuance.a.a.a.a.d.a.b;
import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.e;
import com.nuance.a.a.a.c.b.a;
import com.nuance.a.a.a.c.b.h;
import com.nuance.a.a.a.c.c.f;
import com.nuance.a.a.a.c.c.g;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.Hashtable;
import java.util.Map;
import java.util.Vector;

// Referenced classes of package com.nuance.a.a.a.c.a.a.b:
//            d

public class c
    implements com.nuance.a.a.a.a.d.a.c, h
{

    private static final e a = com.nuance.a.a.a.a.d.a.d.a(com/nuance/a/a/a/c/a/a/b/c);
    private static byte m[] = new byte[16];
    private static int p = 1;
    private static String x[] = {
        "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", 
        "A", "B", "C", "D", "E", "F"
    };
    private Hashtable b;
    private Hashtable c;
    private Hashtable d;
    private a e;
    private String f;
    private short g;
    private Vector h;
    private com.nuance.a.a.a.a.d.a.a i;
    private com.nuance.a.a.a.c.a.b.c j;
    private Vector k;
    private byte l[];
    private com.nuance.a.a.a.a.b.b n;
    private com.nuance.a.a.a.a.b.b o;
    private long q;
    private boolean r;
    private com.nuance.a.a.a.c.a.b.d s;
    private long t;
    private byte u;
    private com.nuance.a.a.a.c.b.c.c v;
    private com.nuance.a.a.a.c.b.a.a.g w;

    public c(String s1, short word0, String s2, byte abyte0[], String s3, Vector vector, com.nuance.a.a.a.a.d.a.a a1, 
            com.nuance.a.a.a.c.a.b.c c1)
    {
        l = null;
        r = false;
        t = 1L;
        u = 1;
        f = s1;
        g = word0;
        i = a1;
        j = c1;
        s = null;
        k = new Vector();
        b = new Hashtable();
        c = new Hashtable();
        d = new Hashtable();
        h = new Vector();
        e = new a(f, g, s2, abyte0, s3, this, vector, a1);
    }

    public static String a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return "";
        }
        StringBuffer stringbuffer = new StringBuffer();
        for (int i1 = 0; i1 < 16; i1++)
        {
            byte byte1 = abyte0[i1];
            byte byte0 = (byte)((byte)((byte)(byte1 & 0xf0) >>> 4) & 0xf);
            byte1 &= 0xf;
            stringbuffer.append((new StringBuilder()).append(x[byte0]).append(x[byte1]).toString());
            if (i1 == 3 || i1 == 5 || i1 == 7 || i1 == 9)
            {
                stringbuffer.append("-");
            }
        }

        return stringbuffer.toString().toLowerCase();
    }

    private void a(byte byte0, Object obj)
    {
        i.a(new b(byte0, obj), this, Thread.currentThread(), i.a()[0]);
    }

    private void a(String s1)
    {
        if (v != null)
        {
            com.nuance.a.a.a.c.b.c.a a1 = v.b(s1);
            if (s1.compareTo("ConnectionEstablished") == 0)
            {
                try
                {
                    a1.a("SessionID", a(l));
                }
                // Misplaced declaration of an exception variable
                catch (String s1) { }
            }
            a1.a();
        }
    }

    private void b(String s1)
    {
        if (v == null) goto _L2; else goto _L1
_L1:
        Object obj = v.f();
        if (obj == null || !((Map) (obj)).containsKey("NMSP_GATEWAY")) goto _L4; else goto _L3
_L3:
        obj = ((Map) (obj)).get("NMSP_GATEWAY");
        if (!(obj instanceof String)) goto _L4; else goto _L5
_L5:
        obj = (String)obj;
_L9:
        if (obj == null || ((String) (obj)).equals("")) goto _L2; else goto _L6
_L6:
        com.nuance.a.a.a.c.b.c.a a1 = v.b("CancelLogEvent");
        a1.a("CauseCode", 1);
        a1.a("CauseMessage", s1);
        ((com.nuance.a.a.a.c.b.a.a.c)a1).b(((String) (obj)), "NMSP_GATEWAY");
_L7:
        a1.a();
_L2:
        return;
        s1;
        if (a.e())
        {
            a.b("NMSPSession.cancelGwRemoteEvent() the builder is already committed.");
        }
        if (true) goto _L7; else goto _L4
_L4:
        obj = null;
        if (true) goto _L9; else goto _L8
_L8:
    }

    private void b(byte abyte0[])
    {
        byte byte0 = abyte0[16];
        short word0 = com.nuance.a.a.a.a.c.c.a(abyte0, 17);
        for (int i1 = 0; i1 < h.size(); i1++)
        {
            ((com.nuance.a.a.a.c.a.a.b.d)h.elementAt(i1)).a(byte0, word0);
        }

    }

    private void c(byte abyte0[])
    {
        byte byte0;
        int j2;
        byte0 = 8;
        j2 = com.nuance.a.a.a.a.c.c.b(abyte0, 0);
        (new StringBuilder("parseXModeMsgVapPlay:: VAP play bytes [")).append(abyte0.length).append("]");
        if (c.size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        f f1;
        int k1;
label0:
        {
            f1 = (f)c.get(new Integer(j2));
            if (f1 == null)
            {
                a.b((new StringBuilder("Could not find the audio sink associated with AID: ")).append(j2).toString());
                return;
            }
            k1 = com.nuance.a.a.a.a.c.c.b(abyte0, 4);
            int i1 = byte0;
            if (!com.nuance.a.a.a.a.c.e.a(o))
            {
                if (!com.nuance.a.a.a.a.c.e.b(o))
                {
                    break label0;
                }
                i1 = byte0;
            }
            do
            {
                if (i1 >= abyte0.length)
                {
                    break;
                }
                int l1 = 0;
                int j1 = 0;
                do
                {
                    if (l1 >= 5)
                    {
                        a.b("NMSP_COMP_CORE_XMODE_PLAY, Too many audio frame size bytes! This buffer is invalid.");
                        l1 = 1;
                        k1 = j1;
                        j1 = l1;
                    } else
                    {
                        int k2 = abyte0[i1] & 0xff;
                        k1 = i1 + 1;
                        l1++;
                        int i2 = j1 << 7 | k2 & 0x7f;
                        (new StringBuilder("--------> offset ")).append(k1).append(" packet length ").append(i2).append(" one byte (").append(new Byte((byte)k2)).append(")");
                        j1 = i2;
                        i1 = k1;
                        if ((k2 & 0x80) != 0)
                        {
                            continue;
                        }
                        j1 = 0;
                        i1 = k1;
                        k1 = i2;
                    }
                    if (k1 == 0)
                    {
                        j1 = 1;
                    }
                    (new StringBuilder("extract buffer [")).append(k1).append("] bytes! offset [").append(i1).append("]");
                    if (j1 == 1)
                    {
                        try
                        {
                            f1.a(null, 0, 0, false);
                            return;
                        }
                        // Misplaced declaration of an exception variable
                        catch (byte abyte0[])
                        {
                            a.b(abyte0.getMessage());
                        }
                        return;
                    }
                    break;
                } while (true);
                if (k1 > 0 && k1 <= abyte0.length - i1)
                {
                    try
                    {
                        f1.a(abyte0, i1, k1, false);
                    }
                    catch (g g1)
                    {
                        a.b(g1.getMessage());
                    }
                    i1 += k1;
                }
            } while (true);
            if (d.size() != 0)
            {
                abyte0 = (com.nuance.a.a.a.c.a.a.b.d)d.get(new Integer(j2));
                if (abyte0 == null)
                {
                    a.b((new StringBuilder("parseXModeMsgVapPlay:: Could not find the session listener associated with AID: ")).append(j2).toString());
                    return;
                } else
                {
                    abyte0.g();
                    return;
                }
            }
            continue; /* Loop/switch isn't completed */
        }
        (new StringBuilder("extract buffer [")).append(k1).append("] bytes! offset [8]");
        if (k1 > 0 && k1 <= abyte0.length - 8)
        {
            try
            {
                f1.a(abyte0, 8, k1, false);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                a.b(abyte0.getMessage());
            }
        }
        if (d.size() != 0)
        {
            abyte0 = (com.nuance.a.a.a.c.a.a.b.d)d.get(new Integer(j2));
            if (abyte0 == null)
            {
                a.b((new StringBuilder("parseXModeMsgVapPlay:: Could not find the session listener associated with AID: ")).append(j2).toString());
                return;
            } else
            {
                abyte0.g();
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void i()
    {
        do
        {
            if (k.isEmpty())
            {
                break;
            }
            b b1 = (b)k.firstElement();
            k.removeElementAt(0);
            switch (b1.a)
            {
            case 1: // '\001'
                a((byte)1, b1.b);
                break;

            case 2: // '\002'
                a((byte)2, b1.b);
                break;

            case 4: // '\004'
                a((byte)4, b1.b);
                break;

            case 5: // '\005'
                a((byte)5, b1.b);
                break;

            case 6: // '\006'
                a((byte)6, b1.b);
                break;

            case 7: // '\007'
                a((byte)7, b1.b);
                break;

            case 8: // '\b'
                a((byte)8, b1.b);
                break;
            }
        } while (true);
    }

    public final int a()
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        i1 = p;
        p = i1 + 1;
        if (p == 0x80000000)
        {
            p = 1;
        }
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(byte byte0, int i1, com.nuance.a.a.a.c.a.a.b.d d1)
    {
        (new StringBuilder("freeResource, TID: ")).append(byte0).append(", disconnect timeout: ").append(i1);
        h.removeElement(d1);
        d1 = ((com.nuance.a.a.a.c.a.a.b.d) (new Object[2]));
        d1[0] = new Byte(byte0);
        d1[1] = new Integer(i1);
        if (l != null && k.isEmpty())
        {
            a((byte)4, d1);
            return;
        } else
        {
            k.addElement(new b((byte)4, d1));
            return;
        }
    }

    public final void a(int i1)
    {
        a.b();
        Integer integer = new Integer(i1);
        if (l != null && k.isEmpty())
        {
            a((byte)5, integer);
            return;
        } else
        {
            k.addElement(new b((byte)5, integer));
            return;
        }
    }

    public final void a(int i1, f f1, com.nuance.a.a.a.c.a.a.b.d d1)
    {
        c.put(new Integer(i1), f1);
        d.put(new Integer(i1), d1);
    }

    public final void a(com.nuance.a.a.a.a.a.a a1, byte abyte0[])
    {
        if (a.b())
        {
            (new StringBuilder("xmodeMsgCallback, protocol: ")).append(a1.a).append(", command: ").append(a1.c);
        }
        a1.a;
        JVM INSTR tableswitch 1 3: default 72
    //                   1 927
    //                   2 247
    //                   3 82;
           goto _L1 _L2 _L3 _L4
_L1:
        a.b("Unknown Xmode protocol");
_L5:
        return;
_L4:
        switch (a1.c)
        {
        default:
            return;

        case 257: 
            l = e.d;
            if (a.b())
            {
                (new StringBuilder("connected(")).append(a(l)).append(") called on ").append(j);
            }
            a("ConnectionEstablished");
            j.a(a(l));
            for (int i1 = 0; i1 < h.size(); i1++)
            {
                ((com.nuance.a.a.a.c.a.a.b.d)h.elementAt(i1)).a(l);
            }

            i();
            return;

        case 512: 
        case 768: 
            break;
        }
        if (true) goto _L5; else goto _L3
_L3:
        byte byte3;
        int k2;
        switch (a1.c)
        {
        default:
            a.b("Unknown BCP command");
            return;

        case 2578: 
            break;

        case 2579: 
            long l3 = com.nuance.a.a.a.a.c.c.b(abyte0, 17);
            com.nuance.a.a.a.a.c.c.a(abyte0, 21);
            int j1 = com.nuance.a.a.a.a.c.c.b(abyte0, 23);
            if (j1 > 0 && j1 <= abyte0.length - 27)
            {
                System.arraycopy(abyte0, 27, new byte[j1], 0, j1);
            }
            b.remove(new Long(l3));
            return;

        case 2580: 
            long l4 = com.nuance.a.a.a.a.c.c.b(abyte0, 17);
            com.nuance.a.a.a.a.c.c.a(abyte0, 21);
            int k1 = com.nuance.a.a.a.a.c.c.b(abyte0, 23);
            if (k1 > 0 && k1 <= abyte0.length - 27)
            {
                System.arraycopy(abyte0, 27, new byte[k1], 0, k1);
            }
            b.get(new Long(l4));
            return;

        case 2584: 
            Object obj = null;
            byte byte0 = abyte0[16];
            int l1 = com.nuance.a.a.a.a.c.c.b(abyte0, 17);
            short word0 = com.nuance.a.a.a.a.c.c.a(abyte0, 21);
            int j3 = com.nuance.a.a.a.a.c.c.b(abyte0, 23);
            a1 = obj;
            if (j3 > 0)
            {
                a1 = obj;
                if (j3 <= abyte0.length - 27)
                {
                    a1 = new byte[j3];
                    System.arraycopy(abyte0, 27, a1, 0, j3);
                }
            }
            abyte0 = (com.nuance.a.a.a.c.a.a.b.d)b.remove(new Long(l1));
            if (abyte0 != null)
            {
                abyte0.a(byte0, l1, word0, a1);
                return;
            }
            break;

        case 2582: 
            Object obj1 = null;
            byte byte1 = abyte0[16];
            int i2 = com.nuance.a.a.a.a.c.c.b(abyte0, 17);
            short word1 = com.nuance.a.a.a.a.c.c.a(abyte0, 21);
            int k3 = com.nuance.a.a.a.a.c.c.b(abyte0, 23);
            a1 = obj1;
            if (k3 > 0)
            {
                a1 = obj1;
                if (k3 <= abyte0.length - 27)
                {
                    a1 = new byte[k3];
                    System.arraycopy(abyte0, 27, a1, 0, k3);
                }
            }
            abyte0 = (com.nuance.a.a.a.c.a.a.b.d)b.remove(new Long(i2));
            if (abyte0 != null)
            {
                abyte0.b(byte1, i2, word1, a1);
                return;
            }
            break;

        case 2577: 
            long l5 = com.nuance.a.a.a.a.c.c.b(abyte0, 17);
            com.nuance.a.a.a.a.c.c.b(abyte0, 21);
            com.nuance.a.a.a.a.c.c.a(abyte0, 25);
            b.remove(new Long(l5));
            return;

        case 2600: 
            b(abyte0);
            return;

        case 2576: 
            byte byte2 = abyte0[16];
            int j2 = com.nuance.a.a.a.a.c.c.b(abyte0, 17);
            short word2 = com.nuance.a.a.a.a.c.c.a(abyte0, 21);
            short word3 = com.nuance.a.a.a.a.c.c.a(abyte0, 23);
            short word4 = com.nuance.a.a.a.a.c.c.a(abyte0, 25);
            a1 = (com.nuance.a.a.a.c.a.a.b.d)b.get(new Long(j2));
            if (a1 != null)
            {
                a1.a(byte2, j2, word2, word3, word4);
                if (word2 != 200)
                {
                    b.remove(new Long(j2));
                    return;
                }
            }
            break;

        case 2585: 
            byte3 = abyte0[16];
            k2 = com.nuance.a.a.a.a.c.c.b(abyte0, 21);
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L5; else goto _L6
_L6:
        if (k2 <= 0 || k2 > abyte0.length - 25) goto _L5; else goto _L7
_L7:
        a1 = new byte[k2];
        System.arraycopy(abyte0, 25, a1, 0, k2);
        abyte0 = (com.nuance.a.a.a.c.a.a.b.d)b.get(new Long(q));
        if (abyte0 == null) goto _L5; else goto _L8
_L8:
        abyte0.a(byte3, a1);
        return;
_L2:
        switch (a1.c)
        {
        default:
            return;

        case 512: 
            c(abyte0);
            return;

        case 528: 
            int l2 = com.nuance.a.a.a.a.c.c.b(abyte0, 0);
            if (d.size() != 0)
            {
                a1 = (com.nuance.a.a.a.c.a.a.b.d)d.get(new Integer(l2));
                if (a1 == null)
                {
                    a.b((new StringBuilder("parseVapPlayBegin:: Could not find the session listener associated with AID: ")).append(l2).toString());
                    return;
                } else
                {
                    a1.f();
                    return;
                }
            }
            break;

        case 1024: 
            int i3 = com.nuance.a.a.a.a.c.c.b(abyte0, 0);
            if (c.size() != 0)
            {
                a1 = (f)c.remove(new Integer(i3));
                if (a1 == null)
                {
                    a.b((new StringBuilder("Could not find the audio sink associated with AID: ")).append(i3).toString());
                    return;
                }
                try
                {
                    a1.a(null, 0, 0, true);
                }
                // Misplaced declaration of an exception variable
                catch (com.nuance.a.a.a.a.a.a a1)
                {
                    a.b(a1.getMessage());
                }
                a1 = (com.nuance.a.a.a.c.a.a.b.d)d.remove(new Integer(i3));
                if (a1 == null)
                {
                    a.b((new StringBuilder("parseXModeMsgVapPlayEnd:: Could not find the session listener associated with AID: ")).append(i3).toString());
                    return;
                } else
                {
                    a1.h();
                    return;
                }
            }
            break;
        }
        if (true) goto _L5; else goto _L9
_L9:
    }

    public final void a(com.nuance.a.a.a.a.b.b b1, com.nuance.a.a.a.a.b.b b2)
    {
        a.b();
        if (w == null) goto _L2; else goto _L1
_L1:
        Object obj = w.a();
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = ((com.nuance.a.a.a.c.b.c.c) (obj)).b("NMSPSession");
        ((com.nuance.a.a.a.c.b.c.a) (obj)).a("NMSP_GATEWAY");
_L5:
        v = ((com.nuance.a.a.a.c.b.c.a) (obj)).a();
        e.a(v);
_L2:
        a("Connect");
        n = b1;
        o = b2;
        a((byte)1, null);
        return;
        com.nuance.a.a.a.c.b.c.b b3;
        b3;
        if (a.e())
        {
            a.b("XMode.createSessionEvent() parent is already committed");
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final void a(com.nuance.a.a.a.c.a.a.b.d d1)
    {
        if (!h.contains(d1))
        {
            h.addElement(d1);
        }
    }

    public final void a(com.nuance.a.a.a.c.a.b.d d1)
    {
        s = d1;
    }

    final void a(com.nuance.a.a.a.c.b.a.a.g g1)
    {
        w = g1;
    }

    public final void a(Object obj, Object obj1)
    {
        obj = (b)obj;
        ((b) (obj)).a;
        JVM INSTR tableswitch 1 8: default 56
    //                   1 66
    //                   2 150
    //                   3 158
    //                   4 171
    //                   5 255
    //                   6 284
    //                   7 369
    //                   8 398;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L1:
        a.b("Unknown command");
_L11:
        return;
_L2:
        obj1 = null;
        obj = obj1;
        if (v != null)
        {
            obj = v.f();
            if (((Map) (obj)).size() > 0)
            {
                obj = (String)((Map) (obj)).values().toArray()[0];
            } else
            {
                a.b("handleConnect: there is no ref id to connect with");
                obj = obj1;
            }
        }
        e.a(n.a(), o.a(), ((String) (obj)));
        return;
_L3:
        e.b();
        return;
_L4:
        r = true;
        e.b();
        return;
_L5:
        if (l == null) goto _L11; else goto _L10
_L10:
        obj = ((Object) ((Object[])((b) (obj)).b));
        byte byte0 = ((Byte)obj[0]).byteValue();
        int i1 = ((Integer)obj[1]).intValue();
        obj = new byte[5];
        obj[0] = byte0;
        com.nuance.a.a.a.a.c.c.a(i1, ((byte []) (obj)), 1);
        obj = com.nuance.a.a.a.a.a.b.a((byte)2, (byte)34, (short)2601, com.nuance.a.a.a.a.a.b.a(((byte []) (obj)), l));
        e.a(((byte []) (obj)), 3, "SEND_BCP_FREE_RESOURCE");
        return;
_L6:
        if (l == null) goto _L11; else goto _L12
_L12:
        int j1 = ((Integer)((b) (obj)).b).intValue();
        e.a(j1);
        return;
_L7:
        if (l == null) goto _L11; else goto _L13
_L13:
        obj = ((Object) ((Object[])((b) (obj)).b));
        obj1 = (byte[])obj[0];
        int j2 = ((Integer)obj[1]).intValue();
        for (int k1 = 0; k1 < h.size(); k1++)
        {
            ((com.nuance.a.a.a.c.a.a.b.d)h.elementAt(k1)).e();
        }

        e.a(((byte []) (obj1)), j2);
        return;
_L8:
        if (l == null) goto _L11; else goto _L14
_L14:
        int l1 = ((Integer)((b) (obj)).b).intValue();
        e.b(l1);
        return;
_L9:
        if (l == null) goto _L11; else goto _L15
_L15:
        short word0;
        com.nuance.a.a.a.c.a.a.b.d d1;
        Object aobj[] = (Object[])((b) (obj)).b;
        word0 = ((Short)aobj[0]).shortValue();
        obj1 = (String)aobj[1];
        obj = (byte[])aobj[2];
        byte abyte0[] = (byte[])aobj[3];
        byte byte1 = ((Byte)aobj[4]).byteValue();
        long l2 = ((Long)aobj[5]).longValue();
        d1 = (com.nuance.a.a.a.c.a.a.b.d)aobj[6];
        boolean flag = ((Boolean)aobj[7]).booleanValue();
        b.put(new Long(l2), d1);
        int k2 = obj.length + 5;
        int i2 = k2;
        if (word0 == 2585)
        {
            i2 = k2 + 4;
        }
        aobj = new byte[i2];
        aobj[0] = byte1;
        i2 = 1;
        if (word0 == 2585)
        {
            com.nuance.a.a.a.a.c.c.a((int)l2, ((byte []) (aobj)), 1);
            i2 = 5;
        }
        com.nuance.a.a.a.a.c.c.a(obj.length, ((byte []) (aobj)), i2);
        System.arraycopy(obj, 0, ((Object) (aobj)), i2 + 4, obj.length);
        ByteArrayOutputStream bytearrayoutputstream;
        if (l != null)
        {
            obj = l;
        } else
        {
            obj = m;
        }
        obj = com.nuance.a.a.a.a.a.b.a(((byte []) (aobj)), ((byte []) (obj)));
        bytearrayoutputstream = new ByteArrayOutputStream();
        bytearrayoutputstream.write(((byte []) (obj)), 0, obj.length);
        if (abyte0 != null)
        {
            bytearrayoutputstream.write(abyte0, 0, abyte0.length);
        }
        obj = com.nuance.a.a.a.a.a.b.a((byte)2, (byte)34, word0, bytearrayoutputstream.toByteArray());
        e.a(((byte []) (obj)), 3, obj1);
        if (!flag) goto _L11; else goto _L16
_L16:
        if (word0 != 2581)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (d1 == null) goto _L11; else goto _L17
_L17:
        d1.b(byte1, l2, (short)200, null);
        return;
        if (word0 != 2608 || d1 == null) goto _L11; else goto _L18
_L18:
        h.removeElement(d1);
        return;
    }

    public final void a(short word0, String s1, byte abyte0[], byte abyte1[], byte byte0, long l1, 
            com.nuance.a.a.a.c.a.a.b.d d1, boolean flag)
    {
        if (a.b())
        {
            (new StringBuilder("postBcpMessage, BCP: ")).append(word0).append(", TID: ").append(byte0).append(", RID: ").append(l1);
        }
        Object aobj[] = new Object[8];
        aobj[0] = new Short(word0);
        aobj[1] = s1;
        aobj[2] = abyte0;
        aobj[3] = abyte1;
        aobj[4] = new Byte(byte0);
        aobj[5] = new Long(l1);
        aobj[6] = d1;
        aobj[7] = new Boolean(flag);
        if (l != null && k.isEmpty())
        {
            a((byte)8, ((Object) (aobj)));
            return;
        } else
        {
            k.addElement(new b((byte)8, ((Object) (aobj))));
            return;
        }
    }

    public final void a(short word0, short word1)
    {
        a.b();
        if (a.b())
        {
            (new StringBuilder("socketClosed() sessionListeners.size():")).append(h.size());
        }
        for (int i1 = 0; i1 < h.size(); i1++)
        {
            ((com.nuance.a.a.a.c.a.a.b.d)h.elementAt(i1)).a(word0);
        }

        if (!k.isEmpty())
        {
            k.removeAllElements();
        }
        h.removeAllElements();
        if (word0 != 4) goto _L2; else goto _L1
_L1:
        j.b((short)9);
        b("open socket failed");
_L4:
        if (word0 == 1 && r)
        {
            i.c();
        }
        l = null;
        return;
_L2:
        if (word0 == 5)
        {
            j.b((short)9);
            b("timed out on sending COP_CONNECT");
        } else
        if (word0 == 7)
        {
            j.b(word1);
            b("COP_CONNECT_FAILED");
        } else
        if (word0 == 8 && l == null)
        {
            j.b((short)9);
            b("NETWORK ERROR and remote_disconnect_unknown");
        } else
        if (l != null)
        {
            j.a(word1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(byte abyte0[], int i1)
    {
        a.b();
        Object aobj[] = new Object[2];
        aobj[0] = abyte0;
        aobj[1] = new Integer(i1);
        if (l != null && k.isEmpty())
        {
            a((byte)6, ((Object) (aobj)));
            return;
        } else
        {
            k.addElement(new b((byte)6, ((Object) (aobj))));
            return;
        }
    }

    public final void b()
    {
        q = 0L;
    }

    public final void b(int i1)
    {
        a.b();
        Integer integer = new Integer(i1);
        if (l != null && k.isEmpty())
        {
            a((byte)7, integer);
            return;
        } else
        {
            k.addElement(new b((byte)7, integer));
            return;
        }
    }

    public final void b(com.nuance.a.a.a.c.a.a.b.d d1)
    {
        h.removeElement(d1);
    }

    public final void c()
    {
        a.b();
        a((byte)3, null);
    }

    public final byte[] d()
    {
        return l;
    }

    public final long e()
    {
        long l1 = t;
        t = l1 + 1L;
        if (t == 0x8000000000000000L)
        {
            t = 1L;
        }
        return l1;
    }

    public final byte f()
    {
        byte byte0 = u;
        u = (byte)(byte0 + 1);
        if (u == -128)
        {
            u = 1;
        }
        return byte0;
    }

    public final com.nuance.a.a.a.a.b.b g()
    {
        return n;
    }

    public final com.nuance.a.a.a.c.b.c.c h()
    {
        return v;
    }

}
