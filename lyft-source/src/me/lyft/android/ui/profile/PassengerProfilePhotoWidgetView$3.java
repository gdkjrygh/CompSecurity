// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.view.View;
import android.view.ViewTreeObserver;
import me.lyft.android.common.Unit;
import me.lyft.android.utils.VersionUtils;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.ui.profile:
//            PassengerProfilePhotoWidgetView

final class val.view
    implements rx.rofilePhotoWidgetView._cls3
{

    final View val$view;

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(final Subscriber subscriber)
    {
        if (val$view.getViewTreeObserver().isAlive())
        {
            val$view.getViewTreeObserver().addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                final PassengerProfilePhotoWidgetView._cls3 this$0;
                final Subscriber val$subscriber;

                public void onGlobalLayout()
                {
                    if (view.getViewTreeObserver().isAlive())
                    {
                        if (VersionUtils.hasJellyBean())
                        {
                            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        } else
                        {
                            view.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        }
                    }
                    subscriber.onNext(Unit.create());
                    subscriber.onCompleted();
                }

            
            {
                this$0 = PassengerProfilePhotoWidgetView._cls3.this;
                subscriber = subscriber1;
                super();
            }
            });
        }
    }

    _cls1.val.subscriber()
    {
        val$view = view1;
        super();
    }
}
