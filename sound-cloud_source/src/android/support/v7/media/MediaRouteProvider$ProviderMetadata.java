// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.ComponentName;

// Referenced classes of package android.support.v7.media:
//            MediaRouteProvider

public static final class mComponentName
{

    private final ComponentName mComponentName;

    public final ComponentName getComponentName()
    {
        return mComponentName;
    }

    public final String getPackageName()
    {
        return mComponentName.getPackageName();
    }

    public final String toString()
    {
        return (new StringBuilder("ProviderMetadata{ componentName=")).append(mComponentName.flattenToShortString()).append(" }").toString();
    }

    (ComponentName componentname)
    {
        if (componentname == null)
        {
            throw new IllegalArgumentException("componentName must not be null");
        } else
        {
            mComponentName = componentname;
            return;
        }
    }
}
