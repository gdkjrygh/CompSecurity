// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.b.Y;
import com.google.android.gms.cast.internal.j;
import com.google.android.gms.common.internal.zzw;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.cast:
//            m

public final class o
{
    public static final class a
    {

        public final o a;

        public final o a()
        {
            o o1 = a;
            if (o1.a == null)
            {
                throw new IllegalArgumentException("media cannot be null.");
            }
            if (Double.isNaN(o1.c) || o1.c < 0.0D)
            {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (Double.isNaN(o1.d))
            {
                throw new IllegalArgumentException("playbackDuration cannot be NaN.");
            }
            if (Double.isNaN(o1.e) || o1.e < 0.0D)
            {
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            } else
            {
                return a;
            }
        }

        public a(m m1)
            throws IllegalArgumentException
        {
            a = new o(m1, (byte)0);
        }

        public a(o o1)
            throws IllegalArgumentException
        {
            a = new o(o1, (byte)0);
        }
    }


    public m a;
    public int b;
    double c;
    double d;
    double e;
    private boolean f;
    private long g[];
    private JSONObject h;

    private o(m m1)
        throws IllegalArgumentException
    {
        b = 0;
        f = true;
        d = (1.0D / 0.0D);
        if (m1 == null)
        {
            throw new IllegalArgumentException("media cannot be null.");
        } else
        {
            a = m1;
            return;
        }
    }

    o(m m1, byte byte0)
        throws IllegalArgumentException
    {
        this(m1);
    }

    private o(o o1)
        throws IllegalArgumentException
    {
        b = 0;
        f = true;
        d = (1.0D / 0.0D);
        a = o1.a;
        if (a == null)
        {
            throw new IllegalArgumentException("media cannot be null.");
        } else
        {
            b = o1.b;
            f = o1.f;
            c = o1.c;
            d = o1.d;
            e = o1.e;
            g = o1.g;
            h = o1.h;
            return;
        }
    }

    o(o o1, byte byte0)
        throws IllegalArgumentException
    {
        this(o1);
    }

    o(JSONObject jsonobject)
        throws JSONException
    {
        b = 0;
        f = true;
        d = (1.0D / 0.0D);
        a(jsonobject);
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray;
        long al[];
        int k;
        jsonobject.put("media", a.a());
        if (b != 0)
        {
            jsonobject.put("itemId", b);
        }
        jsonobject.put("autoplay", f);
        jsonobject.put("startTime", c);
        if (d != (1.0D / 0.0D))
        {
            jsonobject.put("playbackDuration", d);
        }
        jsonobject.put("preloadTime", e);
        if (g == null || g.length <= 0)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        jsonarray = new JSONArray();
        al = g;
        k = al.length;
        int i = 0;
        while (i < k) 
        {
            try
            {
                jsonarray.put(al[i]);
            }
            catch (JSONException jsonexception)
            {
                return jsonobject;
            }
            i++;
        }
        jsonobject.put("activeTrackIds", jsonarray);
        if (h != null)
        {
            jsonobject.put("customData", h);
        }
        return jsonobject;
    }

    public final boolean a(JSONObject jsonobject)
        throws JSONException
    {
        long al[];
        JSONArray jsonarray;
        int k;
        int l;
        boolean flag;
        boolean flag1;
        if (jsonobject.has("media"))
        {
            a = new m(jsonobject.getJSONObject("media"));
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag = flag1;
        if (jsonobject.has("itemId"))
        {
            int i = jsonobject.getInt("itemId");
            flag = flag1;
            if (b != i)
            {
                b = i;
                flag = true;
            }
        }
        flag1 = flag;
        if (jsonobject.has("autoplay"))
        {
            boolean flag2 = jsonobject.getBoolean("autoplay");
            flag1 = flag;
            if (f != flag2)
            {
                f = flag2;
                flag1 = true;
            }
        }
        flag = flag1;
        if (jsonobject.has("startTime"))
        {
            double d1 = jsonobject.getDouble("startTime");
            flag = flag1;
            if (Math.abs(d1 - c) > 9.9999999999999995E-08D)
            {
                c = d1;
                flag = true;
            }
        }
        flag1 = flag;
        if (jsonobject.has("playbackDuration"))
        {
            double d2 = jsonobject.getDouble("playbackDuration");
            flag1 = flag;
            if (Math.abs(d2 - d) > 9.9999999999999995E-08D)
            {
                d = d2;
                flag1 = true;
            }
        }
        flag = flag1;
        if (jsonobject.has("preloadTime"))
        {
            double d3 = jsonobject.getDouble("preloadTime");
            flag = flag1;
            if (Math.abs(d3 - e) > 9.9999999999999995E-08D)
            {
                e = d3;
                flag = true;
            }
        }
        if (!jsonobject.has("activeTrackIds")) goto _L2; else goto _L1
_L1:
        jsonarray = jsonobject.getJSONArray("activeTrackIds");
        l = jsonarray.length();
        al = new long[l];
        for (k = 0; k < l; k++)
        {
            al[k] = jsonarray.getLong(k);
        }

        if (g != null) goto _L4; else goto _L3
_L3:
        k = 1;
_L6:
        if (k != 0)
        {
            g = al;
            flag = true;
        }
        if (jsonobject.has("customData"))
        {
            h = jsonobject.getJSONObject("customData");
            return true;
        } else
        {
            return flag;
        }
_L4:
        if (g.length != l)
        {
            k = 1;
            continue; /* Loop/switch isn't completed */
        }
        k = 0;
        do
        {
            if (k >= l)
            {
                break;
            }
            if (g[k] != al[k])
            {
                k = 1;
                continue; /* Loop/switch isn't completed */
            }
            k++;
        } while (true);
        k = 0;
        continue; /* Loop/switch isn't completed */
_L2:
        k = 0;
        al = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean equals(Object obj)
    {
        boolean flag3 = false;
        if (this != obj) goto _L2; else goto _L1
_L1:
        boolean flag2 = true;
_L4:
        return flag2;
_L2:
        flag2 = flag3;
        if (!(obj instanceof o))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (o)obj;
        boolean flag;
        boolean flag1;
        if (h == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((o) (obj)).h == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag3;
        if (flag != flag1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (h == null || ((o) (obj)).h == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag3;
        if (!Y.a(h, ((o) (obj)).h)) goto _L4; else goto _L3
_L3:
        flag2 = flag3;
        if (j.a(a, ((o) (obj)).a))
        {
            flag2 = flag3;
            if (b == ((o) (obj)).b)
            {
                flag2 = flag3;
                if (f == ((o) (obj)).f)
                {
                    flag2 = flag3;
                    if (c == ((o) (obj)).c)
                    {
                        flag2 = flag3;
                        if (d == ((o) (obj)).d)
                        {
                            flag2 = flag3;
                            if (e == ((o) (obj)).e)
                            {
                                flag2 = flag3;
                                if (j.a(g, ((o) (obj)).g))
                                {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public final int hashCode()
    {
        return zzw.hashCode(new Object[] {
            a, Integer.valueOf(b), Boolean.valueOf(f), Double.valueOf(c), Double.valueOf(d), Double.valueOf(e), g, String.valueOf(h)
        });
    }
}
