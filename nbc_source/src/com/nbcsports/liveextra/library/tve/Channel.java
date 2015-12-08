// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.tve;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.bytecode.opencsv.CSVReader;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.library.tve:
//            ChannelParcelablePlease

public class Channel
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public Channel createFromParcel(Parcel parcel)
        {
            Channel channel = new Channel();
            ChannelParcelablePlease.readFromParcel(channel, parcel);
            return channel;
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public Channel[] newArray(int i)
        {
            return new Channel[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    List mvpdPremium;
    List mvpdStandard;
    String requestorId;
    String resourceId;
    String signedRequestorId;

    public Channel()
    {
    }

    public Channel(Parcel parcel)
    {
    }

    public static List parse(InputStream inputstream)
    {
        Object obj1;
        obj1 = new CSVReader(new BufferedReader(new InputStreamReader(inputstream)));
        inputstream = new ArrayList();
        Object obj = ((CSVReader) (obj1)).readAll();
        inputstream = ((InputStream) (obj));
        ((CSVReader) (obj1)).close();
        inputstream = ((InputStream) (obj));
_L4:
        obj1 = new ArrayList();
_L3:
        Object obj2;
        int i;
        for (i = 1; i >= inputstream.size();)
        {
            break MISSING_BLOCK_LABEL_285;
        }

        obj2 = (String[])inputstream.get(i);
        Channel channel = new Channel();
        if (obj2[0] != null)
        {
            obj = obj2[0];
        } else
        {
            obj = "";
        }
        channel.setResourceId(((String) (obj)));
        if (obj2[1] != null)
        {
            obj = obj2[1];
        } else
        {
            obj = "";
        }
        channel.setRequestorId(((String) (obj)));
        if (obj2[2] != null)
        {
            obj = obj2[2];
        } else
        {
            obj = "";
        }
        channel.setSignedRequestorId(((String) (obj)));
        if (obj2[3] == null) goto _L2; else goto _L1
_L1:
        obj = Arrays.asList(obj2[3].split(","));
_L5:
        channel.setMvpdPremium(((List) (obj)));
        if (obj2[4] == null)
        {
            break MISSING_BLOCK_LABEL_274;
        }
        obj = Arrays.asList(obj2[4].split(","));
_L7:
        channel.setMvpdStandard(((List) (obj)));
        ((List) (obj1)).add(channel);
_L6:
        i++;
          goto _L3
        obj;
        ((IOException) (obj)).printStackTrace();
          goto _L4
_L2:
        obj = new ArrayList();
          goto _L5
        obj;
        obj2 = StringUtils.join(new Serializable[] {
            ",", obj2
        });
        Timber.i(((Throwable) (obj)), (new StringBuilder()).append("Error deserializing channel info: ").append(((String) (obj2))).toString(), new Object[0]);
          goto _L6
        obj = new ArrayList();
          goto _L7
        return ((List) (obj1));
          goto _L3
    }

    protected boolean canEqual(Object obj)
    {
        return obj instanceof Channel;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof Channel))
            {
                return false;
            }
            obj = (Channel)obj;
            if (!((Channel) (obj)).canEqual(this))
            {
                return false;
            }
            Object obj1 = getResourceId();
            Object obj2 = ((Channel) (obj)).getResourceId();
            if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
            {
                return false;
            }
            obj1 = getRequestorId();
            obj2 = ((Channel) (obj)).getRequestorId();
            if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
            {
                return false;
            }
            obj1 = getSignedRequestorId();
            obj2 = ((Channel) (obj)).getSignedRequestorId();
            if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
            {
                return false;
            }
            obj1 = getMvpdPremium();
            obj2 = ((Channel) (obj)).getMvpdPremium();
            if (obj1 != null ? !obj1.equals(obj2) : obj2 != null)
            {
                return false;
            }
            obj1 = getMvpdStandard();
            obj = ((Channel) (obj)).getMvpdStandard();
            if (obj1 != null ? !obj1.equals(obj) : obj != null)
            {
                return false;
            }
        }
        return true;
    }

    public List getMvpdPremium()
    {
        return mvpdPremium;
    }

    public List getMvpdStandard()
    {
        return mvpdStandard;
    }

    public String getRequestorId()
    {
        return requestorId;
    }

    public String getResourceId()
    {
        return resourceId;
    }

    public String getSignedRequestorId()
    {
        return signedRequestorId;
    }

    public boolean hasMvpd(Mvpd mvpd)
    {
        return mvpdPremium.contains(mvpd.getId()) || mvpdStandard.contains(mvpd.getId());
    }

    public int hashCode()
    {
        int i1 = 0;
        Object obj = getResourceId();
        int i;
        int j;
        int k;
        int l;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        obj = getRequestorId();
        if (obj == null)
        {
            j = 0;
        } else
        {
            j = obj.hashCode();
        }
        obj = getSignedRequestorId();
        if (obj == null)
        {
            k = 0;
        } else
        {
            k = obj.hashCode();
        }
        obj = getMvpdPremium();
        if (obj == null)
        {
            l = 0;
        } else
        {
            l = obj.hashCode();
        }
        obj = getMvpdStandard();
        if (obj != null)
        {
            i1 = obj.hashCode();
        }
        return ((((i + 59) * 59 + j) * 59 + k) * 59 + l) * 59 + i1;
    }

    public void setMvpdPremium(List list)
    {
        mvpdPremium = list;
    }

    public void setMvpdStandard(List list)
    {
        mvpdStandard = list;
    }

    public void setRequestorId(String s)
    {
        requestorId = s;
    }

    public void setResourceId(String s)
    {
        resourceId = s;
    }

    public void setSignedRequestorId(String s)
    {
        signedRequestorId = s;
    }

    public String toString()
    {
        return (new StringBuilder()).append("Channel(resourceId=").append(getResourceId()).append(", requestorId=").append(getRequestorId()).append(", signedRequestorId=").append(getSignedRequestorId()).append(", mvpdPremium=").append(getMvpdPremium()).append(", mvpdStandard=").append(getMvpdStandard()).append(")").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ChannelParcelablePlease.writeToParcel(this, parcel, i);
    }

}
