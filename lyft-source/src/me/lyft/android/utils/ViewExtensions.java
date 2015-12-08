// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import android.view.View;
import android.view.ViewTreeObserver;
import me.lyft.android.common.Unit;
import rx.Observable;
import rx.subjects.BehaviorSubject;

// Referenced classes of package me.lyft.android.utils:
//            ViewObserverExtensions

public class ViewExtensions
{

    public ViewExtensions()
    {
    }

    public static Observable onLoadedObservable(final View view)
    {
        final BehaviorSubject behaviorSubject = BehaviorSubject.create();
        ViewTreeObserver viewtreeobserver = view.getViewTreeObserver();
        if (view.getWidth() != 0 && view.getHeight() != 0)
        {
            behaviorSubject.onNext(Unit.create());
        }
        if (viewtreeobserver.isAlive())
        {
            viewtreeobserver.addOnGlobalLayoutListener(new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

                final BehaviorSubject val$behaviorSubject;
                final View val$view;

                public void onGlobalLayout()
                {
                    ViewObserverExtensions.removeOnGlobalLayoutListener(view.getViewTreeObserver(), this);
                    behaviorSubject.onNext(Unit.create());
                    behaviorSubject.onCompleted();
                }

            
            {
                view = view1;
                behaviorSubject = behaviorsubject;
                super();
            }
            });
        }
        return behaviorSubject.asObservable();
    }

    public static transient void setVisibility(int i, View aview[])
    {
        if (aview != null)
        {
            int k = aview.length;
            int j = 0;
            while (j < k) 
            {
                aview[j].setVisibility(i);
                j++;
            }
        }
    }
}
