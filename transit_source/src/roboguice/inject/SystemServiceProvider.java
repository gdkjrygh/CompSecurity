// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.inject;

import android.app.Application;
import com.google.inject.Provider;

public class SystemServiceProvider
    implements Provider
{

    protected Application application;
    protected String serviceName;

    public SystemServiceProvider(String s)
    {
        serviceName = s;
    }

    public Object get()
    {
        return application.getSystemService(serviceName);
    }
}
