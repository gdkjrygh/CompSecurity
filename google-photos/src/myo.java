// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;

final class myo
    implements mye
{

    private final SharedPreferences a;

    public myo(Context context)
    {
        a = context.getSharedPreferences("ExperimentOverrideStoreImpl", 0);
    }

    public final String a(myc myc1)
    {
        return a.getString(myc1.a, null);
    }
}
