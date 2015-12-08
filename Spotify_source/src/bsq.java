// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import java.util.Arrays;

final class bsq
{

    private final String a;

    public bsq(String s)
    {
        a = btl.a(s);
    }

    public final Intent a()
    {
        if (a != null)
        {
            return (new Intent(a)).setPackage("com.google.android.gms");
        } else
        {
            return (new Intent()).setComponent(null);
        }
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof bsq))
            {
                return false;
            }
            obj = (bsq)obj;
            if (!btj.a(a, ((bsq) (obj)).a) || !btj.a(null, null))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a, null
        });
    }

    public final String toString()
    {
        if (a == null)
        {
            throw new NullPointerException();
        } else
        {
            return a;
        }
    }
}
