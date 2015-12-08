// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;

public class dst
{

    private final Context a;

    dst(Context context)
    {
        a = context;
    }

    public SharedPreferences a()
    {
        return a.getSharedPreferences("analytics", 0);
    }
}
