// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal;


public interface XWalkJavascriptResultInternal
{

    public abstract void cancel();

    public abstract void confirm();

    public abstract void confirmWithResult(String s);
}
