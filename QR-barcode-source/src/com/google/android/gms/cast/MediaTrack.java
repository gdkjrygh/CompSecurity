// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.text.TextUtils;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.internal.ik;
import com.google.android.gms.internal.jz;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class MediaTrack
{
    public static class Builder
    {

        private final MediaTrack FF;

        public MediaTrack build()
        {
            return FF;
        }

        public Builder setContentId(String s)
        {
            FF.setContentId(s);
            return this;
        }

        public Builder setContentType(String s)
        {
            FF.setContentType(s);
            return this;
        }

        public Builder setCustomData(JSONObject jsonobject)
        {
            FF.setCustomData(jsonobject);
            return this;
        }

        public Builder setLanguage(String s)
        {
            FF.setLanguage(s);
            return this;
        }

        public Builder setLanguage(Locale locale)
        {
            FF.setLanguage(ik.b(locale));
            return this;
        }

        public Builder setName(String s)
        {
            FF.setName(s);
            return this;
        }

        public Builder setSubtype(int i)
            throws IllegalArgumentException
        {
            FF.aa(i);
            return this;
        }

        public Builder(long l, int i)
            throws IllegalArgumentException
        {
            FF = new MediaTrack(l, i);
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
    private long Dj;
    private int FD;
    private int FE;
    private String Fc;
    private String Fe;
    private String Fg;
    private JSONObject Fl;
    private String mName;

    MediaTrack(long l, int i)
        throws IllegalArgumentException
    {
        clear();
        Dj = l;
        if (i <= 0 || i > 3)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid type ").append(i).toString());
        } else
        {
            FD = i;
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
        Dj = jsonobject.getLong("trackId");
        String s = jsonobject.getString("type");
        if ("TEXT".equals(s))
        {
            FD = 1;
        } else
        if ("AUDIO".equals(s))
        {
            FD = 2;
        } else
        if ("VIDEO".equals(s))
        {
            FD = 3;
        } else
        {
            throw new JSONException((new StringBuilder()).append("invalid type: ").append(s).toString());
        }
        Fe = jsonobject.optString("trackContentId", null);
        Fg = jsonobject.optString("trackContentType", null);
        mName = jsonobject.optString("name", null);
        Fc = jsonobject.optString("language", null);
        if (jsonobject.has("subtype"))
        {
            s = jsonobject.getString("subtype");
            if ("SUBTITLES".equals(s))
            {
                FE = 1;
            } else
            if ("CAPTIONS".equals(s))
            {
                FE = 2;
            } else
            if ("DESCRIPTIONS".equals(s))
            {
                FE = 3;
            } else
            if ("CHAPTERS".equals(s))
            {
                FE = 4;
            } else
            if ("METADATA".equals(s))
            {
                FE = 5;
            } else
            {
                throw new JSONException((new StringBuilder()).append("invalid subtype: ").append(s).toString());
            }
        } else
        {
            FE = 0;
        }
        Fl = jsonobject.optJSONObject("customData");
    }

    private void clear()
    {
        Dj = 0L;
        FD = 0;
        Fe = null;
        mName = null;
        Fc = null;
        FE = -1;
        Fl = null;
    }

    void aa(int i)
        throws IllegalArgumentException
    {
        if (i <= -1 || i > 5)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid subtype ").append(i).toString());
        }
        if (i != 0 && FD != 1)
        {
            throw new IllegalArgumentException("subtypes are only valid for text tracks");
        } else
        {
            FE = i;
            return;
        }
    }

    public JSONObject bK()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("trackId", Dj);
        FD;
        JVM INSTR tableswitch 1 3: default 276
    //                   1 180
    //                   2 192
    //                   3 204;
           goto _L1 _L2 _L3 _L4
_L1:
        if (Fe != null)
        {
            jsonobject.put("trackContentId", Fe);
        }
        if (Fg != null)
        {
            jsonobject.put("trackContentType", Fg);
        }
        if (mName != null)
        {
            jsonobject.put("name", mName);
        }
        if (!TextUtils.isEmpty(Fc))
        {
            jsonobject.put("language", Fc);
        }
        FE;
        JVM INSTR tableswitch 1 5: default 279
    //                   1 216
    //                   2 228
    //                   3 240
    //                   4 252
    //                   5 264;
           goto _L5 _L6 _L7 _L8 _L9 _L10
_L5:
        if (Fl == null) goto _L12; else goto _L11
_L11:
        jsonobject.put("customData", Fl);
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
        if (Fl == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((MediaTrack) (obj)).Fl == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag2 = flag5;
        if (flag != flag1) goto _L4; else goto _L5
_L5:
        if (Fl == null || ((MediaTrack) (obj)).Fl == null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag2 = flag5;
        if (!jz.d(Fl, ((MediaTrack) (obj)).Fl)) goto _L4; else goto _L6
_L6:
        boolean flag3;
        if (Dj == ((MediaTrack) (obj)).Dj && FD == ((MediaTrack) (obj)).FD && ik.a(Fe, ((MediaTrack) (obj)).Fe) && ik.a(Fg, ((MediaTrack) (obj)).Fg) && ik.a(mName, ((MediaTrack) (obj)).mName) && ik.a(Fc, ((MediaTrack) (obj)).Fc) && FE == ((MediaTrack) (obj)).FE)
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
        return Fe;
    }

    public String getContentType()
    {
        return Fg;
    }

    public JSONObject getCustomData()
    {
        return Fl;
    }

    public long getId()
    {
        return Dj;
    }

    public String getLanguage()
    {
        return Fc;
    }

    public String getName()
    {
        return mName;
    }

    public int getSubtype()
    {
        return FE;
    }

    public int getType()
    {
        return FD;
    }

    public int hashCode()
    {
        return n.hashCode(new Object[] {
            Long.valueOf(Dj), Integer.valueOf(FD), Fe, Fg, mName, Fc, Integer.valueOf(FE), Fl
        });
    }

    public void setContentId(String s)
    {
        Fe = s;
    }

    public void setContentType(String s)
    {
        Fg = s;
    }

    void setCustomData(JSONObject jsonobject)
    {
        Fl = jsonobject;
    }

    void setLanguage(String s)
    {
        Fc = s;
    }

    void setName(String s)
    {
        mName = s;
    }
}
