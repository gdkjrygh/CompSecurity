// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service;


// Referenced classes of package com.addlive.service:
//            InvalidateCb

public class RenderRequest
{

    private InvalidateCb invalidateCb;
    private boolean mirror;
    private int rendererId;
    private String sinkId;

    public RenderRequest(String s, boolean flag, InvalidateCb invalidatecb)
    {
        sinkId = "";
        mirror = false;
        invalidateCb = null;
        sinkId = s;
        mirror = flag;
        invalidateCb = invalidatecb;
        rendererId = 0;
    }

    public InvalidateCb getInvalidateCb()
    {
        return invalidateCb;
    }

    public String getSinkId()
    {
        return sinkId;
    }

    public boolean isMirror()
    {
        return mirror;
    }

    public void setMirror(boolean flag)
    {
        mirror = flag;
    }

    public void setRendererId(int i)
    {
        rendererId = i;
    }

    public void setSinkId(String s)
    {
        sinkId = s;
    }

    public String toString()
    {
        return (new StringBuilder("RenderRequest{sinkId=")).append(sinkId).append(", mirror=").append(mirror).append("}").toString();
    }
}
