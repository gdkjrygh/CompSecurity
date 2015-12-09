// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzl, zzv, zzu

private static final class b
{

    private final String a;
    private final ComponentName b;

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
            if (!zzu.equal(a, ((a) (obj)).a) || !zzu.equal(b, ((b) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
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

    public (ComponentName componentname)
    {
        a = null;
        b = (ComponentName)zzv.zzr(componentname);
    }

    public r(String s)
    {
        a = zzv.zzbS(s);
        b = null;
    }
}
