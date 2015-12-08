// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.NotificationManager;
import com.skype.android.SkypeApplicationComponent;
import dagger.internal.Factory;

// Referenced classes of package com.skype.android.app.chat:
//            DaggerMessageViewAdapterComponent

final class val.builder
    implements Factory
{

    private final SkypeApplicationComponent skypeApplicationComponent;
    final DaggerMessageViewAdapterComponent this$0;
    final lder val$builder;

    public final NotificationManager get()
    {
        NotificationManager notificationmanager = skypeApplicationComponent.notificationManager();
        if (notificationmanager == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return notificationmanager;
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    lder()
    {
        this$0 = final_daggermessageviewadaptercomponent;
        val$builder = lder.this;
        super();
        skypeApplicationComponent = lder.access._mth100(val$builder);
    }
}
