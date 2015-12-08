// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Bundle;

// Referenced classes of package com.facebook.share.internal:
//            t, LikeContent

final class u
    implements com.facebook.internal.o.a
{

    final LikeContent a;
    final t.a b;

    u(t.a a1, LikeContent likecontent)
    {
        b = a1;
        a = likecontent;
        super();
    }

    public final Bundle a()
    {
        return t.a(a);
    }

    public final Bundle b()
    {
        return new Bundle();
    }
}
