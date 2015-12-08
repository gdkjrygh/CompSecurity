// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;


// Referenced classes of package com.google.android.m4b.maps.cg:
//            bf

static final class b
{

    public final b a;
    public final String b;

    public final boolean equals(Object obj)
    {
        return (obj instanceof b) && ((b)obj).a.ci.equals(a.ci) && ((ci)obj).b.equals(b);
    }

    public final int hashCode()
    {
        String s = String.valueOf(a.ci);
        String s1 = String.valueOf(b);
        if (s1.length() != 0)
        {
            s = s.concat(s1);
        } else
        {
            s = new String(s);
        }
        return s.hashCode();
    }

    public ( , String s)
    {
        a = ;
        b = s;
    }
}
