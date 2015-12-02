// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;

public final class blg extends AbstractMap
    implements Serializable
{

    static final boolean f;
    private static final Comparator g = new _cls1();
    Comparator a;
    blk b;
    int c;
    int d;
    final blk e;
    private blh h;
    private bli i;

    public blg()
    {
        this(g);
    }

    private blg(Comparator comparator)
    {
        c = 0;
        d = 0;
        e = new blk();
        if (comparator == null)
        {
            comparator = g;
        }
        a = comparator;
    }

    private blk a(Object obj, boolean flag)
    {
        blk blk1;
        blk blk2;
        Object obj1;
        Comparator comparator;
        int j;
        obj1 = null;
        comparator = a;
        blk1 = b;
        if (blk1 == null)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        Comparable comparable;
        if (comparator == g)
        {
            comparable = (Comparable)obj;
        } else
        {
            comparable = null;
        }
_L3:
        if (comparable != null)
        {
            j = comparable.compareTo(blk1.f);
        } else
        {
            j = comparator.compare(obj, blk1.f);
        }
        if (j != 0) goto _L2; else goto _L1
_L1:
        blk2 = blk1;
_L5:
        return blk2;
_L2:
label0:
        {
            if (j < 0)
            {
                blk2 = blk1.b;
            } else
            {
                blk2 = blk1.c;
            }
            if (blk2 == null)
            {
                break label0;
            }
            blk1 = blk2;
        }
          goto _L3
        if (!flag) goto _L5; else goto _L4
_L4:
        blk blk3 = e;
        if (blk1 == null)
        {
            if (comparator == g && !(obj instanceof Comparable))
            {
                throw new ClassCastException((new StringBuilder()).append(obj.getClass().getName()).append(" is not Comparable").toString());
            }
            obj = new blk(blk1, obj, blk3, blk3.e);
            b = ((blk) (obj));
        } else
        {
            obj = new blk(blk1, obj, blk3, blk3.e);
            if (j < 0)
            {
                blk1.b = ((blk) (obj));
            } else
            {
                blk1.c = ((blk) (obj));
            }
            b(blk1, true);
        }
        c = c + 1;
        d = d + 1;
        return ((blk) (obj));
        j = 0;
        blk2 = obj1;
        continue; /* Loop/switch isn't completed */
    }

    private void a(blk blk1)
    {
        boolean flag = false;
        blk blk2 = blk1.b;
        blk blk3 = blk1.c;
        blk blk4 = blk3.b;
        blk blk5 = blk3.c;
        blk1.c = blk4;
        if (blk4 != null)
        {
            blk4.a = blk1;
        }
        a(blk1, blk3);
        blk3.b = blk1;
        blk1.a = blk3;
        int j;
        int k;
        if (blk2 != null)
        {
            j = blk2.h;
        } else
        {
            j = 0;
        }
        if (blk4 != null)
        {
            k = blk4.h;
        } else
        {
            k = 0;
        }
        blk1.h = Math.max(j, k) + 1;
        k = blk1.h;
        j = ((flag) ? 1 : 0);
        if (blk5 != null)
        {
            j = blk5.h;
        }
        blk3.h = Math.max(k, j) + 1;
    }

    private void a(blk blk1, blk blk2)
    {
        blk blk3 = blk1.a;
        blk1.a = null;
        if (blk2 != null)
        {
            blk2.a = blk3;
        }
        if (blk3 != null)
        {
            if (blk3.b == blk1)
            {
                blk3.b = blk2;
                return;
            }
            if (!f && blk3.c != blk1)
            {
                throw new AssertionError();
            } else
            {
                blk3.c = blk2;
                return;
            }
        } else
        {
            b = blk2;
            return;
        }
    }

    private static boolean a(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    private blk b(Object obj)
    {
        blk blk1 = null;
        if (obj != null)
        {
            try
            {
                blk1 = a(obj, false);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return null;
            }
        }
        return blk1;
    }

    private void b(blk blk1)
    {
        boolean flag = false;
        blk blk2 = blk1.b;
        blk blk3 = blk1.c;
        blk blk4 = blk2.b;
        blk blk5 = blk2.c;
        blk1.b = blk5;
        if (blk5 != null)
        {
            blk5.a = blk1;
        }
        a(blk1, blk2);
        blk2.c = blk1;
        blk1.a = blk2;
        int j;
        int k;
        if (blk3 != null)
        {
            j = blk3.h;
        } else
        {
            j = 0;
        }
        if (blk5 != null)
        {
            k = blk5.h;
        } else
        {
            k = 0;
        }
        blk1.h = Math.max(j, k) + 1;
        k = blk1.h;
        j = ((flag) ? 1 : 0);
        if (blk4 != null)
        {
            j = blk4.h;
        }
        blk2.h = Math.max(k, j) + 1;
    }

    private void b(blk blk1, boolean flag)
    {
_L6:
        if (blk1 == null) goto _L2; else goto _L1
_L1:
        blk blk2;
        blk blk3;
        int j;
        int k;
        int l;
        blk2 = blk1.b;
        blk3 = blk1.c;
        blk blk5;
        if (blk2 != null)
        {
            j = blk2.h;
        } else
        {
            j = 0;
        }
        if (blk3 != null)
        {
            k = blk3.h;
        } else
        {
            k = 0;
        }
        l = j - k;
        if (l != -2) goto _L4; else goto _L3
_L3:
        blk2 = blk3.b;
        blk5 = blk3.c;
        if (blk5 != null)
        {
            j = blk5.h;
        } else
        {
            j = 0;
        }
        if (blk2 != null)
        {
            k = blk2.h;
        } else
        {
            k = 0;
        }
        j = k - j;
        if (j == -1 || j == 0 && !flag)
        {
            a(blk1);
        } else
        {
            if (!f && j != 1)
            {
                throw new AssertionError();
            }
            b(blk3);
            a(blk1);
        }
        if (flag) goto _L2; else goto _L5
_L5:
        blk1 = blk1.a;
          goto _L6
_L4:
        if (l != 2) goto _L8; else goto _L7
_L7:
        blk blk4 = blk2.b;
        blk blk6 = blk2.c;
        if (blk6 != null)
        {
            j = blk6.h;
        } else
        {
            j = 0;
        }
        if (blk4 != null)
        {
            k = blk4.h;
        } else
        {
            k = 0;
        }
        j = k - j;
        if (j == 1 || j == 0 && !flag)
        {
            b(blk1);
        } else
        {
            if (!f && j != -1)
            {
                throw new AssertionError();
            }
            a(blk2);
            b(blk1);
        }
        if (!flag) goto _L5; else goto _L2
_L2:
        return;
_L8:
        if (l == 0)
        {
            blk1.h = j + 1;
            if (flag)
            {
                return;
            } else
            {
                break; /* Loop/switch isn't completed */
            }
        }
        if (!f && l != -1 && l != 1)
        {
            throw new AssertionError();
        }
        blk1.h = Math.max(j, k) + 1;
        if (!flag) goto _L2; else goto _L5
    }

    private Object writeReplace()
    {
        return new LinkedHashMap(this);
    }

    final blk a(Object obj)
    {
        obj = b(obj);
        if (obj != null)
        {
            a(((blk) (obj)), true);
        }
        return ((blk) (obj));
    }

    final blk a(java.util.Map.Entry entry)
    {
        blk blk1 = b(entry.getKey());
        boolean flag;
        if (blk1 != null && a(blk1.g, entry.getValue()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return blk1;
        } else
        {
            return null;
        }
    }

    final void a(blk blk1, boolean flag)
    {
        int k = 0;
        if (flag)
        {
            blk1.e.d = blk1.d;
            blk1.d.e = blk1.e;
        }
        blk blk2 = blk1.b;
        blk blk3 = blk1.c;
        blk blk4 = blk1.a;
        if (blk2 != null && blk3 != null)
        {
            int j;
            if (blk2.h > blk3.h)
            {
                blk2 = blk2.b();
            } else
            {
                blk2 = blk3.a();
            }
            a(blk2, false);
            blk3 = blk1.b;
            if (blk3 != null)
            {
                j = blk3.h;
                blk2.b = blk3;
                blk3.a = blk2;
                blk1.b = null;
            } else
            {
                j = 0;
            }
            blk3 = blk1.c;
            if (blk3 != null)
            {
                k = blk3.h;
                blk2.c = blk3;
                blk3.a = blk2;
                blk1.c = null;
            }
            blk2.h = Math.max(j, k) + 1;
            a(blk1, blk2);
            return;
        }
        if (blk2 != null)
        {
            a(blk1, blk2);
            blk1.b = null;
        } else
        if (blk3 != null)
        {
            a(blk1, blk3);
            blk1.c = null;
        } else
        {
            a(blk1, ((blk) (null)));
        }
        b(blk4, false);
        c = c - 1;
        d = d + 1;
    }

    public final void clear()
    {
        b = null;
        c = 0;
        d = d + 1;
        blk blk1 = e;
        blk1.e = blk1;
        blk1.d = blk1;
    }

    public final boolean containsKey(Object obj)
    {
        return b(obj) != null;
    }

    public final Set entrySet()
    {
        blh blh1 = h;
        if (blh1 != null)
        {
            return blh1;
        } else
        {
            blh blh2 = new blh(this);
            h = blh2;
            return blh2;
        }
    }

    public final Object get(Object obj)
    {
        obj = b(obj);
        if (obj != null)
        {
            return ((blk) (obj)).g;
        } else
        {
            return null;
        }
    }

    public final Set keySet()
    {
        bli bli1 = i;
        if (bli1 != null)
        {
            return bli1;
        } else
        {
            bli bli2 = new bli(this);
            i = bli2;
            return bli2;
        }
    }

    public final Object put(Object obj, Object obj1)
    {
        if (obj == null)
        {
            throw new NullPointerException("key == null");
        } else
        {
            obj = a(obj, true);
            Object obj2 = ((blk) (obj)).g;
            obj.g = obj1;
            return obj2;
        }
    }

    public final Object remove(Object obj)
    {
        obj = a(obj);
        if (obj != null)
        {
            return ((blk) (obj)).g;
        } else
        {
            return null;
        }
    }

    public final int size()
    {
        return c;
    }

    static 
    {
        boolean flag;
        if (!blg.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
    }

    /* member class not found */
    class _cls1 {}

}
