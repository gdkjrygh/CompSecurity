// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.nearby.messages.StatusCallback;

// Referenced classes of package com.google.android.gms.nearby.messages.internal:
//            MessagesClientImpl

private static final class <init> extends <init>
{

    private final StatusCallback callback;

    public final void onPermissionChanged(boolean flag)
    {
    }

    private (StatusCallback statuscallback)
    {
        callback = statuscallback;
    }

    callback(StatusCallback statuscallback, byte byte0)
    {
        this(statuscallback);
    }
}
