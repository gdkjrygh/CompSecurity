// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.media;

import dwh;
import dwk;

// Referenced classes of package com.spotify.mobile.android.service.media:
//            MediaService

final class a
    implements dwk
{

    private MediaService a;

    public final void a(Object obj)
    {
        MediaService.a(a).b(this);
        MediaService.b(a);
    }

    public final void b()
    {
        MediaService.a(a).b(this);
    }

    (MediaService mediaservice)
    {
        a = mediaservice;
        super();
    }
}
