// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.ik;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.analytics:
//            am, ax, ca

public class AnalyticsServiceEvent
    implements Parcelable, am
{

    public static final android.os.Parcelable.Creator CREATOR = new ax();
    private static final Class a = com/facebook/analytics/AnalyticsServiceEvent;
    private static final String b[] = {
        "type", "time", "uid", "bkgd", "data"
    };
    private final String c;
    private final long d;
    private final String e;
    private final boolean f;
    private final JsonNode g;
    private final Map h;

    private AnalyticsServiceEvent(Parcel parcel)
    {
        h = ik.a();
        String as[];
        java.util.Map.Entry entry;
        String s;
        int i;
        int j;
        try
        {
            parcel = (new ObjectMapper()).readTree(parcel.readString());
            as = b;
            j = as.length;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw new ParcelFormatException((new StringBuilder()).append("Failed to process event ").append(parcel.toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw new ParcelFormatException((new StringBuilder()).append("Failed to process event ").append(parcel.toString()).toString());
        }
        i = 0;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        s = as[i];
        if (!parcel.has(s))
        {
            throw new ParcelFormatException((new StringBuilder()).append("Missing required field ").append(s).toString());
        }
        i++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_37;
_L1:
        c = parcel.get("type").textValue();
        d = parcel.get("time").longValue();
        e = parcel.get("uid").textValue();
        f = parcel.get("bkgd").booleanValue();
        g = parcel.get("data");
        if (parcel.has("tags"))
        {
            for (parcel = parcel.get("tags").fields(); parcel.hasNext(); h.put(entry.getKey(), ((JsonNode)entry.getValue()).textValue()))
            {
                entry = (java.util.Map.Entry)parcel.next();
            }

        }
    }

    AnalyticsServiceEvent(Parcel parcel, ax ax1)
    {
        this(parcel);
    }

    public AnalyticsServiceEvent(ca ca1)
    {
        h = ik.a();
        c = ca1.a();
        d = ca1.b();
        e = ca1.c();
        f = ca1.d();
        String s;
        for (Iterator iterator = ca1.g().iterator(); iterator.hasNext(); h.put(s, ca1.b(s)))
        {
            s = (String)iterator.next();
        }

        g = ca1.e();
    }

    public String a()
    {
        return c;
    }

    public boolean a(String s)
    {
        return h.containsKey(s);
    }

    public long b()
    {
        return d;
    }

    public String b(String s)
    {
        return (String)h.get(s);
    }

    public String c()
    {
        return e;
    }

    public boolean d()
    {
        return f;
    }

    public int describeContents()
    {
        return 0;
    }

    public JsonNode e()
    {
        return g;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("type", a());
        objectnode.put("time", b());
        objectnode.put("uid", c());
        objectnode.put("bkgd", d());
        objectnode.put("data", e());
        if (h.size() > 0)
        {
            ObjectNode objectnode1 = new ObjectNode(JsonNodeFactory.instance);
            java.util.Map.Entry entry;
            for (Iterator iterator = h.entrySet().iterator(); iterator.hasNext(); objectnode1.put((String)entry.getKey(), (String)entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

            objectnode.put("tags", objectnode1);
        }
        parcel.writeString(objectnode.toString());
    }

}
