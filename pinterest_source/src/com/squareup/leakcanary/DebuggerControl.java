// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.leakcanary;


public interface DebuggerControl
{

    public static final DebuggerControl NONE = new _cls1();

    public abstract boolean isDebuggerAttached();


    private class _cls1
        implements DebuggerControl
    {

        public final boolean isDebuggerAttached()
        {
            return false;
        }

        _cls1()
        {
        }
    }

}
