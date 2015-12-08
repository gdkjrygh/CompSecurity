// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import com.facebook.share.model.SharePhoto;
import java.util.UUID;

// Referenced classes of package com.facebook.share.internal:
//            G

final class J
    implements com.facebook.internal.U.d
{

    final UUID a;

    J(UUID uuid)
    {
        a = uuid;
        super();
    }

    public final volatile Object a(Object obj)
    {
        obj = (SharePhoto)obj;
        return G.a(a, ((SharePhoto) (obj)));
    }
}
