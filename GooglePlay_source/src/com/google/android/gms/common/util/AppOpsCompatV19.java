// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.util;

import android.app.AppOpsManager;
import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.common.util:
//            AppOpsCompat

public class AppOpsCompatV19 extends AppOpsCompat
    implements android.app.AppOpsManager.OnOpChangedListener
{

    private final AppOpsManager mAppOpsManager;
    private AtomicReference mLastRegisteredListener;

    AppOpsCompatV19(Context context)
    {
        mAppOpsManager = (AppOpsManager)context.getSystemService("appops");
        mLastRegisteredListener = new AtomicReference();
    }

    public final int noteOpNoThrow(String s, int i, String s1)
    {
        return mAppOpsManager.noteOpNoThrow(s, i, s1);
    }

    public void onOpChanged(String s, String s1)
    {
        mLastRegisteredListener.get();
    }
}
