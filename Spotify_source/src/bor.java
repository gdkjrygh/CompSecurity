// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class bor
{

    final String a;
    int b;
    String c;
    bot d;
    private long e;
    private List f;
    private bpg g;
    private JSONObject h;

    bor(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("content ID cannot be null or empty");
        } else
        {
            a = s;
            b = -1;
            e = -1L;
            return;
        }
    }

    bor(JSONObject jsonobject)
    {
        Object obj;
        a = jsonobject.getString("contentId");
        obj = jsonobject.getString("streamType");
        double d1;
        int i;
        if ("NONE".equals(obj))
        {
            b = 0;
        } else
        if ("BUFFERED".equals(obj))
        {
            b = 1;
        } else
        if ("LIVE".equals(obj))
        {
            b = 2;
        } else
        {
            b = -1;
        }
        c = jsonobject.getString("contentType");
        if (!jsonobject.has("metadata")) goto _L2; else goto _L1
_L1:
        obj = jsonobject.getJSONObject("metadata");
        d = new bot(((JSONObject) (obj)).getInt("metadataType"));
        Object obj1 = d;
        ((bot) (obj1)).b.clear();
        ((bot) (obj1)).a.clear();
        obj1.c = 0;
        String s;
        try
        {
            obj1.c = ((JSONObject) (obj)).getInt("metadataType");
        }
        catch (JSONException jsonexception) { }
        clr.a(((bot) (obj1)).a, ((JSONObject) (obj)));
        ((bot) (obj1)).c;
        JVM INSTR tableswitch 0 4: default 172
    //                   0 360
    //                   1 394
    //                   2 428
    //                   3 467
    //                   4 524;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_524;
_L3:
        ((bot) (obj1)).a(((JSONObject) (obj)), new String[0]);
_L2:
        e = -1L;
        if (jsonobject.has("duration") && !jsonobject.isNull("duration"))
        {
            d1 = jsonobject.optDouble("duration", 0.0D);
            if (!Double.isNaN(d1) && !Double.isInfinite(d1))
            {
                e = bpp.a(d1);
            }
        }
        if (jsonobject.has("tracks"))
        {
            f = new ArrayList();
            obj = jsonobject.getJSONArray("tracks");
            for (i = 0; i < ((JSONArray) (obj)).length(); i++)
            {
                obj1 = new boz(((JSONArray) (obj)).getJSONObject(i));
                f.add(obj1);
            }

        } else
        {
            f = null;
        }
        break MISSING_BLOCK_LABEL_586;
_L4:
        ((bot) (obj1)).a(((JSONObject) (obj)), new String[] {
            "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"
        });
          goto _L2
_L5:
        ((bot) (obj1)).a(((JSONObject) (obj)), new String[] {
            "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.STUDIO", "com.google.android.gms.cast.metadata.SUBTITLE", "com.google.android.gms.cast.metadata.RELEASE_DATE"
        });
          goto _L2
_L6:
        ((bot) (obj1)).a(((JSONObject) (obj)), new String[] {
            "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.SERIES_TITLE", "com.google.android.gms.cast.metadata.SEASON_NUMBER", "com.google.android.gms.cast.metadata.EPISODE_NUMBER", "com.google.android.gms.cast.metadata.BROADCAST_DATE"
        });
          goto _L2
_L7:
        ((bot) (obj1)).a(((JSONObject) (obj)), new String[] {
            "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ALBUM_TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.ALBUM_ARTIST", "com.google.android.gms.cast.metadata.COMPOSER", "com.google.android.gms.cast.metadata.TRACK_NUMBER", "com.google.android.gms.cast.metadata.DISC_NUMBER", "com.google.android.gms.cast.metadata.RELEASE_DATE"
        });
          goto _L2
        ((bot) (obj1)).a(((JSONObject) (obj)), new String[] {
            "com.google.android.gms.cast.metadata.TITLE", "com.google.android.gms.cast.metadata.ARTIST", "com.google.android.gms.cast.metadata.LOCATION_NAME", "com.google.android.gms.cast.metadata.LOCATION_LATITUDE", "com.google.android.gms.cast.metadata.LOCATION_LONGITUDE", "com.google.android.gms.cast.metadata.WIDTH", "com.google.android.gms.cast.metadata.HEIGHT", "com.google.android.gms.cast.metadata.CREATION_DATE"
        });
          goto _L2
        if (jsonobject.has("textTrackStyle"))
        {
            obj = jsonobject.getJSONObject("textTrackStyle");
            obj1 = new bpg();
            ((bpg) (obj1)).a();
            obj1.a = (float)((JSONObject) (obj)).optDouble("fontScale", 1.0D);
            obj1.b = bpg.a(((JSONObject) (obj)).optString("foregroundColor"));
            obj1.c = bpg.a(((JSONObject) (obj)).optString("backgroundColor"));
            if (((JSONObject) (obj)).has("edgeType"))
            {
                s = ((JSONObject) (obj)).getString("edgeType");
                if ("NONE".equals(s))
                {
                    obj1.d = 0;
                } else
                if ("OUTLINE".equals(s))
                {
                    obj1.d = 1;
                } else
                if ("DROP_SHADOW".equals(s))
                {
                    obj1.d = 2;
                } else
                if ("RAISED".equals(s))
                {
                    obj1.d = 3;
                } else
                if ("DEPRESSED".equals(s))
                {
                    obj1.d = 4;
                }
            }
            obj1.e = bpg.a(((JSONObject) (obj)).optString("edgeColor"));
            if (((JSONObject) (obj)).has("windowType"))
            {
                s = ((JSONObject) (obj)).getString("windowType");
                if ("NONE".equals(s))
                {
                    obj1.f = 0;
                } else
                if ("NORMAL".equals(s))
                {
                    obj1.f = 1;
                } else
                if ("ROUNDED_CORNERS".equals(s))
                {
                    obj1.f = 2;
                }
            }
            obj1.g = bpg.a(((JSONObject) (obj)).optString("windowColor"));
            if (((bpg) (obj1)).f == 2)
            {
                obj1.h = ((JSONObject) (obj)).optInt("windowRoundedCornerRadius", 0);
            }
            obj1.i = ((JSONObject) (obj)).optString("fontFamily", null);
            if (((JSONObject) (obj)).has("fontGenericFamily"))
            {
                s = ((JSONObject) (obj)).getString("fontGenericFamily");
                if ("SANS_SERIF".equals(s))
                {
                    obj1.j = 0;
                } else
                if ("MONOSPACED_SANS_SERIF".equals(s))
                {
                    obj1.j = 1;
                } else
                if ("SERIF".equals(s))
                {
                    obj1.j = 2;
                } else
                if ("MONOSPACED_SERIF".equals(s))
                {
                    obj1.j = 3;
                } else
                if ("CASUAL".equals(s))
                {
                    obj1.j = 4;
                } else
                if ("CURSIVE".equals(s))
                {
                    obj1.j = 5;
                } else
                if ("SMALL_CAPITALS".equals(s))
                {
                    obj1.j = 6;
                }
            }
            if (((JSONObject) (obj)).has("fontStyle"))
            {
                s = ((JSONObject) (obj)).getString("fontStyle");
                if ("NORMAL".equals(s))
                {
                    obj1.k = 0;
                } else
                if ("BOLD".equals(s))
                {
                    obj1.k = 1;
                } else
                if ("ITALIC".equals(s))
                {
                    obj1.k = 2;
                } else
                if ("BOLD_ITALIC".equals(s))
                {
                    obj1.k = 3;
                }
            }
            obj1.l = ((JSONObject) (obj)).optJSONObject("customData");
            g = ((bpg) (obj1));
        } else
        {
            g = null;
        }
        h = jsonobject.optJSONObject("customData");
        return;
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("contentId", a);
        b;
        JVM INSTR tableswitch 1 2: default 233
    //                   1 242
    //                   2 248;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_248;
_L12:
        Object obj;
        jsonobject.put("streamType", obj);
        if (c != null)
        {
            jsonobject.put("contentType", c);
        }
        if (d != null)
        {
            jsonobject.put("metadata", d.a());
        }
        if (e > -1L) goto _L5; else goto _L4
_L4:
        jsonobject.put("duration", JSONObject.NULL);
_L9:
        if (f == null) goto _L7; else goto _L6
_L6:
        obj = new JSONArray();
        for (Iterator iterator = f.iterator(); iterator.hasNext(); ((JSONArray) (obj)).put(((boz)iterator.next()).a())) { }
          goto _L8
_L5:
        jsonobject.put("duration", bpp.a(e));
          goto _L9
_L8:
        jsonobject.put("tracks", obj);
_L7:
        if (g != null)
        {
            jsonobject.put("textTrackStyle", g.b());
        }
        if (h == null) goto _L11; else goto _L10
_L10:
        jsonobject.put("customData", h);
        return jsonobject;
_L1:
        obj = "NONE";
          goto _L12
        obj;
_L11:
        return jsonobject;
_L2:
        obj = "BUFFERED";
          goto _L12
        obj = "LIVE";
          goto _L12
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
        if (!(obj instanceof bor))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (bor)obj;
        boolean flag;
        boolean flag1;
        if (h == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((bor) (obj)).h == null)
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
        if (h == null || ((bor) (obj)).h == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag3;
        if (!cnu.a(h, ((bor) (obj)).h)) goto _L4; else goto _L3
_L3:
        flag2 = flag3;
        if (bpp.a(a, ((bor) (obj)).a))
        {
            flag2 = flag3;
            if (b == ((bor) (obj)).b)
            {
                flag2 = flag3;
                if (bpp.a(c, ((bor) (obj)).c))
                {
                    flag2 = flag3;
                    if (bpp.a(d, ((bor) (obj)).d))
                    {
                        flag2 = flag3;
                        if (e == ((bor) (obj)).e)
                        {
                            return true;
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
            a, Integer.valueOf(b), c, d, Long.valueOf(e), String.valueOf(h)
        });
    }
}
