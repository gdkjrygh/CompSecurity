// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.inject;

import android.content.Context;
import com.google.inject.Provider;

public class ContextScopedSystemServiceProvider
    implements Provider
{

    protected Provider contextProvider;
    protected String serviceName;

    public ContextScopedSystemServiceProvider(Provider provider, String s)
    {
        contextProvider = provider;
        serviceName = s;
    }

    public Object get()
    {
        return ((Context)contextProvider.get()).getSystemService(serviceName);
    }
}
