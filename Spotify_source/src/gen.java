// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.text.TextUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.MissingNode;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.spotify.mobile.android.util.Assertion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class gen
{

    private static final gdz a = new gdz() {

        protected final Object a()
        {
            return new ObjectMapper();
        }

    };

    public static ImmutableMap a(Parcel parcel, android.os.Parcelable.Creator creator)
    {
        android.os.Parcelable.Creator creator1 = gii.c();
        int i = parcel.readInt();
        cur cur1 = ImmutableMap.i();
        for (; i > 0; i--)
        {
            cur1.a(creator1.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        return cur1.a();
    }

    public static void a(Parcel parcel, JsonNode jsonnode)
    {
        if (jsonnode.isMissingNode()) goto _L2; else goto _L1
_L1:
        jsonnode = ((ObjectMapper)a.b()).writeValueAsString(jsonnode);
_L4:
        parcel.writeString(jsonnode);
        return;
        jsonnode;
        Assertion.a("Could not serialize extra data to parcel", jsonnode);
_L2:
        jsonnode = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void a(Parcel parcel, String s)
    {
        if (s != null)
        {
            a(parcel, true);
            parcel.writeString(s);
            return;
        } else
        {
            a(parcel, false);
            return;
        }
    }

    public static void a(Parcel parcel, Map map)
    {
        a(parcel, map, gii.a(), gii.b());
    }

    private static void a(Parcel parcel, Map map, gig gig1, gig gig2)
    {
        parcel.writeInt(map.size());
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); gig2.a(entry.getValue(), parcel))
        {
            entry = (java.util.Map.Entry)map.next();
            gig1.a(entry.getKey(), parcel);
        }

    }

    public static void a(Parcel parcel, Set set)
    {
        parcel.writeStringList(Lists.a(set));
    }

    public static void a(Parcel parcel, boolean flag)
    {
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

    public static boolean a(Parcel parcel)
    {
        return parcel.readInt() != 0;
    }

    public static Set b(Parcel parcel)
    {
        ArrayList arraylist = new ArrayList();
        parcel.readStringList(arraylist);
        parcel = new HashSet();
        parcel.addAll(arraylist);
        return Collections.unmodifiableSet(parcel);
    }

    public static void b(Parcel parcel, Map map)
    {
        a(parcel, map, gii.a(), gii.a());
    }

    public static ImmutableMap c(Parcel parcel)
    {
        return a(parcel, gii.c());
    }

    public static String d(Parcel parcel)
    {
        if (a(parcel))
        {
            return parcel.readString();
        } else
        {
            return null;
        }
    }

    public static JsonNode e(Parcel parcel)
    {
        parcel = parcel.readString();
        if (TextUtils.isEmpty(parcel))
        {
            break MISSING_BLOCK_LABEL_35;
        }
        parcel = ((ObjectMapper)a.b()).readTree(parcel);
        return parcel;
        parcel;
        Assertion.a("Could not read extra data from parcel", parcel);
        return MissingNode.getInstance();
    }

}
