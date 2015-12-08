// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

final class kcc
{

    private final String a;
    private final ComponentName b;

    public kcc(ComponentName componentname)
    {
        a = null;
        b = (ComponentName)b.d(componentname);
    }

    public kcc(String s)
    {
        a = b.o(s);
        b = null;
    }

    public final Intent a()
    {
        if (a != null)
        {
            return (new Intent(a)).setPackage("com.google.android.gms");
        } else
        {
            return (new Intent()).setComponent(b);
        }
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof kcc))
            {
                return false;
            }
            obj = (kcc)obj;
            if (!c.b(a, ((kcc) (obj)).a) || !c.b(b, ((kcc) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a, b
        });
    }

    public final String toString()
    {
        if (a == null)
        {
            return b.flattenToString();
        } else
        {
            return a;
        }
    }
}
