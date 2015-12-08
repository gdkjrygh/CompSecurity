// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core;


public abstract class SharedXWalkExceptionHandler
{

    public SharedXWalkExceptionHandler()
    {
    }

    boolean handleException(Throwable throwable)
    {
        onSharedLibraryNotFound();
        return true;
    }

    public abstract void onSharedLibraryNotFound();
}
