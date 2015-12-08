// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.player;

import android.graphics.Bitmap;
import android.net.Uri;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.player:
//            VideoCastControllerFragment

private class <init>
{

    private Bitmap mBitmap;
    private Uri mUrl;
    final VideoCastControllerFragment this$0;

    private boolean isMatch(Uri uri)
    {
        return uri != null && mBitmap != null && uri.equals(mUrl);
    }




/*
    static Bitmap access$1402( , Bitmap bitmap)
    {
        .mBitmap = bitmap;
        return bitmap;
    }

*/


/*
    static Uri access$1702(mBitmap mbitmap, Uri uri)
    {
        mbitmap.mUrl = uri;
        return uri;
    }

*/

    private mUrl()
    {
        this$0 = VideoCastControllerFragment.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
