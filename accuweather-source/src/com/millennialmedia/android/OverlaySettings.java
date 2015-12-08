// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

// Referenced classes of package com.millennialmedia.android:
//            HttpMMHeaders, MMLog

class OverlaySettings
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public OverlaySettings createFromParcel(Parcel parcel)
        {
            return new OverlaySettings(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public OverlaySettings[] newArray(int i)
        {
            return new OverlaySettings[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    static final String PROPERTIES_ACID = "acid";
    static final String PROPERTIES_ALLOW_ORIENTATION_CHANGE = "allowOrientationChange";
    static final String PROPERTIES_CUSTOM_CLOSE = "useCustomClose";
    static final String PROPERTIES_ENABLE_HARDWARE_ACCEL = "enableHardwareAccel";
    static final String PROPERTIES_FORCE_ORIENTATION = "forceOrientation";
    static final String PROPERTIES_HEIGHT = "height";
    static final String PROPERTIES_MODAL = "modal";
    static final String PROPERTIES_ORIENTATION = "orientation";
    static final String PROPERTIES_TRANSITION = "transition";
    static final String PROPERTIES_TRANSITION_DURATION = "transitionDuration";
    static final String PROPERTIES_TRANSPARENT = "transparent";
    static final String PROPERTIES_WIDTH = "width";
    private static final String TAG = "OverlaySettings";
    String adUrl;
    boolean allowOrientationChange;
    String content;
    long creatorAdImplId;
    boolean hasLoadedExpandUrl;
    int height;
    boolean isFromInterstitial;
    private boolean isTransparent;
    HttpMMHeaders mmHeaders;
    boolean modal;
    String orientation;
    boolean shouldLaunchToOverlay;
    int shouldResizeOverlay;
    private String transition;
    private long transitionTimeInMillis;
    String urlToLoad;
    private boolean useCustomClose;
    int width;

    OverlaySettings()
    {
        transition = "";
        orientation = "";
        urlToLoad = "";
        allowOrientationChange = true;
        content = "";
        adUrl = "";
        hasLoadedExpandUrl = false;
    }

    OverlaySettings(Parcel parcel)
    {
        long l;
        l = 0L;
        super();
        transition = "";
        orientation = "";
        urlToLoad = "";
        allowOrientationChange = true;
        content = "";
        adUrl = "";
        hasLoadedExpandUrl = false;
        boolean aflag[] = new boolean[6];
        parcel.readBooleanArray(aflag);
        shouldLaunchToOverlay = aflag[0];
        isTransparent = aflag[1];
        useCustomClose = aflag[2];
        modal = aflag[3];
        isFromInterstitial = aflag[4];
        allowOrientationChange = aflag[5];
        shouldResizeOverlay = parcel.readInt();
        transition = parcel.readString();
        transitionTimeInMillis = parcel.readLong();
        if (transitionTimeInMillis >= 0L)
        {
            try
            {
                l = transitionTimeInMillis;
            }
            // Misplaced declaration of an exception variable
            catch (Parcel parcel)
            {
                MMLog.e("OverlaySettings", "Exception Overlaysettings creationg from parcel: ", parcel);
                return;
            }
        }
        transitionTimeInMillis = l;
        orientation = parcel.readString();
        creatorAdImplId = parcel.readLong();
        urlToLoad = parcel.readString();
        height = parcel.readInt();
        width = parcel.readInt();
        content = parcel.readString();
        adUrl = parcel.readString();
        mmHeaders = (HttpMMHeaders)parcel.readParcelable(com/millennialmedia/android/HttpMMHeaders.getClassLoader());
        return;
    }

    public int describeContents()
    {
        return 0;
    }

    boolean enableHardwareAccel()
    {
        return mmHeaders != null && mmHeaders.enableHardwareAccel;
    }

    String getAcid()
    {
        if (mmHeaders != null && !TextUtils.isEmpty(mmHeaders.acid))
        {
            return mmHeaders.acid;
        } else
        {
            return "";
        }
    }

    boolean getIsTransparent()
    {
        return isTransparent || mmHeaders != null && mmHeaders.isTransparent;
    }

    String getTransition()
    {
        if (!TextUtils.isEmpty(transition))
        {
            return transition;
        }
        if (mmHeaders != null && !TextUtils.isEmpty(mmHeaders.transition))
        {
            return mmHeaders.transition;
        } else
        {
            return "none";
        }
    }

    long getTransitionDurationInMillis()
    {
        long l = 0L;
        if (transitionTimeInMillis > 0L)
        {
            l = transitionTimeInMillis;
        } else
        if (mmHeaders != null)
        {
            return mmHeaders.transitionTimeInMillis;
        }
        return l;
    }

    boolean getUseCustomClose()
    {
        return useCustomClose || mmHeaders != null && mmHeaders.useCustomClose;
    }

    boolean hasExpandUrl()
    {
        return urlToLoad != null && !urlToLoad.equals("");
    }

    boolean hasLoadedExpandUrl()
    {
        boolean flag = true;
        if (!hasLoadedExpandUrl)
        {
            hasLoadedExpandUrl = true;
            flag = false;
        }
        return flag;
    }

    boolean isExpanded()
    {
        return !isFromInterstitial && creatorAdImplId != 0L;
    }

    boolean isFromInterstitial()
    {
        return isFromInterstitial && creatorAdImplId != 0L;
    }

    void log()
    {
        MMLog.v("OverlaySettings", toString());
    }

    void setIsTransparent(boolean flag)
    {
        isTransparent = flag;
    }

    void setTransition(String s)
    {
        transition = s;
    }

    void setTransitionDurationInMillis(long l)
    {
        transitionTimeInMillis = l;
    }

    void setUseCustomClose(boolean flag)
    {
        useCustomClose = flag;
    }

    void setWebMMHeaders(HttpMMHeaders httpmmheaders)
    {
        mmHeaders = httpmmheaders;
    }

    public String toString()
    {
        return String.format("height %d width %d modal %b urlToLoad %s creatorAdImplId %s shouldResizeOverlay: %d transitionTime: %d overlayTransition: %s shouldMakeOverlayTransparent: %b shouldShowCustomClose: %b Orientation: %s", new Object[] {
            Integer.valueOf(height), Integer.valueOf(width), Boolean.valueOf(modal), urlToLoad, Long.valueOf(creatorAdImplId), Integer.valueOf(shouldResizeOverlay), Long.valueOf(transitionTimeInMillis), transition, Boolean.valueOf(isTransparent), Boolean.valueOf(useCustomClose), 
            orientation
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeBooleanArray(new boolean[] {
            shouldLaunchToOverlay, isTransparent, useCustomClose, modal, isFromInterstitial, allowOrientationChange
        });
        parcel.writeInt(shouldResizeOverlay);
        parcel.writeString(transition);
        parcel.writeLong(transitionTimeInMillis);
        parcel.writeString(orientation);
        parcel.writeLong(creatorAdImplId);
        parcel.writeString(urlToLoad);
        parcel.writeInt(height);
        parcel.writeInt(width);
        parcel.writeString(content);
        parcel.writeString(adUrl);
        parcel.writeParcelable(mmHeaders, i);
    }

}
