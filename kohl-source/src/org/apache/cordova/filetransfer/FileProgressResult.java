// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.filetransfer;

import org.json.JSONException;
import org.json.JSONObject;

public class FileProgressResult
{

    private boolean lengthComputable;
    private long loaded;
    private long total;

    public FileProgressResult()
    {
        lengthComputable = false;
        loaded = 0L;
        total = 0L;
    }

    public boolean getLengthComputable()
    {
        return lengthComputable;
    }

    public long getLoaded()
    {
        return loaded;
    }

    public long getTotal()
    {
        return total;
    }

    public void setLengthComputable(boolean flag)
    {
        lengthComputable = flag;
    }

    public void setLoaded(long l)
    {
        loaded = l;
    }

    public void setTotal(long l)
    {
        total = l;
    }

    public JSONObject toJSONObject()
        throws JSONException
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("{loaded:").append(loaded).append(",total:").append(total).append(",lengthComputable:");
        String s;
        if (lengthComputable)
        {
            s = "true";
        } else
        {
            s = "false";
        }
        return new JSONObject(stringbuilder.append(s).append("}").toString());
    }
}
