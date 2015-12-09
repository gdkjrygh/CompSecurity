// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.common.persistence.json;

import android.os.Bundle;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import eqa;
import java.io.Serializable;
import java.util.Iterator;

public class  extends JsonDeserializer
{

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        deserializationcontext = new Bundle();
        Iterator iterator = ((JsonNode)jsonparser.readValueAsTree()).fields();
        ObjectCodec objectcodec = jsonparser.getCodec();
        while (iterator.hasNext()) 
        {
            java.util.Context context = (java.util.)iterator.next();
            if (!((JsonNode)context.()).has("type"))
            {
                jsonparser = (Serializable)objectcodec.treeToValue(((JsonNode)context.alue()).get("value"), java/lang/Object);
            } else
            {
                jsonparser = ((eqa)objectcodec.treeToValue((TreeNode)context.alue(), eqa)).a;
            }
            deserializationcontext.putSerializable((String)context.alue(), jsonparser);
        }
        return deserializationcontext;
    }

    ()
    {
    }
}
