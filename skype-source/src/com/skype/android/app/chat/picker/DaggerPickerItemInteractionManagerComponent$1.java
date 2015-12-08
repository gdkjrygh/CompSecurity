// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import com.skype.android.SkypeApplicationComponent;
import com.skype.android.mediacontent.MediaContentRoster;
import dagger.internal.Factory;

// Referenced classes of package com.skype.android.app.chat.picker:
//            DaggerPickerItemInteractionManagerComponent

final class val.builder
    implements Factory
{

    private final SkypeApplicationComponent skypeApplicationComponent;
    final DaggerPickerItemInteractionManagerComponent this$0;
    final ilder val$builder;

    public final MediaContentRoster get()
    {
        MediaContentRoster mediacontentroster = skypeApplicationComponent.mediaContentRoster();
        if (mediacontentroster == null)
        {
            throw new NullPointerException("Cannot return null from a non-@Nullable component method");
        } else
        {
            return mediacontentroster;
        }
    }

    public final volatile Object get()
    {
        return get();
    }

    ilder()
    {
        this$0 = final_daggerpickeriteminteractionmanagercomponent;
        val$builder = ilder.this;
        super();
        skypeApplicationComponent = ilder.access._mth100(val$builder);
    }
}
