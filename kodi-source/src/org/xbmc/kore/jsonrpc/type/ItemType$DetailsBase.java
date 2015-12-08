// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            ItemType

public static class label
{

    public final String label;

    public (JsonNode jsonnode)
    {
        jsonnode = jsonnode.get("label");
        if (jsonnode != null)
        {
            label = jsonnode.asText();
            return;
        } else
        {
            label = null;
            return;
        }
    }
}
