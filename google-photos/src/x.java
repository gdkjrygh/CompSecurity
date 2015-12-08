// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;

public final class x extends ed
{

    public static void a(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            activity.finishAffinity();
            return;
        } else
        {
            activity.finish();
            return;
        }
    }
}
