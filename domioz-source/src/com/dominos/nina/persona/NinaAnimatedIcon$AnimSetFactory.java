// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;

import android.content.Context;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.dominos.nina.persona:
//            NinaAnimatedIcon, NinaAnimConstants

class animConstants
{

    private static final String JSON_KEY_CELL_DATA = "cellData";
    private static final String JSON_KEY_CELL_SETS = "cellSets";
    private static final String JSON_KEY_IMAGE_COMPONENTS = "imageComponents";
    private final NinaAnimConstants animConstants;
    private final HashMap componentHash;
    private final Context context;
    private final String imageComponentNames[];
    final NinaAnimatedIcon this$0;

    animConstants createAnimSet(JSONObject jsonobject, String s)
    {
        if (jsonobject == null)
        {
            return null;
        }
        if (jsonobject.has("cellData"))
        {
            jsonobject = jsonobject.getJSONObject("cellData");
            return new it>(context, NinaAnimatedIcon.this, jsonobject, iconWidth, iconHeight, s);
        }
        animConstants animconstants = new <init>(s);
        if (jsonobject.has("cellSets"))
        {
            JSONArray jsonarray = jsonobject.getJSONArray("cellSets");
            for (int i = 0; i < jsonarray.length(); i++)
            {
                animconstants.append(new it>(context, NinaAnimatedIcon.this, jsonarray.getJSONObject(i), iconWidth, iconHeight, s));
            }

        }
        if (jsonobject.has("imageComponents"))
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject("imageComponents");
            animconstants.append(new t(imageComponentNames, componentHash, animConstants, jsonobject1, s));
        }
        if (animconstants.count() > 0)
        {
            return animconstants;
        } else
        {
            return new t(imageComponentNames, componentHash, animConstants, jsonobject, s);
        }
    }

    t(Context context1, String as[], HashMap hashmap, NinaAnimConstants ninaanimconstants)
    {
        this$0 = NinaAnimatedIcon.this;
        super();
        context = context1;
        imageComponentNames = as;
        componentHash = hashmap;
        animConstants = ninaanimconstants;
    }
}
