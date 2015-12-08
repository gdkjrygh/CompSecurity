// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.Set;

final class hze extends jp
{

    private hzd a;

    hze(hzd hzd1, int i)
    {
        a = hzd1;
        super(25);
    }

    protected final void a(boolean flag, Object obj, Object obj1, Object obj2)
    {
        obj = (ehr)obj;
        super.a(flag, obj, (List)obj1, (List)obj2);
        hzd.a(a).remove(obj);
    }
}
