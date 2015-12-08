// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzu, zzt

final class a
{

    private final String a;
    private final ComponentName b = null;

    public Intent a()
    {
        if (a != null)
        {
            return (new Intent(a)).setPackage("com.google.android.gms");
        } else
        {
            return (new Intent()).setComponent(b);
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof b))
            {
                return false;
            }
            obj = (b)obj;
            if (!zzt.a(a, ((a) (obj)).a) || !zzt.a(b, ((b) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzt.a(new Object[] {
            a, b
        });
    }

    public String toString()
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
        a = zzu.a(s);
    }
}
