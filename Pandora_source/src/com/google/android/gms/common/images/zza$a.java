// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.common.images:
//            zza

static final class a
{

    public final Uri a;

    public boolean equals(Object obj)
    {
        if (!(obj instanceof a))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        } else
        {
            return zzu.equal(((equal)obj).a, a);
        }
    }

    public int hashCode()
    {
        return zzu.hashCode(new Object[] {
            a
        });
    }

    public (Uri uri)
    {
        a = uri;
    }
}
