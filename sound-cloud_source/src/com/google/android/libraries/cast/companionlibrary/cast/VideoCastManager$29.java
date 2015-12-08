// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast;

import android.graphics.Bitmap;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import com.google.android.libraries.cast.companionlibrary.utils.FetchBitmapTask;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast:
//            VideoCastManager

class it> extends FetchBitmapTask
{

    final VideoCastManager this$0;

    protected void onPostExecute(Bitmap bitmap)
    {
        Object obj = VideoCastManager.access$800(VideoCastManager.this).getController().getMetadata();
        if (obj == null)
        {
            obj = new android.support.v4.media.Builder();
        } else
        {
            obj = new android.support.v4.media.Builder(((android.support.v4.media.MediaMetadataCompat) (obj)));
        }
        VideoCastManager.access$800(VideoCastManager.this).setMetadata(((android.support.v4.media.Builder) (obj)).putBitmap("android.media.metadata.ALBUM_ART", bitmap).build());
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Bitmap)obj);
    }

    Q()
    {
        this$0 = VideoCastManager.this;
        super();
    }
}
