// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear;

import com.skype.android.SkypeApplicationComponent;
import com.skype.android.util.cache.ContactMoodCache;
import dagger.internal.Factory;

// Referenced classes of package com.skype.android.app.wear:
//            DaggerCommandHandlerServiceComponent

final class val.builder
    implements Factory
{

    private final SkypeApplicationComponent skypeApplicationComponent;
    final DaggerCommandHandlerServiceComponent this$0;
    final lder val$builder;

    public final ContactMoodCache get()
    {
        ContactMoodCache contactmoodcache = skypeApplicationComponent.contactMoodCache();
        if (contactmoodcache == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return contactmoodcache;
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    lder()
    {
        this$0 = final_daggercommandhandlerservicecomponent;
        val$builder = lder.this;
        super();
        skypeApplicationComponent = lder.access._mth100(val$builder);
    }
}
