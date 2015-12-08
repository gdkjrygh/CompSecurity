// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.inject;

import android.app.Application;
import com.google.inject.Provider;

public class RoboApplicationProvider
    implements Provider
{

    protected Application application;

    public RoboApplicationProvider()
    {
    }

    public Application get()
    {
        return application;
    }

    public volatile Object get()
    {
        return get();
    }
}
