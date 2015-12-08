// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import me.lyft.android.common.Unit;
import rx.Observable;
import rx.subjects.PublishSubject;

public class AnimationReadyImageView extends ImageView
{

    private PublishSubject sizeChanged;

    public AnimationReadyImageView(Context context)
    {
        super(context);
        sizeChanged = PublishSubject.create();
    }

    public AnimationReadyImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        sizeChanged = PublishSubject.create();
    }

    public AnimationReadyImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        sizeChanged = PublishSubject.create();
    }

    protected void onSizeChanged(int i, int j, int k, int l)
    {
        super.onSizeChanged(i, j, k, l);
        sizeChanged.onNext(Unit.create());
    }

    public Observable subscribeOnSizeChanged()
    {
        return sizeChanged.asObservable();
    }
}
