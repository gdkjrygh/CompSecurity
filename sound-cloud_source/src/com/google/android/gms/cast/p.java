// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.util.SparseArray;
import com.google.android.gms.cast.internal.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            m, o

public final class p
{
    private final class a
    {

        public int a;
        List b;
        SparseArray c;
        final p d;

        public final int a()
        {
            return b.size();
        }

        public final o a(int i1)
        {
            Integer integer = (Integer)c.get(i1);
            if (integer == null)
            {
                return null;
            } else
            {
                return (o)b.get(integer.intValue());
            }
        }

        final void a(o ao[])
        {
            b.clear();
            c.clear();
            for (int i1 = 0; i1 < ao.length; i1++)
            {
                o o1 = ao[i1];
                b.add(o1);
                c.put(o1.b, Integer.valueOf(i1));
            }

        }

        a()
        {
            d = p.this;
            super();
            a = 0;
            b = new ArrayList();
            c = new SparseArray();
        }
    }


    public int a;
    public long b;
    public m c;
    public double d;
    public int e;
    public int f;
    public long g;
    public double h;
    public boolean i;
    public long j[];
    public int k;
    public int l;
    public final a m = new a();
    private long n;
    private JSONObject o;

    public p(JSONObject jsonobject)
        throws JSONException
    {
        a = 0;
        k = 0;
        l = 0;
        a(jsonobject, 0);
    }

    public final int a(JSONObject jsonobject, int i1)
        throws JSONException
    {
        int j1;
        int k1;
        k1 = 0;
        long l2 = jsonobject.getLong("mediaSessionId");
        if (l2 != b)
        {
            b = l2;
            k1 = 1;
        }
        j1 = k1;
        if (!jsonobject.has("playerState")) goto _L2; else goto _L1
_L1:
        Object obj;
        Object obj1;
        int l1;
        int i2;
        j1 = 0;
        obj = jsonobject.getString("playerState");
        double d1;
        long l3;
        boolean flag;
        if (((String) (obj)).equals("IDLE"))
        {
            j1 = 1;
        } else
        if (((String) (obj)).equals("PLAYING"))
        {
            j1 = 2;
        } else
        if (((String) (obj)).equals("PAUSED"))
        {
            j1 = 3;
        } else
        if (((String) (obj)).equals("BUFFERING"))
        {
            j1 = 4;
        }
        if (j1 != e)
        {
            e = j1;
            k1 |= 2;
        }
        if (j1 != 1 || !jsonobject.has("idleReason")) goto _L4; else goto _L3
_L3:
        j1 = 0;
        obj = jsonobject.getString("idleReason");
        if (((String) (obj)).equals("CANCELLED"))
        {
            j1 = 2;
        } else
        if (((String) (obj)).equals("INTERRUPTED"))
        {
            j1 = 3;
        } else
        if (((String) (obj)).equals("FINISHED"))
        {
            j1 = 1;
        } else
        if (((String) (obj)).equals("ERROR"))
        {
            j1 = 4;
        }
        if (j1 == f) goto _L4; else goto _L5
_L5:
        f = j1;
        j1 = k1 | 2;
_L2:
        k1 = j1;
        if (jsonobject.has("playbackRate"))
        {
            d1 = jsonobject.getDouble("playbackRate");
            k1 = j1;
            if (d != d1)
            {
                d = d1;
                k1 = j1 | 2;
            }
        }
        j1 = k1;
        if (jsonobject.has("currentTime"))
        {
            j1 = k1;
            if ((i1 & 2) == 0)
            {
                l3 = com.google.android.gms.cast.internal.j.a(jsonobject.getDouble("currentTime"));
                j1 = k1;
                if (l3 != g)
                {
                    g = l3;
                    j1 = k1 | 2;
                }
            }
        }
        k1 = j1;
        if (jsonobject.has("supportedMediaCommands"))
        {
            l3 = jsonobject.getLong("supportedMediaCommands");
            k1 = j1;
            if (l3 != n)
            {
                n = l3;
                k1 = j1 | 2;
            }
        }
        j1 = k1;
        if (jsonobject.has("volume"))
        {
            j1 = k1;
            if ((i1 & 1) == 0)
            {
                obj = jsonobject.getJSONObject("volume");
                d1 = ((JSONObject) (obj)).getDouble("level");
                i1 = k1;
                if (d1 != h)
                {
                    h = d1;
                    i1 = k1 | 2;
                }
                flag = ((JSONObject) (obj)).getBoolean("muted");
                j1 = i1;
                if (flag != i)
                {
                    i = flag;
                    j1 = i1 | 2;
                }
            }
        }
        k1 = 0;
        l1 = 0;
        obj1 = null;
        if (!jsonobject.has("activeTrackIds")) goto _L7; else goto _L6
_L6:
        obj = jsonobject.getJSONArray("activeTrackIds");
        i2 = ((JSONArray) (obj)).length();
        obj1 = new long[i2];
        for (i1 = 0; i1 < i2; i1++)
        {
            obj1[i1] = ((JSONArray) (obj)).getLong(i1);
        }

        if (j != null) goto _L9; else goto _L8
_L8:
        i1 = 1;
_L28:
        obj = obj1;
        k1 = i1;
        if (i1 != 0)
        {
            j = ((long []) (obj1));
            k1 = i1;
            obj = obj1;
        }
_L33:
        i1 = j1;
        if (k1 != 0)
        {
            j = ((long []) (obj));
            i1 = j1 | 2;
        }
        j1 = i1;
        if (jsonobject.has("customData"))
        {
            o = jsonobject.getJSONObject("customData");
            j1 = i1 | 2;
        }
        i1 = j1;
        if (jsonobject.has("media"))
        {
            obj = jsonobject.getJSONObject("media");
            c = new m(((JSONObject) (obj)));
            j1 |= 2;
            i1 = j1;
            if (((JSONObject) (obj)).has("metadata"))
            {
                i1 = j1 | 4;
            }
        }
        j1 = i1;
        if (jsonobject.has("currentItemId"))
        {
            k1 = jsonobject.getInt("currentItemId");
            j1 = i1;
            if (a != k1)
            {
                a = k1;
                j1 = i1 | 2;
            }
        }
        k1 = jsonobject.optInt("preloadedItemId", 0);
        i1 = j1;
        if (l != k1)
        {
            l = k1;
            i1 = j1 | 0x10;
        }
        j1 = jsonobject.optInt("loadingItemId", 0);
        o ao[];
        Integer integer;
        JSONObject jsonobject1;
        o o1;
        if (k != j1)
        {
            k = j1;
            j1 = i1 | 2;
        } else
        {
            j1 = i1;
        }
        i1 = e;
        k1 = k;
        if (i1 == 1 && k1 == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0) goto _L11; else goto _L10
_L10:
        obj = m;
        if (!jsonobject.has("repeatMode")) goto _L13; else goto _L12
_L12:
        k1 = ((a) (obj)).a;
        obj1 = jsonobject.getString("repeatMode");
        i1 = -1;
        ((String) (obj1)).hashCode();
        JVM INSTR lookupswitch 4: default 900
    //                   -1118317585: 1155
    //                   -962896020: 1140
    //                   1645938909: 1125
    //                   1645952171: 1110;
           goto _L14 _L15 _L16 _L17 _L18
_L14:
        i1;
        JVM INSTR tableswitch 0 3: default 932
    //                   0 1170
    //                   1 1175
    //                   2 1180
    //                   3 1185;
           goto _L19 _L20 _L21 _L22 _L23
_L19:
        i1 = k1;
_L34:
        if (((a) (obj)).a == i1) goto _L13; else goto _L24
_L24:
        obj.a = i1;
        i1 = 1;
          goto _L25
_L9:
        if (j.length == i2) goto _L27; else goto _L26
_L26:
        i1 = 1;
          goto _L28
_L27:
        k1 = 0;
_L32:
        i1 = l1;
        if (k1 >= i2) goto _L28; else goto _L29
_L29:
        if (j[k1] == obj1[k1]) goto _L31; else goto _L30
_L30:
        i1 = 1;
          goto _L28
_L31:
        k1++;
          goto _L32
_L7:
        obj = obj1;
        if (j != null)
        {
            k1 = 1;
            obj = obj1;
        }
          goto _L33
_L18:
        if (((String) (obj1)).equals("REPEAT_OFF"))
        {
            i1 = 0;
        }
          goto _L14
_L17:
        if (((String) (obj1)).equals("REPEAT_ALL"))
        {
            i1 = 1;
        }
          goto _L14
_L16:
        if (((String) (obj1)).equals("REPEAT_SINGLE"))
        {
            i1 = 2;
        }
          goto _L14
_L15:
        if (((String) (obj1)).equals("REPEAT_ALL_AND_SHUFFLE"))
        {
            i1 = 3;
        }
          goto _L14
_L20:
        i1 = 0;
          goto _L34
_L21:
        i1 = 1;
          goto _L34
_L22:
        i1 = 2;
          goto _L34
_L23:
        i1 = 3;
          goto _L34
_L25:
        k1 = i1;
        if (jsonobject.has("items"))
        {
            jsonobject = jsonobject.getJSONArray("items");
            l1 = jsonobject.length();
            obj1 = new SparseArray();
            for (k1 = 0; k1 < l1; k1++)
            {
                ((SparseArray) (obj1)).put(k1, Integer.valueOf(jsonobject.getJSONObject(k1).getInt("itemId")));
            }

            ao = new o[l1];
            k1 = 0;
            while (k1 < l1) 
            {
                integer = (Integer)((SparseArray) (obj1)).get(k1);
                jsonobject1 = jsonobject.getJSONObject(k1);
                o1 = ((a) (obj)).a(integer.intValue());
                if (o1 != null)
                {
                    i1 |= o1.a(jsonobject1);
                    ao[k1] = o1;
                    i2 = integer.intValue();
                    if (k1 != ((Integer)((a) (obj)).c.get(i2)).intValue())
                    {
                        i1 = 1;
                    }
                } else
                {
                    i1 = 1;
                    if (integer.intValue() == ((a) (obj)).d.a)
                    {
                        ao[k1] = (new o.a(((a) (obj)).d.c)).a();
                        ao[k1].a(jsonobject1);
                        i1 = 1;
                    } else
                    {
                        ao[k1] = new o(jsonobject1);
                    }
                }
                k1++;
            }
            if (((a) (obj)).b.size() != l1)
            {
                i1 = 1;
            }
            ((a) (obj)).a(ao);
            k1 = i1;
        }
        i1 = j1;
        if (k1 != 0)
        {
            i1 = j1 | 8;
        }
_L36:
        return i1;
_L11:
        a = 0;
        k = 0;
        l = 0;
        i1 = j1;
        if (m.a() <= 0) goto _L36; else goto _L35
_L35:
        jsonobject = m;
        jsonobject.a = 0;
        ((a) (jsonobject)).b.clear();
        ((a) (jsonobject)).c.clear();
        return j1 | 8;
_L13:
        i1 = 0;
        if (true) goto _L25; else goto _L4
_L4:
        j1 = k1;
        if (true) goto _L2; else goto _L37
_L37:
    }

    public final o a(int i1)
    {
        return m.a(i1);
    }

    public final List a()
    {
        return Collections.unmodifiableList(m.b);
    }

    public final o b(int i1)
    {
        a a1 = m;
        if (i1 < 0 || i1 >= a1.b.size())
        {
            return null;
        } else
        {
            return (o)a1.b.get(i1);
        }
    }
}
