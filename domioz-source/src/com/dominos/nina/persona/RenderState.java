// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.nina.persona;


class RenderState
{

    int color;
    float rotation;
    float scaleX;
    float scaleY;
    float translateX;
    float translateY;

    RenderState()
    {
        identity();
    }

    void identity()
    {
        color = -1;
        rotation = 0.0F;
        scaleX = 1.0F;
        scaleY = 1.0F;
        translateX = 0.0F;
        translateY = 0.0F;
    }
}
