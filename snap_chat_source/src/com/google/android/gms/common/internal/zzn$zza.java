// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.common.internal:
//            zzn, zzx, zzw

static final class zzQh
{

    private final ComponentName zzQh;
    private final String zzrc;

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof zzQh))
            {
                return false;
            }
            obj = (zzQh)obj;
            if (!zzw.equal(zzrc, ((zzrc) (obj)).zzrc) || !zzw.equal(zzQh, ((zzQh) (obj)).zzQh))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return zzw.hashCode(new Object[] {
            zzrc, zzQh
        });
    }

    public final String toString()
    {
        if (zzrc == null)
        {
            return zzQh.flattenToString();
        } else
        {
            return zzrc;
        }
    }

    public final Intent zzjj()
    {
        if (zzrc != null)
        {
            return (new Intent(zzrc)).setPackage("com.google.android.gms");
        } else
        {
            return (new Intent()).setComponent(zzQh);
        }
    }

    public (ComponentName componentname)
    {
        zzrc = null;
        zzQh = (ComponentName)zzx.zzl(componentname);
    }

    public zzQh(String s)
    {
        zzrc = zzx.zzbn(s);
        zzQh = null;
    }
}
