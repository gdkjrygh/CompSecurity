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
//            PizzaCheeseView, ProductSpinner

public final class PizzaCheeseView_ extends PizzaCheeseView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_ = new c();

    public PizzaCheeseView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        init_();
    }

    public static PizzaCheeseView build(Context context)
    {
        context = new PizzaCheeseView_(context);
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
            inflate(getContext(), 0x7f0300d9, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        selectedPartRadioGroup = (RadioGroup)a1.findViewById(0x7f0f0490);
        decrementButton = (ImageButton)a1.findViewById(0x7f0f0374);
        tapTip = (TextView)a1.findViewById(0x7f0f036c);
        sectionViewLabel = (TextView)a1.findViewById(0x7f0f0170);
        incrementButton = (ImageButton)a1.findViewById(0x7f0f0376);
        secondCheeseRightPart = (RadioButton)a1.findViewById(0x7f0f0493);
        leftPart = (RadioButton)a1.findViewById(0x7f0f0370);
        partRadioGroup = (RadioGroup)a1.findViewById(0x7f0f036f);
        secondCheeseQuantityLabel = (TextView)a1.findViewById(0x7f0f0496);
        label = (TextView)a1.findViewById(0x7f0f036b);
        secondCheeseDecrementButton = (ImageButton)a1.findViewById(0x7f0f0495);
        labelLayout = (RelativeLayout)a1.findViewById(0x7f0f036a);
        sauceSpinner = (ProductSpinner)a1.findViewById(0x7f0f036d);
        selectedLayout = (RelativeLayout)a1.findViewById(0x7f0f048f);
        secondCheeseLeftPart = (RadioButton)a1.findViewById(0x7f0f0491);
        quantityControlLayout = (LinearLayout)a1.findViewById(0x7f0f0373);
        detailLayout = (RelativeLayout)a1.findViewById(0x7f0f0369);
        secondCheeseWholePart = (RadioButton)a1.findViewById(0x7f0f0492);
        rightPart = (RadioButton)a1.findViewById(0x7f0f0372);
        wholePart = (RadioButton)a1.findViewById(0x7f0f0371);
        controlLayout = (RelativeLayout)a1.findViewById(0x7f0f036e);
        quantityLabel = (TextView)a1.findViewById(0x7f0f0375);
        secondCheeseIncrementButton = (ImageButton)a1.findViewById(0x7f0f0497);
        setupFonts();
    }
}
