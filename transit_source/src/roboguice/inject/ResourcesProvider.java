// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.inject;

import android.app.Application;
import android.content.res.Resources;
import com.google.inject.Provider;

public class ResourcesProvider
    implements Provider
{

    protected Resources resources;

    public ResourcesProvider(Application application)
    {
        resources = application.getResources();
    }

    public Resources get()
    {
        return resources;
    }

    public volatile Object get()
    {
        return get();
    }
}
