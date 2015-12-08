// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.events.storage;

import com.worklight.location.internal.nativeImpl.LocationUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Chunk
{

    private final long maxChunkSize;
    private int size;
    private final List strings;

    public Chunk(long l)
    {
        strings = new ArrayList();
        if (l < 0L)
        {
            throw new IllegalArgumentException("Chunk size can't be negative");
        } else
        {
            maxChunkSize = l;
            return;
        }
    }

    public Chunk(JSONArray jsonarray, long l)
        throws JSONException
    {
        strings = new ArrayList();
        for (int i = 0; i < jsonarray.length(); i++)
        {
            String s = jsonarray.getString(i);
            strings.add(s);
            size = size + LocationUtils.getByteLength(s);
        }

        if (l < 0L)
        {
            maxChunkSize = size;
            return;
        } else
        {
            maxChunkSize = l;
            return;
        }
    }

    public boolean add(JSONObject jsonobject)
    {
        jsonobject = jsonobject.toString();
        int i = LocationUtils.getByteLength(jsonobject);
        if (size == 0 || (long)(size + i) < maxChunkSize)
        {
            size = size + i;
            strings.add(jsonobject);
            return true;
        } else
        {
            return false;
        }
    }

    public Chunk createNewChunk()
    {
        return new Chunk(maxChunkSize);
    }

    public Chunk createNewChunk(long l)
    {
        return new Chunk(l);
    }

    public long currentChunkSize()
    {
        return (long)size;
    }

    public JSONObject get(int i)
    {
        JSONObject jsonobject;
        try
        {
            jsonobject = new JSONObject((String)strings.get(i));
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            throw new AssertionError(exception.getMessage());
        }
        return jsonobject;
    }

    List getStrings()
    {
        return strings;
    }

    public long maxChunkSize()
    {
        return maxChunkSize;
    }

    public int numberOfEvents()
    {
        return strings.size();
    }
}
