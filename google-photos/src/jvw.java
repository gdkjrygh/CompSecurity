// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class jvw
{

    private long a;
    private int b;
    private String c;
    private String d;
    private String e;
    private String f;
    private int g;
    private JSONObject h;

    jvw(JSONObject jsonobject)
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
        if (!(obj instanceof jvw))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (jvw)obj;
        boolean flag;
        boolean flag1;
        if (h == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((jvw) (obj)).h == null)
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
        if (h == null || ((jvw) (obj)).h == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag3;
        if (!kdk.a(h, ((jvw) (obj)).h)) goto _L4; else goto _L3
_L3:
        flag2 = flag3;
        if (a == ((jvw) (obj)).a)
        {
            flag2 = flag3;
            if (b == ((jvw) (obj)).b)
            {
                flag2 = flag3;
                if (jwo.a(c, ((jvw) (obj)).c))
                {
                    flag2 = flag3;
                    if (jwo.a(d, ((jvw) (obj)).d))
                    {
                        flag2 = flag3;
                        if (jwo.a(e, ((jvw) (obj)).e))
                        {
                            flag2 = flag3;
                            if (jwo.a(f, ((jvw) (obj)).f))
                            {
                                flag2 = flag3;
                                if (g == ((jvw) (obj)).g)
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
