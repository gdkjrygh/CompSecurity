// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

// Referenced classes of package com.skype.android.concurrent:
//            AsyncCallback

public interface AsyncService
{

    public abstract Future a(Runnable runnable);

    public abstract Future a(Callable callable, AsyncCallback asynccallback);

    public abstract Future a(Callable callable, Object obj, AsyncCallback asynccallback);
}
