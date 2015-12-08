// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media:
//            MediaDescriptionCompat

public final class 
{

    private CharSequence mDescription;
    private Bundle mExtras;
    private Bitmap mIcon;
    private Uri mIconUri;
    private String mMediaId;
    private CharSequence mSubtitle;
    private CharSequence mTitle;

    public final MediaDescriptionCompat build()
    {
        return new MediaDescriptionCompat(mMediaId, mTitle, mSubtitle, mDescription, mIcon, mIconUri, mExtras, null);
    }

    public final mExtras setDescription(CharSequence charsequence)
    {
        mDescription = charsequence;
        return this;
    }

    public final mDescription setExtras(Bundle bundle)
    {
        mExtras = bundle;
        return this;
    }

    public final mExtras setIconBitmap(Bitmap bitmap)
    {
        mIcon = bitmap;
        return this;
    }

    public final mIcon setIconUri(Uri uri)
    {
        mIconUri = uri;
        return this;
    }

    public final mIconUri setMediaId(String s)
    {
        mMediaId = s;
        return this;
    }

    public final mMediaId setSubtitle(CharSequence charsequence)
    {
        mSubtitle = charsequence;
        return this;
    }

    public final mSubtitle setTitle(CharSequence charsequence)
    {
        mTitle = charsequence;
        return this;
    }

    public ()
    {
    }
}
