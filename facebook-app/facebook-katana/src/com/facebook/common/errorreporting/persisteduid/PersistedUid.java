// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.errorreporting.persisteduid;

import android.content.Context;
import com.facebook.acra.ErrorReporter;

// Referenced classes of package com.facebook.common.errorreporting.persisteduid:
//            UserIdFileReader

public final class PersistedUid
{

    private PersistedUid()
    {
    }

    public static void a(Context context, ErrorReporter errorreporter)
    {
        errorreporter.putLazyCustomData("persisted_uid", new UserIdFileReader(context));
    }
}
