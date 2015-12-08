// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class boz
{

    private long a;
    private int b;
    private String c;
    private String d;
    private String e;
    private String f;
    private int g;
    private JSONObject h;

    boz(JSONObject jsonobject)
    {
        a = 0L;
        b = 0;
        c = null;
        e = null;
        f = null;
        g = -1;
        h = null;
        a = jsonobject.getLong("trackId");
        String s = jsonobject.getString("type");
        if ("TEXT".equals(s))
        {
            b = 1;
        } else
        if ("AUDIO".equals(s))
        {
            b = 2;
        } else
        if ("VIDEO".equals(s))
        {
            b = 3;
        } else
        {
            throw new JSONException((new StringBuilder("invalid type: ")).append(s).toString());
        }
        c = jsonobject.optString("trackContentId", null);
        d = jsonobject.optString("trackContentType", null);
        e = jsonobject.optString("name", null);
        f = jsonobject.optString("language", null);
        if (jsonobject.has("subtype"))
        {
            s = jsonobject.getString("subtype");
            if ("SUBTITLES".equals(s))
            {
                g = 1;
            } else
            if ("CAPTIONS".equals(s))
            {
                g = 2;
            } else
            if ("DESCRIPTIONS".equals(s))
            {
                g = 3;
            } else
            if ("CHAPTERS".equals(s))
            {
                g = 4;
            } else
            if ("METADATA".equals(s))
            {
                g = 5;
            } else
            {
                throw new JSONException((new StringBuilder("invalid subtype: ")).append(s).toString());
            }
        } else
        {
            g = 0;
        }
        h = jsonobject.optJSONObject("customData");
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("trackId", a);
        b;
        JVM INSTR tableswitch 1 3: default 276
    //                   1 180
    //                   2 192
    //                   3 204;
           goto _L1 _L2 _L3 _L4
_L1:
        if (c != null)
        {
            jsonobject.put("trackContentId", c);
        }
        if (d != null)
        {
            jsonobject.put("trackContentType", d);
        }
        if (e != null)
        {
            jsonobject.put("name", e);
        }
        if (!TextUtils.isEmpty(f))
        {
            jsonobject.put("language", f);
        }
        g;
        JVM INSTR tableswitch 1 5: default 279
    //                   1 216
    //                   2 228
    //                   3 240
    //                   4 252
    //                   5 264;
           goto _L5 _L6 _L7 _L8 _L9 _L10
_L5:
        if (h == null) goto _L12; else goto _L11
_L11:
        jsonobject.put("customData", h);
        return jsonobject;
_L2:
        try
        {
            jsonobject.put("type", "TEXT");
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        jsonobject.put("type", "AUDIO");
        continue; /* Loop/switch isn't completed */
_L4:
        jsonobject.put("type", "VIDEO");
        continue; /* Loop/switch isn't completed */
_L6:
        jsonobject.put("subtype", "SUBTITLES");
          goto _L5
_L7:
        jsonobject.put("subtype", "CAPTIONS");
          goto _L5
_L8:
        jsonobject.put("subtype", "DESCRIPTIONS");
          goto _L5
_L9:
        jsonobject.put("subtype", "CHAPTERS");
          goto _L5
_L10:
        jsonobject.put("subtype", "METADATA");
          goto _L5
_L12:
        return jsonobject;
        if (true) goto _L1; else goto _L13
_L13:
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
        if (!(obj instanceof boz))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (boz)obj;
        boolean flag;
        boolean flag1;
        if (h == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((boz) (obj)).h == null)
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
        if (h == null || ((boz) (obj)).h == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag3;
        if (!cnu.a(h, ((boz) (obj)).h)) goto _L4; else goto _L3
_L3:
        flag2 = flag3;
        if (a == ((boz) (obj)).a)
        {
            flag2 = flag3;
            if (b == ((boz) (obj)).b)
            {
                flag2 = flag3;
                if (bpp.a(c, ((boz) (obj)).c))
                {
                    flag2 = flag3;
                    if (bpp.a(d, ((boz) (obj)).d))
                    {
                        flag2 = flag3;
                        if (bpp.a(e, ((boz) (obj)).e))
                        {
                            flag2 = flag3;
                            if (bpp.a(f, ((boz) (obj)).f))
                            {
                                flag2 = flag3;
                                if (g == ((boz) (obj)).g)
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
            Long.valueOf(a), Integer.valueOf(b), c, d, e, f, Integer.valueOf(g), h
        });
    }
}
