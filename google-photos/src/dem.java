// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;

public final class dem
{

    public final View a;

    public dem(View view)
    {
        a = view;
        if (android.os.Build.VERSION.SDK_INT >= 19)
        {
            view.setAccessibilityLiveRegion(1);
        }
    }
}
