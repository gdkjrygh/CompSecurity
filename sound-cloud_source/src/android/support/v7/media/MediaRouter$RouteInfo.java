// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//            MediaRouter, MediaRouteSelector, MediaRouteDescriptor, MediaRouteProvider

public static final class mUniqueId
{

    static final int CHANGE_GENERAL = 1;
    static final int CHANGE_PRESENTATION_DISPLAY = 4;
    static final int CHANGE_VOLUME = 2;
    public static final int PLAYBACK_TYPE_LOCAL = 0;
    public static final int PLAYBACK_TYPE_REMOTE = 1;
    public static final int PLAYBACK_VOLUME_FIXED = 0;
    public static final int PLAYBACK_VOLUME_VARIABLE = 1;
    private boolean mCanDisconnect;
    private boolean mConnecting;
    private final ArrayList mControlFilters = new ArrayList();
    private String mDescription;
    private MediaRouteDescriptor mDescriptor;
    private final String mDescriptorId;
    private boolean mEnabled;
    private Bundle mExtras;
    private String mName;
    private int mPlaybackStream;
    private int mPlaybackType;
    private Display mPresentationDisplay;
    private int mPresentationDisplayId;
    private final fo mProvider;
    private IntentSender mSettingsIntent;
    private final String mUniqueId;
    private int mVolume;
    private int mVolumeHandling;
    private int mVolumeMax;

    public final boolean canDisconnect()
    {
        return mCanDisconnect;
    }

    public final List getControlFilters()
    {
        return mControlFilters;
    }

    public final String getDescription()
    {
        return mDescription;
    }

    final String getDescriptorId()
    {
        return mDescriptorId;
    }

    public final Bundle getExtras()
    {
        return mExtras;
    }

    public final String getId()
    {
        return mUniqueId;
    }

    public final String getName()
    {
        return mName;
    }

    public final int getPlaybackStream()
    {
        return mPlaybackStream;
    }

    public final int getPlaybackType()
    {
        return mPlaybackType;
    }

    public final Display getPresentationDisplay()
    {
        MediaRouter.checkCallingThread();
        if (mPresentationDisplayId >= 0 && mPresentationDisplay == null)
        {
            mPresentationDisplay = MediaRouter.sGlobal.getDisplay(mPresentationDisplayId);
        }
        return mPresentationDisplay;
    }

    public final fo getProvider()
    {
        return mProvider;
    }

    final MediaRouteProvider getProviderInstance()
    {
        return mProvider.getProviderInstance();
    }

    public final IntentSender getSettingsIntent()
    {
        return mSettingsIntent;
    }

    public final int getVolume()
    {
        return mVolume;
    }

    public final int getVolumeHandling()
    {
        return mVolumeHandling;
    }

    public final int getVolumeMax()
    {
        return mVolumeMax;
    }

    public final boolean isConnecting()
    {
        return mConnecting;
    }

    public final boolean isDefault()
    {
        MediaRouter.checkCallingThread();
        return MediaRouter.sGlobal.getDefaultRoute() == this;
    }

    public final boolean isEnabled()
    {
        return mEnabled;
    }

    public final boolean isSelected()
    {
        MediaRouter.checkCallingThread();
        return MediaRouter.sGlobal.getSelectedRoute() == this;
    }

    public final boolean matchesSelector(MediaRouteSelector mediarouteselector)
    {
        if (mediarouteselector == null)
        {
            throw new IllegalArgumentException("selector must not be null");
        } else
        {
            MediaRouter.checkCallingThread();
            return mediarouteselector.matchesControlFilters(mControlFilters);
        }
    }

    public final void requestSetVolume(int i)
    {
        MediaRouter.checkCallingThread();
        MediaRouter.sGlobal.requestSetVolume(this, Math.min(mVolumeMax, Math.max(0, i)));
    }

    public final void requestUpdateVolume(int i)
    {
        MediaRouter.checkCallingThread();
        if (i != 0)
        {
            MediaRouter.sGlobal.requestUpdateVolume(this, i);
        }
    }

    public final void select()
    {
        MediaRouter.checkCallingThread();
        MediaRouter.sGlobal.selectRoute(this);
    }

    public final void sendControlRequest(Intent intent, uestCallback uestcallback)
    {
        if (intent == null)
        {
            throw new IllegalArgumentException("intent must not be null");
        } else
        {
            MediaRouter.checkCallingThread();
            MediaRouter.sGlobal.sendControlRequest(this, intent, uestcallback);
            return;
        }
    }

    public final boolean supportsControlAction(String s, String s1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("category must not be null");
        }
        if (s1 == null)
        {
            throw new IllegalArgumentException("action must not be null");
        }
        MediaRouter.checkCallingThread();
        int j = mControlFilters.size();
        for (int i = 0; i < j; i++)
        {
            IntentFilter intentfilter = (IntentFilter)mControlFilters.get(i);
            if (intentfilter.hasCategory(s) && intentfilter.hasAction(s1))
            {
                return true;
            }
        }

        return false;
    }

    public final boolean supportsControlCategory(String s)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("category must not be null");
        }
        MediaRouter.checkCallingThread();
        int j = mControlFilters.size();
        for (int i = 0; i < j; i++)
        {
            if (((IntentFilter)mControlFilters.get(i)).hasCategory(s))
            {
                return true;
            }
        }

        return false;
    }

    public final boolean supportsControlRequest(Intent intent)
    {
        if (intent == null)
        {
            throw new IllegalArgumentException("intent must not be null");
        }
        MediaRouter.checkCallingThread();
        android.content.ContentResolver contentresolver = MediaRouter.sGlobal.getContentResolver();
        int j = mControlFilters.size();
        for (int i = 0; i < j; i++)
        {
            if (((IntentFilter)mControlFilters.get(i)).match(contentresolver, intent, true, "MediaRouter") >= 0)
            {
                return true;
            }
        }

        return false;
    }

    public final String toString()
    {
        return (new StringBuilder("MediaRouter.RouteInfo{ uniqueId=")).append(mUniqueId).append(", name=").append(mName).append(", description=").append(mDescription).append(", enabled=").append(mEnabled).append(", connecting=").append(mConnecting).append(", canDisconnect=").append(mCanDisconnect).append(", playbackType=").append(mPlaybackType).append(", playbackStream=").append(mPlaybackStream).append(", volumeHandling=").append(mVolumeHandling).append(", volume=").append(mVolume).append(", volumeMax=").append(mVolumeMax).append(", presentationDisplayId=").append(mPresentationDisplayId).append(", extras=").append(mExtras).append(", settingsIntent=").append(mSettingsIntent).append(", providerPackageName=").append(mProvider.getPackageName()).append(" }").toString();
    }

    final int updateDescriptor(MediaRouteDescriptor mediaroutedescriptor)
    {
label0:
        {
            int j = 1;
            boolean flag1 = false;
            boolean flag = false;
            int i = ((flag1) ? 1 : 0);
            if (mDescriptor != mediaroutedescriptor)
            {
                mDescriptor = mediaroutedescriptor;
                i = ((flag1) ? 1 : 0);
                if (mediaroutedescriptor != null)
                {
                    i = ((flag) ? 1 : 0);
                    if (!MediaRouter.equal(mName, mediaroutedescriptor.getName()))
                    {
                        mName = mediaroutedescriptor.getName();
                        i = 1;
                    }
                    if (!MediaRouter.equal(mDescription, mediaroutedescriptor.getDescription()))
                    {
                        mDescription = mediaroutedescriptor.getDescription();
                        i = 1;
                    }
                    if (mEnabled != mediaroutedescriptor.isEnabled())
                    {
                        mEnabled = mediaroutedescriptor.isEnabled();
                    } else
                    {
                        j = i;
                    }
                    i = j;
                    if (mConnecting != mediaroutedescriptor.isConnecting())
                    {
                        mConnecting = mediaroutedescriptor.isConnecting();
                        i = j | true;
                    }
                    j = i;
                    if (!mControlFilters.equals(mediaroutedescriptor.getControlFilters()))
                    {
                        mControlFilters.clear();
                        mControlFilters.addAll(mediaroutedescriptor.getControlFilters());
                        j = i | 1;
                    }
                    i = j;
                    if (mPlaybackType != mediaroutedescriptor.getPlaybackType())
                    {
                        mPlaybackType = mediaroutedescriptor.getPlaybackType();
                        i = j | true;
                    }
                    j = i;
                    if (mPlaybackStream != mediaroutedescriptor.getPlaybackStream())
                    {
                        mPlaybackStream = mediaroutedescriptor.getPlaybackStream();
                        j = i | 1;
                    }
                    i = j;
                    if (mVolumeHandling != mediaroutedescriptor.getVolumeHandling())
                    {
                        mVolumeHandling = mediaroutedescriptor.getVolumeHandling();
                        i = j | 3;
                    }
                    j = i;
                    if (mVolume != mediaroutedescriptor.getVolume())
                    {
                        mVolume = mediaroutedescriptor.getVolume();
                        j = i | 3;
                    }
                    i = j;
                    if (mVolumeMax != mediaroutedescriptor.getVolumeMax())
                    {
                        mVolumeMax = mediaroutedescriptor.getVolumeMax();
                        i = j | 3;
                    }
                    j = i;
                    if (mPresentationDisplayId != mediaroutedescriptor.getPresentationDisplayId())
                    {
                        mPresentationDisplayId = mediaroutedescriptor.getPresentationDisplayId();
                        mPresentationDisplay = null;
                        j = i | 5;
                    }
                    i = j;
                    if (!MediaRouter.equal(mExtras, mediaroutedescriptor.getExtras()))
                    {
                        mExtras = mediaroutedescriptor.getExtras();
                        i = j | 1;
                    }
                    j = i;
                    if (!MediaRouter.equal(mSettingsIntent, mediaroutedescriptor.getSettingsActivity()))
                    {
                        mSettingsIntent = mediaroutedescriptor.getSettingsActivity();
                        j = i | 1;
                    }
                    if (mCanDisconnect == mediaroutedescriptor.canDisconnectAndKeepPlaying())
                    {
                        break label0;
                    }
                    mCanDisconnect = mediaroutedescriptor.canDisconnectAndKeepPlaying();
                    i = j | 5;
                }
            }
            return i;
        }
        return j;
    }





    fo(fo fo, String s, String s1)
    {
        mPresentationDisplayId = -1;
        mProvider = fo;
        mDescriptorId = s;
        mUniqueId = s1;
    }
}
