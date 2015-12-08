// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.HashMap;

// Referenced classes of package b.a:
//            ou

public final class ot
    implements ou, Comparable
{

    public static final ot A = a("Ljava/lang/Void;");
    public static final ot B;
    public static final ot C;
    public static final ot D;
    public static final ot E;
    public static final ot F;
    public static final ot G;
    public static final ot H;
    public static final ot I;
    public static final ot J;
    private static final HashMap K = new HashMap(500);
    public static final ot a;
    public static final ot b;
    public static final ot c;
    public static final ot d;
    public static final ot e;
    public static final ot f;
    public static final ot g;
    public static final ot h;
    public static final ot i = new ot("V", 0, (byte)0);
    public static final ot j = new ot("<null>", 9, (byte)0);
    public static final ot k = new ot("<addr>", 10, (byte)0);
    public static final ot l = a("Ljava/lang/annotation/Annotation;");
    public static final ot m = a("Ljava/lang/Class;");
    public static final ot n = a("Ljava/lang/Cloneable;");
    public static final ot o;
    public static final ot p = a("Ljava/io/Serializable;");
    public static final ot q = a("Ljava/lang/String;");
    public static final ot r = a("Ljava/lang/Throwable;");
    public static final ot s = a("Ljava/lang/Boolean;");
    public static final ot t = a("Ljava/lang/Byte;");
    public static final ot u = a("Ljava/lang/Character;");
    public static final ot v = a("Ljava/lang/Double;");
    public static final ot w = a("Ljava/lang/Float;");
    public static final ot x = a("Ljava/lang/Integer;");
    public static final ot y = a("Ljava/lang/Long;");
    public static final ot z = a("Ljava/lang/Short;");
    private final String L;
    private final int M;
    private final int N;
    private String O;
    private ot P;
    private ot Q;
    private ot R;

    private ot(String s1, int i1)
    {
        if (s1 == null)
        {
            throw new NullPointerException("descriptor == null");
        }
        if (i1 < 0 || i1 >= 11)
        {
            throw new IllegalArgumentException("bad basicType");
        } else
        {
            L = s1;
            M = i1;
            N = -1;
            P = null;
            Q = null;
            R = null;
            return;
        }
    }

    private ot(String s1, int i1, byte byte0)
    {
        this(s1, i1);
    }

    public static ot a(String s1)
    {
        int i1;
        int j1;
        ot ot1;
        synchronized (K)
        {
            ot1 = (ot)K.get(s1);
        }
        if (ot1 != null)
        {
            return ot1;
        }
        try
        {
            i1 = s1.charAt(0);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new IllegalArgumentException("descriptor is empty");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new NullPointerException("descriptor == null");
        }
        if (i1 == '[')
        {
            return a(s1.substring(1)).k();
        }
        j1 = s1.length();
        if (i1 != 'L' || s1.charAt(j1 - 1) != ';')
        {
            throw new IllegalArgumentException((new StringBuilder("bad descriptor: ")).append(s1).toString());
        }
        j1--;
        i1 = 1;
_L6:
        if (i1 >= j1) goto _L2; else goto _L1
_L1:
        s1.charAt(i1);
        JVM INSTR lookupswitch 6: default 204
    //                   40: 211
    //                   41: 211
    //                   46: 211
    //                   47: 235
    //                   59: 211
    //                   91: 211;
           goto _L3 _L4 _L4 _L4 _L5 _L4 _L4
_L3:
        i1++;
          goto _L6
_L4:
        throw new IllegalArgumentException((new StringBuilder("bad descriptor: ")).append(s1).toString());
_L5:
        if (i1 != 1 && i1 != j1 && s1.charAt(i1 - 1) != '/') goto _L3; else goto _L7
_L7:
        throw new IllegalArgumentException((new StringBuilder("bad descriptor: ")).append(s1).toString());
_L2:
        return b(new ot(s1, 9, (byte)0));
    }

    private static ot b(ot ot1)
    {
        HashMap hashmap = K;
        hashmap;
        JVM INSTR monitorenter ;
        String s1;
        ot ot2;
        s1 = ot1.L;
        ot2 = (ot)K.get(s1);
        if (ot2 == null)
        {
            break MISSING_BLOCK_LABEL_30;
        }
        hashmap;
        JVM INSTR monitorexit ;
        return ot2;
        K.put(s1, ot1);
        hashmap;
        JVM INSTR monitorexit ;
        return ot1;
        ot1;
        throw ot1;
    }

    public static ot b(String s1)
    {
label0:
        {
            try
            {
                if (!s1.equals("V"))
                {
                    break label0;
                }
                s1 = i;
            }
            // Misplaced declaration of an exception variable
            catch (String s1)
            {
                throw new NullPointerException("descriptor == null");
            }
            return s1;
        }
        return a(s1);
    }

    private ot k()
    {
        if (P == null)
        {
            P = b(new ot((new StringBuilder("[")).append(L).toString(), 9, (byte)0));
        }
        return P;
    }

    public final int a(ot ot1)
    {
        return L.compareTo(ot1.L);
    }

    public final ot b()
    {
        return this;
    }

    public final int c()
    {
        return M;
    }

    public final int compareTo(Object obj)
    {
        return a((ot)obj);
    }

    public final int d()
    {
        switch (M)
        {
        case 4: // '\004'
        case 5: // '\005'
        case 7: // '\007'
        default:
            return M;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 6: // '\006'
        case 8: // '\b'
            return 6;
        }
    }

    public final String e()
    {
        return L;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof ot))
        {
            return false;
        } else
        {
            return L.equals(((ot)obj).L);
        }
    }

    public final int f()
    {
        switch (M)
        {
        case 5: // '\005'
        case 6: // '\006'
        default:
            return 1;

        case 4: // '\004'
        case 7: // '\007'
            return 2;
        }
    }

    public final boolean g()
    {
        switch (M)
        {
        case 5: // '\005'
        case 6: // '\006'
        default:
            return false;

        case 4: // '\004'
        case 7: // '\007'
            return true;
        }
    }

    public final boolean h()
    {
        switch (M)
        {
        case 4: // '\004'
        case 5: // '\005'
        case 7: // '\007'
        default:
            return false;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 6: // '\006'
        case 8: // '\b'
            return true;
        }
    }

    public final String h_()
    {
        switch (M)
        {
        default:
            return L;

        case 0: // '\0'
            return "void";

        case 1: // '\001'
            return "boolean";

        case 2: // '\002'
            return "byte";

        case 3: // '\003'
            return "char";

        case 4: // '\004'
            return "double";

        case 5: // '\005'
            return "float";

        case 6: // '\006'
            return "int";

        case 7: // '\007'
            return "long";

        case 8: // '\b'
            return "short";

        case 9: // '\t'
            break;
        }
        boolean flag;
        if (L.charAt(0) == '[')
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return (new StringBuilder()).append(j().h_()).append("[]").toString();
        }
        if (O == null)
        {
            if (!i())
            {
                throw new IllegalArgumentException((new StringBuilder("not an object type: ")).append(L).toString());
            }
            if (L.charAt(0) == '[')
            {
                O = L;
            } else
            {
                O = L.substring(1, L.length() - 1);
            }
        }
        return O.replace("/", ".");
    }

    public final int hashCode()
    {
        return L.hashCode();
    }

    public final boolean i()
    {
        return M == 9;
    }

    public final ot j()
    {
        if (Q == null)
        {
            if (L.charAt(0) != '[')
            {
                throw new IllegalArgumentException((new StringBuilder("not an array type: ")).append(L).toString());
            }
            Q = a(L.substring(1));
        }
        return Q;
    }

    public final String toString()
    {
        return L;
    }

    static 
    {
        a = new ot("Z", 1, (byte)0);
        b = new ot("B", 2, (byte)0);
        c = new ot("C", 3, (byte)0);
        d = new ot("D", 4, (byte)0);
        e = new ot("F", 5, (byte)0);
        f = new ot("I", 6, (byte)0);
        g = new ot("J", 7, (byte)0);
        h = new ot("S", 8, (byte)0);
        b(a);
        b(b);
        b(c);
        b(d);
        b(e);
        b(f);
        b(g);
        b(h);
        o = a("Ljava/lang/Object;");
        B = a.k();
        C = b.k();
        D = c.k();
        E = d.k();
        F = e.k();
        G = f.k();
        H = g.k();
        I = o.k();
        J = h.k();
    }
}
