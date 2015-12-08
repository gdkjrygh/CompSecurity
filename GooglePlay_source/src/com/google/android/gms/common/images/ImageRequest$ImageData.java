// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.images;

import android.net.Uri;
import com.google.android.gms.common.internal.Objects;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.common.images:
//            ImageRequest

static final class uri
{

    public final Uri uri;

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof uri))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        } else
        {
            return Objects.equal(((uri)obj).uri, uri);
        }
    }

    public final int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            uri
        });
    }

    public A(Uri uri1)
    {
        uri = uri1;
    }
}
