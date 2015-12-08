// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.SparseArray;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class jvu
{

    int a;
    public jvp b;
    public double c;
    public int d;
    public int e;
    public long f;
    private long g;
    private long h;
    private double i;
    private boolean j;
    private long k[];
    private int l;
    private int m;
    private final jvv n = new jvv(this);

    public jvu(JSONObject jsonobject)
    {
        a = 0;
        l = 0;
        m = 0;
        a(jsonobject, 0);
    }

    public final int a(JSONObject jsonobject, int i1)
    {
        int j1;
        int k1;
        k1 = 0;
        long l2 = jsonobject.getLong("mediaSessionId");
        if (l2 != g)
        {
            g = l2;
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
        if (j1 != d)
        {
            d = j1;
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
        if (j1 == e) goto _L4; else goto _L5
_L5:
        e = j1;
        j1 = k1 | 2;
_L2:
        k1 = j1;
        if (jsonobject.has("playbackRate"))
        {
            d1 = jsonobject.getDouble("playbackRate");
            k1 = j1;
            if (c != d1)
            {
                c = d1;
                k1 = j1 | 2;
            }
        }
        j1 = k1;
        if (jsonobject.has("currentTime"))
        {
            j1 = k1;
            if ((i1 & 2) == 0)
            {
                l3 = jwo.a(jsonobject.getDouble("currentTime"));
                j1 = k1;
                if (l3 != f)
                {
                    f = l3;
                    j1 = k1 | 2;
                }
            }
        }
        k1 = j1;
        if (jsonobject.has("supportedMediaCommands"))
        {
            l3 = jsonobject.getLong("supportedMediaCommands");
            k1 = j1;
            if (l3 != h)
            {
                h = l3;
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
                if (d1 != i)
                {
                    i = d1;
                    i1 = k1 | 2;
                }
                flag = ((JSONObject) (obj)).getBoolean("muted");
                j1 = i1;
                if (flag != j)
                {
                    j = flag;
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

        if (k != null) goto _L9; else goto _L8
_L8:
        i1 = 1;
_L28:
        obj = obj1;
        k1 = i1;
        if (i1 != 0)
        {
            k = ((long []) (obj1));
            k1 = i1;
            obj = obj1;
        }
_L33:
        i1 = j1;
        if (k1 != 0)
        {
            k = ((long []) (obj));
            i1 = j1 | 2;
        }
        j1 = i1;
        if (jsonobject.has("customData"))
        {
            jsonobject.getJSONObject("customData");
            j1 = i1 | 2;
        }
        i1 = j1;
        if (jsonobject.has("media"))
        {
            obj = jsonobject.getJSONObject("media");
            b = new jvp(((JSONObject) (obj)));
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
        if (m != k1)
        {
            m = k1;
            i1 = j1 | 0x10;
        }
        j1 = jsonobject.optInt("loadingItemId", 0);
        SparseArray sparsearray;
        jvs ajvs[];
        JSONObject jsonobject1;
        Object obj2;
        if (l != j1)
        {
            l = j1;
            j1 = i1 | 2;
        } else
        {
            j1 = i1;
        }
        i1 = d;
        k1 = l;
        if (i1 == 1 && k1 == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0) goto _L11; else goto _L10
_L10:
        obj = n;
        if (!jsonobject.has("repeatMode")) goto _L13; else goto _L12
_L12:
        k1 = ((jvv) (obj)).a;
        obj1 = jsonobject.getString("repeatMode");
        i1 = -1;
        ((String) (obj1)).hashCode();
        JVM INSTR lookupswitch 4: default 896
    //                   -1118317585: 1154
    //                   -962896020: 1139
    //                   1645938909: 1124
    //                   1645952171: 1109;
           goto _L14 _L15 _L16 _L17 _L18
_L14:
        i1;
        JVM INSTR tableswitch 0 3: default 928
    //                   0 1169
    //                   1 1174
    //                   2 1179
    //                   3 1184;
           goto _L19 _L20 _L21 _L22 _L23
_L19:
        i1 = k1;
_L34:
        if (((jvv) (obj)).a == i1) goto _L13; else goto _L24
_L24:
        obj.a = i1;
        i1 = 1;
          goto _L25
_L9:
        if (k.length == i2) goto _L27; else goto _L26
_L26:
        i1 = 1;
          goto _L28
_L27:
        k1 = 0;
_L32:
        i1 = l1;
        if (k1 >= i2) goto _L28; else goto _L29
_L29:
        if (k[k1] == obj1[k1]) goto _L31; else goto _L30
_L30:
        i1 = 1;
          goto _L28
_L31:
        k1++;
          goto _L32
_L7:
        obj = obj1;
        if (k != null)
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
            obj1 = jsonobject.getJSONArray("items");
            l1 = ((JSONArray) (obj1)).length();
            sparsearray = new SparseArray();
            for (k1 = 0; k1 < l1; k1++)
            {
                sparsearray.put(k1, Integer.valueOf(((JSONArray) (obj1)).getJSONObject(k1).getInt("itemId")));
            }

            ajvs = new jvs[l1];
            k1 = 0;
            while (k1 < l1) 
            {
                obj2 = (Integer)sparsearray.get(k1);
                jsonobject1 = ((JSONArray) (obj1)).getJSONObject(k1);
                i2 = ((Integer) (obj2)).intValue();
                jsonobject = (Integer)((jvv) (obj)).c.get(i2);
                if (jsonobject == null)
                {
                    jsonobject = null;
                } else
                {
                    jsonobject = (jvs)((jvv) (obj)).b.get(jsonobject.intValue());
                }
                if (jsonobject != null)
                {
                    i1 = jsonobject.a(jsonobject1) | i1;
                    ajvs[k1] = jsonobject;
                    i2 = ((Integer) (obj2)).intValue();
                    if (k1 != ((Integer)((jvv) (obj)).c.get(i2)).intValue())
                    {
                        i1 = 1;
                    }
                } else
                {
                    i1 = 1;
                    if (((Integer) (obj2)).intValue() == ((jvv) (obj)).d.a)
                    {
                        jsonobject = new jvt(((jvv) (obj)).d.b);
                        obj2 = ((jvt) (jsonobject)).a;
                        if (((jvs) (obj2)).a == null)
                        {
                            throw new IllegalArgumentException("media cannot be null.");
                        }
                        if (Double.isNaN(((jvs) (obj2)).c) || ((jvs) (obj2)).c < 0.0D)
                        {
                            throw new IllegalArgumentException("startTime cannot be negative or NaN.");
                        }
                        if (Double.isNaN(((jvs) (obj2)).d))
                        {
                            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
                        }
                        if (Double.isNaN(((jvs) (obj2)).e) || ((jvs) (obj2)).e < 0.0D)
                        {
                            throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
                        }
                        ajvs[k1] = ((jvt) (jsonobject)).a;
                        ajvs[k1].a(jsonobject1);
                        i1 = 1;
                    } else
                    {
                        ajvs[k1] = new jvs(jsonobject1);
                    }
                }
                k1++;
            }
            if (((jvv) (obj)).b.size() != l1)
            {
                i1 = 1;
            }
            ((jvv) (obj)).a(ajvs);
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
        l = 0;
        m = 0;
        i1 = j1;
        if (n.b.size() <= 0) goto _L36; else goto _L35
_L35:
        jsonobject = n;
        jsonobject.a = 0;
        ((jvv) (jsonobject)).b.clear();
        ((jvv) (jsonobject)).c.clear();
        return j1 | 8;
_L13:
        i1 = 0;
        if (true) goto _L25; else goto _L4
_L4:
        j1 = k1;
        if (true) goto _L2; else goto _L37
_L37:
    }
}
