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
//            WholeToppingView

public final class WholeToppingView_ extends WholeToppingView
    implements a, b
{

    private boolean alreadyInflated_;
    private final c onViewChangedNotifier_ = new c();

    public WholeToppingView_(Context context)
    {
        super(context);
        alreadyInflated_ = false;
        init_();
    }

    public static WholeToppingView build(Context context)
    {
        context = new WholeToppingView_(context);
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
            inflate(getContext(), 0x7f0300df, this);
            onViewChangedNotifier_.a(this);
        }
        super.onFinishInflate();
    }

    public final void onViewChanged(a a1)
    {
        tapTip = (TextView)a1.findViewById(0x7f0f036c);
        quantityLabel = (TextView)a1.findViewById(0x7f0f0375);
        label = (TextView)a1.findViewById(0x7f0f036b);
        incrementButton = (ImageButton)a1.findViewById(0x7f0f0376);
        quantityControlLayout = (LinearLayout)a1.findViewById(0x7f0f0373);
        decrementButton = (ImageButton)a1.findViewById(0x7f0f0374);
        detailLayout = (RelativeLayout)a1.findViewById(0x7f0f0369);
        sectionViewLabel = (TextView)a1.findViewById(0x7f0f0170);
        controlLayout = (RelativeLayout)a1.findViewById(0x7f0f036e);
        labelLayout = (RelativeLayout)a1.findViewById(0x7f0f036a);
        setupFonts();
    }
}
