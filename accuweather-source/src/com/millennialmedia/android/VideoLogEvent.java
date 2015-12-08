// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.millennialmedia.android;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.millennialmedia.android:
//            MMLog

class VideoLogEvent
    implements Parcelable, Externalizable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public VideoLogEvent createFromParcel(Parcel parcel)
        {
            return new VideoLogEvent(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public VideoLogEvent[] newArray(int i)
        {
            return new VideoLogEvent[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    private static final String TAG = com/millennialmedia/android/VideoLogEvent.getName();
    static final long serialVersionUID = 0xb0a600850e2f008L;
    String activities[];
    long position;

    public VideoLogEvent()
    {
    }

    VideoLogEvent(Parcel parcel)
    {
        try
        {
            position = parcel.readLong();
            activities = new String[parcel.readInt()];
            parcel.readStringArray(activities);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            MMLog.e(TAG, "VideoLogEvent parcel creation exception: ", parcel);
        }
    }

    VideoLogEvent(JSONObject jsonobject)
    {
        deserializeFromObj(jsonobject);
    }

    private void deserializeFromObj(JSONObject jsonobject)
    {
        if (jsonobject != null)
        {
            position = jsonobject.optInt("time") * 1000;
            jsonobject = jsonobject.optJSONArray("urls");
            if (jsonobject != null)
            {
                activities = new String[jsonobject.length()];
                int i = 0;
                while (i < jsonobject.length()) 
                {
                    activities[i] = jsonobject.optString(i);
                    i++;
                }
            } else
            {
                activities = new String[0];
                return;
            }
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public void readExternal(ObjectInput objectinput)
        throws IOException, ClassNotFoundException
    {
        position = objectinput.readLong();
        int j = objectinput.readInt();
        activities = new String[j];
        for (int i = 0; i < j; i++)
        {
            activities[i] = (String)objectinput.readObject();
        }

    }

    public void writeExternal(ObjectOutput objectoutput)
        throws IOException
    {
        objectoutput.writeLong(position);
        objectoutput.writeInt(activities.length);
        String as[] = activities;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            objectoutput.writeObject(as[i]);
        }

    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(position);
        parcel.writeInt(activities.length);
        parcel.writeStringArray(activities);
    }

}
