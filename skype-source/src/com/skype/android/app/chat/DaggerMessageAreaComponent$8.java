// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import com.skype.android.SkypeApplicationComponent;
import com.skype.android.util.ImageCache;
import dagger.internal.Factory;

// Referenced classes of package com.skype.android.app.chat:
//            DaggerMessageAreaComponent

final class val.builder
    implements Factory
{

    private final SkypeApplicationComponent skypeApplicationComponent;
    final DaggerMessageAreaComponent this$0;
    final ilder val$builder;

    public final ImageCache get()
    {
        ImageCache imagecache = skypeApplicationComponent.imageCache();
        if (imagecache == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return imagecache;
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    ilder()
    {
        this$0 = final_daggermessageareacomponent;
        val$builder = ilder.this;
        super();
        skypeApplicationComponent = ilder.access._mth100(val$builder);
    }
}
