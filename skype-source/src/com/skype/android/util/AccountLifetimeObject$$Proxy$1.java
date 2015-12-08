// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import com.skype.android.inject.Proxy;
import com.skype.android.inject.ProxyEventListener;

// Referenced classes of package com.skype.android.util:
//            AccountLifetimeObject

final class a extends ProxyEventListener
{

    final  a;

    public final void onEvent(Object obj)
    {
        obj = (com.skype.android.gen.e)obj;
        ((AccountLifetimeObject)a.tTarget()).onEvent(((com.skype.android.gen.e) (obj)));
    }

    ( , Proxy proxy, Class class1)
    {
        a = ;
        super(proxy, class1, null, null);
    }
}
