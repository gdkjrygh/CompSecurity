// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;


// Referenced classes of package com.facebook.orca.threadview:
//            ac

public final class aj extends ac
{

    private final int a;

    public aj(int i)
    {
        a = i;
    }

    public int a()
    {
        return a;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (aj)obj;
            if (a != ((aj) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return a;
    }

    public String toString()
    {
        return (new StringBuilder()).append("SimpleRowItem{msgType=").append(a).append('}').toString();
    }
}
