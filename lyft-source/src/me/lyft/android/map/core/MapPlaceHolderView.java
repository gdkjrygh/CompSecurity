// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.map.core;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import rx.Observable;
import rx.subjects.PublishSubject;

public class MapPlaceHolderView extends FrameLayout
{

    private final PublishSubject windowVisibilitySubject = PublishSubject.create();

    public MapPlaceHolderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public Observable observeWindowVisibilityChange()
    {
        return windowVisibilitySubject.asObservable().distinctUntilChanged();
    }

    protected void onWindowVisibilityChanged(int i)
    {
        super.onWindowVisibilityChanged(i);
        PublishSubject publishsubject = windowVisibilitySubject;
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        publishsubject.onNext(Boolean.valueOf(flag));
    }
}
