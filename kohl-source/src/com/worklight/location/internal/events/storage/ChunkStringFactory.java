// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.events.storage;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.worklight.location.internal.events.storage:
//            Chunk

public class ChunkStringFactory
{

    public ChunkStringFactory()
    {
    }

    public Chunk createChunk(String s)
        throws JSONException
    {
        return new Chunk(new JSONArray(s), -1L);
    }

    public String createString(Chunk chunk)
    {
        JSONArray jsonarray = new JSONArray();
        for (chunk = chunk.getStrings().iterator(); chunk.hasNext(); jsonarray.put((String)chunk.next())) { }
        return jsonarray.toString();
    }
}
