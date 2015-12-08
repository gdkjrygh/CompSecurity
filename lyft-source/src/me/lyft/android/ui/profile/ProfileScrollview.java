// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.profile;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;
import rx.Observable;
import rx.subjects.PublishSubject;

public class ProfileScrollview extends ScrollView
{

    static final int ANIMATION_OFFSET = 120;
    private final PublishSubject onScrollChangedSubject = PublishSubject.create();

    public ProfileScrollview(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public Observable observeOnScrollUp()
    {
        return onScrollChangedSubject.asObservable();
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        super.onScrollChanged(i, j, k, l);
        PublishSubject publishsubject = onScrollChangedSubject;
        boolean flag;
        if (l > 120)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        publishsubject.onNext(Boolean.valueOf(flag));
    }
}
