// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.j;

import android.content.ComponentName;
import android.content.Intent;
import android.text.TextUtils;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.j:
//            o, v

static final class b
{

    private final String a;
    private final ComponentName b;

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
            if (!(obj instanceof t))
            {
                return false;
            }
            obj = (t)obj;
            if (!v.a(a, ((a) (obj)).a) || !v.a(null, null))
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

    public (String s)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("Given String is empty or null");
        } else
        {
            a = s;
            b = null;
            return;
        }
    }
}
