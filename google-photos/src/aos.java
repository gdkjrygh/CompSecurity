// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class aos
    implements aoz
{

    private final amz a;
    private aop b;

    public aos(aop aop1, amz amz1)
    {
        b = aop1;
        super();
        a = amz1;
    }

    public final aqa a(aqa aqa1)
    {
        Class class1 = aqa1.b().getClass();
        Object obj;
        Object obj1;
        anb anb1;
        Object obj2;
        Object obj3;
        int i;
        int j;
        boolean flag;
        if (a != amz.d)
        {
            obj1 = aop.a(b).c(class1);
            obj = ((anl) (obj1)).a(aqa1, aop.b(b), aop.c(b));
        } else
        {
            obj = aqa1;
            obj1 = null;
        }
        if (!aqa1.equals(obj))
        {
            aqa1.d();
        }
        if (aop.a(b).c.b.c.a(((aqa) (obj)).a()) != null)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i == 0) goto _L2; else goto _L1
_L1:
        aqa1 = aop.a(b).c.b.c.a(((aqa) (obj)).a());
        if (aqa1 == null) goto _L4; else goto _L3
_L3:
        anb1 = aqa1.a(aop.d(b));
_L19:
        obj3 = aop.a(b);
        obj2 = aop.e(b);
        obj3 = ((aoo) (obj3)).b();
        j = ((List) (obj3)).size();
        i = 0;
_L12:
        if (i >= j) goto _L6; else goto _L5
_L5:
        if (!((atn)((List) (obj3)).get(i)).a.equals(obj2)) goto _L8; else goto _L7
_L7:
        i = 1;
_L13:
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj2 = obj;
        if (!aop.f(b).a(flag, a, anb1)) goto _L10; else goto _L9
_L9:
        if (aqa1 == null)
        {
            throw new ao(((aqa) (obj)).b().getClass());
        }
          goto _L11
_L4:
        throw new ao(((aqa) (obj)).a());
_L2:
        anb1 = anb.c;
        aqa1 = null;
        continue; /* Loop/switch isn't completed */
_L8:
        i++;
          goto _L12
_L6:
        i = 0;
          goto _L13
_L11:
        if (anb1 != anb.a) goto _L15; else goto _L14
_L14:
        obj1 = new aol(aop.e(b), aop.g(b));
_L17:
        obj2 = apy.a(((aqa) (obj)));
        obj = aop.h(b);
        obj.a = ((ane) (obj1));
        obj.b = aqa1;
        obj.c = ((apy) (obj2));
_L10:
        return ((aqa) (obj2));
_L15:
        if (anb1 != anb.b)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = new aqc(aop.e(b), aop.g(b), aop.b(b), aop.c(b), ((anl) (obj1)), class1, aop.d(b));
        if (true) goto _L17; else goto _L16
_L16:
        aqa1 = String.valueOf(anb1);
        throw new IllegalArgumentException((new StringBuilder(String.valueOf(aqa1).length() + 18)).append("Unknown strategy: ").append(aqa1).toString());
        if (true) goto _L19; else goto _L18
_L18:
    }
}
