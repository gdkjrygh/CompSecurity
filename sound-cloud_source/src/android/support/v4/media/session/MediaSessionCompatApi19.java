// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media.session;

import android.media.Rating;
import android.media.RemoteControlClient;
import android.os.Bundle;

// Referenced classes of package android.support.v4.media.session:
//            MediaSessionCompatApi18, MediaSessionCompatApi14

public class MediaSessionCompatApi19
{
    static class OnMetadataUpdateListener
        implements android.media.RemoteControlClient.OnMetadataUpdateListener
    {

        protected final MediaSessionCompatApi14.Callback mCallback;

        public void onMetadataUpdate(int i, Object obj)
        {
            if (i == 0x10000001 && (obj instanceof Rating))
            {
                mCallback.onSetRating(obj);
            }
        }

        public OnMetadataUpdateListener(MediaSessionCompatApi14.Callback callback)
        {
            mCallback = callback;
        }
    }


    private static final long ACTION_SET_RATING = 128L;
    private static final String METADATA_KEY_RATING = "android.media.metadata.RATING";
    private static final String METADATA_KEY_USER_RATING = "android.media.metadata.USER_RATING";
    private static final String METADATA_KEY_YEAR = "android.media.metadata.YEAR";

    public MediaSessionCompatApi19()
    {
    }

    static void addNewMetadata(Bundle bundle, android.media.RemoteControlClient.MetadataEditor metadataeditor)
    {
        if (bundle != null)
        {
            if (bundle.containsKey("android.media.metadata.YEAR"))
            {
                metadataeditor.putLong(8, bundle.getLong("android.media.metadata.YEAR"));
            }
            if (bundle.containsKey("android.media.metadata.RATING"))
            {
                metadataeditor.putObject(101, bundle.getParcelable("android.media.metadata.RATING"));
            }
            if (bundle.containsKey("android.media.metadata.USER_RATING"))
            {
                metadataeditor.putObject(0x10000001, bundle.getParcelable("android.media.metadata.USER_RATING"));
                return;
            }
        }
    }

    public static Object createMetadataUpdateListener(MediaSessionCompatApi14.Callback callback)
    {
        return new OnMetadataUpdateListener(callback);
    }

    static int getRccTransportControlFlagsFromActions(long l)
    {
        int j = MediaSessionCompatApi18.getRccTransportControlFlagsFromActions(l);
        int i = j;
        if ((128L & l) != 0L)
        {
            i = j | 0x200;
        }
        return i;
    }

    public static void setMetadata(Object obj, Bundle bundle, long l)
    {
        obj = ((RemoteControlClient)obj).editMetadata(true);
        MediaSessionCompatApi14.buildOldMetadata(bundle, ((android.media.RemoteControlClient.MetadataEditor) (obj)));
        addNewMetadata(bundle, ((android.media.RemoteControlClient.MetadataEditor) (obj)));
        if ((128L & l) != 0L)
        {
            ((android.media.RemoteControlClient.MetadataEditor) (obj)).addEditableKey(0x10000001);
        }
        ((android.media.RemoteControlClient.MetadataEditor) (obj)).apply();
    }

    public static void setOnMetadataUpdateListener(Object obj, Object obj1)
    {
        ((RemoteControlClient)obj).setMetadataUpdateListener((android.media.RemoteControlClient.OnMetadataUpdateListener)obj1);
    }

    public static void setTransportControlFlags(Object obj, long l)
    {
        ((RemoteControlClient)obj).setTransportControlFlags(getRccTransportControlFlagsFromActions(l));
    }
}
