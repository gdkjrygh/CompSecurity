// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.inject.spi:
//            InjectionPoint

static class injectableMembers
{

    Map bySignature;
    final ers injectableMembers;
    Method lastMethod;
    ers lastSignature;
    ers position;

    void add(od od)
    {
        injectableMembers.add(od);
        while (position == M || od.isFinal() || bySignature == null) 
        {
            return;
        }
        er er;
        Object obj;
        List list;
        if (od.method == lastMethod)
        {
            er = lastSignature;
        } else
        {
            er = new t>(od.method);
        }
        list = (List)bySignature.get(er);
        obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            bySignature.put(er, obj);
        }
        ((List) (obj)).add(od);
    }

    boolean removeIfOverriddenBy(Method method, boolean flag, od od)
    {
        if (position != position) goto _L2; else goto _L1
_L1:
        boolean flag2 = false;
_L4:
        return flag2;
_L2:
        if (bySignature == null)
        {
            bySignature = new HashMap();
            er er = injectableMembers.head;
            while (er != null) 
            {
                if (er instanceof od)
                {
                    od od1 = (od)er;
                    if (!od1.isFinal())
                    {
                        ArrayList arraylist = new ArrayList();
                        arraylist.add(od1);
                        bySignature.put(new t>(od1.method), arraylist);
                    }
                }
                er = er.next;
            }
        }
        lastMethod = method;
        Object obj = new t>(method);
        lastSignature = ((lastSignature) (obj));
        obj = (List)bySignature.get(obj);
        boolean flag1 = false;
        flag2 = false;
        if (obj == null)
        {
            continue;
        }
        obj = ((List) (obj)).iterator();
        do
        {
            flag2 = flag1;
            if (!((Iterator) (obj)).hasNext())
            {
                continue;
            }
            od od2 = (od)((Iterator) (obj)).next();
            if (InjectionPoint.access$000(method, od2.method))
            {
                boolean flag3;
                if (!od2.jsr330 || od2.overrodeGuiceInject)
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                if (od != null)
                {
                    od.overrodeGuiceInject = flag3;
                }
                if (flag || !flag3)
                {
                    flag1 = true;
                    ((Iterator) (obj)).remove();
                    injectableMembers.remove(od2);
                }
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    ers(ers ers)
    {
        position = position;
        injectableMembers = ers;
    }
}
