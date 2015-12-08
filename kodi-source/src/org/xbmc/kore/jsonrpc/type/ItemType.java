// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;

public class ItemType
{
    public static class DetailsBase
    {

        public final String label;

        public DetailsBase(JsonNode jsonnode)
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

    public static class Source extends DetailsBase
    {

        public final String file;

        public Source(JsonNode jsonnode)
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

}
