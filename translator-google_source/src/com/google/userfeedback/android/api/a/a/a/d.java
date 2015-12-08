// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api.a.a.a;


final class d
{

    int a;
    Object b;

    d(int i, Object obj)
    {
        a = i;
        b = obj;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || !(obj instanceof d))
            {
                return false;
            }
            obj = (d)obj;
            if (a != ((d) (obj)).a || b != ((d) (obj)).b && (b == null || !b.equals(((d) (obj)).b)))
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
}
