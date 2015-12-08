// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;

// Referenced classes of package android.support.v4.media:
//            MediaMetadataCompat, RatingCompat

public final class _cls00
{

    private final Bundle mBundle;

    public final MediaMetadataCompat build()
    {
        return new MediaMetadataCompat(mBundle, null);
    }

    public final mBundle putBitmap(String s, Bitmap bitmap)
    {
        if (MediaMetadataCompat.access$200().containsKey(s) && ((Integer)MediaMetadataCompat.access$200().get(s)).intValue() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder("The ")).append(s).append(" key cannot be used to put a Bitmap").toString());
        } else
        {
            mBundle.putParcelable(s, bitmap);
            return this;
        }
    }

    public final mBundle putLong(String s, long l)
    {
        if (MediaMetadataCompat.access$200().containsKey(s) && ((Integer)MediaMetadataCompat.access$200().get(s)).intValue() != 0)
        {
            throw new IllegalArgumentException((new StringBuilder("The ")).append(s).append(" key cannot be used to put a long").toString());
        } else
        {
            mBundle.putLong(s, l);
            return this;
        }
    }

    public final mBundle putRating(String s, RatingCompat ratingcompat)
    {
        if (MediaMetadataCompat.access$200().containsKey(s) && ((Integer)MediaMetadataCompat.access$200().get(s)).intValue() != 3)
        {
            throw new IllegalArgumentException((new StringBuilder("The ")).append(s).append(" key cannot be used to put a Rating").toString());
        } else
        {
            mBundle.putParcelable(s, ratingcompat);
            return this;
        }
    }

    public final mBundle putString(String s, String s1)
    {
        if (MediaMetadataCompat.access$200().containsKey(s) && ((Integer)MediaMetadataCompat.access$200().get(s)).intValue() != 1)
        {
            throw new IllegalArgumentException((new StringBuilder("The ")).append(s).append(" key cannot be used to put a String").toString());
        } else
        {
            mBundle.putCharSequence(s, s1);
            return this;
        }
    }

    public final mBundle putText(String s, CharSequence charsequence)
    {
        if (MediaMetadataCompat.access$200().containsKey(s) && ((Integer)MediaMetadataCompat.access$200().get(s)).intValue() != 1)
        {
            throw new IllegalArgumentException((new StringBuilder("The ")).append(s).append(" key cannot be used to put a CharSequence").toString());
        } else
        {
            mBundle.putCharSequence(s, charsequence);
            return this;
        }
    }

    public ()
    {
        mBundle = new Bundle();
    }

    public mBundle(MediaMetadataCompat mediametadatacompat)
    {
        mBundle = new Bundle(MediaMetadataCompat.access$100(mediametadatacompat));
    }
}
