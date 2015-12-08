// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Intent;

public final class ee
{

    private static final ef a;

    public static Intent a(ComponentName componentname)
    {
        return a.a(componentname);
    }

    static 
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 15)
        {
            a = new eh();
        } else
        if (i >= 11)
        {
            a = new eg();
        } else
        {
            a = new ef();
        }
    }
}
