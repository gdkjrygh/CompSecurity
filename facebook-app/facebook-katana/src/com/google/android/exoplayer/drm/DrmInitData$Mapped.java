// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.drm;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.google.android.exoplayer.drm:
//            DrmInitData

public final class _cls9 extends DrmInitData
{

    private final Map b = new HashMap();

    public final void a(UUID uuid, byte abyte0[])
    {
        b.put(uuid, abyte0);
    }

    public _cls9(String s)
    {
        super(s);
    }
}
