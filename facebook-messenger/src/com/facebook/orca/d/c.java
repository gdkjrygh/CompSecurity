// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.net.Uri;
import com.facebook.ui.media.cache.l;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

public class c extends l
{

    private final Uri a;

    public c(Uri uri)
    {
        Preconditions.checkNotNull(uri);
        a = uri;
    }

    public Uri a()
    {
        return a;
    }

    public String b()
    {
        return a.toString();
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            return Objects.equal(a, ((c)obj).a);
        }
    }

    public int hashCode()
    {
        if (a != null)
        {
            return a.hashCode();
        } else
        {
            return 0;
        }
    }
}
