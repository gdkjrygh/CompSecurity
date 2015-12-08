// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.beta;

import android.content.Context;
import io.fabric.sdk.android.services.c.c;
import io.fabric.sdk.android.services.common.IdManager;
import io.fabric.sdk.android.services.common.j;
import io.fabric.sdk.android.services.settings.f;

// Referenced classes of package com.crashlytics.android.beta:
//            Beta, BuildProperties

interface UpdatesController
{

    public abstract void a(Context context, Beta beta, IdManager idmanager, f f, BuildProperties buildproperties, c c, j j, 
            io.fabric.sdk.android.services.network.c c1);
}
