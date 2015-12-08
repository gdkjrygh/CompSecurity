// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

final class cyr
{

    private final int a;

    public cyr(View view, String s)
    {
        a = view.hashCode() ^ s.hashCode();
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof cyr)
        {
            flag = flag1;
            if (a == obj.hashCode())
            {
                flag = true;
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return a;
    }
}
