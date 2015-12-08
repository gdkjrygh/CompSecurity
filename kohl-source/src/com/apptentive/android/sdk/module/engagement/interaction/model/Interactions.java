// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.module.engagement.interaction.model;

import com.apptentive.android.sdk.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Interactions extends JSONObject
{

    private static final String KEY_INTERACTIONS = "interactions";

    public Interactions(String s)
        throws JSONException
    {
        super(s);
    }

    public List getInteractionList(String s)
    {
        ArrayList arraylist = new ArrayList();
        JSONObject jsonobject = getJSONObject("interactions");
        if (jsonobject.isNull(s))
        {
            break MISSING_BLOCK_LABEL_86;
        }
        s = jsonobject.getJSONArray(s);
        int i = 0;
_L1:
        Interaction interaction;
        if (i >= s.length())
        {
            break MISSING_BLOCK_LABEL_86;
        }
        interaction = Interaction.Factory.parseInteraction(s.getJSONObject(i).toString());
        if (interaction == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        arraylist.add(interaction);
        i++;
          goto _L1
        s;
        Log.w("Exception parsing interactions array.", s, new Object[0]);
        Collections.sort(arraylist);
        return arraylist;
    }
}
