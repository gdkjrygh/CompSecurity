// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;


// Referenced classes of package com.google.inject.internal.util:
//            $MapMaker, $NullOutputException

private static class message
    implements message
{

    final String message;

    public message copyFor(message message1)
    {
        return this;
    }

    public Object get()
    {
        return null;
    }

    public Object waitForValue()
    {
        throw new $NullOutputException(message);
    }

    (String s)
    {
        message = s;
    }
}
