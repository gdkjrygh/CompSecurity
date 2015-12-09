// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.utils.ResUtils_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            SplitToppingView, ProductSpinner

public final class SplitToppingView_ extends SplitToppingView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_ = new c();

    public SplitToppingView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        init_();
    }

    public static SplitToppingView build(Context context)
    {
        context = new SplitToppingView_(context);
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
            inflate(getContext(), 0x7f0300de, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        wholePart = (RadioButton)a1.findViewById(0x7f0f0371);
        tapTip = (TextView)a1.findViewById(0x7f0f036c);
        rightPart = (RadioButton)a1.findViewById(0x7f0f0372);
        labelLayout = (RelativeLayout)a1.findViewById(0x7f0f036a);
        quantityControlLayout = (LinearLayout)a1.findViewById(0x7f0f0373);
        partRadioGroup = (RadioGroup)a1.findViewById(0x7f0f036f);
        controlLayout = (RelativeLayout)a1.findViewById(0x7f0f036e);
        sauceSpinner = (ProductSpinner)a1.findViewById(0x7f0f036d);
        leftPart = (RadioButton)a1.findViewById(0x7f0f0370);
        decrementButton = (ImageButton)a1.findViewById(0x7f0f0374);
        quantityLabel = (TextView)a1.findViewById(0x7f0f0375);
        sectionViewLabel = (TextView)a1.findViewById(0x7f0f0170);
        incrementButton = (ImageButton)a1.findViewById(0x7f0f0376);
        detailLayout = (LinearLayout)a1.findViewById(0x7f0f0369);
        label = (TextView)a1.findViewById(0x7f0f036b);
        setupFonts();
    }
}
