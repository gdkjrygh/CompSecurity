// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.app.chat.picker:
//            MRUManager

private static final class array
{

    JSONArray array;
    com.skype..DOCUMENT_TYPE type;

    public final JSONObject toJson()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("mediaType", type);
            jsonobject.put("mediaList", array);
        }
        catch (JSONException jsonexception)
        {
            MRUManager.access$000().severe((new StringBuilder("error generating json for ")).append(toString()).append(": ").append(jsonexception.getMessage()).toString());
            return jsonobject;
        }
        return jsonobject;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("[MRUlist: \"");
        stringbuilder.append(type.toString());
        stringbuilder.append("\", ");
        stringbuilder.append(array.toString());
        stringbuilder.append("]");
        return stringbuilder.toString();
    }

    public (com.skype..DOCUMENT_TYPE document_type, List list)
    {
        array = new JSONArray();
        type = document_type;
        for (document_type = list.iterator(); document_type.hasNext(); array.put(list))
        {
            list = (String)document_type.next();
        }

    }

    public array(JSONObject jsonobject)
        throws JSONException
    {
        array = new JSONArray();
        type = com.skype..DOCUMENT_TYPE.valueOf(jsonobject.getString("mediaType"));
        array = jsonobject.getJSONArray("mediaList");
    }
}
