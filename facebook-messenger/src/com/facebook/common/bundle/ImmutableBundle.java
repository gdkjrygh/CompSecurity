// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.bundle;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.debug.log.b;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.common.bundle:
//            b

public class ImmutableBundle
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new com.facebook.common.bundle.b();
    private static final Class a = com/facebook/common/bundle/ImmutableBundle;
    private final Bundle b;

    public ImmutableBundle(Bundle bundle)
    {
        b = new Bundle(bundle);
        for (bundle = b.keySet().iterator(); bundle.hasNext();)
        {
            String s = (String)bundle.next();
            Object obj = b.get(s);
            if (!a(obj))
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Unsupported value type in bundle for key ").append(s).append(" with value ").append(obj).toString());
            }
        }

    }

    private ImmutableBundle(Parcel parcel)
    {
        this(parcel.readBundle());
    }

    ImmutableBundle(Parcel parcel, com.facebook.common.bundle.b b1)
    {
        this(parcel);
    }

    public static ImmutableBundle a(JsonNode jsonnode)
    {
        Bundle bundle = new Bundle();
        for (jsonnode = jsonnode.fields(); jsonnode.hasNext();)
        {
            Object obj = (java.util.Map.Entry)jsonnode.next();
            String s = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = (JsonNode)((java.util.Map.Entry) (obj)).getValue();
            if (((JsonNode) (obj)).isTextual())
            {
                bundle.putString(s, ((JsonNode) (obj)).asText());
            } else
            if (((JsonNode) (obj)).isInt())
            {
                bundle.putInt(s, ((JsonNode) (obj)).asInt());
            } else
            if (((JsonNode) (obj)).isLong())
            {
                bundle.putLong(s, ((JsonNode) (obj)).asLong());
            } else
            if (((JsonNode) (obj)).isFloatingPointNumber())
            {
                bundle.putDouble(s, ((JsonNode) (obj)).asDouble());
            } else
            if (((JsonNode) (obj)).isBoolean())
            {
                bundle.putBoolean(s, ((JsonNode) (obj)).asBoolean());
            } else
            {
                com.facebook.debug.log.b.d(a, "Unsupported value type in bundle for key %s with value %s", new Object[] {
                    s, ((JsonNode) (obj)).toString()
                });
            }
        }

        return new ImmutableBundle(bundle);
    }

    private boolean a(Object obj)
    {
        return (obj instanceof String) || (obj instanceof Integer) || (obj instanceof Double) || (obj instanceof Boolean) || (obj instanceof Short) || (obj instanceof Character) || (obj instanceof Byte) || (obj instanceof Long) || (obj instanceof Float);
    }

    public JsonNode a()
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        Iterator iterator = b.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            Object obj = b.get(s);
            if (obj instanceof String)
            {
                objectnode.put(s, (String)b.get(s));
            } else
            if (obj instanceof Integer)
            {
                objectnode.put(s, (Integer)b.get(s));
            } else
            if (obj instanceof Long)
            {
                objectnode.put(s, (Long)b.get(s));
            } else
            if (obj instanceof Double)
            {
                objectnode.put(s, (Double)b.get(s));
            } else
            if (obj instanceof Boolean)
            {
                objectnode.put(s, (Boolean)b.get(s));
            } else
            if (obj instanceof Long)
            {
                objectnode.put(s, (Long)b.get(s));
            }
        } while (true);
        return objectnode;
    }

    public Object a(String s)
    {
        return b.get(s);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        b.writeToParcel(parcel, i);
    }

}
