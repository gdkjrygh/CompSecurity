// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.async.activity;

import java.util.concurrent.Callable;

// Referenced classes of package com.google.android.apps.wallet.util.async.activity:
//            WalletTaskFragment

public static interface 
{

    public abstract boolean onActionFailure(String s, Callable callable, Exception exception);

    public abstract void onActionSuccess(String s, Callable callable, Object obj);
}
