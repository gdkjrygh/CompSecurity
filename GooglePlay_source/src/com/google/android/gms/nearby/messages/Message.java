// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.nearby.messages;

import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.messages.devices.NearbyDevice;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.nearby.messages:
//            MessageCreator

public class Message
    implements SafeParcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new MessageCreator();
    private static final NearbyDevice UNKNOWN_DEVICE_SINGLETON[];
    public final byte content[];
    final NearbyDevice devices[];
    final String namespace;
    public final String type;
    final int versionCode;

    Message(int i, byte abyte0[], String s, String s1, NearbyDevice anearbydevice[])
    {
        boolean flag;
label0:
        {
            super();
            versionCode = i;
            type = (String)Preconditions.checkNotNull(s1);
            String s2 = s;
            if (s == null)
            {
                s2 = "";
            }
            namespace = s2;
            s = namespace;
            s2 = type;
            if (s.equals("__reserved_namespace") && s2.equals("__device_presence"))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                if (abyte0 == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag, "Content must be null for a device presence message.");
            } else
            {
                Preconditions.checkNotNull(abyte0);
                if (abyte0.length <= 0x19000)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag, "Content length(%d) must not exceed MAX_CONTENT_SIZE_BYTES(%d)", new Object[] {
                    Integer.valueOf(abyte0.length), Integer.valueOf(0x19000)
                });
            }
            content = abyte0;
            if (anearbydevice != null)
            {
                abyte0 = anearbydevice;
                if (anearbydevice.length != 0)
                {
                    break label0;
                }
            }
            abyte0 = UNKNOWN_DEVICE_SINGLETON;
        }
        devices = abyte0;
        if (s1.length() <= 32)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Type length(%d) must not exceed MAX_TYPE_LENGTH(%d)", new Object[] {
            Integer.valueOf(s1.length()), Integer.valueOf(32)
        });
    }

    public Message(byte abyte0[], String s)
    {
        this(abyte0, "", s);
    }

    private Message(byte abyte0[], String s, String s1)
    {
        this(abyte0, s, s1, UNKNOWN_DEVICE_SINGLETON);
    }

    private Message(byte abyte0[], String s, String s1, NearbyDevice anearbydevice[])
    {
        this(2, abyte0, s, s1, anearbydevice);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof Message))
            {
                return false;
            }
            obj = (Message)obj;
            if (!TextUtils.equals(namespace, ((Message) (obj)).namespace) || !TextUtils.equals(type, ((Message) (obj)).type) || !Arrays.equals(content, ((Message) (obj)).content))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            namespace, type, Integer.valueOf(Arrays.hashCode(content))
        });
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("Message{namespace='")).append(namespace).append("', type='").append(type).append("', content=[");
        int i;
        if (content == null)
        {
            i = 0;
        } else
        {
            i = content.length;
        }
        return stringbuilder.append(i).append(" bytes], devices=").append(Arrays.toString(devices)).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        MessageCreator.writeToParcel(this, parcel, i);
    }

    static 
    {
        UNKNOWN_DEVICE_SINGLETON = (new NearbyDevice[] {
            NearbyDevice.UNKNOWN_DEVICE
        });
    }
}
