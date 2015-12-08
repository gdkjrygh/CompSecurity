// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util.a;

import com.google.common.util.concurrent.d;

// Referenced classes of package com.google.android.apps.gsa.shared.util.a:
//            a

public abstract class g extends a
    implements d
{

    public g(String s)
    {
        super((new StringBuilder(String.valueOf(s).length() + 21)).append("NamedFutureCallback[").append(s).append("]").toString(), 2, 0);
    }
}
