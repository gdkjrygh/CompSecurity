// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import org.chromium.base.ThreadUtils;

// Referenced classes of package org.chromium.content.browser:
//            ContentViewCore

public class ContentSettings
{

    static final boolean $assertionsDisabled;
    private static final String TAG = "ContentSettings";
    private ContentViewCore mContentViewCore;
    private long mNativeContentSettings;

    ContentSettings(ContentViewCore contentviewcore, long l)
    {
        mNativeContentSettings = 0L;
        ThreadUtils.assertOnUiThread();
        mContentViewCore = contentviewcore;
        mNativeContentSettings = nativeInit(l);
        if (!$assertionsDisabled && mNativeContentSettings == 0L)
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    private native boolean nativeGetJavaScriptEnabled(long l);

    private native long nativeInit(long l);

    private void onNativeContentSettingsDestroyed(long l)
    {
        if (!$assertionsDisabled && mNativeContentSettings != l)
        {
            throw new AssertionError();
        } else
        {
            mNativeContentSettings = 0L;
            return;
        }
    }

    public boolean getJavaScriptEnabled()
    {
        ThreadUtils.assertOnUiThread();
        if (mNativeContentSettings != 0L)
        {
            return nativeGetJavaScriptEnabled(mNativeContentSettings);
        } else
        {
            return false;
        }
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/ContentSettings.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
