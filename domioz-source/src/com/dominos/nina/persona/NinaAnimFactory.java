// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.dominos.nina.persona:
//            ParallelAnim, NinaAnim, SequentialAnim, NullAnim, 
//            NinaAnimConstants, ColorAnim, VolumeAnim, RotateAnim, 
//            ScaleAnim, TranslateAnim

class NinaAnimFactory
{

    private static final String COLOR_ANIM_TAG = "ColorAnim";
    private static final String COLOR_IDENTITY = "#ffffffff";
    private static final String JSON_KEY_CHILDREN = "children";
    private static final String JSON_KEY_DARK = "dark";
    private static final String JSON_KEY_END = "end";
    private static final String JSON_KEY_END_X = "endX";
    private static final String JSON_KEY_END_Y = "endY";
    private static final String JSON_KEY_LIGHT = "light";
    private static final String JSON_KEY_LOOP_COUNT = "loopCount";
    private static final String JSON_KEY_START = "start";
    private static final String JSON_KEY_START_X = "startX";
    private static final String JSON_KEY_START_Y = "startY";
    private static final String JSON_KEY_TIME = "time";
    private static final String NULL_ANIM_TAG = "NullAnim";
    private static final String PARALLEL_ANIM_TAG = "ParallelAnim";
    private static final String ROTATE_ANIM_TAG = "RotateAnim";
    private static final String ROTATE_IDENTITY = "0.0";
    private static final String SCALE_ANIM_TAG = "ScaleAnim";
    private static final String SCALE_IDENTITY = "1.0";
    private static final String SEQUENTIAL_ANIM_TAG = "SequentialAnim";
    private static final String TRANSLATE_ANIM_TAG = "TranslateAnim";
    private static final String TRANSLATE_IDENTITY = "0.0";
    private static final String VOLUME_ANIM_TAG = "VolumeAnim";

    NinaAnimFactory()
    {
    }

    static NinaAnim constructNinaAnim(NinaAnimConstants ninaanimconstants, JSONObject jsonobject)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj = null;
        obj1 = null;
        obj2 = jsonobject.names();
        if (((JSONArray) (obj2)).length() <= 0) goto _L2; else goto _L1
_L1:
        obj = ((JSONArray) (obj2)).getString(0);
        obj2 = jsonobject.getJSONObject(((String) (obj)));
        if (!"ParallelAnim".equals(obj)) goto _L4; else goto _L3
_L3:
        jsonobject = new ParallelAnim(getChildAnims(ninaanimconstants, ((JSONObject) (obj2))));
_L6:
        obj = jsonobject;
        if (jsonobject != null)
        {
            jsonobject.setLoopCount(((JSONObject) (obj2)).optInt("loopCount", 1));
            obj = jsonobject;
        }
_L2:
        return ((NinaAnim) (obj));
_L4:
        if ("SequentialAnim".equals(obj))
        {
            jsonobject = new SequentialAnim(getChildAnims(ninaanimconstants, ((JSONObject) (obj2))));
        } else
        if ("NullAnim".equals(obj))
        {
            jsonobject = new NullAnim(ninaanimconstants.resolveTime(((JSONObject) (obj2)).getInt("time")));
        } else
        if ("ColorAnim".equals(obj))
        {
            jsonobject = new ColorAnim(ninaanimconstants.resolveTime(((JSONObject) (obj2)).getInt("time")), ninaanimconstants.resolveColor(((JSONObject) (obj2)).optString("start", "#ffffffff")), ninaanimconstants.resolveColor(((JSONObject) (obj2)).optString("end", "#ffffffff")));
        } else
        if ("VolumeAnim".equals(obj))
        {
            jsonobject = new VolumeAnim(ninaanimconstants.resolveColor(((JSONObject) (obj2)).optString("dark", "#ffffffff")), ninaanimconstants.resolveColor(((JSONObject) (obj2)).optString("light", "#ffffffff")));
        } else
        if ("RotateAnim".equals(obj))
        {
            jsonobject = new RotateAnim(ninaanimconstants.resolveTime(((JSONObject) (obj2)).getInt("time")), ninaanimconstants.resolveFloat(((JSONObject) (obj2)).optString("start", "0.0")), ninaanimconstants.resolveFloat(((JSONObject) (obj2)).optString("end", "0.0")));
        } else
        if ("ScaleAnim".equals(obj))
        {
            int i = ninaanimconstants.resolveTime(((JSONObject) (obj2)).getInt("time"));
            if (((JSONObject) (obj2)).has("start"))
            {
                float f = ninaanimconstants.resolveFloat(((JSONObject) (obj2)).optString("start", "1.0"));
                float f2 = ninaanimconstants.resolveFloat(((JSONObject) (obj2)).optString("end", "1.0"));
                jsonobject = new ScaleAnim(i, f, f2, f, f2);
            } else
            {
                jsonobject = new ScaleAnim(i, ninaanimconstants.resolveFloat(((JSONObject) (obj2)).optString("startX", "1.0")), ninaanimconstants.resolveFloat(((JSONObject) (obj2)).optString("endX", "1.0")), ninaanimconstants.resolveFloat(((JSONObject) (obj2)).optString("startY", "1.0")), ninaanimconstants.resolveFloat(((JSONObject) (obj2)).optString("endY", "1.0")));
            }
        } else
        {
            jsonobject = obj1;
            if ("TranslateAnim".equals(obj))
            {
                int j = ninaanimconstants.resolveTime(((JSONObject) (obj2)).getInt("time"));
                if (((JSONObject) (obj2)).has("start"))
                {
                    float f1 = ninaanimconstants.resolveFloat(((JSONObject) (obj2)).optString("start", "0.0"), true);
                    float f3 = ninaanimconstants.resolveFloat(((JSONObject) (obj2)).optString("end", "0.0"), true);
                    jsonobject = new TranslateAnim(j, f1, f3, f1, f3);
                } else
                {
                    jsonobject = new TranslateAnim(j, ninaanimconstants.resolveFloat(((JSONObject) (obj2)).optString("startX", "0.0"), true), ninaanimconstants.resolveFloat(((JSONObject) (obj2)).optString("endX", "0.0"), true), ninaanimconstants.resolveFloat(((JSONObject) (obj2)).optString("startY", "0.0"), true), ninaanimconstants.resolveFloat(((JSONObject) (obj2)).optString("endY", "0.0"), true));
                }
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static NinaAnim[] getChildAnims(NinaAnimConstants ninaanimconstants, JSONObject jsonobject)
    {
        jsonobject = jsonobject.getJSONArray("children");
        int j = jsonobject.length();
        NinaAnim aninaanim[] = new NinaAnim[j];
        for (int i = 0; i < j; i++)
        {
            aninaanim[i] = constructNinaAnim(ninaanimconstants, jsonobject.getJSONObject(i));
        }

        return aninaanim;
    }
}
