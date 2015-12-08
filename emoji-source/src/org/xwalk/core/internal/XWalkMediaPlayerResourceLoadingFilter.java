// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import android.net.Uri;

// Referenced classes of package org.xwalk.core.internal:
//            AndroidProtocolHandler

class XWalkMediaPlayerResourceLoadingFilter extends org.chromium.media.MediaPlayerBridge.ResourceLoadingFilter
{

    XWalkMediaPlayerResourceLoadingFilter()
    {
    }

    public boolean shouldOverrideResourceLoading(MediaPlayer mediaplayer, Context context, Uri uri)
    {
        Uri uri1 = uri;
        if (uri.getScheme().equals("app"))
        {
            uri1 = AndroidProtocolHandler.appUriToFileUri(uri);
        }
        if (!uri1.getScheme().equals("file"))
        {
            return false;
        }
        try
        {
            context = context.getAssets().openFd(AndroidProtocolHandler.getAssetPath(uri1));
            mediaplayer.setDataSource(context.getFileDescriptor(), context.getStartOffset(), context.getLength());
        }
        // Misplaced declaration of an exception variable
        catch (MediaPlayer mediaplayer)
        {
            return false;
        }
        return true;
    }
}
