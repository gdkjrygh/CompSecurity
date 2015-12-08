// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.cache;

import android.content.Context;

// Referenced classes of package io.fabric.sdk.android.services.cache:
//            ValueLoader

public interface ValueCache
{

    public abstract Object get(Context context, ValueLoader valueloader)
        throws Exception;

    public abstract void invalidate(Context context);
}
