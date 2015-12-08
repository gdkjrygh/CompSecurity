// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.developer;

import android.view.View;
import com.pinterest.kit.autoupdate.AutoUpdateManager;

final class ager
    implements android.view.er
{

    public final void onClick(View view)
    {
        AutoUpdateManager.a().startUpdate(null);
    }

    ager()
    {
    }
}
