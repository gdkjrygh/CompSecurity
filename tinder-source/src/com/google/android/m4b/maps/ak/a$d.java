// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ak;


// Referenced classes of package com.google.android.m4b.maps.ak:
//            a, b

public static final class c extends a
{

    private b b;
    private int c;

    public final String a()
    {
        int i = b.a;
        int j = b.b;
        String s = String.valueOf(Integer.toString(c));
        return (new StringBuilder(String.valueOf(s).length() + 24)).append(i).append("|").append(j).append("|").append(s).toString();
    }

    public final boolean a(Object obj)
    {
        return equals(obj);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof equals)
        {
            obj = (equals)obj;
            flag = flag1;
            if (((equals) (obj)).b.equals(b))
            {
                flag = flag1;
                if (((b) (obj)).c == c)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return a().hashCode();
    }

    (b b1, int i)
    {
        b = b1;
        c = i;
    }
}
