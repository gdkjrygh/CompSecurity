// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.UserManager;

public final class dbs
{

    public static boolean a(Context context)
    {
        return android.os.Build.VERSION.SDK_INT >= 18 && ((UserManager)context.getSystemService("user")).getUserRestrictions().getBoolean("no_modify_accounts", false);
    }
}
