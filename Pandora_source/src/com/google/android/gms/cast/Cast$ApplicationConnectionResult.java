// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.cast:
//            Cast, ApplicationMetadata

public static interface 
    extends Result
{

    public abstract ApplicationMetadata getApplicationMetadata();

    public abstract String getApplicationStatus();

    public abstract String getSessionId();

    public abstract boolean getWasLaunched();
}
