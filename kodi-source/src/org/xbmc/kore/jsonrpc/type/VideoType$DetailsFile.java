// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.jsonrpc.type;

import com.fasterxml.jackson.databind.JsonNode;
import java.util.List;
import org.xbmc.kore.utils.JsonUtils;

// Referenced classes of package org.xbmc.kore.jsonrpc.type:
//            VideoType

public static class streamdetails extends streamdetails
{

    public final List director;
    public final streamdetails resume;
    public final int runtime;
    public final streamdetails streamdetails;

    public (JsonNode jsonnode)
    {
        Object obj1 = null;
        super(jsonnode);
        director = JsonUtils.stringListFromJsonNode(jsonnode, "director");
        Object obj;
        if (jsonnode.has("resume"))
        {
            obj = new >(jsonnode.get("resume"));
        } else
        {
            obj = null;
        }
        resume = ((resume) (obj));
        runtime = JsonUtils.intFromJsonNode(jsonnode, "runtime", 0);
        obj = obj1;
        if (jsonnode.has("streamdetails"))
        {
            obj = new t>(jsonnode.get("streamdetails"));
        }
        streamdetails = ((streamdetails) (obj));
    }
}
