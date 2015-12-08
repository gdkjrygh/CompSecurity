// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.Context;
import android.content.IntentFilter;

// Referenced classes of package org.chromium.content.browser:
//            TracingControllerAndroid

private static class addAction extends IntentFilter
{

    (Context context)
    {
        addAction((new StringBuilder()).append(context.getPackageName()).append(".").append("GPU_PROFILER_START").toString());
        addAction((new StringBuilder()).append(context.getPackageName()).append(".").append("GPU_PROFILER_STOP").toString());
        addAction((new StringBuilder()).append(context.getPackageName()).append(".").append("GPU_PROFILER_LIST_CATEGORIES").toString());
    }
}
