// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.load.c;


// Referenced classes of package com.bumptech.glide.load.c:
//            l

final class o
    implements l
{

    private final String a;

    o(String s)
    {
        a = s;
    }

    public final String a()
    {
        return a;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof o)
        {
            obj = (o)obj;
            return a.equals(((o) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return a.hashCode();
    }

    public final String toString()
    {
        return (new StringBuilder("StringHeaderFactory{value='")).append(a).append('\'').append('}').toString();
    }
}
