// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

// Referenced classes of package com.google.a.b:
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

    public w(Comparator comparator)
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

    private boolean a(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
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
_L11:
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
        if (!flag) goto _L5; else goto _L2
_L2:
        return;
_L4:
        if (l != 2) goto _L7; else goto _L6
_L6:
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
        if (flag) goto _L2; else goto _L5
_L5:
        ad1 = ad1.a;
        continue; /* Loop/switch isn't completed */
_L7:
        if (l != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        ad1.h = j + 1;
        if (flag)
        {
            return;
        }
        if (true) goto _L5; else goto _L8
_L8:
        if (!f && l != -1 && l != 1)
        {
            throw new AssertionError();
        }
        ad1.h = Math.max(j, k) + 1;
        if (flag) goto _L5; else goto _L9
_L9:
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }

    ad a(Object obj)
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

    ad a(Object obj, boolean flag)
    {
        ad ad1;
        Object obj1;
        Comparator comparator;
        obj1 = null;
        comparator = a;
        ad1 = b;
        if (ad1 == null) goto _L2; else goto _L1
_L1:
        ad ad2;
        Comparable comparable;
        int j;
        if (comparator == g)
        {
            comparable = (Comparable)obj;
        } else
        {
            comparable = null;
        }
_L11:
        if (comparable != null)
        {
            j = comparable.compareTo(ad1.f);
        } else
        {
            j = comparator.compare(obj, ad1.f);
        }
        if (j != 0) goto _L4; else goto _L3
_L3:
        ad2 = ad1;
_L8:
        return ad2;
_L4:
        if (j < 0)
        {
            ad2 = ad1.b;
        } else
        {
            ad2 = ad1.c;
        }
        if (ad2 != null) goto _L6; else goto _L5
_L5:
        ad2 = obj1;
        if (!flag) goto _L8; else goto _L7
_L7:
        ad2 = e;
        if (ad1 != null) goto _L10; else goto _L9
_L6:
        ad1 = ad2;
          goto _L11
_L9:
        if (comparator == g && !(obj instanceof Comparable))
        {
            throw new ClassCastException((new StringBuilder()).append(obj.getClass().getName()).append(" is not Comparable").toString());
        }
        obj = new ad(ad1, obj, ad2, ad2.e);
        b = ((ad) (obj));
_L12:
        c = c + 1;
        d = d + 1;
        return ((ad) (obj));
_L10:
        obj = new ad(ad1, obj, ad2, ad2.e);
        if (j < 0)
        {
            ad1.b = ((ad) (obj));
        } else
        {
            ad1.c = ((ad) (obj));
        }
        b(ad1, true);
        if (true) goto _L12; else goto _L2
_L2:
        j = 0;
          goto _L5
    }

    ad a(java.util.Map.Entry entry)
    {
        ad ad1 = a(entry.getKey());
        boolean flag;
        if (ad1 != null && a(ad1.g, entry.getValue()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return ad1;
        } else
        {
            return null;
        }
    }

    void a(ad ad1, boolean flag)
    {
        int k = 0;
        if (flag)
        {
            ad1.e.d = ad1.d;
            ad1.d.e = ad1.e;
        }
        ad ad2 = ad1.b;
        ad ad3 = ad1.c;
        ad ad4 = ad1.a;
        if (ad2 != null && ad3 != null)
        {
            int j;
            if (ad2.h > ad3.h)
            {
                ad2 = ad2.b();
            } else
            {
                ad2 = ad3.a();
            }
            a(ad2, false);
            ad3 = ad1.b;
            if (ad3 != null)
            {
                j = ad3.h;
                ad2.b = ad3;
                ad3.a = ad2;
                ad1.b = null;
            } else
            {
                j = 0;
            }
            ad3 = ad1.c;
            if (ad3 != null)
            {
                k = ad3.h;
                ad2.c = ad3;
                ad3.a = ad2;
                ad1.c = null;
            }
            ad2.h = Math.max(j, k) + 1;
            a(ad1, ad2);
            return;
        }
        if (ad2 != null)
        {
            a(ad1, ad2);
            ad1.b = null;
        } else
        if (ad3 != null)
        {
            a(ad1, ad3);
            ad1.c = null;
        } else
        {
            a(ad1, ((ad) (null)));
        }
        b(ad4, false);
        c = c - 1;
        d = d + 1;
    }

    ad b(Object obj)
    {
        obj = a(obj);
        if (obj != null)
        {
            a(((ad) (obj)), true);
        }
        return ((ad) (obj));
    }

    public void clear()
    {
        b = null;
        c = 0;
        d = d + 1;
        ad ad1 = e;
        ad1.e = ad1;
        ad1.d = ad1;
    }

    public boolean containsKey(Object obj)
    {
        return a(obj) != null;
    }

    public Set entrySet()
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

    public Object get(Object obj)
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

    public Set keySet()
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

    public Object put(Object obj, Object obj1)
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

    public Object remove(Object obj)
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

    public int size()
    {
        return c;
    }

    static 
    {
        boolean flag;
        if (!com/google/a/b/w.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
    }
}
