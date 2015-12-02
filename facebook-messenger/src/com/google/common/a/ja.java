// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            aq, iw, jb, je, 
//            jd, gg

abstract class ja extends aq
{

    private Set a;

    ja()
    {
    }

    public int a(Object obj)
    {
        int i = 0;
        if (!a().f(obj))
        {
            break MISSING_BLOCK_LABEL_59;
        }
        obj = (Collection)a().b().get(obj);
        if (obj == null)
        {
            i = 0;
        } else
        {
            try
            {
                i = ((Collection) (obj)).size();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return 0;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return 0;
            }
        }
        return i;
    }

    abstract iw a();

    public int b(Object obj, int i)
    {
        boolean flag = false;
        int j = 0;
        boolean flag1;
        if (i >= 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1);
        if (i == 0)
        {
            j = a(obj);
        } else
        {
            try
            {
                obj = (Collection)a().b().get(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return 0;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return 0;
            }
            if (obj != null)
            {
                int l = ((Collection) (obj)).size();
                if (i >= l)
                {
                    ((Collection) (obj)).clear();
                } else
                {
                    obj = ((Collection) (obj)).iterator();
                    int k = ((flag) ? 1 : 0);
                    while (k < i) 
                    {
                        ((Iterator) (obj)).next();
                        ((Iterator) (obj)).remove();
                        k++;
                    }
                }
                return l;
            }
        }
        return j;
    }

    public Set b()
    {
        if (a == null)
        {
            Set set = g();
            a = set;
            return set;
        } else
        {
            return a;
        }
    }

    Iterator c()
    {
        return new jb(this, a().b().entrySet().iterator());
    }

    public void clear()
    {
        a().f();
    }

    public boolean contains(Object obj)
    {
        return a().f(obj);
    }

    int d()
    {
        return a().b().size();
    }

    public Set f()
    {
        return a().g();
    }

    Set g()
    {
        return new je(this);
    }

    public Iterator iterator()
    {
        return gg.a(a().i().iterator(), new jd(this));
    }
}
