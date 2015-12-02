// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.d;

import android.net.Uri;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.orca.d:
//            c

public class bc
{

    private final Uri a;

    public bc(Uri uri)
    {
        Preconditions.checkNotNull(uri);
        Preconditions.checkArgument(uri.isAbsolute());
        a = uri;
    }

    public Uri a()
    {
        return a;
    }

    public c b()
    {
        return new c(a);
    }
}
