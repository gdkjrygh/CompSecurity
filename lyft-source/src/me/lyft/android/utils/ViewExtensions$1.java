// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.utils;

import android.view.View;
import me.lyft.android.common.Unit;
import rx.subjects.BehaviorSubject;

// Referenced classes of package me.lyft.android.utils:
//            ViewExtensions, ViewObserverExtensions

final class val.behaviorSubject
    implements android.view.OnGlobalLayoutListener
{

    final BehaviorSubject val$behaviorSubject;
    final View val$view;

    public void onGlobalLayout()
    {
        ViewObserverExtensions.removeOnGlobalLayoutListener(val$view.getViewTreeObserver(), this);
        val$behaviorSubject.onNext(Unit.create());
        val$behaviorSubject.onCompleted();
    }

    sions()
    {
        val$view = view1;
        val$behaviorSubject = behaviorsubject;
        super();
    }
}
