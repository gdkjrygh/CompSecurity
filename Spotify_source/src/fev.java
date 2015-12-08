// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;
import com.spotify.mobile.android.spotlets.running.service.RunningService;

public final class fev extends Binder
{

    final RunningService a;

    public fev(RunningService runningservice)
    {
        a = runningservice;
        super();
    }
}
