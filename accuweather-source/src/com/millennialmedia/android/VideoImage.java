// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.ImageButton;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.millennialmedia.android:
//            MMLog

class VideoImage
    implements Parcelable, Externalizable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public VideoImage createFromParcel(Parcel parcel)
        {
            return new VideoImage(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public VideoImage[] newArray(int i)
        {
            return new VideoImage[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final String TAG = com/millennialmedia/android/VideoImage.getName();
    static final long serialVersionUID = 0xb37c805a5f2be9dL;
    int anchor;
    int anchor2;
    long appearanceDelay;
    ImageButton button;
    long contentLength;
    String eventLoggingUrls[];
    long fadeDuration;
    float fromAlpha;
    String imageUrl;
    long inactivityTimeout;
    boolean isLeaveBehind;
    android.widget.RelativeLayout.LayoutParams layoutParams;
    String linkUrl;
    String overlayOrientation;
    int paddingBottom;
    int paddingLeft;
    int paddingRight;
    int paddingTop;
    int position;
    int position2;
    float toAlpha;

    public VideoImage()
    {
        paddingTop = 0;
        paddingBottom = 0;
        paddingLeft = 0;
        paddingRight = 0;
        fromAlpha = 1.0F;
        toAlpha = 1.0F;
        fadeDuration = 1000L;
    }

    VideoImage(Parcel parcel)
    {
        boolean flag;
        flag = true;
        super();
        paddingTop = 0;
        paddingBottom = 0;
        paddingLeft = 0;
        paddingRight = 0;
        fromAlpha = 1.0F;
        toAlpha = 1.0F;
        fadeDuration = 1000L;
        imageUrl = parcel.readString();
        contentLength = parcel.readLong();
        eventLoggingUrls = new String[parcel.readInt()];
        parcel.readStringArray(eventLoggingUrls);
        linkUrl = parcel.readString();
        overlayOrientation = parcel.readString();
        paddingTop = parcel.readInt();
        paddingBottom = parcel.readInt();
        paddingLeft = parcel.readInt();
        paddingRight = parcel.readInt();
        position = parcel.readInt();
        anchor = parcel.readInt();
        position2 = parcel.readInt();
        anchor2 = parcel.readInt();
        appearanceDelay = parcel.readLong();
        inactivityTimeout = parcel.readLong();
        fromAlpha = parcel.readFloat();
        toAlpha = parcel.readFloat();
        fadeDuration = parcel.readLong();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        isLeaveBehind = flag;
        return;
        parcel;
        MMLog.e(TAG, "VideoImage parcel creation exception: ", parcel);
        return;
    }

    VideoImage(JSONObject jsonobject)
    {
        paddingTop = 0;
        paddingBottom = 0;
        paddingLeft = 0;
        paddingRight = 0;
        fromAlpha = 1.0F;
        toAlpha = 1.0F;
        fadeDuration = 1000L;
        deserializeFromObj(jsonobject);
    }

    private void deserializeFromObj(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            return;
        }
        imageUrl = jsonobject.optString("image", null);
        contentLength = jsonobject.optLong("contentLength");
        Object obj = jsonobject.optJSONArray("activity");
        if (obj != null)
        {
            eventLoggingUrls = new String[((JSONArray) (obj)).length()];
            for (int i = 0; i < ((JSONArray) (obj)).length(); i++)
            {
                eventLoggingUrls[i] = ((JSONArray) (obj)).optString(i);
            }

        } else
        {
            eventLoggingUrls = new String[0];
        }
        linkUrl = jsonobject.optString("url", null);
        overlayOrientation = jsonobject.optString("overlayOrientation", null);
        position = jsonobject.optInt("android-layout");
        anchor = jsonobject.optInt("android-layoutAnchor");
        position2 = jsonobject.optInt("android-layout2");
        anchor2 = jsonobject.optInt("android-layoutAnchor2");
        paddingTop = jsonobject.optInt("android-paddingTop");
        paddingLeft = jsonobject.optInt("android-paddingLeft");
        paddingRight = jsonobject.optInt("android-paddingRight");
        paddingBottom = jsonobject.optInt("android-paddingBottom");
        appearanceDelay = (long)(jsonobject.optDouble("appearanceDelay", 0.0D) * 1000D);
        inactivityTimeout = (long)(jsonobject.optDouble("inactivityTimeout", 0.0D) * 1000D);
        obj = jsonobject.optJSONObject("opacity");
        if (obj != null)
        {
            fromAlpha = (float)((JSONObject) (obj)).optDouble("start", 1.0D);
            toAlpha = (float)((JSONObject) (obj)).optDouble("end", 1.0D);
            fadeDuration = (long)(((JSONObject) (obj)).optDouble("fadeDuration", 1.0D) * 1000D);
        }
        isLeaveBehind = jsonobject.optBoolean("is_leavebehind");
    }

    public int describeContents()
    {
        return 0;
    }

    String getImageName()
    {
        if (imageUrl != null)
        {
            Uri uri = Uri.parse(imageUrl);
            if (uri != null && uri.getLastPathSegment() != null)
            {
                return uri.getLastPathSegment().replaceFirst("\\.[^\\.]*$", ".dat");
            }
        }
        return null;
    }

    public void readExternal(ObjectInput objectinput)
        throws IOException, ClassNotFoundException
    {
        imageUrl = (String)objectinput.readObject();
        contentLength = objectinput.readLong();
        int j = objectinput.readInt();
        eventLoggingUrls = new String[j];
        for (int i = 0; i < j; i++)
        {
            eventLoggingUrls[i] = (String)objectinput.readObject();
        }

        linkUrl = (String)objectinput.readObject();
        overlayOrientation = (String)objectinput.readObject();
        paddingTop = objectinput.readInt();
        paddingBottom = objectinput.readInt();
        paddingLeft = objectinput.readInt();
        paddingRight = objectinput.readInt();
        position = objectinput.readInt();
        anchor = objectinput.readInt();
        position2 = objectinput.readInt();
        anchor2 = objectinput.readInt();
        appearanceDelay = objectinput.readLong();
        inactivityTimeout = objectinput.readLong();
        fromAlpha = objectinput.readFloat();
        toAlpha = objectinput.readFloat();
        fadeDuration = objectinput.readLong();
        isLeaveBehind = objectinput.readBoolean();
    }

    public void writeExternal(ObjectOutput objectoutput)
        throws IOException
    {
        objectoutput.writeObject(imageUrl);
        objectoutput.writeLong(contentLength);
        objectoutput.writeInt(eventLoggingUrls.length);
        String as[] = eventLoggingUrls;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            objectoutput.writeObject(as[i]);
        }

        objectoutput.writeObject(linkUrl);
        objectoutput.writeObject(overlayOrientation);
        objectoutput.writeInt(paddingTop);
        objectoutput.writeInt(paddingBottom);
        objectoutput.writeInt(paddingLeft);
        objectoutput.writeInt(paddingRight);
        objectoutput.writeInt(position);
        objectoutput.writeInt(anchor);
        objectoutput.writeInt(position2);
        objectoutput.writeInt(anchor2);
        objectoutput.writeLong(appearanceDelay);
        objectoutput.writeLong(inactivityTimeout);
        objectoutput.writeFloat(fromAlpha);
        objectoutput.writeFloat(toAlpha);
        objectoutput.writeLong(fadeDuration);
        objectoutput.writeBoolean(isLeaveBehind);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(imageUrl);
        parcel.writeLong(contentLength);
        parcel.writeInt(eventLoggingUrls.length);
        parcel.writeStringArray(eventLoggingUrls);
        parcel.writeString(linkUrl);
        parcel.writeString(overlayOrientation);
        parcel.writeInt(paddingTop);
        parcel.writeInt(paddingBottom);
        parcel.writeInt(paddingLeft);
        parcel.writeInt(paddingRight);
        parcel.writeInt(position);
        parcel.writeInt(anchor);
        parcel.writeInt(position2);
        parcel.writeInt(anchor2);
        parcel.writeLong(appearanceDelay);
        parcel.writeLong(inactivityTimeout);
        parcel.writeFloat(fromAlpha);
        parcel.writeFloat(toAlpha);
        parcel.writeLong(fadeDuration);
        if (isLeaveBehind)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

}
