// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.clearcut;

import android.content.Context;
import com.google.android.gms.common.api.PendingResult;

// Referenced classes of package com.google.android.gms.clearcut:
//            LogEventParcelable

public interface ClearcutLoggerApi
{

    public abstract PendingResult logEventAsync(Context context, LogEventParcelable logeventparcelable);
}
