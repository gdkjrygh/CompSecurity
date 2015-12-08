// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.b.a.b;

import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.e;
import com.nuance.a.a.a.c.b.b.a;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

// Referenced classes of package com.nuance.a.a.a.c.b.a.b:
//            e, c, g, j, 
//            f, a, d, i, 
//            h

public class b extends com.nuance.a.a.a.c.b.a.b.e
    implements com.nuance.a.a.a.c.b.b.b
{

    private static final e a = com.nuance.a.a.a.a.d.a.d.a(com/nuance/a/a/a/c/b/a/b/b);
    private Vector b;

    public b()
    {
        super((short)16);
        b = new Vector();
    }

    public b(byte abyte0[])
    {
        super((short)16);
        b = new Vector();
        int k = 0;
        do
        {
            if (k >= abyte0.length)
            {
                break;
            }
            int i1 = k + 1;
            int l = abyte0[k] & 0xff;
            k = a(abyte0, i1);
            i1 += j(k);
            byte abyte1[] = new byte[k];
            System.arraycopy(abyte0, i1, abyte1, 0, abyte1.length);
            k += i1;
            switch (l)
            {
            default:
                a.b((new StringBuilder("PDXSequence() Unknown PDXClass type: ")).append(l).append(". ").toString());
                break;

            case 7: // '\007'
                b.addElement(new c(abyte1));
                break;

            case 6: // '\006'
                b.addElement(new g(abyte1));
                break;

            case 192: 
                b.addElement(new j(abyte1));
                break;

            case 4: // '\004'
                b.addElement(new f(abyte1));
                break;

            case 193: 
                b.addElement(new com.nuance.a.a.a.c.b.a.b.a(abyte1));
                break;

            case 22: // '\026'
                b.addElement(new com.nuance.a.a.a.c.b.a.b.d(abyte1));
                break;

            case 5: // '\005'
                b.addElement(new i());
                break;

            case 224: 
                b.addElement(new h(abyte1, (byte)0));
                break;

            case 16: // '\020'
                b.addElement(new b(abyte1));
                break;
            }
        } while (true);
    }

    public final int a()
    {
        return b.size();
    }

    public final short a(int k)
    {
        if (k >= b.size())
        {
            a.b((new StringBuilder("PDXSequence.getType() index ")).append(k).append(" is out of range. ").toString());
            throw new IndexOutOfBoundsException();
        } else
        {
            return ((com.nuance.a.a.a.c.b.a.b.e)b.elementAt(k)).g();
        }
    }

    public final void a(a a1)
    {
        if (a1 == null)
        {
            throw new IllegalArgumentException("value is null.");
        }
        if (((com.nuance.a.a.a.c.b.a.b.e)a1).g() != 224)
        {
            a.b("PDXSequence.addDictionary() value is not a valid dictionary.");
            throw new IllegalArgumentException("value is not a valid dictionary. ");
        } else
        {
            b.addElement(a1);
            return;
        }
    }

    public final void a(com.nuance.a.a.a.c.b.b.b b1)
    {
        if (b1 == null)
        {
            throw new IllegalArgumentException("value is null.");
        }
        if (((com.nuance.a.a.a.c.b.a.b.e)b1).g() != 16)
        {
            a.b("PDXSequence.addSequence() value is not a valid sequence.");
            throw new IllegalArgumentException("value is not a valid sequence. ");
        } else
        {
            b.addElement(b1);
            return;
        }
    }

    public final void a(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("value is null.");
        } else
        {
            s = new com.nuance.a.a.a.c.b.a.b.d(s);
            b.addElement(s);
            return;
        }
    }

    public final void a(byte abyte0[])
    {
        if (abyte0 == null)
        {
            throw new IllegalArgumentException("value is null.");
        } else
        {
            abyte0 = new f(abyte0);
            b.addElement(abyte0);
            return;
        }
    }

    public final int b(int k)
    {
        if (k >= b.size())
        {
            a.b((new StringBuilder("PDXSequence.getInteger() index ")).append(k).append(" is out of range. ").toString());
            throw new IndexOutOfBoundsException();
        }
        com.nuance.a.a.a.c.b.a.b.e e1 = (com.nuance.a.a.a.c.b.a.b.e)b.elementAt(k);
        if (e1.g() != 192)
        {
            a.b((new StringBuilder("PDXSequence.getInteger() index ")).append(k).append(" is not a PDXInteger. ").toString());
            throw new RuntimeException("index is of wrong type.");
        } else
        {
            return ((j)e1).a();
        }
    }

    public final void b(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("value is null.");
        } else
        {
            s = new com.nuance.a.a.a.c.b.a.b.a(s);
            b.addElement(s);
            return;
        }
    }

    public final byte[] b()
    {
        ByteArrayOutputStream bytearrayoutputstream;
        Enumeration enumeration;
        bytearrayoutputstream = new ByteArrayOutputStream();
        enumeration = b.elements();
_L12:
        Object obj;
        if (!enumeration.hasMoreElements())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = (com.nuance.a.a.a.c.b.a.b.e)enumeration.nextElement();
        ((com.nuance.a.a.a.c.b.a.b.e) (obj)).g();
        JVM INSTR lookupswitch 9: default 289
    //                   4: 120
    //                   5: 238
    //                   6: 182
    //                   7: 168
    //                   16: 266
    //                   22: 224
    //                   192: 196
    //                   193: 210
    //                   224: 252;
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
            a.b((new StringBuilder("PDXSequence.toByteArray() ")).append(((IOException) (obj)).toString()).append(". ").toString());
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
        bytearrayoutputstream.write(((b)obj).b());
        if (true) goto _L12; else goto _L11
_L11:
        return super.b(bytearrayoutputstream.toByteArray());
    }

    public final byte[] c(int k)
    {
        if (k >= b.size())
        {
            a.b((new StringBuilder("PDXSequence.getByteString() index ")).append(k).append(" is out of range. ").toString());
            throw new IndexOutOfBoundsException();
        }
        com.nuance.a.a.a.c.b.a.b.e e1 = (com.nuance.a.a.a.c.b.a.b.e)b.elementAt(k);
        if (e1.g() != 4)
        {
            a.b((new StringBuilder("PDXSequence.getByteString() index ")).append(k).append(" is not a PDXByteString. ").toString());
            throw new RuntimeException("index is of wrong type.");
        } else
        {
            return ((f)e1).a();
        }
    }

    public final String d(int k)
    {
        if (k >= b.size())
        {
            a.b((new StringBuilder("PDXSequence.getUTF8String() index ")).append(k).append(" is out of range. ").toString());
            throw new IndexOutOfBoundsException();
        }
        com.nuance.a.a.a.c.b.a.b.e e1 = (com.nuance.a.a.a.c.b.a.b.e)b.elementAt(k);
        if (e1.g() != 193)
        {
            a.b((new StringBuilder("PDXSequence.getUTF8String() index ")).append(k).append(" is not a PDXUTF8String. ").toString());
            throw new RuntimeException("index is of wrong type.");
        } else
        {
            return ((com.nuance.a.a.a.c.b.a.b.a)e1).a();
        }
    }

    public final String e(int k)
    {
        if (k >= b.size())
        {
            a.b((new StringBuilder("PDXSequence.getAsciiString() index ")).append(k).append(" is out of range. ").toString());
            throw new IndexOutOfBoundsException();
        }
        com.nuance.a.a.a.c.b.a.b.e e1 = (com.nuance.a.a.a.c.b.a.b.e)b.elementAt(k);
        if (e1.g() != 22)
        {
            a.b((new StringBuilder("PDXSequence.getAsciiString() index ")).append(k).append(" is not a PDXAsciiString. ").toString());
            throw new RuntimeException("index is of wrong type.");
        } else
        {
            return ((com.nuance.a.a.a.c.b.a.b.d)e1).a();
        }
    }

    public final a f(int k)
    {
        if (k >= b.size())
        {
            a.b((new StringBuilder("PDXSequence.getDictionary() index ")).append(k).append(" is out of range. ").toString());
            throw new IndexOutOfBoundsException();
        }
        com.nuance.a.a.a.c.b.a.b.e e1 = (com.nuance.a.a.a.c.b.a.b.e)b.elementAt(k);
        if (e1.g() != 224)
        {
            a.b((new StringBuilder("PDXSequence.getDictionary() index ")).append(k).append(" is not a PDXDictionary. ").toString());
            throw new RuntimeException("index is of wrong type.");
        } else
        {
            return (h)e1;
        }
    }

    public final com.nuance.a.a.a.c.b.b.b g(int k)
    {
        if (k >= b.size())
        {
            a.b((new StringBuilder("PDXSequence.getSequence() index ")).append(k).append(" is out of range. ").toString());
            throw new IndexOutOfBoundsException();
        }
        com.nuance.a.a.a.c.b.a.b.e e1 = (com.nuance.a.a.a.c.b.a.b.e)b.elementAt(k);
        if (e1.g() != 16)
        {
            a.b((new StringBuilder("PDXSequence.getSequence() index ")).append(k).append(" is not a PDXSequence. ").toString());
            throw new RuntimeException("index is of wrong type.");
        } else
        {
            return (b)e1;
        }
    }

    public final void h(int k)
    {
        j j1 = new j(k);
        b.addElement(j1);
    }

    protected final String i(int k)
    {
        int l = 0;
        String s1 = "";
        for (; l < k - 1; l++)
        {
            s1 = (new StringBuilder()).append(s1).append("    ").toString();
        }

        String s;
        String s2;
        Object obj;
        Enumeration enumeration;
        if (k > 0)
        {
            s2 = (new StringBuilder()).append(s1).append("    ").toString();
        } else
        {
            s2 = "";
        }
        enumeration = b.elements();
        s = (new StringBuilder()).append("").append("[ \n").toString();
        if (!enumeration.hasMoreElements())
        {
            break MISSING_BLOCK_LABEL_625;
        }
        obj = (com.nuance.a.a.a.c.b.a.b.e)enumeration.nextElement();
        switch (((com.nuance.a.a.a.c.b.a.b.e) (obj)).g())
        {
        default:
            break;

        case 7: // '\007'
            break; /* Loop/switch isn't completed */

        case 6: // '\006'
            s = (new StringBuilder()).append(s).append(s2).append("<DOUBLE> ").append(((g)obj).a()).toString();
            continue; /* Loop/switch isn't completed */

        case 192: 
            s = (new StringBuilder()).append(s).append(s2).append("<INT> ").append(((j)obj).a()).toString();
            continue; /* Loop/switch isn't completed */

        case 4: // '\004'
            s = (new StringBuilder()).append(s).append(s2).append("<BYTES> \"").append(((f)obj).a()).append("\" ").toString();
            continue; /* Loop/switch isn't completed */

        case 193: 
            s = (new StringBuilder()).append(s).append(s2).append("<UTF8> \"").append(((com.nuance.a.a.a.c.b.a.b.a)obj).a()).append("\" ").toString();
            continue; /* Loop/switch isn't completed */

        case 22: // '\026'
            s = (new StringBuilder()).append(s).append(s2).append("<ASCII> \"").append(((com.nuance.a.a.a.c.b.a.b.d)obj).a()).append("\" ").toString();
            continue; /* Loop/switch isn't completed */

        case 5: // '\005'
            s = (new StringBuilder()).append(s).append(s2).append("<NULL> ").toString();
            continue; /* Loop/switch isn't completed */

        case 224: 
            s = (new StringBuilder()).append(s).append(s2).append(((h)obj).a(k + 1)).toString();
            continue; /* Loop/switch isn't completed */

        case 16: // '\020'
            break;
        }
        break MISSING_BLOCK_LABEL_588;
_L4:
        obj = s;
        if (enumeration.hasMoreElements())
        {
            obj = (new StringBuilder()).append(s).append(",").toString();
        }
        s = (new StringBuilder()).append(((String) (obj))).append("\n").toString();
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_98;
_L1:
        s = (new StringBuilder()).append(s).append(s2).append("<BOOLEAN> ").append(((c)obj).a()).toString();
        continue; /* Loop/switch isn't completed */
        s = (new StringBuilder()).append(s).append(s2).append(((b)obj).i(k + 1)).toString();
        if (true) goto _L4; else goto _L3
_L3:
        return (new StringBuilder()).append(s).append(s1).append("] ").toString();
    }

    public final String toString()
    {
        return i(0);
    }

}
