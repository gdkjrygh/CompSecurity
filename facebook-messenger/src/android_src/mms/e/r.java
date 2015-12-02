// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android_src.mms.e;

import android.content.res.Resources;
import com.facebook.debug.log.b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;

// Referenced classes of package android_src.mms.e:
//            s, p, c, q, 
//            j, b, u, e, 
//            z, y, h, i, 
//            x, d, a, v, 
//            w, f

public class r
{

    static final boolean a;
    private static byte e[] = null;
    private static byte f[] = null;
    private ByteArrayInputStream b;
    private q c;
    private j d;

    public r(byte abyte0[])
    {
        b = null;
        c = null;
        d = null;
        b = new ByteArrayInputStream(abyte0);
    }

    private static int a(s s1)
    {
        if (!a && s1 == null)
        {
            throw new AssertionError();
        }
        if (e != null || f != null)
        {
            if (f != null)
            {
                byte abyte0[] = s1.c();
                if (abyte0 != null && Arrays.equals(f, abyte0))
                {
                    return 0;
                }
            }
            if (e != null)
            {
                s1 = s1.g();
                if (s1 != null && Arrays.equals(e, s1))
                {
                    return 0;
                }
            }
        }
        return 1;
    }

    protected static void a(ByteArrayInputStream bytearrayinputstream, HashMap hashmap, Integer integer)
    {
        if (!a && bytearrayinputstream == null)
        {
            throw new AssertionError();
        }
        if (!a && integer.intValue() <= 0)
        {
            throw new AssertionError();
        }
        int l = bytearrayinputstream.available();
        int k = integer.intValue();
        do
        {
            if (k <= 0)
            {
                break;
            }
            int i1 = bytearrayinputstream.read();
            if (!a && -1 == i1)
            {
                throw new AssertionError();
            }
            k--;
            switch (i1)
            {
            default:
                byte abyte0[];
                UnsupportedEncodingException unsupportedencodingexception;
                if (-1 == c(bytearrayinputstream, k))
                {
                    com.facebook.debug.log.b.e("PduParser", "Corrupt Content-Type");
                } else
                {
                    k = 0;
                }
                continue;

            case 131: 
            case 137: 
                bytearrayinputstream.mark(1);
                k = f(bytearrayinputstream);
                bytearrayinputstream.reset();
                if (k > 127)
                {
                    k = g(bytearrayinputstream);
                    if (k < p.a.length)
                    {
                        hashmap.put(Integer.valueOf(131), p.a[k].getBytes());
                    }
                } else
                {
                    abyte0 = a(bytearrayinputstream, 0);
                    if (abyte0 != null && hashmap != null)
                    {
                        hashmap.put(Integer.valueOf(131), abyte0);
                    }
                }
                k = bytearrayinputstream.available();
                k = integer.intValue() - (l - k);
                continue;

            case 138: 
            case 153: 
                abyte0 = a(bytearrayinputstream, 0);
                if (abyte0 != null && hashmap != null)
                {
                    hashmap.put(Integer.valueOf(153), abyte0);
                }
                k = bytearrayinputstream.available();
                k = integer.intValue() - (l - k);
                continue;

            case 129: 
                bytearrayinputstream.mark(1);
                k = f(bytearrayinputstream);
                bytearrayinputstream.reset();
                if (k > 32 && k < 127 || k == 0)
                {
                    abyte0 = a(bytearrayinputstream, 0);
                    try
                    {
                        hashmap.put(Integer.valueOf(129), Integer.valueOf(android_src.mms.e.c.a(new String(abyte0))));
                    }
                    // Misplaced declaration of an exception variable
                    catch (UnsupportedEncodingException unsupportedencodingexception)
                    {
                        com.facebook.debug.log.b.d("PduParser", Arrays.toString(abyte0), unsupportedencodingexception);
                        hashmap.put(Integer.valueOf(129), Integer.valueOf(0));
                    }
                } else
                {
                    k = (int)i(bytearrayinputstream);
                    if (hashmap != null)
                    {
                        hashmap.put(Integer.valueOf(129), Integer.valueOf(k));
                    }
                }
                k = bytearrayinputstream.available();
                k = integer.intValue() - (l - k);
                continue;

            case 133: 
            case 151: 
                abyte0 = a(bytearrayinputstream, 0);
                if (abyte0 != null && hashmap != null)
                {
                    hashmap.put(Integer.valueOf(151), abyte0);
                }
                k = bytearrayinputstream.available();
                k = integer.intValue() - (l - k);
                break;
            }
        } while (true);
        if (k != 0)
        {
            com.facebook.debug.log.b.e("PduParser", "Corrupt Content-Type");
        }
    }

    private static void a(String s1)
    {
    }

    protected static boolean a(int k)
    {
        if (k >= 33 && k <= 126) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        switch (k)
        {
        default:
            return true;

        case 34: // '"'
        case 40: // '('
        case 41: // ')'
        case 44: // ','
        case 47: // '/'
        case 58: // ':'
        case 59: // ';'
        case 60: // '<'
        case 61: // '='
        case 62: // '>'
        case 63: // '?'
        case 64: // '@'
        case 91: // '['
        case 92: // '\\'
        case 93: // ']'
        case 123: // '{'
        case 125: // '}'
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected static boolean a(q q1)
    {
        if (q1 != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int k = q1.a(140);
        if (q1.a(141) == 0) goto _L1; else goto _L3
_L3:
        k;
        JVM INSTR tableswitch 128 136: default 76
    //                   128 78
    //                   129 110
    //                   130 132
    //                   131 192
    //                   132 214
    //                   133 286
    //                   134 240
    //                   135 354
    //                   136 298;
           goto _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13
_L12:
        continue; /* Loop/switch isn't completed */
_L4:
        return false;
_L5:
        if (q1.b(132) == null || q1.c(137) == null || q1.b(152) == null) goto _L1; else goto _L14
_L14:
        return true;
_L6:
        if (q1.a(146) == 0) goto _L1; else goto _L15
_L15:
        if (q1.b(152) != null) goto _L14; else goto _L16
_L16:
        return false;
_L7:
        if (q1.b(131) == null || -1L == q1.e(136) || q1.b(138) == null || -1L == q1.e(142)) goto _L1; else goto _L17
_L17:
        if (q1.b(152) != null) goto _L14; else goto _L18
_L18:
        return false;
_L8:
        if (q1.a(149) == 0) goto _L1; else goto _L19
_L19:
        if (q1.b(152) != null) goto _L14; else goto _L20
_L20:
        return false;
_L9:
        if (q1.b(132) == null) goto _L1; else goto _L21
_L21:
        if (-1L != q1.e(133)) goto _L14; else goto _L22
_L22:
        return false;
_L11:
        if (-1L == q1.e(133) || q1.b(139) == null || q1.a(149) == 0) goto _L1; else goto _L23
_L23:
        if (q1.d(151) != null) goto _L14; else goto _L24
_L24:
        return false;
_L10:
        if (q1.b(152) != null) goto _L14; else goto _L25
_L25:
        return false;
_L13:
        if (-1L == q1.e(133) || q1.c(137) == null || q1.b(139) == null || q1.a(155) == 0) goto _L1; else goto _L26
_L26:
        if (q1.d(151) != null) goto _L14; else goto _L27
_L27:
        return false;
        if (q1.c(137) == null || q1.b(139) == null || q1.a(155) == 0) goto _L1; else goto _L28
_L28:
        if (q1.d(151) == null)
        {
            return false;
        }
          goto _L14
    }

    protected static boolean a(ByteArrayInputStream bytearrayinputstream, s s1, int k)
    {
        if (!a && bytearrayinputstream == null)
        {
            throw new AssertionError();
        }
        if (!a && s1 == null)
        {
            throw new AssertionError();
        }
        if (!a && k <= 0)
        {
            throw new AssertionError();
        }
        int i1 = bytearrayinputstream.available();
        int l = k;
        do
        {
            if (l <= 0)
            {
                break;
            }
            int j1 = bytearrayinputstream.read();
            if (!a && -1 == j1)
            {
                throw new AssertionError();
            }
            l--;
            if (j1 > 127)
            {
                switch (j1)
                {
                default:
                    if (-1 == c(bytearrayinputstream, l))
                    {
                        com.facebook.debug.log.b.e("PduParser", "Corrupt Part headers");
                        return false;
                    }
                    break;

                case 142: 
                    byte abyte0[] = a(bytearrayinputstream, 0);
                    if (abyte0 != null)
                    {
                        s1.c(abyte0);
                    }
                    l = k - (i1 - bytearrayinputstream.available());
                    continue;

                case 192: 
                    byte abyte1[] = a(bytearrayinputstream, 1);
                    if (abyte1 != null)
                    {
                        s1.b(abyte1);
                    }
                    l = k - (i1 - bytearrayinputstream.available());
                    continue;

                case 174: 
                case 197: 
                    j1 = Resources.getSystem().getIdentifier("config_mms_content_disposition_support", "bool", "android");
                    if (Resources.getSystem().getBoolean(j1))
                    {
                        l = d(bytearrayinputstream);
                        bytearrayinputstream.mark(1);
                        j1 = bytearrayinputstream.available();
                        int k1 = bytearrayinputstream.read();
                        if (k1 == 128)
                        {
                            s1.d(s.a);
                        } else
                        if (k1 == 129)
                        {
                            s1.d(android_src.mms.e.s.b);
                        } else
                        if (k1 == 130)
                        {
                            s1.d(s.c);
                        } else
                        {
                            bytearrayinputstream.reset();
                            s1.d(a(bytearrayinputstream, 0));
                        }
                        if (j1 - bytearrayinputstream.available() < l)
                        {
                            if (bytearrayinputstream.read() == 152)
                            {
                                s1.h(a(bytearrayinputstream, 0));
                            }
                            k1 = bytearrayinputstream.available();
                            if (j1 - k1 < l)
                            {
                                l -= j1 - k1;
                                bytearrayinputstream.read(new byte[l], 0, l);
                            }
                        }
                        l = k - (i1 - bytearrayinputstream.available());
                    }
                    continue;
                }
                l = 0;
            } else
            if (j1 >= 32 && j1 <= 127)
            {
                byte abyte2[] = a(bytearrayinputstream, 0);
                byte abyte3[] = a(bytearrayinputstream, 0);
                if ("Content-Transfer-Encoding".equalsIgnoreCase(new String(abyte2)))
                {
                    s1.f(abyte3);
                }
                l = k - (i1 - bytearrayinputstream.available());
            } else
            {
                if (-1 == c(bytearrayinputstream, l))
                {
                    com.facebook.debug.log.b.e("PduParser", "Corrupt Part headers");
                    return false;
                }
                l = 0;
            }
        } while (true);
        if (l != 0)
        {
            com.facebook.debug.log.b.e("PduParser", "Corrupt Part headers");
            return false;
        } else
        {
            return true;
        }
    }

    protected static byte[] a(ByteArrayInputStream bytearrayinputstream, int k)
    {
        if (!a && bytearrayinputstream == null)
        {
            throw new AssertionError();
        }
        bytearrayinputstream.mark(1);
        int l = bytearrayinputstream.read();
        if (!a && -1 == l)
        {
            throw new AssertionError();
        }
        if (1 == k && 34 == l)
        {
            bytearrayinputstream.mark(1);
        } else
        if (k == 0 && 127 == l)
        {
            bytearrayinputstream.mark(1);
        } else
        {
            bytearrayinputstream.reset();
        }
        return b(bytearrayinputstream, k);
    }

    protected static byte[] a(ByteArrayInputStream bytearrayinputstream, HashMap hashmap)
    {
        if (!a && bytearrayinputstream == null)
        {
            throw new AssertionError();
        }
        bytearrayinputstream.mark(1);
        int k = bytearrayinputstream.read();
        if (!a && -1 == k)
        {
            throw new AssertionError();
        }
        bytearrayinputstream.reset();
        k &= 0xff;
        if (k < 32)
        {
            k = d(bytearrayinputstream);
            int l = bytearrayinputstream.available();
            bytearrayinputstream.mark(1);
            int i1 = bytearrayinputstream.read();
            if (!a && -1 == i1)
            {
                throw new AssertionError();
            }
            bytearrayinputstream.reset();
            i1 &= 0xff;
            byte abyte0[];
            if (i1 >= 32 && i1 <= 127)
            {
                abyte0 = a(bytearrayinputstream, 0);
            } else
            if (i1 > 127)
            {
                int j1 = g(bytearrayinputstream);
                if (j1 < p.a.length)
                {
                    abyte0 = p.a[j1].getBytes();
                } else
                {
                    bytearrayinputstream.reset();
                    abyte0 = a(bytearrayinputstream, 0);
                }
            } else
            {
                com.facebook.debug.log.b.e("PduParser", "Corrupt content-type");
                return p.a[0].getBytes();
            }
            k -= l - bytearrayinputstream.available();
            if (k > 0)
            {
                a(bytearrayinputstream, hashmap, Integer.valueOf(k));
            }
            if (k < 0)
            {
                com.facebook.debug.log.b.e("PduParser", "Corrupt MMS message");
                abyte0 = p.a[0].getBytes();
            }
            return abyte0;
        }
        if (k <= 127)
        {
            return a(bytearrayinputstream, 0);
        } else
        {
            return p.a[g(bytearrayinputstream)].getBytes();
        }
    }

    protected static j b(ByteArrayInputStream bytearrayinputstream)
    {
        j j1;
        int k;
        int l;
        if (bytearrayinputstream == null)
        {
            return null;
        }
        l = c(bytearrayinputstream);
        j1 = new j();
        k = 0;
_L3:
        Object obj;
        s s1;
        byte abyte0[];
        if (k >= l)
        {
            break MISSING_BLOCK_LABEL_404;
        }
        int k1 = c(bytearrayinputstream);
        int i1 = c(bytearrayinputstream);
        s1 = new s();
        int l1 = bytearrayinputstream.available();
        if (l1 <= 0)
        {
            return null;
        }
        obj = new HashMap();
        abyte0 = a(bytearrayinputstream, ((HashMap) (obj)));
        if (abyte0 != null)
        {
            s1.e(abyte0);
        } else
        {
            s1.e(p.a[0].getBytes());
        }
        abyte0 = (byte[])(byte[])((HashMap) (obj)).get(Integer.valueOf(151));
        if (abyte0 != null)
        {
            s1.g(abyte0);
        }
        obj = (Integer)((HashMap) (obj)).get(Integer.valueOf(129));
        if (obj != null)
        {
            s1.a(((Integer) (obj)).intValue());
        }
        k1 -= l1 - bytearrayinputstream.available();
        if (k1 > 0)
        {
            if (!a(bytearrayinputstream, s1, k1))
            {
                return null;
            }
        } else
        if (k1 < 0)
        {
            return null;
        }
        if (s1.e() == null && s1.i() == null && s1.j() == null && s1.c() == null)
        {
            s1.c(Long.toOctalString(System.currentTimeMillis()).getBytes());
        }
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_389;
        }
        abyte0 = new byte[i1];
        obj = new String(s1.g());
        bytearrayinputstream.read(abyte0, 0, i1);
        if (!((String) (obj)).equalsIgnoreCase("application/vnd.wap.multipart.alternative")) goto _L2; else goto _L1
_L1:
        obj = b(new ByteArrayInputStream(abyte0)).a(0);
_L9:
        byte abyte1[];
        String s2;
        if (a(((s) (obj))) == 0)
        {
            j1.a(0, ((s) (obj)));
        } else
        {
            j1.a(((s) (obj)));
        }
        k++;
        if (true) goto _L3; else goto _L2
_L2:
        abyte1 = s1.h();
        obj = abyte0;
        if (abyte1 == null) goto _L5; else goto _L4
_L4:
        s2 = new String(abyte1);
        if (!s2.equalsIgnoreCase("base64")) goto _L7; else goto _L6
_L6:
        obj = android_src.mms.e.b.a(abyte0);
_L5:
        if (obj == null)
        {
            a("Decode part data error!");
            return null;
        }
        break; /* Loop/switch isn't completed */
_L7:
        obj = abyte0;
        if (s2.equalsIgnoreCase("quoted-printable"))
        {
            obj = u.a(abyte0);
        }
        if (true) goto _L5; else goto _L8
_L8:
        s1.a(((byte []) (obj)));
        obj = s1;
          goto _L9
        return j1;
    }

    protected static boolean b(int k)
    {
        if ((k < 32 || k > 126) && (k < 128 || k > 255)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        switch (k)
        {
        case 11: // '\013'
        case 12: // '\f'
        default:
            return false;

        case 9: // '\t'
        case 10: // '\n'
        case 13: // '\r'
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected static byte[] b(ByteArrayInputStream bytearrayinputstream, int k)
    {
        if (!a && bytearrayinputstream == null)
        {
            throw new AssertionError();
        }
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        int i1 = bytearrayinputstream.read();
        int l = i1;
        if (!a)
        {
            l = i1;
            if (-1 == i1)
            {
                throw new AssertionError();
            }
        }
        while (-1 != l && l != 0) 
        {
            int j1;
            if (k == 2)
            {
                if (a(l))
                {
                    bytearrayoutputstream.write(l);
                }
            } else
            if (b(l))
            {
                bytearrayoutputstream.write(l);
            }
            j1 = bytearrayinputstream.read();
            l = j1;
            if (!a)
            {
                l = j1;
                if (-1 == j1)
                {
                    throw new AssertionError();
                }
            }
        }
        if (bytearrayoutputstream.size() > 0)
        {
            return bytearrayoutputstream.toByteArray();
        } else
        {
            return null;
        }
    }

    protected static int c(ByteArrayInputStream bytearrayinputstream)
    {
        if (!a && bytearrayinputstream == null)
        {
            throw new AssertionError();
        }
        int l = 0;
        int i1 = bytearrayinputstream.read();
        int k = i1;
        if (i1 == -1)
        {
            return i1;
        }
        while ((k & 0x80) != 0) 
        {
            l = l << 7 | k & 0x7f;
            int j1 = bytearrayinputstream.read();
            k = j1;
            if (j1 == -1)
            {
                return j1;
            }
        }
        return k & 0x7f | l << 7;
    }

    protected static int c(ByteArrayInputStream bytearrayinputstream, int k)
    {
        if (!a && bytearrayinputstream == null)
        {
            throw new AssertionError();
        }
        int i1 = bytearrayinputstream.read(new byte[k], 0, k);
        int l = i1;
        if (i1 < k)
        {
            l = -1;
        }
        return l;
    }

    protected static int d(ByteArrayInputStream bytearrayinputstream)
    {
        if (!a && bytearrayinputstream == null)
        {
            throw new AssertionError();
        }
        int k = bytearrayinputstream.read();
        if (!a && -1 == k)
        {
            throw new AssertionError();
        }
        k &= 0xff;
        if (k <= 30)
        {
            return k;
        }
        if (k == 31)
        {
            return c(bytearrayinputstream);
        } else
        {
            throw new RuntimeException("Value length > LENGTH_QUOTE!");
        }
    }

    protected static e e(ByteArrayInputStream bytearrayinputstream)
    {
        if (!a && bytearrayinputstream == null)
        {
            throw new AssertionError();
        }
        bytearrayinputstream.mark(1);
        int k = bytearrayinputstream.read();
        if (!a && -1 == k)
        {
            throw new AssertionError();
        }
        bytearrayinputstream.reset();
        if ((k & 0xff) < 32)
        {
            d(bytearrayinputstream);
            k = g(bytearrayinputstream);
        } else
        {
            k = 0;
        }
        bytearrayinputstream = a(bytearrayinputstream, 0);
        if (k == 0)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        return new e(k, bytearrayinputstream);
        bytearrayinputstream = new e(bytearrayinputstream);
        return bytearrayinputstream;
        bytearrayinputstream;
        return null;
    }

    protected static int f(ByteArrayInputStream bytearrayinputstream)
    {
        if (!a && bytearrayinputstream == null)
        {
            throw new AssertionError();
        }
        int k = bytearrayinputstream.read();
        if (!a && -1 == k)
        {
            throw new AssertionError();
        } else
        {
            return k & 0xff;
        }
    }

    protected static int g(ByteArrayInputStream bytearrayinputstream)
    {
        if (!a && bytearrayinputstream == null)
        {
            throw new AssertionError();
        }
        int k = bytearrayinputstream.read();
        if (!a && -1 == k)
        {
            throw new AssertionError();
        } else
        {
            return k & 0x7f;
        }
    }

    protected static long h(ByteArrayInputStream bytearrayinputstream)
    {
        if (!a && bytearrayinputstream == null)
        {
            throw new AssertionError();
        }
        int k = bytearrayinputstream.read();
        if (!a && -1 == k)
        {
            throw new AssertionError();
        }
        int i1 = k & 0xff;
        if (i1 > 8)
        {
            throw new RuntimeException("Octet count greater than 8 and I can't represent that!");
        }
        long l1 = 0L;
        for (int l = 0; l < i1; l++)
        {
            int j1 = bytearrayinputstream.read();
            if (!a && -1 == j1)
            {
                throw new AssertionError();
            }
            l1 = (l1 << 8) + (long)(j1 & 0xff);
        }

        return l1;
    }

    protected static long i(ByteArrayInputStream bytearrayinputstream)
    {
        if (!a && bytearrayinputstream == null)
        {
            throw new AssertionError();
        }
        bytearrayinputstream.mark(1);
        int k = bytearrayinputstream.read();
        if (!a && -1 == k)
        {
            throw new AssertionError();
        }
        bytearrayinputstream.reset();
        if (k > 127)
        {
            return (long)g(bytearrayinputstream);
        } else
        {
            return h(bytearrayinputstream);
        }
    }

    public f a()
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        c = a(b);
        if (c == null) goto _L1; else goto _L3
_L3:
        int k;
        k = c.a(140);
        if (!a(c))
        {
            a("check mandatory headers failed!");
            return null;
        }
        if (128 != k && 132 != k)
        {
            break; /* Loop/switch isn't completed */
        }
        d = b(b);
        if (d == null) goto _L1; else goto _L4
_L4:
        switch (k)
        {
        default:
            a("Parser doesn't support this message type in this version!");
            return null;

        case 128: 
            return new z(c, d);

        case 129: 
            return new y(c);

        case 130: 
            return new h(c);

        case 131: 
            return new i(c);

        case 132: 
            x x1 = new x(c, d);
            byte abyte0[] = x1.b();
            if (abyte0 != null)
            {
                String s1 = new String(abyte0);
                if (s1.equals("application/vnd.wap.multipart.mixed") || s1.equals("application/vnd.wap.multipart.related") || s1.equals("application/vnd.wap.multipart.alternative"))
                {
                    return x1;
                }
                if (s1.equals("application/vnd.wap.multipart.alternative"))
                {
                    s s2 = d.a(0);
                    d.a();
                    d.a(0, s2);
                    return x1;
                }
            }
            break;

        case 134: 
            return new d(c);

        case 133: 
            return new a(c);

        case 136: 
            return new v(c);

        case 135: 
            return new w(c);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected q a(ByteArrayInputStream bytearrayinputstream)
    {
        q q1;
        boolean flag;
        if (bytearrayinputstream == null)
        {
            return null;
        }
        q1 = new q();
        flag = true;
_L28:
        if (!flag || bytearrayinputstream.available() <= 0) goto _L2; else goto _L1
_L1:
        int k;
        bytearrayinputstream.mark(1);
        k = f(bytearrayinputstream);
        if (k >= 32 && k <= 127)
        {
            bytearrayinputstream.reset();
            a(bytearrayinputstream, 0);
            continue; /* Loop/switch isn't completed */
        }
        k;
        JVM INSTR tableswitch 129 191: default 336
    //                   129 787
    //                   130 787
    //                   131 672
    //                   132 1753
    //                   133 590
    //                   134 507
    //                   135 908
    //                   136 908
    //                   137 1015
    //                   138 1204
    //                   139 672
    //                   140 345
    //                   141 1423
    //                   142 590
    //                   143 507
    //                   144 507
    //                   145 507
    //                   146 507
    //                   147 730
    //                   148 507
    //                   149 507
    //                   150 730
    //                   151 787
    //                   152 672
    //                   153 507
    //                   154 730
    //                   155 507
    //                   156 507
    //                   157 908
    //                   158 672
    //                   159 590
    //                   160 1507
    //                   161 1602
    //                   162 507
    //                   163 507
    //                   164 1681
    //                   165 507
    //                   166 730
    //                   167 507
    //                   168 336
    //                   169 507
    //                   170 1699
    //                   171 507
    //                   172 1699
    //                   173 631
    //                   174 336
    //                   175 631
    //                   176 336
    //                   177 507
    //                   178 1744
    //                   179 631
    //                   180 507
    //                   181 730
    //                   182 730
    //                   183 672
    //                   184 672
    //                   185 672
    //                   186 507
    //                   187 507
    //                   188 507
    //                   189 672
    //                   190 672
    //                   191 507;
           goto _L3 _L4 _L4 _L5 _L6 _L7 _L8 _L9 _L9 _L10 _L11 _L5 _L12 _L13 _L7 _L8 _L8 _L8 _L8 _L14 _L8 _L8 _L14 _L4 _L5 _L8 _L14 _L8 _L8 _L9 _L5 _L7 _L15 _L16 _L8 _L8 _L17 _L8 _L14 _L8 _L3 _L8 _L18 _L8 _L18 _L19 _L3 _L19 _L3 _L8 _L20 _L19 _L8 _L14 _L14 _L5 _L5 _L5 _L8 _L8 _L8 _L5 _L5 _L8
_L3:
        a("Unknown header");
        continue; /* Loop/switch isn't completed */
_L12:
        int l = f(bytearrayinputstream);
        switch (l)
        {
        default:
            try
            {
                q1.a(l, k);
            }
            // Misplaced declaration of an exception variable
            catch (ByteArrayInputStream bytearrayinputstream)
            {
                a((new StringBuilder()).append("Set invalid Octet value: ").append(l).append(" into the header filed: ").append(k).toString());
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (ByteArrayInputStream bytearrayinputstream)
            {
                a((new StringBuilder()).append(k).append("is not Octet header field!").toString());
                return null;
            }
            break;

        case 137: 
        case 138: 
        case 139: 
        case 140: 
        case 141: 
        case 142: 
        case 143: 
        case 144: 
        case 145: 
        case 146: 
        case 147: 
        case 148: 
        case 149: 
        case 150: 
        case 151: 
            return null;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        int i1 = f(bytearrayinputstream);
        try
        {
            q1.a(i1, k);
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            a((new StringBuilder()).append("Set invalid Octet value: ").append(i1).append(" into the header filed: ").append(k).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            a((new StringBuilder()).append(k).append("is not Octet header field!").toString());
            return null;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        try
        {
            q1.a(h(bytearrayinputstream), k);
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            a((new StringBuilder()).append(k).append("is not Long-Integer header field!").toString());
            return null;
        }
        continue; /* Loop/switch isn't completed */
_L19:
        try
        {
            q1.a(i(bytearrayinputstream), k);
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            a((new StringBuilder()).append(k).append("is not Long-Integer header field!").toString());
            return null;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        byte abyte0[] = a(bytearrayinputstream, 0);
        if (abyte0 != null)
        {
            try
            {
                q1.a(abyte0, k);
            }
            catch (NullPointerException nullpointerexception)
            {
                a("null pointer error!");
            }
            // Misplaced declaration of an exception variable
            catch (ByteArrayInputStream bytearrayinputstream)
            {
                a((new StringBuilder()).append(k).append("is not Text-String header field!").toString());
                return null;
            }
        }
        continue; /* Loop/switch isn't completed */
_L14:
        e e1 = e(bytearrayinputstream);
        if (e1 != null)
        {
            try
            {
                q1.a(e1, k);
            }
            catch (NullPointerException nullpointerexception1)
            {
                a("null pointer error!");
            }
            // Misplaced declaration of an exception variable
            catch (ByteArrayInputStream bytearrayinputstream)
            {
                a((new StringBuilder()).append(k).append("is not Encoded-String-Value header field!").toString());
                return null;
            }
        }
        continue; /* Loop/switch isn't completed */
_L4:
        e e4 = e(bytearrayinputstream);
        if (e4 != null)
        {
            byte abyte1[] = e4.b();
            if (abyte1 != null)
            {
                String s2 = new String(abyte1);
                int j1 = s2.indexOf("/");
                String s1 = s2;
                if (j1 > 0)
                {
                    s1 = s2.substring(0, j1);
                }
                NullPointerException nullpointerexception2;
                try
                {
                    e4.a(s1.getBytes());
                }
                // Misplaced declaration of an exception variable
                catch (ByteArrayInputStream bytearrayinputstream)
                {
                    a("null pointer error!");
                    return null;
                }
            }
            try
            {
                q1.b(e4, k);
            }
            // Misplaced declaration of an exception variable
            catch (NullPointerException nullpointerexception2)
            {
                a("null pointer error!");
            }
            // Misplaced declaration of an exception variable
            catch (ByteArrayInputStream bytearrayinputstream)
            {
                a((new StringBuilder()).append(k).append("is not Encoded-String-Value header field!").toString());
                return null;
            }
        }
        continue; /* Loop/switch isn't completed */
_L9:
        d(bytearrayinputstream);
        int k1 = f(bytearrayinputstream);
        long l2;
        long l3;
        try
        {
            l2 = h(bytearrayinputstream);
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            a((new StringBuilder()).append(k).append("is not Long-Integer header field!").toString());
            return null;
        }
        l3 = l2;
        if (129 == k1)
        {
            l3 = l2 + System.currentTimeMillis() / 1000L;
        }
        try
        {
            q1.a(l3, k);
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            a((new StringBuilder()).append(k).append("is not Long-Integer header field!").toString());
            return null;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        d(bytearrayinputstream);
        Object obj;
        if (128 == f(bytearrayinputstream))
        {
            e e3 = e(bytearrayinputstream);
            obj = e3;
            if (e3 != null)
            {
                byte abyte4[] = e3.b();
                obj = e3;
                if (abyte4 != null)
                {
                    String s3 = new String(abyte4);
                    int l1 = s3.indexOf("/");
                    obj = s3;
                    if (l1 > 0)
                    {
                        obj = s3.substring(0, l1);
                    }
                    try
                    {
                        e3.a(((String) (obj)).getBytes());
                    }
                    // Misplaced declaration of an exception variable
                    catch (ByteArrayInputStream bytearrayinputstream)
                    {
                        a("null pointer error!");
                        return null;
                    }
                    obj = e3;
                }
            }
        } else
        {
            try
            {
                obj = new e("insert-address-token".getBytes());
            }
            // Misplaced declaration of an exception variable
            catch (ByteArrayInputStream bytearrayinputstream)
            {
                a((new StringBuilder()).append(k).append("is not Encoded-String-Value header field!").toString());
                return null;
            }
        }
        try
        {
            q1.a(((e) (obj)), 137);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a("null pointer error!");
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            a((new StringBuilder()).append(k).append("is not Encoded-String-Value header field!").toString());
            return null;
        }
        continue; /* Loop/switch isn't completed */
_L11:
        int i2;
        bytearrayinputstream.mark(1);
        i2 = f(bytearrayinputstream);
        if (i2 < 128) goto _L22; else goto _L21
_L21:
        if (128 == i2)
        {
            try
            {
                q1.a("personal".getBytes(), 138);
            }
            catch (NullPointerException nullpointerexception3)
            {
                a("null pointer error!");
            }
            // Misplaced declaration of an exception variable
            catch (ByteArrayInputStream bytearrayinputstream)
            {
                a((new StringBuilder()).append(k).append("is not Text-String header field!").toString());
                return null;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (129 != i2) goto _L24; else goto _L23
_L23:
        q1.a("advertisement".getBytes(), 138);
        continue; /* Loop/switch isn't completed */
_L24:
        if (130 != i2) goto _L26; else goto _L25
_L25:
        q1.a("informational".getBytes(), 138);
        continue; /* Loop/switch isn't completed */
_L26:
        if (131 != i2)
        {
            continue; /* Loop/switch isn't completed */
        }
        q1.a("auto".getBytes(), 138);
        continue; /* Loop/switch isn't completed */
_L22:
        bytearrayinputstream.reset();
        byte abyte2[] = a(bytearrayinputstream, 0);
        if (abyte2 != null)
        {
            try
            {
                q1.a(abyte2, 138);
            }
            catch (NullPointerException nullpointerexception4)
            {
                a("null pointer error!");
            }
            // Misplaced declaration of an exception variable
            catch (ByteArrayInputStream bytearrayinputstream)
            {
                a((new StringBuilder()).append(k).append("is not Text-String header field!").toString());
                return null;
            }
        }
        continue; /* Loop/switch isn't completed */
_L13:
        int j2 = g(bytearrayinputstream);
        try
        {
            q1.a(j2, 141);
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            a((new StringBuilder()).append("Set invalid Octet value: ").append(j2).append(" into the header filed: ").append(k).toString());
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            a((new StringBuilder()).append(k).append("is not Octet header field!").toString());
            return null;
        }
        continue; /* Loop/switch isn't completed */
_L15:
        d(bytearrayinputstream);
        e e2;
        try
        {
            i(bytearrayinputstream);
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            a((new StringBuilder()).append(k).append(" is not Integer-Value").toString());
            return null;
        }
        e2 = e(bytearrayinputstream);
        if (e2 != null)
        {
            try
            {
                q1.a(e2, 160);
            }
            catch (NullPointerException nullpointerexception5)
            {
                a("null pointer error!");
            }
            // Misplaced declaration of an exception variable
            catch (ByteArrayInputStream bytearrayinputstream)
            {
                a((new StringBuilder()).append(k).append("is not Encoded-String-Value header field!").toString());
                return null;
            }
        }
        continue; /* Loop/switch isn't completed */
_L16:
        d(bytearrayinputstream);
        try
        {
            i(bytearrayinputstream);
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            a((new StringBuilder()).append(k).append(" is not Integer-Value").toString());
            return null;
        }
        try
        {
            q1.a(h(bytearrayinputstream), 161);
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            a((new StringBuilder()).append(k).append("is not Long-Integer header field!").toString());
            return null;
        }
        continue; /* Loop/switch isn't completed */
_L17:
        d(bytearrayinputstream);
        f(bytearrayinputstream);
        e(bytearrayinputstream);
        continue; /* Loop/switch isn't completed */
_L18:
        d(bytearrayinputstream);
        f(bytearrayinputstream);
        try
        {
            i(bytearrayinputstream);
        }
        // Misplaced declaration of an exception variable
        catch (ByteArrayInputStream bytearrayinputstream)
        {
            a((new StringBuilder()).append(k).append(" is not Integer-Value").toString());
            return null;
        }
        continue; /* Loop/switch isn't completed */
_L20:
        a(bytearrayinputstream, ((HashMap) (null)));
        continue; /* Loop/switch isn't completed */
_L6:
        HashMap hashmap = new HashMap();
        byte abyte3[] = a(bytearrayinputstream, hashmap);
        if (abyte3 != null)
        {
            try
            {
                q1.a(abyte3, 132);
            }
            catch (NullPointerException nullpointerexception6)
            {
                a("null pointer error!");
            }
            // Misplaced declaration of an exception variable
            catch (ByteArrayInputStream bytearrayinputstream)
            {
                a((new StringBuilder()).append(k).append("is not Text-String header field!").toString());
                return null;
            }
        }
        f = (byte[])(byte[])hashmap.get(Integer.valueOf(153));
        e = (byte[])(byte[])hashmap.get(Integer.valueOf(131));
        flag = false;
        continue; /* Loop/switch isn't completed */
_L2:
        return q1;
        if (true) goto _L28; else goto _L27
_L27:
    }

    static 
    {
        boolean flag;
        if (!android_src/mms/e/r.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
