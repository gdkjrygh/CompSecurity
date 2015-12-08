// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.android.skylib.ObjectIdMap;
import dagger.internal.Factory;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.chat:
//            AnnotationUtil

public final class AnnotationUtil_Factory
    implements Factory
{

    static final boolean $assertionsDisabled;
    private final Provider objMapProvider;

    public AnnotationUtil_Factory(Provider provider)
    {
        if (!$assertionsDisabled && provider == null)
        {
            throw new AssertionError();
        } else
        {
            objMapProvider = provider;
            return;
        }
    }

    public static Factory create(Provider provider)
    {
        return new AnnotationUtil_Factory(provider);
    }

    public final AnnotationUtil get()
    {
        return new AnnotationUtil((ObjectIdMap)objMapProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    static 
    {
        boolean flag;
        if (!com/skype/android/app/chat/AnnotationUtil_Factory.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
