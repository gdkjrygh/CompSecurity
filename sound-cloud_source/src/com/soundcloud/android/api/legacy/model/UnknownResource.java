// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import android.net.Uri;

// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            PublicApiResource

public class UnknownResource extends PublicApiResource
{

    public UnknownResource()
    {
    }

    public UnknownResource(long l)
    {
        super(l);
    }

    public Uri getBulkInsertUri()
    {
        return null;
    }

    public Uri toUri()
    {
        return null;
    }
}
