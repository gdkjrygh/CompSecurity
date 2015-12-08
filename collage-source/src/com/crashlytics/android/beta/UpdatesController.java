// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;

import android.content.Context;
import io.fabric.sdk.android.services.b.e;
import io.fabric.sdk.android.services.c.b;
import io.fabric.sdk.android.services.common.j;
import io.fabric.sdk.android.services.common.n;
import io.fabric.sdk.android.services.d.f;

// Referenced classes of package com.crashlytics.android.beta:
//            Beta, BuildProperties

interface UpdatesController
{

    public abstract void initialize(Context context, Beta beta, n n, f f, BuildProperties buildproperties, b b, j j, 
            e e);

    public abstract boolean isActivityLifecycleTriggered();
}
