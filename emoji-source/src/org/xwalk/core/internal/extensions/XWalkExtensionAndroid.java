// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extensions;

import android.util.Log;

public abstract class XWalkExtensionAndroid
{

    private static final String TAG = "XWalkExtensionAndroid";
    private long mXWalkExtension;

    public XWalkExtensionAndroid(String s, String s1)
    {
        mXWalkExtension = nativeGetOrCreateExtension(s, s1, null);
    }

    public XWalkExtensionAndroid(String s, String s1, String as[])
    {
        mXWalkExtension = nativeGetOrCreateExtension(s, s1, as);
    }

    private native void nativeBroadcastMessage(long l, String s);

    private native void nativeDestroyExtension(long l);

    private native long nativeGetOrCreateExtension(String s, String s1, String as[]);

    private native void nativePostMessage(long l, int i, String s);

    public void broadcastMessage(String s)
    {
        if (mXWalkExtension == 0L)
        {
            Log.e("XWalkExtensionAndroid", "Can not broadcast message to an invalid extension!");
            return;
        } else
        {
            nativeBroadcastMessage(mXWalkExtension, s);
            return;
        }
    }

    protected void destroyExtension()
    {
        if (mXWalkExtension == 0L)
        {
            Log.e("XWalkExtensionAndroid", "The extension to be destroyed is invalid!");
            return;
        } else
        {
            nativeDestroyExtension(mXWalkExtension);
            mXWalkExtension = 0L;
            return;
        }
    }

    public abstract void onMessage(int i, String s);

    public abstract String onSyncMessage(int i, String s);

    public void postMessage(int i, String s)
    {
        if (mXWalkExtension == 0L)
        {
            Log.e("XWalkExtensionAndroid", "Can not post a message to an invalid extension!");
            return;
        } else
        {
            nativePostMessage(mXWalkExtension, i, s);
            return;
        }
    }
}
