// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ak;

import com.google.android.m4b.maps.n.b;
import java.io.DataInput;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.m4b.maps.ak:
//            d, b, c

public abstract class com.google.android.m4b.maps.ak.a
{
    public static class a extends com.google.android.m4b.maps.ak.a
    {

        protected final long b;
        protected final long c;
        protected final long d;

        public final String a()
        {
            String s = String.valueOf(Long.toHexString(c));
            String s1 = String.valueOf(Long.toHexString(d));
            return (new StringBuilder(String.valueOf(s).length() + 5 + String.valueOf(s1).length())).append("0x").append(s).append(":0x").append(s1).toString();
        }

        public final boolean a(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof a)
            {
                obj = (a)obj;
                flag = flag1;
                if (((a) (obj)).c == c)
                {
                    flag = flag1;
                    if (((a) (obj)).d == d)
                    {
                        flag = flag1;
                        if (((a) (obj)).b == b)
                        {
                            flag = true;
                        }
                    }
                }
            }
            return flag;
        }

        public final com.google.android.m4b.maps.an.a c()
        {
            com.google.android.m4b.maps.an.a a1 = com.google.android.m4b.maps.an.a.b();
            long l = c;
            a1.b();
            com.google.android.m4b.maps.an.a.a((com.google.android.m4b.maps.an.a)a1.a, l);
            l = d;
            a1.b();
            com.google.android.m4b.maps.an.a.b((com.google.android.m4b.maps.an.a)a1.a, l);
            return (com.google.android.m4b.maps.an.a)a1.e();
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof b)
            {
                return ((b)obj).b == b;
            } else
            {
                return a(obj);
            }
        }

        public int hashCode()
        {
            return (int)(b ^ b >>> 32);
        }

        public String toString()
        {
            return a();
        }

        a(long l)
        {
            this(0L, l);
        }

        a(long l, long l1)
        {
            long l2 = l >>> 16;
            l2 = (l2 >>> 44 ^ l2 << 4) & 0xffffffffffffL ^ (l << 32 & 0xffffffffffffL | l1 >>> 32);
            b = (l2 >>> 44 ^ l2 << 4) & 0xffffffffffffL ^ 0xffffffffL & l1;
            c = l;
            d = l1;
        }
    }

    public static final class b extends com.google.android.m4b.maps.ak.a
    {

        protected final long b;

        public final String a()
        {
            return "";
        }

        public final boolean a(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof b)
            {
                flag = flag1;
                if (((b)obj).b == b)
                {
                    flag = true;
                }
            }
            return flag;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof a)
            {
                return ((a)obj).b == b;
            } else
            {
                return a(obj);
            }
        }

        public final int hashCode()
        {
            return (int)(b ^ b >>> 32);
        }

        public final String toString()
        {
            long l = b;
            return (new StringBuilder(27)).append("[hash:").append(l).append("]").toString();
        }

        b(long l)
        {
            b = l;
        }
    }

    public static final class c extends a
    {

        public static c b(String s)
        {
            s = com.google.android.m4b.maps.ak.a.a(s);
            if (!(s instanceof a))
            {
                break MISSING_BLOCK_LABEL_37;
            }
            s = new c(((a)s).c, ((a)s).d);
            return s;
            s;
            return null;
        }

        public final String d()
        {
            return Long.toHexString(d);
        }

        public final boolean equals(Object obj)
        {
            if (this != obj) goto _L2; else goto _L1
_L1:
            return true;
_L2:
            if (!(obj instanceof c))
            {
                break; /* Loop/switch isn't completed */
            }
            if (d != ((c)obj).d)
            {
                return false;
            }
            if (true) goto _L1; else goto _L3
_L3:
            if (obj instanceof com.google.android.m4b.maps.ak.c)
            {
                if (d != ((com.google.android.m4b.maps.ak.c)obj).a.d)
                {
                    return false;
                }
            } else
            {
                return false;
            }
            if (true) goto _L1; else goto _L4
_L4:
        }

        public final int hashCode()
        {
            return (int)(d ^ d >>> 32);
        }

        public c(long l, long l1)
        {
            super(l, l1);
        }
    }

    public static final class d extends com.google.android.m4b.maps.ak.a
    {

        private com.google.android.m4b.maps.ak.b b;
        private int c;

        public final String a()
        {
            int i = b.a;
            int j = b.b;
            String s = String.valueOf(Integer.toString(c));
            return (new StringBuilder(String.valueOf(s).length() + 24)).append(i).append("|").append(j).append("|").append(s).toString();
        }

        public final boolean a(Object obj)
        {
            return equals(obj);
        }

        public final boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof d)
            {
                obj = (d)obj;
                flag = flag1;
                if (((d) (obj)).b.equals(b))
                {
                    flag = flag1;
                    if (((d) (obj)).c == c)
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public final int hashCode()
        {
            return a().hashCode();
        }

        d(com.google.android.m4b.maps.ak.b b1, int i)
        {
            b = b1;
            c = i;
        }
    }


    public static final com.google.android.m4b.maps.ak.a a = new a(0L, 0L);

    public com.google.android.m4b.maps.ak.a()
    {
    }

    public static a a(DataInput datainput)
    {
        return new a(datainput.readLong(), datainput.readLong());
    }

    public static com.google.android.m4b.maps.ak.a a(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("null feature id");
        }
        String as[] = s.split(":");
        String as1[] = s.split("\\|");
        if (as.length == 2)
        {
            if (!as[0].startsWith("0x") || !as[1].startsWith("0x"))
            {
                s = String.valueOf(s);
                if (s.length() != 0)
                {
                    s = "malformed feature id ".concat(s);
                } else
                {
                    s = new String("malformed feature id ");
                }
                throw new IllegalArgumentException(s);
            } else
            {
                return new a(com.google.android.m4b.maps.ak.d.a(as[0].substring(2)), com.google.android.m4b.maps.ak.d.a(as[1].substring(2)));
            }
        }
        if (as1.length == 3)
        {
            int i = Integer.parseInt(as1[0]);
            int j = Integer.parseInt(as1[1]);
            int k = Integer.parseInt(as1[2]);
            return new d(new com.google.android.m4b.maps.ak.b(i, j), k);
        }
        if (s.startsWith("0x"))
        {
            return new b(com.google.android.m4b.maps.ak.d.a(s.substring(2)));
        }
        if (Pattern.matches("[0-9]{1,20}", s))
        {
            return new a(com.google.android.m4b.maps.n.b.a(s));
        }
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "malformed feature id ".concat(s);
        } else
        {
            s = new String("malformed feature id ");
        }
        throw new IllegalArgumentException(s);
    }

    public static int b()
    {
        return 40;
    }

    public static b b(DataInput datainput)
    {
        return new b(((long)datainput.readShort() & 65535L) << 32 | (long)datainput.readInt() & 0xffffffffL);
    }

    public abstract String a();

    boolean a(Object obj)
    {
        return false;
    }

}
