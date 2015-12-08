// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ak;


public final class c
{

    public final a.c a;
    public final int b;

    public c(a.c c1, int i)
    {
        a = c1;
        b = i;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj instanceof c)
        {
            return a.equals(((c)obj).a);
        }
        if (obj instanceof a.c)
        {
            return a.equals(obj);
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
        String s = String.valueOf(getClass().getSimpleName());
        String s1 = String.valueOf(a);
        int i = b;
        return (new StringBuilder(String.valueOf(s).length() + 35 + String.valueOf(s1).length())).append("{").append(s).append(":mId=").append(s1).append(", mLevelNumberE3=").append(i).append("}").toString();
    }
}
