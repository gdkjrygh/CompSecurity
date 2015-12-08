// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.core;

import android.util.Pair;

// Referenced classes of package com.nbcsports.liveextra.library.core:
//            PollingSubscriber

public static interface 
{

    public abstract boolean enableNulls();

    public abstract int getMaxRetries();

    public abstract Pair getPollingInterval(Object obj);

    public abstract String getUrl();
}
