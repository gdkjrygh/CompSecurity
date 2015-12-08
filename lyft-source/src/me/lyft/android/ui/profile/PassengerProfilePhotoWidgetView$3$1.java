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

class val.subscriber
    implements android.view.ner
{

    final val.subscriber this$0;
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
        val$subscriber.onNext(Unit.create());
        val$subscriber.onCompleted();
    }

    l.view()
    {
        this$0 = final_view;
        val$subscriber = Subscriber.this;
        super();
    }

    // Unreferenced inner class me/lyft/android/ui/profile/PassengerProfilePhotoWidgetView$3

/* anonymous class */
    final class PassengerProfilePhotoWidgetView._cls3
        implements rx.Observable.OnSubscribe
    {

        final View val$view;

        public volatile void call(Object obj)
        {
            call((Subscriber)obj);
        }

        public void call(Subscriber subscriber1)
        {
            if (view.getViewTreeObserver().isAlive())
            {
                view.getViewTreeObserver().addOnGlobalLayoutListener(subscriber1. new PassengerProfilePhotoWidgetView._cls3._cls1());
            }
        }

            
            {
                view = view1;
                super();
            }
    }

}
