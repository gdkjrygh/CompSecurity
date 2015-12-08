// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.List;

// Referenced classes of package android.support.v4.media:
//            MediaBrowserCompat

private static class mMediaBrowser extends mMediaBrowser
{

    private WeakReference mMediaBrowser;

    public void onConnect(String s, android.support.v4.media.session.owser owser, Bundle bundle)
    {
        mMediaBrowser mmediabrowser = (mMediaBrowser)mMediaBrowser.get();
        if (mmediabrowser != null)
        {
            mMediaBrowser(mmediabrowser, this, s, owser, bundle);
        }
    }

    public void onConnectFailed()
    {
        mMediaBrowser mmediabrowser = (mMediaBrowser)mMediaBrowser.get();
        if (mmediabrowser != null)
        {
            mMediaBrowser(mmediabrowser, this);
        }
    }

    public void onLoadChildren(String s, List list)
    {
        mMediaBrowser mmediabrowser = (mMediaBrowser)mMediaBrowser.get();
        if (mmediabrowser != null)
        {
            mMediaBrowser(mmediabrowser, this, s, list);
        }
    }

    public ( )
    {
        mMediaBrowser = new WeakReference();
    }
}
