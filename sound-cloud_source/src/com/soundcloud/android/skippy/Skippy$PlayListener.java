// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.skippy;


// Referenced classes of package com.soundcloud.android.skippy:
//            Skippy

public static interface c
{

    public abstract void onDownloadPerformed(long l, long l1, int i, int j, String s);

    public abstract void onErrorMessage(String s, String s1, int i, String s2, String s3, String s4);

    public abstract void onInitializationError(Throwable throwable, String s);

    public abstract void onPerformanceMeasured(c c, long l, String s, String s1);

    public abstract void onProgressChange(long l, long l1, String s);

    public abstract void onStateChanged(c c, c c1, c c2, long l, long l1, 
            String s);
}
