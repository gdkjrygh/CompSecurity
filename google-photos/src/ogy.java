// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class ogy extends msm
{

    public final List b;
    public final List c;
    public final List d;

    public ogy(msp msp, List list)
    {
        super(msp);
        if (list != null)
        {
            d = Collections.unmodifiableList(list);
            b = Collections.emptyList();
            c = Collections.emptyList();
            return;
        } else
        {
            throw new IllegalStateException("Argument 'localNotificationTypes' is null");
        }
    }

    public ogy(msp msp, List list, List list1)
    {
        super(msp);
        if (list != null)
        {
            b = Collections.unmodifiableList(list);
        } else
        {
            b = Collections.emptyList();
        }
        if (list1 != null)
        {
            c = Collections.unmodifiableList(list1);
        } else
        {
            c = Collections.emptyList();
        }
        d = Collections.emptyList();
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (super.equals(obj))
        {
            obj = (ogy)obj;
            flag = flag1;
            if (c.c(b, ((ogy) (obj)).b))
            {
                flag = flag1;
                if (c.c(c, ((ogy) (obj)).c))
                {
                    flag = flag1;
                    if (c.c(d, ((ogy) (obj)).d))
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            b, c, d, Integer.valueOf(super.hashCode())
        });
    }
}
