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
//            ReadOnlyToppingView, ProductSpinner

public final class ReadOnlyToppingView_ extends ReadOnlyToppingView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_ = new c();

    public ReadOnlyToppingView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        init_();
    }

    public static ReadOnlyToppingView build(Context context)
    {
        context = new ReadOnlyToppingView_(context);
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
            inflate(getContext(), 0x7f0300db, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        quantityLabel = (TextView)a1.findViewById(0x7f0f0375);
        quantityControlLayout = (LinearLayout)a1.findViewById(0x7f0f0373);
        sauceSpinner = (ProductSpinner)a1.findViewById(0x7f0f036d);
        labelLayout = (RelativeLayout)a1.findViewById(0x7f0f036a);
        controlLayout = (RelativeLayout)a1.findViewById(0x7f0f036e);
        detailLayout = (RelativeLayout)a1.findViewById(0x7f0f0369);
        sectionViewLabel = (TextView)a1.findViewById(0x7f0f0170);
        incrementButton = (ImageButton)a1.findViewById(0x7f0f0376);
        partRadioGroup = (RadioGroup)a1.findViewById(0x7f0f036f);
        label = (TextView)a1.findViewById(0x7f0f036b);
        decrementButton = (ImageButton)a1.findViewById(0x7f0f0374);
        tapTip = (TextView)a1.findViewById(0x7f0f036c);
        setupFonts();
    }
}
