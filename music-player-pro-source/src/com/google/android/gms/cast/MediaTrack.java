// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.internal.in;
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.li;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaTrack
{
    public static class Builder
    {

        private final MediaTrack Gv;

        public MediaTrack build()
        {
            return Gv;
        }

        public Builder setContentId(String s)
        {
            Gv.setContentId(s);
            return this;
        }

        public Builder setContentType(String s)
        {
            Gv.setContentType(s);
            return this;
        }

        public Builder setCustomData(JSONObject jsonobject)
        {
            Gv.setCustomData(jsonobject);
            return this;
        }

        public Builder setLanguage(String s)
        {
            Gv.setLanguage(s);
            return this;
        }

        public Builder setLanguage(Locale locale)
        {
            Gv.setLanguage(in.b(locale));
            return this;
        }

        public Builder setName(String s)
        {
            Gv.setName(s);
            return this;
        }

        public Builder setSubtype(int i)
            throws IllegalArgumentException
        {
            Gv.ab(i);
            return this;
        }

        public Builder(long l, int i)
            throws IllegalArgumentException
        {
            Gv = new MediaTrack(l, i);
        }
    }


    public static final int SUBTYPE_CAPTIONS = 2;
    public static final int SUBTYPE_CHAPTERS = 4;
    public static final int SUBTYPE_DESCRIPTIONS = 3;
    public static final int SUBTYPE_METADATA = 5;
    public static final int SUBTYPE_NONE = 0;
    public static final int SUBTYPE_SUBTITLES = 1;
    public static final int SUBTYPE_UNKNOWN = -1;
    public static final int TYPE_AUDIO = 2;
    public static final int TYPE_TEXT = 1;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_VIDEO = 3;
    private long Eg;
    private String FR;
    private String FT;
    private String FV;
    private JSONObject Ga;
    private int Gt;
    private int Gu;
    private String mName;

    MediaTrack(long l, int i)
        throws IllegalArgumentException
    {
        clear();
        Eg = l;
        if (i <= 0 || i > 3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid type ").append(i).toString());
        } else
        {
            Gt = i;
            return;
        }
    }

    MediaTrack(JSONObject jsonobject)
        throws JSONException
    {
        c(jsonobject);
    }

    private void c(JSONObject jsonobject)
        throws JSONException
    {
        clear();
        Eg = jsonobject.getLong("trackId");
        String s = jsonobject.getString("type");
        if ("TEXT".equals(s))
        {
            Gt = 1;
        } else
        if ("AUDIO".equals(s))
        {
            Gt = 2;
        } else
        if ("VIDEO".equals(s))
        {
            Gt = 3;
        } else
        {
            throw new JSONException((new StringBuilder()).append("invalid type: ").append(s).toString());
        }
        FT = jsonobject.optString("trackContentId", null);
        FV = jsonobject.optString("trackContentType", null);
        mName = jsonobject.optString("name", null);
        FR = jsonobject.optString("language", null);
        if (jsonobject.has("subtype"))
        {
            s = jsonobject.getString("subtype");
            if ("SUBTITLES".equals(s))
            {
                Gu = 1;
            } else
            if ("CAPTIONS".equals(s))
            {
                Gu = 2;
            } else
            if ("DESCRIPTIONS".equals(s))
            {
                Gu = 3;
            } else
            if ("CHAPTERS".equals(s))
            {
                Gu = 4;
            } else
            if ("METADATA".equals(s))
            {
                Gu = 5;
            } else
            {
                throw new JSONException((new StringBuilder()).append("invalid subtype: ").append(s).toString());
            }
        } else
        {
            Gu = 0;
        }
        Ga = jsonobject.optJSONObject("customData");
    }

    private void clear()
    {
        Eg = 0L;
        Gt = 0;
        FT = null;
        mName = null;
        FR = null;
        Gu = -1;
        Ga = null;
    }

    void ab(int i)
        throws IllegalArgumentException
    {
        if (i <= -1 || i > 5)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid subtype ").append(i).toString());
        }
        if (i != 0 && Gt != 1)
        {
            throw new IllegalArgumentException("subtypes are only valid for text tracks");
        } else
        {
            Gu = i;
            return;
        }
    }

    public boolean equals(Object obj)
    {
        boolean flag4;
        boolean flag5;
        flag4 = true;
        flag5 = false;
        if (this != obj) goto _L2; else goto _L1
_L1:
        boolean flag2 = true;
_L4:
        return flag2;
_L2:
        flag2 = flag5;
        if (!(obj instanceof MediaTrack)) goto _L4; else goto _L3
_L3:
        obj = (MediaTrack)obj;
        boolean flag;
        boolean flag1;
        if (Ga == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((MediaTrack) (obj)).Ga == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag5;
        if (flag != flag1) goto _L4; else goto _L5
_L5:
        if (Ga == null || ((MediaTrack) (obj)).Ga == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag5;
        if (!li.d(Ga, ((MediaTrack) (obj)).Ga)) goto _L4; else goto _L6
_L6:
        boolean flag3;
        if (Eg == ((MediaTrack) (obj)).Eg && Gt == ((MediaTrack) (obj)).Gt && in.a(FT, ((MediaTrack) (obj)).FT) && in.a(FV, ((MediaTrack) (obj)).FV) && in.a(mName, ((MediaTrack) (obj)).mName) && in.a(FR, ((MediaTrack) (obj)).FR) && Gu == ((MediaTrack) (obj)).Gu)
        {
            flag3 = flag4;
        } else
        {
            flag3 = false;
        }
        return flag3;
    }

    public String getContentId()
    {
        return FT;
    }

    public String getContentType()
    {
        return FV;
    }

    public JSONObject getCustomData()
    {
        return Ga;
    }

    public long getId()
    {
        return Eg;
    }

    public String getLanguage()
    {
        return FR;
    }

    public String getName()
    {
        return mName;
    }

    public int getSubtype()
    {
        return Gu;
    }

    public int getType()
    {
        return Gt;
    }

    public int hashCode()
    {
        return jv.hashCode(new Object[] {
            Long.valueOf(Eg), Integer.valueOf(Gt), FT, FV, mName, FR, Integer.valueOf(Gu), Ga
        });
    }

    public void setContentId(String s)
    {
        FT = s;
    }

    public void setContentType(String s)
    {
        FV = s;
    }

    void setCustomData(JSONObject jsonobject)
    {
        Ga = jsonobject;
    }

    void setLanguage(String s)
    {
        FR = s;
    }

    void setName(String s)
    {
        mName = s;
    }

    public JSONObject toJson()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("trackId", Eg);
        Gt;
        JVM INSTR tableswitch 1 3: default 276
    //                   1 180
    //                   2 192
    //                   3 204;
           goto _L1 _L2 _L3 _L4
_L1:
        if (FT != null)
        {
            jsonobject.put("trackContentId", FT);
        }
        if (FV != null)
        {
            jsonobject.put("trackContentType", FV);
        }
        if (mName != null)
        {
            jsonobject.put("name", mName);
        }
        if (!TextUtils.isEmpty(FR))
        {
            jsonobject.put("language", FR);
        }
        Gu;
        JVM INSTR tableswitch 1 5: default 279
    //                   1 216
    //                   2 228
    //                   3 240
    //                   4 252
    //                   5 264;
           goto _L5 _L6 _L7 _L8 _L9 _L10
_L5:
        if (Ga == null) goto _L12; else goto _L11
_L11:
        jsonobject.put("customData", Ga);
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
}
