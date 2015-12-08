// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            ItemType

public static class file extends Base
{

    public final String file;

    public Base(JsonNode jsonnode)
    {
        super(jsonnode);
        jsonnode = jsonnode.get("file");
        if (jsonnode != null)
        {
            file = jsonnode.asText();
            return;
        } else
        {
            file = null;
            return;
        }
    }
}
