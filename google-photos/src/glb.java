// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Map;

final class glb extends jp
{

    private gla a;

    glb(gla gla1, int i)
    {
        a = gla1;
        super(i);
    }

    protected final void a(boolean flag, Object obj, Object obj1, Object obj2)
    {
        obj = (ehr)obj;
        obj1 = (jp)obj1;
        obj2 = (jp)obj2;
        super.a(flag, obj, obj1, obj2);
        if ((obj2 == null || flag) && !gla.a(a).g().containsKey(obj))
        {
            gla.b(a).b(((ehr) (obj)));
        }
    }
}
