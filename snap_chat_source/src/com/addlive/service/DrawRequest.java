// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service;


public class DrawRequest
{

    private int bottom;
    private int left;
    private int rendererId;
    private int right;
    private long texU;
    private long texV;
    private long texY;
    private int top;

    public DrawRequest(int i, int j, int k, int l, int i1, long l1, 
            long l2, long l3)
    {
        top = i;
        left = j;
        bottom = k;
        right = l;
        rendererId = i1;
        texY = l1;
        texU = l2;
        texV = l3;
    }

    public String toString()
    {
        return (new StringBuilder("DrawRequest{top=")).append(top).append(", left=").append(left).append(", bottom=").append(bottom).append(", right=").append(right).append(", rendererId=").append(rendererId).append(", texY=").append(texY).append(", texU=").append(texU).append(", texV=").append(texV).append("}").toString();
    }
}
