// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.os.Bundle;

final class fv
{

    static int a(int i)
    {
        switch (i)
        {
        default:
            return -1;

        case 6: // '\006'
        case 8: // '\b'
            return 8;

        case 7: // '\007'
            return 9;

        case 4: // '\004'
            return 4;

        case 0: // '\0'
            return 0;

        case 2: // '\002'
            return 2;

        case 3: // '\003'
            return 3;

        case 5: // '\005'
            return 5;

        case 9: // '\t'
            return 7;

        case 10: // '\n'
        case 11: // '\013'
            return 6;

        case 1: // '\001'
            return 1;
        }
    }

    static int a(long l)
    {
        int j = 0;
        if ((1L & l) != 0L)
        {
            j = 32;
        }
        int i = j;
        if ((2L & l) != 0L)
        {
            i = j | 0x10;
        }
        j = i;
        if ((4L & l) != 0L)
        {
            j = i | 4;
        }
        i = j;
        if ((8L & l) != 0L)
        {
            i = j | 2;
        }
        j = i;
        if ((16L & l) != 0L)
        {
            j = i | 1;
        }
        i = j;
        if ((32L & l) != 0L)
        {
            i = j | 0x80;
        }
        j = i;
        if ((64L & l) != 0L)
        {
            j = i | 0x40;
        }
        i = j;
        if ((512L & l) != 0L)
        {
            i = j | 8;
        }
        return i;
    }

    public static void a(Context context, Object obj)
    {
        ((AudioManager)context.getSystemService("audio")).unregisterRemoteControlClient((RemoteControlClient)obj);
    }

    static void a(Bundle bundle, android.media.RemoteControlClient.MetadataEditor metadataeditor)
    {
        if (bundle != null)
        {
            if (bundle.containsKey("android.media.metadata.ART"))
            {
                metadataeditor.putBitmap(100, (Bitmap)bundle.getParcelable("android.media.metadata.ART"));
            } else
            if (bundle.containsKey("android.media.metadata.ALBUM_ART"))
            {
                metadataeditor.putBitmap(100, (Bitmap)bundle.getParcelable("android.media.metadata.ALBUM_ART"));
            }
            if (bundle.containsKey("android.media.metadata.ALBUM"))
            {
                metadataeditor.putString(1, bundle.getString("android.media.metadata.ALBUM"));
            }
            if (bundle.containsKey("android.media.metadata.ALBUM_ARTIST"))
            {
                metadataeditor.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.ARTIST"))
            {
                metadataeditor.putString(2, bundle.getString("android.media.metadata.ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.AUTHOR"))
            {
                metadataeditor.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
            }
            if (bundle.containsKey("android.media.metadata.COMPILATION"))
            {
                metadataeditor.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
            }
            if (bundle.containsKey("android.media.metadata.COMPOSER"))
            {
                metadataeditor.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
            }
            if (bundle.containsKey("android.media.metadata.DATE"))
            {
                metadataeditor.putString(5, bundle.getString("android.media.metadata.DATE"));
            }
            if (bundle.containsKey("android.media.metadata.DISC_NUMBER"))
            {
                metadataeditor.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.DURATION"))
            {
                metadataeditor.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
            }
            if (bundle.containsKey("android.media.metadata.GENRE"))
            {
                metadataeditor.putString(6, bundle.getString("android.media.metadata.GENRE"));
            }
            if (bundle.containsKey("android.media.metadata.TITLE"))
            {
                metadataeditor.putString(7, bundle.getString("android.media.metadata.TITLE"));
            }
            if (bundle.containsKey("android.media.metadata.TRACK_NUMBER"))
            {
                metadataeditor.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.WRITER"))
            {
                metadataeditor.putString(11, bundle.getString("android.media.metadata.WRITER"));
                return;
            }
        }
    }

    public static void a(Object obj, int i)
    {
        ((RemoteControlClient)obj).setPlaybackState(a(i));
    }

    public static void a(Object obj, long l)
    {
        ((RemoteControlClient)obj).setTransportControlFlags(a(l));
    }
}
