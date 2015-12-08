// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;

final class mwg
{

    SharedPreferences a;

    public mwg(Context context)
    {
        a = context.getSharedPreferences("app_info_shared_prefs", 0);
    }
}
