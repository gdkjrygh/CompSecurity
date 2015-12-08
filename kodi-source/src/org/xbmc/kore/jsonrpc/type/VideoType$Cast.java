// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.xbmc.kore.utils.JsonUtils;
import org.xbmc.kore.utils.LogUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            VideoType

public static class thumbnail
    implements Parcelable
{

    public static final android.os.tor CREATOR = new android.os.Parcelable.Creator() {

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public VideoType.Cast createFromParcel(Parcel parcel)
        {
            return new VideoType.Cast(parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        public VideoType.Cast[] newArray(int i)
        {
            return new VideoType.Cast[i];
        }

    };
    public final String name;
    public final int order;
    public final String role;
    public final String thumbnail;

    public static List castListFromJsonNode(JsonNode jsonnode, String s)
    {
        if (jsonnode != null && jsonnode.has(s)) goto _L2; else goto _L1
_L1:
        jsonnode = new ArrayList(0);
_L4:
        return jsonnode;
_L2:
        jsonnode = jsonnode.get(s);
        if (!jsonnode.isArray())
        {
            LogUtils.LOGD(VideoType.access$000(), (new StringBuilder()).append("Cast node isn't an array, it's a: ").append(jsonnode.getNodeType()).toString());
            return new ArrayList(0);
        }
        jsonnode = (ArrayNode)jsonnode;
        s = new ArrayList(jsonnode.size());
        Iterator iterator = jsonnode.iterator();
        do
        {
            jsonnode = s;
            if (!iterator.hasNext())
            {
                continue;
            }
            s.add(new <init>((JsonNode)iterator.next()));
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(name);
        parcel.writeInt(order);
        parcel.writeString(role);
        parcel.writeString(thumbnail);
    }


    public _cls1(JsonNode jsonnode)
    {
        name = JsonUtils.stringFromJsonNode(jsonnode, "name");
        order = JsonUtils.intFromJsonNode(jsonnode, "order", 0);
        role = JsonUtils.stringFromJsonNode(jsonnode, "role");
        thumbnail = JsonUtils.stringFromJsonNode(jsonnode, "thumbnail");
    }

    public onNode(String s, int i, String s1, String s2)
    {
        name = s;
        order = i;
        role = s1;
        thumbnail = s2;
    }
}
