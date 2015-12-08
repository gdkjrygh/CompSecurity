// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.analytics;

import com.skype.android.inject.Proxy;
import com.skype.android.inject.ProxyEventListener;

// Referenced classes of package com.skype.android.analytics:
//            AnalyticsInAppObserver

final class a extends ProxyEventListener
{

    final tTarget a;

    public final void onEvent(Object obj)
    {
        obj = (com.skype.android.gen.anged)obj;
        ((AnalyticsInAppObserver)a.tTarget()).a(((com.skype.android.gen.anged) (obj)));
    }

    A(A a1, Proxy proxy, Class class1)
    {
        a = a1;
        super(proxy, class1, null, null);
    }
}
