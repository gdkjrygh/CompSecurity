// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ac;


// Referenced classes of package com.google.android.m4b.maps.ac:
//            b

static final class b
{

    int a;
    Object b;

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof b))
            {
                return false;
            }
            obj = (b)obj;
            if (a != ((a) (obj)).a || b != ((b) (obj)).b && (b == null || !b.equals(((b) (obj)).b)))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return a;
    }

    public final String toString()
    {
        int i = a;
        String s = String.valueOf(b);
        return (new StringBuilder(String.valueOf(s).length() + 33)).append("TypeInfo{type=").append(i).append(", data=").append(s).append("}").toString();
    }

    (int i, Object obj)
    {
        a = i;
        b = obj;
    }
}
