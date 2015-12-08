// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import android.content.Context;
import android.content.SharedPreferences;

public final class kg
{

    public final SharedPreferences a;

    public kg(Context context)
    {
        a = context.getSharedPreferences("com.appboy.offline.storagemap", 0);
    }

    public final String a()
    {
        return a.getString("last_user", "");
    }
}
