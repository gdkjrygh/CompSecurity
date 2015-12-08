// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.common.api.Status;

public final class kph
    implements kpv
{

    private static final Status a = new Status(13);

    public kph()
    {
    }

    static Status a()
    {
        return a;
    }

    public final jyt a(jyn jyn1, Activity activity, Intent intent)
    {
        return jyn1.a(new kpi(this, jyn1, intent, null, activity));
    }

}
