// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

public final class bov
{

    bor a;
    int b;
    double c;
    double d;
    double e;
    private boolean f;
    private long g[];
    private JSONObject h;

    private bov(bor bor1)
    {
        b = 0;
        f = true;
        d = (1.0D / 0.0D);
        if (bor1 == null)
        {
            throw new IllegalArgumentException("media cannot be null.");
        } else
        {
            a = bor1;
            return;
        }
    }

    bov(bor bor1, byte byte0)
    {
        this(bor1);
    }

    bov(JSONObject jsonobject)
    {
        b = 0;
        f = true;
        d = (1.0D / 0.0D);
        a(jsonobject);
    }

    public final boolean a(JSONObject jsonobject)
    {
        long al[];
        JSONArray jsonarray;
        int j;
        int k;
        boolean flag;
        boolean flag1;
        if (jsonobject.has("media"))
        {
            a = new bor(jsonobject.getJSONObject("media"));
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
        k = jsonarray.length();
        al = new long[k];
        for (j = 0; j < k; j++)
        {
            al[j] = jsonarray.getLong(j);
        }

        if (g != null) goto _L4; else goto _L3
_L3:
        j = 1;
_L6:
        if (j != 0)
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
        if (g.length != k)
        {
            j = 1;
            continue; /* Loop/switch isn't completed */
        }
        j = 0;
        do
        {
            if (j >= k)
            {
                break;
            }
            if (g[j] != al[j])
            {
                j = 1;
                continue; /* Loop/switch isn't completed */
            }
            j++;
        } while (true);
        j = 0;
        continue; /* Loop/switch isn't completed */
_L2:
        j = 0;
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
        if (!(obj instanceof bov))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (bov)obj;
        boolean flag;
        boolean flag1;
        if (h == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((bov) (obj)).h == null)
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
        if (h == null || ((bov) (obj)).h == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag3;
        if (!cnu.a(h, ((bov) (obj)).h)) goto _L4; else goto _L3
_L3:
        flag2 = flag3;
        if (bpp.a(a, ((bov) (obj)).a))
        {
            flag2 = flag3;
            if (b == ((bov) (obj)).b)
            {
                flag2 = flag3;
                if (f == ((bov) (obj)).f)
                {
                    flag2 = flag3;
                    if (c == ((bov) (obj)).c)
                    {
                        flag2 = flag3;
                        if (d == ((bov) (obj)).d)
                        {
                            flag2 = flag3;
                            if (e == ((bov) (obj)).e)
                            {
                                flag2 = flag3;
                                if (bpp.a(g, ((bov) (obj)).g))
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
        return Arrays.hashCode(new Object[] {
            a, Integer.valueOf(b), Boolean.valueOf(f), Double.valueOf(c), Double.valueOf(d), Double.valueOf(e), g, String.valueOf(h)
        });
    }
}
