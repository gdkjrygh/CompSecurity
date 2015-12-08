// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.dominos.MobileSession_;
import com.dominos.utils.ResUtils_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            LabsProductLineView

public final class LabsProductLineView_ extends LabsProductLineView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_ = new c();

    public LabsProductLineView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        init_();
    }

    public static LabsProductLineView build(Context context)
    {
        context = new LabsProductLineView_(context);
        context.onFinishInflate();
        return context;
    }

    private void init_()
    {
        c c1 = c.a(onViewChangedNotifier_);
        c.a(this);
        mMobileSession = MobileSession_.getInstance_(getContext());
        resourceUtility = ResUtils_.getInstance_(getContext());
        c.a(c1);
    }

    public final void onFinishInflate()
    {
        if (!alreadyInflated_)
        {
            alreadyInflated_ = true;
            inflate(getContext(), 0x7f0300a0, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        productLineOptionDescriptionText = (TextView)a1.findViewById(0x7f0f0379);
        header = (TextView)a1.findViewById(0x7f0f0170);
        productLineImageView = (ImageView)a1.findViewById(0x7f0f037b);
        productLineDescriptionText = (TextView)a1.findViewById(0x7f0f037e);
        productLineLabelText = (TextView)a1.findViewById(0x7f0f037c);
        productLineQuantityText = (TextView)a1.findViewById(0x7f0f037f);
        productLinePriceText = (TextView)a1.findViewById(0x7f0f037d);
        setupFonts();
    }
}
