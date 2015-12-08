// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.log4j.spi;

import org.apache.log4j.or.ObjectRenderer;

public interface RendererSupport
{

    public abstract void setRenderer(Class class1, ObjectRenderer objectrenderer);
}
