// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.common.persistence.json;

import android.os.Bundle;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.spotify.mobile.android.util.Assertion;
import eqa;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class  extends JsonSerializer
{

    public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        obj = (Bundle)obj;
        HashMap hashmap = new HashMap();
        for (Iterator iterator = ((Bundle) (obj)).keySet().iterator(); iterator.hasNext();)
        {
            String s = (String)iterator.next();
            Object obj1 = ((Bundle) (obj)).get(s);
            if (obj1 != null && !(obj1 instanceof Serializable))
            {
                Assertion.a((new StringBuilder("value for key '")).append(s).append("' is not Serializable").toString());
            } else
            {
                hashmap.put(s, eqa.a((Serializable)obj1));
            }
        }

        serializerprovider.defaultSerializeValue(hashmap, jsongenerator);
    }

    ()
    {
    }
}
