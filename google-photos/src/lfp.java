// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class lfp
{

    public final List a = new ArrayList();

    public lfp()
    {
    }

    public final String a()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = a.iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            lfh lfh1 = (lfh)iterator.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append("#");
            }
            stringbuilder.append(lfh1.a);
        }
        return stringbuilder.toString();
    }
}
