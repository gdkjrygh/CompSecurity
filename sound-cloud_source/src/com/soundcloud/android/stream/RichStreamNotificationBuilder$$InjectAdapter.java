// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import android.content.Context;
import com.soundcloud.android.image.ImageOperations;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stream:
//            RichStreamNotificationBuilder

public final class  extends b
    implements a, Provider
{

    private b builderProvider;
    private b context;
    private b imageOperations;
    private b supertype;

    public final void attach(l l1)
    {
        context = l1.a("android.content.Context", com/soundcloud/android/stream/RichStreamNotificationBuilder, getClass().getClassLoader());
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/stream/RichStreamNotificationBuilder, getClass().getClassLoader());
        builderProvider = l1.a("javax.inject.Provider<android.support.v4.app.NotificationCompat$Builder>", com/soundcloud/android/stream/RichStreamNotificationBuilder, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.stream.StreamNotificationBuilder", com/soundcloud/android/stream/RichStreamNotificationBuilder, getClass().getClassLoader(), false);
    }

    public final RichStreamNotificationBuilder get()
    {
        RichStreamNotificationBuilder richstreamnotificationbuilder = new RichStreamNotificationBuilder((Context)context.get(), (ImageOperations)imageOperations.get(), (Provider)builderProvider.get());
        injectMembers(richstreamnotificationbuilder);
        return richstreamnotificationbuilder;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(imageOperations);
        set.add(builderProvider);
        set1.add(supertype);
    }

    public final void injectMembers(RichStreamNotificationBuilder richstreamnotificationbuilder)
    {
        supertype.injectMembers(richstreamnotificationbuilder);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((RichStreamNotificationBuilder)obj);
    }

    public ()
    {
        super("com.soundcloud.android.stream.RichStreamNotificationBuilder", "members/com.soundcloud.android.stream.RichStreamNotificationBuilder", false, com/soundcloud/android/stream/RichStreamNotificationBuilder);
    }
}
