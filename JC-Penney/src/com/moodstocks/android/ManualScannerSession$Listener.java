// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android;

import android.graphics.Bitmap;

// Referenced classes of package com.moodstocks.android:
//            MoodstocksError, Result

public interface 
{

    public abstract void onCameraOpenFailed(Exception exception);

    public abstract void onError(MoodstocksError moodstockserror);

    public abstract void onResult(Result result, Bitmap bitmap);

    public abstract void onServerSearchStart();

    public abstract void onWarning(String s);
}
