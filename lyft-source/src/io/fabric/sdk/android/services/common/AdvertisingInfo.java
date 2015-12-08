// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;


class AdvertisingInfo
{

    public final String a;
    public final boolean b;

    AdvertisingInfo(String s, boolean flag)
    {
        a = s;
        b = flag;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AdvertisingInfo)obj;
            if (b != ((AdvertisingInfo) (obj)).b)
            {
                return false;
            }
            if (a == null ? ((AdvertisingInfo) (obj)).a != null : !a.equals(((AdvertisingInfo) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        if (b)
        {
            j = 1;
        }
        return i * 31 + j;
    }
}
