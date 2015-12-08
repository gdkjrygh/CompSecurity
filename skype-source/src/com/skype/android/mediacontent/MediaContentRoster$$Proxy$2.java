// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mediacontent;

import com.skype.android.inject.Proxy;
import com.skype.android.inject.ProxyEventListener;

// Referenced classes of package com.skype.android.mediacontent:
//            MediaContentRoster

final class a extends ProxyEventListener
{

    final tTarget a;

    public final void onEvent(Object obj)
    {
        obj = (com.skype.android.gen.ange)obj;
        ((MediaContentRoster)a.tTarget()).a(((com.skype.android.gen.ange) (obj)));
    }

    ( , Proxy proxy, Class class1)
    {
        a = ;
        super(proxy, class1, null, null);
    }
}
