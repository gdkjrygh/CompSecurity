// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Locale;

public class msm
{

    public final msp a;

    public msm(msp msp1)
    {
        a = msp1;
    }

    public boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (getClass() == obj.getClass())
            {
                obj = (msm)obj;
                flag = flag1;
                if (a.a == ((msm) (obj)).a.a)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return a.a + 527;
    }

    public String toString()
    {
        return String.format(Locale.US, "VisualElement {tag: %s}", new Object[] {
            a
        });
    }
}
