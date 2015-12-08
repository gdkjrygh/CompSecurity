// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.device.a.a;

import java.net.URI;

public final class b
{

    private URI a;
    private URI b;

    public b(URI uri, URI uri1)
    {
        a = uri;
        b = uri1;
    }

    public final URI a()
    {
        return a;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (b)obj;
            if (b == null ? ((b) (obj)).b != null : !b.equals(((b) (obj)).b))
            {
                return false;
            }
            if (a == null ? ((b) (obj)).a != null : !a.equals(((b) (obj)).a))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
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
        if (b != null)
        {
            j = b.hashCode();
        }
        return i * 31 + j;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[DeviceURIResult] serviceURI: ").append(a).append(" applicationURI: ").append(b);
        return stringbuilder.toString();
    }
}
