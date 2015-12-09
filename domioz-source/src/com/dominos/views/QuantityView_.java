// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.utils.ResUtils_;
import org.androidannotations.api.d.a;
import org.androidannotations.api.d.b;
import org.androidannotations.api.d.c;

// Referenced classes of package com.dominos.views:
//            QuantityView

public final class QuantityView_ extends QuantityView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_ = new c();

    public QuantityView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        init_();
    }

    public static QuantityView build(Context context)
    {
        context = new QuantityView_(context);
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
            inflate(getContext(), 0x7f0300c4, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        quantityLabel = (TextView)a1.findViewById(0x7f0f0432);
        decrementButton = (ImageButton)a1.findViewById(0x7f0f0431);
        quantityControlLayout = (LinearLayout)a1.findViewById(0x7f0f0430);
        sectionViewLabel = (TextView)a1.findViewById(0x7f0f042d);
        controlLayout = (RelativeLayout)a1.findViewById(0x7f0f036e);
        quantityLayout = (RelativeLayout)a1.findViewById(0x7f0f042e);
        incrementButton = (ImageButton)a1.findViewById(0x7f0f0433);
        label = (TextView)a1.findViewById(0x7f0f042f);
        setupFonts();
    }
}
