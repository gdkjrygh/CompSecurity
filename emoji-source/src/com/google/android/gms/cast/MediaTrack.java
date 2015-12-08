// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.internal.gi;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.in;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaTrack
{
    public static class Builder
    {

        private final MediaTrack AV;

        public MediaTrack build()
        {
            return AV;
        }

        public Builder setContentId(String s)
        {
            AV.setContentId(s);
            return this;
        }

        public Builder setContentType(String s)
        {
            AV.setContentType(s);
            return this;
        }

        public Builder setCustomData(JSONObject jsonobject)
        {
            AV.setCustomData(jsonobject);
            return this;
        }

        public Builder setLanguage(String s)
        {
            AV.setLanguage(s);
            return this;
        }

        public Builder setLanguage(Locale locale)
        {
            AV.setLanguage(gi.b(locale));
            return this;
        }

        public Builder setName(String s)
        {
            AV.setName(s);
            return this;
        }

        public Builder setSubtype(int i)
            throws IllegalArgumentException
        {
            AV.R(i);
            return this;
        }

        public Builder(long l, int i)
            throws IllegalArgumentException
        {
            AV = new MediaTrack(l, i);
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
    private JSONObject AA;
    private long AS;
    private int AT;
    private int AU;
    private String Ar;
    private String At;
    private String Av;
    private String mName;

    MediaTrack(long l, int i)
        throws IllegalArgumentException
    {
        clear();
        AS = l;
        if (i <= 0 || i > 3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid type ").append(i).toString());
        } else
        {
            AT = i;
            return;
        }
    }

    MediaTrack(JSONObject jsonobject)
        throws JSONException
    {
        b(jsonobject);
    }

    private void b(JSONObject jsonobject)
        throws JSONException
    {
        clear();
        AS = jsonobject.getLong("trackId");
        String s = jsonobject.getString("type");
        if ("TEXT".equals(s))
        {
            AT = 1;
        } else
        if ("AUDIO".equals(s))
        {
            AT = 2;
        } else
        if ("VIDEO".equals(s))
        {
            AT = 3;
        } else
        {
            throw new JSONException((new StringBuilder()).append("invalid type: ").append(s).toString());
        }
        At = jsonobject.optString("trackContentId", null);
        Av = jsonobject.optString("trackContentType", null);
        mName = jsonobject.optString("name", null);
        Ar = jsonobject.optString("language", null);
        if (jsonobject.has("subtype"))
        {
            s = jsonobject.getString("subtype");
            if ("SUBTITLES".equals(s))
            {
                AU = 1;
            } else
            if ("CAPTIONS".equals(s))
            {
                AU = 2;
            } else
            if ("DESCRIPTIONS".equals(s))
            {
                AU = 3;
            } else
            if ("CHAPTERS".equals(s))
            {
                AU = 4;
            } else
            if ("METADATA".equals(s))
            {
                AU = 5;
            } else
            {
                throw new JSONException((new StringBuilder()).append("invalid subtype: ").append(s).toString());
            }
        } else
        {
            AU = 0;
        }
        AA = jsonobject.optJSONObject("customData");
    }

    private void clear()
    {
        AS = 0L;
        AT = 0;
        At = null;
        mName = null;
        Ar = null;
        AU = -1;
        AA = null;
    }

    void R(int i)
        throws IllegalArgumentException
    {
        if (i <= -1 || i > 5)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid subtype ").append(i).toString());
        }
        if (i != 0 && AT != 1)
        {
            throw new IllegalArgumentException("subtypes are only valid for text tracks");
        } else
        {
            AU = i;
            return;
        }
    }

    public JSONObject dZ()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("trackId", AS);
        AT;
        JVM INSTR tableswitch 1 3: default 276
    //                   1 180
    //                   2 192
    //                   3 204;
           goto _L1 _L2 _L3 _L4
_L1:
        if (At != null)
        {
            jsonobject.put("trackContentId", At);
        }
        if (Av != null)
        {
            jsonobject.put("trackContentType", Av);
        }
        if (mName != null)
        {
            jsonobject.put("name", mName);
        }
        if (!TextUtils.isEmpty(Ar))
        {
            jsonobject.put("language", Ar);
        }
        AU;
        JVM INSTR tableswitch 1 5: default 279
    //                   1 216
    //                   2 228
    //                   3 240
    //                   4 252
    //                   5 264;
           goto _L5 _L6 _L7 _L8 _L9 _L10
_L5:
        if (AA == null) goto _L12; else goto _L11
_L11:
        jsonobject.put("customData", AA);
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
        if (AA == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((MediaTrack) (obj)).AA == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag5;
        if (flag != flag1) goto _L4; else goto _L5
_L5:
        if (AA == null || ((MediaTrack) (obj)).AA == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag5;
        if (!in.d(AA, ((MediaTrack) (obj)).AA)) goto _L4; else goto _L6
_L6:
        boolean flag3;
        if (AS == ((MediaTrack) (obj)).AS && AT == ((MediaTrack) (obj)).AT && gi.a(At, ((MediaTrack) (obj)).At) && gi.a(Av, ((MediaTrack) (obj)).Av) && gi.a(mName, ((MediaTrack) (obj)).mName) && gi.a(Ar, ((MediaTrack) (obj)).Ar) && AU == ((MediaTrack) (obj)).AU)
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
        return At;
    }

    public String getContentType()
    {
        return Av;
    }

    public JSONObject getCustomData()
    {
        return AA;
    }

    public long getId()
    {
        return AS;
    }

    public String getLanguage()
    {
        return Ar;
    }

    public String getName()
    {
        return mName;
    }

    public int getSubtype()
    {
        return AU;
    }

    public int getType()
    {
        return AT;
    }

    public int hashCode()
    {
        return hk.hashCode(new Object[] {
            Long.valueOf(AS), Integer.valueOf(AT), At, Av, mName, Ar, Integer.valueOf(AU), AA
        });
    }

    public void setContentId(String s)
    {
        At = s;
    }

    public void setContentType(String s)
    {
        Av = s;
    }

    void setCustomData(JSONObject jsonobject)
    {
        AA = jsonobject;
    }

    void setLanguage(String s)
    {
        Ar = s;
    }

    void setName(String s)
    {
        mName = s;
    }
}
