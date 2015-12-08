// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.parser;

import com.github.nkzawa.utf8.UTF8Exception;
import com.github.nkzawa.utf8.a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.github.nkzawa.engineio.parser:
//            b, a

public final class c
{
    public static interface a
    {

        public abstract boolean a(com.github.nkzawa.engineio.parser.b b1);
    }

    public static interface b
    {

        public abstract void a(Object obj);
    }


    private static final int a = 10;
    private static final Map b;
    private static final Map c;
    private static com.github.nkzawa.engineio.parser.b d = new com.github.nkzawa.engineio.parser.b("error", "parser error");

    public static com.github.nkzawa.engineio.parser.b a(String s)
    {
        return a(s, false);
    }

    private static com.github.nkzawa.engineio.parser.b a(String s, boolean flag)
    {
        Object obj;
        int j;
        try
        {
            j = Character.getNumericValue(s.charAt(0));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            j = -1;
        }
        obj = s;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_312;
        }
        s = com.github.nkzawa.utf8.a.b(s);
        com.github.nkzawa.utf8.a.a = s;
        com.github.nkzawa.utf8.a.b = s.length;
        com.github.nkzawa.utf8.a.c = 0;
        s = new ArrayList();
_L3:
        if (com.github.nkzawa.utf8.a.c > com.github.nkzawa.utf8.a.b)
        {
            throw new UTF8Exception("Invalid byte index");
        }
        if (com.github.nkzawa.utf8.a.c != com.github.nkzawa.utf8.a.b) goto _L2; else goto _L1
_L1:
        int i = -1;
_L5:
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_304;
        }
        try
        {
            s.add(Integer.valueOf(i));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return d;
        }
          goto _L3
_L2:
        int k;
        k = com.github.nkzawa.utf8.a.a[com.github.nkzawa.utf8.a.c] & 0xff;
        com.github.nkzawa.utf8.a.c++;
        i = k;
        if ((k & 0x80) == 0) goto _L5; else goto _L4
_L4:
        if ((k & 0xe0) != 192)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        k = (k & 0x1f) << 6 | com.github.nkzawa.utf8.a.a();
        i = k;
        if (k >= 128) goto _L5; else goto _L6
_L6:
        throw new UTF8Exception("Invalid continuation byte");
        if ((k & 0xf0) != 224)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        k = (k & 0xf) << 12 | com.github.nkzawa.utf8.a.a() << 6 | com.github.nkzawa.utf8.a.a();
        i = k;
        if (k >= 2048) goto _L5; else goto _L7
_L7:
        throw new UTF8Exception("Invalid continuation byte");
        if ((k & 0xf8) != 240)
        {
            break; /* Loop/switch isn't completed */
        }
        k = (k & 0xf) << 18 | com.github.nkzawa.utf8.a.a() << 12 | com.github.nkzawa.utf8.a.a() << 6 | com.github.nkzawa.utf8.a.a();
        if (k < 0x10000)
        {
            break; /* Loop/switch isn't completed */
        }
        i = k;
        if (k <= 0x10ffff) goto _L5; else goto _L8
_L8:
        throw new UTF8Exception("Invalid continuation byte");
        obj = com.github.nkzawa.utf8.a.a(com.github.nkzawa.utf8.a.a(s));
        if (j < 0 || j >= c.size())
        {
            return d;
        }
        if (((String) (obj)).length() > 1)
        {
            return new com.github.nkzawa.engineio.parser.b((String)c.get(Integer.valueOf(j)), ((String) (obj)).substring(1));
        }
        return new com.github.nkzawa.engineio.parser.b((String)c.get(Integer.valueOf(j)));
          goto _L3
    }

    public static com.github.nkzawa.engineio.parser.b a(byte abyte0[])
    {
        byte byte0 = abyte0[0];
        byte abyte1[] = new byte[abyte0.length - 1];
        System.arraycopy(abyte0, 1, abyte1, 0, abyte1.length);
        return new com.github.nkzawa.engineio.parser.b((String)c.get(Integer.valueOf(byte0)), abyte1);
    }

    public static void a(com.github.nkzawa.engineio.parser.b b1, b b2)
    {
        a(b1, false, b2);
    }

    private static void a(com.github.nkzawa.engineio.parser.b b1, boolean flag, b b2)
    {
        if (b1.b instanceof byte[])
        {
            byte abyte0[] = (byte[])b1.b;
            byte abyte1[] = new byte[abyte0.length + 1];
            abyte1[0] = ((Integer)b.get(b1.a)).byteValue();
            System.arraycopy(abyte0, 0, abyte1, 1, abyte0.length);
            b2.a(abyte1);
            return;
        }
        String s = String.valueOf(b.get(b1.a));
        Object obj = s;
        if (b1.b != null)
        {
            obj = (new StringBuilder()).append(s);
            if (flag)
            {
                b1 = com.github.nkzawa.utf8.a.a(String.valueOf(b1.b));
            } else
            {
                b1 = String.valueOf(b1.b);
            }
            obj = ((StringBuilder) (obj)).append(b1).toString();
        }
        b2.a(obj);
    }

    public static void a(String s, a a1)
    {
        if (s != null && s.length() != 0) goto _L2; else goto _L1
_L1:
        a1.a(d);
_L6:
        return;
_L2:
        Object obj;
        int i;
        int j;
        obj = new StringBuilder();
        i = 0;
        j = s.length();
_L4:
        if (i >= j)
        {
            continue; /* Loop/switch isn't completed */
        }
        char c1 = s.charAt(i);
        if (':' == c1)
        {
            break; /* Loop/switch isn't completed */
        }
        ((StringBuilder) (obj)).append(c1);
_L7:
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        int k;
        try
        {
            k = Integer.parseInt(((StringBuilder) (obj)).toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a1.a(d);
            return;
        }
        try
        {
            obj = s.substring(i + 1, i + 1 + k);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a1.a(d);
            return;
        }
        if (((String) (obj)).length() == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = a(((String) (obj)), true);
        if (d.a.equals(((com.github.nkzawa.engineio.parser.b) (obj)).a) && ((String)d.b).equals(((com.github.nkzawa.engineio.parser.b) (obj)).b))
        {
            a1.a(d);
            return;
        }
        if (!a1.a(((com.github.nkzawa.engineio.parser.b) (obj)))) goto _L6; else goto _L5
_L5:
        i += k;
        obj = new StringBuilder();
          goto _L7
        if (((StringBuilder) (obj)).length() <= 0) goto _L6; else goto _L8
_L8:
        a1.a(d);
        return;
    }

    public static void a(byte abyte0[], a a1)
    {
        ArrayList arraylist;
        boolean flag1;
        flag1 = false;
        abyte0 = ByteBuffer.wrap(abyte0);
        arraylist = new ArrayList();
_L8:
        if (abyte0.capacity() <= 0) goto _L2; else goto _L1
_L1:
        StringBuilder stringbuilder;
        boolean flag;
        int j;
        int k;
        stringbuilder = new StringBuilder();
        if ((abyte0.get(0) & 0xff) == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = 1;
_L7:
        k = abyte0.get(j) & 0xff;
        if (k == 255)
        {
            break MISSING_BLOCK_LABEL_308;
        }
        if (stringbuilder.length() <= a) goto _L4; else goto _L3
_L3:
        j = 1;
_L10:
        if (j == 0) goto _L6; else goto _L5
_L5:
        a1.a(d);
_L9:
        return;
_L4:
        stringbuilder.append(k);
        j++;
          goto _L7
_L6:
        abyte0.position(stringbuilder.length() + 1);
        abyte0 = abyte0.slice();
        j = Integer.parseInt(stringbuilder.toString());
        abyte0.position(1);
        abyte0.limit(j + 1);
        byte abyte1[] = new byte[abyte0.remaining()];
        abyte0.get(abyte1);
        if (flag)
        {
            arraylist.add(b(abyte1));
        } else
        {
            arraylist.add(abyte1);
        }
        abyte0.clear();
        abyte0.position(j + 1);
        abyte0 = abyte0.slice();
          goto _L8
_L2:
        j = arraylist.size();
        int i = ((flag1) ? 1 : 0);
        while (i < j) 
        {
            abyte0 = ((byte []) (arraylist.get(i)));
            if (abyte0 instanceof String)
            {
                a1.a(a((String)abyte0, true));
            } else
            if (abyte0 instanceof byte[])
            {
                a1.a(a((byte[])(byte[])abyte0));
            }
            i++;
        }
          goto _L9
        j = 0;
          goto _L10
    }

    public static void a(com.github.nkzawa.engineio.parser.b ab[], b b1)
    {
        int i = 0;
        if (ab.length == 0)
        {
            b1.a(new byte[0]);
            return;
        }
        ArrayList arraylist = new ArrayList(ab.length);
        for (int j = ab.length; i < j; i++)
        {
            a(ab[i], true, new b(arraylist) {

                final ArrayList a;

                public final void a(Object obj)
                {
                    if (obj instanceof String)
                    {
                        String s = String.valueOf(((String)obj).length());
                        byte abyte0[] = new byte[s.length() + 2];
                        abyte0[0] = 0;
                        for (int k = 0; k < s.length(); k++)
                        {
                            abyte0[k + 1] = (byte)Character.getNumericValue(s.charAt(k));
                        }

                        abyte0[abyte0.length - 1] = -1;
                        a.add(com.github.nkzawa.engineio.parser.a.a(new byte[][] {
                            abyte0, c.b((String)obj)
                        }));
                        return;
                    }
                    String s1 = String.valueOf(((byte[])(byte[])obj).length);
                    byte abyte1[] = new byte[s1.length() + 2];
                    abyte1[0] = 1;
                    for (int l = 0; l < s1.length(); l++)
                    {
                        abyte1[l + 1] = (byte)Character.getNumericValue(s1.charAt(l));
                    }

                    abyte1[abyte1.length - 1] = -1;
                    a.add(com.github.nkzawa.engineio.parser.a.a(new byte[][] {
                        abyte1, (byte[])(byte[])obj
                    }));
                }

            
            {
                a = arraylist;
                super();
            }
            });
        }

        b1.a(com.github.nkzawa.engineio.parser.a.a((byte[][])arraylist.toArray(new byte[arraylist.size()][])));
    }

    private static String b(byte abyte0[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        int j = abyte0.length;
        for (int i = 0; i < j; i++)
        {
            stringbuilder.appendCodePoint(abyte0[i] & 0xff);
        }

        return stringbuilder.toString();
    }

    static byte[] b(String s)
    {
        int j = s.length();
        byte abyte0[] = new byte[j];
        for (int i = 0; i < j; i++)
        {
            abyte0[i] = (byte)Character.codePointAt(s, i);
        }

        return abyte0;
    }

    static 
    {
        b = new Parser._cls1();
        c = new HashMap();
        java.util.Map.Entry entry;
        for (Iterator iterator = b.entrySet().iterator(); iterator.hasNext(); c.put(entry.getValue(), entry.getKey()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

    }

    // Unreferenced inner class com/github/nkzawa/engineio/parser/Parser$1

/* anonymous class */
    static final class Parser._cls1 extends HashMap
    {

            
            {
                put("open", Integer.valueOf(0));
                put("close", Integer.valueOf(1));
                put("ping", Integer.valueOf(2));
                put("pong", Integer.valueOf(3));
                put("message", Integer.valueOf(4));
                put("upgrade", Integer.valueOf(5));
                put("noop", Integer.valueOf(6));
            }
    }

}
