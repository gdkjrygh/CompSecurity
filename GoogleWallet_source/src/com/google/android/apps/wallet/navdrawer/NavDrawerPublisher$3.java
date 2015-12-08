// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.navdrawer;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.navdrawer:
//            NavDrawerPublisher, NavigationStorageManager

final class this._cls0
    implements Callable
{

    final NavDrawerPublisher this$0;

    private com.google.wallet.proto.api.FetchNavigationResponse call()
        throws Exception
    {
        return (com.google.wallet.proto.api.FetchNavigationResponse)NavDrawerPublisher.access$200(NavDrawerPublisher.this).get(new com.google.wallet.proto.api.FetchNavigationResponse());
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    onResponse()
    {
        this$0 = NavDrawerPublisher.this;
        super();
    }
}
