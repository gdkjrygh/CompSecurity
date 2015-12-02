// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            fi, fe, jg, jp, 
//            mh

class fh extends fi
{

    final transient fe a;

    public fh(fe fe1)
    {
        a = fe1;
    }

    boolean a()
    {
        return a.a();
    }

    public boolean contains(Object obj)
    {
        if (obj instanceof jg)
        {
            obj = (jg)obj;
            break MISSING_BLOCK_LABEL_12;
        }
        do
        {
            return false;
        } while (((jg) (obj)).b() <= 0 || a.a(((jg) (obj)).a()) != ((jg) (obj)).b());
        return true;
    }

    public mh h_()
    {
        return a.d();
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public Iterator iterator()
    {
        return h_();
    }

    public int size()
    {
        return a.e();
    }

    public Object[] toArray()
    {
        return toArray(new Object[size()]);
    }

    public Object[] toArray(Object aobj[])
    {
        int i = size();
        if (aobj.length >= i) goto _L2; else goto _L1
_L1:
        Object aobj1[] = jp.a(aobj, i);
_L4:
        aobj = iterator();
        for (i = 0; ((Iterator) (aobj)).hasNext(); i++)
        {
            aobj1[i] = (jg)((Iterator) (aobj)).next();
        }

        break; /* Loop/switch isn't completed */
_L2:
        aobj1 = aobj;
        if (aobj.length > i)
        {
            aobj[i] = null;
            aobj1 = aobj;
        }
        if (true) goto _L4; else goto _L3
_L3:
        return aobj1;
    }
}
