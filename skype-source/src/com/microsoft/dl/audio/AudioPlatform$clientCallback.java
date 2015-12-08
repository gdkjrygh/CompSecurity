// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.dl.audio;

import android.util.Log;

// Referenced classes of package com.microsoft.dl.audio:
//            AudioPlatform

public static class _cls9
{

    public void callbackWithError(String s)
    {
        if (Log.isLoggable("DLAudioJava", 4))
        {
            Log.i("DLAudioJava", "Callback Route Change with error");
        }
    }

    public void callbackWithoutError(String s)
    {
        if (Log.isLoggable("DLAudioJava", 4))
        {
            Log.i("DLAudioJava", "Callback Route Change without error");
        }
    }

    public _cls9()
    {
    }
}
