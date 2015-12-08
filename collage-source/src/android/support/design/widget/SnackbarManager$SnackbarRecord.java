// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import java.lang.ref.WeakReference;

// Referenced classes of package android.support.design.widget:
//            SnackbarManager

private static class duration
{

    private final WeakReference callback;
    private int duration;

    boolean isSnackbar(duration duration1)
    {
        return duration1 != null && callback.get() == duration1;
    }



/*
    static int access$102( , int i)
    {
        .duration = i;
        return i;
    }

*/


    duration(int i, duration duration1)
    {
        callback = new WeakReference(duration1);
        duration = i;
    }
}
