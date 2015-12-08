// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

public interface Acls
{
    public static interface LoadAclResult
        extends Releasable, Result
    {
    }

    public static interface LoadFAclResult
        extends Releasable, Result
    {
    }

    public static interface OnGameplayAclLoadedCallback
    {
    }

    public static interface OnGameplayAclUpdatedCallback
    {
    }

    public static interface OnNotifyAclLoadedCallback
    {
    }

    public static interface OnNotifyAclUpdatedCallback
    {
    }

}
