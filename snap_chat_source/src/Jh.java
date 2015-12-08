// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Jh
{

    public static String a(Collection collection, String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            stringbuilder.append(collection.next());
            if (!collection.hasNext())
            {
                break;
            }
            stringbuilder.append(s);
        } while (true);
        return stringbuilder.toString();
    }

    public static String a(Map map)
    {
        if (map == null)
        {
            return "{}";
        } else
        {
            return (new Iz()).a(map);
        }
    }

    public static String a(byte abyte0[])
    {
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        String s1 = null;
_L4:
        return s1;
_L2:
        String s = "";
        int i = 0;
        do
        {
            s1 = s;
            if (i >= abyte0.length)
            {
                continue;
            }
            s = (new StringBuilder()).append(s).append(Integer.toString((abyte0[i] & 0xff) + 256, 16).substring(1)).toString();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static List a(String s, String s1)
    {
        if (TextUtils.isEmpty(s))
        {
            return new ArrayList();
        } else
        {
            return new ArrayList(Arrays.asList(s.split(s1)));
        }
    }

    public static Map a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return new HashMap();
        } else
        {
            return (Map)(new Iz()).a(s, (new TypeToken() {

            }).getType());
        }
    }

    public static Map b(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return null;
        }
        HashMap hashmap = ep.a();
        abyte0 = ByteBuffer.wrap(abyte0);
        PS ps = new PS();
        abyte0.order(ByteOrder.LITTLE_ENDIAN);
        ps.a = abyte0.getInt(abyte0.position()) + abyte0.position();
        ps.b = abyte0;
        int i = 0;
        do
        {
            int j = ps.a(4);
            if (j != 0)
            {
                j = ps.d(j);
            } else
            {
                j = 0;
            }
            if (i < j)
            {
                Object obj = new PN();
                j = ps.a(4);
                if (j != 0)
                {
                    j = ps.b(ps.e(j) + (i << 2));
                    abyte0 = ps.b;
                    obj.a = j;
                    obj.b = abyte0;
                } else
                {
                    obj = null;
                }
                j = ((PN) (obj)).a(4);
                if (j != 0)
                {
                    abyte0 = ((PN) (obj)).c(j + ((PN) (obj)).a);
                } else
                {
                    abyte0 = null;
                }
                j = ((PN) (obj)).a(6);
                if (j != 0)
                {
                    obj = ((PN) (obj)).c(j + ((PN) (obj)).a);
                } else
                {
                    obj = null;
                }
                hashmap.put(abyte0, obj);
                i++;
            } else
            {
                return hashmap;
            }
        } while (true);
    }

    public static byte[] b(Map map)
    {
        if (map == null)
        {
            return null;
        }
        if (map.size() == 0)
        {
            return new byte[0];
        }
        eW ew = new eW((byte)0);
        int ai[] = new int[map.size()];
        map = map.entrySet().iterator();
        for (int i = 0; map.hasNext(); i++)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            int l = ew.a((String)entry.getKey());
            int i1 = ew.a((String)entry.getValue());
            ew.b(2);
            ew.b(1, i1);
            ew.b(0, l);
            ai[i] = ew.b();
        }

        ew.a(4, ai.length, 4);
        for (int j = ai.length - 1; j >= 0; j--)
        {
            ew.a(ai[j]);
        }

        int k = ew.a();
        ew.b(1);
        ew.b(0, k);
        ew.d(ew.b());
        return ew.c();
    }
}
