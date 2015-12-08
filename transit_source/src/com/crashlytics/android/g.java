// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.util.Map;

// Referenced classes of package com.crashlytics.android:
//            d, HttpRequest

final class g extends d
{

    g(String s, int i)
    {
        super(s, 2, (byte)0);
    }

    public final HttpRequest a(String s, Map map)
    {
        return HttpRequest.b(s);
    }
}
