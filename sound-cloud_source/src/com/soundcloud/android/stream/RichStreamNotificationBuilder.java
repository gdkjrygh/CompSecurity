// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import android.content.Context;
import android.content.res.Resources;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.PropertySet;
import java.util.List;
import javax.inject.Provider;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.stream:
//            StreamNotificationBuilder

public class RichStreamNotificationBuilder extends StreamNotificationBuilder
{

    private final f buildNotification = new _cls1();
    private final ImageOperations imageOperations;

    public RichStreamNotificationBuilder(Context context, ImageOperations imageoperations, Provider provider)
    {
        super(context, provider);
        imageOperations = imageoperations;
    }

    private f returnBuilderFunc(final android.support.v4.app.NotificationCompat.Builder builder)
    {
        return new _cls2();
    }

    private f setLargeIcon(final android.support.v4.app.NotificationCompat.Builder builder)
    {
        return new _cls3();
    }

    protected b builderWithArtwork(android.support.v4.app.NotificationCompat.Builder builder, Urn urn)
    {
        Object obj = appContext.getResources();
        int i = ((Resources) (obj)).getDimensionPixelSize(0x7f0b00cf);
        int j = ((Resources) (obj)).getDimensionPixelSize(0x7f0b00ce);
        obj = ApiImageSize.getNotificationLargeIconImageSize(((Resources) (obj)));
        return imageOperations.artwork(urn, ((ApiImageSize) (obj)), i, j).map(setLargeIcon(builder)).onErrorResumeNext(returnBuilderFunc(builder));
    }

    public b notification(List list)
    {
        return builderWithArtwork(getBuilder(list), (Urn)((PropertySet)list.get(0)).get(PlayableProperty.URN)).map(buildNotification);
    }

    private class _cls1
        implements f
    {

        final RichStreamNotificationBuilder this$0;

        public Notification call(android.support.v4.app.NotificationCompat.Builder builder)
        {
            return builder.build();
        }

        public volatile Object call(Object obj)
        {
            return call((android.support.v4.app.NotificationCompat.Builder)obj);
        }

        _cls1()
        {
            this$0 = RichStreamNotificationBuilder.this;
            super();
        }
    }


    private class _cls2
        implements f
    {

        final RichStreamNotificationBuilder this$0;
        final android.support.v4.app.NotificationCompat.Builder val$builder;

        public volatile Object call(Object obj)
        {
            return call((Throwable)obj);
        }

        public b call(Throwable throwable)
        {
            return b.just(builder);
        }

        _cls2()
        {
            this$0 = RichStreamNotificationBuilder.this;
            builder = builder1;
            super();
        }
    }


    private class _cls3
        implements f
    {

        final RichStreamNotificationBuilder this$0;
        final android.support.v4.app.NotificationCompat.Builder val$builder;

        public android.support.v4.app.NotificationCompat.Builder call(Bitmap bitmap)
        {
            return builder.setLargeIcon(bitmap);
        }

        public volatile Object call(Object obj)
        {
            return call((Bitmap)obj);
        }

        _cls3()
        {
            this$0 = RichStreamNotificationBuilder.this;
            builder = builder1;
            super();
        }
    }

}
