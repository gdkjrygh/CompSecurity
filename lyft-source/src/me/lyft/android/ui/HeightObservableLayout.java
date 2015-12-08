// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import rx.Observable;
import rx.subjects.BehaviorSubject;

public class HeightObservableLayout extends LinearLayout
{

    private BehaviorSubject layoutHeightSubject;

    public HeightObservableLayout(Context context)
    {
        super(context);
        layoutHeightSubject = BehaviorSubject.create();
        intialize();
    }

    public HeightObservableLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        layoutHeightSubject = BehaviorSubject.create();
        intialize();
    }

    public HeightObservableLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        layoutHeightSubject = BehaviorSubject.create();
        intialize();
    }

    private void intialize()
    {
        layoutHeightSubject.onNext(Integer.valueOf(getHeight()));
    }

    public Observable observeHeightChange()
    {
        return layoutHeightSubject.asObservable();
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        layoutHeightSubject.onNext(Integer.valueOf(j));
    }
}
