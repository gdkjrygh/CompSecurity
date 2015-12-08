// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.b.a.a;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.b.a.a;
import org.b.a.c;

// Referenced classes of package org.b.a.a:
//            d, e, c, a

public final class b
{

    private LinkedList a;
    private d b;
    private e c;
    private int d;

    public b()
    {
        b = new d();
        c = null;
        d = 0;
    }

    private static int a(LinkedList linkedlist)
    {
        if (linkedlist.size() == 0)
        {
            return -1;
        } else
        {
            return ((Integer)linkedlist.getFirst()).intValue();
        }
    }

    private Object a(Reader reader, org.b.a.a.a a1)
    {
        LinkedList linkedlist;
        b.a(reader);
        c = null;
        d = 0;
        a = null;
        reader = new LinkedList();
        linkedlist = new LinkedList();
_L72:
        c = b.b();
        if (c == null)
        {
            c = new e(-1, null);
        }
        d;
        JVM INSTR tableswitch -1 4: default 987
    //                   -1 932
    //                   0 143
    //                   1 284
    //                   2 320
    //                   3 711
    //                   4 467;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L14:
        if (d == -1)
        {
            throw new org.b.a.a.c(b.a(), 1, c);
        }
          goto _L8
_L3:
        c.a;
        JVM INSTR tableswitch 0 3: default 990
    //                   0 188
    //                   1 222
    //                   2 180
    //                   3 253;
           goto _L9 _L10 _L11 _L9 _L12
_L16:
        if (true) goto _L14; else goto _L13
_L13:
_L18:
        if (true) goto _L16; else goto _L15
_L15:
_L20:
        if (true) goto _L18; else goto _L17
_L17:
_L22:
        if (true) goto _L20; else goto _L19
_L19:
_L24:
        if (true) goto _L22; else goto _L21
_L21:
_L26:
        if (true) goto _L24; else goto _L23
_L23:
_L28:
        if (true) goto _L26; else goto _L25
_L25:
_L30:
        if (true) goto _L28; else goto _L27
_L27:
_L32:
        if (true) goto _L30; else goto _L29
_L29:
_L34:
        if (true) goto _L32; else goto _L31
_L31:
_L36:
        if (true) goto _L34; else goto _L33
_L33:
_L38:
        if (true) goto _L36; else goto _L35
_L35:
_L40:
        if (true) goto _L38; else goto _L37
_L37:
_L42:
        if (true) goto _L40; else goto _L39
_L39:
_L44:
        if (true) goto _L42; else goto _L41
_L41:
_L46:
        if (true) goto _L44; else goto _L43
_L43:
_L48:
        if (true) goto _L46; else goto _L45
_L45:
_L50:
        if (true) goto _L48; else goto _L47
_L47:
_L1:
        if (true) goto _L50; else goto _L49
_L49:
_L9:
        d = -1;
          goto _L14
_L10:
        try
        {
            d = 1;
            reader.addFirst(new Integer(d));
            linkedlist.addFirst(c.b);
        }
        // Misplaced declaration of an exception variable
        catch (Reader reader)
        {
            throw reader;
        }
          goto _L14
_L11:
        d = 2;
        reader.addFirst(new Integer(d));
        linkedlist.addFirst(a(a1));
          goto _L14
_L12:
        d = 3;
        reader.addFirst(new Integer(d));
        linkedlist.addFirst(b(a1));
          goto _L14
_L4:
        if (c.a == -1)
        {
            return linkedlist.removeFirst();
        } else
        {
            throw new org.b.a.a.c(b.a(), 1, c);
        }
_L5:
        c.a;
        JVM INSTR tableswitch 0 5: default 993
    //                   0 372
    //                   1 364
    //                   2 430
    //                   3 364
    //                   4 364
    //                   5 112;
           goto _L51 _L52 _L51 _L53 _L51 _L51 _L54
_L51:
        d = -1;
          goto _L54
_L52:
        if (!(c.b instanceof String)) goto _L56; else goto _L55
_L55:
        linkedlist.addFirst((String)c.b);
        d = 4;
        reader.addFirst(new Integer(d));
          goto _L54
_L56:
        d = -1;
          goto _L54
_L53:
        if (linkedlist.size() <= 1) goto _L58; else goto _L57
_L57:
        reader.removeFirst();
        linkedlist.removeFirst();
        d = a(((LinkedList) (reader)));
          goto _L54
_L58:
        d = 1;
          goto _L54
_L7:
        c.a;
        JVM INSTR tableswitch 0 6: default 996
    //                   0 524
    //                   1 641
    //                   2 516
    //                   3 571
    //                   4 516
    //                   5 516
    //                   6 112;
           goto _L59 _L60 _L61 _L59 _L62 _L59 _L59 _L54
_L54:
        if (true) goto _L14; else goto _L63
_L63:
_L59:
        d = -1;
          goto _L14
_L60:
        reader.removeFirst();
        String s = (String)linkedlist.removeFirst();
        ((Map)linkedlist.getFirst()).put(s, c.b);
        d = a(((LinkedList) (reader)));
          goto _L14
_L62:
        reader.removeFirst();
        String s1 = (String)linkedlist.removeFirst();
        Map map = (Map)linkedlist.getFirst();
        List list3 = b(a1);
        map.put(s1, list3);
        d = 3;
        reader.addFirst(new Integer(d));
        linkedlist.addFirst(list3);
          goto _L14
_L61:
        reader.removeFirst();
        String s2 = (String)linkedlist.removeFirst();
        Map map1 = (Map)linkedlist.getFirst();
        Map map3 = a(a1);
        map1.put(s2, map3);
        d = 2;
        reader.addFirst(new Integer(d));
        linkedlist.addFirst(map3);
          goto _L14
_L6:
        c.a;
        JVM INSTR tableswitch 0 5: default 999
    //                   0 764
    //                   1 824
    //                   2 756
    //                   3 878
    //                   4 787
    //                   5 112;
           goto _L64 _L65 _L66 _L64 _L67 _L68 _L14
_L64:
        d = -1;
          goto _L14
_L65:
        ((List)linkedlist.getFirst()).add(c.b);
          goto _L14
_L68:
        if (linkedlist.size() <= 1) goto _L70; else goto _L69
_L69:
        reader.removeFirst();
        linkedlist.removeFirst();
        d = a(((LinkedList) (reader)));
          goto _L14
_L70:
        d = 1;
          goto _L14
_L66:
        List list = (List)linkedlist.getFirst();
        Map map2 = a(a1);
        list.add(map2);
        d = 2;
        reader.addFirst(new Integer(d));
        linkedlist.addFirst(map2);
          goto _L14
_L67:
        List list1 = (List)linkedlist.getFirst();
        List list2 = b(a1);
        list1.add(list2);
        d = 3;
        reader.addFirst(new Integer(d));
        linkedlist.addFirst(list2);
          goto _L14
_L2:
        throw new org.b.a.a.c(b.a(), 1, c);
_L8:
        int i = c.a;
        if (i == -1)
        {
            throw new org.b.a.a.c(b.a(), 1, c);
        }
        if (true) goto _L72; else goto _L71
_L71:
    }

    private static Map a(org.b.a.a.a a1)
    {
        if (a1 == null)
        {
            return new c();
        } else
        {
            return a1.b();
        }
    }

    private static List b(org.b.a.a.a a1)
    {
        if (a1 == null)
        {
            return new a();
        } else
        {
            return a1.a();
        }
    }

    public final Object a(String s, org.b.a.a.a a1)
    {
        s = new StringReader(s);
        try
        {
            s = ((String) (a(((Reader) (s)), a1)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new org.b.a.a.c(-1, 2, s);
        }
        return s;
    }
}
