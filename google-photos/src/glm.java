// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

final class glm
    implements glg
{

    glm()
    {
    }

    public final int a(List list, Object obj)
    {
        obj = (ekp)obj;
        if (!list.isEmpty() && ((ekp)list.get(0)).d() >= ((ekp) (obj)).d() && ((ekp)list.get(list.size() - 1)).d() <= ((ekp) (obj)).d())
        {
            int i = list.indexOf(obj);
            if (i != -1)
            {
                return i;
            }
        }
        return -1;
    }
}
