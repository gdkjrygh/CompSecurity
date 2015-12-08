// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.graphics.Color;
import com.google.android.gms.b.Y;
import com.google.android.gms.cast.internal.j;
import com.google.android.gms.common.internal.zzw;
import org.json.JSONException;
import org.json.JSONObject;

public final class Q
{

    public float a;
    public int b;
    public int c;
    int d;
    public int e;
    int f;
    int g;
    int h;
    String i;
    int j;
    int k;
    JSONObject l;

    public Q()
    {
        a();
    }

    static int a(String s)
    {
        boolean flag = false;
        int i1 = ((flag) ? 1 : 0);
        if (s != null)
        {
            i1 = ((flag) ? 1 : 0);
            if (s.length() == 9)
            {
                i1 = ((flag) ? 1 : 0);
                if (s.charAt(0) == '#')
                {
                    try
                    {
                        i1 = Integer.parseInt(s.substring(1, 3), 16);
                        int j1 = Integer.parseInt(s.substring(3, 5), 16);
                        int k1 = Integer.parseInt(s.substring(5, 7), 16);
                        i1 = Color.argb(Integer.parseInt(s.substring(7, 9), 16), i1, j1, k1);
                    }
                    // Misplaced declaration of an exception variable
                    catch (String s)
                    {
                        return 0;
                    }
                }
            }
        }
        return i1;
    }

    private static String d(int i1)
    {
        return String.format("#%02X%02X%02X%02X", new Object[] {
            Integer.valueOf(Color.red(i1)), Integer.valueOf(Color.green(i1)), Integer.valueOf(Color.blue(i1)), Integer.valueOf(Color.alpha(i1))
        });
    }

    final void a()
    {
        a = 1.0F;
        b = 0;
        c = 0;
        d = -1;
        e = 0;
        f = -1;
        g = 0;
        h = 0;
        i = null;
        j = -1;
        k = -1;
        l = null;
    }

    public final void a(int i1)
    {
        if (i1 < 0 || i1 > 4)
        {
            throw new IllegalArgumentException("invalid edgeType");
        } else
        {
            d = i1;
            return;
        }
    }

    public final JSONObject b()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("fontScale", a);
        if (b != 0)
        {
            jsonobject.put("foregroundColor", d(b));
        }
        if (c != 0)
        {
            jsonobject.put("backgroundColor", d(c));
        }
        d;
        JVM INSTR tableswitch 0 4: default 540
    //                   0 312
    //                   1 324
    //                   2 336
    //                   3 348
    //                   4 360;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        if (e != 0)
        {
            jsonobject.put("edgeColor", d(e));
        }
        f;
        JVM INSTR tableswitch 0 2: default 543
    //                   0 372
    //                   1 384
    //                   2 396;
           goto _L7 _L8 _L9 _L10
_L7:
        if (g != 0)
        {
            jsonobject.put("windowColor", d(g));
        }
        if (f == 2)
        {
            jsonobject.put("windowRoundedCornerRadius", h);
        }
        if (i != null)
        {
            jsonobject.put("fontFamily", i);
        }
        j;
        JVM INSTR tableswitch 0 6: default 546
    //                   0 408
    //                   1 420
    //                   2 432
    //                   3 444
    //                   4 456
    //                   5 468
    //                   6 480;
           goto _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L11:
        k;
        JVM INSTR tableswitch 0 3: default 549
    //                   0 492
    //                   1 504
    //                   2 516
    //                   3 528;
           goto _L19 _L20 _L21 _L22 _L23
_L19:
        if (l == null) goto _L25; else goto _L24
_L24:
        jsonobject.put("customData", l);
        return jsonobject;
_L2:
        try
        {
            jsonobject.put("edgeType", "NONE");
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        jsonobject.put("edgeType", "OUTLINE");
        continue; /* Loop/switch isn't completed */
_L4:
        jsonobject.put("edgeType", "DROP_SHADOW");
        continue; /* Loop/switch isn't completed */
_L5:
        jsonobject.put("edgeType", "RAISED");
        continue; /* Loop/switch isn't completed */
_L6:
        jsonobject.put("edgeType", "DEPRESSED");
        continue; /* Loop/switch isn't completed */
_L8:
        jsonobject.put("windowType", "NONE");
          goto _L7
_L9:
        jsonobject.put("windowType", "NORMAL");
          goto _L7
_L10:
        jsonobject.put("windowType", "ROUNDED_CORNERS");
          goto _L7
_L12:
        jsonobject.put("fontGenericFamily", "SANS_SERIF");
          goto _L11
_L13:
        jsonobject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
          goto _L11
_L14:
        jsonobject.put("fontGenericFamily", "SERIF");
          goto _L11
_L15:
        jsonobject.put("fontGenericFamily", "MONOSPACED_SERIF");
          goto _L11
_L16:
        jsonobject.put("fontGenericFamily", "CASUAL");
          goto _L11
_L17:
        jsonobject.put("fontGenericFamily", "CURSIVE");
          goto _L11
_L18:
        jsonobject.put("fontGenericFamily", "SMALL_CAPITALS");
          goto _L11
_L20:
        jsonobject.put("fontStyle", "NORMAL");
          goto _L19
_L21:
        jsonobject.put("fontStyle", "BOLD");
          goto _L19
_L22:
        jsonobject.put("fontStyle", "ITALIC");
          goto _L19
_L23:
        jsonobject.put("fontStyle", "BOLD_ITALIC");
          goto _L19
_L25:
        return jsonobject;
        if (true) goto _L1; else goto _L26
_L26:
    }

    public final void b(int i1)
    {
        if (i1 < 0 || i1 > 6)
        {
            throw new IllegalArgumentException("invalid fontGenericFamily");
        } else
        {
            j = i1;
            return;
        }
    }

    public final void c(int i1)
    {
        if (i1 < 0 || i1 > 3)
        {
            throw new IllegalArgumentException("invalid fontStyle");
        } else
        {
            k = i1;
            return;
        }
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
        if (!(obj instanceof Q))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (Q)obj;
        boolean flag;
        boolean flag1;
        if (l == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((Q) (obj)).l == null)
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
        if (l == null || ((Q) (obj)).l == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag3;
        if (!Y.a(l, ((Q) (obj)).l)) goto _L4; else goto _L3
_L3:
        flag2 = flag3;
        if (a == ((Q) (obj)).a)
        {
            flag2 = flag3;
            if (b == ((Q) (obj)).b)
            {
                flag2 = flag3;
                if (c == ((Q) (obj)).c)
                {
                    flag2 = flag3;
                    if (d == ((Q) (obj)).d)
                    {
                        flag2 = flag3;
                        if (e == ((Q) (obj)).e)
                        {
                            flag2 = flag3;
                            if (f == ((Q) (obj)).f)
                            {
                                flag2 = flag3;
                                if (h == ((Q) (obj)).h)
                                {
                                    flag2 = flag3;
                                    if (com.google.android.gms.cast.internal.j.a(i, ((Q) (obj)).i))
                                    {
                                        flag2 = flag3;
                                        if (j == ((Q) (obj)).j)
                                        {
                                            flag2 = flag3;
                                            if (k == ((Q) (obj)).k)
                                            {
                                                return true;
                                            }
                                        }
                                    }
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
            Float.valueOf(a), Integer.valueOf(b), Integer.valueOf(c), Integer.valueOf(d), Integer.valueOf(e), Integer.valueOf(f), Integer.valueOf(g), Integer.valueOf(h), i, Integer.valueOf(j), 
            Integer.valueOf(k), l
        });
    }
}
