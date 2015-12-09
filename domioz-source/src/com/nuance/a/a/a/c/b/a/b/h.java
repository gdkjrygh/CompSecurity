// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.b.a.b;

import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.e;
import com.nuance.a.a.a.c.b.b.a;
import com.nuance.a.a.a.c.b.b.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

// Referenced classes of package com.nuance.a.a.a.c.b.a.b:
//            e, c, g, j, 
//            f, a, d, i, 
//            b

public class h extends com.nuance.a.a.a.c.b.a.b.e
    implements a
{

    private static final e a = com.nuance.a.a.a.a.d.a.d.a(com/nuance/a/a/a/c/b/a/b/h);
    private Hashtable b;

    public h()
    {
        super((short)224);
        b = new Hashtable();
    }

    public h(byte abyte0[])
    {
label0:
        {
            super((short)224);
            b = new Hashtable();
            if (abyte0.length > 0)
            {
                if ((abyte0[0] & 0xff) == 224)
                {
                    break label0;
                }
                a.b("PDXDictionary() Expected a dictionary. ");
            }
            return;
        }
        int l = a(abyte0, 1);
        byte abyte1[] = new byte[l];
        System.arraycopy(abyte0, abyte0.length - l, abyte1, 0, abyte1.length);
        a(abyte1);
    }

    public h(byte abyte0[], byte byte0)
    {
        super((short)224);
        b = new Hashtable();
        a(abyte0);
    }

    private void a(byte abyte0[])
    {
        int l = 0;
        do
        {
            int i1;
label0:
            {
                if (l < abyte0.length)
                {
                    i1 = l + 1;
                    l = abyte0[l] & 0xff;
                    if (l == 22)
                    {
                        break label0;
                    }
                    a.b((new StringBuilder("PDXDictionary.setContent() Expected an ASCII string but got ")).append(l).append(". ").toString());
                }
                return;
            }
            l = a(abyte0, i1);
            i1 += j(l);
            byte abyte1[] = new byte[l];
            System.arraycopy(abyte0, i1, abyte1, 0, abyte1.length);
            i1 = l + i1;
            String s = new String(abyte1);
            l = i1 + 1;
            i1 = abyte0[i1] & 0xff;
            int j1 = a(abyte0, l);
            l += j(j1);
            byte abyte2[] = new byte[j1];
            System.arraycopy(abyte0, l, abyte2, 0, abyte2.length);
            l = j1 + l;
            switch (i1)
            {
            default:
                a.b((new StringBuilder("PDXDictionary.setContent() Unknown PDXClass type: ")).append(i1).append(". ").toString());
                break;

            case 7: // '\007'
                b.put(s, new c(abyte2));
                break;

            case 6: // '\006'
                b.put(s, new g(abyte2));
                break;

            case 192: 
                b.put(s, new j(abyte2));
                break;

            case 4: // '\004'
                b.put(s, new f(abyte2));
                break;

            case 193: 
                b.put(s, new com.nuance.a.a.a.c.b.a.b.a(abyte2));
                break;

            case 22: // '\026'
                b.put(s, new com.nuance.a.a.a.c.b.a.b.d(abyte2));
                break;

            case 5: // '\005'
                b.put(s, new i());
                break;

            case 224: 
                b.put(s, new h(abyte2, (byte)0));
                break;

            case 16: // '\020'
                b.put(s, new com.nuance.a.a.a.c.b.a.b.b(abyte2));
                break;
            }
        } while (true);
    }

    protected final String a(int l)
    {
        int i1 = 0;
        String s1 = "";
        for (; i1 < l - 1; i1++)
        {
            s1 = (new StringBuilder()).append(s1).append("    ").toString();
        }

        String s;
        String s2;
        Enumeration enumeration;
        if (l > 0)
        {
            s2 = (new StringBuilder()).append(s1).append("    ").toString();
        } else
        {
            s2 = "";
        }
        enumeration = b.keys();
        if (l != 0)
        {
            s = (new StringBuilder()).append("").append("{ \n").toString();
        } else
        {
            s = "";
        }
        do
        {
            if (enumeration.hasMoreElements())
            {
                String s3 = (String)enumeration.nextElement();
                com.nuance.a.a.a.c.b.a.b.e e1 = (com.nuance.a.a.a.c.b.a.b.e)b.get(s3);
                switch (e1.g())
                {
                case 7: // '\007'
                    s = (new StringBuilder()).append(s).append(s2).append(s3).append(": <BOOLEAN> ").append(((c)e1).a()).append("\n").toString();
                    break;

                case 6: // '\006'
                    s = (new StringBuilder()).append(s).append(s2).append(s3).append(": <DOUBLE> ").append(((g)e1).a()).append("\n").toString();
                    break;

                case 192: 
                    s = (new StringBuilder()).append(s).append(s2).append(s3).append(": <INT> ").append(((j)e1).a()).append("\n").toString();
                    break;

                case 4: // '\004'
                    s = (new StringBuilder()).append(s).append(s2).append(s3).append(": <BYTES> \"").append(((f)e1).a()).append("\"\n").toString();
                    break;

                case 193: 
                    s = (new StringBuilder()).append(s).append(s2).append(s3).append(": <UTF8> \"").append(((com.nuance.a.a.a.c.b.a.b.a)e1).a()).append("\"\n").toString();
                    break;

                case 22: // '\026'
                    s = (new StringBuilder()).append(s).append(s2).append(s3).append(": <ASCII> \"").append(((com.nuance.a.a.a.c.b.a.b.d)e1).a()).append("\"\n").toString();
                    break;

                case 5: // '\005'
                    s = (new StringBuilder()).append(s).append(s2).append(s3).append(": <NULL> \n").toString();
                    break;

                case 224: 
                    s = (new StringBuilder()).append(s).append(s2).append(s3).append(": ").append(((h)e1).a(l + 1)).append("\n").toString();
                    break;

                case 16: // '\020'
                    s = (new StringBuilder()).append(s).append(s2).append(s3).append(": ").append(((com.nuance.a.a.a.c.b.a.b.b)e1).i(l + 1)).append("\n").toString();
                    break;
                }
            } else
            {
                s2 = s;
                if (l != 0)
                {
                    s2 = (new StringBuilder()).append(s).append(s1).append("} ").toString();
                }
                return s2;
            }
        } while (true);
    }

    protected final void a(String s, double d1)
    {
        b.put(s, new g(d1));
    }

    protected final void a(String s, int l)
    {
        b.put(s, new j(l));
    }

    public final void a(String s, a a1)
    {
        if (s == null || a1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder("key is : ")).append(s).append(" value is : ").append(a1).toString());
        }
        if (((com.nuance.a.a.a.c.b.a.b.e)a1).g() != 224)
        {
            a.b("PDXDictionary.addDictionary() value is not a valid dictionary.");
            throw new IllegalArgumentException("value is not a valid dictionary. ");
        } else
        {
            b.put(s, a1);
            return;
        }
    }

    public final void a(String s, b b1)
    {
        if (s == null || b1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder("key is : ")).append(s).append(" value is : ").append(b1).toString());
        }
        if (((com.nuance.a.a.a.c.b.a.b.e)b1).g() != 16)
        {
            a.b("PDXDictionary.addSequence() value is not a valid sequence.");
            throw new IllegalArgumentException("value is not a valid sequence. ");
        } else
        {
            b.put(s, b1);
            return;
        }
    }

    public final void a(String s, String s1)
    {
        if (s == null || s1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder("key is : ")).append(s).append(" value is : ").append(s1).toString());
        } else
        {
            s1 = new com.nuance.a.a.a.c.b.a.b.d(s1);
            b.put(s, s1);
            return;
        }
    }

    public final void a(String s, String s1, short word0)
    {
        switch (word0)
        {
        default:
            return;

        case 193: 
            b.put(s, new com.nuance.a.a.a.c.b.a.b.a(s1));
            return;

        case 22: // '\026'
            b.put(s, new com.nuance.a.a.a.c.b.a.b.d(s1));
            return;
        }
    }

    protected final void a(String s, boolean flag)
    {
        b.put(s, new c(flag));
    }

    public final void a(String s, byte abyte0[])
    {
        if (s == null || abyte0 == null)
        {
            throw new IllegalArgumentException((new StringBuilder("key is : ")).append(s).append(" value is : ").append(abyte0).toString());
        } else
        {
            abyte0 = new f(abyte0);
            b.put(s, abyte0);
            return;
        }
    }

    protected final void a(String s, byte abyte0[], short word0)
    {
        switch (word0)
        {
        default:
            a.b((new StringBuilder("PDXDictionary.put() Unknown PDXClass type: ")).append(word0).append(". ").toString());
            return;

        case 7: // '\007'
            b.put(s, new c(abyte0));
            return;

        case 6: // '\006'
            b.put(s, new g(abyte0));
            return;

        case 192: 
            b.put(s, new j(abyte0));
            return;

        case 4: // '\004'
            b.put(s, new f(abyte0));
            return;

        case 193: 
            b.put(s, new com.nuance.a.a.a.c.b.a.b.a(abyte0));
            return;

        case 22: // '\026'
            b.put(s, new com.nuance.a.a.a.c.b.a.b.d(abyte0));
            return;

        case 5: // '\005'
            b.put(s, new i());
            return;

        case 224: 
            b.put(s, new h(abyte0, (byte)0));
            return;

        case 16: // '\020'
            b.put(s, new com.nuance.a.a.a.c.b.a.b.b(abyte0));
            return;
        }
    }

    public final boolean a(String s)
    {
        return b.containsKey(s);
    }

    public final com.nuance.a.a.a.c.b.a.b.e b(String s)
    {
        return (com.nuance.a.a.a.c.b.a.b.e)b.get(s);
    }

    public final void b(String s, int l)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("key is null.");
        } else
        {
            j j1 = new j(l);
            b.put(s, j1);
            return;
        }
    }

    public final void b(String s, String s1)
    {
        if (s == null || s1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder("key is : ")).append(s).append(" value is : ").append(s1).toString());
        } else
        {
            s1 = new com.nuance.a.a.a.c.b.a.b.a(s1);
            b.put(s, s1);
            return;
        }
    }

    public final short c(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("key is null.");
        } else
        {
            return ((com.nuance.a.a.a.c.b.a.b.e)b.get(s)).g();
        }
    }

    public final boolean d(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("key is null.");
        }
        com.nuance.a.a.a.c.b.a.b.e e1 = (com.nuance.a.a.a.c.b.a.b.e)b.get(s);
        if (e1 == null)
        {
            if (a.e())
            {
                a.b((new StringBuilder("PDXDictionary.getBoolean() ")).append(s).append(" does not exist. ").toString());
            }
            throw new RuntimeException("key does not exist. ");
        }
        if (e1.g() != 7)
        {
            if (a.e())
            {
                a.b((new StringBuilder("PDXDictionary.getBoolean() ")).append(s).append(" is not a PDXBoolean. ").toString());
            }
            throw new RuntimeException("key is of wrong type. ");
        } else
        {
            return ((c)e1).a();
        }
    }

    public final double e(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("key is null.");
        }
        com.nuance.a.a.a.c.b.a.b.e e1 = (com.nuance.a.a.a.c.b.a.b.e)b.get(s);
        if (e1 == null)
        {
            if (a.e())
            {
                a.b((new StringBuilder("PDXDictionary.getDouble() ")).append(s).append(" does not exist. ").toString());
            }
            throw new RuntimeException("key does not exist. ");
        }
        if (e1.g() != 6)
        {
            if (a.e())
            {
                a.b((new StringBuilder("PDXDictionary.getDouble() ")).append(s).append(" is not a PDXDouble. ").toString());
            }
            throw new RuntimeException("key is of wrong type. ");
        } else
        {
            return ((g)e1).a();
        }
    }

    public byte[] e()
    {
        return super.b(i());
    }

    public final int f(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("key is null.");
        }
        com.nuance.a.a.a.c.b.a.b.e e1 = (com.nuance.a.a.a.c.b.a.b.e)b.get(s);
        if (e1 == null)
        {
            if (a.e())
            {
                a.b((new StringBuilder("PDXDictionary.getInteger() ")).append(s).append(" does not exist. ").toString());
            }
            throw new RuntimeException("key does not exist. ");
        }
        if (e1.g() != 192)
        {
            if (a.e())
            {
                a.b((new StringBuilder("PDXDictionary.getInteger() ")).append(s).append(" is not a PDXInteger. ").toString());
            }
            throw new RuntimeException("key is of wrong type. ");
        } else
        {
            return ((j)e1).a();
        }
    }

    public final byte[] g(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("key is null.");
        }
        com.nuance.a.a.a.c.b.a.b.e e1 = (com.nuance.a.a.a.c.b.a.b.e)b.get(s);
        if (e1 == null)
        {
            a.b((new StringBuilder("PDXDictionary.getByteString() ")).append(s).append(" does not exist. ").toString());
            throw new RuntimeException("key does not exist. ");
        }
        if (e1.g() != 4)
        {
            a.b((new StringBuilder("PDXDictionary.getByteString() ")).append(s).append(" is not a PDXByteString. ").toString());
            throw new RuntimeException("key is of wrong type. ");
        } else
        {
            return ((f)e1).a();
        }
    }

    public final String h(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("key is null.");
        }
        com.nuance.a.a.a.c.b.a.b.e e1 = (com.nuance.a.a.a.c.b.a.b.e)b.get(s);
        if (e1 == null)
        {
            a.b((new StringBuilder("PDXDictionary.getUTF8String() ")).append(s).append(" does not exist. ").toString());
            throw new RuntimeException("key does not exist. ");
        }
        if (e1.g() != 193)
        {
            a.b((new StringBuilder("PDXDictionary.getUTF8String() ")).append(s).append(" is not a PDXUTF8String. ").toString());
            throw new RuntimeException("key is of wrong type. ");
        } else
        {
            return ((com.nuance.a.a.a.c.b.a.b.a)e1).a();
        }
    }

    public final Enumeration h()
    {
        return b.keys();
    }

    public final String i(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("key is null.");
        }
        com.nuance.a.a.a.c.b.a.b.e e1 = (com.nuance.a.a.a.c.b.a.b.e)b.get(s);
        if (e1 == null)
        {
            a.b((new StringBuilder("PDXDictionary.getAsciiString() ")).append(s).append(" does not exist. ").toString());
            throw new RuntimeException("key does not exist. ");
        }
        if (e1.g() != 22)
        {
            a.b((new StringBuilder("PDXDictionary.getAsciiString() ")).append(s).append(" is not a PDXAsciiString. ").toString());
            throw new RuntimeException("key is of wrong type. ");
        } else
        {
            return ((com.nuance.a.a.a.c.b.a.b.d)e1).a();
        }
    }

    public final byte[] i()
    {
        ByteArrayOutputStream bytearrayoutputstream;
        Enumeration enumeration;
        bytearrayoutputstream = new ByteArrayOutputStream();
        enumeration = b.keys();
_L12:
        Object obj;
        com.nuance.a.a.a.c.b.a.b.d d1;
        if (!enumeration.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (String)enumeration.nextElement();
        d1 = new com.nuance.a.a.a.c.b.a.b.d(((String) (obj)));
        bytearrayoutputstream.write(d1.b());
        obj = (com.nuance.a.a.a.c.b.a.b.e)b.get(obj);
        ((com.nuance.a.a.a.c.b.a.b.e) (obj)).g();
        JVM INSTR lookupswitch 9: default 318
    //                   4: 152
    //                   5: 271
    //                   6: 215
    //                   7: 201
    //                   16: 299
    //                   22: 257
    //                   192: 229
    //                   193: 243
    //                   224: 285;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        if (false)
        {
        }
        continue; /* Loop/switch isn't completed */
_L2:
        bytearrayoutputstream.write(((f)obj).b());
        continue; /* Loop/switch isn't completed */
_L5:
        try
        {
            bytearrayoutputstream.write(((c)obj).b());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            a.b((new StringBuilder("PDXDictionary.getContent() ")).append(((IOException) (obj)).toString()).append(". ").toString());
        }
        continue; /* Loop/switch isn't completed */
_L4:
        bytearrayoutputstream.write(((g)obj).b());
        continue; /* Loop/switch isn't completed */
_L8:
        bytearrayoutputstream.write(((j)obj).b());
        continue; /* Loop/switch isn't completed */
_L9:
        bytearrayoutputstream.write(((com.nuance.a.a.a.c.b.a.b.a)obj).b());
        continue; /* Loop/switch isn't completed */
_L7:
        bytearrayoutputstream.write(((com.nuance.a.a.a.c.b.a.b.d)obj).b());
        continue; /* Loop/switch isn't completed */
_L3:
        bytearrayoutputstream.write(((i)obj).a());
        continue; /* Loop/switch isn't completed */
_L10:
        bytearrayoutputstream.write(((h)obj).e());
        continue; /* Loop/switch isn't completed */
_L6:
        bytearrayoutputstream.write(((com.nuance.a.a.a.c.b.a.b.b)obj).b());
        if (true) goto _L12; else goto _L11
_L11:
        return bytearrayoutputstream.toByteArray();
    }

    public final a j(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("key is null.");
        }
        com.nuance.a.a.a.c.b.a.b.e e1 = (com.nuance.a.a.a.c.b.a.b.e)b.get(s);
        if (e1 == null)
        {
            a.b((new StringBuilder("PDXDictionary.getDictionary() ")).append(s).append(" does not exist. ").toString());
            throw new RuntimeException("key does not exist. ");
        }
        if (e1.g() != 224)
        {
            a.b((new StringBuilder("PDXDictionary.getDictionary() ")).append(s).append(" is not a PDXDictionary. ").toString());
            throw new RuntimeException("key is of wrong type. ");
        } else
        {
            return (h)e1;
        }
    }

    public final b k(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("key is null.");
        }
        com.nuance.a.a.a.c.b.a.b.e e1 = (com.nuance.a.a.a.c.b.a.b.e)b.get(s);
        if (e1 == null)
        {
            a.b((new StringBuilder("PDXDictionary.getSequence() ")).append(s).append(" does not exist. ").toString());
            throw new RuntimeException("key does not exist. ");
        }
        if (e1.g() != 16)
        {
            a.b((new StringBuilder("PDXDictionary.getSequence() ")).append(s).append(" is not a PDXSequence. ").toString());
            throw new RuntimeException("key is of wrong type. ");
        } else
        {
            return (com.nuance.a.a.a.c.b.a.b.b)e1;
        }
    }

    public final String toString()
    {
        return a(0);
    }

}
