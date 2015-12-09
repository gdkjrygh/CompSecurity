// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.view.View;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            CreateProfileView

public final class CreateProfileView_ extends CreateProfileView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_ = new c();

    public CreateProfileView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        init_();
    }

    public static CreateProfileView build(Context context)
    {
        context = new CreateProfileView_(context);
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
            inflate(getContext(), 0x7f0300c8, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        a1 = a1.findViewById(0x7f0f043a);
        if (a1 != null)
        {
            a1.setOnClickListener(new _cls1());
        }
        onAfterViews();
    }

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final CreateProfileView_ this$0;

        public void onClick(View view)
        {
            onCreateProfileCheckBoxClicked(view);
        }

        _cls1()
        {
            this$0 = CreateProfileView_.this;
            super();
        }
    }

}
