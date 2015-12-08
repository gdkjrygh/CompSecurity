// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import com.google.android.m4b.maps.aa.ax;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.bo:
//            bd, ah

public final class af
    implements Comparable
{

    public final Map a;

    public af()
    {
        a = ax.b();
    }

    public af(af af1)
    {
        a = ax.a(af1.a);
    }

    public static bd a(af af1, bd.a a1)
    {
        if (af1 == null)
        {
            return null;
        } else
        {
            return af1.a(a1);
        }
    }

    public final int a(af af1)
    {
        bd.a aa[];
        int i;
        int l;
        aa = bd.a.values();
        l = aa.length;
        i = 0;
_L7:
        if (i >= l) goto _L2; else goto _L1
_L1:
        bd bd1;
        Object obj;
        obj = aa[i];
        bd1 = a(((bd.a) (obj)));
        obj = af1.a(((bd.a) (obj)));
        if (bd1 != null) goto _L4; else goto _L3
_L3:
        int j;
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = -1;
_L6:
        return j;
_L4:
        int k;
        k = bd1.compareTo(obj);
        j = k;
        if (k != 0) goto _L6; else goto _L5
_L5:
        i++;
          goto _L7
_L2:
        return 0;
    }

    public final af a(ah ah)
    {
        af af1 = new af();
        Iterator iterator = a.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bd bd1 = (bd)iterator.next();
            if (bd1.a(ah))
            {
                af1.a(bd1);
            }
        } while (true);
        return af1;
    }

    public final bd a(bd.a a1)
    {
        return (bd)a.get(a1);
    }

    public final Set a()
    {
        return a.keySet();
    }

    public final void a(bd bd1)
    {
        a.put(bd1.a(), bd1);
    }

    public final boolean b()
    {
        return a.isEmpty();
    }

    public final int compareTo(Object obj)
    {
        return a((af)obj);
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return a.isEmpty();
        }
        if (getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (af)obj;
            return a.equals(((af) (obj)).a);
        }
    }

    public final int hashCode()
    {
        int i;
        if (a == null || a.isEmpty())
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        return i + 31;
    }

    public final String toString()
    {
        if (a.isEmpty())
        {
            return "";
        } else
        {
            return a.toString();
        }
    }
}
