// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.json;


public interface JSONErrorListener
{

    public abstract void end();

    public abstract void error(String s, int i, int j);

    public abstract void start(String s);
}
