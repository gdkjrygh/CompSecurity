// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.Button;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            AddToOrderFooterView

public final class AddToOrderFooterView_ extends AddToOrderFooterView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_ = new c();

    public AddToOrderFooterView_(Context context, AddToOrderFooterView.OnButtonClickListener onbuttonclicklistener, boolean flag)
    {
        super(context, onbuttonclicklistener, flag);
        alreadyInflated_ = false;
        init_();
    }

    public static AddToOrderFooterView build(Context context, AddToOrderFooterView.OnButtonClickListener onbuttonclicklistener, boolean flag)
    {
        context = new AddToOrderFooterView_(context, onbuttonclicklistener, flag);
        context.onFinishInflate();
        return context;
    }

    private void init_()
    {
        c c1 = c.a(onViewChangedNotifier_);
        c.a(this);
        c.a(c1);
    }

    public final void onFinishInflate()
    {
        if (!alreadyInflated_)
        {
            alreadyInflated_ = true;
            inflate(getContext(), 0x7f03002b, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        mSaveButton = (Button)a1.findViewById(0x7f0f0119);
        if (mSaveButton != null)
        {
            mSaveButton.setOnClickListener(new _cls1());
        }
        init();
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final AddToOrderFooterView_ this$0;

        public void onClick(View view)
        {
            onAddToOrderButtonClick();
        }

        _cls1()
        {
            this$0 = AddToOrderFooterView_.this;
            super();
        }
    }

}
