// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio;


public final class j
{

    public final String a;
    public final int b;
    public final int c;

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (j)obj;
        if (c != ((j) (obj)).c)
        {
            return false;
        }
        if (b != ((j) (obj)).b)
        {
            return false;
        }
        if (a != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((j) (obj)).a == null) goto _L1; else goto _L3
_L3:
        return false;
        if (a.equals(((j) (obj)).a)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public final int hashCode()
    {
        int k = c;
        int l = b;
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        return i + ((k + 31) * 31 + l) * 31;
    }

    public final String toString()
    {
        return (new StringBuilder("TtsMarker [text=")).append(a).append(", start=").append(b).append(", len=").append(c).append("]").toString();
    }
}
