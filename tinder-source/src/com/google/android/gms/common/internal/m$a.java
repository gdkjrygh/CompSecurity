// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.internal:
//            m, u, t

private static final class a
{

    private final String a;
    private final ComponentName b = null;

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
            if (!(obj instanceof b))
            {
                return false;
            }
            obj = (b)obj;
            if (!t.a(a, ((a) (obj)).a) || !t.a(b, ((b) (obj)).b))
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

    public (String s)
    {
        a = u.a(s);
    }
}
