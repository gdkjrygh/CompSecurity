// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;


abstract class RenderResource
{

    public int handle;

    RenderResource()
    {
        handle = 0;
    }

    abstract void Activate();

    abstract void Bind();

    abstract void Deactivate();

    abstract void Unbind();
}
