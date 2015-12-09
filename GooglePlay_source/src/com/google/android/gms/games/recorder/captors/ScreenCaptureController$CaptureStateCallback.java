// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.captors;

import android.net.Uri;

// Referenced classes of package com.google.android.gms.games.recorder.captors:
//            ScreenCaptureController

public static interface 
{

    public abstract void onCaptureError(int i);

    public abstract void onCaptureStarted();

    public abstract void onCaptureStopped(Uri uri);
}
