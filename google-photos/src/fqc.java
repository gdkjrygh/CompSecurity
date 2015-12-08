// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;

public final class fqc
{

    private final Context a;

    fqc(Context context)
    {
        a = context;
    }

    public final boolean a()
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            return a.getResources().getConfiguration().getLayoutDirection() == 1;
        } else
        {
            return false;
        }
    }
}
