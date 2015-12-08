// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import dagger.internal.Factory;

// Referenced classes of package com.skype.android.util:
//            HttpUtilImpl

public final class HttpUtilImpl_Factory extends Enum
    implements Factory
{

    private static final HttpUtilImpl_Factory $VALUES[];
    public static final HttpUtilImpl_Factory INSTANCE;

    private HttpUtilImpl_Factory(String s, int i)
    {
        super(s, i);
    }

    public static Factory create()
    {
        return INSTANCE;
    }

    public static HttpUtilImpl_Factory valueOf(String s)
    {
        return (HttpUtilImpl_Factory)Enum.valueOf(com/skype/android/util/HttpUtilImpl_Factory, s);
    }

    public static HttpUtilImpl_Factory[] values()
    {
        return (HttpUtilImpl_Factory[])$VALUES.clone();
    }

    public final HttpUtilImpl get()
    {
        return new HttpUtilImpl();
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        INSTANCE = new HttpUtilImpl_Factory("INSTANCE", 0);
        $VALUES = (new HttpUtilImpl_Factory[] {
            INSTANCE
        });
    }
}
