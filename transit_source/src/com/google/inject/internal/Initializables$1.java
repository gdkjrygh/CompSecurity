// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;


// Referenced classes of package com.google.inject.internal:
//            Initializable, Initializables, ErrorsException, Errors

static final class val.instance
    implements Initializable
{

    final Object val$instance;

    public Object get(Errors errors)
        throws ErrorsException
    {
        return val$instance;
    }

    public String toString()
    {
        return String.valueOf(val$instance);
    }

    (Object obj)
    {
        val$instance = obj;
        super();
    }
}
