// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

// Referenced classes of package com.google.b.b:
//            x, ad, y, aa

public final class w extends AbstractMap
    implements Serializable
{

    static final boolean f;
    private static final Comparator g = new x();
    Comparator a;
    ad b;
    int c;
    int d;
    final ad e;
    private y h;
    private aa i;

    public w()
    {
        this(g);
    }

    private w(Comparator comparator)
    {
        c = 0;
        d = 0;
        e = new ad();
        if (comparator == null)
        {
            comparator = g;
        }
        a = comparator;
    }

    private ad a(Object obj, boolean flag)
    {
        ad ad1;
        ad ad2;
        Object obj1;
        Comparator comparator;
        int j;
        obj1 = null;
        comparator = a;
        ad1 = b;
        if (ad1 == null)
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
            j = comparable.compareTo(ad1.f);
        } else
        {
            j = comparator.compare(obj, ad1.f);
        }
        if (j != 0) goto _L2; else goto _L1
_L1:
        ad2 = ad1;
_L5:
        return ad2;
_L2:
label0:
        {
            if (j < 0)
            {
                ad2 = ad1.b;
            } else
            {
                ad2 = ad1.c;
            }
            if (ad2 == null)
            {
                break label0;
            }
            ad1 = ad2;
        }
          goto _L3
        if (!flag) goto _L5; else goto _L4
_L4:
        ad ad3 = e;
        if (ad1 == null)
        {
            if (comparator == g && !(obj instanceof Comparable))
            {
                throw new ClassCastException((new StringBuilder()).append(obj.getClass().getName()).append(" is not Comparable").toString());
            }
            obj = new ad(ad1, obj, ad3, ad3.e);
            b = ((ad) (obj));
        } else
        {
            obj = new ad(ad1, obj, ad3, ad3.e);
            if (j < 0)
            {
                ad1.b = ((ad) (obj));
            } else
            {
                ad1.c = ((ad) (obj));
            }
            b(ad1, true);
        }
        c = c + 1;
        d = d + 1;
        return ((ad) (obj));
        j = 0;
        ad2 = obj1;
        continue; /* Loop/switch isn't completed */
    }

    private void a(ad ad1)
    {
        boolean flag = false;
        ad ad2 = ad1.b;
        ad ad3 = ad1.c;
        ad ad4 = ad3.b;
        ad ad5 = ad3.c;
        ad1.c = ad4;
        if (ad4 != null)
        {
            ad4.a = ad1;
        }
        a(ad1, ad3);
        ad3.b = ad1;
        ad1.a = ad3;
        int j;
        int k;
        if (ad2 != null)
        {
            j = ad2.h;
        } else
        {
            j = 0;
        }
        if (ad4 != null)
        {
            k = ad4.h;
        } else
        {
            k = 0;
        }
        ad1.h = Math.max(j, k) + 1;
        k = ad1.h;
        j = ((flag) ? 1 : 0);
        if (ad5 != null)
        {
            j = ad5.h;
        }
        ad3.h = Math.max(k, j) + 1;
    }

    private void a(ad ad1, ad ad2)
    {
        ad ad3 = ad1.a;
        ad1.a = null;
        if (ad2 != null)
        {
            ad2.a = ad3;
        }
        if (ad3 != null)
        {
            if (ad3.b == ad1)
            {
                ad3.b = ad2;
                return;
            }
            if (!f && ad3.c != ad1)
            {
                throw new AssertionError();
            } else
            {
                ad3.c = ad2;
                return;
            }
        } else
        {
            b = ad2;
            return;
        }
    }

    private ad b(Object obj)
    {
        ad ad1 = null;
        if (obj != null)
        {
            try
            {
                ad1 = a(obj, false);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return null;
            }
        }
        return ad1;
    }

    private void b(ad ad1)
    {
        boolean flag = false;
        ad ad2 = ad1.b;
        ad ad3 = ad1.c;
        ad ad4 = ad2.b;
        ad ad5 = ad2.c;
        ad1.b = ad5;
        if (ad5 != null)
        {
            ad5.a = ad1;
        }
        a(ad1, ad2);
        ad2.c = ad1;
        ad1.a = ad2;
        int j;
        int k;
        if (ad3 != null)
        {
            j = ad3.h;
        } else
        {
            j = 0;
        }
        if (ad5 != null)
        {
            k = ad5.h;
        } else
        {
            k = 0;
        }
        ad1.h = Math.max(j, k) + 1;
        k = ad1.h;
        j = ((flag) ? 1 : 0);
        if (ad4 != null)
        {
            j = ad4.h;
        }
        ad2.h = Math.max(k, j) + 1;
    }

    private void b(ad ad1, boolean flag)
    {
_L6:
        if (ad1 == null) goto _L2; else goto _L1
_L1:
        ad ad2;
        ad ad3;
        int j;
        int k;
        int l;
        ad2 = ad1.b;
        ad3 = ad1.c;
        ad ad5;
        if (ad2 != null)
        {
            j = ad2.h;
        } else
        {
            j = 0;
        }
        if (ad3 != null)
        {
            k = ad3.h;
        } else
        {
            k = 0;
        }
        l = j - k;
        if (l != -2) goto _L4; else goto _L3
_L3:
        ad2 = ad3.b;
        ad5 = ad3.c;
        if (ad5 != null)
        {
            j = ad5.h;
        } else
        {
            j = 0;
        }
        if (ad2 != null)
        {
            k = ad2.h;
        } else
        {
            k = 0;
        }
        j = k - j;
        if (j == -1 || j == 0 && !flag)
        {
            a(ad1);
        } else
        {
            if (!f && j != 1)
            {
                throw new AssertionError();
            }
            b(ad3);
            a(ad1);
        }
        if (flag) goto _L2; else goto _L5
_L5:
        ad1 = ad1.a;
          goto _L6
_L4:
        if (l != 2) goto _L8; else goto _L7
_L7:
        ad ad4 = ad2.b;
        ad ad6 = ad2.c;
        if (ad6 != null)
        {
            j = ad6.h;
        } else
        {
            j = 0;
        }
        if (ad4 != null)
        {
            k = ad4.h;
        } else
        {
            k = 0;
        }
        j = k - j;
        if (j == 1 || j == 0 && !flag)
        {
            b(ad1);
        } else
        {
            if (!f && j != -1)
            {
                throw new AssertionError();
            }
            a(ad2);
            b(ad1);
        }
        if (!flag) goto _L5; else goto _L2
_L2:
        return;
_L8:
        if (l == 0)
        {
            ad1.h = j + 1;
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
        ad1.h = Math.max(j, k) + 1;
        if (!flag) goto _L2; else goto _L5
    }

    final ad a(Object obj)
    {
        obj = b(obj);
        if (obj != null)
        {
            a(((ad) (obj)), true);
        }
        return ((ad) (obj));
    }

    final ad a(java.util.Map.Entry entry)
    {
        boolean flag;
        boolean flag1 = true;
        ad ad1 = b(entry.getKey());
        if (ad1 == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        Object obj = ad1.g;
        entry = ((java.util.Map.Entry) (entry.getValue()));
        if (obj == entry || obj != null && obj.equals(entry))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        flag = flag1;
_L1:
        if (flag)
        {
            return ad1;
        } else
        {
            return null;
        }
        flag = false;
          goto _L1
    }

    final void a(ad ad1, boolean flag)
    {
        ad ad2;
        ad ad3;
        ad ad4;
        int k;
        k = 0;
        if (flag)
        {
            ad1.e.d = ad1.d;
            ad1.d.e = ad1.e;
        }
        ad3 = ad1.b;
        ad4 = ad1.c;
        ad2 = ad1.a;
        if (ad3 == null || ad4 == null)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        ad2 = ad4;
        if (ad3.h <= ad4.h) goto _L2; else goto _L1
_L1:
        for (ad2 = ad3.c; ad2 != null; ad2 = ad4)
        {
            ad4 = ad2.c;
            ad3 = ad2;
        }

          goto _L3
_L4:
        ad2 = ad3;
_L2:
        ad3 = ad2.b;
        if (ad3 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        ad3 = ad2;
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        a(ad3, false);
        ad2 = ad1.b;
        int j;
        if (ad2 != null)
        {
            j = ad2.h;
            ad3.b = ad2;
            ad2.a = ad3;
            ad1.b = null;
        } else
        {
            j = 0;
        }
        ad2 = ad1.c;
        if (ad2 != null)
        {
            k = ad2.h;
            ad3.c = ad2;
            ad2.a = ad3;
            ad1.c = null;
        }
        ad3.h = Math.max(j, k) + 1;
        a(ad1, ad3);
        return;
        if (ad3 != null)
        {
            a(ad1, ad3);
            ad1.b = null;
        } else
        if (ad4 != null)
        {
            a(ad1, ad4);
            ad1.c = null;
        } else
        {
            a(ad1, ((ad) (null)));
        }
        b(ad2, false);
        c = c - 1;
        d = d + 1;
        return;
    }

    public final void clear()
    {
        b = null;
        c = 0;
        d = d + 1;
        ad ad1 = e;
        ad1.e = ad1;
        ad1.d = ad1;
    }

    public final boolean containsKey(Object obj)
    {
        return b(obj) != null;
    }

    public final Set entrySet()
    {
        y y1 = h;
        if (y1 != null)
        {
            return y1;
        } else
        {
            y y2 = new y(this);
            h = y2;
            return y2;
        }
    }

    public final Object get(Object obj)
    {
        obj = b(obj);
        if (obj != null)
        {
            return ((ad) (obj)).g;
        } else
        {
            return null;
        }
    }

    public final Set keySet()
    {
        aa aa1 = i;
        if (aa1 != null)
        {
            return aa1;
        } else
        {
            aa aa2 = new aa(this);
            i = aa2;
            return aa2;
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
            Object obj2 = ((ad) (obj)).g;
            obj.g = obj1;
            return obj2;
        }
    }

    public final Object remove(Object obj)
    {
        obj = a(obj);
        if (obj != null)
        {
            return ((ad) (obj)).g;
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
        if (!com/google/b/b/w.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
    }
}
