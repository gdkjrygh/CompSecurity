// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.inject;

import android.content.Context;
import android.content.res.AssetManager;
import com.google.inject.Provider;

public class AssetManagerProvider
    implements Provider
{

    protected Context context;

    public AssetManagerProvider()
    {
    }

    public AssetManager get()
    {
        return context.getAssets();
    }

    public volatile Object get()
    {
        return get();
    }
}
