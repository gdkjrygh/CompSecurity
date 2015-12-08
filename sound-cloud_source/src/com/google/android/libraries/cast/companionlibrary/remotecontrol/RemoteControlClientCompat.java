// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.remotecontrol;

import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.media.RemoteControlClient;
import android.support.v7.media.MediaRouter;

public class RemoteControlClientCompat
{
    public class MetadataEditorCompat
    {

        public static final int METADATA_KEY_ARTWORK = 100;
        private final Object mActualMetadataEditor;
        final RemoteControlClientCompat this$0;

        public final void apply()
        {
            if (RemoteControlClientCompat.HAS_REMOTE_CONTROL_APIS)
            {
                ((android.media.RemoteControlClient.MetadataEditor)mActualMetadataEditor).apply();
            }
        }

        public final void clear()
        {
            if (RemoteControlClientCompat.HAS_REMOTE_CONTROL_APIS)
            {
                ((android.media.RemoteControlClient.MetadataEditor)mActualMetadataEditor).clear();
            }
        }

        public final MetadataEditorCompat putBitmap(int i, Bitmap bitmap)
        {
            if (RemoteControlClientCompat.HAS_REMOTE_CONTROL_APIS)
            {
                ((android.media.RemoteControlClient.MetadataEditor)mActualMetadataEditor).putBitmap(i, bitmap);
            }
            return this;
        }

        public final MetadataEditorCompat putLong(int i, long l)
        {
            if (RemoteControlClientCompat.HAS_REMOTE_CONTROL_APIS)
            {
                ((android.media.RemoteControlClient.MetadataEditor)mActualMetadataEditor).putLong(i, l);
            }
            return this;
        }

        public final MetadataEditorCompat putString(int i, String s)
        {
            if (RemoteControlClientCompat.HAS_REMOTE_CONTROL_APIS)
            {
                ((android.media.RemoteControlClient.MetadataEditor)mActualMetadataEditor).putString(i, s);
            }
            return this;
        }

        private MetadataEditorCompat(Object obj)
        {
            this$0 = RemoteControlClientCompat.this;
            super();
            if (RemoteControlClientCompat.HAS_REMOTE_CONTROL_APIS && obj == null)
            {
                throw new IllegalArgumentException("Remote Control API's exist, should not be given a null MetadataEditor");
            } else
            {
                mActualMetadataEditor = obj;
                return;
            }
        }

        MetadataEditorCompat(Object obj, _cls1 _pcls1)
        {
            this(obj);
        }
    }


    private static final boolean HAS_REMOTE_CONTROL_APIS;
    private Object mActualRemoteControlClient;

    public RemoteControlClientCompat(PendingIntent pendingintent)
    {
        if (!HAS_REMOTE_CONTROL_APIS)
        {
            return;
        } else
        {
            mActualRemoteControlClient = new RemoteControlClient(pendingintent);
            return;
        }
    }

    public final void addToMediaRouter(MediaRouter mediarouter)
    {
        if (mActualRemoteControlClient != null)
        {
            mediarouter.addRemoteControlClient(mActualRemoteControlClient);
        }
    }

    public final MetadataEditorCompat editMetadata(boolean flag)
    {
        android.media.RemoteControlClient.MetadataEditor metadataeditor;
        if (HAS_REMOTE_CONTROL_APIS)
        {
            metadataeditor = ((RemoteControlClient)mActualRemoteControlClient).editMetadata(flag);
        } else
        {
            metadataeditor = null;
        }
        return new MetadataEditorCompat(metadataeditor, null);
    }

    public final Object getActualRemoteControlClientObject()
    {
        return mActualRemoteControlClient;
    }

    public final void removeFromMediaRouter(MediaRouter mediarouter)
    {
        if (mActualRemoteControlClient != null)
        {
            mediarouter.removeRemoteControlClient(mActualRemoteControlClient);
        }
    }

    public final void setPlaybackState(int i)
    {
        if (HAS_REMOTE_CONTROL_APIS)
        {
            ((RemoteControlClient)mActualRemoteControlClient).setPlaybackState(i);
        }
    }

    public final void setTransportControlFlags(int i)
    {
        if (HAS_REMOTE_CONTROL_APIS)
        {
            ((RemoteControlClient)mActualRemoteControlClient).setTransportControlFlags(i);
        }
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        HAS_REMOTE_CONTROL_APIS = flag;
    }

}
