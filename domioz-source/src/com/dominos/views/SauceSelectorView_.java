// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.utils.ResUtils_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            SauceSelectorView, ProductSpinner

public final class SauceSelectorView_ extends SauceSelectorView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_ = new c();

    public SauceSelectorView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        init_();
    }

    public static SauceSelectorView build(Context context)
    {
        context = new SauceSelectorView_(context);
        context.onFinishInflate();
        return context;
    }

    private void init_()
    {
        c c1 = c.a(onViewChangedNotifier_);
        c.a(this);
        resUtils = ResUtils_.getInstance_(getContext());
        c.a(c1);
    }

    public final void onFinishInflate()
    {
        if (!alreadyInflated_)
        {
            alreadyInflated_ = true;
            inflate(getContext(), 0x7f0300dc, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        decrementButton = (ImageButton)a1.findViewById(0x7f0f0374);
        controlLayout = (RelativeLayout)a1.findViewById(0x7f0f036e);
        detailLayout = (RelativeLayout)a1.findViewById(0x7f0f0369);
        label = (TextView)a1.findViewById(0x7f0f036b);
        labelLayout = (RelativeLayout)a1.findViewById(0x7f0f036a);
        quantityLabel = (TextView)a1.findViewById(0x7f0f049a);
        incrementButton = (ImageButton)a1.findViewById(0x7f0f0376);
        quantityControlLayout = (LinearLayout)a1.findViewById(0x7f0f0373);
        partRadioGroup = (RadioGroup)a1.findViewById(0x7f0f036f);
        tapTip = (TextView)a1.findViewById(0x7f0f036c);
        sauceSpinner = (ProductSpinner)a1.findViewById(0x7f0f036d);
        sectionViewLabel = (TextView)a1.findViewById(0x7f0f0499);
        setupFonts();
    }
}
