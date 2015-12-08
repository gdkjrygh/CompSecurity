// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.c.b:
//            b, bd, f, bh, 
//            bg, by, bc, au, 
//            bu, h, bx, g, 
//            aq

public abstract class com.c.b.a extends b
    implements bd
{
    public static abstract class a extends b.a
        implements bd.a
    {

        protected static bx b(bd bd1)
        {
            return new bx(bh.a(bd1));
        }

        private a c(f f1, aq aq)
        {
            return (a)super.a(f1, aq);
        }

        public a a(bd bd1)
        {
            if (bd1.e() != e())
            {
                throw new IllegalArgumentException("mergeFrom(Message) can only merge messages of the same type.");
            }
            for (Iterator iterator = bd1.d_().entrySet().iterator(); iterator.hasNext();)
            {
                Object obj = (java.util.Map.Entry)iterator.next();
                ak.f f1 = (ak.f)((java.util.Map.Entry) (obj)).getKey();
                if (f1.o())
                {
                    obj = ((List)((java.util.Map.Entry) (obj)).getValue()).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        a(f1, ((Iterator) (obj)).next());
                    }
                } else
                if (f1.f() == ak.f.a.i)
                {
                    bd bd2 = (bd)b(f1);
                    if (bd2 == bd2.w())
                    {
                        b(f1, ((java.util.Map.Entry) (obj)).getValue());
                    } else
                    {
                        b(f1, bd2.u().c(bd2).c((bd)((java.util.Map.Entry) (obj)).getValue()).i());
                    }
                } else
                {
                    b(f1, ((java.util.Map.Entry) (obj)).getValue());
                }
            }

            a(bd1.f());
            return this;
        }

        public a a(by by1)
        {
            b(by.a(f()).a(by1).b());
            return this;
        }

        public a a(g g1, aq aq)
        {
            by.a a1 = by.a(f());
            bh.a a2;
            int i;
            do
            {
                i = g1.a();
                if (i == 0)
                {
                    break;
                }
                a2 = new bh.a(this);
            } while (bh.a(g1, a1, aq, e(), a2, i));
            b(a1.b());
            return this;
        }

        public final b.a a(f f1, aq aq)
        {
            return c(f1, aq);
        }

        public abstract a b();

        public b.a b(g g1, aq aq)
        {
            return a(g1, aq);
        }

        public final bd.a b(f f1, aq aq)
        {
            return c(f1, aq);
        }

        public b.a c()
        {
            return b();
        }

        public bd.a c(bd bd1)
        {
            return a(bd1);
        }

        public be.a c(g g1, aq aq)
        {
            return a(g1, aq);
        }

        public Object clone()
        {
            return b();
        }

        public String toString()
        {
            return bu.a(this);
        }

        public a()
        {
        }
    }


    protected int a;

    public com.c.b.a()
    {
        a = -1;
    }

    private static f a(Object obj)
    {
        if (obj instanceof byte[])
        {
            return f.a((byte[])obj);
        } else
        {
            return (f)obj;
        }
    }

    private static Map a(List list)
    {
        if (list.isEmpty())
        {
            return Collections.emptyMap();
        }
        HashMap hashmap = new HashMap();
        list = list.iterator();
        bd bd1 = (bd)list.next();
        Object obj = bd1.e();
        ak.f f1 = ((ak.a) (obj)).a("key");
        obj = ((ak.a) (obj)).a("value");
        hashmap.put(bd1.b(f1), bd1.b(((ak.f) (obj))));
        bd bd2;
        for (; list.hasNext(); hashmap.put(bd2.b(f1), bd2.b(((ak.f) (obj)))))
        {
            bd2 = (bd)list.next();
        }

        return hashmap;
    }

    private static boolean a(Object obj, Object obj1)
    {
        if ((obj instanceof byte[]) && (obj1 instanceof byte[]))
        {
            return Arrays.equals((byte[])obj, (byte[])obj1);
        } else
        {
            return a(obj).equals(a(obj1));
        }
    }

    public void a(h h)
    {
        bh.a(this, d_(), h);
    }

    public boolean a()
    {
        Iterator iterator1;
        for (Iterator iterator = e().f().iterator(); iterator.hasNext();)
        {
            ak.f f1 = (ak.f)iterator.next();
            if (f1.m() && !a(f1))
            {
                return false;
            }
        }

        iterator1 = d_().entrySet().iterator();
_L2:
        Object obj;
        ak.f f2;
        do
        {
            if (!iterator1.hasNext())
            {
                break MISSING_BLOCK_LABEL_178;
            }
            obj = (java.util.Map.Entry)iterator1.next();
            f2 = (ak.f)((java.util.Map.Entry) (obj)).getKey();
        } while (f2.f() != ak.f.a.i);
        if (!f2.o())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((List)((java.util.Map.Entry) (obj)).getValue()).iterator();
_L4:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        if (((bd)((Iterator) (obj)).next()).a()) goto _L4; else goto _L3
_L3:
        return false;
        if (((bd)((java.util.Map.Entry) (obj)).getValue()).a()) goto _L2; else goto _L5
_L5:
        return false;
        return true;
    }

    public int b()
    {
        int i = a;
        if (i != -1)
        {
            return i;
        } else
        {
            a = bh.a(this, d_());
            return a;
        }
    }

    final bx c()
    {
        return a.b(this);
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        Map map;
        Map map1;
        int i;
        flag = flag1;
        if (!(obj instanceof bd))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (bd)obj;
        flag = flag1;
        if (e() != ((bd) (obj)).e())
        {
            continue; /* Loop/switch isn't completed */
        }
        map = d_();
        map1 = ((bd) (obj)).d_();
        if (map.size() == map1.size())
        {
            break; /* Loop/switch isn't completed */
        }
        i = 0;
_L5:
        flag = flag1;
        if (i != 0)
        {
            flag = flag1;
            if (f().equals(((bd) (obj)).f()))
            {
                return true;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        Iterator iterator = map.keySet().iterator();
_L7:
        Object obj1;
        Object obj2;
        Object obj3;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_358;
        }
        obj2 = (ak.f)iterator.next();
        if (!map1.containsKey(obj2))
        {
            i = 0;
        } else
        {
label0:
            {
                obj3 = map.get(obj2);
                obj1 = map1.get(obj2);
                if (((ak.f) (obj2)).h() != ak.f.b.l)
                {
                    break MISSING_BLOCK_LABEL_306;
                }
                if (!((ak.f) (obj2)).o())
                {
                    continue; /* Loop/switch isn't completed */
                }
                obj2 = (List)obj3;
                obj1 = (List)obj1;
                if (((List) (obj2)).size() == ((List) (obj1)).size())
                {
                    break label0;
                }
                i = 0;
            }
        }
          goto _L5
        i = 0;
_L8:
        if (i >= ((List) (obj2)).size()) goto _L7; else goto _L6
_L6:
label1:
        {
            if (a(((List) (obj2)).get(i), ((List) (obj1)).get(i)))
            {
                break label1;
            }
            i = 0;
        }
          goto _L5
        i++;
          goto _L8
        if (a(obj3, obj1)) goto _L7; else goto _L9
_L9:
        i = 0;
          goto _L5
        if (!((ak.f) (obj2)).l())
        {
            continue; /* Loop/switch isn't completed */
        }
        if (bc.a(a((List)obj3), a((List)obj1))) goto _L7; else goto _L10
_L10:
        i = 0;
          goto _L5
        if (obj3.equals(obj1)) goto _L7; else goto _L11
_L11:
        i = 0;
          goto _L5
        i = 1;
          goto _L5
    }

    public int hashCode()
    {
        int j = b;
        int i = j;
        if (j == 0)
        {
            i = e().hashCode();
            Iterator iterator = d_().entrySet().iterator();
            i += 779;
            while (iterator.hasNext()) 
            {
                Object obj = (java.util.Map.Entry)iterator.next();
                ak.f f1 = (ak.f)((java.util.Map.Entry) (obj)).getKey();
                obj = ((java.util.Map.Entry) (obj)).getValue();
                i = i * 37 + f1.e();
                if (f1.l())
                {
                    i = bc.a(a((List)obj)) + i * 53;
                } else
                if (f1.h() != ak.f.b.n)
                {
                    i = obj.hashCode() + i * 53;
                } else
                if (f1.o())
                {
                    i = au.a((List)obj) + i * 53;
                } else
                {
                    i = au.a((au.a)obj) + i * 53;
                }
            }
            i = i * 29 + f().hashCode();
            b = i;
        }
        return i;
    }

    public final String toString()
    {
        return bu.a(this);
    }
}
