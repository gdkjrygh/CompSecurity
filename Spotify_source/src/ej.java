// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;

public final class ej
{

    public final Bundle a = new Bundle();

    public ej()
    {
    }

    public final MediaMetadataCompat a()
    {
        return new MediaMetadataCompat(a, (byte)0);
    }

    public final ej a(String s, long l)
    {
        if (MediaMetadataCompat.b().containsKey(s) && ((Integer)MediaMetadataCompat.b().get(s)).intValue() != 0)
        {
            throw new IllegalArgumentException((new StringBuilder("The ")).append(s).append(" key cannot be used to put a long").toString());
        } else
        {
            a.putLong(s, l);
            return this;
        }
    }

    public final ej a(String s, Bitmap bitmap)
    {
        if (MediaMetadataCompat.b().containsKey(s) && ((Integer)MediaMetadataCompat.b().get(s)).intValue() != 2)
        {
            throw new IllegalArgumentException((new StringBuilder("The ")).append(s).append(" key cannot be used to put a Bitmap").toString());
        } else
        {
            a.putParcelable(s, bitmap);
            return this;
        }
    }

    public final ej a(String s, String s1)
    {
        if (MediaMetadataCompat.b().containsKey(s) && ((Integer)MediaMetadataCompat.b().get(s)).intValue() != 1)
        {
            throw new IllegalArgumentException((new StringBuilder("The ")).append(s).append(" key cannot be used to put a String").toString());
        } else
        {
            a.putCharSequence(s, s1);
            return this;
        }
    }
}
